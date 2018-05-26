package com.diginsite.bbp.linklist;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.apache.commons.lang3.StringUtils;

public class InfixToPostFix {
    public static List<String> operands = Arrays.asList("*", "+", "-", "%");

    public static void main(String[] args) {
        // (a+b)*((c-d)%(e+f))
        // ab+cd-ef+%*

        Stack<String> stack = new Stack<String>();
        Stack<String> expression = new Stack<String>();

        stack.push("(");
        stack.push("a");
        stack.push("+");
        stack.push("b");
        stack.push(")");
        stack.push("*");
        stack.push("(");
        stack.push("c");
        stack.push("-");
        stack.push("d");
        stack.push(")");
        stack.push("%");
        stack.push("(");
        stack.push("e");
        stack.push("+");
        stack.push("f");
        stack.push(")");

        String input = null;
        String output = null;
        String result = null;
        int midOperandCnt = 0;
        boolean pairStart = false;
        boolean pairEnd = false;
        int rightParenthesisCnt = 0;

        String tempOperator = StringUtils.EMPTY;
        while (!stack.isEmpty()) {
            String value = stack.pop();
            input = StringUtils.isBlank(input) ? (input = value) : (input = value + input);
            if (value.equals(")")) {
                if (StringUtils.isNoneBlank(output)) {
                    if (value.equals(")")) {
                        pairStart = true;
                        continue;
                    }
                } else {
                    rightParenthesisCnt++;
                    continue;
                }
            }

            if (value.equals("(")) {
                pairEnd = true;
            }

            if (rightParenthesisCnt > 0 && !pairStart) {
                pairStart = true;
            }

            if (operands.contains(value)) {
                if(!pairEnd && !pairStart){
                    result = result + value;
                }else{
                    tempOperator = value;
                }
                continue;
            }
            if (pairEnd) {
                output = output + tempOperator;
                if(rightParenthesisCnt > 0){
                    rightParenthesisCnt-- ;
                    pairStart = false;
                    pairEnd = false;
                }
                result = StringUtils.isBlank(result) ? (result = output) : (result = output + result);
                output = null;
            }else{
                output = StringUtils.isBlank(output) ? (output = value) : (output = value + output);
            }
        }
        System.out.println("IP: " + input);
        System.out.println("OP: " + result);
    }
}

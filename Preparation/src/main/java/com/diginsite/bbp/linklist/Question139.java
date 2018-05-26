/**
 *
 */
package com.diginsite.bbp.linklist;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.apache.commons.lang3.StringUtils;

/**
 * @author dp250219
 *
 */
public class Question139 {
    public static List<String> operands = Arrays.asList("*", "+", "-", "%");

    /**
     * @param args
     */
    public static void main(String[] args) {
        Question139 obj = new Question139();

        Stack<String> stack = new Stack<String>();
        // Scanner scanner = new Scanner(System.in);
        //
        // while (scanner.hasNext()) {
        // stack.push(scanner.next());
        // }
        // scanner.close();

        stack.push("1");
        stack.push("+");
        stack.push("2");
        stack.push(")");
        stack.push("*");
        stack.push("3");
        stack.push("-");
        stack.push("4");
        stack.push(")");
        stack.push("*");
        stack.push("5");
        stack.push("-");
        stack.push("6");
        stack.push(")");
        //stack.push(")");
        //stack.push(")");
        obj.formExpression(stack);
    }

    public void formExpression(Stack<String> stack) {

        int rightParenthesisCnt = 0;
        String output = null;
        String input = null;
        int midOperandCnt = 0;
        boolean pairStart = false;
        while (!stack.isEmpty()) {
            String value = stack.pop();
            input = StringUtils.isBlank(input) ? (input = value) : (input = value + input);

            if (value.equals(")")) {
                if (StringUtils.isNoneBlank(output) && value.equals(")")) {
                    pairStart = true;
                } else {
                    rightParenthesisCnt++;
                    continue;
                }
            }
            if (operands.contains(value)) {
                midOperandCnt++;
            }

            if (midOperandCnt != 0 && !operands.contains(value)) {
                if (pairStart) {
                    if (midOperandCnt > 1) {
                        if(rightParenthesisCnt >= 1){
                            output = "((" + value + output + ")";
                            rightParenthesisCnt--;
                        }else{
                            output = "(" + value + output;
                        }
                        midOperandCnt = midOperandCnt - 2;
                        pairStart = false;
                    } else {
                        output = StringUtils.isBlank(output) ? (output = value) : (output = value + output);
                    }
                } else {
                    if (midOperandCnt == 1) {
                        output = "(" + value + output + ")";
                        rightParenthesisCnt--;
                        midOperandCnt--;
                    }
                }
            } else {
                 output = StringUtils.isBlank(output) ? (output = value) : (output = value + output);
            }
        }
        System.out.println("INPUT : " + input);
        System.out.println("OUTPUT: " + output);
    }

}

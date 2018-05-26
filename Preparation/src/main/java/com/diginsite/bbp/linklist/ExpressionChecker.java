/**
 *
 */
package com.diginsite.bbp.linklist;

import java.util.Scanner;
import java.util.Stack;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @author dp250219
 *
 */
public class ExpressionChecker {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ExpressionChecker checker = new ExpressionChecker();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String value = (String) scanner.next();
            if ("exit".equals(value)) {
                break;
            }
            checker.evaluateValue(value);
        }
        scanner.close();
    }

    private void evaluateValue(String value) {
        Stack<Character> charStack = new Stack<>();
        Stack<Character> unbalancedCharStack = new Stack<>();
        Character prevCharacter = null;

        if (StringUtils.isNotBlank(value)) {
            char[] charArray = value.toCharArray();

            for (char c : charArray) {
                charStack.push(c);
            }

            while (!charStack.isEmpty()) {
                Character element = charStack.pop();
                if (validate(prevCharacter, element)) {
                    unbalancedCharStack.pop();
                }else{
                    unbalancedCharStack.push(element);
                }

                if(!unbalancedCharStack.isEmpty()){
                    prevCharacter = unbalancedCharStack.peek();
                }
            }

            if(unbalancedCharStack.isEmpty()){
                System.out.println("Valid");
            }else{
                System.out.println("InValid");
            }
        }

    }

    /**
     * @param prevCharacter
     * @param element
     */
    boolean validate(Character prevCharacter, Character element) {
        if (ObjectUtils.anyNotNull(prevCharacter)) {
            String result = element.toString() + prevCharacter.toString();
            return result.equals("{}") || result.equals("[]") || result.equals("()");
        }
        return false;
    }
}

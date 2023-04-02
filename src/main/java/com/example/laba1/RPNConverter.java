package com.example.laba1;

import java.util.Stack;

public class RPNConverter {
    public static String convertToRPN(String infix) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String[] tokens = infix.split("\\s+");
        for (String token : tokens) {
            if (isOperator(token)) {
                while (!stack.isEmpty() && priority(token) <= priority(stack.peek())) {
                    sb.append(stack.pop()).append(" ");
                }
                stack.push(token);
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.peek().equals("(")) {
                    sb.append(stack.pop()).append(" ");
                }
                stack.pop();
            } else {
                sb.append(token).append(" ");
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }
        return sb.toString().trim();
    }

    private static boolean isOperator(String token) {
        return "+-*/^".contains(token);
    }

    private static int priority(String operator) {
        return switch (operator) {
            case "+", "-" -> 1;
            case "*", "/" -> 2;
            case "^" -> 3;
            default -> 0;
        };
    }

}

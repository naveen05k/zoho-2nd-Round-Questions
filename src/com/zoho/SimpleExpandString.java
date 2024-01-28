package com.zoho;
public class SimpleExpandString {
    public static String expand(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                result.append(ch);
            } else if (Character.isDigit(ch)) {
                int count = Character.getNumericValue(ch);
                i++; // Move to the next character

                // Handle two-digit numbers
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    count = count * 10 + Character.getNumericValue(input.charAt(i));
                    i++;
                }

                // Append the letter 'count' times to the result
                for (int j = 0; j < count; j++) {
                    result.append(ch);
                }

                // Adjust i to stay at the last digit of the number
                i--;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example 1
        String input1 = "a1b10";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + expand(input1));
        System.out.println();

        // Example 2
        String input2 = "b3c6d15";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + expand(input2));
    }
}

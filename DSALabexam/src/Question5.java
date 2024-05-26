///Problem: Write a function that uses a stack to reverse a given string.
//- Example: Input: "hello", Output: "olleh"

public class Question5 {
    public static void main(String[] args) {

        String original = "hello";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String input) {
        char[] stack = new char[input.length()];
        int top = -1;
        //for pushing acharcter into the stack
        for (char ch : input.toCharArray()) {
            stack[++top] = ch;
        }

        // Building the reversed string
        StringBuilder reversed = new StringBuilder();
        while (top >= 0) {
            reversed.append(stack[top--]);
        }
        // Return the reversed string
        return reversed.toString();
    }
}



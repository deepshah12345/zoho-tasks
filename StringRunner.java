package com.zoho.test;

import com.zoho.task.Task;
import com.zoho.exceptions.CustomException;
import java.util.Scanner;
import com.zoho.utility.Utility;
import java.util.ArrayList;

public class StringRunner {
    private Task task;
    private Scanner sc;
    private Utility utility;
   
    public StringRunner() {
        this.task = new Task();
        this.sc = new Scanner(System.in);
	this.utility=new Utility();

    }

    public static void main(String args[]) {
        StringRunner runner = new StringRunner();
        boolean run = true;

        while (run) {
            System.out.println("----------------------------------------");
            System.out.println("MAIN MENU view");
            System.out.println("1. Length of a String\n2. Convert to character Array\n3. Character at any index\n4. Number of occurrences of a given letter\n5. Greatest position of the given letter\n6. Last n characters of a given String\n7. First n characters of a given String\n8. Replace the first n characters of a String with XYZ\n9. Starts with...\n10. Ends with...\n11. Convert to uppercase\n12. Convert to lowercase\n13. Reverse a string\n14. Accept multiple Strings\n15. Concatenate Strings\n16. String into String array\n17. Merge String with sequence\n18. String equality (case-sensitive)\n19. String equality (case-insensitive)\n20. Remove spaces from the beginning/end\n21. Exit");
            System.out.println("----------------------------------------");
            System.out.println("Enter your choice: ");
            int choice = runner.sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        runner.handleStringLength(args);
                        break;
                    case 2:
                        runner.handleCharArray();
                        break;
                    case 3:
                        runner.handleCharAtIndex();
                        break;
                    case 4:
                        runner.handleOccurrences();
                        break;
                    case 5:
                        runner.handleGreatestPosition();
                        break;
                    case 6:
                        runner.handleLastNCharacters();
                        break;
                    case 7:
                        runner.handleFirstNCharacters();
                        break;
                    case 8:
                        runner.handleReplaceWithString();
                        break;
                    case 9:
                        runner.handleStartsWith();
                        break;
                    case 10:
                        runner.handleEndsWith();
                        break;
                    case 11:
                        runner.handleToUpperCase();
                        break;
                    case 12:
                        runner.handleToLowerCase();
                        break;
                    case 13:
                        runner.handleReverse();
                        break;
                    case 14:
                        runner.handleMultipleStrings();
                        break;
                    case 15:
                        runner.handleConcatenateStrings();
                        break;
                    case 16:
                        runner.handleStringArray();
                        break;
                    case 17:
                        runner.handleStringMerge();
                        break;
                    case 18:
                        runner.handleEqualCaseSensitive();
                        break;
                    case 19:
                        runner.handleEqualCaseInsensitive();
                        break;
                    case 20:
                        runner.handleRemoveSpaces();
                        break;
                    case 21:
                        System.out.println("Exited successfully");
                        run = false;
                        break;
                    default:
                        System.out.println("Enter an option between 1-21");
                }
            } catch (CustomException ex) {
                System.out.println("Exception occurred: " + ex.getMessage());
                ex.printStackTrace();
               // Throwable cause = ex.getCause();
               // if (cause != null) {
               //     System.out.println("Caused by: " + cause);
               // }
            }
        }
    }

   private void handleStringLength(String[] args) throws CustomException {
    try {
        utility.checkEmptyArguments(args);
        System.out.println("Length: " + task.findLength(args[0]));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleCharArray() throws CustomException {
    try {
        System.out.println("Enter the string: ");
        String input = sc.next();
        char[] array = task.getCharArray(input);
        for (char ch : array) {
            System.out.print(ch + " ");
        }
        System.out.println();
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleCharAtIndex() throws CustomException {
    try {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        System.out.println(task.getCharacterAtIndex(input, index));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleOccurrences() throws CustomException {
    try {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        System.out.println(task.getOccurence(input, ch));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleGreatestPosition() throws CustomException {
    try {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        System.out.println(task.getGreatestPosition(input, ch));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleLastNCharacters() throws CustomException {
    try {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Number of characters from the last to be printed: ");
        int n = sc.nextInt();
        System.out.println(task.getLastNCharacter(input, n));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleFirstNCharacters() throws CustomException {
    try {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Number of characters from the first to be printed: ");
        int n = sc.nextInt();
        System.out.println(task.getFirstNCharacter(input, n));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleReplaceWithString() throws CustomException {
    try {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Enter the number of characters to replace: ");
        int n = sc.nextInt();
        System.out.println("Enter the replacement string: ");
        String replace = sc.next();
        System.out.println(task.replaceWithString(input, n, replace));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleStartsWith() throws CustomException {
    try {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Enter the prefix to check: ");
        String prefix = sc.next();
        System.out.println(task.startsWithString(input, prefix));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleEndsWith() throws CustomException {
    try {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Enter the suffix to check: ");
        String suffix = sc.next();
        System.out.println(task.endsWithString(input, suffix));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleToUpperCase() throws CustomException {
    try {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println(task.toUpper(input));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleToLowerCase() throws CustomException {
    try {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println(task.toLower(input));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleReverse() throws CustomException {
    try {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println(task.reverse(input));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleMultipleStrings() throws CustomException {
    try {
        sc.nextLine();
        System.out.println("Enter multiple strings: ");
        String input = sc.nextLine();
        utility.checkNull(input);
        System.out.println(input);
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleConcatenateStrings() throws CustomException {
    try {
        sc.nextLine();
        System.out.println("Enter the multiple strings to concatenate: ");
        String input = sc.nextLine();
        System.out.println("Enter the delimiter: ");
        String delimiter = sc.next();
        System.out.println("Enter the string to replace: ");
        String replace = sc.next();
        System.out.println(task.replace(input, delimiter, replace));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleStringArray() throws CustomException {
    try {
        sc.nextLine();
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        System.out.println("Enter the character to split with: ");
        String split = sc.next();
        String[] array = task.toStringArray(input, split);
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\"" + array[i] + "\"");
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleStringMerge() throws CustomException {
    try {
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        ArrayList<String> words = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("String " + i + ": ");
            String str = sc.next();
            utility.checkNull(str);
            words.add(str);
        }
        System.out.println("Enter a sequence to merge with: ");
        String sequence = sc.next();
        System.out.println(task.stringMerge(words, sequence));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleEqualCaseSensitive() throws CustomException {
    try {
        System.out.println("Enter string 1: ");
        String string1 = sc.next();
        System.out.println("Enter string 2: ");
        String string2 = sc.next();
        System.out.println(task.equalCaseSensitive(string1, string2));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleEqualCaseInsensitive() throws CustomException {
    try {
        System.out.println("Enter string 1: ");
        String string1 = sc.next();
        System.out.println("Enter string 2: ");
        String string2 = sc.next();
        System.out.println(task.equalCaseInSensitive(string1, string2));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}

private void handleRemoveSpaces() throws CustomException {
    try {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println(task.removeSpacesFromBegAndEnd(input));
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}
}
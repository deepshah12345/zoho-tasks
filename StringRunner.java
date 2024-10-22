package com.zoho.test;

import com.zoho.task.Task;
import com.zoho.exceptions.CustomException;
import java.io.Console;
import java.util.Scanner;
import java.util.ArrayList;

public class StringRunner {

    public static void main(String args[]) {
        Task task = new Task();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("MAIN MENU view");
            System.out.println("1. Length of a String\n2. Convert to character Array\n3. Character at any index\n4. Number of occurrences of a given letter\n5. Greatest position of the given letter\n6. Last n characters of a given String\n7. First n characters of a given String\n8. Replace the first n characters of a String with XYZ\n9. Starts with...\n10. Ends with...\n11. Convert to uppercase\n12. Convert to lowercase\n13. Reverse a string\n14. Accept multiple Strings\n15. Concatenate Strings\n16. String into String array\n17. Merge String with sequence\n18. String equality (case-sensitive)\n19. String equality (case-insensitive)\n20. Remove spaces from the beginning/end\n21. Exit");
            System.out.println("----------------------------------------");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        handleStringLength(args, task);
                        break;
                    case 2:
                        handleCharArray(sc, task);
                        break;
                    case 3:
                        handleCharAtIndex(sc, task);
                        break;
                    case 4:
                        handleOccurrences(sc, task);
                        break;
                    case 5:
                        handleGreatestPosition(sc, task);
                        break;
                    case 6:
                        handleLastNCharacters(sc, task);
                        break;
                    case 7:
                        handleFirstNCharacters(sc, task);
                        break;
                    case 8:
                        handleReplaceWithString(sc, task);
                        break;
                    case 9:
                        handleStartsWith(sc, task);
                        break;
                    case 10:
                        handleEndsWith(sc, task);
                        break;
                    case 11:
                        handleToUpperCase(sc, task);
                        break;
                    case 12:
                        handleToLowerCase(sc, task);
                        break;
                    case 13:
                        handleReverse(sc, task);
                        break;
                    case 14:
                        handleMultipleStrings(sc, task);
                        break;
                    case 15:
                        handleConcatenateStrings(sc, task);
                        break;
                    case 16:
                        handleStringArray(sc, task);
                        break;
                    case 17:
                        handleStringMerge(sc, task);
                        break;
                    case 18:
                        handleEqualCaseSensitive(sc, task);
                        break;
                    case 19:
                        handleEqualCaseInsensitive(sc, task);
                        break;
                    case 20:
                        handleRemoveSpaces(sc, task);
                        break;
                    case 21:
                        System.out.println("Exited successfully");
                        System.exit(0);
                }
            } catch (CustomException ex) {
                System.out.println("Exception occurred: " + ex.getMessage());
            }
        }
    }

    private static void handleStringLength(String[] args, Task task) throws CustomException {
        if (args.length == 0) {
            throw new CustomException("No arguments passed");
        }
        System.out.println("Length: " + task.findLength(args[0]));
    }

    private static void handleCharArray(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter the string: ");
        String input = sc.next();
        char[] array = task.charArray(input);
        for (char ch : array) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    private static void handleCharAtIndex(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        System.out.println(task.getCharacterAtIndex(input, index));
    }

    private static void handleOccurrences(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        System.out.println(task.getOccurence(input, ch));
    }

    private static void handleGreatestPosition(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        System.out.println(task.getGreatestPosition(input, ch));
    }

    private static void handleLastNCharacters(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Number of characters from the last to be printed: ");
        int n = sc.nextInt();
        System.out.println(task.getLastNCharacter(input, n));
    }

    private static void handleFirstNCharacters(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Number of characters from the first to be printed: ");
        int n = sc.nextInt();
        System.out.println(task.getFirstNCharacter(input, n));
    }

    private static void handleReplaceWithString(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Enter the number of characters to replace: ");
        int n = sc.nextInt();
        System.out.println("Enter the replacement string: ");
        String replace = sc.next();
        System.out.println(task.replaceWithString(input, n, replace));
    }

    private static void handleStartsWith(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Enter the prefix to check: ");
        String prefix = sc.next();
        System.out.println(task.startsWithString(input, prefix));
    }

    private static void handleEndsWith(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println("Enter the suffix to check: ");
        String suffix = sc.next();
        System.out.println(task.endsWithString(input, suffix));
    }

    private static void handleToUpperCase(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println(task.toUpper(input));
    }

    private static void handleToLowerCase(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println(task.toLower(input));
    }

    private static void handleReverse(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println(task.reverse(input));
    }

    private static void handleMultipleStrings(Scanner sc, Task task) throws CustomException {
        sc.nextLine();
        System.out.println("Enter multiple strings: ");
        String input = sc.nextLine();
        task.checkNull(input);
        System.out.println(input);
    }

    private static void handleConcatenateStrings(Scanner sc, Task task) throws CustomException {
        sc.nextLine();
        System.out.println("Enter the multiple strings to concatenate: ");
        String input = sc.nextLine();
        System.out.println("Enter the delimiter: ");
        String delimiter = sc.next();
        System.out.println("Enter the string to replace: ");
        String replace = sc.next();
        System.out.println(task.replace(input, delimiter, replace));
    }

    private static void handleStringArray(Scanner sc, Task task) throws CustomException {
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
    }

    private static void handleStringMerge(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        ArrayList<String> words = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("String " + i + ": ");
            String str = sc.next();
            task.checkNull(str);
            words.add(str);
        }
        System.out.println("Enter a sequence to merge with: ");
        String sequence = sc.next();
        System.out.println(task.stringMerge(words, sequence));
    }

    private static void handleEqualCaseSensitive(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter string 1: ");
        String string1 = sc.next();
        System.out.println("Enter string 2: ");
        String string2 = sc.next();
        System.out.println(task.equalCaseSensitive(string1, string2));
    }

    private static void handleEqualCaseInsensitive(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter string 1: ");
        String string1 = sc.next();
        System.out.println("Enter string 2: ");
        String string2 = sc.next();
        System.out.println(task.equalCaseInSensitive(string1, string2));
    }

    private static void handleRemoveSpaces(Scanner sc, Task task) throws CustomException {
        System.out.println("Enter the string: ");
        String input = sc.next();
        System.out.println(task.removeSpacesFromBegAndEnd(input));
    }
}

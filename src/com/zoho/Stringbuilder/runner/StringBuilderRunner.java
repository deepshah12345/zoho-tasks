package com.zoho.test;

import com.zoho.task.Task;
import com.zoho.exceptions.CustomException;
import java.util.Scanner;
import com.zoho.utility.Utility;
public class StringBuilderRunner {
    private Task task;
    private Scanner sc;
    
    public StringBuilderRunner() {
        this.task = new Task();
        this.sc = new Scanner(System.in);
	

    }
    public static void main(String args[]) {
    	StringBuilderRunner runner = new StringBuilderRunner();
        boolean run = true;
	while(run){
		System.out.println("----------------------------------------");
            	System.out.println("MAIN MENU view");
		System.out.println("1.adding a string and print length\n2.adding n string\n3.sinserting strings between strings\n4.delete string\n5.replace string\n6.reverse a string\n7.delete by index\n8.replace by index\n9.get first index of character\n10.get last index of character\n");
 
        	 System.out.println("----------------------------------------");
            	 System.out.println("Enter your choice: ");
            	 int choice = runner.sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        runner.handleStringBuilderWithNoString();
                        break;
                    case 2:
                        runner.handleMultipleStrings();
                        break;
                    case 3:
                       runner.handleInsertStrings();
                        break;
                    case 4:
                        runner.handleDeleteStrings();
                        break;
                    case 5:
                        runner.handleReplaceStrings();
                        break;
                    case 6:
                       runner.handleReverseStrings();
                        break;
                    case 7:
                       runner.handleDeleteSpecIndex();
                        break;
                    case 8:
                       runner.handleReplaceSpecIndex();
                        break;
                    case 9:
                        runner.handleFirstIndex();
                        break;
                    case 10:
                        runner.handleLastIndex();
                        break;
		    default:
                        System.out.println("Enter an option between 1-21");
                }
            } catch (CustomException ex) {
                System.out.println("Exception occurred: " + ex.getMessage());
                ex.printStackTrace();
              }
		
	}
    }

	   public void handleStringBuilderWithNoString() throws CustomException {
        try {
            StringBuilder string1 = new StringBuilder();
            System.out.println("Length: " + task.findLength(string1));
            addString(string1);
            System.out.println("The string is: " + string1);
            System.out.println("Length: " + task.findLength(string1));
        } catch (CustomException ex) {
            throw new CustomException("Exception occurred at runner", ex);
        }
    }

    public void handleMultipleStrings() throws CustomException {
        try {
            System.out.println("Enter the string to start with:");
            String input = sc.next();
            StringBuilder string2 = new StringBuilder(input);

            System.out.println("Length: " + task.findLength(string2));
            System.out.println("Enter the string by which it should be separated by:");
            String separator = sc.next();

            System.out.println("Enter the number of strings to be added:");
            int n = sc.nextInt();
            sc.nextLine(); 
	    string2.append(separator);
            for (int i = 1; i <= n; i++) {
                addString(string2);
                if (i < n) {
                    string2.append(separator);
                }
            }

            System.out.println("Final string: " + string2);
            System.out.println("Length: " + task.findLength(string2));
        } catch (CustomException ex) {
            throw new CustomException("Exception occurred at runner", ex);
        }
    }
	public void handleInsertStrings() throws CustomException{
	 	try{
	       		System.out.println("Enter the first string: ");
        		String part1 = sc.next();
			Utility.checkNull(part1);     
       			System.out.println("Enter the second string: ");
        		String part2 = sc.next();    
			Utility.checkNull(part2);    
        		StringBuilder sb = new StringBuilder(part1).append(" ").append(part2);        
        		System.out.println("Initial String: " + sb);
       		        System.out.println("Initial Length: " + task.findLength(sb));       
       		        System.out.println("Enter the string to insert between the first and second strings: ");
       			String middle = sc.next();          
			task.getInsertString(sb,middle,part1.length() + 1);    
        		System.out.println("Final String: " + sb);
        		System.out.println("Final Length: " + task.findLength(sb));
              }catch (CustomException ex) {
                       throw new CustomException("Exception occurred at runner", ex);
              }


	}

	public void handleDeleteStrings() throws CustomException{
	 	try{
	       		System.out.println("Enter the first string: ");
        		String part1 = sc.next();
			Utility.checkNull(part1);     
       			System.out.println("Enter the second string: ");
        		String part2 = sc.next();    
			Utility.checkNull(part2);    
        		StringBuilder sb = new StringBuilder(part1).append(" ").append(part2);        
        		System.out.println("Initial String: " + sb);
       		        System.out.println("Initial Length: " + task.findLength(sb));       
       		        task.getDeleteString(sb,0,part1.length());
        		System.out.println("Final String: " + sb);
        		System.out.println("Final Length: " + task.findLength(sb));
              }catch (CustomException ex) {
                       throw new CustomException("Exception occurred at runner", ex);
              }


	}
	
public void handleReplaceStrings() throws CustomException {
    try {
      
        System.out.println("Enter the first string: ");
        String part1 = sc.next();
        System.out.println("Enter the second string: ");
        String part2 = sc.next();
        System.out.println("Enter the third string: ");
        String part3 = sc.next();
        validateStrings(part1, part2, part3); // Encapsulated validation method

        
        StringBuilder sb = new StringBuilder(part1).append(" ").append(part2).append(" ").append(part3);
        System.out.println("Initial String: " + sb);
        System.out.println("Initial Length: " + task.findLength(sb));

        // Input for replacement operation
        System.out.println("Enter the string to replace: ");
        String remove = sc.next();
        System.out.println("Enter the string to replace with: ");
        String replace = sc.next();

   
        int index;
        boolean found = false;
        while ((index = sb.indexOf(remove)) != -1) {
            found = true;
            task.getReplaceString(sb, index, index + remove.length(), replace);
        }

        if (!found) {
            System.out.println("No matches found for the string: " + remove);
        } else {
            // Final state after replacements
            System.out.println("Final String: " + sb);
            System.out.println("Final Length: " + task.findLength(sb));
        }
    } catch (CustomException ex) {
        throw new CustomException("Exception occurred at runner", ex);
    }
}


public static void validateStrings(String... strings) throws CustomException {
    for (String str : strings) {
        if (str == null || str.trim().isEmpty()) {
            throw new CustomException("Input strings cannot be null or empty.");
        }
    }
}
	public void handleReverseStrings() throws CustomException{
	 	try{
	       		System.out.println("Enter the first string: ");
        		String part1 = sc.next();
			Utility.checkNull(part1);     
       			System.out.println("Enter the second string: ");
        		String part2 = sc.next(); 
			Utility.checkNull(part2); 
			System.out.println("Enter the third string: ");
        		String part3 = sc.next();    
			Utility.checkNull(part3);    
        		StringBuilder sb = new StringBuilder(part1).append(" ").append(part2).append(" ").append(part3);        
        		System.out.println("Initial String: " + sb);
       		        System.out.println("Initial Length: " + task.findLength(sb)); 
			task.reverseString(sb);
 			System.out.println("Final String: " + sb);
        		System.out.println("Final Length: " + task.findLength(sb));
              }catch (CustomException ex) {
                       throw new CustomException("Exception occurred at runner", ex);
              }


	}
	public void handleDeleteSpecIndex() throws CustomException{
	 	try{
	       		System.out.println("Enter the string within 10 characters: ");
        		String part1 = sc.next();
			Utility.checkNull(part1); 
			StringBuilder sb = new StringBuilder(part1);
			System.out.println("Initial String: " + sb);
       		        System.out.println("Initial Length: " + task.findLength(sb));   
       			System.out.println("Enter the start index: ");
			int start=sc.nextInt();
			System.out.println("Enter the end index: ");
			int end=sc.nextInt();
			task.getDeleteString(sb,start,end+1);
			System.out.println("Final String: " + sb);
        		System.out.println("Final Length: " + task.findLength(sb));

              }catch (CustomException ex) {
                       throw new CustomException("Exception occurred at runner", ex);
              }

	}
	public void handleReplaceSpecIndex() throws CustomException{
	 	try{
	       		System.out.println("Enter the string within 10 characters: ");
        		String part1 = sc.next();
			Utility.checkNull(part1); 
			StringBuilder sb = new StringBuilder(part1);
			System.out.println("Initial String: " + sb);
       		        System.out.println("Initial Length: " + task.findLength(sb));   
       			System.out.println("Enter the start index: ");
			int start=sc.nextInt();
			System.out.println("Enter the end index: ");
			int end=sc.nextInt();
			System.out.println("enter the string to replace with:");
			String replace = sc.next();
			task.getReplaceString(sb,start,end+1,replace);
			System.out.println("Final String: " + sb);
        		System.out.println("Final Length: " + task.findLength(sb));

              }catch (CustomException ex) {
                       throw new CustomException("Exception occurred at runner", ex);
              }

	}
	
    public void handleFirstIndex() throws CustomException {
        try {
            
            StringBuilder string = new StringBuilder();
            System.out.println("Enter the string by which it should be separated by:");
            String separator = sc.next();

            System.out.println("Enter the number of strings to be added:");
            int n = sc.nextInt();
            sc.nextLine(); 
	    
            for (int i = 1; i <= n; i++) {
                addString(string);
                if (i < n) {
                    string.append(separator);
                }
            }

            System.out.println("Final string: " + string);
            System.out.println("Length: " + task.findLength(string));
	    System.out.println("index:"+task.getFirstIndex(string,separator));

        } catch (CustomException ex) {
            throw new CustomException("Exception occurred at runner", ex);
        }
    }

	public void handleLastIndex() throws CustomException {
        try {
            
            StringBuilder string = new StringBuilder();
            System.out.println("Enter the string by which it should be separated by:");
            String separator = sc.next();

            System.out.println("Enter the number of strings to be added:");
            int n = sc.nextInt();
            sc.nextLine(); 
	    
            for (int i = 1; i <= n; i++) {
                addString(string);
                if (i < n) {
                    string.append(separator);
                }
            }

            System.out.println("Final string: " + string);
            System.out.println("Length: " + task.findLength(string));
	    System.out.println("index:"+task.getLastIndex(string,separator));

        } catch (CustomException ex) {
            throw new CustomException("Exception occurred at runner", ex);
        }
    }

    public void addString(StringBuilder string) throws CustomException {
        System.out.println("Enter the string:");
        String input = sc.next();  
	Utility.checkNull(input);
        string.append(input);
    }
}
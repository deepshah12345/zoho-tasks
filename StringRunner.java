package com.zoho.test;
import com.zoho.task.Task;
import com.zoho.exceptions.CustomException;
import java.io.Console;
import java.util.Scanner;
import java.util.ArrayList;
public class StringRunner{
     public static void main(String args[]){
     		Task task=new Task();
		Scanner sc=new Scanner(System.in);
            Console console=System.console();
		while(true){
			System.out.println("----------------------------------------");
			System.out.println("MAIN MENU view");
			//System.out.println("1.length of a String\n2.convert it into character Array\n3.character at index");
			System.out.println("1.length of a String\n2.convert it into character Array\n3.character at any index\n4.number of occurrences of a givenletter\n5.greatest position of the given letter\n6.last n characters of a given String\n7.first n characters of a given String\n8.replace the first n characters of a String with XYZ\n9.starts with ent\n10.check whether a String ends with le\n11.convert to uppercase\n12.convert to lowercase\n13.reverse a string\n14.accept a line with multiple Strings\n15. output a Single String without space\n16.each String into aString array\n17.merge each String with character sequence\n18.String are equal -case sensitive \n19.String are equal -case insensitive\n20.String with no space either at the beginning or end.\n21.exit");
		System.out.println("----------------------------------------");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		try{
		switch(choice){

		//TASK1
		case 1:
		//System.out.println("enter the string:");
		//String inputOne = console.readLine();
		if(args.length ==0){
			System.out.println("no arguments passed");
			
		}
		else
		System.out.println("length:"+task.findLength(args[0]));
		
		break;
	

		//TASK2
		case 2:
            
		System.out.println("enter the string:");
		String inputTwo=sc.next();
		
            char[] arrayTwo=task.charArray(inputTwo);
		for(char ch:arrayTwo){
			System.out.print(ch+" ");
		}
		
	      System.out.println();
		break;


		//TASK3 
    		case 3:
		System.out.println("enter the string:"); 
            String inputThree=sc.next();
		System.out.println("enter the index:"); 
		int index=sc.nextInt();
		
            System.out.println(task.getAnyCharacter(inputThree,index));
		
		break;

		//TASK4
		case 4:
		System.out.println("enter the string:");
		String inputFour=sc.next();
		System.out.println("enter the character:");
		char ch4=sc.next().charAt(0);
		
		System.out.print(task.getOccurence(inputFour,ch4));
		
		System.out.println();
		break;

		case 5:
		//TASK5
		System.out.println("enter the string:");
		String inputFive=sc.next();
		System.out.println("enter the character");
		char ch5=sc.next().charAt(0);
		
		System.out.println(task.getGreatestPosition(inputFive,ch5));
		
		break;

		//task6
		case 6:
		System.out.println("enter the string:");
	      String inputSix=sc.next();
		System.out.println("no of characters from the last to be printed:");
		int n6=sc.nextInt();
		
		System.out.println(task.getLastNCharacter(inputSix,n6));
		
		break;

		//task7
		case 7:
		System.out.println("enter the string:");
		String inputSeven=sc.next();
		System.out.println("no of characters from the first to be printed:");
		int n7=sc.nextInt();
		
		System.out.println(task.getFirstNCharacter(inputSeven,n7));
		
		break;

		//task8
		case 8:
		System.out.println("enter the string:");
		String inputEight=sc.next();
		System.out.println("enter the no of characters to replace with:");
		int eight=sc.nextInt();
		System.out.println("enter the string to be replaced:"); 
		String replace=sc.next();
		
		System.out.println(task.replaceWithString(inputEight,eight,replace));
		
		break;

		//task9
		case 9:
		System.out.println("enter the string:");
		String inputNine=sc.next();
		System.out.println("enter the string to check startswith:");
		String starts=sc.next();
		
		System.out.println(task.startsWithString(inputNine,starts));
		
		break;

		//task10
		case 10:
		System.out.println("enter the string:");
		String inputTen=sc.next();
		System.out.println("enter the string to check endswith:");
		String ends=sc.next();
		
		System.out.println(task.endsWithString(inputTen,ends));
		
		break;

		//task11
		case 11:
		System.out.println("enter the string:");
		String inputEleven=sc.next();
		
		System.out.println(task.toUpper(inputEleven));
		
		break;

		//task12
		case 12:
		System.out.println("enter the string:");
		String inputTwelve=sc.next();
		
		System.out.println(task.toLower(inputTwelve));
		
		break;

		//task13
		case 13:
		System.out.println("enter the string:");
		String inputThirteen=sc.next();
		
		System.out.print(task.reverse(inputThirteen));
		
		System.out.println();
		break;

		//task14
		case 14:
		sc.nextLine();
            System.out.println("enter the multiple string:");
		String inputFourteen=sc.nextLine();
		
		task.checkNull(inputFourteen);
		System.out.println(inputFourteen);
		
		break;

		//task15
		case 15:
		System.out.println("enter the multiple string to concatenate:");
		sc.nextLine();
		String inputFifteen=sc.nextLine();
		System.out.println("enter the delimeter:");
		String delimiter=sc.next();
		System.out.print(task.replace(inputFifteen,delimiter));
		
		System.out.println();
		break;

		//task16
		case 16:
		System.out.println("enter the string:");
		String inputSixteen=sc.nextLine();
		System.out.println("enter the character to split with:");
		String split=sc.next();
		
		String[] array16=task.toStringArray(inputSixteen,split);
		System.out.print("{");
		for(int i=0;i<array16.length;i++){
			System.out.print("\""+array16[i]+"\"");
			if (i < array16.length - 1){
               		System.out.print(", ");
			}
		}
		System.out.println("}");
		
		
		break;
		
		//task17
		case 17:
		System.out.println("enter the number of Strings:");
		int n17=sc.nextInt();
		ArrayList<String> words=new ArrayList<String>();
		
		for(int i=1;i<=n17;i++){
			System.out.println("String"+i+":");
			String str=sc.next();
			task.checkNull(str);
			words.add(str);
		}
		System.out.println("enter a sequence to merge with:");
		String sequence=sc.next();
		System.out.print(task.stringMerge(words,sequence));
		
		System.out.println();
		break;

		//task18
		case 18:
		System.out.println("enter the string1:");
		String string1=sc.next();
		System.out.println("enter the string2:");
		String string2=sc.next();
		
		System.out.println(task.equalCaseSensitive(string1,string2));
		
		break;

		//task19
		case 19:
		System.out.println("enter the string1:");
		String stringOne=sc.next();
		System.out.println("enter the string2:");
		String stringTwo=sc.next();
		
		System.out.println(task.equalCaseInSensitive(stringOne,stringTwo));
		
		break;

		//task-20
		case 20:
		System.out.println("enter the string:");
		sc.nextLine();
		String inputTwenty=sc.nextLine();
		
		System.out.println(task.removeSpacesFromBegAndEnd(inputTwenty));
		
		break;
		

		//exit
		case 21:
		System.out.println("exited successfully");
		System.exit(0);
	}
 	}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}
	}
}
}

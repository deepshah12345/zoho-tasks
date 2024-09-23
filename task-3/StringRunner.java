package com.zoho.test;
import com.zoho.task.Task;
import java.io.Console;
import java.util.Scanner;
public class StringRunner{
     public static void main(String args[]){
     		Task task=new Task();
            Console console=System.console();
		//TASK1
		System.out.println("enter the string:");
		String inputOne = console.readLine();
		System.out.println("length:"+task.findLength(inputOne));

		//TASK2
            Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String inputTwo=sc.next();
            char[] arrayTwo=task.charArray(inputTwo);
		for(char ch:arrayTwo)
		System.out.print(ch+" ");
	      System.out.println();

		//TASK3     
		System.out.println("enter the string:"); 
            String inputThree=sc.next();
            System.out.println(task.penultimate(inputThree));

		//TASK4
		System.out.println("enter the string:");
		String inputFour=sc.next();
		System.out.println("enter the character");
		char ch4=sc.next().charAt(0);	
		System.out.print(task.occurence(inputFour,ch4));
		System.out.println();

		//TASK5
		System.out.println("enter the string:");
		String inputFive=sc.next();
		System.out.println("enter the character");
		char ch5=sc.next().charAt(0);
		System.out.println(task.greatestPosition(inputFive,ch5));
		
		//task6
		System.out.println("enter the string:");
	      String inputSix=sc.next();
		System.out.println(task.lastFiveCharacter(inputSix));

		//task7
		System.out.println("enter the string:");
		String inputSeven=sc.next();
		System.out.println(task.firstThreeCharacter(inputSeven));

		//task8
		System.out.println("enter the string:");
		String inputEight=sc.next();
		System.out.println(task.replaceWithXYZ(inputEight));

		//task9
		System.out.println("enter the string:");
		String inputNine=sc.next();
		System.out.println(task.startsWithEnt(inputNine));

		//task10
		System.out.println("enter the string:");
		String inputTen=sc.next();
		System.out.println(task.endsWithLe(inputTen));
		
		//task11
		System.out.println("enter the string:");
		String inputEleven=sc.next();
		System.out.println(task.toUpper(inputEleven));

		//task12
		System.out.println("enter the string:");
		String inputTwelve=sc.next();
		System.out.println(task.toLower(inputTwelve));
	
		//task13
		System.out.println("enter the string:");
		String inputThirteen=sc.next();
		System.out.print(task.reverse(inputThirteen));
		System.out.println();

		//task14
		sc.nextLine();
            System.out.println("enter the multiple string:");
		String inputFourteen=sc.nextLine();
		
		//task15
		
		System.out.println("enter the multiple string:");
		String inputFifteen=sc.nextLine();
		System.out.print(task.noSpace(inputFifteen));
		System.out.println();

		//task16
		System.out.println("enter the string:");
		String inputSixteen=sc.nextLine();
		String[] array16=task.toStringArray(inputSixteen);
		System.out.print("{");
		for(int i=0;i<array16.length;i++){
			System.out.print("\""+array16[i]+"\"");
			if (i < array16.length - 1) 
               		System.out.print(", ");
		}
		System.out.println("}");

		//task17
		System.out.print(task.stringMerge());
		System.out.println();

		//task18
		System.out.println("enter the string1:");
		String string1=sc.next();
		System.out.println("enter the string2:");
		String string2=sc.next();
		System.out.println(task.equalCaseSensitive(string1,string2));

		//task19
		System.out.println("enter the string1:");
		String stringOne=sc.next();
		System.out.println("enter the string2:");
		String stringTwo=sc.next();
		System.out.println(task.equalCaseInSensitive(stringOne,stringTwo));
		

		//task-20
		System.out.println("enter the string:");
		sc.nextLine();
		String inputTwenty=sc.nextLine();
		System.out.println(task.removeSpacesFromBegAndEnd(inputTwenty));
		
		
}
}

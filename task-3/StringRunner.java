package com.zoho.test;
import com.zoho.task.Task;
import com.zoho.exceptions.CustomException;
import java.io.Console;
import java.util.Scanner;
import java.util.ArrayList;
public class StringRunner{
     public static void main(String args[]){
     		Task task=new Task();
            Console console=System.console();
		//TASK1
		System.out.println("enter the string:");
		String inputOne = console.readLine();
		try{
		System.out.println("length:"+task.findLength(inputOne));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}
		//TASK2
            Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String inputTwo=sc.next();
		try{
            char[] arrayTwo=task.charArray(inputTwo);
		for(char ch:arrayTwo){
			System.out.print(ch+" ");
		}
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}
		
	      System.out.println();

		//TASK3     
		System.out.println("enter the string:"); 
            String inputThree=sc.next();
		System.out.println("enter the string:"); 
		int index=sc.nextInt();
		try{
            System.out.println(task.penultimate(inputThree,index));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}

		//TASK4
		System.out.println("enter the string:");
		String inputFour=sc.next();
		System.out.println("enter the character:");
		char ch4=sc.next().charAt(0);
		try{	
		System.out.print(task.occurence(inputFour,ch4));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}
		System.out.println();

		//TASK5
		System.out.println("enter the string:");
		String inputFive=sc.next();
		System.out.println("enter the character");
		char ch5=sc.next().charAt(0);
		try{
		System.out.println(task.greatestPosition(inputFive,ch5));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}

		//task6
		System.out.println("enter the string:");
	      String inputSix=sc.next();
		System.out.println("no of characters from the last to be printed:");
		int n6=sc.nextInt();
		try{
		System.out.println(task.lastNCharacter(inputSix,n6));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}

		//task7
		System.out.println("enter the string:");
		String inputSeven=sc.next();
		System.out.println("no of characters from the first to be printed:");
		int n7=sc.nextInt();
		try{
		System.out.println(task.firstNCharacter(inputSeven,n7));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}

		//task8
		System.out.println("enter the string:");
		String inputEight=sc.next();
		System.out.println("enter the target string:"); 
		String target=sc.next();
		System.out.println("enter the string to be replaced:"); 
		String replace=sc.next();
		try{
		System.out.println(task.replaceWithString(inputEight,target,replace));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}

		//task9
		System.out.println("enter the string:");
		String inputNine=sc.next();
		System.out.println("enter the string to check startswith:");
		String starts=sc.next();
		try{
		System.out.println(task.startsWithString(inputNine,starts));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}

		//task10
		System.out.println("enter the string:");
		String inputTen=sc.next();
		System.out.println("enter the string to check endswith:");
		String ends=sc.next();
		try{
		System.out.println(task.endsWithString(inputTen,ends));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}

		//task11
		System.out.println("enter the string:");
		String inputEleven=sc.next();
		try{
		System.out.println(task.toUpper(inputEleven));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}

		//task12
		System.out.println("enter the string:");
		String inputTwelve=sc.next();
		try{
		System.out.println(task.toLower(inputTwelve));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}

		//task13
		System.out.println("enter the string:");
		String inputThirteen=sc.next();
		try{
		System.out.print(task.reverse(inputThirteen));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}
		System.out.println();

		//task14
		sc.nextLine();
            System.out.println("enter the multiple string:");
		String inputFourteen=sc.nextLine();
		try{
			task.isNull(inputFourteen);
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}

		//task15
		
		System.out.println("enter the multiple string to concatenate:");
		String inputFifteen=sc.nextLine();
		try{
		System.out.print(task.noSpace(inputFifteen));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}
		System.out.println();

		//task16
		System.out.println("enter the string:");
		String inputSixteen=sc.nextLine();
		System.out.println("enter the character to split with:");
		String split=sc.next();
		try{
		String[] array16=task.toStringArray(inputSixteen,split);
		System.out.print("{");
		for(int i=0;i<array16.length;i++){
			System.out.print("\""+array16[i]+"\"");
			if (i < array16.length - 1){
               		System.out.print(", ");
			}
		}
		System.out.println("}");
		
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}
		
		
		//task17
		System.out.println("enter the number of Strings:");
		int n17=sc.nextInt();
		ArrayList<String> words=new ArrayList<String>();
		try{
		for(int i=0;i<n17;i++){
			System.out.println("String"+i+":");
			String str=sc.next();
			task.isNull(str);
			words.add(str);
		}
		System.out.println("enter a sequence to merge with:");
		String sequence=sc.next();
		System.out.print(task.stringMerge(words,sequence));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}
		System.out.println();

		//task18
		System.out.println("enter the string1:");
		String string1=sc.next();
		System.out.println("enter the string2:");
		String string2=sc.next();
		try{
		System.out.println(task.equalCaseSensitive(string1,string2));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}

		//task19
		System.out.println("enter the string1:");
		String stringOne=sc.next();
		System.out.println("enter the string2:");
		String stringTwo=sc.next();
		try{
		System.out.println(task.equalCaseInSensitive(stringOne,stringTwo));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}

		//task-20
		System.out.println("enter the string:");
		sc.nextLine();
		String inputTwenty=sc.nextLine();
		try{
		System.out.println(task.removeSpacesFromBegAndEnd(inputTwenty));
		}catch(CustomException ex){
		System.out.println("exception occured:"+ex.getMessage());
		}
		
}
}

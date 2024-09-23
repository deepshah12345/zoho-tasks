package com.zoho.task;
import java.util.Scanner;
public class Task{
	Scanner sc=new Scanner(System.in);
	public int findLength(String string){
      	return string.length();
      }
	public char[] charArray(String string){
		return string.toCharArray();
	}
	public char penultimate(String string){
		return string.charAt(string.length()-2);
	}
	public int occurence(String string,char ch){
		char array[]=string.toCharArray();		
		int count=0;
		for(char character:array){
			if(character==ch){
				count++;
			}
		}
		return count;
	}
	public int greatestPosition(String string,char ch){
		return string.lastIndexOf(ch);
	}
      
	public String lastFiveCharacter(String string){
		int length=string.length();
		return string.substring(length-5,length);
	}
	public String firstThreeCharacter(String string){
		return string.substring(0,3);
	}
	public String replaceWithXYZ(String string){
		return string.replace(string.substring(0,3),"XYZ");
	}
	public boolean startsWithEnt(String string){
		return string.startsWith("ent");
	}
	public boolean endsWithLe(String string){
		return string.endsWith("le");
	}
	public String toUpper(String string){
		return string.toUpperCase();
	}
	public String toLower(String string){
		return string.toLowerCase();
	}
	public String reverse(String string){
		String OutputThirteen="";
		char ch13;
		for(int i=0;i<string.length();i++){
			ch13=	string.charAt(i);
			OutputThirteen=ch13+OutputThirteen;
		}
		return OutputThirteen;
	}
	public String noSpace(String string){
		return string.replace(" ","");
	}
	public String[] toStringArray(String string){
		return string.split(" ");
	}
	public  String stringMerge(){
		String output17="";
		for(int i=1;i<=6;i++){
			System.out.println("enter the string"+i+":");
			String input=sc.next();
			if(i==6){
				output17=output17+input;
				break;
			}
		output17=output17+input+"-";
		}
		return output17;
	}
	public boolean equalCaseSensitive(String string1,String string2){
		return string1.equals(string2);
	}

	public boolean equalCaseInSensitive(String string1,String string2){
		return string1.equalsIgnoreCase(string2);
	}
	public String removeSpacesFromBegAndEnd(String string){
		int start=0,end=string.length(),i,j;
		for(i=start;i<end;i++){
			if(string.charAt(i)!=' ')
				break;
		}
		for(j=end-1;j>=0;j--){
			if(string.charAt(j)!=' ')
				break;
		}
		return string.substring(i,j+1);

	}

}
package com.zoho.task;
import com.zoho.exceptions.CustomException;
import java.util.ArrayList;
public class Task{
	public void isNull(String string) throws CustomException{
		if(string==null){
			throw new CustomException("null string is not allowed");
		}
	}
	public void isCharNull (char ch) throws CustomException{
		if(ch=='\u0000'){
			throw new CustomException("null character is not allowed");	
		}
	}
	public void bounds(int index,int l) throws CustomException{
		if(index>l || index<0){
			throw new CustomException("index out of bounds,enter valid input ");	
		}
	}
	public void isContains(String target,String string) throws CustomException{
		if(!string.contains(target)){
			throw new CustomException("target string is not found");
		}
	}	 
	public int findLength(String string) throws CustomException{
		isNull(string);
      	return string.length();
      }
	public char[] charArray(String string) throws CustomException{
		isNull(string);
		return string.toCharArray();
	}
	public char penultimate(String string,int index)throws CustomException{
		
		int length=findLength(string);
		bounds(index,length);
		return string.charAt(index);
	}
	public int occurence(String string,char ch)throws CustomException{
		isNull(string);
		isCharNull(ch);
		char array[]=string.toCharArray();		
		int count=0;
		for(char character:array){
			if(character==ch){
				count++;
			}
		}
		return count;
	}
	public int greatestPosition(String string,char ch)throws CustomException{
		isNull(string);
		isCharNull(ch);
		return string.lastIndexOf(ch);
	}
      
	public String lastNCharacter(String string,int n)throws CustomException{
		
		int length=findLength(string);
		bounds(length-n,length);
		return string.substring(length-n,length);
	}
	public String firstNCharacter(String string,int n)throws CustomException{
	
		int length=findLength(string);
		bounds(n,length);
		return string.substring(0,n);
	}
	public String replaceWithString(String string,String target,String replace)throws CustomException{
		
		isNull(string);
		isNull(target);
		isContains(target,string);
		return string.replace(target,replace);
	}
	public boolean startsWithString(String string,String starts)throws CustomException{
		isNull(string);
		isNull(starts);
		return string.startsWith(starts);
	}
	public boolean endsWithString(String string,String ends)throws CustomException{
		isNull(string);
		isNull(ends);
		return string.endsWith(ends);
	}
	public String toUpper(String string)throws CustomException{
		isNull(string);
		return string.toUpperCase();
	}
	public String toLower(String string)throws CustomException{
		isNull(string);
		return string.toLowerCase();
	}
	public String reverse(String string)throws CustomException{
	
		int length=findLength(string);
		char[] reversedArray = new char[length];
		for (int i = 0; i < length; i++) {
        		reversedArray[i] = string.charAt(length - 1 - i);
            }
		return new String(reversedArray);
	}
	public String noSpace(String string)throws CustomException{
		isNull(string);
		return string.replace(" ","");
	}
	public String[] toStringArray(String string,String str)throws CustomException{
		isNull(string);
		isNull(str);
		return string.split(str);
	}
	public  String stringMerge(ArrayList<String> words,String sequence)throws CustomException{
		isNull(sequence);
		return String.join(sequence,words);
		
	}
	public boolean equalCaseSensitive(String string1,String string2)throws CustomException{
		isNull(string1);
		isNull(string2);
		return string1.equals(string2);
	}

	public boolean equalCaseInSensitive(String string1,String string2)throws CustomException{
		isNull(string1);
		isNull(string2);
		return string1.equalsIgnoreCase(string2);
	}
	public String removeSpacesFromBegAndEnd(String string)throws CustomException{
		isNull(string);
		return string.trim();
	}

}

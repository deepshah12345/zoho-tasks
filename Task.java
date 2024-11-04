package com.zoho.task;
import com.zoho.exceptions.CustomException;
import java.util.List;
public class Task{
	public void checkNull(String string) throws CustomException{
		if(string==null){
			
			throw new CustomException("null string is not allowed");
		}
	}
	public void checkCharNull (char ch) throws CustomException{
		if(ch=='\u0000'){
			throw new CustomException("null character is not allowed");	
		}
	}
	public void checkEmptyArguments(String[] args) throws CustomException{
		 if (args.length == 0) {
       			 throw new CustomException("No arguments passed");
                }
	}
        
	public void checkBounds(int index,int l) throws CustomException{
		if(index>=l || index<0){
			throw new CustomException("index out of bounds");	
		}
	}
	public void contains(String target,String string) throws CustomException{
		checkNull(target);
		checkNull(string);
		if(!string.contains(target)){
			throw new CustomException("target string is not found");
		}
	}	 
	public int findLength(String string) throws CustomException{
		
		checkNull(string);
      		return string.length();
        }
	public char[] charArray(String string) throws CustomException{
		checkNull(string);
		return string.toCharArray();
	}
	public char getCharacterAtIndex(String string,int index)throws CustomException{
		
		int length=findLength(string);
		checkBounds(index,length);
		return string.charAt(index);
	}
	public int getOccurence(String string,char ch)throws CustomException{
		checkNull(string);
		checkCharNull(ch);
		char array[]=string.toCharArray();		
		int count=0;
		for(char character:array){
			if(character==ch){
				count++;
			}
		}
		return count;
	}
	public int getGreatestPosition(String string,char ch)throws CustomException{
		checkNull(string);
		checkCharNull(ch);
		return string.lastIndexOf(ch);
	}
      
	public String getLastNCharacter(String string,int n)throws CustomException{
		
		int length=findLength(string);
		checkBounds(length-n,length);
		return string.substring(length-n,length);
	}
	public String getFirstNCharacter(String string,int n)throws CustomException{
	
		int length=findLength(string);
		checkBounds(n-1,length);
		return string.substring(0,n);
	}
	public String replaceWithString(String string,int n,String stringToReplace)throws CustomException{
		checkNull(string);
		checkNull(stringToReplace);
		return string.replaceFirst(getFirstNCharacter(string,n),stringToReplace);	
	}
	public String replace(String string,String delimiter,String stringToReplace)throws CustomException{
		checkNull(string);
		checkNull(delimiter);
		return string.replace(delimiter,stringToReplace);
	}
	public boolean startsWithString(String string,String starts)throws CustomException{
		checkNull(string);
		checkNull(starts);
		return string.startsWith(starts);
	}
	public boolean endsWithString(String string,String ends)throws CustomException{
		checkNull(string);
		checkNull(ends);
		return string.endsWith(ends);
	}
	public String toUpper(String string)throws CustomException{
		checkNull(string);
		return string.toUpperCase();
	}
	public String toLower(String string)throws CustomException{
		checkNull(string);
		return string.toLowerCase();
	}
	public String reverse(String string)throws CustomException{
	
		int length=findLength(string);
		char[] reversedArray =charArray(string);
		for (int i = 0; i < length/2; i++) {
                   char temp = reversedArray[i];
        		 reversedArray[i] = reversedArray[length - 1 - i];
       		 reversedArray[length - 1 - i] = temp;
        		 
            }
		return new String(reversedArray);
	}
	
	public String[] toStringArray(String string,String str)throws CustomException{
		checkNull(string);
		checkNull(str);
		return string.split(str);
	}
	public  String stringMerge(List<String> words,String sequence)throws CustomException{
		checkNull(sequence);
		return String.join(sequence,words);
		
	}
	public boolean equalCaseSensitive(String string1,String string2)throws CustomException{
		checkNull(string1);
		checkNull(string2);
		return string1.equals(string2);
	}

	public boolean equalCaseInSensitive(String string1,String string2)throws CustomException{
		checkNull(string1);
		checkNull(string2);
		return string1.equalsIgnoreCase(string2);
	}
	public String removeSpacesFromBegAndEnd(String string)throws CustomException{
		checkNull(string);
		return string.trim();
	}

}
package com.zoho.task;
import com.zoho.exceptions.CustomException;
import com.zoho.utility.Utility;
import java.util.List;
public class Task{
	
	//public void contains(String target,String string) throws CustomException{
	//	checkNull(target);
	//	checkNull(string);
	//	if(!string.contains(target)){
	//		throw new CustomException("target string is not found");
	//	}
	//}	 
	public int findLength(String string) throws CustomException{
		
		Utility.checkNull(string);
      		return string.length();
        }
	public char[] getCharArray(String string) throws CustomException{
		Utility.checkNull(string);
		return string.toCharArray();
	}
	public char getCharacterAtIndex(String string,int index)throws CustomException{
		
		int length=findLength(string);
		Utility.checkBounds(index,length);
		return string.charAt(index);
	}
	public int getOccurence(String string,char ch)throws CustomException{
		Utility.checkNull(string);
		Utility.checkCharNull(ch);
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
		Utility.checkNull(string);
		Utility.checkCharNull(ch);
		return string.lastIndexOf(ch);
	}
      
	public String getLastNCharacter(String string,int n)throws CustomException{
		
		int length=findLength(string);
		Utility.checkBounds(length-n,length);
		return string.substring(length-n,length);
	}
	public String getFirstNCharacter(String string,int n)throws CustomException{
	
		int length=findLength(string);
		Utility.checkBounds(n-1,length);
		return string.substring(0,n);
	}
	public String replaceWithString(String string,int n,String stringToReplace)throws CustomException{
		Utility.checkNull(string);
		Utility.checkNull(stringToReplace);
		return string.replaceFirst(getFirstNCharacter(string,n),stringToReplace);	
	}
	public String replace(String string,String delimiter,String stringToReplace)throws CustomException{
		Utility.checkNull(string);
		Utility.checkNull(delimiter);
		return string.replace(delimiter,stringToReplace);
	}
	public boolean startsWithString(String string,String starts)throws CustomException{
		Utility.checkNull(string);
		Utility.checkNull(starts);
		return string.startsWith(starts);
	}
	public boolean endsWithString(String string,String ends)throws CustomException{
		Utility.checkNull(string);
		Utility.checkNull(ends);
		return string.endsWith(ends);
	}
	public String toUpper(String string)throws CustomException{
		Utility.checkNull(string);
		return string.toUpperCase();
	}
	public String toLower(String string)throws CustomException{
		Utility.checkNull(string);
		return string.toLowerCase();
	}
	public String reverse(String string)throws CustomException{
	
		int length=findLength(string);
		char[] reversedArray =getCharArray(string);
		for (int i = 0; i < length/2; i++) {
                   char temp = reversedArray[i];
        		 reversedArray[i] = reversedArray[length - 1 - i];
       		 reversedArray[length - 1 - i] = temp;
        		 
            }
		return new String(reversedArray);
	}
	
	public String[] toStringArray(String string,String str)throws CustomException{
		Utility.checkNull(string);
		Utility.checkNull(str);
		return string.split(str);
	}
	public  String stringMerge(List<String> words,String sequence)throws CustomException{
		Utility.checkNull(sequence);
		return String.join(sequence,words);
		
	}
	public boolean equalCaseSensitive(String string1,String string2)throws CustomException{
		Utility.checkNull(string1);
		Utility.checkNull(string2);
		return string1.equals(string2);
	}

	public boolean equalCaseInSensitive(String string1,String string2)throws CustomException{
		Utility.checkNull(string1);
		Utility.checkNull(string2);
		return string1.equalsIgnoreCase(string2);
	}
	public String removeSpacesFromBegAndEnd(String string)throws CustomException{
		Utility.checkNull(string);
		return string.trim();
	}

}
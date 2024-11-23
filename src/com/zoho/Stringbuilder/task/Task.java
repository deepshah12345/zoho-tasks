package com.zoho.task;
import com.zoho.exceptions.CustomException;
import com.zoho.utility.Utility;
import java.util.List;
public class Task{
      public int findLength(StringBuilder string) throws CustomException{
		
		Utility.checkNull(string);
      		return string.length();
        }

      public void getInsertString(StringBuilder sb,String middle,int offset) throws CustomException{
		Utility.checkNull(middle);
		sb.insert(offset, middle + " ");
	}

	public void getDeleteString(StringBuilder sb,int start,int end) throws CustomException{
		Utility.checkBounds(start,findLength(sb));
		Utility.checkBounds(end-1,findLength(sb));

		sb.delete(start,end);
	}
	public void getReplaceString(StringBuilder sb,int start,int end,String replace) throws CustomException{
		Utility.checkBounds(start,findLength(sb));
		Utility.checkBounds(end-1,findLength(sb));
		sb.replace(start,end,replace);
	}
	public void reverseString(StringBuilder sb) throws CustomException{		
		sb.reverse();
	}
	public int getFirstIndex(StringBuilder sb,String separator)throws CustomException{
		Utility.checkNull(separator);
		Utility.checkNull(sb);
		return sb.indexOf(separator);
	}
	public int getLastIndex(StringBuilder sb,String separator)throws CustomException{
		Utility.checkNull(separator);
		Utility.checkNull(sb);
		return sb.lastIndexOf(separator);
	}
}
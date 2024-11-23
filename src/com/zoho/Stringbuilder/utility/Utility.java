package com.zoho.utility;


import com.zoho.exceptions.CustomException;


public class Utility{
	public static  void checkNull(Object obj) throws CustomException{
		if(obj==null){
			
			throw new CustomException("null value is not allowed");
		}
	}
	public static void checkCharNull (char ch) throws CustomException{
		if(ch=='\u0000'){
			throw new CustomException("null character is not allowed");	
		}
	}
	        
	public static  void checkBounds(int index,int l) throws CustomException{
		if(index>=l || index<0){
			throw new CustomException("index out of bounds");	
		}
	}
}
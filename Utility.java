package com.zoho.utility;


import com.zoho.exceptions.CustomException;


public class Utility{
	public static  void checkNull(String string) throws CustomException{
		if(string==null){
			
			throw new CustomException("null string is not allowed");
		}
	}
	public static void checkCharNull (char ch) throws CustomException{
		if(ch=='\u0000'){
			throw new CustomException("null character is not allowed");	
		}
	}
	public static void checkEmptyArguments(String[] args) throws CustomException{
		//checkNull(args[0]);
		 if (args.length == 0) {
       			// throw new CustomException("No arguments passed");
			// CustomException exception = new CustomException("No arguments passed");
                         //exception.initCause(new IllegalArgumentException("Arguments array is empty"));
                        // throw exception;
			throw new CustomException("Arguments array is empty");
    
                }
	}
        
	public static  void checkBounds(int index,int l) throws CustomException{
		if(index>=l || index<0){
			throw new CustomException("index out of bounds");	
		}
	}
}
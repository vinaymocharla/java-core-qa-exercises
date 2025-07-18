package com.javaPractice.strings;

public class stringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//String declaration and Initialization
		
		String fullName  = "Vinay Mocharla";
		String url = "https://www.payments.amazon.com";
		
		System.out.println(getLastName(fullName));
		System.out.println(getSubDomainName(url));
		
		
		//String Pool
		
		String name = "Vinay";
		String firstName = "Vinay";
		
		String nameN = new String("Vinay");
		String palindromicString = "carac";
		
		
		// reference
		System.out.println(name==firstName); //String pool
		System.out.println(name==nameN);   // not string pool 
		
		//validate values
		
		System.out.println(name.equals(nameN)); 
		
		//reverse of a string using recursion
		
		System.out.println("The reverse of Full Name is: " + reverseString(fullName));
		
		
		//StringPalindrome
		
		if(stringPalindrome(palindromicString)) {
			
			System.out.println("This string is a Palindrome");
		}
		
		
		
	}
	
	
	
	public static String getLastName(String str) {
		
		int index  = str.lastIndexOf(' ');
		
		String lastName  = str.substring(index+1, str.length());
		
		return lastName;
		
		
		
	}
	
	public static String getSubDomainName(String url) {
		
		int firstIndex = url.indexOf(".")+1;
		int lastIndex  = url.indexOf('.',firstIndex+1);
		
		return url.substring(firstIndex, lastIndex);
				
	}
	
	public static String reverseString(String str) {
		
		if(str.isEmpty()) {
			
			return str;
		}
		
		
		
		return reverseString(str.substring(1))+ str.charAt(0);
		
		
	}
	
	public static boolean stringPalindrome(String str) {
		
		int left=0;
		int right= str.length()-1;
		
		while(left<=right) {
			
			if(str.charAt(left)!= str.charAt(right)) {
				
				return false;
			}
			left++;
			right--;
			
		}
		return true;
	}
	

}

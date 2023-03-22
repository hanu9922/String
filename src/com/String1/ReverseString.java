package com.String1;

public class ReverseString {

	public static void main(String[] args) {
		String name="Hanumant";
		int l=name.length();
		System.out.println(l);
        String rev ="";
        for(int i = l-1 ; i>=0 ; i--){
        	rev=rev+name.charAt(i);
        	
        }
        System.out.println(rev);
	}

}

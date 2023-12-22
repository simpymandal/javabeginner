package dataTypesRelated;

import java.util.Arrays;

public class JavaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaStrings javaStrings = new JavaStrings();
		javaStrings.codeDeclarations();
		javaStrings.integerFunc();

	}

	public void codeDeclarations() {
		System.out.println("codeDeclarations");
		String as = "ashok"; // creating String by Java String literal
		String bs = new String("ashok"); // creating String by new keyword
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s1 = new String(ch); // converting char array to string
		// differene

		int lengthch = as.length(); // its the length of string
		System.out.println("To get Lenth:  " + as.length());

		char che = as.charAt(3); // returns a char value at the given index number
		System.out.println(che); // It throws StringIndexOutOfBoundsException

		String s2 = "hello";
		String s3 = "meklo"; // compare the string lexicographically
		System.out.println(s2.compareTo(s3));// returns -5

		System.out.println(s2.substring(2, 4));// returns ll
		System.out.println(s2.substring(2));// returns llo

		System.out.println(as.toLowerCase()); // ashok
		System.out.println(as.toUpperCase()); // ASHOK

		String he = "      Hello World!      ";
		System.out.println(he.trim()); // returns Hello World! -- removes whitespaces

		String oneStr = "hello";
		String twoStr = "Hello";
		System.out.println(oneStr.equals(twoStr)); // false -- compares case too
		System.out.println(oneStr.equalsIgnoreCase(twoStr)); // true-- only compares string

		System.out.println(oneStr.startsWith("h")); // true
		System.out.println(oneStr.startsWith("e", 1)); // true

		System.out.println(oneStr.indexOf("o")); // 4

		String s4 = "Hello World!";
		System.out.println(s4.replace("World", "Universe")); // Hello Universe!

		String[] parts = s4.split(" "); // returns array of strings
		for (String str : parts) {
			System.out.println(str);
		}
		// Hello
		// World!
	


/////////////StringBuffer Class
		StringBuffer strBuffer = new StringBuffer("Hi ");
		strBuffer.append("Everyone");
		System.out.println("StringBuffer Append : "+strBuffer);
	}
	
	
	public void integerFunc() {
		String str = "123";
		int intValue = Integer.parseInt(str);
		System.out.println("Integer : "+(intValue));
		
		int intValue1 = 42;
		Integer integerValue = Integer.valueOf(intValue1);
		System.out.println("integerValue : "+integerValue);
		
		//toString() ---- Integer.toString(intValue);
		//doubleValue() --- integerValue.doubleValue();
		//compareTo()------ x.compareTo(y)
		//equals------ x.equals(y)
		//sum(int a, int b)
		int intValue2 = 42;
		Integer integerValue2 = Integer.valueOf(intValue2);//value to object
		
		Integer integerValue3 = Integer.valueOf(42);
		int intValue3 = integerValue3.intValue();//object to value
	}

}

//Two ways of creating String
//1. String literal
//2. new keyword

//StringBuffer methods -- it is synchronize
// insert(), reverse(), replace(), delete(), capacity()

//StringBuilder -- is non-synchronize otherwise its same as StringBuffer

	

//----------------------------------------------------------
//valueOf and intValue -------------------------------------
//----------------------------------------------------------

//valueOf is used to create an Integer object from an int value.
//intValue is used to retrieve the int value from an Integer object.
//useful in collections


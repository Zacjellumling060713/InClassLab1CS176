package edu.monmouth.lab1;

public class Lab1 {

	public static void main(String[] args) {
		
		// Creating the first object using the default constructor
		Grade object1 = new Grade();
		
		// Displaying the values for object 1
		System.out.println("Object1:");
		System.out.println("Grade Letter: " + object1.getGradeLetter());
		System.out.println("Grade Value: " + object1.getGradeValue());
		System.out.println();
		
		// Creating the five other instances and displaying their values
		Grade object2 = new Grade("A");
		System.out.println("Object2:");
		System.out.println("Grade Letter: " + object2.getGradeLetter());
		System.out.println("Grade Value: " + object2.getGradeValue());
		System.out.println();
		
		Grade object3 = new Grade("B");
		System.out.println("Object3:");
		System.out.println("Grade Letter: " + object3.getGradeLetter());
		System.out.println("Grade Value: " + object3.getGradeValue());
		System.out.println();
		
		Grade object4 = new Grade("C");
		System.out.println("Object4:");
		System.out.println("Grade Letter: " + object4.getGradeLetter());
		System.out.println("Grade Value: " + object4.getGradeValue());
		System.out.println();
		
		Grade object5 = new Grade("D");
		System.out.println("Object5:");
		System.out.println("Grade Letter: " + object5.getGradeLetter());
		System.out.println("Grade Value: " + object5.getGradeValue());
		System.out.println();
		
		Grade object6 = new Grade("");
		System.out.println("Object6:");
		System.out.println("Grade Letter: " + object6.getGradeLetter());
		System.out.println("Grade Value: " + object6.getGradeValue());
		System.out.println();
		
		
		// Question 3
		System.out.println("Question 3:");
		String value = new String("Monmouth University");
		
		// Displaying the length of the string
		System.out.println("Number of characters: " + value.length());
		
		// Displaying the first and last character
		System.out.println("First Character: " + value.charAt(0));
		System.out.println("Last Character: " + value.charAt(value.length() - 1));
		
		
		// Displaying "true" if the third char is uppercase, "false" otherwise
		
		if (Character.isUpperCase(value.charAt(2))) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		// Displaying "digit" if the tenth char is digit, "letter" otherwise
		if (Character.isDigit(value.charAt(9))) {
			System.out.println("digit");
		}
		else {
			System.out.println("letter");
		}
		System.out.println();
		
		
		// Question 4
		System.out.println("Question 4:");
		int sum = 0;
		for (int i = 6; i >= 6 && i <= 14; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
			
		}
		System.out.println("Sum: " + sum);
		System.out.println();
		
		
		// Question 5
		System.out.println("Question 5:");
		String value2 = new String("devlos melborp");
		for (int i = value2.length()- 1; i >= 0; i--) {
			System.out.println(value2.charAt(i));
		}
		
			
		
		

	}

}

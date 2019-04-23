import java.io.*;
import java.util.*;

public class Person {
    private int age,flag=0;	
  
	public Person(int initialAge) {
  		
          // Add some more code to run some checks on initialAge
          age=initialAge;
          if(age<0)
          {
              flag=1;
              age=0;
          }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        if(flag==1 && age==0)
        System.out.println("Age is not valid, setting age to 0.");
        if(age<13)
        System.out.println("You are young.");
        else if(age>=13 && age<18)
        System.out.println("You are a teenager.");
        else
        System.out.println("You are old.");
	}

	public void yearPasses() {
  		age++;  // Increment this person's age.
	}

	public static void main(String[] args) {
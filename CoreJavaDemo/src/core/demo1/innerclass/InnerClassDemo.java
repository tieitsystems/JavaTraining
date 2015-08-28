package core.demo1.innerclass;

import core.inheritance.demo2.Vehicle;

public class InnerClassDemo {
	 AnotherClass test;
	 
	 InnerClass innerClass;
	 
	 
	 //Inner class
	 class InnerClass {
		 
	 }
	 
	 
	 //Demo of Annonymous inner class
	 public void test() {
		 
		 Object obj = new  Vehicle(){ int abc; public int getAbc() {return abc;} };
	 }
 }

 //Another class in a java file
 class AnotherClass {
		
}
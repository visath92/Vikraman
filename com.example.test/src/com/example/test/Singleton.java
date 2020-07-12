package com.example.test;

public class Singleton {
	
	 private static Singleton single = new Singleton();

	   private Singleton(){
	   }
	   public static Singleton getInstance(){
	      return single;
	   }
	   public void showMessage(){
	      System.out.println("Hello World!");
	   }
}
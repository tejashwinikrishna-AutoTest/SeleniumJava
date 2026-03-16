package onlinejavatraining;

public abstract class Abstraction1 {
     static int a=5;//static variable
     int b=5;//global variable
     final int c=10;//final variable

     //abstract method
     public abstract void eat();//since we have used abstract method we don't declare body i.e.,{}


     //Non Abstract Method
     public void a() {
    	 System.out.println("non abstract method");
     }
}

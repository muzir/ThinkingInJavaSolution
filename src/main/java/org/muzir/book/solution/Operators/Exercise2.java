package org.muzir.book.solution.Operators;
//: operators/Exercise2.java
/**
Create a class containing a float and use it to demonstrate aliasing
*/
class Decimal{
	Decimal(float value){
		_value=value;
	}
	float _value; 
}
public class Exercise2{
	public static void main(String [] args){
		Decimal decimal1=new Decimal(2.20f);
		Decimal decimal2=new Decimal(5.80f);
		System.out.println("Before aliasing decimal1:" + decimal1._value);
		System.out.println("Before aliasing decimal2:" + decimal2._value);
		decimal1=decimal2;
		System.out.println("After aliasing decimal1:"+ decimal1._value);
		System.out.println("After aliasing decimal2:"+ decimal2._value);
		decimal2._value=3.40f;
		System.out.println("After assignment decimal1:"+decimal1._value);
		System.out.println("After assignment decimal2:"+decimal2._value);
	}
}



package com.test.jacoco;

import javax.imageio.event.IIOReadWarningListener;
import java.util.Arrays;
import java.util.Vector;


public class HelloWorld {
    public HelloWorld() {

    }

    public String Method1() {
        return "Hello World";
    }

    public int Method2(int a, int b) {
        return a + b;
    }
    
    public int Method3(int a, int b, int c){
    	if((a>5&&b<0)||c>0) {
    		System.out.println("Condition 1");
    	}
    	else if(a<5 && c<-2 ) {
    		System.out.println("Condition 2");
    	}
    	else {
    		System.out.println("Condition 3");
    	}
    	return 0;
    }
    public int Method4(int a, int b, int c, int d, float e) {
    	if(a == 0) {
    		return 0;
    	}
    	int x = 0;
    	if((a == b) || ((c == d) && (bug(a)))) {
			 x = 1;
    	}
    	e = 1/x;
    	return 0;
    }
    public boolean bug(int a) {
    	if(a == 5) return true;
    	return false;
    }
    
    
    public boolean isTriangle(int a, int b, int c) {
    	/**
    	 * TODO: You need to complete this method to determine whether  a
    	 * triangle is formed or not when given the input edge a, b and c.
    	 */
    	if(a <= 0){
    		return false;
		}
    	if(b <= 0){
    		return false;
		}
    	if(c <= 0){
    		return false;
		}
		int[] myArray = {a, b, c};
		Arrays.sort(myArray);
		// not use add but use minus
		if(myArray[2]-myArray[1]>myArray[0]){
			return true;
		}else{
			return false;
		}
    }
    public boolean isBirthday(int year, int month, int day) {
    	/**
    	 * TODO: You need to complete this method to determine whether a 
    	 * legitimate date of birth between 1990/01/01 and 2019/10/01 is 
    	 * formed or not when given the input year, month and day.
    	 */
    	if(1990 > year || year > 2019){
    		return false;
		}
    	if(month < 1 || month >12){
    		return false;
		}
    	if(day < 1)
    		return false;
    	if(month == 2) {
			if (year % 4 == 0 && year % 100 != 0) {
				if (day > 29) {
					return false;
				}
			} else {
				if (day > 28) {
					return false;
				}
			}
		}
    	else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
    		if(day > 31){
    			return false;
			}
		}else{
    		if(day > 30){
    			return false;
			}
		}
    	//up bound
		if(year == 2019){
			if(month > 10)
				return false;
			else if(month == 10){
				if(day != 1){
					return false;
				}
			}else{

			}
		}
		return true;
    }
    public Double miniCalculator(double a, double b, char op) throws Exception {
    	/**
    	 * TODO: You need to complete this method to form a small calculator which 
    	 * can calculate the formula: "a op b", the op here can be four basic  
    	 * operation: "+","-","*","/". 
    	 */
    	double result = 0.0;
    	switch (op){
			case '+':
				result = a + b;
				if(result - a != b)
					throw new Exception("add overflow");
				break;
			case '-':
				result = a - b;
				if(result + b != a)
					throw new Exception("minus overflow");
				break;
			case '*':
				result = a * b;
				if(result / a != b)
					throw new Exception("multiply overflow");
				break;
			case '/':
				if(b == 0)
					throw new Exception("divide zero error");
				result = a / b;
				if(result * b != a){
					throw new Exception("divide overflow");
				}
				break;
			default:
				throw new Exception("no such operation");
		}
    	return result;
    }
}

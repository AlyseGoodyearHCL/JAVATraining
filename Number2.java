package com.alyse.controller.Day7;

import java.util.Comparator;

//comparable and comparator

public class Number2 {
	//comparable  
	private String spaceshipClass = null;
    private String registrationNo = null;

    public Number2(String spaceshipClass, String registrationNo) {
        this.spaceshipClass = spaceshipClass;
        this.registrationNo = registrationNo;
    }

    public int compareTo(Number2 other) {
        int spaceshipClassComparison = this.spaceshipClass.compareTo(other.spaceshipClass);

        if(spaceshipClassComparison != 0) {
            return spaceshipClassComparison;
        }
        
        return this.registrationNo.compareTo(other.registrationNo);
    }
    
    //comparator
    int rollNum;  
    String name, address;  
    public Number2(int rollNum,String name, String address){  
	    this.rollNum = rollNum;  
	    this.name = name;
	    this.address = address;
    } 
    
    public String toString() {
    	return this.rollNum + " " + this.name + " " + this.address;
    }
    
    class Sortbyroll implements Comparator<Number2> {
        public int compare(Number2 a, Number2 b){
            return a.rollNum - b.rollNum;
        }
    }
}

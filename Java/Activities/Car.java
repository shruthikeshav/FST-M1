package com.IBM.mavenproject;

public class Car {
    //Class Member Variables
    String color;
    int make;
    String transmission;
    int tyres;
    int doors;
	
    //Constructor
    Car() {
	tyres = 4;
	doors = 4;
    }

    //Class Methods
    public void displayCharacteristics(){
	System.out.println("Car color: " + color);
	System.out.println("Car Make: " + make);
	System.out.println(" Car Transmission " + transmission);
	System.out.println("Car number of Doors " + doors);
    	System.out.println("Car Tyres: " + tyres);
    }

    public void accelerate() {
	System.out.println("Car is moving forward.");
    }
	
    public void brake() {
	System.out.println("Car has stopped.");
    }
}
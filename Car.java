package helloWorld;
import java.util.*;

public class Car {
	private String model;
	private String make;
	
	public Car (String model, String make) {
		this.model = model;
		this.make = make;
	}
	//getters and setters 
	public String getModel() {
		return this.model;
	}
	public String getMake() {
		return this.make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String toString() {
		return this.make; 
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Create hash map 
		HashMap<String, Car> cars = new HashMap<>();
		//Create car objects
		Car Honda = new Car("Civic", "Honda");
		Car Toyota = new Car("Camry", "Toyota");
		Car BMW = new Car("BMW i8", "BMW");
		Car Ford = new Car("Fiesta", "Ford");
		
		//key = model
		//value = make
		cars.put(Honda.getModel(), Honda);
		cars.put(Toyota.getModel(), Toyota);
		cars.put(BMW.getModel(), BMW);
		cars.put(Ford.getModel(), Ford);
		
		//get a set containing the mappings 
		Set<Map.Entry<String, Car>> carMap = cars.entrySet();
		
		/*
		//iterate through
		for(Map.Entry<String, Car> entry : carMap) {
			System.out.println("Key: " + entry.getKey());
			System.out.println("Value: " + entry.getValue());
			//System.out.println(cars.toString());
			System.out.println();
		}
		*/
		System.out.println("What car model are you looking for? ");
		String name = keyboard.nextLine();
		//search for car model name if its in the hashmap
		//CASE SENSITIVE
		if (cars.get(name) != null) {
			System.out.println("We have some right here! The make is " + cars.get(name) + ".");
		}
		else {
			System.out.println("We don't have those, sorry.");
		}
	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//create hash map to store car objects
		
		/**
		Map<String, String> cars = new HashMap<>();
		
		//add car objects
		cars.put("2010 Civic", "Honda");
		cars.put("2000 Camry", "Toyota");
		cars.put("2021 BMW i8", "BMW");
		
		System.out.println("Total Vehicles: " + cars.size());
		
		//iterate over all the vehicles
		//key = model
		//value = make
		for(Map.Entry car : cars.entrySet()) {
			System.out.println("I have a " + car.getKey() + " " + car.getValue());
		
		
		}
		**/
	


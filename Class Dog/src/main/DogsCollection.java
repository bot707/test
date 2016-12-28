package main;

import java.util.ArrayList;
import java.util.Scanner;

public class DogsCollection {

	public static void main(String[] args){
		ArrayList<Dog> dogsCollection = new ArrayList<Dog>();
		
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter number of dogs and names for as many dogs as you wants (divided by space)\n");
		String input = in.nextLine();
		in.close();
		String[] names = input.split("\\s+");
		int numberOfNames = names.length -1;
		try{
			int numberOfDogs = Integer.parseInt(names[0]);
			for(int i = 0; i < numberOfDogs; i++){
				if(i + 1 <= numberOfNames)
					dogsCollection.add(new Dog(names[i + 1],null, null));
				else
					dogsCollection.add(new Dog(null,null,null));
			}
			printingDogsInfo(dogsCollection);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
	
	private static void printingDogsInfo(ArrayList<Dog> dogs){
		for(Dog dog : dogs){
			System.out.println(dog.toString());
		}
	}

}

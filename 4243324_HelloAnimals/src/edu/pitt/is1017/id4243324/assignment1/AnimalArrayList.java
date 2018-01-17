package edu.pitt.is1017.id4243324.assignment1;

import java.util.ArrayList;

public class AnimalArrayList {

	public static void main(String[] args) {
		Dog dog = new Dog("5", "Yellow", "Labrador", 70, 55);
		Penguin penguin = new Penguin("8","Black&White","Emperor Penguin",50,40);
		Salmon salmon = new Salmon("3","Silver","Atlantic Salmon",55,45);
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(dog);
		animals.add(penguin);
		animals.add(salmon);
		
		for(Animal animal : animals) {
			System.out.println(animal.getWeight());
		}
    }
}

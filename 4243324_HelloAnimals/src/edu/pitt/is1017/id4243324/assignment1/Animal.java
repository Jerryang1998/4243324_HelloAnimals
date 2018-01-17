package edu.pitt.is1017.id4243324.assignment1;

public class Animal {
	private String age;
	private String color;
	private String type;
	private int weight;
	private int minimumWeight;
	
	public Animal(String age,String color,String type,int weight,int minimumWeight) {
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
}
	
	public void eat() {
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void output() {
		System.out.println();
	}

}
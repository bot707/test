package main;

import java.util.Random;

public class Dog {
	private String name;
	private enum Size{
		small,
		big,
		medium
	}
	private short age;
	private Size size;
	
	Dog(){
		Random random = new Random();
		this.name = nameGenerating();
		this.size = Size.values()[random.nextInt(3)];
		this.age =(short)random.nextInt(20);
	}

	Dog(String name, String size, Short age){
		Random random = new Random();
		this.name = name == null ? nameGenerating() : name;
		this.size = size == null ? Size.values()[random.nextInt(3)] : Size.valueOf(size);
		this.age = age == null ? (short)random.nextInt(20) : age;
	}
	
	private String nameGenerating(){
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int length = random.nextInt(10) + 1;
		char c = ' ';
		for (int i = 0; i < length; i++) {
		    c = chars[random.nextInt(chars.length)];
		    if(i == 0)
		    	c = Character.toUpperCase(c);
		    sb.append(c);
		}
		
		return sb.toString();	
	}

	public String toString(){
		return this.name + " " + this.size.toString() + " " + this.age;
	}
	
}

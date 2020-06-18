package day11work;

import java.util.Scanner;

public class Movie {
	
	int id;
	String name;
	float duration;
	
	Scanner scanner;
	
	//default
	
	Movie(){
		
		scanner = new Scanner(System.in);
		
	}
	//overloaded constructors
    Movie(String name,float duration){
    	
    	scanner = new Scanner(System.in);
		this.name = name;
		this.duration = duration;
		
	}
    
 Movie(int id,String name,float duration){
		
	     scanner = new Scanner(System.in);
	    this.id = id;
		this.name = name;
		this.duration = duration;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	
void getMovieDetails() {
		
		System.out.println("please enter the movie id");
		id = scanner.nextInt();
		scanner.nextLine();//flush panradhuku to move to next string
		System.out.println("please enter the movie name");
		name = scanner.nextLine();
		System.out.println("please enter the movie duration");
		duration = scanner.nextFloat();
	}
@Override
	
public String toString() {
	
	return "Movie ID" +id+"name"+name+"duration"+duration;
}
@Override

public boolean equals(Object obj) {
	
	Movie m2 = (Movie)obj;
	Movie m1 = this;
	if(m1.getName().equals(m2.getName()) && m1.getDuration()==m2.getDuration())
		return true;
	else
		return false;
}
}

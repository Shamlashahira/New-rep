package day9assign;

public class Employee {

	public int id, age;
    public String name, phno;
    
    public Employee(){}
    public Employee(int id, String name, String phno, int age){
        this.id = id;
        this.name = name;
        this.phno = phno;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println(id + "\n" + name + "\n" + phno + "\n" + age);
    }
}

package day10assign;

public class Bank1 {

	 String number,name;
     int id;
     Bank1 (String name,String number, int id)
    {
    	 this.name=name;
    	 this.number=number;
    	 
         
         this.id=id;
    }
    @Override
    public String toString() {
       return "Name is: "+this.name+" & number is: "+this.number+" & id is: "+this.id;
    }
}

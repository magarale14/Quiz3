
public class Fitness {
	
	
	public static void main(String args[]){
			
	    
		Person Person1 = new Person("Tom","H",152.5,5,6); //Person (String firstName, Char lastNameInitial, double weight, int feet, int inches)
				
		Person Leslie = new Person("Leslie","Knope",'K',32,122.9,4,11); //Person(String firstName,String lastName,char lastNameInitial,int age, double weight,int feets, int inches ){
	    
				    
		Person man = new Person("Ron","Swanson",222.2,6,0);// Person(String firstName, String lastName, double weight, int feet, int inches)
					
		Person woman = new Person("April","Ludgate",110.5,5,5); // Person(String firstName, String lastName, double weight, int feet, int inches)
		
		System.out.println(Person1.getFirstName() +": "  + Person1.calculatBMI());
	   System.out.println(Leslie.getFirstName()+": " + Leslie.calculatBMI());
	   System.out.println(man.getFirstName()+": " + man.calculatBMI());
	   System.out.println(woman.getFirstName()+": " + woman.calculatBMI());
			    
		
	}
}

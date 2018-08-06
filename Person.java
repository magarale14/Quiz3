
public class Person {
 //Declaring all the attribute
	
	private String firstName;
	private String lastName;
	private char lastNameInitial;
	private int age;
	private double weight;
	private int feets;
	private int inches;
	
	//Constructing constructors
	Person(String firstName,String lastName,char lastNameInitial,int age, double weight,int feets, int inches ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastNameInitial = lastNameInitial;
		this.age = age;
		this.weight = weight;
		this.feets = feets;
		this.inches = inches;
	}
		

	Person(String firstName,String lastName,double weight,int feets, int inches ){
			this.firstName = firstName;
			this.lastName = lastName;
			this.weight = weight;
			this.feets = feets;
			this.inches = inches;
			
	}
	Person(String firstName,char lastNameInitial,double weight,int feets, int inches ){
				this.firstName = firstName;
				this.lastNameInitial = lastNameInitial;
				this.weight = weight;
				this.feets = feets;
				this.inches = inches;
						
		
	}
	
	public String toString(){
		return ("firstname: " + this.firstName + "\n" + "lastName: " +this.lastName + "\n" + "lastNameInitial: " + this.lastNameInitial + "\n" + "age: " + this.age + "\n" + "weight: " + this.weight + "\n" + "feets : " + this.feets + "\n" + "inches : "+ this.inches + "\n");
	}
 // Declaring methods
	
    String calculatBMI(){
	
	int HeightInInches = ( this.feets *12)+ this.inches;
	double BMI = ((this.weight * 703) / (HeightInInches * HeightInInches));	
	String bmiLevel;	
		
 if (BMI < 18.5){ 
		bmiLevel = "Underweight";
	}
 
 else if (BMI > 18.5 && BMI < 24.9){
	 bmiLevel = "Normal";
 }
 
else if (BMI > 25 && BMI < 29.9){
		bmiLevel = "Overweight";
}

else 
{
	bmiLevel = "Obese";
}
	return BMI + ":" + bmiLevel;
	
}
  
  // Using Getters and Setter 
    
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public char getLastNameInitial() {
		return lastNameInitial;
	}


	public void setLastNameInitial(char lastNameInitial) {
		this.lastNameInitial = lastNameInitial;
	}


	public int getAge() {
		return age;
	}
		


	public void setAge(int age) {
		this.age = age;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public int getFeets() {
		return feets;
	}


	public void setFeets(int feets) {
		this.feets = feets;
	}


	public int getInches() {
		return inches;
	}


	public void setInches(int inches) {
		this.inches = inches;
	}
	

}
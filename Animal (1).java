public class Animal extends java.lang.Object{
	private java.lang.String name;
	private int birthYear;
	private double weight;
	private char gender;
	public Animal(){
		this.name = "";
		this.birthYear = 1900;
		this.weight = 0.0;
		this.gender = 'u';
	}
	public Animal(java.lang.String name,int birthYear,double weight,char gender) {
		if(weight < 0.0) {
			this.weight = -1.0;
		}
		if(this.gender != 'f' && this.gender != 'm' && this.gender == 'u') {
			this.gender = 'u';
		}
		else {
			this.name = name;
			this.birthYear = birthYear;
			this.weight = weight;
			this.gender = gender;
		}
	}
	int calculateAge(int currentYear) {
		if(birthYear>currentYear) {
			return -1;
		}
		else {
			return currentYear - birthYear;
		}
	}
	void gainWeight() {
		if(this.weight+1>=0.0) {
			weight = weight+1;

		}
	}
	void gainWeight(double weight) {
		if(this.weight*weight >= 0.0) {
			this.weight = this.weight * weight;
		}
	}
	int getBirthYear() {
		return this.birthYear;
	}
	char getGender() {
		return this.gender;
	}
	java.lang.String getName(){
		return this.name;
	}
	double getWeight() {
		return this.weight;
	}
	boolean isFemale() {
		if(this.gender == 'f') {
			return true;
		}
		else {
			return false;
		}
	}
	boolean isMale() {
		if(this.gender == 'm') {
			return true;
		}
		else {
			return false;
		}
		
	}
	void loseWeight() {
		if(this.weight-1 >= 0.0) {
			this.weight = this.weight-1;	
		}
	}
	void loseWeight(double weight) {
		if(this.weight - weight >= 0.0) {
			this.weight = this.weight - weight;
		}
	}
	void printDetails() {
		System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n",getName(),getBirthYear(),getWeight(),getGender());
	}
	void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	void setGender(char gender) {
		if(gender != 'm'&& gender != 'f' || gender == 'u') {
			this.gender = 'u';
		}
		else {
			this.gender = gender;
		}
	}
	void setName(java.lang.String name) {
		this.name = name;
	}
	void setWeight(double weight) {
		if(weight < 0.0) {
			this.weight = -1;
		}
		else {
			this.weight = weight;
		}
	}
}
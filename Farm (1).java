public class Farm extends java.lang.Object{
	private java.lang.String farmName;
	private Animal[] animals;
	private int numAnimals;
	public Farm() {
		animals = new Animal[10];
		farmName = "";
		numAnimals = 0;
	}
	public Farm(java.lang.String farmName) {
		this.farmName = farmName;
	}
	public Farm(int maxAnimals) {
		if(maxAnimals < 0) {
			animals = new Animal[0];
		}
		else {
			animals = new Animal[maxAnimals];
		}
	}
	public Farm(java.lang.String farmName,int maxAnimals) {
		if(maxAnimals < 0) {
			animals = new Animal[0];
			this.farmName = farmName;
		}
		else {
			animals = new Animal[maxAnimals];
			this.farmName = farmName;
		}
	}
	public void setFarmName(java.lang.String name) {
		farmName = name;
	}
	public java.lang.String getFarmName(){
		return farmName;
	}
	public void resizeAnimalArray() {
		Animal[] CopyArray = new Animal[animals.length * 2];;
		for(int i=0;i<animals.length;i++) {
			CopyArray[i] = animals[i];
		}
		animals = CopyArray;
	}
	public void addAnimal(Animal a) {
		if(animals[animals.length - 1] == null) {
			for(int i=0;i<animals.length;i++) {
				if(animals[i] == null) {
					animals[i] = a;
					numAnimals = numAnimals + 1;
					break;
				}
			}
		}
		else {
			resizeAnimalArray();
			for(int i=0;i<animals.length;i++) {
				if(animals[i] == null) {
					animals[i] = a;
					numAnimals = numAnimals + 1;
					break;
				}
			}
		}
	}
	public Animal getAnimal(int index) {
		if(index > 0 && index < numAnimals) {
			return animals[index];
		}
		else {
			return null;
		}
	}
	public int getNumAnimals() {
		return numAnimals;
	}
	public Animal getFirstAnimal() {
		if(numAnimals == 0) {
			return null;
		}
		else {
			return animals[0];
		}
	}
	public Animal getLastAnimal() {
		if(numAnimals == 0) {
			return null;
		}
		else {
			return animals[numAnimals - 1];
		}
	}
	public Animal[] getAnimals(){
		return animals;
	}
	public Animal removeAnimal(int index) {
		Animal RemovedAnimal = getAnimals()[index];
		if(index >= 0 && index <numAnimals) {
			Animal[] newAnimalArray = new Animal[numAnimals - 1];
			for(int i=0;i<numAnimals;i++) {
				if(i<index){
					newAnimalArray[i] = getAnimals()[i];
				}
				else if(i>index) {
					newAnimalArray[i-1] = getAnimals()[i];
				}
			}
			numAnimals = numAnimals - 1;
			animals = newAnimalArray;
		}
		return RemovedAnimal;
	}
	public void removeAllAnimals() {
		animals = new Animal[0];
		numAnimals = 0;
	}
	public double getTotalWeightOfAllAnimals() {
		double sum = 0.0;
		for(Animal animal:getAnimals()) {
			sum = sum + animal.getWeight();
		}
		return sum;
	}
	public double getAverageWeightOfAllAnimals() {
		double sum = 0.0;
		for(Animal animal:getAnimals()) {
			sum = sum + animal.getWeight();
		}
		return sum / numAnimals;
	}
	public int getNumberOfAnimalsAboveWeight(double weight) {
		int numAboveWeight = 0;
		for(Animal animal:getAnimals()) {
			if(animal.getWeight() > weight) {
				numAboveWeight = numAboveWeight + 1;
			}
		}
		return numAboveWeight;
	}
	public int getNumberOfAnimalsBelowWeight(double weight) {
		int numBelowWeight = 0;
		for(Animal animal:animals) {
			if(animal.getWeight() < weight) {
				numBelowWeight = numBelowWeight + 1;
			}
		}
		return numBelowWeight;
	}
	public void increaseWeightOfAllAnimals() {
		for(Animal animal:animals) {
			animal.gainWeight();
		}
	}
	public void increaseWeightOfAllAnimals(double weight){
		for(Animal animal:animals) {
			animal.gainWeight(weight);
		}
	}
	public void printAllDetails() {
		System.out.printf("FarmName: %20s | Number of Animals: %4d | Farm Size: %4d\n",getFarmName(),getNumAnimals(),animals.length);
		Animal[] animalArray = getAnimals();
		for(int i=0;i<getNumAnimals();i++){
			animalArray[i].printDetails();
		}
	}
}


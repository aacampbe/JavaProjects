public class Driver {
	public static void main(String[] args){
		Farm farm = new Farm("farm of ten",10);
		// First Animal
		Animal a1 = farm.getAnimals()[0] = new Animal();
		farm.addAnimal(a1);
		a1.setName("cow");
		a1.setBirthYear(2012);
		a1.setWeight(1000.5);
		a1.setGender('f');
		//Second Animal
		Animal a2 = farm.getAnimals()[1] = new Animal();
		farm.addAnimal(a2);
		a2.setName("pig");
		a2.setBirthYear(2009);
		a2.setWeight(550.5);
		a2.setGender('m');
		// Third Animal
		Animal a3 = farm.getAnimals()[2] = new Animal();
		farm.addAnimal(a3);
		a3.setName("donkey");
		a3.setBirthYear(1999);
		a3.setWeight(773.42);
		a3.setGender('m');
		//Fourth Animal 
		Animal a4 = farm.getAnimals()[3] = new Animal();
		farm.addAnimal(a4);
		a4.setName("sheep");
		a4.setBirthYear(2016);
		a4.setWeight(164.23);
		a4.setGender('f');
		//Fifth Animal 
		Animal a5 = farm.getAnimals()[4] = new Animal();
		farm.addAnimal(a5);
		a5.setName("goose");
		a5.setBirthYear(2004);
		a5.setWeight(10.75);
		a5.setGender('f');
		farm.printAllDetails();
	}
}


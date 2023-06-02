package Fenyuk.Animal;

public class Application {

	public static void main(String[] args) {
	 
		Animal animal = new Animal("Леопард",20,7);
		
		animal.parametersAnimal(animal.getName(), animal.getSpeed(), animal.getAge());
		
		animal.setName("Бык");
		animal.setSpeed(2);
		animal.setAge(14);
		
		animal.parametersAnimal(animal.getName(), animal.getSpeed(), animal.getAge());

	}

}

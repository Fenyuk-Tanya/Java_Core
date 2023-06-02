package Fenyuk;

public class Robot {
	
	private String name;
	private String acts;
	
	Robot(String name,String acts){
		this.name = name;
		this.acts = acts;
	}
	
	public void work () {
		System.out.println("Я " + this.name + " - я " + this.acts);
	}



	@Override
	public String toString() {
		return "Robot [name=" + name + ", acts=" + acts + "]";
	}

	
	
	
}
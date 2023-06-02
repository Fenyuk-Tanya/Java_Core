package Fenyuk;

public class Application {

	public static void main(String[] args) {
		
	Robot r = new Robot("Robot","просто працюю");
	r.work();
    System.out.println(r);
	
	CoffeRobot cr = new CoffeRobot("CoffeRobot ","варю каву");
	cr.work();
    System.out.println(cr);
		
    RobotDancer rd = new RobotDancer("RobotDancer ","просто танцюю");
	rd.work();
	System.out.println(rd);
			
	RobotCoocker rc = new RobotCoocker("RobotCoocker","просто готую");
	rc.work();
	System.out.println(rc);
	
	System.out.println();
	
	Robot [] robotArray = new Robot [4];
	robotArray[0] = r;
	robotArray[1] = cr;
	robotArray[2] = rd;
	robotArray[3] = rc;
	
	for (int i = 0; i<robotArray.length; i++){
        robotArray[i].work();
	}
	
	
	}

}

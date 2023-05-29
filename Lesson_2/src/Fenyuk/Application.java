package Fenyuk;

public class Application {

	public static void main(String[] args) {
		
		Rectangle Perimeter1= new Rectangle();
		
		Rectangle Perimeter= new Rectangle(30,20);
		
		Rectangle Square1= new Rectangle();
		
		Rectangle Square = new Rectangle(30,20);
		
		
		
		System.out.println(Perimeter1);
		
		System.out.println(Square1);
		
		System.out.println("Периметр прямокутника = " + Perimeter.Perimeter());
		
		System.out.println("Площа прямокутника = " + Square.Square());
		
		
		Circle Length = new Circle (15,25);
		
		Circle SquareC = new Circle (15,25);
		
		System.out.println("Довжина кола = " + Length.Length());
		
		System.out.println("Площа кола = " + SquareC.SquareC());
		
		
		
	}

}

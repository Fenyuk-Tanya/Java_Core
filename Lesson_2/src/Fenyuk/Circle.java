package Fenyuk;

public class Circle {

		   private double radius;
		   private double diameter;
		   
		   public Circle(double radius, double diameter) {
				this.radius = radius;
				this.diameter = diameter;
			}

		    public double Length () {
		    	double length = 3.14 * diameter ;
		    	return length;
		    }
		    
		    public double SquareC () {
		    	double SquareC = 3.14 * (radius * radius);
		    	return SquareC;
		    }

			public String toString() {
				return "Circle [radius=" + radius + ", diameter=" + diameter + "]";
			}
		   
		   
		   

}

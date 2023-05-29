package Fenyuk;

public class Rectangle {
	private int width;
	private int height;
	private int Perimeter;
	private int Square;
    
	public Rectangle() {
		this.width = 30;
		this.height = 20;
		
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

    public int Perimeter () {
    	int Perimeter = 2*(width + height);
    	return Perimeter;
    }
    
    public int Square () {
    	int Square = width * height;
    	return Square;
    }

	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", Perimeter=" + Perimeter + ", Square=" + Square
				+ "]";
	}
    
}



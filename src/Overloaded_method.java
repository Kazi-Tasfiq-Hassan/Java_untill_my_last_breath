class AreaCalculator{

    public double Calculate_area(int side){ //I didn't use only void in this method because void means it doesn't return anything. But my code is returning value.
        return side*side; //Area of square
    }
   public double Calculate_area(double length, double width){
        return length * width; // Area of Rectangle
    }
    public double Calculate_area(double radius){
        return 3.1416 * radius * radius;
    }
}
public class Overloaded_method {
    public static void main(String[] args){
        AreaCalculator calc = new AreaCalculator();
        double Square_area = calc.Calculate_area(5);
        System.out.println("The area of the Square is " + Square_area);
        double Rectangle_Area = calc.Calculate_area(5,6);
        System.out.println("The Area of the Rectangle is " + Rectangle_Area);
        double Area_of_Circle = calc.Calculate_area(5.5);
        System.out.println("The Area of the Circle is " + Area_of_Circle);

    }
}

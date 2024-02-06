public class MyRectangleTest {
    public static void main(String[] args) 
    {
        MyPoint topLeft = new MyPoint(2, 4);
        MyPoint bottomRight = new MyPoint(6, 1);

        MyRectangle rectangle1 = new MyRectangle(topLeft, bottomRight);
        System.out.println("Rectangle 1:");
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimetee: " + rectangle1.getPerimeter());
        System.out.println(rectangle1);

        MyRectangle rectangle2 = new MyRectangle(1, 3, 5, 0);
        System.out.println("\nRectangle 2:");
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println(rectangle2);
    }
}
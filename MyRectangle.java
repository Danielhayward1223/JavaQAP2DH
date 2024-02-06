public class MyRectangle {
    private MyPoint topLeft = new MyPoint();
    private MyPoint bottomRight = new MyPoint();

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) 
    {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) 
    {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyPoint getTopLeft() 
    {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) 
    {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() 
    {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) 
    {
        this.bottomRight = bottomRight;
    }

    public double getArea() 
    {
        double width = bottomRight.getX() - topLeft.getX();
        double height = topLeft.getY() - bottomRight.getY();
        return (width * height);
    }

    public double getPerimeter() 
    {
        double width = bottomRight.getX() - topLeft.getX();
        double height = topLeft.getY() - bottomRight.getY();
        return 2 * (width + height);
    }

    public String toString() 
    {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}

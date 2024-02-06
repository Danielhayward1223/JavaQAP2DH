public class MyLineTest {
    public static void main(String[] args) {

        MyLine line1 = new MyLine(2, 3, 7, 6);
        System.out.println("Line 1: " + line1.toString());
        System.out.println("Coords of beginning line 1: " + line1.getBegin());
        System.out.println("Coords of end line 1: " + line1.getEnd());

        line1.setBegin(new MyPoint(2, 2));

        line1.setEnd(new MyPoint(6, 6));

        System.out.println("Updated beginning of line 1: " + line1.getBegin());
        System.out.println("Updated end of line 1: " + line1.getEnd());

        System.out.println("Beginning X of line 1: " + line1.getBeginX());
        System.out.println("Beginnign Y of line 1: " + line1.getBeginY());

        System.out.println("End X of line 1: " + line1.getEndX());
        System.out.println("End Y of line 1: " + line1.getEndY());

        line1.setBeginX(3);
        line1.setBeginY(5);
        line1.setEndX(7);
        line1.setEndY(9);

        System.out.println("Updated Beginning X of line 1: " + line1.getBeginX());
        System.out.println("Updated Beginning Y of line 1: " + line1.getBeginY());
        System.out.println("Updated End X of line 1: " + line1.getEndX());
        System.out.println("Updated End Y of line 1: " + line1.getEndY());

        System.out.println("BeginXY of line 1: " + line1.getBeginXY());
        line1.setBeginXY(1, 1);
        System.out.println("Updated BeginXY of line 1: " + line1.getBeginXY());

        System.out.println("EndXY of line 1: " + line1.getEndXY());
        line1.setEndXY(10, 10);
        System.out.println("Updated EndXY of line 1: " + line1.getEndXY());

        System.out.println("Length of line 1: " + line1.getLength());

        System.out.println("Gradient of line 1: " + line1.getGradient());
    }
}
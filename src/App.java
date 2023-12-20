import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Line Comparison Problem ");

        Line line1 = getLineInput(scanner);
        System.out.println(line1);
        System.out.println("Length : " + line1.calculateLength());

        Line line2 = getLineInput(scanner);
        System.out.println(line2);
        System.out.println("Length : " + line2.calculateLength());

        if (line1.equals(line2))
            System.out.println("Line1 is equal to Line2");
        else
            System.out.println("Line1 is not equal to Line2");

        double lineCompare = line1.compareTo(line2);
        if (lineCompare == 0)
            System.out.println("Line1 Length is equal to Line2 length");
        else if (lineCompare > 0)
            System.out.println("Line1 Length is grater Than to Line2 length");
        else
            System.out.println("Line1 Length is Smaller Than to Line2 length");

        scanner.close();
    }

    public static Line getLineInput(Scanner scanner) {
        double x1, y1, x2, y2;

        System.out.print("Enter Point1 X coordinate  : ");
        x1 = scanner.nextInt();
        System.out.print("Enter Point1 Y coordinate  : ");
        y1 = scanner.nextInt();
        System.out.print("Enter Point2 X coordinate  : ");
        x2 = scanner.nextInt();
        System.out.print("Enter Point2 Y coordinate  : ");
        y2 = scanner.nextInt();
        Line line = new Line(new Point(x1, y1), new Point(x2, y2));

        return line;
    }

}

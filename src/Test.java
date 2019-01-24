import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Wprowadź x1");
        double x1 = scanner.nextDouble ();
        System.out.println ("Wprowadź y1");
        double y1 = scanner.nextDouble ();
        Point A = new Point (x1,y1);

        System.out.println ("Wprowadź x2");
        double x2 = scanner.nextDouble ();
        System.out.println ("Wprowadź y2");
        double y2 = scanner.nextDouble ();
        Point B = new Point (x2,y2);

        Line line1 = new Line (A,B);


        System.out.println ("Wprowadź x3");
        double x3 = scanner.nextDouble ();
        System.out.println ("Wprowadź y3");
        double y3 = scanner.nextDouble ();
        Point C = new Point (x3,y3);

        System.out.println ("Wprowadź x4");
        double x4 = scanner.nextDouble ();
        System.out.println ("Wprowadź y4");
        double y4 = scanner.nextDouble ();
        Point D = new Point (x4,y4);

        Line line2 = new Line (C,D);

        Calculate calculate = new Calculate ();
        if(line1.lengthOfLine ()>line2.lengthOfLine ()){
            System.out.println ("Odcinek pierwszy jest większy");
            line1.printInfo ();
        }
        else {
            System.out.println ("Odcinek drugi jest większy");
            line2.printInfo ();
        }

//        Line lengthenLine = calculate.lenghthenLine(line1,line2);
//        lengthenLine.printInfo ();

    }
}

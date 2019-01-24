public class Line {
    Point A;
    Point B;

    public Line(Point A, Point B){
        this.A=A;
        this.B=B;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    double lengthOfLine(){
        double length = Math.sqrt (Math.pow((B.x-A.x),2) + Math.pow((B.y-A.y),2));
        return length;
    }

    void printInfo(){
        System.out.println ("Początek: (" + A.x + ";" + A.y + ")");
        System.out.println ("Koniec: (" + B.x + ";" + B.y + ")");
        System.out.println ("Długość: " + lengthOfLine ());
    }
}

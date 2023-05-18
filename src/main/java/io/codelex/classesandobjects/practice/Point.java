package io.codelex.classesandobjects.practice;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }

    public static void swapPoints(Point first, Point second) {

        int firstX = first.x;
        first.x = second.x;
        second.x = firstX;

        int firstY = first.y;
        first.y = second.y;
        second.y = firstY;

    }
}

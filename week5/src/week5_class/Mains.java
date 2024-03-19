package week5_class;

public class Mains
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(3.2,10,20);
        Rectangle rectangle = new Rectangle(5.4,4.5,30,40);

        // before it moves the X and the Y
        circle.printNewPosition();

        circle.moveUp();
        circle.moveLeft();

        // after the X and Y moves
        circle.printNewPosition();

    }
}

interface Movable
{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();

}

// base abstract class
abstract class Shape
{
    double centreX;
    double centreY;

    public Shape(double centreX,double centreY)
    {
        this.centreX = centreX;
        this.centreY = centreY;
    }

    // Abstract method that must be implemented by the subclasses (circle,rectangle)
    abstract double area();
}

class Circle extends Shape implements Movable
{
    private final double PI = 3.14;
    private double radius;

    public Circle(double radius,double centreX,double centreY)
    {
        super(centreX,centreY);
        this.radius = radius;
    }

    double getRadius() {return radius;}

    @Override
    double area() {return PI * Math.pow(radius, 2);}

    public void moveDown() {System.out.println("Moving Down");centreY--;}
    public void moveLeft() {System.out.println("Moving Left");centreX--;}
    public void moveRight() {System.out.println("Moving Right");centreX++;}
    public void moveUp() {System.out.println("Moving Up");centreY++;}

    public void printNewPosition()
    {
        System.out.println("Circle : Centre X = "+centreX+"Centre Y = "+centreY);
    }
}

class Rectangle extends Shape implements Movable
{
    private double width;
    private double height;

    public Rectangle(double width,double height,double centreX,double centreY)
    {
        super(centreX,centreY);
        this.width = width;
        this.height = height;
    }

    double getHeight() {return height;}
    double getWidth() {return width;}

    @Override
    double area() {return height * width;}

    public void moveDown() {System.out.println("Moving Down");centreY--;}
    public void moveLeft() {System.out.println("Moving Left");centreX--;}
    public void moveRight() {System.out.println("Moving Right");centreX++;}
    public void moveUp() {System.out.println("Moving Up");centreY++;}

    public void printNewPosition()
    {
        System.out.println("Rectangle : Centre X = "+centreX+"Centre Y = "+centreY);
    }

}




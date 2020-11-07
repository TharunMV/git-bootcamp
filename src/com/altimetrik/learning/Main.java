package com.altimetrik.learning;

public class Main {

    public static void main(String[] args) {

        AreaCalculator cal = new AreaCalculator();
        cal.calculateArea(new Circle(10));
        cal.calculateArea(new Rectangle(20, 10));

        LoggingToFile fileLogger = new LoggingToFile(new Logger());
        fileLogger.logging();
    }

}

interface ILogger {
    public void logInfo(String log);
}

class Logger implements ILogger{
    public void logInfo(String log) {
        System.out.println(log);
    }
}

class LoggingToFile {
    private ILogger logger;
    public LoggingToFile(ILogger l) {
        this.logger = l;
    }
    public void logging() {
        logger.logInfo("Printing logs to the file");
    }
}

abstract class Shape {
    abstract public void calculate();
}

class Rectangle extends Shape{
    double height;
    double width;
    public Rectangle(double h, double w) {
        this.height = h;
        this.width = w;
    }

    @Override
    public void calculate() {
        System.out.println(height * width);
    }
}

class Circle extends Shape{
    double radius;
    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public void calculate() {
        System.out.println(3.14 * radius * radius);
    }
}

class AreaCalculator {

    public void calculateArea(Shape shape) {
        shape.calculate();
    }
}

package main.java.com.hwnumber4.shapes;

import main.java.com.hwnumber4.interfaces.AreaMeasurable;
import main.java.com.hwnumber4.interfaces.PerimeterMeasurable;
import main.java.com.hwnumber4.shapes.defshapes.PlaneShapes;
import main.java.com.hwnumber4.vertex.Vertex2D;

import java.util.ArrayList;
import java.util.Arrays;

public class Triangle extends PlaneShapes implements AreaMeasurable, PerimeterMeasurable {
    private Vertex2D vertex2D;
    private Vertex2D side1;
    private Vertex2D side2;
    private Vertex2D side3;

    public Triangle(Vertex2D side1, Vertex2D side2, Vertex2D side3) {
        super(new ArrayList<>(Arrays.asList(side1, side2, side3)));
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return  side1.getDistance(side2) + side2.getDistance(side3) + side3.getDistance(side1);
    }

    @Override
    public double getArea() {
        double p = getPerimeter() * 0.5;
        return Math.sqrt(p * (p - side1.getDistance(side2)) * (p - side2.getDistance(side3)) * (p - side3.getDistance(side1)));
    }

    @Override
    public String toString() {
        return "Triangle : " + "sides size = " + " side1 : " + side1 + ", side2 : " + side2 + ", side3 : " + side3 + ", area " + getArea() + ", perimeter = " + getPerimeter();
    }
}

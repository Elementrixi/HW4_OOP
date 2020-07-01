package main.java.com.hwnumber4.shapes;
import main.java.com.hwnumber4.interfaces.AreaMeasurable;
import main.java.com.hwnumber4.interfaces.PerimeterMeasurable;
import main.java.com.hwnumber4.shapes.defshapes.PlaneShapes;
import main.java.com.hwnumber4.vertex.Vertex2D;

import java.util.ArrayList;
import java.util.Collections;

public class Circle extends PlaneShapes implements AreaMeasurable, PerimeterMeasurable {
    private Vertex2D vertex2D;
    private double radius;

    public Circle(Vertex2D vertex2D, double radius) {
        super(new ArrayList<>(Collections.singletonList(vertex2D)));
        this.vertex2D = vertex2D;
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle : " + "vertex2D = " + vertex2D + ", radius = " + radius + ", area = " + getArea() + ", perimeter = " + getPerimeter() ;
    }
}

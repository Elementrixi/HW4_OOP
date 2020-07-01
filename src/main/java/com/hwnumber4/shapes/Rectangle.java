package main.java.com.hwnumber4.shapes;
import main.java.com.hwnumber4.interfaces.AreaMeasurable;
import main.java.com.hwnumber4.interfaces.PerimeterMeasurable;
import main.java.com.hwnumber4.shapes.defshapes.PlaneShapes;
import main.java.com.hwnumber4.vertex.Vertex2D;

import java.util.ArrayList;
import java.util.Collections;

public class Rectangle extends PlaneShapes implements AreaMeasurable, PerimeterMeasurable {
    private Vertex2D vertex2D;
    private double width;
    private double height;

    public Rectangle(Vertex2D vertex2D, double length, double width) {
        super(new ArrayList<>(Collections.singletonList(vertex2D)));
        this.vertex2D = vertex2D;
        this.height = length;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (width * height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle : " + "vertex = " + vertex2D + ", height = " + height + ", width = " + width + ", area = " + getArea() + ", perimeter = " + getPerimeter() ;
    }
}

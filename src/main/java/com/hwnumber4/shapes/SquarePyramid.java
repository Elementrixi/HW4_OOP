package main.java.com.hwnumber4.shapes;

import main.java.com.hwnumber4.interfaces.AreaMeasurable;
import main.java.com.hwnumber4.interfaces.VolumeMeasurable;
import main.java.com.hwnumber4.shapes.defshapes.SpaceShape;
import main.java.com.hwnumber4.vertex.Vertex3D;

import java.util.ArrayList;
import java.util.Collections;
public class SquarePyramid extends SpaceShape implements AreaMeasurable, VolumeMeasurable {
    private Vertex3D vertex3D;
    private double baseWidth;
    private double heightOfPyramid;
    public SquarePyramid(Vertex3D vertex3D, double baseWidth, double heightOfPyramid){
        super(new ArrayList<>(Collections.singleton(vertex3D)));
        this.vertex3D = vertex3D;
        this.baseWidth = baseWidth;
        this.heightOfPyramid = heightOfPyramid;
    }


    public double getArea() {
        return (4 * baseWidth) / 2 * (baseWidth / (2 * Math.tan(Math.toRadians(45)))) + Math.sqrt(Math.pow(heightOfPyramid, 2) + (Math.pow(baseWidth / 2 * Math.tan(Math.toRadians(45)), 2)));
    }


    public double getVolume() {
        return Math.pow(baseWidth, 2) * heightOfPyramid / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid : " + "vertex3D = " + vertex3D + ", baseWidth = " + baseWidth + ", heightOfPyramid = " + heightOfPyramid + ", area = " +getArea() + ", volume = " + getVolume();
    }
}

package com.module3.figure;

public class Line {
    private final Point start;
    private final Point end;
    private final float length;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
        this.length = setLength(start, end);
    }
    private float setLength(Point start, Point end){
        return (float) Math.sqrt(Math.pow((start.getX() - end.getX()), 2) + Math.pow((start.getY() - end.getY()), 2));
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public float getLength() {
        return length;
    }
}

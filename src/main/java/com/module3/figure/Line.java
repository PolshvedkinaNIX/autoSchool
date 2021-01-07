package com.module3.figure;

public class Line {
    private final Point start;
    private final Point end;
    private float length;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public float calcLength() {
        if (this.length == 0){
            this.length = (float) Math.sqrt(Math.pow((start.getX() - end.getX()), 2) + Math.pow((start.getY() - end.getY()), 2));
        }
        return length;
    }
}

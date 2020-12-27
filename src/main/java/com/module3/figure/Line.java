package com.module3.figure;

public class Line
{
    private final Point start;
    private final Point end;
    private final float length;

    public Point getStart()
    {
        return start;
    }

    public Point getEnd()
    {
        return end;
    }

    public float getLength()
    {
        return length;
    }

    public Line(float startX, float startY, float endX, float endY) //constructor
    {
        start = new Point(startX, startY);
        end = new Point(endX, endY);
        this.length = (float) Math.sqrt(Math.pow((start.getX() - end.getX()), 2) + Math.pow((start.getY() - end.getY()), 2));
    }

}

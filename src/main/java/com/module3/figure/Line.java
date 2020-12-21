package com.module3.figure;

public class Line
{
    private Point start;
    private Point end;
    private float length;

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
        this.length = (float) Math.sqrt(Math.abs(start.getX()-end.getX())+Math.abs(start.getY()-end.getY()));
        return length;
    }

    public Line(float startX, float startY, float endX, float endY) //constructor
    {
        start = new Point(startX, startY);
        end = new Point(endX, endY);
    }

}

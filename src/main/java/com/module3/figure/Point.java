package com.module3.figure;

public class Point
{
    private final float coordinateX;
    private final float coordinateY;

    public float getX()
    {
        return coordinateX;
    }
    public float getY()
    {
        return coordinateY;
    }

    public Point(float x, float y)
    {
        this.coordinateX = x;
        this.coordinateY = y;
    }

}

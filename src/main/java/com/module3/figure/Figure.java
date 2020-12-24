package com.module3.figure;

public abstract class Figure
{
    private String name;
    private float area;

    public float getArea()
    {
        return area;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public Figure(){}

}

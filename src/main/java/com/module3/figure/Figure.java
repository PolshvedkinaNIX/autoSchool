package com.module3.figure;

public abstract class Figure {
    private String name;
    private float area;
    private Point[] coordinates;

    public float getArea() {
        return area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Point[] getCoordinates() {
        return coordinates;
    }

    public void printCoordinates() {
        for (int i = 0; i < coordinates.length; i++) {
            System.out.printf("%d. X:%.2f; Y:%.2f;\n", i + 1, coordinates[i].getX(), coordinates[i].getY());
        }
    }

    public void setArea(float area){
        this.area = area;
    }
    public abstract void setArea(); //метод не принимает параметров, чтобы для всех фигур была одинаковая сигнатура
    public void setCoordinates(Point[] coordinates) {
        this.coordinates = coordinates;
    }
}

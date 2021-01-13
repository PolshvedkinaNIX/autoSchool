package com.module3.figure;

public abstract class Figure {
    protected String name;
    protected float area;
    protected Point[] coordinates;

    public void setName(String name) {
        this.name = name;
    } // этот метод я оставила, тк в конструкторах его нет, да и согласно самой концепции имени, его можно менять=)

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

    /*public void setArea(float area){
        this.area = area; todo: насколько я понимаю, он больше не нужен и может быть удален
    }*/
    public abstract float calcArea(); //метод не принимает параметров, чтобы для всех фигур была одинаковая сигнатура

}
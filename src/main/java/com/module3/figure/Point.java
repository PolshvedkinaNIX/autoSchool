package com.module3.figure;

import java.util.Random;

public class Point {
    private final float coordinateX;
    private final float coordinateY;

    public float getX() {
        return coordinateX;
    }
    public float getY() {
        return coordinateY;
    }

    public Point(float x, float y) {
        this.coordinateX = x;
        this.coordinateY = y;
    }
    public static Point randPoint(int spaceSize, int shift){
        Random random = new Random();
        float x = (float) random.nextInt(spaceSize + 1) + random.nextFloat() + shift;
        // второй вызов рандома для получения дробной части
        // прибавлять sift нужно для того, чтобы можно было отодвигать позицию генерации точек благодаря чему пересечение фигур исключено
        float y = (float) random.nextInt(spaceSize + 1) + random.nextFloat();
        return new Point(x, y);
    }

}

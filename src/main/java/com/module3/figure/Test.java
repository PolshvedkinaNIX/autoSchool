package com.module3.figure;

public class Test
{
    public static void main(String[] args)
    {
        Square A = new Square(1, 1, 1, 3);
        System.out.println(A.getArea());
        System.out.println(A.getSide().getLength());
        System.out.println(A.getSide().getStart().getX());
        System.out.println(A.getSide().getStart().getY());
        System.out.println(A.getSide().getEnd().getX());
        System.out.println(A.getSide().getEnd().getY());

    }
}

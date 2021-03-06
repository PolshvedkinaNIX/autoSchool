package com.module3.figure;

public class MergeSort {
    public static float[] mergeSortFloatsArray(float[] array) // ASC sort
    {
        if (array.length < 2)
            return array;

        float[] firstPart = new float[array.length / 2];
        float[] secondPart = new float[array.length - firstPart.length];
        for (int i = 0; i < firstPart.length; i++)
            firstPart[i] = array[i];
        for (int i = firstPart.length, j = 0; i < array.length; i++) {
            secondPart[j] = array[i];
            j++;
        }

        firstPart = mergeSortFloatsArray(firstPart);
        secondPart = mergeSortFloatsArray(secondPart);
        return mergeFloatArrays(firstPart, secondPart);
    }

    public static float[] mergeFloatArrays(float[] arrayA, float[] arrayB) {
        float[] result = new float[arrayA.length + arrayB.length];
        int counterA = 0;
        int counterB = 0;

        for (int i = 0; i < result.length; i++) {
            if (counterA == arrayA.length && counterB != arrayB.length) {
                result[i] = arrayB[counterB];
                counterB++;
            } else if (counterB == arrayB.length && counterA != arrayA.length) {
                result[i] = arrayA[counterA];
                counterA++;
            } else {
                if (arrayA[counterA] <= arrayB[counterB]) {
                    result[i] = arrayA[counterA];
                    counterA++;
                } else {
                    result[i] = arrayB[counterB];
                    counterB++;
                }
            }
        }
        return result;
    }

    public static Figure[] mergeSortFigureArray(Figure[] array) {
        {
            if (array == null) {
                return null;
            }
            if (array.length < 2)
                return array;

            Figure[] firstPart = new Figure[array.length / 2];
            Figure[] secondPart = new Figure[array.length - firstPart.length];
            for (int i = 0; i < firstPart.length; i++) {
                firstPart[i] = array[i];

            }
            for (int i = firstPart.length, j = 0; i < array.length; i++) {
                secondPart[j] = array[i];
                j++;
            }

            firstPart = mergeSortFigureArray(firstPart);
            secondPart = mergeSortFigureArray(secondPart);
            return mergeFigureArrays(firstPart, secondPart);
        }
    }

    public static Figure[] mergeFigureArrays(Figure[] arrayA, Figure[] arrayB) {
        Figure[] result = new Figure[arrayA.length + arrayB.length];
        int counterA = 0;
        int counterB = 0;

        for (int i = 0; i < result.length; i++) {
            if (counterA == arrayA.length && counterB != arrayB.length) {
                result[i] = arrayB[counterB];
                counterB++;
            } else if (counterB == arrayB.length && counterA != arrayA.length) {
                result[i] = arrayA[counterA];
                counterA++;
            } else {
                if (arrayA[counterA].calcArea() <= arrayB[counterB].calcArea()) {
                    result[i] = arrayA[counterA];
                    counterA++;
                } else {
                    result[i] = arrayB[counterB];
                    counterB++;
                }
            }
        }
        return result;
    }
}

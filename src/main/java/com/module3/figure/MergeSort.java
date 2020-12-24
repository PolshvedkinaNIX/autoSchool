package com.module3.figure;

public class MergeSort
{
    public static float[] mergeSortFloatsArray(float[] array) // ASC sort
    {
        if (array == null)
        {
            return null;
        }
        if (array.length<2)
            return array;

        float[] firstPart = new float[array.length/2];
        float[] secondPart = new float[array.length-firstPart.length];
        for (int i = 0; i< firstPart.length; i++)
            firstPart[i]=array[i];
        for (int i = firstPart.length, j = 0; i< array.length; i++)
        {
            secondPart[j] = array[i];
            j++;
        }

        firstPart= mergeSortFloatsArray(firstPart);
        secondPart = mergeSortFloatsArray(secondPart);
        return mergeArrays(firstPart, secondPart);
    }

    public static float[] mergeArrays(float[] arrayA, float[] arrayB)
    {
        float[] result = new float[arrayA.length + arrayB.length];
        int counterA = 0;
        int counterB = 0;

        if (arrayA[0] <= arrayB[0])  //first element handling
        {
            result[0] = arrayA[0];
            counterA ++;
        }
        else
        {
            result[0] = arrayB[0];
            counterB ++;
        }


        for (int i = 1; i < result.length; i++)
        {
            if (counterA==arrayA.length && counterB == arrayB.length)
            {
                if (arrayA[arrayA.length-1] <= arrayB[arrayB.length-1])  // last element handling
                {
                    result[result.length-1] = arrayB[arrayB.length-1];
                }
                else
                {
                    result[result.length-1] = arrayA[arrayA.length-1];
                }
                break;
            }
            else if (counterA==arrayA.length && counterB != arrayB.length)
            {
                result[i] = arrayB[counterB];
                counterB++;
            }
            else if (counterB==arrayB.length && counterA != arrayA.length)
            {
                result[i] = arrayA[counterA];
                counterA++;
            }
            else
            {
                if (arrayA[counterA] <= arrayB[counterB])
                {
                    result[i] = arrayA[counterA];
                    if (counterA < arrayA.length)
                        counterA++;
                }
                else
                {
                    result[i] = arrayB[counterB];
                    if (counterB < arrayB.length)
                        counterB++;
                }
            }
        }
        return result;
    }
}

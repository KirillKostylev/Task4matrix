package by.bntu.fitr.povt.kostylev.task1.model;


import by.bntu.fitr.povt.kostylev.task1.model.entity.Matrix;

import java.util.Arrays;

public class MatrixLogic {
    public static int findMultiplication(Matrix matrix) {
        matrix.getClass().getSimpleName();
        double[] arrayOfMultiply = new double[matrix.getCountRows()];
        for (int i = 0; i < matrix.getCountRows(); i++) {
            arrayOfMultiply[i] = 1;
            for (int j = 0; j < matrix.getCountColumns(); j++) {
                arrayOfMultiply[i] *= matrix.getElement(j, i);
            }
        }

        int indexMinElement = 0;
        double minElement = arrayOfMultiply[indexMinElement];
        for (int i = 0; i < arrayOfMultiply.length; i++) {
            if (minElement > arrayOfMultiply[i]) {
                minElement = arrayOfMultiply[i];
                indexMinElement = i;

            }
        }
        return indexMinElement;

//        for (int i = 0; i < arr.length; i++) {
//            int resultMultiplication = 1;
//            int minResultMultiplication = 1;
//            for (int j = 0; j < arr[i].length; j++) {
//                resultMultiplication *= arr[j][i];
//            }
//            if (minResultMultiplication > resultMultiplication) {
//                minResultMultiplication = resultMultiplication;
//                return minResultMultiplication;
//            }
//        }

    }

    public static boolean equalsIntegerNumberAndArray(double n, Matrix matrix) {
        boolean answer = true;
        label:
        for (int i = 0; i < matrix.getCountRows(); i++) {
            for (int j = 0; j < matrix.getCountColumns(); j++) {
                if (matrix.getElement(i, j) > n) {
                    answer = false;
                    break label;
                }
            }
        }
        return answer;
    }
}

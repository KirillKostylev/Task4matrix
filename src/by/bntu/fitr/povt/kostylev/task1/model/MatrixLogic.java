package by.bntu.fitr.povt.kostylev.task1.model;


import by.bntu.fitr.povt.kostylev.task1.model.entity.Matrix;

public class MatrixLogic {
    public static int findIndexMinMultiplication(Matrix matrix) {
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

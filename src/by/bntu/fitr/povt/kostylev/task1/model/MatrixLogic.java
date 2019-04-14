package by.bntu.fitr.povt.kostylev.task1.model;


import by.bntu.fitr.povt.kostylev.task1.model.entity.Matrix;
import by.bntu.fitr.povt.kostylev.task1.model.exceptions.NullMatrixException;

public class MatrixLogic {
    public final static String NULL_EXCEPTION_MSG = "Null is not allowed.";

    public static int findIndexMinMultiplication(Matrix matrix, double n) throws NullMatrixException {
        checkForNull(matrix);
        int ans = -1;
        if (equalsIntegerNumberAndArray(n, matrix)) {
            double[] arrayOfMultiply = new double[matrix.getCountColumns()];
            for (int i = 0; i < matrix.getCountColumns(); i++) {
                arrayOfMultiply[i] = 1;
                for (int j = 0; j < matrix.getCountRows(); j++) {
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
            ans = indexMinElement;
        }
        return ans;
    }

    private static boolean equalsIntegerNumberAndArray(double n, Matrix matrix) throws NullMatrixException {
        checkForNull(matrix);
        boolean answer = true;
        label:
        for (int i = 0; i < matrix.getCountRows(); i++) {
            for (int j = 0; j < matrix.getCountColumns(); j++) {
                if (Math.abs(matrix.getElement(i, j)) > n) {
                    answer = false;
                    break label;
                }
            }
        }
        return answer;
    }

    private static void checkForNull(Matrix matrix) throws NullMatrixException {
        if (matrix == null) {
            throw new NullMatrixException(NULL_EXCEPTION_MSG);
        }
    }
}
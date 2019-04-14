package by.bntu.fitr.povt.kostylev.task1.model.entity;

import by.bntu.fitr.povt.kostylev.task1.model.exceptions.NullMatrixException;
import by.bntu.fitr.povt.kostylev.task1.model.exceptions.WrongDimensionException;

public class Matrix {
    public static final int DEFAULT_SIZE = 5;
    private static final String NULL_ARRAY = "Empty array error.";
    private static final String INVALID_DIMENSION = "The number of rows and columns should be positive";

    private double[][] array;

    public Matrix() {
        array = new double[DEFAULT_SIZE][DEFAULT_SIZE];
    }

    public Matrix(double[][] array) throws NullMatrixException {
        if (array == null) throw new NullMatrixException(NULL_ARRAY);
        this.array = array;
    }

    public Matrix(int row, int column) throws WrongDimensionException {
        if(row < 1 || column < 1) throw new WrongDimensionException(INVALID_DIMENSION);
        array = new double[row][column];
    }

    public Matrix(int size) throws WrongDimensionException {
        this(size, size);
    }

    public Matrix(Matrix matrix) throws WrongDimensionException {
        this(matrix.array.length, matrix.array[0].length);
        for (int i = 0; matrix.array.length > i; i++) {
            for (int j = 0; j < matrix.array[i].length; j++) {
                array[i][j] = matrix.array[i][j];
            }
        }
    }

    public int getCountRows() {
        return array.length;
    }

    public double[][] getArray() {
        return array;
    }

    public int getCountColumns() {
        return array[0].length;
    }

    public double getElement(int i, int j) {
        return array[i][j];
    }

    public void setElement(int i, int j, double value) {
        array[i][j] = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; array.length > i; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

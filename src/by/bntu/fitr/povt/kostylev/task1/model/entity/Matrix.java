package by.bntu.fitr.povt.kostylev.task1.model.entity;

import java.util.Arrays;

public class Matrix {
    public static final int DEFAULT_SIZE = 5;
    private double[][] array;

    public Matrix() {
        array = new double[DEFAULT_SIZE][DEFAULT_SIZE];
    }

    public Matrix(double[][] array) {
        this.array = array;
    }

    public Matrix(int rows, int columns) {
        array = new double[rows][columns];
    }

    public Matrix(int size) {
        this(size, size);
    }

    public Matrix(Matrix matrix) {
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

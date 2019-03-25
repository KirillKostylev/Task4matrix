package by.bntu.fitr.povt.kostylev.task1.model;

import by.bntu.fitr.povt.kostylev.task1.model.entity.Matrix;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixLogicTest {


    @Test
    public void equalsIntegerNumber() {
        double[][] array = {
                {13, 8, 9},
                {4, 15, 6},
                {1, 2, 3}};
        Matrix matrix = new Matrix(array);

        assertTrue(MatrixLogic.equalsIntegerNumberAndArray(15, matrix));
    }

    @Test
    public void findMultiplication() {
        double[][] arr = {
                {99, 8, 9},
                {4, 15, 6},
                {1, 15, 1}};
        Matrix matrix = new Matrix(arr);
        assertEquals(2, MatrixLogic.findIndexMinMultiplication(matrix));
    }
}
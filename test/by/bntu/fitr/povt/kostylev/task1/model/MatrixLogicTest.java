package by.bntu.fitr.povt.kostylev.task1.model;

import by.bntu.fitr.povt.kostylev.task1.model.entity.Matrix;
import by.bntu.fitr.povt.kostylev.task1.model.exceptions.NullMatrixException;
import by.bntu.fitr.povt.kostylev.task1.model.exceptions.WrongDimensionException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixLogicTest {

    @Test
    public void findIndexMinMultiplication1() throws NullMatrixException {
        double[][] array = {
                {-13, 8, 9},
                {4, -15, 6},
                {-1, 2, 3}};

        Matrix matrix = new Matrix(array);
        assertEquals(1, MatrixLogic.findIndexMinMultiplication(matrix, 15));
    }

    @Test
    public void findIndexMinMultiplication2() throws NullMatrixException {
        double[][] array = {
                {-7, 8, 7, 5},
                {1, -5, 0, 7},
                {-1, 9, 3, 4}};
        Matrix matrix = new Matrix(array);
        assertEquals(1, MatrixLogic.findIndexMinMultiplication(matrix, 10));
    }

    @Test
    public void findIndexMinMultiplication3() {
        try {
            MatrixLogic.findIndexMinMultiplication(null, 10);
            //fail();
        } catch (NullMatrixException ex) {
            assertEquals(MatrixLogic.NULL_EXCEPTION_MSG, ex.getMessage());
        }
    }

    @Test
    public void findIndexMinMultiplication4() throws NullMatrixException{

        try {
            MatrixLogic.findIndexMinMultiplication(new Matrix(0,3), 5);
            //fail();
        } catch (WrongDimensionException ex) {
            assertEquals(Matrix.INVALID_DIMENSION, ex.getMessage());
        }
    }
}
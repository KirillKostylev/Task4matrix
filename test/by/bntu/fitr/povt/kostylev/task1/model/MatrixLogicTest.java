package by.bntu.fitr.povt.kostylev.task1.model;

import by.bntu.fitr.povt.kostylev.task1.model.entity.Matrix;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixLogicTest {
    private Matrix matrix;

    @Before
    public void init(){
        double[][] array = {
                {-13, 8, 9},
                {4, -15, 6},
                {-1, 2, 3}};
        matrix = new Matrix(array);
    }

    @Test
    public void equalsIntegerNumber() {
        assertTrue(MatrixLogic.equalsIntegerNumberAndArray(15, matrix));
    }

    @Test
    public void findIndexMinMultiplication() {
        assertEquals(1, MatrixLogic.findIndexMinMultiplication(matrix));
    }
}
package com.company.matrix;

import com.company.exception.MatrixException;

import java.io.Serializable;
import java.util.Scanner;

public class SquareMatrix implements Serializable {
    private int rows;
    private float[][] matrix;

    public SquareMatrix(int rows) throws MatrixException{
        if (rows < 0){
            throw new MatrixException("Введен неверный размер квадратной матрицы");
        }
        this.rows = rows;
        matrix = new float[rows][rows];
    }

    public void enterMatrix(){
        for(int i=0; i<rows; i++){
            for(int j=0; j<rows; j++){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Элемент["+(i+1)+"]["+(j+1)+"]: ");
                if (scanner.hasNextFloat()){
                    matrix[i][j] = scanner.nextFloat();
                }
            }
        }
    }

    public float calculateDeterminant(){
        float determinant = 0;
        if(rows == 1){
            determinant = matrix[0][0];
        }else if(rows == 2){
            determinant = matrix[0][0]*matrix[1][1] - matrix[1][0]*matrix[0][1];
        }else if(rows==3) {
            determinant = matrix[0][0] * (matrix[1][1]*matrix[2][2] - matrix[2][1]*matrix[1][2]) -
                    matrix[0][1]*(matrix[1][0]*matrix[2][2] - matrix[2][0]*matrix[1][2]) +
                    matrix[0][2]*(matrix[1][0]*matrix[2][1] - matrix[2][0]*matrix[1][1]);
        }
        return determinant;
    }
}

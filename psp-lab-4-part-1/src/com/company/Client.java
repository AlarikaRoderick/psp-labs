package com.company;

import com.company.exception.MatrixException;
import com.company.matrix.SquareMatrix;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args){
        try {
            System.out.println("server connecting....");
            Socket clientSocket = new Socket("127.0.0.1",2525);
            System.out.println("connection established....");

            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            ObjectOutputStream coos = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream cois = new ObjectInputStream(clientSocket.getInputStream());
            System.out.println("Если вы хотите продолжить работу с программой - введите 'yes'");
            System.out.println("Если нет - введите 'no'");

            String clientMessage = stdin.readLine();
                while (!clientMessage.equals("no")) {
                    System.out.println("Введите размеры матрицы: ");
                    int rows = Integer.parseInt(stdin.readLine());
                    if(rows < 0){
                        System.out.println("ty durak");
                    }
                    else {
                        System.out.println("you've entered: " + rows);
                        SquareMatrix matrix = new SquareMatrix(rows);
                        matrix.enterMatrix();
                        coos.writeObject(matrix);
                        float serverAnswer = (float) cois.readObject();
                        System.out.println("Определитель матрицы: " + serverAnswer);
                        System.out.println("---------------------------");
                        System.out.println("Если вы хотите продолжить работу с программой - введите 'yes'");
                        System.out.println("Если нет - введите 'no'");
                        clientMessage = stdin.readLine();
                    }
                }
            coos.close();
            cois.close();
            clientSocket.close();
        }catch(Exception e)	{
            e.printStackTrace();
        }

    }
}

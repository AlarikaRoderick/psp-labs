package com.company;

import com.company.exception.MatrixException;
import com.company.matrix.SquareMatrix;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientAccepted = null;
        ObjectInputStream sois = null;
        ObjectOutputStream soos = null;
        try {
            System.out.println("server starting....");
            serverSocket = new ServerSocket(2525);
            clientAccepted = serverSocket.accept();
            System.out.println("connection established....");
            sois = new ObjectInputStream(clientAccepted.getInputStream());
            soos = new ObjectOutputStream(clientAccepted.getOutputStream());
            SquareMatrix clientObjectRecieved = (SquareMatrix) sois.readObject();
            while (clientObjectRecieved != null)
            {
                float determinant = clientObjectRecieved.calculateDeterminant();
                soos.writeObject(determinant);
                clientObjectRecieved = (SquareMatrix) sois.readObject();
            }
        } catch (Exception e) {
        } finally {
            try {
                sois.close();
                soos.close();
                clientAccepted.close();
                serverSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

package com.example;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Application extends Remote {
    int add(int a, int b) throws RemoteException;

    int subtract(int a, int b) throws RemoteException;

    int multiply(int a, int b) throws RemoteException;

    int devise(int a, int b) throws RemoteException;
}


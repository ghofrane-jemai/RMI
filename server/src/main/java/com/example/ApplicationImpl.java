package com.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ApplicationImpl extends UnicastRemoteObject implements Application {

    protected ApplicationImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        return a - b;
    }


    @Override
    public int multiply(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public int devise(int a, int b) throws RemoteException {
        return a / b;
    }
}

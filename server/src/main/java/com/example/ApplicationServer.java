package com.example;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ApplicationServer {

    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {

        ApplicationImpl obj = new ApplicationImpl();
        Application stub = null;
        try {

            stub = (Application) UnicastRemoteObject.exportObject(obj, 0);
        } catch (Exception e) {
            stub = obj;
        }

        Registry registry = LocateRegistry.createRegistry(1099);
        registry.bind("Application", stub);

        System.err.println("Server ready");
    }
}
package com.example;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ApplicationClient {
    public static void main(String[] args) {
        try {

            Registry registry = LocateRegistry.getRegistry("rmi-server", 1099);
            Application stub = (Application) registry.lookup("Application");
            int response = stub.subtract(10, 5);
            System.out.println("response: " + response); 

        } catch (Exception e) {
            System.err.println("Application Client Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

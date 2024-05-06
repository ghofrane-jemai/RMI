package com.example;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class RmiRegistry {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            System.out.println("Registry ready");
        } catch (Exception e) {
            System.err.println("Registry exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

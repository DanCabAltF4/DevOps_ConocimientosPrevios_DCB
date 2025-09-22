/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.devops_conocimientosprevios_dcb;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dam2
 */
public class DevOps_ConocimientosPrevios_DCB {

    public static void main(String[] args) {

        switch (menu()) {
            //Registrar
            case 1 ->{
                
            }
            
            default -> {System.out.println("Opcion invalida");}
        }
    }

    private static int menu() {
        int option = 0;

        System.out.println("""
                           -Gestor de Tareas-
                           1)Registrar Tarea
                           2)Completar Tarea
                           3)Listar Tareas
                           4)Eliminar Tarea
                           5)Salir
                           """);
        option = readInt();
        return option;
    }

    private static int readInt() {
        int integer = 0;
        boolean valido;
        do {
            try {
                integer = new Scanner(System.in).nextInt();
                valido = true;
            } catch (InputMismatchException ex) {
                valido = false;
                System.out.println("Debe introducir un numero entero");
            }
        } while (!valido);
        return integer;
    }
}

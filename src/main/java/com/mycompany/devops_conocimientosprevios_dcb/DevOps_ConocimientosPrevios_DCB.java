/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.devops_conocimientosprevios_dcb;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dam2
 */
public class DevOps_ConocimientosPrevios_DCB {

    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();
        boolean run = true;
        do {
            switch (menu()) {
                //Registrar
                case 1 -> {
                    addTarea(tareas);
                }
                case 2 -> {
                    System.out.println("Introduzca el id de la tarea a completar");
                }
                //listar
                case 3 -> {
                    printTareas(tareas);
                }
                case 5 -> {
                    run = false;
                }
                default -> {
                    System.out.println("Opcion invalida");
                }
            }

        } while (run);

    }

    private static void printTareas(List<Tarea> tareas) {
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
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

    private static void addTarea(List<Tarea> tareas) {
        System.out.println("Introduzca la descripcion de la tarea");
        String desc = new Scanner(System.in).nextLine();
        tareas.add(new Tarea(newTareaId(tareas), desc, false));
    }

    //obtiene el primer id disponible para una nueva tarea
    private static int newTareaId(List<Tarea> tareas) {
        int id = 1; //Si no hay ninguna tarea empezará por el id 1
        Iterator<Tarea> it = tareas.iterator();
        boolean found = false;
        while (it.hasNext() && !found) {
            Tarea next = it.next();
            if (next.getId() == id) {
                id += 1;
            } else {
                found = true;
            }
        }
        return id;
    }

    private static voi
}

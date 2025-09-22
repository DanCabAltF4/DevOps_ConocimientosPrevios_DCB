/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.devops_conocimientosprevios_dcb;

/**
 *
 * @author dam2
 */
public class Tarea {
    private int id;
    private String desc;
    private boolean completada;

    public Tarea(int id, String desc, boolean completada) {
        this.id = id;
        this.desc = desc;
        this.completada = completada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", desc=" + desc + ", completada=" + completada + '}';
    }
    
    
}

package org.example;

import java.util.ArrayList;

public class Resto {
    private String name;
    private int id;
    private ArrayList<Plat> menu;

    public Resto(String name, int id, ArrayList<Plat> menu) {
        this.name = name;
        this.id = id;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Plat> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Plat> menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Resto{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", menu=" + menu +
                '}';
    }
}

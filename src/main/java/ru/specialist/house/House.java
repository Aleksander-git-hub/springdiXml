package ru.specialist.house;

import ru.specialist.doors.Door;
import ru.specialist.material.Material;
import ru.specialist.window.Window;

import java.util.List;
import java.util.Map;

public class House
{
    private Window window;
    private Material wall;
    //private List<Door> doors;
    private Map<String, Door> doors;
    private int height;

    public House(Window window) {
        this.window = window;
        //this.height = height;
    }

    public void view() {
        window.open();
    }

    public void buildWall() {
        for (int i = 1; i <= getHeight(); i++) {
            System.out.printf("Этаж %d. ", i);
            getWall().cover();
        }
    }

    public void installDoors() {
        /*for (Door door : doors) {
            door.install();
        }*/

        for (Map.Entry<String, Door> doorEntry : doors.entrySet()) {
            System.out.printf("Ключ %s. ", doorEntry.getKey());
            doorEntry.getValue().install();
        }
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Material getWall() {
        return wall;
    }

    public void setWall(Material wall) {
        this.wall = wall;
    }

    /*public List<Door> getDoors() {
        return doors;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }*/

    public Map<String, Door> getDoors() {
        return doors;
    }

    public void setDoors(Map<String, Door> doors) {
        this.doors = doors;
    }
}

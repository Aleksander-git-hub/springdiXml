package ru.specialist.doors;

public class WoodDoor implements Door
{
    @Override
    public void install() {
        System.out.println("Установить деревянную дверь");
    }
}

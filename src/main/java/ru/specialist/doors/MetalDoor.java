package ru.specialist.doors;

public class MetalDoor implements Door
{
    @Override
    public void install() {
        System.out.println("Установить металлическую дверь");
    }
}

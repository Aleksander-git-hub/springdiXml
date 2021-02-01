package ru.specialist.material;

public class Brick implements Material
{
    @Override
    public void cover() {
        System.out.println("Класть кирпич");
    }
}

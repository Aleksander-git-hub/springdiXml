package ru.specialist.material;

public class Wood implements Material
{
    @Override
    public void cover() {
        System.out.println("Класть бревна");
    }
}

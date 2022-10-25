package ru.test.day2;

public class Bird extends Animal{
    @Override
    public String getTypeAnimal() {
        return "Птица";
    }

    @Override
    public int getCountLap() {
        return 2;
    }

    public int getPolet(){
        return 1;
    }
}

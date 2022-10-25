package ru.test.day2;

import ru.test.interf.View;

public class Animal implements View {
    public String typeAnimal; //Тип животного
    private int koefUm; //Коэффициент интеллекта

    private String colorGlaz;

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal() {
        this.typeAnimal = "Неизвестное животное";
    }

    public int getKoefUm(){
        return koefUm;
    }

    public void setKoefUm(int koefUm) {
        this.koefUm = koefUm;
    }

    public int getCountLap(){
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return this.koefUm == ((Animal)obj).koefUm;
    }

    @Override
    public void setColorGlaz(String color) {
        colorGlaz = color;
    }

    @Override
    public String getColorGlaz() {
        return colorGlaz;
    }
}

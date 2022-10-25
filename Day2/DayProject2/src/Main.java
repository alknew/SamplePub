import ru.test.day2.Animal;
import ru.test.day2.Bird;
import ru.test.day2.Dog;
import ru.test.day2.Mleco;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Animal();
        animals[0].setTypeAnimal();
        animals[0].setKoefUm(5);
        animals[0].setColorGlaz("Blue");
        animals[1] = new Bird();
        animals[1].setKoefUm(6);
        animals[1].setColorGlaz("Red");
        animals[2] = new Mleco();
        animals[2].setKoefUm(6);
        animals[2].setColorGlaz("Brown");
        animals[3] = new Dog();
        animals[3].setKoefUm(7);
        animals[3].setColorGlaz("Green");
        createAnimals(animals);

        if (animals[1].equals(animals[2])) {
            System.out.println("Птицы и млекопитающие умом равны");
        }
        if (animals[2].equals(animals[3])) {
            System.out.println("Собаки и млекопитающие умом равны");
        } else {
            System.out.println("Собаки и млекопитающие умом не равны");
        }

        String str1 = "test1";
        String str2 = "test1";

        System.out.println(str1 + "==" + str2);

        str2 = "test2";
        System.out.println(str1 + "==" + str2);
    }


    public static void createAnimals(Animal[] animals) {

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getTypeAnimal() + " " + animals[i].getColorGlaz());
        }


        System.out.println("Кто 1 - " + ((Animal) animals[1]).getTypeAnimal());

    }
}
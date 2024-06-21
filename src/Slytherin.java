/*
Напишите программу, в которой реализован класс hogwarts и четыре класса по названиям факультетов.
В классах факультетов опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы
в качестве объектов. Должна быть возможность задавать качества учеников через конструктор. Присвойте
каждому свойству произвольное числовое значение от 0 до 100.
 */

public class Slytherin extends Student {
    private int trick;
    private int determination;
    private int ambition;


    public Slytherin(String name, int ambition, int determination, int trick, int powerOfMagic, int transgressionDistance) {
        super(name, powerOfMagic, transgressionDistance);
        this.ambition = ambition;
        this.determination = determination;
        this.trick = trick;

    }

    public int getAmbition() {
        return ambition;
    }

    public int getDetermination() {
        return determination;
    }

    public int getTrick() {
        return trick;
    }

    @Override
    public String toString() {
        return getName() + trick + determination + ambition;
    }

    public void studentInformationSlytherin(){
        System.out.println(getName() + " " + trick + " " + determination + " " + ambition);
    }

    /*
    Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух
    учеников одного факультета по свойствам. Чтобы сравнить учеников, нужно сложить баллы по каждому
    свойству, которое присуще ученику данного факультета. Тот ученик, у которого сумма свойств больше,
    считается лучшим учеником. Метод должен выводить в консоль результат сравнения учеников.
     */

    public static void studentComparisonSlytherin(Slytherin comparison1, Slytherin comparison2){
        int student1 = comparison1.getAmbition() + comparison1.getDetermination() + comparison1.getTrick();
        int student2 = comparison2.getAmbition() + comparison2.getTrick() + comparison2.getDetermination();
        if (student1 > student2){
            System.out.println(comparison1.getName() + " лучший ученик Слизерина, чем " + comparison2.getName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getName() + " лучший ученик Слизерина, чем " + comparison1.getName());
        } else {
            System.out.println(comparison1.getName() + " " + comparison2.getName() + " Лучшие ученики Слизерина.");
        }
    }
}

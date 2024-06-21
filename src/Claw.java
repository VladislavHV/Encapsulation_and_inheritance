/*
Напишите программу, в которой реализован класс hogwarts и четыре класса по названиям факультетов.
В классах факультетов опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы
в качестве объектов. Должна быть возможность задавать качества учеников через конструктор. Присвойте
каждому свойству произвольное числовое значение от 0 до 100.
 */

public class Claw extends Student {
    private int smart;
    private int wise;
    private int witty;

    public Claw(String name, int smart, int wise, int witty, int powerOfMagic, int transgressionDistance) {
        super(name, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;

    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    @Override
    public String toString() {
        return getName() + smart + wise + witty;
    }

    public void studentInformationClaw(){
        System.out.println(getName() + " " + smart + " " + wise + " " + witty);
    }

    /*
    Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух
    учеников одного факультета по свойствам. Чтобы сравнить учеников, нужно сложить баллы по каждому
    свойству, которое присуще ученику данного факультета. Тот ученик, у которого сумма свойств больше,
    считается лучшим учеником. Метод должен выводить в консоль результат сравнения учеников.
     */

    public static void studentComparisonClaw(Claw comparison1, Claw comparison2){
        int student1 = comparison1.getSmart() + comparison1.getWise() + comparison1.getWitty();
        int student2 = comparison2.getSmart() + comparison2.getWitty() + comparison2.getWise();
        if (student1 > student2){
            System.out.println(comparison1.getName() + " лучший ученик Когтевранца, чем " + comparison2.getName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getName() + " лучший ученик Когтевранца, чем " + comparison1.getName());
        } else {
            System.out.println(comparison1.getName() + " " + comparison2.getName() + " Лучшие ученики Когтевранца.");
        }
    }
}

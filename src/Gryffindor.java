/*
Напишите программу, в которой реализован класс hogwarts и четыре класса по названиям факультетов.
В классах факультетов опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы
в качестве объектов. Должна быть возможность задавать качества учеников через конструктор. Присвойте
каждому свойству произвольное числовое значение от 0 до 100.
 */

public class Gryffindor extends Student {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int bravery, int honor, int nobility, int powerOfMagic, int transgressionDistance) {
        super(name, powerOfMagic, transgressionDistance);
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public int getHonor() {
        return honor;
    }

    public int getNobility() {
        return nobility;
    }

    @Override
    public String toString() {
        return getName() + nobility + honor + bravery;
    }

    /*
    Сделайте метод, который выводит на экран описание студента. В описание надо включать качества,
        которые присущи всем студентам, плюс качества, которые присущи студенту, потому что он
        учится на конкретном факультете.
     */

    public void studentInformationGryffindor(){
        System.out.println(getName() + " " + nobility + " " + honor + " " + bravery);
    }

    /*
    Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух
    учеников одного факультета по свойствам. Чтобы сравнить учеников, нужно сложить баллы по каждому
    свойству, которое присуще ученику данного факультета. Тот ученик, у которого сумма свойств больше,
    считается лучшим учеником. Метод должен выводить в консоль результат сравнения учеников.
     */

    public static void studentComparisonGryffindor(Gryffindor comparison1, Gryffindor comparison2){
        int student1 = comparison1.getNobility() + comparison1.getHonor() + comparison1.getBravery();
        int student2 = comparison2.getNobility() + comparison2.getHonor() + comparison2.getBravery();
        if (student1 > student2){
            System.out.println(comparison1.getName() + " лучший ученик Гриффиндора, чем " + comparison2.getName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getName() + " лучший ученик Гриффиндора, чем " + comparison1.getName());
        } else {
            System.out.println(comparison1.getName() + " " + comparison2.getName() + " Лучшие ученики Гриффиндора.");
        }
    }
}

/*
Напишите программу, в которой реализован класс hogwarts и четыре класса по названиям факультетов.
В классах факультетов опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы
в качестве объектов. Должна быть возможность задавать качества учеников через конструктор. Присвойте
каждому свойству произвольное числовое значение от 0 до 100.
 */

public class Puffendui extends Student {
    private int hardworking;
    private int loyalty;
    private int honest;

    public Puffendui(String name, int hardworking, int honest, int loyalty, int powerOfMagic, int transgressionDistance) {
        super(name, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.honest = honest;
        this.loyalty = loyalty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getHonest() {
        return honest;
    }

    public int getLoyalty() {
        return loyalty;
    }

    @Override
    public String toString() {
        return getName() + hardworking + loyalty + honest;
    }

    public void studentInformationPuffendui(){
        System.out.println(getName() + " " + hardworking + " " + loyalty + " " + honest);
    }

    /*
    Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух
    учеников одного факультета по свойствам. Чтобы сравнить учеников, нужно сложить баллы по каждому
    свойству, которое присуще ученику данного факультета. Тот ученик, у которого сумма свойств больше,
    считается лучшим учеником. Метод должен выводить в консоль результат сравнения учеников.
     */

    public static void studentComparisonPuffendui(Puffendui comparison1, Puffendui comparison2){
        int student1 = comparison1.getHardworking() + comparison1.getLoyalty() + comparison1.getHonest();
        int student2 = comparison2.getHardworking() + comparison2.getLoyalty() + comparison2.getHonest();
        if (student1 > student2){
            System.out.println(comparison1.getName() + " лучший ученик Пуффендуя, чем " + comparison2.getName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getName() + " лучший ученик Пуффендуя, чем " + comparison1.getName());
        } else {
            System.out.println(comparison1.getName() + " " + comparison2.getName() + " Лучшие ученики Пуффендуя.");
        }
    }
}

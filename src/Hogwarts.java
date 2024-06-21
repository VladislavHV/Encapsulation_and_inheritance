/*
Напишите программу, в которой реализован класс hogwarts и четыре класса по названиям факультетов.
В классах факультетов опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы
в качестве объектов. Должна быть возможность задавать качества учеников через конструктор. Присвойте
каждому свойству произвольное числовое значение от 0 до 100.
 */

public class Hogwarts {
    public static void main(String[] args){
        Slytherin dracoMalcfoy = new Slytherin("Draco Malfoy", 85, 77, 89, 90, 99);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 88, 79, 67, 67, 80);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 90, 82, 59,16,34);

        Claw choChang = new Claw("Cho Chang", 48, 59, 60,89,55);
        Claw padmaPatil = new Claw("Padma Patil", 70, 39,80,47,39);
        Claw marcusBelby = new Claw("Marcus Belby", 25, 45, 90,28,90);

        Puffendui zachariasSmith = new Puffendui("Zacharias Smith", 10, 95, 51,70,58);
        Puffendui cedricDiggory = new Puffendui("Cedric Diggory", 20, 48, 33,67,28);
        Puffendui justinFinchFletchley = new Puffendui("Justin Finch-Fletchley" , 70, 35, 40,10,56);

        Gryffindor harryPotter = new Gryffindor("Harry Potter", 95, 90, 68,60,79);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 80, 90, 100,90,95);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 50,30,0,67,35);

        /*
        Сделайте метод, который выводит на экран описание студента. В описание надо включать качества,
        которые присущи всем студентам, плюс качества, которые присущи студенту, потому что он
        учится на конкретном факультете.
         */

        //Gryffindor
        harryPotter.studentInformationGryffindor();
        hermioneGranger.studentInformationGryffindor();
        ronWeasley.studentInformationGryffindor();

        System.out.println();
        //Puffendui
        zachariasSmith.studentInformationPuffendui();
        cedricDiggory.studentInformationPuffendui();
        justinFinchFletchley.studentInformationPuffendui();

        System.out.println();
        //Claw
        choChang.studentInformationClaw();
        padmaPatil.studentInformationClaw();
        marcusBelby.studentInformationClaw();

        System.out.println();
        //Slytherin
        dracoMalcfoy.studentInformationSlytherin();
        grahamMontague.studentInformationSlytherin();
        gregoryGoyle.studentInformationSlytherin();

        System.out.println();
        /*
        Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух
        учеников одного факультета по свойствам. Чтобы сравнить учеников, нужно сложить баллы по каждому
        свойству, которое присуще ученику данного факультета. Тот ученик, у которого сумма свойств больше,
        считается лучшим учеником. Метод должен выводить в консоль результат сравнения учеников.
         */

        Gryffindor.studentComparisonGryffindor(harryPotter, hermioneGranger);
        Puffendui.studentComparisonPuffendui(zachariasSmith, justinFinchFletchley);
        Claw.studentComparisonClaw(padmaPatil, marcusBelby);
        Slytherin.studentComparisonSlytherin(dracoMalcfoy, gregoryGoyle);

        System.out.println();
        /*
        Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и
        расстоянию трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками.
         */

        Student.powerOfMagicTransgressionDistance(dracoMalcfoy, harryPotter);
    }
}

public class Main {
    public static void main(String[] args) {
        task1_3();
        task4_5();
        task6_8();
    }
    public static void task1_3 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4_5 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6_8 (){
        System.out.println("Задача 6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeightBoxers = boxerWeight1 + boxerWeight2;
        System.out.println("общий вес двух бойцов " + totalWeightBoxers + " кг" );
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println("разница между весами бойцов " + differenceWeight + " кг" );
        System.out.println("Задача 7");
        var differenceWeight1 = boxerWeight2 - boxerWeight1;
        System.out.println("разница между весами бойцов " + differenceWeight1 + " кг" );
        var differenceWeight2 = boxerWeight2 % boxerWeight1;
        System.out.println("разница между весами бойцов " + differenceWeight2 + " кг" );
        System.out.println("Задача 8.1");
        var totalWorkingTime = 640;
        var workingTimeOfOneEmployee = 8;
        var totalEmployees = totalWorkingTime / workingTimeOfOneEmployee;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек" );
        System.out.println("Задача 8.2");
        totalEmployees = totalEmployees + 94;
        totalWorkingTime = totalEmployees * workingTimeOfOneEmployee;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalWorkingTime + " часов работы может быть поделено между сотрудниками");
    }

}
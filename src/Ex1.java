public class Ex1 {
    public static void main(String[] args) {
       //Ex1
       var dog = 8.0;
       var cat = 3.6;
       var paper = 763789;
       System.out.println("Задание  номер один");
       System.out.println(dog);
       System.out.println(cat);
       System.out.println(paper);
       //Ex2
       dog = dog + 4;
       cat = cat + 4;
       paper = paper + 4;
       System.out.println("Задание  номер два");
       System.out.println(dog);
       System.out.println(cat);
       System.out.println(paper);
       //Ex3
       dog = dog - 3.5;
       cat = cat - 1.6;
       paper = paper - 7639;
       System.out.println("Задание  номер три");
       System.out.println(dog);
       System.out.println(cat);
       System.out.println(paper);
       //Ex4
       System.out.println("Задание номер четыре");
       var friend = 19;
       System.out.println(friend);
       friend = friend + 2;
       System.out.println(friend);
       friend = friend / 7;
       System.out.println(friend);
       //Ex5
       var frog = 3.5;
       System.out.println("Задание номер пять");
       System.out.println(frog);
       frog = frog * 10;
       System.out.println(frog);
       frog = frog / 3.5;
       System.out.println(frog);
       frog = frog + 4;
       System.out.println(frog);
       //Ex6
       var firstFighter = 78.2;
       var secondFighter = 82.7;
       System.out.println("Задание номер шесть");
       var sumWeight = firstFighter + secondFighter;
       System.out.println("Общий вес двух бойцов " + sumWeight + " кг");
       var differenceWeight = secondFighter - firstFighter;
       System.out.println("Разница в весе у двух бойцов " + differenceWeight + " кг");
       //Ex7
       System.out.println("Заданиие номер семь");
       var differenWeight = secondFighter - firstFighter;
       System.out.println("Разница в весе у двух бойцов вычитанием " + differenWeight + " кг");
       var otherDiffWeight = secondFighter % firstFighter;
       System.out.println("Разница в весе у двух бойцов функцией остатка от деления " +
               otherDiffWeight + " кг");
       //Ex8
       System.out.println("Заданиие номер семь");
       var workTime = 640;
       var oneEmployTime = 8;
       var workersAmount = workTime / oneEmployTime;
       System.out.println("Всего работников в компании – " + workersAmount + " человек");
       var newWorkersAmount = workersAmount + 94;
       var newWorkTime = newWorkersAmount * oneEmployTime;
       System.out.println("Если в компании работает " + newWorkersAmount + " человек, то всего " +
               newWorkTime + " часов работы может быть поделено между сотрудниками");
    }
}
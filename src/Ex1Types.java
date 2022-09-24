public class Ex1Types {
    public static void main(String[] args) {
        //Ex1
        System.out.println("Задание номер один");
        int a = 3;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 9;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 5;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 12456L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 56.5f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 4952.05d;
        System.out.println("Значение переменной f с типом double равно " + f);
        //Ex2
        float g = 27.12f;
        long h = 987678965549L;
        double i = 2.786;
        boolean j = false;
        char k = 569;
        short l = -159;
        int m = 27897;
        byte n = 67;
        //Ex3
        System.out.println("Задание номер три");
        int ludPavl = 23;
        int annSerg = 27;
        int kateAndr = 30;
        int allStud = ludPavl + annSerg + kateAndr;
        int allPaper = 480;
        System.out.println("На каждого ученика рассчитано " + allPaper / allStud + " листов бумаги");
        //Ex4
        System.out.println("Задание номер четыре");
        int machinPerf = 16;
        int perfMachinMin = 2;
        int  machinPerfOneMin = machinPerf  /  perfMachinMin;
        System.out.println("За 20 минут машина произвела бутылок " + machinPerfOneMin * 20 + " штук");
        System.out.println("За сутки машина произвела бутылок " + machinPerfOneMin * 60 * 24 + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + machinPerfOneMin * 60 * 24 * 3 + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + machinPerfOneMin * 60* 24 * 30 + " штук");
        //Ex5
        System.out.println("Задание номер пять");
        int allPaints = 120;
        int oneClassWhitePaint = 2;
        int oneClassBrownPaint = 4;
        int oneClassBothPaints = oneClassBrownPaint + oneClassWhitePaint;
        int countClasis = allPaints / oneClassBothPaints;
        System.out.println("В школе, где " + countClasis + " классов, нужно " + countClasis * oneClassWhitePaint
                + " белой краски и " + countClasis * oneClassBrownPaint + " банок коричневой краски");
        //Ex6
        System.out.println("Задание номер шесть");
        int bananaWeight = 80;
        int milkWeight = 105;
        int icecreamWeight = 100;
        int eggWeight = 70;
        int bananaCount = 5;
        int milkCount = 2;
        int icecreamCount = 2;
        int eggCount = 4;
        float cocktailWeight = bananaWeight * bananaCount + milkWeight * milkCount
                + icecreamWeight * icecreamCount + eggWeight * eggCount;
        System.out.println("После измельчения в блендере вес спорт завтрака в киллограмах будет равен - " + cocktailWeight / 1000 + " кг");
        //Ex7
        System.out.println("Задание номер семь");
        int loseWeight = 7;
        int firstWayLoseWeight = 250;
        int secondWayLoseWeight = 500;
        int loseWeightGrams = loseWeight * 1000;
        int firstWayDays = loseWeightGrams / firstWayLoseWeight;
        int secondWayDays = loseWeightGrams / secondWayLoseWeight;
        System.out.println("Спортсмену потребуется " + firstWayDays + " дней, чтобы похудеть на 7 кг," +
                " если он будет худеть по 250 грамм в день");
        System.out.println("Спортсмену потребуется " + secondWayDays + " дней, чтобы похудеть на 7 кг," +
                " если он будет худеть по 500 грамм в день");
        System.out.println("Спортсмену в среднем потребуется " + (firstWayDays + secondWayDays)/2 + " дней, чтобы похудеть на 7 кг," +
                " если он будет худеть от 250 до 500 грамм в день");
        //Ex8
        System.out.println("Задание номер восемь");
        float masha = 67760f;
        float den = 83690f;
        float kris = 76230f;
        float newMasha = (masha*10)/100 + masha;
        float newDen = (den*10)/100 + den;
        float newKris = (kris*10)/100 + kris;
        float differMasha = (newMasha * 12) - (masha * 12);
        float differDen = (newDen * 12) - (den * 12);
        float differKris = (newKris * 12) - (kris * 12);
        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + differMasha + " рублей");
        System.out.println("Денис теперь получает " + newDen + " рублей. Годовой доход вырос на " + differDen + " рублей");
        System.out.println("Кристина теперь получает " + newKris + " рублей. Годовой доход вырос на " + differKris + " рублей");
    }
}

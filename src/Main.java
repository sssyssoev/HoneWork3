//Исходники 3-го домашнего задания

public class Main {
    public static void main(String[] args) {
        System.out.println(" Домашнее задание №3 ");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        System.out.println("End of HomeWork3");


    }

    public static void task1() {

        byte b = 127;
        int i = 2147483647;
        short sh = 32767;
        long l = 92233720368547758l;
        float f = 3.4E+38f;
        double d = 1.7E+308;
        System.out.println("Задача №1");
        System.out.println("Значение переменной с типом byte  равно " + b);
        System.out.println("Значение переменной с типом short  равно " + sh);
        System.out.println("Значение переменной с типом int  равно " + i);
        System.out.println("Значение переменной с типом long  равно " + l);
        System.out.println("Значение переменной с типом float  равно " + f);
        System.out.println("Значение переменной с типом double  равно " + d);

    }

    public static void task2() {

        byte b = 67;
        int i1 = 27897;
        int i2 = -159;
        short sh = 569;
        long l = 987678965549l;
        float f = 27.12f;
        double d = 2.786;

        System.out.println("Задача №2");
        System.out.println("Значение переменной с типом byte  равно " + b);
        System.out.println("Значение переменной с типом short  равно " + sh);
        System.out.println("Значение переменной с типом int  равно " + i1);
        System.out.println("Значение переменной с типом int  равно " + i2);
        System.out.println("Значение переменной с типом long  равно " + l);
        System.out.println("Значение переменной с типом float  равно " + f);
        System.out.println("Значение переменной с типом double  равно " + d);

    }

    public static void task3() {

        int numberStudentsProfLP = 23;
        int numberStudentProfAS = 27;
        int numberStudentProfEA = 30;
        int totalNumberStudent;
        int paperQuantity = 480;
        float paperPerStudent;


        System.out.println("Задача №3");
        totalNumberStudent = numberStudentProfAS + numberStudentProfEA + numberStudentsProfLP;
        System.out.println("Всего учеников " + totalNumberStudent);
        paperPerStudent = paperQuantity / totalNumberStudent;
        System.out.println("На каждого ученика рассчитано  " + paperPerStudent + "  листов бумаги");

    }

    public static void task4() {

        int bottlesPerTwoMin = 20;
        int bottlesPerMin;
        int period1 = 20;   // 20 минут
        int period2;    // сутки
        int period3;    // 3 дня
        int period4;     // месяц=30 дней
        int bottlesPer20Min;
        int bottlesPerDay;
        int bottlesPer3Days;
        int bottlesPerMonth;

        bottlesPerMin = bottlesPerTwoMin / 20;
        bottlesPer20Min = bottlesPerMin * 20;
        bottlesPerDay = bottlesPerMin * 60 * 24;
        bottlesPer3Days = bottlesPerDay * 3;
        bottlesPerMonth = bottlesPerDay * 30;


        System.out.println("Задача №4");

        System.out.println(" За 20 минут машина произвела  " + bottlesPer20Min + "штук бутылок");
        System.out.println(" За сутки машина произвела  " + bottlesPerDay + "штук бутылок");
        System.out.println(" За 3 дня машина произвела  " + bottlesPer3Days + "штук бутылок");
        System.out.println(" За месяц машина произвела  " + bottlesPerMonth + "штук бутылок");


    }

    public static void task5() {

        int numberPaintCansBought = 120;
        int brownPaintCansPerClassRoom = 4;
        int whitePaintCansPerClassRoom = 2;
        int paintCansPerClassRoom = brownPaintCansPerClassRoom + whitePaintCansPerClassRoom;
        int classesQuantity;
        int brownCansTotal;
        int whiteCansTotal;

        System.out.println("         ");
        System.out.println("Задача №5");
        //  System.out.println("На класс расходуется всего " + paintCansPerClassRoom + " банок краски ");
        classesQuantity = numberPaintCansBought / paintCansPerClassRoom;
        // System.out.println("В школе всего  " + classesQuantity + " классных помещений ");
        whiteCansTotal = classesQuantity * whitePaintCansPerClassRoom;
        brownCansTotal = classesQuantity * brownPaintCansPerClassRoom;
        System.out.println("В школе,где " + classesQuantity + " нужно " + brownCansTotal +
                " банок коричневой краски и " + whiteCansTotal + " банок белой краски");
    }

    public static void task6() {
        int bananas = 5;
        int bananaWeight = 80;  // Gramm per banana

        float milk = 200;          //milliliters
        float milkWeight = 105;    //  gramm per 100 ml
        float milkTotalWeightGr;

        float iceCream = 2;          // packets
        float iceCreamWeight = 100; // gramm per packet

        int egg = 4;
        int eggWeight = 70;       // gramm per egg

        float bananaGramm;
        float milkGramm;
        float iceCreamGramm;
        float eggsGramm;
        float bananaKGramm;
        float milkKGramm;
        float iceCreamKGramm;
        float eggsKGramm;
        float breakfastGr;
        float breakfastKGr;

        System.out.println("         ");
        System.out.println("Задача №6");

        bananaGramm = bananas * bananaWeight;
        System.out.println("вес бананов граммы  " + bananaGramm);
        bananaKGramm = bananaGramm / 1000;
        System.out.println("вес бананов килограммы  " + bananaKGramm);

        milkGramm = milk * milkWeight / 100;
        milkKGramm = milkGramm / 1000;
        System.out.println("вес молока граммы  " + milkGramm);
        System.out.println("вес молока  килограммы  " + milkKGramm);

        iceCreamGramm = iceCream * iceCreamWeight;
        iceCreamKGramm = iceCreamGramm / 1000;
        System.out.println("вес мороженого граммы  " + iceCreamGramm);
        System.out.println("вес мороженого  килограммы  " + iceCreamKGramm);


        eggsGramm = egg * iceCreamWeight;
        eggsKGramm = eggsGramm / 1000;
        System.out.println("вес яиц граммы  " + eggsGramm);
        System.out.println("вес яиц  килограммы  " + eggsKGramm);


        breakfastGr = bananaGramm + milkGramm + iceCreamGramm + eggsGramm;
        breakfastKGr = bananaKGramm + milkKGramm + iceCreamKGramm + eggsKGramm;
        System.out.println("Завтрак весит " + breakfastGr + "грамм, или  " + breakfastKGr + " килограмм");

    }

    public static void task7() {

        System.out.println("Задача №7");
        float targetWLKg = 7;  //in kg  // WL = weight loss
        float targetWeightLossGramm = targetWLKg * 1000;  // in Gramm
        float wLPerDayRate1Gramm = 250;  // Gramm per day
        float wLPerDayRate2Gramm = 500;  // Gramm per day
        float wLPerDayRate1kGramm = wLPerDayRate1Gramm / 1000;  // kGramm per day
        float wLPerDayRate2kGramm = wLPerDayRate2Gramm / 1000;  // kGramm per day
        float wLPeriodRate1 = targetWLKg / wLPerDayRate1kGramm; //days
        float wLPeriodRate2 = targetWLKg / wLPerDayRate2kGramm; //days
        float meanWLPeriod;
        float meanWLRate;

        System.out.println(" При скорости потери веса " + wLPerDayRate2kGramm + " кг в день потребуется " + wLPeriodRate2 + " дней");
        System.out.println(" При скорости потери веса " + wLPerDayRate1kGramm + " кг в день потребуется " + wLPeriodRate1 + " дней");
        meanWLRate=(wLPerDayRate1kGramm+wLPerDayRate2kGramm)/2;
        meanWLPeriod=targetWLKg/meanWLRate;
        System.out.println(" Средняя скорость потери веса составляет  " + meanWLRate + " кг в день");
        System.out.println(" При  средней скорости потери веса " + meanWLRate + " кг в день потребуется " + meanWLPeriod + " дней");
    }
    public static void task8(){

        float annualSalaryMashaOld=67760f;
        float annualSalaryMashaNew=annualSalaryMashaOld * 1.1f;

        float annualSalaryDenisOld=83690;
        float annualSalaryDenisNew=annualSalaryDenisOld*1.1f;

        float annualSalaryKristineOld=76230;
        float annualSalaryKristineNew=annualSalaryKristineOld*1.1f;

        float annualIncomeMashaOld=annualSalaryMashaOld*12;
        float annualIncomeMashaNew=annualSalaryMashaNew*12;
        float annualIncomeMashaDiff=annualIncomeMashaNew-annualIncomeMashaOld;


        float annualIncomeDenisOld=annualSalaryDenisOld*12;
        float annualIncomeDenisNew=annualIncomeDenisOld*12;
        float annualIncomeDenisDiff=annualIncomeDenisNew-annualIncomeDenisOld;

        float annualIncomeKristineOld=annualSalaryKristineOld*12;
        float annualIncomeKristineNew=annualIncomeKristineOld*12;
        float annualIncomeKristineDiff=annualIncomeKristineNew-annualIncomeKristineOld;

        System.out.println("          ");
        System.out.println("Задача №8");

        System.out.println("Маша теперь получает " + annualSalaryMashaNew + " рублей. Годовой доход вырос на " + annualIncomeMashaDiff + " рублей");
        System.out.println("Денис теперь получает " + annualSalaryDenisNew + " рублей. Годовой доход вырос на " + annualIncomeDenisDiff + " рублей");
        System.out.println("Кристина теперь получает " + annualSalaryKristineNew + " рублей. Годовой доход вырос на " + annualIncomeKristineDiff + " рублей");

        System.out.println("          ");
        System.out.println("Задача №8");


    }
}
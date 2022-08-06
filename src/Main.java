public class Main {
    public static void main(String[] args) {
        byte apples = 100;
        short lemons = 30_000;
        int rabbits = 2_000_000_000;
        long carrot = 1_000_000_000_000_000_000L;
        float sugar = 25.75f;
        double water = 50.125;
        char error = 33;
        boolean enoughСarrot = carrot > rabbits;


        float firstSportsman = 78.2f;
        float secondSportsman = 82.7f;
        float totalWeight = firstSportsman + secondSportsman;
        float difference = secondSportsman - firstSportsman;
        System.out.println("Общий вес двух бойцов : " + totalWeight + " кг!" + '\n' + "Разница между весами бойцов : " + difference + " кг!");


        short bananas = 5;
        short milk = 200;
        short iceСream = 2;
        short egg = 4;
        short bananasMass = 80;
        short milkMass = 105;
        short milkMl = 100;
        short iceCreamMass = 100;
        short eggMass = 70;
        bananasMass *= bananas;
        milkMass *= (milk / milkMl);
        iceCreamMass *= iceСream;
        eggMass *= egg;
        double totalMass = bananasMass + milkMass + iceCreamMass + eggMass;
        double totalMassInKg = totalMass / 1000;
        System.out.println("Вес спорт-завтрака в граммах : " + (int)totalMass + '\n' + "Вес спорт-завтрака в киллограммах :" + totalMassInKg);


        double MinWeight = 0.25;
        double MaxWeight = 0.5;
        double needToLoseWeight = 7;
        double MaxDay = needToLoseWeight / MinWeight;
        double MinDay = needToLoseWeight / MaxWeight;
        double averageNumberOfDays = (MaxDay + MinDay) / 2;
        System.out.println("Максимум дней : " + (int)MaxDay + '\n' + "Минимум дней : " + (int)MinDay + '\n' + "Среднее кол-во дней : " + (int)averageNumberOfDays);


        int Masha = 67_760;
        int Denis = 83_690;
        int Kristina = 76_230;
        double persent = 0.1;
        double persentMasha = (double)Masha * persent;
        double persentDenis = (double)Denis * persent;
        double persentKristina = (double)Kristina * persent;
        double lastYearMasha = Masha * 12;
        double lastYearDenis = Denis * 12;
        double lastYearKristina = Kristina * 12;
        Masha += persentMasha;
        Denis += persentDenis;
        Kristina += persentKristina;
        double thisYearMasha = Masha * 12;
        double thisYearDenis = Denis * 12;
        double thisYearKristina = Kristina * 12;
        double differenceYearMasha = thisYearMasha - lastYearMasha;
        double differenceYearDenis = thisYearDenis - lastYearDenis;
        double differenceYearKristina = thisYearKristina - lastYearKristina;
        System.out.println("Маша теперь получает " + Masha + " рублей. " + "Годовой доход вырос на " + (int)differenceYearMasha + " рублей." + '\n' +
        "Денис теперь получает " + Denis + " рублей." + " Годовой доход вырос на " + (int)differenceYearDenis + " рублей." + '\n'+
        "Кристина теперь получает " + Kristina + " рублей. " + "Годовой доход вырос на " + (int)differenceYearKristina + "рублей.");
    }
}
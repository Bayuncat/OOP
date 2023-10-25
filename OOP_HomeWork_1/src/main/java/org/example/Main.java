package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* ХОЛОДНЫЕ НАПИТКИ*/
//        Создаем экз-ры класса водички
        BottleOfWater tarhun = new BottleOfWater("Тархун", 100, 500);
        BottleOfWater bargomi = new BottleOfWater("Баржоми", 200, 500);
        BottleOfWater dushes = new BottleOfWater("Дюшес", 100, 500);

//        Контрольная печать
        System.out.println(tarhun.toString() + "\n" + bargomi.toString() + "\n" + dushes.toString()+ "\n");

//        Создаем список экземпляров класса
        List<Product> waterlist = new ArrayList<>();
        waterlist.add(tarhun);
        waterlist.add(bargomi);
        waterlist.add(dushes);

//        Загружаем наш список в машину
        WaterVendingMashine load1 = new WaterVendingMashine(waterlist);

//        Выдаем воду по 2-м возможным методам
        System.out.println(load1.getProduct("Тархун", 500).toString());
        System.out.println(load1.getProduct("Баржоми").toString()+ "\n");

//     ******************************************************
        /* ГОРЯЧИЕ НАПИТКИ*/
//        Создаем экз-ры класса горячие напитки
        HotDrinks coffeB = new HotDrinks("Чёрный кофе", 100, 200, 80);
        HotDrinks coffeM = new HotDrinks("Молочный кофе", 200, 200, 70);
        HotDrinks chocolate = new HotDrinks("Шоколад", 250, 200, 60);

//        Контрольная печать
        System.out.println(coffeB.toString() + "\n" + coffeM.toString() + "\n" + chocolate.toString()+ "\n");

//        Создаем список экземпляров класса
        List<Product> drinkslist = new ArrayList<>();
        drinkslist.add(coffeB);
        drinkslist.add(coffeM);
        drinkslist.add(chocolate);

//        Загружаем наш список в машину
        HotDrinksVendingMashine load2 = new HotDrinksVendingMashine(drinkslist);

//        Выдаем воду по 3-м параметрам
        System.out.println(load2.getProduct("Чёрный кофе", 200, 80).toString());
        System.out.println(load2.getProduct("Шоколад", 200, 60).toString());

    }
}
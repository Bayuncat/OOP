package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* �������� �������*/
//        ������� ���-�� ������ �������
        BottleOfWater tarhun = new BottleOfWater("������", 100, 500);
        BottleOfWater bargomi = new BottleOfWater("�������", 200, 500);
        BottleOfWater dushes = new BottleOfWater("�����", 100, 500);

//        ����������� ������
        System.out.println(tarhun.toString() + "\n" + bargomi.toString() + "\n" + dushes.toString()+ "\n");

//        ������� ������ ����������� ������
        List<Product> waterlist = new ArrayList<>();
        waterlist.add(tarhun);
        waterlist.add(bargomi);
        waterlist.add(dushes);

//        ��������� ��� ������ � ������
        WaterVendingMashine load1 = new WaterVendingMashine(waterlist);

//        ������ ���� �� 2-� ��������� �������
        System.out.println(load1.getProduct("������", 500).toString());
        System.out.println(load1.getProduct("�������").toString()+ "\n");

//     ******************************************************
        /* ������� �������*/
//        ������� ���-�� ������ ������� �������
        HotDrinks coffeB = new HotDrinks("׸���� ����", 100, 200, 80);
        HotDrinks coffeM = new HotDrinks("�������� ����", 200, 200, 70);
        HotDrinks chocolate = new HotDrinks("�������", 250, 200, 60);

//        ����������� ������
        System.out.println(coffeB.toString() + "\n" + coffeM.toString() + "\n" + chocolate.toString()+ "\n");

//        ������� ������ ����������� ������
        List<Product> drinkslist = new ArrayList<>();
        drinkslist.add(coffeB);
        drinkslist.add(coffeM);
        drinkslist.add(chocolate);

//        ��������� ��� ������ � ������
        HotDrinksVendingMashine load2 = new HotDrinksVendingMashine(drinkslist);

//        ������ ���� �� 3-� ����������
        System.out.println(load2.getProduct("׸���� ����", 200, 80).toString());
        System.out.println(load2.getProduct("�������", 200, 60).toString());

    }
}
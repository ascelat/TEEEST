package org.example;

import java.util.Scanner;

public class CookingMenu {
    Scanner in = new Scanner(System.in);
    Component component = new Component();
    MainMenu mainMenu = new MainMenu();
    OrderLogMenu orderLogMenu = new OrderLogMenu();

    public void cookingMenuStart() {
        System.out.println("\nМеню приготовления\n" +
                "1 - Приготовить кофе;\n" +
                "2 - Рецепт напитка\n" +
                "3 - В начало");

        while (true) {
            int input = in.nextInt();
            if (input == 1) {
                cookingCoffe();
                break;
            } else if (input == 2) {
                formulaCoffe();
                break;
            } else if (input == 3) {
                mainMenu.infoMenu();
                break;
            } else {
                System.out.println("Нет. Ввели не верный вариант!");
            }
        }
    }

    public void cookingCoffe() {
        System.out.println("1 - Капучино;\n" +
                "2 - Эспрессо");

        while (true) {
            int input = in.nextInt();
            if (input == 1) {
                cappuccino();
                break;
            } else if (input == 2) {
                espresso();
                break;
            } else {
                System.out.println("Нет. Ввели не верный вариант!");
            }
        }
    }

    public void formulaCoffe() {
        System.out.println("1 - Капучино;\n" +
                "2 - Эспрессо");

        while (true) {
            int input = in.nextInt();
            if (input == 1) {
                System.out.println("Рецепт Капучино:\n" +
                        "1 - Стакан воды(50мл)\n" +
                        "2 - Одна(две) кубиков сахара\n" +
                        "3 - Молоко(100мл)\n" +
                        "4 - Коффе(35г)");
                break;
            } else if (input == 2) {
                System.out.println("Рецепт Эспрессо\n" +
                        "1 - Стакан воды(100мл)\n" +
                        "2 - Одна(две) кубиков сахара\n" +
                        "3 - Молоко(100мл)\n" +
                        "4 - Коффе(50г)");
                break;
            } else {
                System.out.println("Нет. Ввели не верный вариант!");
            }
        }
        cookingMenuStart();
    }

    public void cappuccino() {
        System.out.println("1 - Одна кружка;\n" +
                "2 - Две кружки\n" +
                "3 - Три кружки");

        while (true) {
            int input = in.nextInt();
            switch (input) {
                case 1:
                    cappuccino(1);
                    break;
                case 2:
                    cappuccino(2);
                    break;
                case 3:
                    cappuccino(3);
                    break;
            }
        }
    }

    public void espresso() {
        System.out.println("1 - Одна кружка;\n" +
                "2 - Две кружки\n" +
                "3 - Три кружки");

        while (true) {
            int input = in.nextInt();
            switch (input) {
                case 1:
                    espresso(1);
                    break;
                case 2:
                    espresso(2);
                    break;
                case 3:
                    espresso(3);
                    break;
            }
        }
    }

    public void cappuccino(int cup) {
        if (cup == 1) {
            if (component.getCoffe() >= 35 && component.getMilk() >= 100 && component.getWater() >= 50) {
                System.out.println("Приготовление одной кружки Капучино выполняется...");
                component.setWaterDeduct(50);
                component.setMilkDeduct(100);
                component.setCoffeDeduct(35);
                System.out.println("Напиток готов. Можете забирать");
            }else {
                System.out.println("Недостаточно ингридиентов в машине!!!");
            }
        } else if (cup == 2) {
            if (component.getCoffe() >= 35 * cup & component.getMilk() >= 100 * cup & component.getWater() >= 50 * cup) {
                System.out.println("Приготовление двух кружек Капучино выполняется...");
                component.setWaterDeduct(50 * cup);
                component.setMilkDeduct(100 * cup);
                component.setCoffeDeduct(35 * cup);
                System.out.println("Напитки готовы. Можете забирать");
            }else {
                System.out.println("Недостаточно ингридиентов в машине!!!");
            }
        } else if (cup == 3) {
            if (component.getCoffe() >= 35 * cup & component.getMilk() >= 100 * cup & component.getWater() >= 50 * cup) {
                System.out.println("Приготовление трех кружек Капучино выполняется...");
                component.setWaterDeduct(50 * cup);
                component.setMilkDeduct(100 * cup);
                component.setCoffeDeduct(35 * cup);
                System.out.println("Напитки готовы. Можете забирать");
            }else {
                System.out.println("Недостаточно ингридиентов в машине!!!");
            }
        }
        cookingMenuStart();
    }

    public void espresso ( int cup){
        if (cup == 1) {
            if (component.getCoffe() >= 35 & component.getMilk() >= 100 & component.getWater() >= 50) {
                System.out.println("Приготовление одной кружки Эспрессо выполняется...");
                component.setWaterDeduct(50);
                component.setMilkDeduct(100);
                component.setCoffeDeduct(35);
                System.out.println("Напиток готов. Можете забирать");
            }else {
                System.out.println("Недостаточно ингридиентов в машине!!!");
            }
        } else if (cup == 2) {
            if (component.getCoffe() >= 35 * cup & component.getMilk() >= 100 * cup & component.getWater() >= 50 * cup) {
                System.out.println("Приготовление двух кружек Эспрессо выполняется...");
                component.setWaterDeduct(50 * cup);
                component.setMilkDeduct(100 * cup);
                component.setCoffeDeduct(35 * cup);
                System.out.println("Напитки готовы. Можете забирать");
            } else {
                System.out.println("Недостаточно ингридиентов в машине!!!");
            }
        } else if (cup == 3) {
            if (component.getCoffe() >= 35 * cup & component.getMilk() >= 100 * cup & component.getWater() >= 50 * cup) {
                System.out.println("Приготовление трех кружек Эспрессо выполняется...");
                component.setWaterDeduct(50 * cup);
                component.setMilkDeduct(100 * cup);
                component.setCoffeDeduct(35 * cup);
                System.out.println("Напитки готовы. Можете забирать");
            }else {
                System.out.println("Недостаточно ингридиентов в машине!!!");
            }
        }
        cookingMenuStart();
    }

}
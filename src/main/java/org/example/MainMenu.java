package org.example;

import java.util.Scanner;

public class MainMenu {
    static Scanner in = new Scanner(System.in);
    static CoffeMachine coffeMachine;

    MainMenu() {}

    MainMenu(CoffeMachine coffeMachine) {
        this.coffeMachine = coffeMachine;
    }

    protected static void infoMenu(){
        System.out.println("Меню коффе машины:\n" +
                "1 - Приготовить напиток\n" +
                "2 - Добавить ингридиенты\n" +
                "3 - Профили\n" +
                "4 - Отчистка коффе машины\n" +
                "5 - История заказов");
        switchMenuNext();
    }

    private static void switchMenuNext(){
        CookingMenu cookingMenu = new CookingMenu();
        AddMenu add = new AddMenu();
        ProfileMenu prof = new ProfileMenu();
        CleaningMenu cleaningMenu = new CleaningMenu();
        OrderLogMenu order = new OrderLogMenu();

        System.out.println("Выберите необходимый вариант в меню");

        CoffeMachine inputMenu = switchMenu();

        switch (inputMenu){
            case MAIN_MENU:
                infoMenu();
                break;
            case COOKING_MENU:
                cookingMenu.cookingMenuStart();
                break;
            case ADD_MENU:
                add.add();
                break;
            case PROFILE_MENU:
                prof.profile();
                break;
            case CLEANING_MENU:
                cleaningMenu.cleaningMachine();
                break;
            case ORDER_LOG_MENU:
                order.order();
                break;
            default:
                System.out.println("Попробуйте еще раз!");
        }
    }

    private static CoffeMachine switchMenu() {
        int a = in.nextInt();

        while (true) {
            switch (a){
                case 0:
                    return CoffeMachine.MAIN_MENU;
                case 1:
                    return CoffeMachine.COOKING_MENU;
                case 2:
                    return CoffeMachine.ADD_MENU;
                case 3:
                    return CoffeMachine.PROFILE_MENU;
                case 4:
                    return CoffeMachine.CLEANING_MENU;
                case 5:
                    return CoffeMachine.ORDER_LOG_MENU;
                default:
                    System.out.println("Не верно");
            }
        }
    }
}

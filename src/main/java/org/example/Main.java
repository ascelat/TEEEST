package org.example;

import java.util.Scanner;

public class Main extends MainMenu {
    static Scanner in = new Scanner(System.in);
    private static boolean flag = false;
    public static void main(String[] args) {
        switchOnOfMachine();
    }

    private static void switchOnOfMachine(){
        System.out.println("Коффе машина\n" +
                "Для использования машины необходимо включить машину\n" +
                "1 - Включить машину;\n" +
                "0 - Выключить машину;");

        while(true) {
            int switchOnOf = in.nextInt();
            if(startMachine(switchOnOf) && flag == false){
                System.out.println("Коффе машина включена");
                flag = true;
                infoMenu();
                break;
            }else if(startMachine(switchOnOf) && flag == true){
                System.out.println("Коффе машина выключена");
                flag = false;
                break;
            }else {
                System.out.println("Вы не включили коффе машину. Попробуйте еще раз");
            }
        }
    }
    private static boolean startMachine(int buttonOnOff) {
        return buttonOnOff == 1;
    }
}

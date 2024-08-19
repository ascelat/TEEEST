package org.example;

public class Component {
    private final int maxMilk = 500;
    private final int maxWater = 500;
    private final int maxCoffe = 300;

    private static int milk;
    private static int water;
    private static int coffe;

    Component() {
        milk = maxMilk;
        water = maxWater;
        coffe = maxCoffe;
    }

    public int getMaxMilk() { return maxMilk; }
    public int getMaxWater() { return maxWater; }
    public int getMaxCoffe() { return maxCoffe; }

    public int getMilk() { return milk;}

    public void setMilkAdd(int milk) {
        if(milk < maxMilk && this.milk + milk <= maxMilk) {
            this.milk += milk;
            System.out.println("Добавлено молоко: " + milk);
        } else if(this.milk + milk > maxMilk){
            System.out.println("Добавить молока не получится! Кол-во молока: " + this.milk +"\n" +
                    "Предельное количество молока в коффе машине равняется: \n" + maxMilk +
                    "Необходимо добавить молока: " + (maxMilk - milk));
            System.out.println("Измените кол-во добавляемого молока!");
        }
    }
    public void setMilkDeduct(int milk){
        if(this.milk - milk >= 0){
            this.milk -= milk;
            System.out.println("Молоко использовалось для приготовления: " + milk);
        } else {
            System.out.println("Молока не хватает! Добавте молоко!");
        }
    }

    public int getWater() { return water;}
    public void setWaterAdd(int water) {
        if(water < maxWater && this.water + water <= maxWater) {
            this.water += water;
            System.out.println("Добавлена вода: " + water);
        } else if(this.water + water > maxWater){
            System.out.println("Добавить воды не получится! Кол-во воды: " + this.water +"\n" +
                    "Предельное количество воды в коффе машине равняется: \n" + maxWater +
                    "Необходимо добавить воды: " + (maxWater - water));
            System.out.println("Измените кол-во добавляемого воды!");
        }
    }
    public void setWaterDeduct(int water){
        if(this.water - water >= 0){
            this.water -= water;
            System.out.println("Вода использовалась для приготовления: " + water);
        } else {
            System.out.println("Воды не хватает! Добавте воды!");
        }
    }

    public int getCoffe() { return coffe;}
    public void setCoffeAdd(int coffe) {
        if(coffe < maxCoffe && this.coffe + coffe <= maxCoffe) {
            this.coffe += coffe;
            System.out.println("Добавлено коффе: " + coffe);
        } else if(this.coffe + coffe > maxCoffe){
            System.out.println("Добавить коффе не получится! Кол-во коффе: " + this.coffe +"\n" +
                    "Предельное количество коффе в коффе машине равняется: \n" + maxCoffe +
                    "Необходимо добавить коффе: " + (maxCoffe - coffe));
            System.out.println("Измените кол-во добавляемого коффе!");
        }
    }
    public void setCoffeDeduct(int coffe){
        if(this.coffe - coffe >= 0){
            this.coffe -= coffe;
            System.out.println("Коффе использовалось для приготовления: " + coffe);
        } else {
            System.out.println("Коффе не хватает! Добавте коффе!");
        }
    }
}

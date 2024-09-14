package ru.netology;

public class Main {

    public static void main(String[] args) {
        ShopRepository repo = new ShopRepository();

        try {
            repo.removeById(-100);
            //System.out.println("Hello!");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка");
        }


    }
}
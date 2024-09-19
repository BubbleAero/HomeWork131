package ru.netology;

public class Main {

    public static void main(String[] args) {
        ShopRepository repo = new ShopRepository();

        try {
            repo.remove(-100);
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка");
        }


    }
}
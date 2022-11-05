package ua.edu.ucu.apps.demo;

import ua.edu.ucu.apps.demo.flower.Flower;
import ua.edu.ucu.apps.demo.flower.Item;
import ua.edu.ucu.apps.demo.flower.ItemDiscount;

public class Main {
    public static void main(String[] args) {
        Item flower = new Flower("blue", 100, 100, 1l);
        flower = new ItemDiscount(flower);
        System.out.println(flower.getPrice());
    }
}

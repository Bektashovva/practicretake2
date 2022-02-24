package com.company;

public class Peperoni {
    private int price;
    private double weight;
    public Peperoni(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }


    public static void cook(){
        System.out.println("Готовим вашу пиццу № 1 (не острая)" );
    }

    public static void cookSpicy(){
        System.out.println("Готовим вашу пиццу № 1 (острая)");
    }


    public void deliver(){
        System.out.println("Пицца: Пепперони" + "\nВес: " + weight + " грамм" +
                "\nЦена: " + price);
        System.out.println("В скором времени ваш заказ будет доставлен! ");
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Пицца: Пипперони" + "\nВес: " + weight + " грамм" +
                "\nЦена: " + price;
    }
}

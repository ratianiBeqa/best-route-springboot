package com.example.demo.bestroute;

public class Transfer {
    private int weight;
    private int cost;

    public Transfer(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "weight=" + weight +
                ", cost=" + cost +
                '}';
    }
}

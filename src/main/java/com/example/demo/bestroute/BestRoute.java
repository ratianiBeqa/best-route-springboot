package com.example.demo.bestroute;

import java.util.List;

public class BestRoute {
    private int totalCost;
    private int totalWeight;
    private List<Transfer> selectedTransfers;

    public BestRoute(int totalCost, int totalWeight, List<Transfer> selectedTransfers) {
        this.totalCost = totalCost;
        this.totalWeight = totalWeight;
        this.selectedTransfers = selectedTransfers;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public List<Transfer> getSelectedTransfers() {
        return selectedTransfers;
    }

    public void setSelectedTransfers(List<Transfer> selectedTransfers) {
        this.selectedTransfers = selectedTransfers;
    }

    @Override
    public String toString() {
        return "BestRoute{" +
                "totalCost=" + totalCost +
                ", totalWeight=" + totalWeight +
                ", selectedTransfers=" + selectedTransfers +
                '}';
    }
}

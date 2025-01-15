package com.example.demo.bestroute;

import java.util.List;

public class BestRouteRequest {
    private int maxWeight;
    private List<Transfer> availableTransfers;

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public List<Transfer> getAvailableTransfers() {
        return availableTransfers;
    }

    public void setAvailableTransfers(List<Transfer> availableTransfers) {
        this.availableTransfers = availableTransfers;
    }
}

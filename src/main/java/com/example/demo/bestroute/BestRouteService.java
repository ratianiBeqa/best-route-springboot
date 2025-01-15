package com.example.demo.bestroute;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BestRouteService {

    // გამოვიყენე dfs რეკურსია საუკეთესო გზის საპოვნელად.

    public BestRoute calculateBestRoute(int maxWeight, List<Transfer> availableTransfers) {
        List<List<Transfer>> allCombinations = new ArrayList<>();
        
        List<Transfer> subset = new ArrayList<>();
        dfs(availableTransfers, 0, subset, allCombinations);

        int maxCost = 0;
        List<Transfer> bestSelection = new ArrayList<>();

        for (List<Transfer> combination : allCombinations) {
            int totalWeight = 0;
            int totalCost = 0;

            for (Transfer transfer : combination) {
                totalWeight += transfer.getWeight();
                totalCost += transfer.getCost();
            }

            if (totalWeight <= maxWeight && totalCost > maxCost) {
                maxCost = totalCost;
                bestSelection = new ArrayList<>(combination);
            }
        }

        int totalWeight = 0;
        for (Transfer transfer : bestSelection) {
            totalWeight += transfer.getWeight();
        }
        return new BestRoute(maxCost, totalWeight, bestSelection);
    }

    private void dfs(List<Transfer> availableTransfers, int index, List<Transfer> subset, List<List<Transfer>> result) {
        if (index == availableTransfers.size()) {
            result.add(new ArrayList<>(subset));
            return;
        }

        // გამოვიყენოთ ახლანდელი ტრანსფერი
        subset.add(availableTransfers.get(index));
        dfs(availableTransfers, index + 1, subset, result);

        // არ გამოვიყენოთ ახლანდელი ტრანსფერი
        subset.remove(subset.size() - 1);
        dfs(availableTransfers, index + 1, subset, result);
    }
}

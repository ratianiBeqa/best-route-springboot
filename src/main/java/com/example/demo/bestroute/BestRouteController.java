package com.example.demo.bestroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/bestroute")
public class BestRouteController {

    private final BestRouteService bestRouteService;

    @Autowired
    public BestRouteController(BestRouteService bestRouteService) {
        this.bestRouteService = bestRouteService;
    }

    @GetMapping
    public BestRoute getBestRoute(@RequestBody BestRouteRequest request) {
        return bestRouteService.calculateBestRoute(request.getMaxWeight(), request.getAvailableTransfers());
    }
}
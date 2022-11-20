package com.example.bucket.controller;

import com.example.bucket.model.Item;
import com.example.bucket.service.BucketService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BucketController {
    private final BucketService bucketService;

    public BucketController(BucketService bucketService) {
        this.bucketService = bucketService;
    }

    @PostMapping("localhost:8080//store/order/add")
    public ArrayList<Integer> creatItem(@RequestParam("id") List<Integer> id) {
        return this.bucketService.addItem(id);
    }

    @GetMapping("localhost:8080//store/order/get")
    public void getAllItem() {
        bucketService.getAllItems();
    }
}

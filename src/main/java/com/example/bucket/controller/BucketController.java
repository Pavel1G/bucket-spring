package com.example.bucket.controller;

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

    @GetMapping("/store/order/add")
    public ArrayList<Integer> creatItem(@RequestParam("id") List<Integer> id) {
        return this.bucketService.addItem(id);
    }

    @GetMapping("/store/order/get")
    public void getAllItem() {
        bucketService.getAllItems();
    }
}

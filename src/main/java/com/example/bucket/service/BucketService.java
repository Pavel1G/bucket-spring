package com.example.bucket.service;

import com.example.bucket.model.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
//Session — является веб-скоупом. Новый объект создается на время существование сессии
// и закрепляется за конкретным браузером. Все запросы с определенного браузера в течение определенного
// промежутка времени будут работать с одним объектом.
// При обращении с другого браузера или через длительный период будет открыта новая сессия и создан новый объект.
public class BucketService {
    public ArrayList<Integer> buckets = new ArrayList<>();

    public void getAllItems() {
        this.buckets.stream()
                .forEach(System.out::println);
    }


    public ArrayList<Integer> addItem(List<Integer> id) {
        List<Item> listItem = new LinkedList<>();
        for(Integer integer: id){
            Item item = new Item(integer);
            this.buckets.add(item.getId());
        }
        return buckets;
    }
}

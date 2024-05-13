package pro.sky.spring_2_10.store.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pro.sky.spring_2_10.store.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class ItemsController {
    private final OrderService orderService;

    @PostMapping ("/add")
    public List<Integer> addItems (@RequestParam List <Integer> idList) {
        return orderService.addItems(idList);
    }

    @GetMapping("/get")
    public List<Integer> getItems (){
        return orderService.getItems();
    }


}

package pro.sky.spring_2_10.store.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pro.sky.spring_2_10.store.component.Cart;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final Cart cart;

    @Override
    public List<Integer> addItems(List<Integer> idList) {
        return cart.addItems(idList);
    }

    @Override
    public List<Integer> getItems(){
        return cart.getItems();
    }
}

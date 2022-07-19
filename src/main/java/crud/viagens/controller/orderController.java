package crud.viagens.controller;

import crud.viagens.repository.OrderRepo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import crud.viagens.model.Order;

@RestController
@RequestMapping("/order")
public class orderController {
    
    @Autowired
    private OrderRepo RepoOrder ;


    @GetMapping
    public List<Order> listAll() {
        return RepoOrder.findAll();
    }

    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        RepoOrder.save(order);
        return order;
    }

    @DeleteMapping("/{id}")
    public Order removeOrder(@RequestBody Order order) {
        RepoOrder.delete(order);
        return order; 
    }

}

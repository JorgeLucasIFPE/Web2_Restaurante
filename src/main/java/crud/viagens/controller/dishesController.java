package crud.viagens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import crud.viagens.model.Dish;
import crud.viagens.repository.RepoDishes;

@RestController
@RequestMapping("/dishes")
public class dishesController {
 
    @Autowired
    private RepoDishes DishesRepo;

    @GetMapping()
    public List<Dish> listAll(){
        return DishesRepo.findAll();
    }

    @GetMapping("/{id}")
    public Dish getOne(@PathVariable("id") Long id){ 
        final Dish dish = DishesRepo.findById(id).orElse(null);
        return dish;
        
    }

    @PostMapping
    public Dish addDish(@RequestBody Dish dish) {
        DishesRepo.save(dish);
        return dish;
    }


    @DeleteMapping("/{id}")
    public Dish removeDish(@RequestBody Dish dish) {
        DishesRepo.delete(dish);
        return dish;
    }
}

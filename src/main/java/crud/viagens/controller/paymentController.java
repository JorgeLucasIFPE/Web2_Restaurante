package crud.viagens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import crud.viagens.model.Payment;
import crud.viagens.repository.RepoPayment;

@RestController
@RequestMapping("/payment")
public class paymentController {
    
    @Autowired
    private RepoPayment PaymentRepo;

    @GetMapping
    public List<Payment> listAll() {
        return PaymentRepo.findAll();
    }

    @PostMapping
    public Payment addPayment(@RequestBody Payment payment) {
        PaymentRepo.save(payment);
        return payment;
    }

    @DeleteMapping("/{id}")
    public Payment removePayment(@RequestBody Payment payment) {
        PaymentRepo.delete(payment);
        return payment; 
    }
}

package crud.viagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.viagens.model.Payment;

@Repository
public interface RepoPayment extends JpaRepository<Payment, String> {
    
}


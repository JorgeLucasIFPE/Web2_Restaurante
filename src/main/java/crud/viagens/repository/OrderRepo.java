package crud.viagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.viagens.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, String> {
    
}

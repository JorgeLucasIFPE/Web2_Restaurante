package crud.viagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.viagens.model.Dish;

@Repository
public interface RepoDishes extends JpaRepository<Dish, Long> {}
package crud.viagens.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.viagens.model.Client;

@Repository
public interface RepoClient extends JpaRepository<Client, String>{

    Client findByEmail(String email);
    
}

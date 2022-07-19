package crud.viagens.use_case;

import org.springframework.beans.factory.annotation.Autowired;

import crud.viagens.model.Client;
import crud.viagens.repository.RepoClient;

public class login {

    @Autowired
    private  RepoClient ClientRepo;

    public boolean loginValidator(String email, String password) {
        Client client = ClientRepo.findByEmail(email);
        if (client.getPassword() != password) {
            return false;
        } 
        return true;
        
    }

  
    
}

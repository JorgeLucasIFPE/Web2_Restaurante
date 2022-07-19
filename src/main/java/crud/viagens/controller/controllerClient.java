package crud.viagens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import crud.viagens.model.Client;
import crud.viagens.repository.RepoClient;



@RestController
@RequestMapping("/clients")
public class controllerClient {

    @Autowired
    private  RepoClient ClientRepo; 

    @GetMapping
    public List<Client> listAll() {
        return ClientRepo.findAll();
    }

    @PostMapping("/login")
    public boolean login(@RequestBody Client client) {
        boolean login =loginValidator(client.getEmail(),client.getPassword());
        return login;
    }
    
    public boolean loginValidator(String email, String password) {
            Client client = ClientRepo.findByEmail(email);
            if (!client.getPassword().equals(password)) {
                System.out.println("Senha incorreta!");
                return false;
            } else {
            System.out.println("Logado!");
            return true;
        }
    };

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client addClient(@RequestBody Client client) {
        ClientRepo.save(client);
        return client;
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public Client removeClient(@RequestBody Client client) {
        ClientRepo.delete(client);
        return client; 
    }
}

package crud.viagens.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    
    private Long id_dish; 

    @Column
  
    private Long id_user;

    @Column
    
    private Long paymentMethod;

    @Column
    private Long dateTime;

    @Column
    private double price;

    @Column
    private String observation;

    
    public Long getId_dish() {
        return id_dish;
    }

    public void setId_dish(Long id_dish) {
        this.id_dish = id_dish;
    }

    public Long getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Long paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDateTime() {
        return dateTime;
    }

    public void setDateTime(Long dateTime) {
        this.dateTime = dateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    
}

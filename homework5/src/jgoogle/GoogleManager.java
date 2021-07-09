package jgoogle;

import entities.concretes.Customer;

public class GoogleManager {
    public void googleRegister(Customer customer){
        System.out.println(customer.getName()+"adli kullanici google ile kayit oldu");
    }
}

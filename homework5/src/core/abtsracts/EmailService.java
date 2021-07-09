package core.abtsracts;

import entities.concretes.Customer;

public interface EmailService {
    boolean checkMail(Customer customer);
    void sendMail(Customer customer);
    
}

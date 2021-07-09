package business.abstracts;

import entities.concretes.Customer;

public interface CustomerService {
    void add(Customer customer);
    void delete(Customer customer);
    void update(Customer customer);
    void login(Customer customer);
}

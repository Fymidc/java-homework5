package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class HibernateCustomer implements CustomerDao{

    @Override
    public void add(Customer customer) {
        System.out.println(customer.getName()+"\nadli kullanici hibernate eklendi\n");

    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getName()+"adli kullanici hibernateden silindi");

    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getName()+"adli kullanici hibernate güncellendi");

    }
    
}

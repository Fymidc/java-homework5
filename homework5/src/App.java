import business.abstracts.CustomerService;
import business.concretes.CustomerManager;
import core.concretes.EmailManager;
import core.concretes.GoogleManagerAdapter;
import dataAccess.concretes.HibernateCustomer;
import entities.concretes.Customer;

public class App {
    public static void main(String[] args) throws Exception {



        CustomerService customerService = new CustomerManager(new HibernateCustomer(), new EmailManager(),new GoogleManagerAdapter());

        Customer customer = new Customer("fatih","bodur","bodurfatih1967@gmail.com","3513513515");
        Customer customer2 = new Customer("babababa","babababababa","bababababa@gmail.com","3351555222");

        customerService.add(customer);
        customerService.add(customer2);
        customerService.login(customer);
        customerService.login(customer2);

    }
}

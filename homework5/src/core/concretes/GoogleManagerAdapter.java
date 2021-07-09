package core.concretes;

import core.abtsracts.GoogleManagerService;
import entities.concretes.Customer;
import jgoogle.GoogleManager;

public class GoogleManagerAdapter implements GoogleManagerService{

    @Override
    public void registerToGoogle(Customer customer) {
        GoogleManager googleManager = new GoogleManager();
        googleManager.googleRegister(customer);
        
    }
    
}

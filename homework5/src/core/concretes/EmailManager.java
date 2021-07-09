package core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.abtsracts.EmailService;
import entities.concretes.Customer;

public class EmailManager implements EmailService {

    private Pattern EMAİL_PATTERN =Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    @Override
    public boolean checkMail(Customer customer) {
        Matcher matcher = EMAİL_PATTERN.matcher(customer.geteMail());
        return matcher.find();
    }

    @Override
    public void sendMail(Customer customer) {
        System.out.println("uyeliginizi dogrulamak icin " + customer.geteMail()+"adresine gonderilen maile tiklayiniz!");
        
    }
    
}

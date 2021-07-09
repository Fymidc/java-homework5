package business.concretes;

import java.util.ArrayList;

import business.abstracts.CustomerService;
import core.abtsracts.EmailService;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;
import core.abtsracts.GoogleManagerService;

public class CustomerManager implements CustomerService{

    //email adreslerinin saklanması için array oluşturuldu
    ArrayList<String>eMail=new ArrayList<String>();
    //kullanıcı şifreleri için array oluşturuldu
    ArrayList<String>password=new ArrayList<String>();

    private CustomerDao customerDao;
    private EmailService emailService;
    private GoogleManagerService googleManagerService;



    public CustomerManager( CustomerDao customerDao,EmailService emailService,GoogleManagerService googleManagerService){
        this.customerDao=customerDao;
        this.emailService=emailService;
        this.googleManagerService =googleManagerService;
    }

    @Override
    public void add(Customer customer) {
        if(customer.getName().length()<2 || customer.getLastName().length()<2){
            System.out.println("kullanici adi ve soyadi en az iki karakterden olusmalidir");
        }else if(customer.getPassword().length()<6){
            System.out.println("girdiginiz parola en az 6 karakterden olusmalidir");

        }else if(eMail.contains(customer.geteMail())){
            System.out.println("girilen email adresi kullanilmaktadir! \n lütfen baska bir mail adresi kullanınız!\n");

        }else if(customer.getPassword().length()>6 && emailService.checkMail(customer)==true){
            customerDao.add(customer);
            eMail.add(customer.geteMail());
            password.add(customer.getPassword());
            googleManagerService.registerToGoogle(customer);
        }
        
    }

    @Override
    public void delete(Customer customer) {
        customerDao.delete(customer);
        
    }

    @Override
    public void update(Customer customer) {
        customerDao.update(customer);
        
    }

    //kullanıcı adı ve şifresi arrayde varmı yokmu kontrolü yapılıp kayıtlıysa giriş sağlanır
    @Override
    public void login(Customer customer) {
        if(eMail.contains(customer.geteMail()) && password.contains(customer.getPassword())){
            System.out.println(customer.getName()+" adli kullanici sisteme giris yaptı");
        }else{
            System.out.println("lütfen kullanıcı adı ve sifrenizi kontrol ediniz");
        }
        
    }
    
}

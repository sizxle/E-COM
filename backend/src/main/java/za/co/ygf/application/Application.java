package za.co.ygf.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import za.co.ygf.domain.Customer;
import za.co.ygf.domain.common.Address;
import za.co.ygf.service.CustomerService;

import javax.persistence.Entity;
import java.time.LocalDate;

@SpringBootApplication(scanBasePackages="za.co.ygf")
@EntityScan(basePackages = "za.co.ygf.domain")
public class Application {

    public static void main(String[] args) {

        Address address = new Address("Home", "Zeerust", "2880");

        Customer customer = new Customer("cus111","jane","molefi","sthembizomolefi@gmail.com","0981231234", LocalDate.now(),"password",address);

        ApplicationContext ctx=SpringApplication.run(Application.class, args);

        System.out.println(ctx.getApplicationName());

        CustomerService customerService = (CustomerService) ctx.getBean("CustomerService");
        System.out.println("here");

        customerService.registerCustomer(customer);

//        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }


    }
}

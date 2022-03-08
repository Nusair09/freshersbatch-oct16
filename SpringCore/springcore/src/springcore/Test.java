package springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");

        // using the setter injection
        customer customer=(customer) context.getBean("customer");
        customer.customerDetail();

        // using constructor injection
        customer customerCon=(customer) context.getBean("customerCon");
        customerCon.customerDetail();

    }
}
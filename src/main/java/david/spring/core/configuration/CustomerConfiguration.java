package david.spring.core.configuration;

import david.spring.core.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CustomerConfiguration {

    @Primary
    @Bean
    public CustomerRepository normalCustomerRepository(){
        return new CustomerRepository();
    }
    @Bean
    public CustomerRepository premiumCustomerRepository(){
        return new CustomerRepository();
    }


}

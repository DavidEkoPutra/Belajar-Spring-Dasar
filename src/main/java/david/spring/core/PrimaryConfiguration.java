package david.spring.core;

import david.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryConfiguration {

    @Primary
    //agar bean tidak bingung
    @Bean
    public Foo foo1(){
        return new Foo();
    }
    @Bean
    public Foo foo2(){
        return new Foo();
    }

}

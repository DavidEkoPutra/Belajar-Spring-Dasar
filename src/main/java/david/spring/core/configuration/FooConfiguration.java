package david.spring.core.configuration;

import david.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {
    @Bean
    public Foo foo(){
        return new Foo();
    }
    @Bean
    public Foo foo2(){
        return new Foo();
    }
    @Bean
    public Foo foo3(){
        return new Foo();
    }

}

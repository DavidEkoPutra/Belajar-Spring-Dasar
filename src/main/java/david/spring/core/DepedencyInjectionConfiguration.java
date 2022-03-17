package david.spring.core;

import david.spring.core.data.Bar;
import david.spring.core.data.Foo;
import david.spring.core.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DepedencyInjectionConfiguration {

    @Primary
    @Bean
    public Foo fooFirst(){
        return new Foo();
    }

    @Bean
    public Foo fooSecond(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar){
        return new FooBar(foo,bar);
    }
}

package david.spring.core;

import david.spring.core.data.Bar;
import david.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Slf4j
@Configuration
public class DepedencyOnConfiguration {
    @Bean
    @DependsOn({
            "bar"
    })
    public Foo foo(){
        log.info("Create New Foo");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Create New Bar");
        return  new Bar();
    }
}

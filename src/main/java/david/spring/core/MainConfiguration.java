package david.spring.core;

import david.spring.core.configuration.BarConfiguration;
import david.spring.core.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})

public class MainConfiguration {

}

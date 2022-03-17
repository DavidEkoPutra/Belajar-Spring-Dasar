package david.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "david.spring.core.configuration"
})
public class ScanConfiguration {
}

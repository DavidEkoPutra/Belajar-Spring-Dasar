package david.spring.core;

import com.sun.org.apache.xpath.internal.operations.Mult;
import david.spring.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "david.spring.core.repository",
        "david.spring.core.service",
        "david.spring.core.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}

package david.spring.core;

import david.spring.core.service.MerchantService;
import david.spring.core.service.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        MerchantServiceImpl.class
})
public class InheritenceConfiguration {
}

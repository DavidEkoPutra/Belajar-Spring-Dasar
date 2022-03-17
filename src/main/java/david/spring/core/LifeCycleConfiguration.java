package david.spring.core;

import david.spring.core.data.Connection;
import david.spring.core.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {
    @Bean
    public Connection connection(){
        return  new Connection();
    }

    @Bean//(initMethod = "start",destroyMethod = "stop")
    public Server server(){
        return  new Server();
    }
}

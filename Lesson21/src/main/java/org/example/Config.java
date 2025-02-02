package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@Configuration
@Profile(value = "dev")
public class Config {

    @Bean
    public MyService service(MyRepo repository) {
        return new MyService(repository);
    }

    @Bean
    public MyRepo repository() {
        MyRepo myRepo = new MyRepo();
        myRepo.setName("dev");
        return myRepo;
    }

    @Bean
    public ConfigurableEnvironment configurableEnvironment() {
        return new StandardEnvironment();
    }
}

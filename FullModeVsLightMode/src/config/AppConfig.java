package config;
import bean.SpringBeanOne;
import bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {

    @Bean
    public SpringBeanOne getBeanOne() {
        //Inter Bean dependency
        SpringBeanTwo springBeanTwo = new SpringBeanTwo();

        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo getBeanTwo() {
        return new SpringBeanTwo();
    }


}

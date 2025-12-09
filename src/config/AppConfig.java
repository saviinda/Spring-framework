package config;
import bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//Bean definition walta source ekak
//how to scan pojos and enter to the application context


@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {
    {
        System.out.println("App Config Object Created");
    }
    @Bean
    public MyConnection getConnection(){
        return new MyConnection();
    }
}

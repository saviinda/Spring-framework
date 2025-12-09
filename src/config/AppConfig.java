package config;
import bean.MyConnection;
import bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


//Bean definition walta source ekak
//how to scan pojos and enter to the application context


@Configuration
@ComponentScan(basePackages = "bean")
//@ComponentScan(basePackageClasses = SpringBeanOne.class)      //Scan All the classes and sub classes in the package
public class AppConfig {
    {
        System.out.println("App Config Object Created");
    }

    //When we are not allowed to use @Component annotation , we can use this method to introduce a spring bean to the application context
    @Bean
    public MyConnection getConnection(){
        return new MyConnection();
    }
}

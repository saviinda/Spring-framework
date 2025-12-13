package config;
import bean.MyBasicDataSource;
import bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {

        @Bean
        public MyBasicDataSource basicDataSource() {

            //Inter-bean Dependency   (Auto object ekak spring create krla denw mn create krn oni nah)
            MyConnection myConnection1 =  myConnection();

            MyBasicDataSource myBasicDataSource = new MyBasicDataSource();
            myBasicDataSource.setMyConnection(myConnection1);

            return  myBasicDataSource;
        }

        @Bean
        public MyConnection myConnection() {
            return new MyConnection();
        }

}

import bean.SpringBeanOne;
import bean.SpringBeanTwo;
import bean.SpringBeanThree;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        //ShutDown Hook
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.out.println("JVM is about to shut down");
            }
        });

        SpringBeanOne beanOne = ctx.getBean(SpringBeanOne.class);
        SpringBeanTwo beanTwo = ctx.getBean(SpringBeanTwo.class);
        System.out.println(beanOne);
        System.out.println(beanTwo);

        ctx.close();

        SpringBeanThree beanThree = ctx.getBean(SpringBeanThree.class);
        System.out.println(beanThree);


    }
}

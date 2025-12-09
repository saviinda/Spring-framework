import bean.SpringBeanOne;
import bean.SpringBeanTwo;
import bean.SpringBeanThree;
import bean.MyConnection;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        //ShutDown Hook method

//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            @Override
//            public void run() {
//                System.out.println("JVM is about to shut down");
//                ctx.close();
//            }
//        });

        ctx.registerShutdownHook();     //shutdown hook easy method

//        SpringBeanOne beanOne = ctx.getBean(SpringBeanOne.class);
//        SpringBeanTwo beanTwo = ctx.getBean(SpringBeanTwo.class);
//        System.out.println(beanOne);
//        System.out.println(beanTwo);
//        SpringBeanThree beanThree = ctx.getBean(SpringBeanThree.class);
//        System.out.println(beanThree);

        //Bean name request (Bean ID)
        //SpringBeanOne -> springBeanOne (Bean ID)
        Object obj = ctx.getBean("springBeanOne");
        System.out.println(obj);

        MyConnection bean = ctx.getBean(MyConnection.class);
        System.out.println(bean);

        //@Bean , bean id -> bean method name
        //MyConnection myConnection = (MyConnection) ctx.getBean("getConnection");
        //System.out.println(myConnection);

    }
}

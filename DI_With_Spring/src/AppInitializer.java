import bean.Boy;
import bean.GirlOne;
import config.AppConfig;
import di.Kamal;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.register(AppConfig.class);
      //  ctx.refresh();
        ctx.registerShutdownHook();

        Kamal k = ctx.getBean(Kamal.class);
        k.ChattingWithKamali();

//        GirlOne bean = ctx.getBean(GirlOne.class);
//        System.out.println(bean);
//
//        Boy boy = ctx.getBean(Boy.class);
//        System.out.println(boy);
//        boy.chattingWithGirl();
    }
}

package bean;

import org.springframework.context.annotation.Primary;

public class GirlTwo implements GoodGirl {
    @Override
    @Primary
    public void chat() {
        System.out.println("Girl Two Chatting");
    }

    public GirlTwo(){
        System.out.println("Girl Two Instantiated");
    }
}

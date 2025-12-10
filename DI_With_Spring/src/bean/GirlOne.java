package bean;

import org.springframework.stereotype.Component;

@Component
public class GirlOne implements GoodGirl {
    public GirlOne(){
        System.out.println("Girl One Instantiated");
    }

    @Override
    public void chat() {
        System.out.println("Girl One Chatting");
    }
}

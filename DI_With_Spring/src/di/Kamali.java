package di;

import org.springframework.stereotype.Component;

@Component
public class Kamali implements GoodKamali {
    public Kamali() {
        System.out.println("Kamali constructor");
    }
    public void chat(){
        System.out.println("Kamali Chatting");
    }

}

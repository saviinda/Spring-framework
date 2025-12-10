package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kamal implements DI {

    @Autowired
    @Override
    public void inject(GoodKamali kamali) {
        this.kamali = kamali;

    }

    @Autowired
    GoodKamali kamali;   // Property Injection

    public void ChattingWithKamali(){
        //Kamali kamali = new Kamali();
        kamali.chat();
    }
    public Kamal(){
        System.out.println("Kamal Constructor");
    }
}

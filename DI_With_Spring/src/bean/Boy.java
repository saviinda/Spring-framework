package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    //@Qualifier("girlTwo")
    @Autowired
    GoodGirl girl;
    public Boy(){
        System.out.println("Boy Instantiated");
    }


    public void chattingWithGirl(){
      //  GoodGirl girl = new GirlOne();
        girl.chat();
    }

    //    Girl girl = new Girl();  // Property Injection


    // Girl girl;

//   public Boy(Girl g) {
//        this.girl = g;
//   }                         // Constructor Injection


//    public void setGirl(Girl g) {
//        this.girl = g;
//    }                        // Setter method Injection
}

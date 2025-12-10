package bean;

import org.springframework.stereotype.Component;

@Component
public class Boy {
    public Boy(){
        System.out.println("Boy Instantiated");
    }


    public void chattingWithGirl(){
        Girl girl = new Girl();
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

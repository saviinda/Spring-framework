package bean;


import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("Spring Bean Object Created ");
    }
    public void TestBean() {
        System.out.println("TestBean Called ");
    }
}

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        var catBean =
                applicationContext.getBean("cat");
        var catBean2 =
                applicationContext.getBean("cat");


        System.out.println(bean == bean2);
        System.out.println(catBean == catBean2);

    }
}
import com.cola.Controllertest;
import com.cola.Servicetest;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    @Test
    public void test1(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Servicetest servicetest = (Servicetest) ac.getBean("servicetest");

        Controllertest controllertest = (Controllertest)ac.getBean("controllertest");

        controllertest.getServicetest().ss();

    }
}

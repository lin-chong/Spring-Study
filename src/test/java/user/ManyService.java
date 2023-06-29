package user;

import com.llt.service.ServiceOne;
import com.llt.service.ServiceThree;
import com.llt.service.ServiceTwo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:manyService.xml"})
public class ManyService {

    private ClassPathXmlApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("manyService.xml");
    }

    @Test
    public void ServiceOneInstance() {
        ServiceOne serviceOne = context.getBean("serviceOne", ServiceOne.class);
        System.out.println(serviceOne);
    }


    /*
    * Singleton And Prototype
    * */
    @Test
    public void singletonAndPrototype() {
        ServiceOne serviceOne = context.getBean("serviceOne1", ServiceOne.class);
        ServiceTwo serviceTwo = serviceOne.getServiceTwo();
        System.out.println("serviceTwo: " + serviceTwo);
        ServiceThree serviceThree = serviceOne.getServiceThree();
        System.out.println("serviceThree: " + serviceThree);
        ServiceTwo serviceTwo1 = context.getBean("serviceTwo1", ServiceTwo.class);
        System.out.println(serviceTwo1);
    }
}

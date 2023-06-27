package user;

import com.llt.service.ServiceOne;
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
}

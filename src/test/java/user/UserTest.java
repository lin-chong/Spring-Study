package user;

import com.llt.entity.User;
import com.llt.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:entity.xml"})
public class UserTest {

    private ClassPathXmlApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("entity.xml");
    }

    @Test
    public void xmlUser() {
        User user = context.getBean("User", User.class);
        System.out.println(user);
    }


    @Test
    public void staticFactoryBean() {
        UserService userService = context.getBean("userServiceStaticFactory", UserService.class);
        System.out.println(userService);
    }

    @Test
    public void factoryBean() {
        UserService userService = context.getBean("userServiceFactory", UserService.class);
        System.out.println(userService);
    }
}
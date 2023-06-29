package user;

import com.llt.entity.AutowireBean;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:entity.xml"})
public class AutowireBeanTest {

    @Autowired
    private AutowireBean autowireBean;

    private ClassPathXmlApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("entity.xml");
    }

    @Test
    public void notAutowireBean() {
        AutowireBean autowire = context.getBean("autowireBean", AutowireBean.class);
        System.out.println(autowire);

        System.out.println(autowireBean);
    }

}

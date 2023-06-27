package user;

import com.llt.entity.LazyBean;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:entity.xml"})
public class LazyBeanTest {

    private ClassPathXmlApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("entity.xml");
    }

    @Test
    public void lazyBeanInstance(){
        LazyBean lazyBean = context.getBean("lazyBean", LazyBean.class);
        System.out.println(lazyBean);
    }
}

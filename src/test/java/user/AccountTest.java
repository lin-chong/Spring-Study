package user;

import com.llt.entity.Account;
import com.llt.entity.SetterBean;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:entity.xml"})
public class AccountTest {


    private ClassPathXmlApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("entity.xml");
    }


    @Test
    public void accountInstance() {
        Account account = context.getBean("account", Account.class);
        Assert.assertEquals("llt", account.getName());
        Assert.assertEquals(100, account.getBalance());
        System.out.println(account);
    }

    @Test
    public void account1Instance() {
        Account account = context.getBean("account1", Account.class);
        Assert.assertEquals("llc", account.getName());
        Assert.assertEquals(101, account.getBalance());
        System.out.println(account);
    }

    @Test
    public void account2Instance() {
        Account account = context.getBean("account2", Account.class);
        Assert.assertEquals("llT", account.getName());
        Assert.assertEquals(102, account.getBalance());
        System.out.println(account);
    }



    @Test
    public void setterBeanBean(){
        SetterBean setterBean = context.getBean("setterBean", SetterBean.class);

        Assert.assertEquals("llT",setterBean.getAccount().getName());
        System.out.println(setterBean);
    }
}

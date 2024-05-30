import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@EnableSpringConfigured
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:sBean.xml")
public class test {
    @Autowired
    org.sample.controller.userController userController;

@Test
    public void ts(){
    System.out.println("h");
    String s = userController.showInfo("1");
    System.out.println(s);
}

}

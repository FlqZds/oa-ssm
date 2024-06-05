import org.junit.Test;
import org.junit.runner.RunWith;
import org.sample.entity.TbUser;
import org.sample.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:sBean.xml")
public class test {
    @Autowired
    org.sample.controller.userController userController;

    @Autowired
    TbUserMapper tbUserMapper;


    @Test
    public void ts(){
    System.out.println("h");
    TbUser tbUser = new TbUser();
    tbUser.setUsername("qwe");
    tbUser.setUserpassword("eqwr12");

    tbUser.setAccount("");
//        int i = tbUserMapper.registerUser(tbUser);
//        boolean validate = pojoValidator.validate(tbUser);
//        String s = validate ? "success" : "fail";
//        System.out.println("结果："+s);
    }

    @Autowired
    org.sample.service.userService userSer;
    @Test
    public void test1(){
        System.out.println(userSer.asd());

        System.out.println(userSer.findUAllser());
    }
}

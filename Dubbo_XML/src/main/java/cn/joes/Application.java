package cn.joes;

import cn.joes.dao.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 自定义XML
 * <p>
 * Created by myijoes on 2019/8/2.
 *
 * @author wanqiao
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:user.xml");
        User user = (User) classPathXmlApplicationContext.getBean("user");
        System.out.println(user.toString());
    }
}

import com.awen.ioc.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-02-14 12:01
 */
public class TestIoC {
    public static void main(String[] args) {
        // 1. 初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 通过容器获取userDao实例
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        // 3.调用实例中的say()方法
        userDao.say();
    }
}

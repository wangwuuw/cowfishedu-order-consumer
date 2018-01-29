

import com.cowfishedu.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @classDesc： 功能描述：（消费者调用接口测试）
 * @author：王武
 * @createTime 2018/1/29
 * @verson: v1.0
 * @copyright: 上海江豚教育科技有限公司
 */
public class Comsumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("consumer.xml");
        UserService userService = (UserService)app.getBean("userService");
        String name="";
        for (int i = 0; i < 10; i++) {
            name = userService.getUserId(2);
        }

        System.out.println("消费者从生产者获取 name:"+name);
    }

}

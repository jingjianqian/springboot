package init;

import mybatis.pojo.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/1233")
public class BaseControllerTest {



    @RequestMapping("/2233")
    public User getUserCon(){
       return null;

        // return  mybatisUserService.getUser();
    }
}

package jing.spring.boot;

import mybatis.pojo.User;
import mybatis.service.MybatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/123")
public class BaseController {

    private MybatisUserService mybatisUserService;

    @RequestMapping("/456")
    public User getUserCon(){
        return  mybatisUserService.getUser();
    }
}

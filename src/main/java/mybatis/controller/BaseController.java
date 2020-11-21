package mybatis.controller;

import mybatis.pojo.User;
import mybatis.service.MybatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/Mybatis")
public class BaseController {

    private MybatisUserService mybatisUserService;

    @Autowired
    public  BaseController(MybatisUserService mybatisUserService){
        this.mybatisUserService = mybatisUserService;
    }


    @RequestMapping("/user")
    public User getUserCon(){

        return  mybatisUserService.getUser();
    }
}

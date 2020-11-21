package mybatis.service;

import mybatis.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class MybatisUserServiceImpl  implements MybatisUserService{
    @Override
    public User getUser() {
        System.out.println("123213");
        return null;
    }
}

package mybatis.service;


import mybatis.pojo.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;


public interface MybatisUserService {
      User getUser();
}

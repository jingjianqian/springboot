package mybatis.pojo;

import org.apache.ibatis.type.Alias;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**** imports ****/
// 标明是一个实体类
@Entity(name = "user")
// 定义映射的表
@Table(name = "user")
@Alias(value = "user")// MyBatis指定别名
public class User implements Serializable {
    private Long id;
    private String userName;
}

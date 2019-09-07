package vuemanagement.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: 杨强
 * @Date: 2019/9/5 9:48
 * @Version 1.0
 * @Discription
 */
@Data
@TableName(value = "user")
public class User {

    /**主键*/
    @TableId(type = IdType.AUTO)
    private Integer  id;

    /**姓名*/
    private String  name;

    /**电话*/
    private String telephone;

    /**邮箱*/
    private String  email;

}

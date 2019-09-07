package vuemanagement.management.dto.req;

import lombok.Data;

/**
 * @Author: 杨强
 * @Date: 2019/9/7 12:57
 * @Version 1.0
 * @Discription 用户请求实体类
 */
@Data
public class UserReq {

    /** 名字 */
    private String name;
    /** 电话 */
    private String telephone;
    /** 邮箱 */
    private String email;


}

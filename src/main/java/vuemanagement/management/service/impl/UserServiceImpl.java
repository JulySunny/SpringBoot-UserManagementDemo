package vuemanagement.management.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import vuemanagement.management.dao.UserMapper;
import vuemanagement.management.entity.User;
import vuemanagement.management.service.UserService;

/**
 * @Author: 杨强
 * @Date: 2019/9/5 9:59
 * @Version 1.0
 * @Discription
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
}

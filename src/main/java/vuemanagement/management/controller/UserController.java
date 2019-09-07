package vuemanagement.management.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vuemanagement.management.dto.req.UserReq;
import vuemanagement.management.entity.User;
import vuemanagement.management.service.UserService;

import java.util.List;
import java.util.Optional;

/**
 * @Author: 杨强
 * @Date: 2019/9/5 10:02
 * @Version 1.0
 * @Discription
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/save")
    public void save(@RequestBody UserReq req){
        User user =new User();
        BeanUtils.copyProperties(req, user);
        userService.save(user);
    }

    @RequestMapping("/findAll")
    public List<User> findAll(){
        List<User> list = userService.list(null);
        return  list;
    }

    @RequestMapping("/update/{id}")
    public void update(@PathVariable(value = "id") Integer id,@RequestBody User user){
        userService.update(user,new QueryWrapper<User>().eq("id", id));
    }

    @RequestMapping("/findById/{id}")
    public User findById(@PathVariable(value = "id") Integer id){
        User user = userService.getById(id);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable(value = "id") Integer id){
        User user = userService.getById(id);
        if (user!=null) {
            userService.removeById(user.getId());
            System.out.println("sucecess! 删除用户成功");
        }
    }
}

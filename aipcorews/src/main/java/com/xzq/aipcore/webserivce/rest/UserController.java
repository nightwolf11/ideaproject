package com.xzq.aipcore.webserivce.rest;

import com.xzq.aipcore.domain.User;
import com.xzq.aipcore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String userView(){
        return "用户维护Rest";
    }
    @RequestMapping("/findbyid/{userid}")
    public String userFindById(@PathVariable("userid") Long userid){
        String s = userService.findById(userid).toString();
        return s;
    }
    @RequestMapping("/add/{user}.{username}")
    public String userAdd(@PathVariable("user") String user,
                          @PathVariable("username") String username){
        User u = new User();
        u.setUser(user);
        u.setUsername(username);
        String s = null;
        try {
            s = userService.add(u).toString();
        }catch (Exception h){
            s="新增失败"+h.toString();
        }
        return s;
    }
    @RequestMapping("/add/{userid}.{user}.{username}.{sex}.{birthday}.{remark}")
    public String userAdd(@PathVariable("userid") Long userid,
                          @PathVariable("user") String user,
                          @PathVariable("username") String username,
                          @PathVariable("sex") int sex,
                          @PathVariable("birthday") String birthday,
                          @PathVariable("remark") String remark) throws ParseException {
        User u = new User();
        u.setUserid(userid);
        u.setUser(user);
        u.setUsername(username);
        u.setSex(sex);
        u.setBirthday(new java.sql.Date(new SimpleDateFormat("yyyyMMdd").parse(birthday).getDate()));
        u.setRemark(remark);
        String s = userService.add(u).toString();
        return s;
    }
    @RequestMapping("/delbyid/{userid}")
    public String delById(@PathVariable("userid") Long userid){
        String s = userService.delById(userid);
        return s;
    }
}

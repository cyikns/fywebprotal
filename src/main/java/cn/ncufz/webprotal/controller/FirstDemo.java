package cn.ncufz.webprotal.controller;

import cn.ncufz.webprotal.common.pojo.User;
import cn.ncufz.webprotal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cyikns
 * @create 2018-09-13 17:59
 */
@Controller
public class FirstDemo {

    @Autowired
    private UserService userService;

    @RequestMapping("/test1")
    public String testSpring() {
        User user = userService.findUser();
        System.out.println(user);
        return "test";
    }

    @ResponseBody
    @RequestMapping("/test2")
    public String findUserById(Model model) {

        User user = userService.findUserById(2);
        System.out.println(user);
        model.addAttribute("user", user);
        return "test";
    }
}

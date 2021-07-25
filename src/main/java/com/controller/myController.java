package com.controller;
import com.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class myController {

    @RequestMapping("/")
    public String showHome() {
        return "home";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String ValidateUser(@RequestParam("username") String username,
            @RequestParam(name = "pass") String pass, ModelMap map, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String location = "home";

        if (username.isEmpty() || pass.isEmpty()) {
            map.addAttribute("error", "User name or password can't be empty");
            return location;
        }

        map.addAttribute("error", "yout Name is: " + username + " Pass: " + pass);
        ModelAndView modelAndView = new ModelAndView();

        return "success";
    }

    
    @RequestMapping(value = "register" )
    public @ResponseBody String Register(ModelAndView model) {
        User user = new User();
        model.addObject("userID", user.getId());
        
        
        
        return "jfvjkdfn";
    }

}

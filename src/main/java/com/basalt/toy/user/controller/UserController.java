package com.basalt.toy.user.controller;

import com.basalt.toy.BindExceptionWithViewName;
import com.basalt.toy.user.UserVo;
import com.basalt.toy.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {

    private final MessageSource messageSource;
    private final UserService userService;

   // @GetMapping()
   // public String getUserInfo(){
        //return "user/getUserInfo";
    //}

    @GetMapping()
    public String getSignUpView() throws Exception{
        return "user/signUpForm";
    }

    @PostMapping()
    public String insertUser(@Validated @ModelAttribute("user") UserVo user,
                             BindingResult bindingResult,
                             @RequestParam("rePassword") String rePasswrod,
                             Locale locale) throws Exception{
        if(!user.getPassword().equals(rePasswrod)){
            bindingResult.addError(new FieldError("java.lang.String", "rePassword", "패스워드가 일치 하지 않습니다."));
        }
        if(userService.findByEmail(user.getEmail()) != null){
            bindingResult.rejectValue("email", "overlap.email", "동일한 이메일이 존재합니다.");
        }
        if(bindingResult.hasErrors()){
            throw new BindExceptionWithViewName(bindingResult, "user/signUpForm", messageSource, locale);
        }
        userService.regist(user);

        return "redirect:/";
    }

    @PutMapping()
    public String updateUser(UserVo user) throws Exception{
        userService.modify(user);
        return "redirect:/user";
    }

    @DeleteMapping()
    public String deleteUser(UserVo user) throws Exception{
        return "redirect:/";
    }

}
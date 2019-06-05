package com.qst.shop.controller;

import com.qst.shop.pojo.Shop;
import com.qst.shop.validator.ShopValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShopController {
    @Autowired
    @Qualifier("shopValidator")
    private ShopValidator shopValidator;

    //拦截
    @RequestMapping(value="/{formName}")
    public String toPage(@PathVariable String formName, Model model) {
       Shop shop = new Shop();
        model.addAttribute("shop", shop);
        return "shopadd";
    }




    @RequestMapping(value="/shopadd",method=RequestMethod.POST)
    public String addtheshop(@ModelAttribute Shop shop,Model model,Errors errors) {
        model.addAttribute("shop", shop);
        //调用验证模块
        shopValidator.validate(shop,errors);
        if(errors.hasErrors()) {
            return "shopadd";
        }
        return "success";
    }
}





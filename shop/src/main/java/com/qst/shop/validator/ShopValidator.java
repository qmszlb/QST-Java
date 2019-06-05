package com.qst.shop.validator;

import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.qst.shop.pojo.Shop;

@Repository
public class ShopValidator implements Validator {

    public boolean supports(Class<?> clazz) {
        return Shop.class.isAssignableFrom(clazz);
    }

    public void validate(Object target, Errors errors) {

        ValidationUtils.rejectIfEmpty(errors, "name", null, "商品名不能为空");
        ValidationUtils.rejectIfEmpty(errors, "id", null, "商品编号不能为空");
        ValidationUtils.rejectIfEmpty(errors, "time", null, "上架时间不能为空");
        ValidationUtils.rejectIfEmpty(errors, "information", null, "商品信息不能为空");
        ValidationUtils.rejectIfEmpty(errors, "price", null, "商品价格不能为空");

        Shop shop = (Shop) target;
        if (shop.getName().length() > 15) {
            errors.rejectValue("name", null, "商品名称不能超过15个字");
        }
        if (shop.getInformation().length() < 5) {
            errors.rejectValue("information", null, "商品信息不能少于5个字");
        }
    }}

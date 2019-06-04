package com.qst.commodity.validator;

import com.qst.commodity.po.Commodity;
import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Repository
public class CommodityValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Commodity.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmpty(errors, "id", null,"编号不能为空");
		ValidationUtils.rejectIfEmpty(errors, "name", null,"商品名称不能为空");
		ValidationUtils.rejectIfEmpty(errors, "price", null,"价格不能为空");
		//ValidationUtils.rejectIfEmpty(errors, "data", null,"日期不能为空");
		ValidationUtils.rejectIfEmpty(errors, "describe", null,"描述不能为空");

		Commodity commodity=(Commodity)target;
		if(commodity.getName().length()>15) {
			errors.rejectValue("name", null,"商品名称不能超过15个字");
		}
		if(commodity.getDescribe().length()<5){
			errors.rejectValue("describe", null,"商品描述不能少于5个字");
		}
        /*if(commodity.getData().length()<9){
        	errors.rejectValue("data",null,"按照年月日进行填写");
		}*/

		//Date date = new Date();// new Date()为获取当前系统时间，也可使用当前时间戳
//		if(commodity.getBirthday()!=null) {
//			if(date.before(shop.getBirthday())) {
//				errors.rejectValue("birthday", null, "上架时间不能早于当前时间");
//			}
//
//		}
}}

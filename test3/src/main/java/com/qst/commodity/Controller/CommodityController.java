package com.qst.commodity.Controller;

import com.qst.commodity.po.Commodity;
import com.qst.commodity.validator.CommodityValidator;
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
@RequestMapping("/commodity")
public class CommodityController {
	@Autowired
	@Qualifier("commodityValidator")
	private CommodityValidator commodityValidator;

     //拦截
	@RequestMapping(value="/{formName}")
	public String toPage(@PathVariable String formName, Model model) {
	Commodity commodity=new  Commodity();
	model.addAttribute("commodity", commodity);
		return "addgoods";
	}


	@RequestMapping(value="/adds",method=RequestMethod.POST)
	public String addtheshop(@ModelAttribute Commodity commodity, Model model, Errors errors) {
		model.addAttribute("goods", commodity);

		commodityValidator.validate(commodity, errors);
	if(errors.hasErrors()) {
			return "addgoods";
		}
		return "success";
	}
}

package yhr.ya.kr.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import yhr.ya.kr.util.PageUtill;

@Controller
public class ViewController {
	
	@Autowired private PageUtill pu;
	
	@GetMapping("/")
	public String base(HttpServletRequest req) {
		return "redirect:/Main";
	}
	
	@GetMapping("/{view}")
	public String view(@PathVariable("view") String view, Model model, HttpServletRequest req) {
		if(pu.checkView(view, req)) {
			return "redirect:/Main";
		}
		model.addAttribute("title", view.toUpperCase());
		model.addAttribute("page", view.toLowerCase());
		return "layout";
	}
	
	@GetMapping("/layout/{view}")
	public String layout(@PathVariable("view") String view) {return "layout/" + view;}
	
	@GetMapping("/view/{page}")
	public String page(@PathVariable("page") String page) {
		if("".equals(page) || page == null) {
			return "empty";
		}
		return "page/" + page;
	}
	
	
}

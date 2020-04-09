package yhr.ya.kr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ViewController {
	
	private List<String> viewList = null; 
	
	public ViewController() {
		// 화면 페이지 관리 > 나중에 DB 또는 공통 모듈 처리
		viewList = new ArrayList<String>(); 
		viewList.add("main");
		viewList.add("mainmap");
		viewList.add("signup");
		viewList.add("login");
	}
	
	@GetMapping("/")
	public String base() {return "redirect:/Main";}
	
	@GetMapping("/{view}")
	public String view(@PathVariable("view") String view, Model model) {
		if(checkView(view.toLowerCase())) {
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
	
	public boolean checkView(String view) {
		boolean check = true;
		for(String page : viewList) {
			System.out.println(view + " : " + page);
			if(page.equals(view)) {
				check = false;
				break;
			}
		}
		return check;
	}
}

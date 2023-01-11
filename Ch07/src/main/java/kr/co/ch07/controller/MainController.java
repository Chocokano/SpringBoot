package kr.co.ch07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ch07.repository.User1Repo;
import kr.co.ch07.vo.User1VO;

@Controller
public class MainController {
	
	@Autowired
	private User1Repo repo;
	

	@GetMapping(value = {"/", "/index"})
	public String index() {
		return "/index";
	}
	
	@GetMapping("/query1")
	public String query1() {
		User1VO user = repo.findUser1VOByUid("a101");
		System.out.println("query1 결과 : " + user);
		return "redirect:/";
	}
	
	@GetMapping("/query2")
	public String query2() {
		List<User1VO> users = repo.findUser1VOByName("김춘추");
		System.out.println("query2 결과 : " + users);
		return "redirect:/";
	}
	
	@GetMapping("/query3")
	public String query3() {
		System.out.println("query3 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query4")
	public String query4() {
		System.out.println("query4 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query5")
	public String query5() {
		System.out.println("query5 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query6")
	public String query6() {
		System.out.println("query6 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query7")
	public String query7() {
		System.out.println("query7 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query8")
	public String query8() {
		System.out.println("query8 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query9")
	public String query9() {
		System.out.println("query9 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query10")
	public String query10() {
		System.out.println("query10 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query11")
	public String query11() {
		System.out.println("query11 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query12")
	public String query12() {
		System.out.println("query12 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query13")
	public String query13() {
		System.out.println("query13 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query14")
	public String query14() {
		System.out.println("query14 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query15")
	public String query15() {
		System.out.println("query15 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query16")
	public String query16() {
		System.out.println("query16 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query17")
	public String query17() {
		System.out.println("query17 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query18")
	public String query18() {
		System.out.println("query18 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query19")
	public String query19() {
		System.out.println("query19 결과 : ");
		return "redirect:/";
	}
	
	@GetMapping("/query20")
	public String query20() {
		System.out.println("query20 결과 : ");
		return "redirect:/";
	}
	
	
	
	
}
package kr.co.sboard.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.sboard.service.UserService;
import kr.co.sboard.vo.TermsVO;
import kr.co.sboard.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	
	@GetMapping("/user/login")
	public String login() {
		return "/user/login";
	}
	
	@GetMapping("/user/register")
	public String register() {
		return "/user/register";
	}
	
	@PostMapping("/user/register")
	public String register(UserVO vo, HttpServletRequest req) {
		String regip = req.getRemoteAddr();
		vo.setRegip(regip);
		int result = service.insertUser(vo);
		
		return "redirect:/user/login?success="+result;
	}
	
	@GetMapping("/user/terms")
	public String terms(Model model) {
		TermsVO vo = service.selectTerms();
		model.addAttribute(vo);
		return "/user/terms";
	}
	
	@ResponseBody
	@GetMapping("/user/checkUid")
	public Map<String, Integer> checkUid(String uid) {
		
		log.info("here1 : " + uid);
		
		int result = service.countUser(uid);
		
		log.info("here2 : " + result);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("result", result);
		
		log.info("here3 : " + map);
		
		return map;
	}
	
	@ResponseBody
	@PostMapping("/user/checkUid2")
	public Map<String, Integer> checkUid2(@RequestParam("uid") String uid) {
		
		log.info("here2-1 : " + uid);
		
		int result = service.countUser(uid);
		
		log.info("here2-2 : " + result);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("result", result);
		
		log.info("here2-3 : " + map);
		
		return map;
	}
	
}
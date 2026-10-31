package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
	@GetMapping("/top")
	public String top(Model model) {
		model.addAttribute("a", " tree"); // 文字列リテラル
		model.addAttribute("x", "猫"); // リンクURL
		//オブジェクトのプロパティ
		model.addAttribute("student", new Student(1, "山田太郎"));
		// ユーティリティオブジェクト
		model.addAttribute("ldt", LocalDateTime.now());
		return "top";
	}
}

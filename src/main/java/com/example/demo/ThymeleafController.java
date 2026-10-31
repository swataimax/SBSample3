package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ThymeleafController {
	
	@GetMapping("/top")
	public String top(Model model) {
		model.addAttribute("a", " tree"); // 文字列リテラル
		model.addAttribute("x", "猫"); // リンクURL
		// オブジェクトのプロパティ
		model.addAttribute("student", new Student(1, "山田太郎"));
		
		// ユーティリティオブジェクト
		model.addAttribute("ldt", LocalDateTime.now());
		
		return "top"; 
	}
	
	@GetMapping("index")
	public String index(Model model) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "山田太郎"));
		list.add(new Student(2, "佐藤次郎"));
		list.add(new Student(3, "山田花子"));
		
		model.addAttribute("list", list);
		model.addAttribute("num", 1); // 値を1,2,0と変更して実施
		
		return "index";
	}
	
	// 問題１
	@GetMapping("/q3-1")
	public String q3_1(Model model) {
		LocalDate localDate = LocalDate.parse("2000-08-01");
		SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = simpleDateFormat.parse(localDate.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Member member = new Member(
				"佐藤次郎", 25, date, "東京都西新宿1-1-1");
		model.addAttribute("member", member);
		System.out.println(member.getAge());
		return "q3-1";
	}	
	
	
	// 問題２
	@GetMapping("/q3-2/{num}")
	public String q3_2(@PathVariable int num, Model model) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "山田太郎"));
		list.add(new Student(2, "佐藤次郎"));
		list.add(new Student(3, "田中三郎"));
		list.add(new Student(4, "加藤四郎"));
		list.add(new Student(5, "加藤五郎"));
		list.add(new Student(6, "山田花子"));
		
		model.addAttribute("list", list);
		model.addAttribute("num", num);
		
		return "q3-2";
	}
	
	// 問題３
	@GetMapping("/q3-3")
	public String q3_3(Model model) {
		Random rnd = new Random();
		int num = rnd.nextInt(5);
		model.addAttribute("num", num);
		return "q3-3";
	}
	

}

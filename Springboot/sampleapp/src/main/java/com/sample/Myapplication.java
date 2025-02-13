package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
@RestController
@SpringBootApplication
public class Myapplication {
	@GetMapping("/sample")
	public static String gethome() {
		return "Hello";
		
	}
	
	public static void main(String[]args) {
		Myapplication app=new Myapplication();
		SpringApplication.run(Myapplication.class, args);
		System.out.println(gethome());
	}
	}
	*/

@Controller
public class Myapplication {

    @GetMapping("/home")
    public String gethome() {
        return "home"; // This will resolve to /WEB-INF/views/sample.jsp
    }

   
}

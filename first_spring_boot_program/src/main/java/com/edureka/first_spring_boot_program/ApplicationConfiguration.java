package com.edureka.first_spring_boot_program;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationConfiguration {

	@RequestMapping("/hello")
	public String hello(@RequestParam(name="name",required=false,defaultValue="World") String name) {
		return "Hello - "+name;
	}
}

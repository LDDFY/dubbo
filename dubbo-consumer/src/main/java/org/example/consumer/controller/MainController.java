package org.example.consumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.dubbo.sample.api.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :wwwch
 * @date :Created in 2020/11/4 22:14
 */
@RestController
@RequestMapping(value = "Main")
public class MainController {

	@DubboReference(version = "1.0.0")
	private DemoService demoService;

	@GetMapping("say")
	public String say() {
		return demoService.sayHello("玛丽亚");
	}
}

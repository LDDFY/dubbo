package org.example.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.dubbo.sample.api.DemoService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author :wwwch
 * @date :Created in 2020/11/3 23:51
 */
@Slf4j
@EnableAutoConfiguration
public class DubboAutoConfigurationConsumerBootstrap {

	@DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
	private DemoService demoService;

	public static void main(String[] args) {
		SpringApplication.run(DubboAutoConfigurationConsumerBootstrap.class).close();
	}

	@Bean
	public ApplicationRunner runner() {
		return args -> log.error(demoService.sayHello("mercyblitz"));
	}

}

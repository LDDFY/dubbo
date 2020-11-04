package org.dubbo.sample.started;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/***
 * DubboProvider
 * @author wwwch
 */
@EnableAutoConfiguration
public class DubboProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
	}
}

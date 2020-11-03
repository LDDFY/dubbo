package org.dubbo.sample.started;

import org.apache.dubbo.config.annotation.DubboService;
import org.dubbo.sample.api.DemoService;
import org.springframework.beans.factory.annotation.Value;

/**
 * DefaultDemoService
 *
 * @author :wwwch
 * @date :Created in 2020/11/3 22:10
 */
@DubboService(version = "1.0.0")
public class DefaultDemoServiceImpl implements DemoService {

	@Value("${dubbo.application.name}")
	private String serviceName;

	@Override
	public String sayHello(String name) {
		return String.format("[%s] : Hello, %s", serviceName, name);
	}
}

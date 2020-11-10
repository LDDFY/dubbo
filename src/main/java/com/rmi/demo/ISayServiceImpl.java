package com.rmi.demo;

/**
 * @author :wwwch
 * @date :Created in 2020/11/2 23:15
 */
public class ISayServiceImpl implements ISayService {
	@Override
	public String say(String name) throws Exception {
		System.out.printf("input name:" + name);
		return name + " say hello";
	}
}

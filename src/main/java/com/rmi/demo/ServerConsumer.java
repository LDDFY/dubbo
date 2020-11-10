package com.rmi.demo;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author :wwwch
 * @date :Created in 2020/11/2 23:23
 */
public class ServerConsumer {
	public static void main(String[] args) throws Exception {
		Registry registry = LocateRegistry.getRegistry(999);
		ISayService sayService = (ISayService) registry.lookup("sayService");
		String sayStr = sayService.say("张三");
		System.out.println("result:" + sayStr);
	}
}

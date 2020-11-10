package com.rmi.demo;

import java.rmi.Remote;

/**
 * @author :wwwch
 * @date :Created in 2020/11/2 23:14
 */
public interface ISayService extends Remote {

	/**
	 * 返回输入字符串 + hello
	 *
	 * @param name
	 * @return
	 * @throws Exception
	 */
	String say(String name) throws Exception;

}

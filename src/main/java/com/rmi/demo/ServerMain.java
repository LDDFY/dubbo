package com.rmi.demo;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author :wwwch
 * @date :Created in 2020/11/2 23:16
 */
public class ServerMain {
	public static void main(String[] args) throws RemoteException {
		ISayService impl = new ISayServiceImpl();
		ISayService sayService = (ISayService) UnicastRemoteObject.exportObject(impl, 666);
		Registry registry = LocateRegistry.createRegistry(999);
		registry.rebind("sayService", sayService);
	}
}

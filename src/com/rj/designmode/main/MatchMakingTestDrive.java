package com.rj.designmode.main;

import java.lang.reflect.Proxy;

import com.rj.designmode.proxy.NonOwnerInvocationHandler;
import com.rj.designmode.proxy.OwnerInvocationHandler;
import com.rj.designmode.proxy.PersonBean;
import com.rj.designmode.proxy.PersonBeanImpl;

public class MatchMakingTestDrive {
	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}

	public void drive() {
		PersonBean joe = new PersonBeanImpl();
		joe.setName("RoseJames");
		joe.setGender("Chinese");
		joe.setInterests("Ping-pong");
		joe.setHotOrNotRating(10);
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("bowling, Go");
		System.out.println("Interests set from owner proxy");
		try{
			ownerProxy.setHotOrNotRating(10);
		}catch(Exception e){
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try{
			nonOwnerProxy.setInterests("bowling, Go");
		}catch (Exception e){
			System.out.println("Can't set interests from non owner proxy");
		}
		
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
	}

	PersonBean getOwnerProxy(PersonBean personBean) {
		return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass()
				.getInterfaces(), new OwnerInvocationHandler(personBean));
	}

	PersonBean getNonOwnerProxy(PersonBean personBean) {
		return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass()
				.getInterfaces(), new NonOwnerInvocationHandler(personBean));
	}
}

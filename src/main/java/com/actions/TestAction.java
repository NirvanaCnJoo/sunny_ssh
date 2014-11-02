package com.actions;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype")

public class TestAction extends ActionSupport {
	
	private static final Logger log = Logger.getLogger(TestAction.class);
	
	public String doTest() {
		log.debug("doTest called");
		System.out.println("sysout doTest");
		return null;
	}
	
}

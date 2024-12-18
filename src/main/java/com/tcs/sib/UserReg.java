package com.tcs.sib;

import ashokit.PwdSecurityService;

public class UserReg {
	
	public static void main(String args[]) {
		PwdSecurityService pss=new PwdSecurityService();
		String encode=pss.encode("Ashokit");
		System.out.println(encode);
		
	}
	

}

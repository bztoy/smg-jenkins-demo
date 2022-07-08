package com.smg.ouaf;
import com.smg.ouaf.mdm.*;
import com.smg.ouaf.tlm.TransformerLoad;

public class Main {

	public static void main(String[] args) {
		System.out.println("|SMG Jenkins Demo|");
		System.out.println("This is how the system works");
		OnDemandRead odm = new OnDemandRead(99999999);
		System.out.println("On-Demand Read value is " + odm.getOndemandRead() + "KW");
		odm = new OnDemandRead(88888888);
		System.out.println("On-Demand Read value is " + odm.getOndemandRead() + "KW");
		
		TransformerLoad tlm = new TransformerLoad(333456);
		System.out.println(tlm.getMaxLoadString());
	}
}

package com.smg.ouaf.mdm;

public class OnDemandRead implements UsageTransaction {
private String ui;
	
	public OnDemandRead(int ui) {
		this.ui = String.format("%010d", ui);
		System.out.println("UI: " + this.ui + " is connected ...");
	}
	
	public float getOndemandRead() {
		return 250f;
	}
}

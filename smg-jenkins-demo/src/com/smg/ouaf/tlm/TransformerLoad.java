package com.smg.ouaf.tlm;

public class TransformerLoad {
	private int deviceID;
	
	public TransformerLoad(int id) {
		this.deviceID = id;
	}
	
	public float getMaxLoad() {
		return 599;
	}
	
	public String getMaxLoadString() {
		return ("Maximum Load of Device ID: "+this.deviceID+" is "+ getMaxLoad()+" Kw");
	}
}

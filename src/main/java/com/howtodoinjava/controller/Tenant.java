package com.howtodoinjava.controller;

public final class Tenant {
	private static volatile Tenant tenant = new Tenant();
	private String tenantName;

	public static Tenant getInstance() {
		return tenant;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

}

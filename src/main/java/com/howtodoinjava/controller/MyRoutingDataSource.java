package com.howtodoinjava.controller;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyRoutingDataSource extends AbstractRoutingDataSource {
	private Tenant tenant = Tenant.getInstance();

	@Override
	protected Object determineCurrentLookupKey() {
		return tenant.getTenantName();
	}
}

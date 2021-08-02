package com.ex.actuator.metrics;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InternalHealthMetrics implements HealthIndicator {

	@Override
	public Health health() {
		return chkInternet() == true ? Health.up().withDetail("success", "Active Connection").build()
				: Health.down().withDetail("error code", "Innactive Connection").build();
	}

	public boolean chkInternet() {

		boolean flag = false;
		try {
			URL url = new URL("https://google.com");
			URLConnection connection = url.openConnection();
			connection.connect();
			flag = true;
		} catch (Exception e) {
			flag = false;
		}
		return true;
	}

}

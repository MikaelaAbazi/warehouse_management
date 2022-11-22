package com.example.wmsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class WMSServerApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(WMSServerApplication.class, args);
	}
}
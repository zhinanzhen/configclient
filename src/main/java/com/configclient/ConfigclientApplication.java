package com.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableDiscoveryClient
//@EnableConfigServer
@RefreshScope
public class ConfigclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}

	@Value("${name}")
	private  String name;
	@Value("${age}")
	private  String age;
	@Value("${version}")
	private  String version="开发环境";

	@RequestMapping("/test")
	public String test(){
		return "你好，我是" + name + ",年龄是" + age  + "版本" + version;
	}
}

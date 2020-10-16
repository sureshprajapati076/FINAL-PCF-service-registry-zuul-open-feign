package com.example;

import com.netflix.appinfo.AmazonInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class AddressServiceApplication {

	@Value("${server.port}")
	public int port;

	public static void main(String[] args) {
		SpringApplication.run(AddressServiceApplication.class, args);
	}


	// ENABLE FOLLOWING BEAN for deploying on AWS Elastic Beanstalk
//	@Bean
//	@Autowired
//	public EurekaInstanceConfigBean eurekaInstanceConfigBean(InetUtils inetUtils) {
//
//		EurekaInstanceConfigBean config = new EurekaInstanceConfigBean(inetUtils);
//		AmazonInfo info = AmazonInfo.Builder.newBuilder().autoBuild("eureka");
//		config.setHostname(
//				info.get(AmazonInfo.MetaDataKey.publicHostname));
//
//		config.setIpAddress(info.get(AmazonInfo.MetaDataKey.publicIpv4));
//		config.setNonSecurePort(port);
//		config.setDataCenterInfo(info);
//
//		return config;
//	}
	

}

package com.huaxing.bi;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
//@MapperScan("com.huaxing.bi.mapper")
public class BiBakendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(BiBakendApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BiBakendApplication.class);
	}
}
//@SpringBootApplication
//@MapperScan("com.huaxing.bi.mapper")
//public class BiBakendApplication {
//
//	public static void main(String[] args) {
//
//		SpringApplication.run(BiBakendApplication.class, args);
//	}
//}

//@SpringBootApplication
//public class BiBakendApplication extends SpringBootServletInitializer {
//
//	public static void main(String[] args) {
//		SpringApplication.run(BiBakendApplication.class, args);
//	}
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(BiBakendApplication.class);
//	}
//
//	@Bean
//	public MapperScannerConfigurer mapperScannerConfigurer() {
//		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
//		configurer.setBasePackage("com.huaxing.bi.mapper"); // 设置 Mapper 包路径
//		return configurer;
//	}
//}

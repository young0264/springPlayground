package spring.playground.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import spring.playground.proxy.config.v1_proxy.ConcreteProxyConfig;
import spring.playground.proxy.config.v1_proxy.InterfaceProxyConfig;
import spring.playground.proxy.config.v2_dynamicproxy.DynamicProxyBasicConfig;
import spring.playground.proxy.config.v2_dynamicproxy.DynamicProxyFilterConfig;
import spring.playground.proxy.config.v3_proxyfactory.ProxyFactoryConfigV1;
import spring.playground.proxy.config.v3_proxyfactory.ProxyFactoryConfigV2;
import spring.playground.proxy.trace.logtrace.LogTrace;
import spring.playground.proxy.trace.logtrace.ThreadLocalLogTrace;

//@Import({AppV1Config.class, AppV2Config.class})
//@Import(InterfaceProxyConfig.class)
//@Import(ConcreteProxyConfig.class)
//@Import(DynamicProxyBasicConfig.class)
//@Import(DynamicProxyFilterConfig.class)
//@Import(ProxyFactoryConfigV1.class)
//@Import(DynamicProxyBasicConfig.class)
@Import(ProxyFactoryConfigV2.class)
@SpringBootApplication(scanBasePackages = "spring.playground.proxy.app.v2") //주의
public class ProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyApplication.class, args);
	}

	@Bean // LogTrace bean 등록
	public LogTrace logTrace() {
		return new ThreadLocalLogTrace();
	}

}

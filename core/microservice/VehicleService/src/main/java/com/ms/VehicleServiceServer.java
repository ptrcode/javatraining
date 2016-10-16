package com.ms;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

//import io.pivotal.microservices.accounts.AccountRepository;
//import io.pivotal.microservices.accounts.AccountsConfiguration;

/**
 * Run as a micro-service, registering with the Discovery Server (Eureka).
 * <p>
 * Note that the configuration for this application is imported from
 * {@link AccountsConfiguration}. This is a deliberate separation of concerns.
 * 
 * @author Paul Chapman
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
//@EnableCaching
//@PropertySource(ignoreResourceNotFound = true, value = {"classpath:application.properties"})
//@EnableDiscoveryClient
//@EnableHystrix   ////////////////
//@Import(AccountsConfiguration.class)
//@RibbonClient (name = "vehicle-service", configuration = SayHelloConfiguration.class)
public class VehicleServiceServer {
//	implements EnvironmentAware {

//	@Autowired
//	protected VehicleController vehicleController;
//	
//
//	@Autowired
//	protected VehicleInventoryController vehicleInventoryController;
//
//	
	protected Logger logger = Logger.getLogger(VehicleServiceServer.class.getName());
//    private @Value("${redis.host}") String redisHost;
//    private @Value("${redis.port}") int redisPort;
//    private @Value("${redis.timeout}") int timeout;
//	private Environment environment;
//
//	public Environment getEnvironment() {
//		return environment;
//	}

//	@Override
//	public void setEnvironment(Environment environment) {
//		this.environment = environment;
//	}
//
//	public String getPropertyByKey(String key) {
//		return environment.getProperty(key);
//	}
//
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
//
//	@Bean
//	  public JedisConnectionFactory redisConnectionFactory() {
//	    JedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory();
//	    System.out.println("==============>redisConnectionFactory");
//
//	    // Defaults
//	    redisConnectionFactory.setHostName(redisHost);
//	    redisConnectionFactory.setPort(redisPort);
//	    redisConnectionFactory.setTimeout(timeout);
//	    redisConnectionFactory.setUsePool(true);
//	    return redisConnectionFactory;
//	  }
//
//	  @Bean
//	  public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory cf) {
//		    System.out.println("==============>redisTemplate");
//
//	    RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
//	    redisTemplate.setConnectionFactory(cf);
//	    System.out.println("==============>connected to redis");
//	    return redisTemplate;
//	  }
//
//	  @Bean
//	  public CacheManager cacheManager(RedisTemplate redisTemplate) {
//	    RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
//	    System.out.println("==============>cacheManager");
//	    // Number of seconds before expiration. Defaults to unlimited (0)
//	    cacheManager.setDefaultExpiration(300);
//	    return cacheManager;
//	  }
//	  @Bean
//	  public CustomKeyGenerator customKeyGenerator() {
//	    return new KeyGenerator() {
//	      @Override
//	      public Object generate(Object o, Method method, Object... objects) {
//	        StringBuilder sb = new StringBuilder();
//	        sb.append(o.getClass().getName());
//	        sb.append(method.getName());
//	        for (Object obj : objects) {
//	          sb.append(obj.toString());
//	        }
//	        return sb.toString();
//	      }
//	    };
//	  }

	/**
	 * Run the application using Spring Boot and an embedded servlet engine.
	 * 
	 * @param args
	 *            Program arguments - ignored.
	 */
	public static void main(String[] args) {
		// Tell server to look for accounts-server.properties or
		// accounts-server.yml
		System.setProperty("spring.config.name", "vehiclebybrand");
//		System.setProperty("http.proxyHost", "INSTPISA2.in.corp.sa");
//		System.setProperty("http.proxyPort", "8080");
//		System.setProperty("https.proxyHost", "INSTPISA2.in.corp.sa");
//		System.setProperty("https.proxyPort", "8080");
	    System.out.println("==============>main");

		SpringApplication.run(VehicleServiceServer.class, args);
	}
}

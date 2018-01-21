package com.dream.universal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@EnableCaching
public class RedisConfig {
	@Bean
	public  CacheManager cacheManager(RedisTemplate redisTemplate){
		return new RedisCacheManager(redisTemplate);
	}
	
    //必须配置     redis 连接池配置    change "maxActive" -> "maxTotal" and "maxWait" -> "maxWaitMillis"
    @Bean(name= "jedis.pool.config")  
    public JedisPoolConfig jedisPoolConfig (@Value("${spring.redis.maxTotal}")int maxTotal,  
			                                @Value("${spring.redis.maxIdle}")int maxIdle,  
			                                @Value("${spring.redis.maxWaitMillis}")int maxWaitMillis) {  
        JedisPoolConfig config = new JedisPoolConfig();  
        config.setMaxTotal(maxTotal);  
        config.setMaxIdle(maxIdle);  
        config.setMaxWaitMillis(maxWaitMillis);
        return config;  
    }
    //1、连接工厂 connectionFactory来自springdataredis
    //2、jedispool单机环境
    //3、shardedjedispool可以通过一致性哈希实现分布式存储
  	@Bean(name= "jedis.pool")  
    @Autowired  
    public JedisPool jedisPool(@Qualifier("jedis.pool.config") JedisPoolConfig config,   
				               @Value("${spring.redis.host}")String host,   
				               @Value("${spring.redis.port}")int port) {  
      return new JedisPool(config, host, port);  
    }  
    //redis操作模板
    @Bean
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
       RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
       redisTemplate.setConnectionFactory(factory);
       return redisTemplate;
    }

}

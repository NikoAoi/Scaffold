package app.config;

import org.springframework.context.annotation.Configuration;

/*配置类用于使用 Springboot 服务时进行个性化配置，方法如下
* 1.加上注解 @Configuration 使此类标注为需要让 Spring 扫描的配置类
* 2.继承Spring内置的配置类，并重写父类的方法，达到覆盖原有配置的目的*/

@Configuration
public class ExampleConfig {
}

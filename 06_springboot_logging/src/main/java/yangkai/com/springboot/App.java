package yangkai.com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
// @Slf4j —— Lombok 依赖  看看IDE是否支持 安装插件. 侵入性太强
@SpringBootApplication
public class App 
{
    //1.声明日志记录器
    static Logger logger= LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        SpringApplication app=new SpringApplication(App.class);
        app.run(args);
        System.out.println("PID=" + System.getProperty("PID"));

        logger.trace("跟踪");
        logger.debug("调试");
        // Springboot 默认的日志级别就是INFO
        logger.info("信息");
        logger.warn("警告");
        logger.error("异常");

    }
}

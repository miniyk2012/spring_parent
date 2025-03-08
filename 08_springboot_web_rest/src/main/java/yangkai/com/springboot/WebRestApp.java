package yangkai.com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class WebRestApp
{
    public static void main( String[] args )
    {
        SpringApplication app=new SpringApplication(WebRestApp.class);
        //app.setBannerMode(Banner.Mode.OFF); // 可以关闭springboot启动横幅
        app.run(args);
    }
}

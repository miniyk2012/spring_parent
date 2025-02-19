package yangkai.com;
/**
 * Hello world!
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author bytedance
 */
@SpringBootApplication
public class SpringInitializerApplication {

    public static void main(String[] args){
        SpringApplication app=new SpringApplication(SpringInitializerApplication.class);
        //app.setBannerMode(Banner.Mode.OFF); // 可以关闭springboot启动横幅
        app.run(args);
    }

}

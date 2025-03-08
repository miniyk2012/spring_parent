package yangkai.com;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 * @author bytedance
 */
@SpringBootApplication
public class ExternalConfigurationApp
{
    public static void main( String[] args ) throws IOException {
        SpringApplication app= new SpringApplication(ExternalConfigurationApp.class);

        Properties p = new Properties();
        InputStream is = ExternalConfigurationApp.class.getClassLoader().getResourceAsStream("app.properties");
        p.load(is);

        app.setDefaultProperties(p);
        Properties properties = System.getProperties();
        System.out.println(properties.getProperty("av"));
//        app.run(args);
    }
}

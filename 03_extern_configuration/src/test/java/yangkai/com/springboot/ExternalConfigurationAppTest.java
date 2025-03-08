package yangkai.com.springboot;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;


/**
 * Unit test for Springboot.
 */
@SpringBootTest
@TestPropertySource(locations = "classpath:appSource.properties")
public class ExternalConfigurationAppTest {
  @Value("${server.port}")
  private String port;

  @Value("${server.servlet.context-path}")
  private String path;

  @Test
  public void testApp() {
    System.out.println(port);
    System.out.println(path);
  }
}

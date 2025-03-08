package yangkai.com.springboot;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yangkai.com.beans.User;

@SpringBootTest
public class ConfigurationInjectTest {
    @Autowired
    private User user;
    @Test
    void testA() {
        System.out.println(user);
    }
}

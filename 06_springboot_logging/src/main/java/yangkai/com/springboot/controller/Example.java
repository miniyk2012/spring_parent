package yangkai.com.springboot.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yangkai.com.springboot.App;

@RestController("/example")
public class Example {
  static Logger logger= LoggerFactory.getLogger(Example.class);


  @GetMapping("/hello")
  public String hello() {

    System.out.println("PID=" + System.getProperty("PID"));

    logger.trace("跟踪");
    logger.debug("调试");
    // Springboot 默认的日志级别就是INFO
    logger.info("信息");
    logger.warn("警告");
    logger.error("异常");

    return "Hello World!";
  }

}

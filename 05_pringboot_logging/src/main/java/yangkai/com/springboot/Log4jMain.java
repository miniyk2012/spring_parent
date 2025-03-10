package yangkai.com.springboot;


import org.slf4j.LoggerFactory;
import org.apache.log4j.Logger;


/**
 * 开源开发组, 用log4j
 * Log4j(实现) + slf4j(门面)
 */
public class Log4jMain {

  public static void main(String[] args) {
//    oldLog4j();
    slf4j();

  }
  private static void slf4j() {
    org.slf4j.Logger logger = LoggerFactory.getLogger(Log4jMain.class);
    System.out.println(logger.getClass());  // Log4jLoggerAdapter
    logger.info("Hello, log4j");
  }

  private static void oldLog4j() {
    Logger logger = Logger.getLogger(Log4jMain.class);
    logger.info("Hello, log4j");
  }
}

package yangkai.com.springboot;


import java.util.logging.Logger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

/**
 * 官方开发组, 用Jul
 * Jul(实现) + JCL(门面)
 */
public class JulMain {

  public static void main(String[] args) {
    jcl();
    System.out.println();
    jul();
  }

  private static void jcl() {
    Log log = LogFactory.getLog(JulMain.class);
    System.out.println(log.getClass());
    log.info("hello JCL");
  }

  private static void jul() {
    SLF4JBridgeHandler.removeHandlersForRootLogger();
    SLF4JBridgeHandler.install();
    Logger logger = Logger.getLogger(JulMain.class.getName());
    System.out.println(logger.getClass());

    logger.info("hello JUL");
  }

}

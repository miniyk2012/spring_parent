package yangkai.com.springboot.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

  // 声明了RestTemplate
  private final RestTemplate restTemplate;

  // 当bean 没有无参构造函数的时候，spring将自动拿到有参的构造函数，参数进行自动注入
  public OrderController(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
  }

  @RequestMapping("/order")
  public String order(){
    return "";
  }
}

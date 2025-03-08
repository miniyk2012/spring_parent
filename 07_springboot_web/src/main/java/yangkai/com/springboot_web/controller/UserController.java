package yangkai.com.springboot_web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yangkai.com.springboot_web.entity.Result;
import yangkai.com.springboot_web.entity.User;
import yangkai.com.springboot_web.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  //Rest  /user/1
  @GetMapping("/{id}")
  public Result getUser(@PathVariable Integer id) {
    //int a = 1 / 0;
    User user = userService.getUserById(id);
    return new Result<>(200, "success", user);
  }

  // 新增 /user/add
  @PostMapping("/add")
  public Result addUser(@RequestBody User user) {

    System.out.println(user);
    userService.add(user);
    return new Result<>(200, "添加成功");
  }

  // 修改 /user1
  @PutMapping("/{id}")
  public Result editUser(@RequestBody User user) {
    userService.update(user);
    return new Result<>(200, "修改成功", userService.getAllUser());
  }

  // 删除 /user1
  @DeleteMapping("/{id}")
  public Result deleteUser(@PathVariable Integer id) {
    userService.delete(id);
    return new Result<>(200, "删除成功", userService.getAllUser());
  }
}

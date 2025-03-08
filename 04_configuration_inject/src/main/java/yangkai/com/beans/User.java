package yangkai.com.beans;


import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user")
public class User {

  @Value("${user.username}")
  private String username;
  @Value("${user.age}")
  private Integer age;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date birthDay;

  private List<String> hobbies;
  private Map<Integer, String> girlFriend;
  private Address address;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String toString() {
    return "User{" +
        "username='" + username + '\'' +
        ", age=" + age +
        ", birthDay=" + birthDay +
        ", hobbies=" + hobbies +
        ", girlFriend=" + girlFriend +
        ", address=" + address +
        '}';
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Date getBirthDay() {
    return birthDay;
  }

  public void setBirthDay(Date birthDay) {
    this.birthDay = birthDay;
  }

  public List<String> getHobbies() {
    return hobbies;
  }

  public void setHobbies(List<String> hobbies) {
    this.hobbies = hobbies;
  }

  public Map<Integer, String> getGirlFriend() {
    return girlFriend;
  }

  public void setGirlFriend(Map<Integer, String> girlFriend) {
    this.girlFriend = girlFriend;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}

package lombokdemo.builders;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class Person {
    String name;
    Integer age;

}

package lombokdemo.builders;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Person {
    String name;
    Integer age;

}

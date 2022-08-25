package lombokdemo.builders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testCreate() {
        String name = "John Doe";
        Integer age = 42;
        Person bean = Person.builder()
            .name(name)
            .age(age)
            .build();
        assertEquals(name, bean.getName());
        assertEquals(age, bean.getAge());
        assertThat(bean.toString()).startsWith(Person.class.getCanonicalName());
    }

    @Test
    void testCreateNameOnly() {
        String name = "John Doe";
        Person bean = Person.builder()
            .name(name)
            .build();
        assertEquals(name, bean.getName());
        assertNull(bean.getAge());
    }

    @Test
    void testCopyAndMutate() {
        String name = "John Doe";
        Integer age = 42;
        Person bean = Person.builder()
            .name(name)
            .age(age)
            .build();
        Integer oldAge = 65;
        var olderBean = bean.toBuilder().age(oldAge).build();
        assertEquals(name, olderBean.getName());
        assertEquals(oldAge, olderBean.getAge());
    }

    @Test
    void testBuilderToString() {
        String name = "John Doe";
        Integer age = 42;
        var builderAsString = Person.builder()
            .name(name)
            .age(age)
            .toString();
        assertThat(builderAsString)
            .startsWith("Person.PersonBuilder")
            .contains(name)
            .contains(age.toString());
    }

}

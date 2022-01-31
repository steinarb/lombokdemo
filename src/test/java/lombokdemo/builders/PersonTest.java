package lombokdemo.builders;

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

}

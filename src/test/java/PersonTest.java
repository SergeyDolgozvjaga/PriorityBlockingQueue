import com.sergeydolzgozvjaga.priorityblockingqueue.Model.Person;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class PersonTest {

    private List<Person> actual() {
        List<Person> actual = Arrays.asList(
                new Person("Paul", 23, 5000),
                new Person("John", 35, 7000),
                new Person("Michel", 37, 6500)
        );

        return actual;
    }

    private List<Person> expected() {
        List<Person> actual = Arrays.asList(
                new Person("Paul", 23, 5000),
                new Person("John", 35, 7000),
                new Person("Michel", 37, 6500)
        );

        return actual;
    }


    @org.junit.Before
    public void setUp() {
        System.out.println("Before test");
    }

    @org.junit.After
    public void tearDown() {
        System.out.println("After test");
    }

    @org.junit.Test
    public void equalsPersons() {

        assertThat(actual(), Matchers.hasItems(
                new Person("Paul", 23, 5000),
                new Person("John", 35, 7000),
                new Person("Michel", 37, 6500)
        ));
    }

    @Test
    public void equalsPersons2() {

        assertThat(actual(), hasItems(
                new Person("Paul", 23, 5000),
                new Person("John", 35, 7000),
                new Person("Michel", 37, 6500)
        ));
    }

    @org.junit.Test
    public void equalsPropertyPersonsAndValue() {

        //Test class property, and its value
        assertThat(actual(), containsInAnyOrder(
                new Person("Paul", 23, 5000),
                new Person("John", 35, 7000),
                new Person("Michel", 37, 6500)
        ));
    }

    @Test
    public void listArrayPass(){
        assertThat(actual(), is(expected()));
    }
}

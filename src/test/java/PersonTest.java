import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2018-11-12.
 */
public class PersonTest {
    
    @Test
    public void allCharacteristics() {
        var person = new Person(Person.OPEN_MINDED | Person.INTELLIGENT | Person.ATHLETIC);
        
        assertTrue(person.hasCharacteristics(Person.OPEN_MINDED));
        assertTrue(person.hasCharacteristics(Person.INTELLIGENT));
        assertTrue(person.hasCharacteristics(Person.ATHLETIC));
    }

    @Test
    public void openMinded() {
        var person = new Person(Person.OPEN_MINDED);

        assertTrue(person.hasCharacteristics(Person.OPEN_MINDED));
        assertFalse(person.hasCharacteristics(Person.INTELLIGENT));
        assertFalse(person.hasCharacteristics(Person.ATHLETIC));
    }

    @Test
    public void intelligent() {
        var person = new Person(Person.INTELLIGENT);

        assertFalse(person.hasCharacteristics(Person.OPEN_MINDED));
        assertTrue(person.hasCharacteristics(Person.INTELLIGENT));
        assertFalse(person.hasCharacteristics(Person.ATHLETIC));
    }

    @Test
    public void athletic() {
        var person = new Person(Person.ATHLETIC);

        assertFalse(person.hasCharacteristics(Person.OPEN_MINDED));
        assertFalse(person.hasCharacteristics(Person.INTELLIGENT));
        assertTrue(person.hasCharacteristics(Person.ATHLETIC));
    }

    @Test
    public void openMinded_intelligent() {
        var person = new Person(Person.OPEN_MINDED | Person.INTELLIGENT);

        assertTrue(person.hasCharacteristics(Person.OPEN_MINDED));
        assertTrue(person.hasCharacteristics(Person.INTELLIGENT));
        assertFalse(person.hasCharacteristics(Person.ATHLETIC));
    }

    @Test
    public void openMinded_athletic() {
        var person = new Person(Person.OPEN_MINDED | Person.ATHLETIC);

        assertTrue(person.hasCharacteristics(Person.OPEN_MINDED));
        assertFalse(person.hasCharacteristics(Person.INTELLIGENT));
        assertTrue(person.hasCharacteristics(Person.ATHLETIC));
    }

    @Test
    public void intelligent_athletic() {
        var person = new Person(Person.INTELLIGENT | Person.ATHLETIC);

        assertFalse(person.hasCharacteristics(Person.OPEN_MINDED));
        assertTrue(person.hasCharacteristics(Person.INTELLIGENT));
        assertTrue(person.hasCharacteristics(Person.ATHLETIC));
    }

}
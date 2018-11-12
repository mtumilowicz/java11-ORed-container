# java11-ORed-container
Showcase of ORed container.

Example: characteristics of `Spliterator`.

# preface
It's not a proper way of programming, we provide it mainly
for informational purpose and because of `Spliterator`'s characteristics
construction.

# project description
We have a class Person, every person could have some characteristics.
It is possible to implement it in a such way (using binary data and
binary operations):
```
@Value
class Person {
    public final int characteristics;

    Person(int characteristics) {
        this.characteristics = characteristics;
    }

    public static final int OPEN_MINDED = 0x001;
    public static final int ATHLETIC = 0x004;
    public static final int INTELLIGENT = 0x010;

    boolean hasCharacteristics(int characteristics) {
        return (this.characteristics & characteristics) == characteristics;
    }
}
```
* we put characteristics linked with `OR` in a constructor, for example:
    ```
    new Person(Person.OPEN_MINDED | Person.INTELLIGENT | Person.ATHLETIC);
    ```
* we check if a given person has some characteristics:
    ```
    person.hasCharacteristics(Person.OPEN_MINDED)
    ```
* simply:
    * `|` is like a put to the set
    * `&` and then `==` is something like contains

# tests
* `BinaryArithmetic` - we show why defined above operations are
correct:
    * conversion from hex to binary
    * OR
    * AND
* `PersonTest` - we construct person with some characteristics and
then check if `hasCharacteristics` is correct
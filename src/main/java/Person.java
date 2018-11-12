import lombok.Value;

/**
 * Created by mtumilowicz on 2018-11-12.
 */
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

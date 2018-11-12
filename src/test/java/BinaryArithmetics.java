import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mtumilowicz on 2018-11-12.
 */
public class BinaryArithmetics {
    @Test
    public void _0x001_toBinary() {
        assertThat(Integer.toBinaryString(0x001), is(0b001));
    }

    @Test
    public void _0x004_toBinary() {
        assertThat(Integer.toBinaryString(0x004), is(0b100));
    }
    
    @Test void sum_0x004_0x001_equals_0x100() {
        assertThat(Integer.toBinaryString(0x004), is(0b101));
    }
}

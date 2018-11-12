import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mtumilowicz on 2018-11-12.
 */
public class BinaryArithmetic {
    
    @Test
    public void _0x001_toBinary() {
        assertThat(0x001, is(0b001));
    }

    @Test
    public void _0x004_toBinary() {
        assertThat(0x004, is(0b100));
    }
    
    @Test 
    public void sum_0x004_0x001_equals_0x100() {
        assertThat(0x004 | 0x001, is(0b101));
    }

    @Test
    public void sum_0x005_contains_0x001_and_0x004() {
        assertThat(0x005 & 0x001, is(0x001));
        assertThat(0x005 & 0x004, is(0x004));
    }
}

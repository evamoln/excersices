package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

public class FizzBuzzTest {

    @Test
    public void testSingleInt() {
        Assert.assertThat(FizzBuzz.getFizzBuzzString(4, 4), equalTo("4"));
    }
    
    @Test
    public void testZero() {
        Assert.assertThat(FizzBuzz.getFizzBuzzString(0, 0), equalTo("fizzbuzz"));
    }
    
    @Test
    public void testFizz() {
        Assert.assertThat(FizzBuzz.getFizzBuzzString(2, 4), equalTo("2 fizz 4"));
    }
    
    @Test
    public void testBuzz() {
        Assert.assertThat(FizzBuzz.getFizzBuzzString(4, 5), equalTo("4 buzz"));
    }
    
    @Test
    public void testFizzBuzz() {
        Assert.assertThat(FizzBuzz.getFizzBuzzString(14, 16), equalTo("14 fizzbuzz 16"));
    }
}

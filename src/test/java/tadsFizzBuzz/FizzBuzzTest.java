package tadsFizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		assertEquals("Fizz", fizzBuzz.ehFizzBuzz(66));
		assertEquals("Buzz", fizzBuzz.ehFizzBuzz(65));
		assertEquals("FizzBuzz", fizzBuzz.ehFizzBuzz(90));
		assertEquals("Continua o jogo", fizzBuzz.ehFizzBuzz(1));
	}

}

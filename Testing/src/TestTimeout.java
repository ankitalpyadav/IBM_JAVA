import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.function.Executable;

public class TestTimeout {

	@Test
	@Timeout(unit = TimeUnit.MILLISECONDS, value = 10)
	public void testTimeout() throws InterruptedException {
		Thread.sleep(3);
	}
	
	@Test
	public void testTimeoutAssert() {
		assertTimeout(Duration.ofMillis(10), () -> {Thread.sleep(100);});
	}
	
	
}

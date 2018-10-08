import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ServletErrorTest.class, ServletSuccessTest.class, ValidationTest.class })
public class AllTests {

}

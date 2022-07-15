package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Test_itAdds.class, Test_itDivides.class, Test_itMultiplies.class, Test_itSubtracts.class })
public class AllTests {

}

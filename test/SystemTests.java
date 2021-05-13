import andrey.shalya.CsvLogger;
import andrey.shalya.MySystem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DisplayName("System solver tests")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SystemTests {
    private MySystem mySystem;
    private final double ACCURACY = 0.001;
    private final double DELTA = 0.05;

    @BeforeAll
    void init() {
        mySystem = new MySystem(ACCURACY);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/resources/system-data.csv")
    void systemSolverTest(Double x, Double expectedResult) {
        assertEquals(expectedResult, mySystem.getF(x), DELTA);
    }
}


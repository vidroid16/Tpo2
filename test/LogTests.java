import Logarithm.*;
import Logarithm.LStubs.*;
import andrey.shalya.CsvLogger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Logarithm function")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LogTests {
    private SystemLog systemLog;
    private LinLog ln;
    private Log5 log5;
    private Log3 log3;
    private Log10 log10;
    private SystemLogStubOne systemLogStubOne;
    private SystemLogStubTwo systemLogStubTwo;
    private Log5Stubs log5Stubs;
    private Log3Stubs log3Stubs;
    private Log10Stubs log10Stubs;
    private LinLogStubs linLogStubs;
    private CsvLogger logger = new CsvLogger("ln-results.csv", 0.25, 5.0, 0.5);
    private final double DELTA = 0.05;
    private final double ACCURACY = 0.001;

    @BeforeAll
    void init() {
        this.ln = new LinLog(ACCURACY);
        this.log3 = new Log3(ln);
        this.log5 = new Log5(ln);
        this.log10 = new Log10(ln);
        this.systemLog = new SystemLog(ln);
        this.systemLogStubOne = new SystemLogStubOne();
        this.systemLogStubTwo = new SystemLogStubTwo(ACCURACY);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/resources/log/log-data.csv")
    void allLogsAreStubs(Double x, Double expectedResult) {
        try {
            double actualResult = systemLogStubOne.getF(x);
            System.out.println(actualResult);
            assertEquals(expectedResult, actualResult, DELTA);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/resources/log/log-data.csv")
    void lnIsStub(Double x, Double expectedResult) {
        try {
            double actualResult = systemLogStubTwo.getF(x);
            System.out.println(actualResult);
            assertEquals(expectedResult, actualResult, DELTA);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            assertEquals(IllegalArgumentException.class, e.getClass());
        }

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/resources/log/log-data.csv")
    void allModulesAvailable(Double x, Double expectedResult) {
        try {
            double actualResult = systemLog.getF(x);
            System.out.println(actualResult);
            assertEquals(expectedResult, actualResult, DELTA);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    //@Ignore
    @DisplayName("Logging")
    void logResults() {
        logger.log(ln);

        logger.setFilePath("log3-results.csv");
        logger.log(log3);

        logger.setFilePath("log5-results.csv");
        logger.setUpperBorder(10.0);
        logger.log(log5);

        logger.setFilePath("log10-results.csv");
        logger.setUpperBorder(15.0);
        logger.log(log10);

        logger.setFilePath("func-results.csv");
        logger.log(systemLog);



    }
}

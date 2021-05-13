import Thrigonometric.Cos;
import Thrigonometric.Cot;
import Thrigonometric.*;
import Thrigonometric.SystemThrigon;
import Thrigonometric.TStubs.*;
import andrey.shalya.CsvLogger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Trigonometric function")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ThrigonTests {
    private Sin sin;
    private Cos cos;
    private Cot cot;
    private Sec sec;
    private Csc csc;

    private SinStubs sinStubs;
    private CosStubs cosStubs;
    private SystemThrigon systemThrigon;
    private SystemThrigonStubOne systemThrigonStubOne;
    private SystemThrigonStubTwo systemThrigonStubTwo;

    private CsvLogger logger = new CsvLogger("cos-results.csv", -15.0, 0.0, 0.5);
    private final double ACCURACY = 0.00001;
    private final double DELTA = 0.05;
    private final double PI = Math.PI;

    @BeforeAll
    void init() {
       this.sin = new Sin(ACCURACY);
       this.cos = new Cos(sin);
       this.cot = new Cot(sin);
       this.sec = new Sec(sin);
       this.csc = new Csc(sin);
       this.systemThrigon = new SystemThrigon(sin);
       this.systemThrigonStubOne = new SystemThrigonStubOne();
       this.systemThrigonStubTwo = new SystemThrigonStubTwo(ACCURACY);
       this.sinStubs = new SinStubs();
       this.cosStubs = new CosStubs();
    }

    @ParameterizedTest(name = "X = {0} * PI / {1}")
    @CsvFileSource(resources = "/resources/trig/trig-data.csv")
    @DisplayName("sec(x), cos(x), sin(x), csc(x), cot(x) are a stub")
    void secCalculatorIsStub(Double numerator, Double denominator, Double expectedResult) {
        double x = numerator * PI / denominator;
        try {
            double actualResult = systemThrigonStubOne.getF(x);
            System.out.println(actualResult);
            assertEquals(expectedResult, actualResult, DELTA);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @ParameterizedTest(name = "X = {0} * PI / {1}")
    @CsvFileSource(resources = "resources/trig/trig-data.csv")
    @DisplayName("cos(x), sin(x) are a stub")
    void cosCalculatorIsStub(Double numerator, Double denominator, Double expectedResult) {
        double x = numerator * PI / denominator;
        try {
            double actualResult = systemThrigonStubTwo.getF(x);
            System.out.println(actualResult);
            assertEquals(expectedResult, actualResult, DELTA);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @ParameterizedTest(name = "X = {0} * PI / {1}")
    @CsvFileSource(resources = "resources/trig/trig-data.csv")
    @DisplayName("All calculators aren't stubs")
    void nothingIsStub(Double numerator, Double denominator, Double expectedResult) {
        double x = numerator * PI / denominator;
        try {
            double actualResult = systemThrigon.getF(x);
            System.out.println(actualResult);
            assertEquals(expectedResult, actualResult, DELTA);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    void log() {
        logger.log(cos);
        logger.setFilePath("sec-results.csv");
        logger.setLowerBorder(-5*PI);
        logger.log(sec);
        logger.setFilePath("csc-results.csv");
        logger.log(csc);
        logger.setFilePath("cot-results.csv");
        logger.log(cot);
        logger.setFilePath("sin-results.csv");
        logger.log(sin);

        logger.setFilePath("thrigon-function-results.csv");
        logger.log(systemThrigon);
    }
}

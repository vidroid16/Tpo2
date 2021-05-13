package andrey.shalya;

import lombok.Data;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

@Data
public class CsvLogger {
    private String filePath = "test/resources/";
    private double step;
    private double lowerBorder;
    private double upperBorder;
    private final char CSV_SEPARATOR = ' ';

    public CsvLogger(String fileName, double lowerBorder, double upperBorder, double step) {
        this.filePath = String.format("%s%s", filePath, fileName);
        this.lowerBorder = lowerBorder;
        this.upperBorder = upperBorder;
        this.step = step;
    }

    public void setFilePath(String fileName) {
        this.filePath = String.format("test/resources/output/%s", fileName);
    }

    public double getStep() {
        return step;
    }

    public void setStep(double step) {
        this.step = step;
    }

    public double getLowerBorder() {
        return lowerBorder;
    }

    public void setLowerBorder(double lowerBorder) {
        this.lowerBorder = lowerBorder;
    }

    public double getUpperBorder() {
        return upperBorder;
    }

    public void setUpperBorder(double upperBorder) {
        this.upperBorder = upperBorder;
    }

    public char getCSV_SEPARATOR() {
        return CSV_SEPARATOR;
    }

    public void log(AbstractFunc function) {
        String csvString = "";

        try(PrintStream printStream = new PrintStream(new FileOutputStream(filePath, true))) {
            for (double i = lowerBorder; i < upperBorder; i += step) {
                double result = function.getF(i);
                csvString = String.format("%f%s %f\n", i, CSV_SEPARATOR, result);
                printStream.print(csvString);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

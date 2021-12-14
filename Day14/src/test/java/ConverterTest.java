import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    private Converter converter;
    private WeightConverter weightConverter;

    @BeforeEach
    public void setup(){
        converter = new Converter();
        weightConverter = new WeightConverter();
    }

    @Nested
    public class UnitConversionTest{
        @Test
        public void checkIfOneCentimeterIsOneCentimeter(){
            double actualMeasurement= converter.unitConverter(1,"cm","cm");
            double expectedMeasurement = 1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }


        @Test
        public void checkIfHundredCentimeterIsPointZeroZeroOneKilometer(){
            double actualMeasurement= converter.unitConverter(100,"cm","km");
            double expectedMeasurement = 0.001;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfTwoMeterIsPointZeroZeroTwoKilometer(){
            double actualMeasurement= converter.unitConverter(2,"m","km");
            double expectedMeasurement = 0.002;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfTenCentimeterIsPointZeroOneMeter(){
            double actualMeasurement= converter.unitConverter(10,"cm","m");
            double expectedMeasurement = 0.1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfOneHundredGramIsZeroPointOneKiloGram(){
            double actualMeasurement= weightConverter.unitConverter(100,"g","kg");
            double expectedMeasurement = 0.1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }


        @Test
        public void checkIfZeroPointOneKilogramIsHundredGram(){
            double actualMeasurement= weightConverter.unitConverter(0.1,"kg","g");
            double expectedMeasurement = 100;
            assertEquals(expectedMeasurement,actualMeasurement);
        }


        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsNegative(){
            assertThrows(IllegalArgumentException.class,() -> {
                converter.unitConverter(-1,"cm","cm");});
        }

        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsZero(){
            assertThrows(IllegalArgumentException.class,() -> {
                converter.unitConverter(0,"cm","cm");});
        }

        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsInvalid(){
            assertThrows(IllegalArgumentException.class,() -> {
                converter.unitConverter(10,"mm","cm");});
        }

    }

    @Nested
    public class AddValueTest{
        @Test
        public void checkIfOneMeterPlusHundredCentimeterIsTwoMeter(){
            double actualMeasurement= converter.addValue(1,"m",100,"cm");
            double expectedMeasurement = 2;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfTwoHundredCentimeterPlusOneKilometerIsTwoLakhOneHundredCentimeter(){
            double actualMeasurement= converter.addValue(100,"cm",2,"km");
            double expectedMeasurement = 200100;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public  void checkIfTenGramPlusOneKiligramsIsOneThousandTen() {
            double actualMeasurement = weightConverter.addValue(10, "g", 1, "kg");
            double expectedMeasurement = 1010;
            assertEquals(expectedMeasurement, actualMeasurement);
        }
        

        @Test
        public void throwsIllegalArgumentExceptionIfFirstValueIsNegative() {
            assertThrows(IllegalArgumentException.class, () -> {
                converter.addValue(-1, "cm", 100, "m");
            });
        }


        @Test
        public void throwsIllegalArgumentExceptionIfUnitOfFirstValueIsInvalid () {
            assertThrows(IllegalArgumentException.class, () -> {
                    converter.addValue(1, "mm", 2, "km");});
            }

        @Test
        public void throwsIllegalArgumentExceptionIfSecondValueIsZero() {
            assertThrows(IllegalArgumentException.class, () -> {
                converter.addValue(100, "cm", 0, "m");
            });
        }

        @Test
        public void throwsIllegalArgumentExceptionIfSecondUnitIsInvalid(){
            assertThrows(IllegalArgumentException.class, () -> {
                converter.addValue(10, "km", 10, "N");
            });
        }


    }


    @Nested
    public class SubtractValueTest{

    @Test
    public void checkIfOneMeterMinusFiftyCentimeterIsPointFiveMeter(){
        double actualMeasurement= converter.subValue(1,"m",50,"cm");
        double expectedMeasurement = 0.5;
        assertEquals(expectedMeasurement,actualMeasurement);
    }

    @Test
    public void checkIfTwoThousanddCentimeterMinusOneMeterIsOneThousandNineHundredCentimeter(){
        double actualMeasurement= converter.subValue(2000 ,"cm",1,"m");
        double expectedMeasurement = 1900;
        assertEquals(expectedMeasurement,actualMeasurement);
    }

    @Test
    public void checkIfSixKilometerMinusTwoHundredCentimeterIsFivePointNineNineEightKilometer(){
        double actualMeasurement= converter.subValue(6,"km",200,"cm");
        double expectedMeasurement = 5.998;
        assertEquals(expectedMeasurement,actualMeasurement);
    }


        @Test
        public  void checkIfTenGramMinusOneGramIsNineGram(){
            double actualMeasurement = weightConverter.subValue(10,"g",1,"g");
            double expectedMeasurement = 9;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void throwsExceptionIfFirstValueIsMinusTwo() {
            assertThrows(IllegalArgumentException.class, () -> {
                converter.subValue(-2, "cm", 100, "m");
            });
        }


        @Test
        public void throwsExceptionIfUnitOfFirstValueIsWrong() {
            assertThrows(IllegalArgumentException.class, () -> {
                converter.subValue(1, "N", 20, "km");});
        }

        @Test
        public void throwsExceptionIfSecondValueIsZero() {
            assertThrows(IllegalArgumentException.class, () -> {
                converter.subValue(86, "cm", 0, "cm");
            });
        }

        @Test
        public void throwsExceptionIfUnitOfSecondValueIsInvalid(){
            assertThrows(IllegalArgumentException.class, () -> {
                converter.subValue(100, "m", 10, "A");
            });
        }


   }



}
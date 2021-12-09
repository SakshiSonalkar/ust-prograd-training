import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {
    private Convertor convertor;

    @BeforeEach
    public void setup(){
        convertor = new Convertor();
    }

    @Nested
    public class UnitConversionTest{
        @Test
        public void checkIfOneCentimeterIsOneCentimeter(){
            double actualMeasurement= convertor.unitConvertor(1,"cm","cm");
            double expectedMeasurement = 1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfOneMeterIsHundredCentimeter(){
            double actualMeasurement= convertor.unitConvertor(1,"m","cm");
            double expectedMeasurement = 100;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfHundredCentimeterIsPointZeroZeroOneKilometer(){
            double actualMeasurement= convertor.unitConvertor(100,"cm","km");
            double expectedMeasurement = 0.001;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfTwoMeterIsPointZeroZeroTwoKilometer(){
            double actualMeasurement= convertor.unitConvertor(2,"m","km");
            double expectedMeasurement = 0.002;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfTenCentimeterIsPointZeroOneMeter(){
            double actualMeasurement= convertor.unitConvertor(10,"cm","m");
            double expectedMeasurement = 0.1;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsNegative(){
            assertThrows(IllegalArgumentException.class,() -> {
                convertor.unitConvertor(-1,"cm","cm");});
        }

        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsZero(){
            assertThrows(IllegalArgumentException.class,() -> {
                convertor.unitConvertor(0,"cm","cm");});
        }

        @Test
        public void throwsIllegalArgumentExceptionIfMeasurementIsInvalid(){
            assertThrows(IllegalArgumentException.class,() -> {
                convertor.unitConvertor(10,"mm","cm");});
        }

    }

    @Nested
    public class AddTest{
        @Test
        public void checkIfOneMeterPlusHundredCentimeterIsTwoMeter(){
            double actualMeasurement= convertor.add(1,"m",100,"cm");
            double expectedMeasurement = 2;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void checkIfTwoHundredCentimeterPlusOneKilometerIsTwoLakhOneHundredCentimeter(){
            double actualMeasurement= convertor.add(100,"cm",2,"km");
            double expectedMeasurement = 200100;
            assertEquals(expectedMeasurement,actualMeasurement);
        }

        @Test
        public void throwsIllegalArgumentExceptionIfFirstValueIsNegative() {
            assertThrows(IllegalArgumentException.class, () -> {
                convertor.add(-1, "cm", 100, "m");
            });
        }


        @Test
        public void throwsIllegalArgumentExceptionIfUnitOfFirstValueIsInvalid () {
            assertThrows(IllegalArgumentException.class, () -> {
                    convertor.add(1, "mm", 2, "km");});
            }

        @Test
        public void throwsIllegalArgumentExceptionIfSecondValueIsZero() {
            assertThrows(IllegalArgumentException.class, () -> {
                convertor.add(100, "cm", 0, "m");
            });
        }

        @Test
        public void throwsIllegalArgumentExceptionIfSecondUnitIsInvalid(){
            assertThrows(IllegalArgumentException.class, () -> {
                convertor.add(10, "km", 10, "N");
            });
        }


    }


    @Nested
    public class SubtractTest{

    @Test
    public void checkIfOneMeterMinusFiftyCentimeterIsPointFiveMeter(){
        double actualMeasurement= convertor.sub(1,"m",50,"cm");
        double expectedMeasurement = 0.5;
        assertEquals(expectedMeasurement,actualMeasurement);
    }

    @Test
    public void checkIfTwoThousanddCentimeterMinusOneMeterIsOneThousandNineHundredCentimeter(){
        double actualMeasurement= convertor.sub(2000 ,"cm",1,"m");
        double expectedMeasurement = 1900;
        assertEquals(expectedMeasurement,actualMeasurement);
    }

    @Test
    public void checkIfSixKilometerMinusTwoHundredCentimeterIsFivePointNineNineEightKilometer(){
        double actualMeasurement= convertor.sub(6,"km",200,"cm");
        double expectedMeasurement = 5.998;
        assertEquals(expectedMeasurement,actualMeasurement);
    }

        @Test
        public void throwsExceptionIfFirstValueIsMinusTwo() {
            assertThrows(IllegalArgumentException.class, () -> {
                convertor.sub(-2, "cm", 100, "m");
            });
        }


        @Test
        public void throwsExceptionIfUnitOfFirstValueIsWrong() {
            assertThrows(IllegalArgumentException.class, () -> {
                convertor.sub(1, "N", 20, "km");});
        }

        @Test
        public void throwsExceptionIfSecondValueIsZero() {
            assertThrows(IllegalArgumentException.class, () -> {
                convertor.sub(86, "cm", 0, "cm");
            });
        }

        @Test
        public void throwsExceptionIfUnitOfSecondValueIsInvalid(){
            assertThrows(IllegalArgumentException.class, () -> {
                convertor.sub(100, "m", 10, "A");
            });
        }



   }




}
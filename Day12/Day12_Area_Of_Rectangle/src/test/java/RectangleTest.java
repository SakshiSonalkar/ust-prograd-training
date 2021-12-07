import org.junit.jupiter.api.*;

public class RectangleTest {
    private Rectangle areaRect;
    private Rectangle circum;


    
    @Nested
    class AreaOfRectangle{
        @Test
        public void areaOfRectangleOfLengthTwentyAndBreadthThirtyIsSixHundred() {
            areaRect = new Rectangle(20,30);
            double answer = areaRect.area();
            double correctAnswer = 600;
            Assertions.assertEquals(answer, correctAnswer);
        }

        @Test
        public void areaOfRectangleOfLengthSixPointOneAndBreadthTwoPointFourIsFourteenPointSixThreeNineNine() {
            areaRect = new Rectangle(6.1,2.4);
            double answer = areaRect.area();
            double correctAnswer = 14.639999999999999;
            Assertions.assertEquals(answer, correctAnswer);
        }

        @Test
        public void areaOfRectangleOfLengthTwentyTwoPointTwoAndBreadthTwoIsFortyFourPointFour() {
            areaRect = new Rectangle(22.2,2);
            double answer = areaRect.area();
            double correctAnswer = 44.4;
            Assertions.assertEquals(answer, correctAnswer);
        }

        @Test
        public void areaOfRectangleOfLengthFortyAndBreadthTwoPointOneSixNineIsEightySixPointSevenSix() {
            areaRect = new Rectangle(40,2.169);
            double answer = areaRect.area();
            double correctAnswer = 86.76;
            Assertions.assertEquals(answer, correctAnswer);
        }

        @Test
        public void throwsExceptionWhenLengthAndBreadthAreZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () ->{
                Rectangle areaRect = new Rectangle(0,0);
                areaRect.area() ;
            } );
        }

        @Test
        public void throwsExceptionWhenLengthMinusOneAndBreadthOne() {
            Assertions.assertThrows(IllegalArgumentException.class, () ->{
                Rectangle areaRect = new Rectangle(-1,1);
                areaRect.area() ;
            } );
        }

        @Test
        public void throwsExceptionWhenLengthMinusTwoAndBreadthZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () ->{
                Rectangle areaRect = new Rectangle(-2,0);
                areaRect.area() ;
            } );
        }



    }

    @Nested
    class PerimeterOfRectangle{
        @BeforeEach
        public void setup(){
            circum = new Rectangle();
        }

        @Test
        public void perimeterOfRectangleOfLengthTwoAndBreadthTenIsTwentyFour(){
            circum.setLength(2);
            circum.setBreadth(10);
            double answer = circum.perimeter();
            double correctAnswer = 24;
            Assertions.assertEquals(answer, correctAnswer);
        }

        @Test
        public void perimeterOfRectangleOfLengthTwoPointFourAndBreadthSixIsSixteenPointEight(){
            circum.setLength(2.4);
            circum.setBreadth(6);
            double answer = circum.perimeter();
            double correctAnswer = 16.8;
            Assertions.assertEquals(answer, correctAnswer);
        }


        @Test
        public void perimeterOfRectangleOfLengthFourPointSixAndBreadthOnePointTwoIsElevenPointSix(){
            circum.setLength(4.6);
            circum.setBreadth(1.2);
            double answer = circum.perimeter();
            double correctAnswer = 11.6;
            Assertions.assertEquals(answer, correctAnswer);
        }

        @Test
        public void throwsExceptionWhenLengthAndBreadthAreZeroForPerimeter() {
            Assertions.assertThrows(IllegalArgumentException.class, () ->{
                circum.setLength(0);
                circum.setBreadth(0);
                circum.perimeter() ;
            } );
        }

        @Test
        public void throwsExceptionWhenLengthOrBreadthIsNegative() {
            Assertions.assertThrows(IllegalArgumentException.class, () ->{
                circum.setLength(-1);
                circum.setBreadth(4);
                circum.perimeter() ;
            } );
        }

        @Test
        public void throwsExceptionWhenBothLengthAndBreadthAreNegative() {
            Assertions.assertThrows(IllegalArgumentException.class, () ->{
                circum.setLength(-8);
                circum.setBreadth(-5);
                circum.perimeter() ;
            } );
        }



    }

    }





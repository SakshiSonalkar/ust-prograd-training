import org.junit.jupiter.api.*;

public class RectangleTest {
    private Rectangle area;
    private Rectangle perimeter;


    
    @Nested
    class AreaOfRectangle{
        @Test
        public void areaOfRectangleOfLengthTwentyAndBreadthThirtyIsSixHundred() {
            area = new Rectangle(20,30);
            double actualArea = area.areaOfRectangle();
            double expectedArea = 600;
            Assertions.assertEquals(actualArea, expectedArea);
        }

        @Test
        public void areaOfRectangleOfLengthSixPointOneAndBreadthTwoPointFourIsFourteenPointSixThreeNineNine() {
            area = new Rectangle(6.1,2.4);
            double actualArea = area.areaOfRectangle();
            double expectedArea = 14.639999999999999;
            Assertions.assertEquals(actualArea, expectedArea);
        }

        @Test
        public void areaOfRectangleOfLengthTwentyTwoPointTwoAndBreadthTwoIsFortyFourPointFour() {
            area = new Rectangle(22.2,2);
            double actualArea = area.areaOfRectangle();
            double expectedArea = 44.4;
            Assertions.assertEquals(actualArea, expectedArea);
        }

        @Test
        public void areaOfRectangleOfLengthFortyAndBreadthTwoPointOneSixNineIsEightySixPointSevenSix() {
            area = new Rectangle(40,2.169);
            double actualArea = area.areaOfRectangle();
            double expectedArea = 86.76;
            Assertions.assertEquals(actualArea, expectedArea);
        }

        @Test
        public void throwsExceptionWhenLengthAndBreadthAreZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () ->{
                Rectangle area = new Rectangle(0,0);
                area.areaOfRectangle() ;
            } );
        }

        @Test
        public void throwsExceptionWhenLengthMinusOneAndBreadthOne() {
            Assertions.assertThrows(IllegalArgumentException.class, () ->{
                Rectangle area = new Rectangle(-1,1);
                area.areaOfRectangle() ;
            } );
        }

        @Test
        public void throwsExceptionWhenLengthMinusTwoAndBreadthZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () ->{
                Rectangle area = new Rectangle(-2,0);
                area.areaOfRectangle() ;
            } );
        }



    }

    @Nested
    class PerimeterOfRectangle{
        @BeforeEach
        public void setup(){
            perimeter = new Rectangle();
        }

        @Test
        public void perimeterOfRectangleOfLengthTwoAndBreadthTenIsTwentyFour(){
            perimeter.setLength(2);
            perimeter.setBreadth(10);
            double actualPerimeter = perimeter.perimeterOfRectangle();
            double expectedPerimeter = 24;
            Assertions.assertEquals(actualPerimeter, expectedPerimeter);
        }

        @Test
        public void perimeterOfRectangleOfLengthTwoPointFourAndBreadthSixIsSixteenPointEight(){
            perimeter.setLength(2.4);
            perimeter.setBreadth(6);
            double actualPerimeter = perimeter.perimeterOfRectangle();
            double expectedPerimeter = 16.8;
            Assertions.assertEquals(actualPerimeter, expectedPerimeter);
        }


        @Test
        public void perimeterOfRectangleOfLengthFourPointSixAndBreadthOnePointTwoIsElevenPointSix(){
            perimeter.setLength(4.6);
            perimeter.setBreadth(1.2);
            double actualPerimeter = perimeter.perimeterOfRectangle();
            double expectedPerimeter = 11.6;
            Assertions.assertEquals(actualPerimeter, expectedPerimeter);
        }

        @Test
        public void throwsExceptionWhenLengthAndBreadthAreZeroForPerimeter() {
            Assertions.assertThrows(IllegalArgumentException.class, () ->{
                perimeter.setLength(0);
                perimeter.setBreadth(0);
                perimeter.perimeterOfRectangle() ;
            } );
        }

        @Test
        public void throwsExceptionWhenLengthOrBreadthIsNegative() {
            Assertions.assertThrows(IllegalArgumentException.class, () ->{
                perimeter.setLength(-1);
                perimeter.setBreadth(4);
                perimeter.perimeterOfRectangle() ;
            } );
        }

        @Test
        public void throwsExceptionWhenBothLengthAndBreadthAreNegative() {
            Assertions.assertThrows(IllegalArgumentException.class, () ->{
                perimeter.setLength(-8);
                perimeter.setBreadth(-5);
                perimeter.perimeterOfRectangle() ;
            } );
        }



    }

    }





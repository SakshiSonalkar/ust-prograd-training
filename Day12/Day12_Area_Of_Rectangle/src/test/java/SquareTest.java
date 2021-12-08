import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Square square;

    @Nested
    public class AreaOfSquare{
        @Test
        public void AreaOFSquareOfSideSixIsThirtySix(){
            square= new Square(6);
            double actualArea = square.area();
            double expectedArea = 36;
            assertEquals(expectedArea , actualArea);
        }

        @Test
        public void AreaOFSquareOfSideOnePointTwoIsOnePointFourFour(){
            square = new Square(1.2);
            double actualArea = square.area();
            double expectedArea = 1.44;
            assertEquals(expectedArea , actualArea);
        }

        @Test
        public void throwsExceptionWhenSideIsZero(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Square(0));
        }

        @Test
        public void throwsExceptionWhenSideIsMinusSix(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Square(-6));
        }
    }

    @Nested
    public  class PerimeterOfSquare{
        @Test
        public void PerimeterOfSquareOfSideFourIsSixteen(){
            square= new Square(4);
            double actualPerimeter = square.perimeter();
            double expectedPerimeter = 16;
            assertEquals(expectedPerimeter, actualPerimeter);
        }

        @Test
        public void PerimeterOfSquareOfSideOnePointThreeIsOnePointSixNine(){
            square = new Square(1.3);
            double actualPerimeter = square.perimeter();
            double expectedPerimeter = 5.2;
            assertEquals(expectedPerimeter, actualPerimeter);
        }

        @Test
        public void throwsExceptionWhenSideIsZero(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Square(0));
        }

        @Test
        public void throwsExceptionWhenSideIsMinusThree(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Square(-3));
        }
    }
}
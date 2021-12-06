import org.junit.jupiter.api.*;
public class CalculatorTest {
     private Calculator calc;

     @BeforeEach
     public void setup(){
          calc = new Calculator();
     }

     @Nested
     class TestingSubFunction{

          @Test
          public void subtractionOfEightAndTwoGivesSix(){
               double answer = calc.sub(8,2);
               double correctAnswer = 6;
               Assertions.assertEquals(answer,correctAnswer);
          }

          @Test
          public void subtractionOfSixAndTenGivesMinusFour(){
               double answer = calc.sub(6,10);
               double correctAnswer = -4;
               Assertions.assertEquals(answer,correctAnswer);
          }

          @Test
          public void subtractionOfFivePointSixAndTwoGivesThreePointSix(){
               double answer = calc.sub(5.6,2);
               double correctAnswer = 3.5999999999999996;
               Assertions.assertEquals(answer,correctAnswer);
          }

          @Test
          public void subtractionOfSevenAndTwoPointSixGivesFourPointFour(){
               double answer = calc.sub(7,2.6);
               double correctAnswer = 4.4;
               Assertions.assertEquals(answer,correctAnswer);
          }

          @Test
          public void subtractionOfSevenPointEightAndOnePointSixGivesSixPointOneNineNine(){
               double answer = calc.sub(7.8,1.6);
               double correctAnswer = 6.199999999999999;
               Assertions.assertEquals(answer,correctAnswer);
          }

          @Test
          public void subtractionOfTwoPointSixAndSevenGivesMinusFourPointFour(){
               double answer = calc.sub(2.6,7);
               double correctAnswer = -4.4;
               Assertions.assertEquals(answer,correctAnswer);
          }

          @Test
          public void subtractionOfFivePointTwoAndSixPointTwoGivesMinusOne(){
               double answer = calc.sub(5.2,6.2);
               double correctAnswer = -1;
               Assertions.assertEquals(answer,correctAnswer);
          }


     }

     @Nested
     class TestingDivFunction {

          @Test
          public void divisionOfSixAndTwoGivesThree() {
               double answer = calc.div(6, 2);
               double correctAnswer = 3;
               Assertions.assertEquals(answer, correctAnswer);
          }

          @Test
          public void divisionOfOneAndTwoGivesZeroPointFive() {
               double answer = calc.div(1, 2);
               double correctAnswer = 0.5;
               Assertions.assertEquals(answer, correctAnswer);
          }

          @Test
          public void divisionOfSixAndTwoPointFourGivesTwoPointFive() {
               double answer = calc.div(6, 2.4);
               double correctAnswer = 2.5;
               Assertions.assertEquals(answer, correctAnswer);
          }

          @Test
          public void divisionOfTwoPointFourAndSixGivesZeroPointThreeNineNine() {
               double answer = calc.div(2.4, 6);
               double correctAnswer = 0.39999999999999997;
               Assertions.assertEquals(answer, correctAnswer);
          }

          @Test
          public void throwsExceptionWhenDividedByZero() {
                 Assertions.assertThrows(ArithmeticException.class, ()-> calc.div(2,0));
          }


     }

     @Nested
     class TestingAddFunction{

          @Test
          public void additionOfFiveAndThreeGivesEight(){
               double answer = calc.add(5,3);
               double correctAnswer = 8;
               Assertions.assertEquals(answer,correctAnswer);
          }

          @Test
          public void additionOfFiveAndFiveGivesTen(){
               double answer = calc.add(5,5);
               double correctAnswer = 10;
               Assertions.assertEquals(answer,correctAnswer);
          }

          @Test
          public void additionOfFiveAndOnePointFiveGivesSixPointFive(){
               double answer = calc.add(5,1.5);
               double correctAnswer = 6.5;
               Assertions.assertEquals(answer,correctAnswer);
          }

          @Test
          public void additionOfSixPointFourNineAndSevenPointSixSevenGivesFourteenPointOneSix(){
               double answer = calc.add(6.49,7.67);
               double correctAnswer = 14.16;
               Assertions.assertEquals(answer,correctAnswer);
          }

     }

     @Nested
     class TestingMulFunction {

          @Test
          public void multiplicationOfSixAndTwoGivesTwelve() {
               double answer = calc.mul(6, 2);
               double correctAnswer = 12;
               Assertions.assertEquals(answer, correctAnswer);
          }

          @Test
          public void multiplicationOfSixPointOneAndTwoPointFourGivesFourteenPointSixThreeNine() {
               double answer = calc.mul(6.1, 2.4);
               double correctAnswer = 14.639999999999999;
               Assertions.assertEquals(answer, correctAnswer);
          }

          @Test
          public void multiplicationOfTwoPointTwoAndTwoGivesFourPointFour() {
               double answer = calc.mul(2.2, 2);
               double correctAnswer = 4.4;
               Assertions.assertEquals(answer, correctAnswer);
          }


     }

}

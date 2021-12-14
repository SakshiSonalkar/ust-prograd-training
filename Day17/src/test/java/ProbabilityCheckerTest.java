import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityCheckerTest {
 private ProbabilityChecker checker;
 Random random;

 @BeforeEach
    public void setup(){
     random = new Random();
     checker = new ProbabilityChecker();
 }

 @Test
    public void checkIfProbabilityOfGettingHeadAndTailIsEqual(){
     assertEquals(checker.probabilityOfHead(),checker.probabilityOfTail());
 }
 @Nested
 public class EventsOccurringTogether{
     @Test
     public void verifyIfProbabilityOfGettingTwoEventsTogether(){
         assertEquals(0.25,checker.twoEventsOccurringTogether("heads"));
     }

     @Test
     public void verifyIfProbabilityOfOneHeadAndOneTailTogether() {
         assertEquals(0.5, checker.twoEventsOccurringTogether("headAndTail"));
     }
 }


 @Nested
 public class EventNotOccurring{
     @Test
     public void verifyIfProbabilityOfHeadsNotOccurring(){
         assertEquals(0.25,checker.eventNotOccurring("heads"));
     }

     @Test
     public void verifyIfProbabilityOfTailsNotOccurring(){
         assertEquals(0.25,checker.eventNotOccurring("tails"));
     }
     @Test
     public void verifyIfProbabilityOfOneHeadAndOneTailNotOccurring(){
         assertEquals(0.5,checker.eventNotOccurring("headAndTail"));
     }

     @Test
     public void throwsExceptionIfHeadOrTailNotOccurring(){
         assertThrows(IllegalArgumentException.class, () -> {
             checker.eventNotOccurring("headOrTail");
         } );
     }



 }

 @Nested
    public class EitherTwoEventsOccurring{
     @Test
     void probabilityEitherOfTwoEventsOccurring(){

         double eventOneProbability = random.nextDouble(1);
         double eventTwoProbability = random.nextDouble(1);
         double bothOccurringTogether = random.nextDouble(1);

         double expected = eventOneProbability + eventTwoProbability - bothOccurringTogether;
         double actual = checker.eitherOfTwoEventsOccurring(eventOneProbability,eventTwoProbability,bothOccurringTogether);

         assertEquals(expected, actual);

     }


 }

}


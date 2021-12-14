public class ProbabilityChecker {
    private double probability,result;

    public double probabilityCalculator(double possibleEvents, double totalEvents){
        probability=possibleEvents/totalEvents;
        return probability;
    }
    public double probabilityOfHead(){
        return probabilityCalculator(1,2);
    }

    public double probabilityOfTail(){
        return probabilityCalculator(1,2);
    }

    public double atLeastOneHead(){
        return 1 - twoEventsOccurringTogether("tails");
    }

    public double atLeastOneTail(){
        return 1 - twoEventsOccurringTogether("heads");
    }

    public double twoEventsOccurringTogether(String event){
        switch (event){
            case "heads":
               result= probabilityOfHead()*probabilityOfHead();
               break;

            case "tails":
                result= probabilityOfTail()*probabilityOfTail();
                break;

            case "headAndTail":
                result = probabilityOfHead()*probabilityOfTail() + probabilityOfTail()*probabilityOfHead();
                break;

            default:
                System.out.println("No zero occurrence");
                break;
        }
       return result;
    }

    public double eventNotOccurring(String event){
        switch (event){
            case "heads":
                result= 1-atLeastOneHead();
                break;

            case "tails":
                 result= 1- atLeastOneTail();
                break;

            case "headAndTail" :
                result = 1 - twoEventsOccurringTogether("headAndTail");
                 break;

            default:
                if(event=="headOrTail"){
                    throw new IllegalArgumentException("Probability cannot be zero");
                }
               break;
        }
       return result;
    }


    public double eitherOfTwoEventsOccurring(double eventOneProbability, double eventTwoProbability, double bothOccurringTogether){
        return eventOneProbability + eventTwoProbability - bothOccurringTogether;
    }



}

public class WeightConverter extends Converter {
    public static double convertToKiloGram(double value, String fromUnit){
        if(fromUnit=="g"){
            return value /1000;
        }else if(fromUnit=="kg") {
            return value;
        }
        else{
            throw new IllegalArgumentException("Invalid Unit");
        }
    }

    public static double convertToGram(double value, String fromUnit) {
        if (fromUnit == "g") {
            return value;
        } else if (fromUnit == "kg") {
            return value * 1000;
        } else {
            throw new IllegalArgumentException("Invalid Unit");
        }
    }
}

public class Converter {

    public double unitConverter(double value, String fromUnit, String toUnit){
        if(value <=0){
            throw new IllegalArgumentException("Measurement should not be zero or negative");
        }
        else{
            if(toUnit=="cm"){
               return  convertToCentimeter(value,fromUnit);
            }else if(toUnit=="m"){
               return convertToMeter(value,fromUnit);
            }else if(toUnit=="km"){
                return convertToKiloMeter(value,fromUnit);
            }else if(toUnit=="kg"){
                return WeightConverter.convertToKiloGram(value,fromUnit);
            }else if(toUnit=="g"){
                return WeightConverter.convertToGram(value,fromUnit);
            }
            else{
                throw new IllegalArgumentException("Invalid Unit");
            }

        }
    }

    public double addValue(double firstValue, String firstUnit, double secondValue, String secondUnit){
        double result = unitConverter(firstValue,firstUnit,firstUnit) + unitConverter(secondValue, secondUnit,firstUnit);
        return result;
    }

    public double subValue(double firstValue, String firstUnit, double secondValue, String secondUnit ){
        double answer = unitConverter(firstValue,firstUnit,firstUnit) - unitConverter(secondValue,secondUnit,firstUnit);
        return answer;
    }

    public double convertToCentimeter(double value, String fromUnit){
        if(fromUnit=="cm"){
            return value;
        }else if(fromUnit=="m"){
            return value *100;
        }else if(fromUnit=="km"){
            return value *100000;
        }else{
            throw new IllegalArgumentException("Invalid Unit");
        }

    }

    public double convertToMeter(double value, String fromUnit){
        if(fromUnit=="cm"){
            return value /100;
        }else if(fromUnit=="m"){
            return value;
        }else if(fromUnit=="km"){
            return value *1000;
        }else{
            throw new IllegalArgumentException("Invalid Unit");
        }
    }

    public double convertToKiloMeter(double value, String fromUnit){
        if(fromUnit=="cm"){
            return value /100000;
        }else if(fromUnit=="m"){
            return value /1000;
        }else if(fromUnit=="km"){
            return value;
        }else{
            throw new IllegalArgumentException("Invalid Unit");
        }
    }




}

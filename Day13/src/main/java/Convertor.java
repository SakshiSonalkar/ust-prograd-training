public class Convertor {

    public double unitConvertor(double measurement,String fromUnit,String toUnit){
        if(measurement<=0){
            throw new IllegalArgumentException("Measurement should not be zero or negative");
        }
        else{
            if(toUnit=="cm"){
               return  convertToCentimeter(measurement,fromUnit);
            }else if(toUnit=="m"){
               return convertToMeter(measurement,fromUnit);
            }else if(toUnit=="km"){
                return convertToKiloMeter(measurement,fromUnit);
            }
            else{
                throw new IllegalArgumentException("Invalid Unit");
            }

        }
    }

    public double add(double firstValue, String firstUnit, double secondValue,String secondUnit){
        double result = unitConvertor(firstValue,firstUnit,firstUnit) + unitConvertor(secondValue, secondUnit,firstUnit);
        return result;
    }

    public double sub( double firstValue, String firstUnit, double secondValue,String secondUnit ){
        double answer = unitConvertor(firstValue,firstUnit,firstUnit) - unitConvertor(secondValue,secondUnit,firstUnit);
        return answer;
    }

    public double convertToCentimeter(double measurement,String fromUnit){
        if(fromUnit=="cm"){
            return measurement;
        }else if(fromUnit=="m"){
            return measurement*100;
        }else if(fromUnit=="km"){
            return measurement*100000;
        }else{
            throw new IllegalArgumentException("Invalid Unit");
        }

    }

    public double convertToMeter(double measurement,String fromUnit){
        if(fromUnit=="cm"){
            return measurement/100;
        }else if(fromUnit=="m"){
            return measurement;
        }else if(fromUnit=="km"){
            return measurement*1000;
        }else{
            throw new IllegalArgumentException("Invalid Unit");
        }
    }

    public double convertToKiloMeter(double measurement,String fromUnit){
        if(fromUnit=="cm"){
            return measurement/100000;
        }else if(fromUnit=="m"){
            return measurement/1000;
        }else if(fromUnit=="km"){
            return measurement;
        }else{
            throw new IllegalArgumentException("Invalid Unit");
        }
    }


}

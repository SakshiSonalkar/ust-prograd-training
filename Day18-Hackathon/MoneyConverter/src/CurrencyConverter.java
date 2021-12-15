public class CurrencyConverter {


    public double round(double amount){
        return (double) Math.round(amount*100)/100;
    }


    public double toDollars(double amount,String fromCurrency) {
        if(fromCurrency.equals("USD")){
            return amount;
        }else if(fromCurrency.equals("INR")){
            return amount / 76.06;
        }else if(fromCurrency.equals("EUR")){
            return amount*1.13;
        }else if(fromCurrency.equals("GBP")){
            return amount*1.32;
        }else if(fromCurrency.equals("CAD")){
            return amount/1.29;
        }else{
            throw new IllegalArgumentException("Currency is not valid");
        }

    }

    public double toRupees(double amount,String fromCurrency) {
        if(fromCurrency.equals("USD")){
            return amount*76.06;
        }else if(fromCurrency.equals("INR")){
            return amount;
        }else if(fromCurrency.equals("EUR")){
            return amount*85.63;
        }else if(fromCurrency.equals("GBP")){
            return amount*100.66;
        }else if(fromCurrency.equals("CAD")){
            return amount*59.2;
        }
        else {
            throw new IllegalArgumentException("Currency is not valid");
        }
    }

    public double toEuros(double amount,String fromCurrency){
        if(fromCurrency.equals("USD")){
            return amount/1.13;
        }else if(fromCurrency.equals("INR")){
            return amount/85.63;
        }else if(fromCurrency.equals("EUR")){
            return amount;
        }else if(fromCurrency.equals("GBP")){
            return amount*1.18;
        }else if(fromCurrency.equals("CAD")){
            return amount/1.45;
        }else{
            throw new IllegalArgumentException("Currency is not valid");
        }
    }

    public double toPounds(double amount, String fromCurrency){
        if(fromCurrency.equals("USD")){
            return amount/1.32;
        }else if(fromCurrency.equals("INR")){
            return amount/100.66;
        }else if(fromCurrency.equals("EUR")){
            return amount/1.18;
        }else if(fromCurrency.equals("GBP")){
            return amount;
        }else if(fromCurrency.equals("CAD")){
            return amount/1.7;
        }else{
            throw new IllegalArgumentException("Currency is not valid");
        }
    }

    public double toCanadianDollars(double amount,String fromCurrency){
        if(fromCurrency.equals("USD")){
            return amount*1.29;
        }else if(fromCurrency.equals("INR")){
            return amount/59.2;
        }else if(fromCurrency.equals("EUR")){
            return amount*1.45;
        }else if(fromCurrency.equals("GBP")){
            return amount/1.7;
        }else if(fromCurrency.equals("CAD")){
            return amount;
        }else{
            throw new IllegalArgumentException("Currency is not valid");
        }
    }

    public double currencyConversion(double amount,String fromCurrency,String toCurrency) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be less than or equal to zero");
        }

        switch (toCurrency) {
            case "INR":
                return round(toRupees(amount, fromCurrency));

            case "USD":
                return round(toDollars(amount, fromCurrency));

            case "EUR":
                return round(toEuros(amount, fromCurrency));

            case "CAD":
                return round(toCanadianDollars(amount, fromCurrency));

            case "GBP":
                return round(toPounds(amount, fromCurrency));

            default:
                throw new IllegalArgumentException("toCurrency is invalid");
        }
    }

}

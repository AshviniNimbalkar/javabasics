package com.in28minutes.oops.level2.exceptionHandling;

public class ThrowingExceptionRunner {


    public static void main(String[]args) throws Exception {
        Amount amount1 = new Amount("USD",10);
        Amount amount2 = new Amount("USD",20);
        amount1.addAmount(20,"USD");
        amount2.addAmount(50,"EUR");

    }
}

class Amount{
    private String currency;
    private int amount;


    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void addAmount(int amount,String currency) throws CurrenciesDonotmatchException {
        if(!this.currency.equals(currency)) {
            //throw new RuntimeException("Currencies are not matching!");
           // throw new Exception("Currencies are not matching!");
            throw new CurrenciesDonotmatchException("throw new CurrenciesDonotmatchException");
        }
        this.amount = this.amount + amount;
        System.out.println("New amount is: "+this.amount);
    }
}
class CurrenciesDonotmatchException extends Exception{
    public CurrenciesDonotmatchException(String msg){
        super(msg);
    }

}

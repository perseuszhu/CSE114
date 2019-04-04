package Lab15_1;

import java.util.Scanner;

public class Stock {
    String  symbol;
    String name;
    public Stock(String symbol, String name){
        this.name = name;
        this.symbol = symbol;
    }
    public double getChangePercent (double previousClosingPrice, double currentPrice){
        double percentage;
        percentage=((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
        return percentage;
    }

    }


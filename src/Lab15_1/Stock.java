package Lab15_1;

import java.util.Scanner;

public class Stock {
    String  symbol;
    String name;
    private Stock(String symbol, String name){
        this.name = name;
        this.symbol = symbol;
    }
    public double getChangePercent (double previousClosingPrice, double currentPrice){
        double percentage;
        percentage=((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
        return percentage;
    }
    public static void main(String[] args){
        String symbol="ORCL";
        String name="Oracle Coporation";
        double previousClosingPrice=34.5;
        double currentPrice=34.35;
        Stock Orc = new Stock(symbol,name);
        double perc = Orc.getChangePercent(previousClosingPrice,currentPrice);
        System.out.println("The price changing percentage is: "+perc+"%");
        }
    }


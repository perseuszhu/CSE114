package Lab15_1;

public class Run {
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

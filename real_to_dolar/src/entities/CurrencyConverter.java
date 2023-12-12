package entities;
public class CurrencyConverter {
    public static double dolarCotacao;

    public static double converter(double value){
        return value * dolarCotacao;
    }
}

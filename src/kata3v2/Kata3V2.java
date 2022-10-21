package kata3v2;

public class Kata3V2 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();

        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("hotmail.es");
        

        new HistogramDisplay(histogram).execute();
    }
    
    
}

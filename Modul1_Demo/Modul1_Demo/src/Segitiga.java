public class Segitiga <T extends Number>{
    private T tinggi, alas;

    public Segitiga(T tinggi, T alas) {
        this.tinggi = tinggi;
        this.alas = alas;
    }

    public T getTinggi() {
        return tinggi;
    }

    public T getAlas() {
        return alas;
    }

    public double luasNumerik(){
        return getAlas().doubleValue() * getTinggi().doubleValue() / 2.0;
    }

    public int getResultAsInt(){
        return (int) luasNumerik();
    }

    public double getResultAsDouble(){
        return luasNumerik();
    }
}

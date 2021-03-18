public class Masina {

    public String marca;
    public String culoare;
    public int kilometraj;
    public String combustibil;


    public Masina(String marca, String culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    public Masina(int kilometraj, String combustibil) {
        this.kilometraj = kilometraj;
        this.combustibil = combustibil;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", culoare='" + culoare + '\'' +
                ", kilometraj=" + kilometraj +
                ", combustibil='" + combustibil + '\'' +
                '}';
    }
}

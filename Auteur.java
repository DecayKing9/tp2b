public class Auteur{

    private String nom;
    private int perfTrage;
    private String citTrage;
    private int perfCome;
    private String citCome;
    private int perfDrame;
    private String citDrame;

    public Auteur (nom, perfTrage, citTrage, perfCome, citCome, perfDrame, citDrame){
        this.nom = nom;
        this.perfTrage = perfTrage;
        this.citTrage = citTrage;
        this.perfCome = perfCome;
        this.citCome = citCome;
        this.perfDrame = perfDrame;
        this.citDrame = citDrame;
    }

    public void getQualitéTragédie(){
        return this.perfTrage;
    }

    @Override
    public String toString(){
        return "L'honnorable" + nom;
    }
}
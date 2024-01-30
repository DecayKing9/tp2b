public class Auteur{

    private String nom;
    private int perfTrage;
    private String citTrage;
    private int perfCome;
    private String citCome;
    private int perfDrame;
    private String citDrame;

    public Auteur (String nom, int perfTrage, String citTrage, int perfCome, String citCome, int perfDrame, String citDrame){
        this.nom = nom;
        this.perfTrage = perfTrage;
        this.citTrage = citTrage;
        this.perfCome = perfCome;
        this.citCome = citCome;
        this.perfDrame = perfDrame;
        this.citDrame = citDrame;
    }

    public int getQualitéTragédie(){
        return this.perfTrage;
    }

    public String getCitationTragédie(){
        return this.citTrage;
    }

    @Override
    public String toString(){
        return "L'honnorable" + nom;
    }
}
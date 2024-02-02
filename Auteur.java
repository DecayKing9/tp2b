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

    public int getQualitéComédie(){
        return this.perfCome;
    }

    public String getCitationComédie(){
        return this.citCome;
    }

    public int getQualitéDrame(){
        return this.perfDrame;
    }

    public String getCitationDrame(){
        return this.citDrame;
    }

    public String pointfort(){
         if (perfTrage >= perfCome && perfTrage >= perfDrame) {
        return "Tragedy";
    } else if (perfCome >= perfTrage && perfCome >= perfDrame) {
        return "Comedy";
    } else {
        return "Drama";
    }
    }

    public int qualitéStyle(Style s){
          switch (s) {
        case TRAGEDIE:
            return perfTrage;
        case COMEDIE:
            return perfCome;
        case DRAMA:
            return perfDrame;
        default:
            return 0
        }
    }

     public int citationStyle(Style s){
        switch (s) {
        case TRAGEDIE:
            return "citation Tragedie: " + citTrage;
        case COMEDIE:
            return "citation Comédie: " + citCome;
        case DRAMA:
            return "citation Drama: " + citDrame;
        default:
            return "";
    }

    @Override
    public String toString(){
        return "L'honnorable" + nom;
    }
}
}
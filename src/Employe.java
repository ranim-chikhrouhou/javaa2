public class Employe {
    private int id;
    private String nom;
    private String prenom;
    private  String NomDepartement;
    private int grade;

    public Employe(){}
    public Employe(int id, String nom, String prenom, String NomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.NomDepartement = NomDepartement;
        this.grade = grade;
        }
    public int getId() {
        return id;}
    public void setId(int id) {
        this.id = id;}

    public String getNom() {
        return nom;}

    public void setNom(String nom) {
        this.nom = nom;}

    public String getPrenom() {
        return prenom;}

    public void setPrenom(String prenom) {
        this.prenom = prenom;}

    public String getNomDepartement() {
        return NomDepartement;}

    public void setNomDepartement(String nomDepartement) {
        this.NomDepartement = nomDepartement;}

    public int getGrade() {
        return grade;}

    public void setGrade(int grade) {
        this.grade = grade;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employe employe = (Employe) obj;
        return this.id == employe.id && this.nom.equals(employe.nom);
    }
    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + NomDepartement + '\'' +
                ", grade=" + grade +
                '}';
    }
}

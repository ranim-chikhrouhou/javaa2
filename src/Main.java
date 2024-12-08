public class Main {
    public static void main(String[] args) {
        AffectationHashMap gestion = new AffectationHashMap();
        Employe e1 = new Employe(1, "Dupont", "Jean", "IT", 5);
        Employe e2 = new Employe(2, "Martin", "Sophie", "RH", 4);

        Departement d1 = new Departement(1, "IT", 10);
        Departement d2 = new Departement(2, "RH", 5);

        gestion.ajouterEmployeDepartement(e1, d1);
        gestion.ajouterEmployeDepartement(e2, d2);

        System.out.println("Employés et départements :");
        gestion.afficherEmployesEtDepartements();

        System.out.println("\nRecherche Employé e1 : " + gestion.rechercherEmploye(e1));
        System.out.println("Recherche Département RH : " + gestion.rechercherDepartement(d2));
    }
}

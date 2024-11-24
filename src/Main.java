
    public class Main {
        public static void main(String[] args) {
            SocieteArrayList societe = new SocieteArrayList();

            Employe e1 = new Employe(1, "Ben Ali", "Ahmed", "Informatique", 3);
            Employe e2 = new Employe(2, "Mejri", "Sana", "Marketing", 2);
            Employe e3 = new Employe(3, "Trabelsi", "Mohamed", "RH", 4);

            societe.ajouterEmploye(e1);
            societe.ajouterEmploye(e2);
            societe.ajouterEmploye(e3);

            System.out.println("Liste des employés:");
            societe.displayEmploye();

            System.out.println("\nRecherche par nom 'Mejri': " + societe.rechercherEmploye("Mejri"));

            System.out.println("\nTri par ID:");
            societe.trierEmployeParId();
            societe.displayEmploye();

            System.out.println("\nTri par Nom, Département et Grade:");
            societe.trierEmployeParNomDépartementEtGrade();
            societe.displayEmploye();

            DepartementHashSet gestionDepartement = new DepartementHashSet();

            Departement d1 = new Departement(1, "Informatique", 10);
            Departement d2 = new Departement(2, "Marketing", 8);
            Departement d3 = new Departement(3, "RH", 5);

            gestionDepartement.ajouterDepartement(d1);
            gestionDepartement.ajouterDepartement(d2);
            gestionDepartement.ajouterDepartement(d3);

            System.out.println("Liste des départements:");
            gestionDepartement.displayDepartement();

            System.out.println("\nRecherche par nom 'Marketing': " + gestionDepartement.rechercherDepartement("Marketing"));

            System.out.println("\nTri par ID:");
            gestionDepartement.trierDepartementById().forEach(System.out::println);
        }
    }



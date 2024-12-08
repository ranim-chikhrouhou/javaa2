import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations = new HashMap<>();
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d);
    }
    public void afficherEmployesEtDepartements() {
        affectations.forEach((employe, departement) ->
                System.out.println("Employe: " + employe + " | Département: " + departement));
    }
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }
    public void afficherEmployes() {
        affectations.keySet().forEach(System.out::println);
    }
    public void afficherDepartements() {
        affectations.values().stream().distinct().forEach(System.out::println);
    }
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
        sortedMap.putAll(affectations);
        return sortedMap;
    }}

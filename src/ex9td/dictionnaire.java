package ex9td;

public class dictionnaire {
	 private int nbMots;
	    private int taille;
	    private MotDict[] dict;
	    private String nom;
	public dictionnaire(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
        this.dict = new MotDict[taille];
        this.nbMots = 0;
    }

    public int getNbMots() {
        return nbMots;
    }

    public String getNom() {
        return nom;
    }
    public void ajouterMot(MotDict motDict) {
        if (nbMots < taille) {
            dict[nbMots] = motDict;
            nbMots++;
            trier();
        }
        }
    private void trier() {
        boolean echange;
        do {
            echange = false;
            for (int i = 0; i < nbMots - 1; i++) {
                if (dict[i].getMot().compareTo(dict[i + 1].getMot()) > 0) {
                    MotDict temp = dict[i];
                    dict[i] = dict[i + 1];
                    dict[i + 1] = temp;
                    echange = true;
                }
            }
        } while (echange);
    }
    public void supprimerMot(MotDict motDict) {
    	 for (int i = 0; i < nbMots; i++) {
             if (dict[i].getMot().equals(motDict.getMot())) {
                 for (int j = i; j < nbMots - 1; j++) {
                     dict[j] = dict[j + 1];
                 }
                 dict[nbMots - 1] = null;
                 nbMots--;
                 return;
             }}
        System.out.println("mot pas trouvee.");
    }

    public String recherche(String mot) {
        for (int i = 0; i < nbMots; i++) {
            if (dict[i].getMot().equals(mot)) {
                return dict[i].getDefini();
            }
        }
        return "Mot non trouvé.";
    }
    
    
    public void listerDictionnaire() {
        for (int i = 0; i < nbMots; i++) {
            System.out.println(dict[i].getMot() + ": " + dict[i].getDefini());
        }
    }
    public int nombreSynonyme(MotDict motDict) {
        int count = 0;
        for (int i = 0; i < nbMots; i++) {
            if (dict[i].synonyme(motDict)) {
                count++;
            }
        }
        return count;
    }
}

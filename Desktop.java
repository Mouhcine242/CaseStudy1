package Classe;

import java.util.*;
public class Desktop {
	
	static TreeSet<Raccourcis> ensR = new TreeSet<>();
	
    public void creer_raccourcif(Fichier f) {
		
		Raccourcis R=new Raccourcis(f.nom,f.taille,f.path);
		Desktop.ensR.add(R);
		
	}
    public void creer_raccourciD(Dossier d) {
		
		Raccourcis R=new Raccourcis(d.nom,d.taill,d.path);
		Desktop.ensR.add(R);
		
	}
    public void creer_raccourciR(Repertoire r) {
		
		Raccourcis R=new Raccourcis(r.nom,r.taill,r.path);
		Desktop.ensR.add(R);
		
	}

	
}

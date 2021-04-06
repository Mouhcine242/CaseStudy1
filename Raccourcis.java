package Classe;

import java.util.*;
public class Raccourcis implements Element {
	String nom ;
	double taille ;
	String path ;
	Scanner cl = new Scanner(System.in);
	Raccourcis(String nom , double taille, String path){
		this.nom=nom;
		this.path=path;
		this.taille=taille ;
	}
	public void Supp(Raccourcis r) {
		System.out.println("Enter your UserName");
		String s1 = cl.next();
		System.out.println("Enter your Password");
		String s2 = cl.next();
		if(s1.equals(User.auth1())&& s2.equals(User.auth2()) && Desktop.ensR.contains(r)) {
			Dossier.ensF.remove(r);
		}
		else {
			System.out.println("Error");
		}
		
	}
	@Override
	public String getName() {
		return this.nom;
	}
	@Override
	public double getLenght() {
		return this.taille;
	}
	@Override
	public void New(String nom, double taill) {

		
	}

	

}

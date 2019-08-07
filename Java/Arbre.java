package IA.com;

import java.util.ArrayList;
import java.util.Collections;

public class Arbre {
	
	public Sommet racine;
	
	public Arbre(Sommet s) {
		this.racine = s;
	}
	
	public void afficher() {
		
		if(racine.successeurs==null) 
			System.out.println(" ---- ");
		System.out.println("La racine : "+racine.nom+ " Score : "+racine.score);
		for(int i=0; i<racine.successeurs.size(); i++) {
			System.out.println("Successeur : " + racine.successeurs.get(i).nom + "   Score  : " +racine.successeurs.get(i).score);
			}
		for(int i=0; i<racine.successeurs.size(); i++) 
			racine.successeurs.get(i).afficher();
	}
		
	
	
	
	public static int minimax(Sommet s,int niveau) {
		if(s.successeurs.size() == 0 ) {
				return s.score;
		}
		else {
		niveau++;
		int val=s.successeurs.get(0).score = minimax(s.successeurs.get(0), niveau);
		for(int i=1; i<s.successeurs.size(); i++) {
			if(niveau%2 == 0) {
				if(val>=minimax(s.successeurs.get(i), niveau)) 
					val=minimax(s.successeurs.get(i),niveau);
							}
			else {
				if(val<minimax(s.successeurs.get(i), niveau)) 
					val=minimax(s.successeurs.get(i),niveau);
			}
			}
		s.score=val;
		return s.score;
		}



	/*	public static int minimax(Sommet s, ArrayList <Sommet> success,int niveau) {
	if(s.successeurs.size() == 0) {
		if( niveau%2 == 0 ) {
			return Collections.max(success);
		}
	}
	
	return 0;
}*/




}
}



	
	
	
	
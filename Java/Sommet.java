package IA.com;
import java.lang.reflect.Array;
import java.util.*;

public class Sommet {

	public String nom;
	public ArrayList <Sommet> successeurs;

	public int score;
	
	
	public Sommet(String s) {
		Random r = new Random();
		nom = s;
		successeurs = new ArrayList<Sommet>();
		
		score = r.nextInt(25);
		
		
		
	}
	
	public void ajoutSuccesseur(Sommet s) {
		successeurs.add(s);
	}
	
	/* public int getScore(Sommet s) {
		
		for(int i=0; i<successeurs.size(); i++) {
			if(successeurs.get(i).nom.equals(s.nom))
				return (this.score.get(i));
		}
		return -1;
	}   */
	
	
	
	public void afficher() {
		System.out.println("Le sommet : "+nom);
		for(int i=0; i<successeurs.size(); i++)
			System.out.println("Successeur : " + this.successeurs.get(i).nom + "   Score  : " +successeurs.get(i).score);
	}
	
	
	
	
	
	
}

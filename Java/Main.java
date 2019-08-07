package IA.com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Sommet a = new Sommet("A");
		Arbre arb = new Arbre(a);
		
		Sommet b = new Sommet("B");
		Sommet c = new Sommet("C");
		Sommet d = new Sommet("D");

		Sommet e = new Sommet("E");
		Sommet f = new Sommet("F");
		Sommet g = new Sommet("G");
		//System.out.println(e.nom);
		Sommet h = new Sommet("H");
		
		Sommet k = new Sommet("K");
		Sommet l = new Sommet("L");
		
		a.ajoutSuccesseur(b);
		a.ajoutSuccesseur(c);
		a.ajoutSuccesseur(d);
		
		b.ajoutSuccesseur(e);
		b.ajoutSuccesseur(f);
		b.ajoutSuccesseur(g);
		
		c.ajoutSuccesseur(h);
		
		d.ajoutSuccesseur(k);
		d.ajoutSuccesseur(l);
		
		arb.afficher();
		Arbre.minimax(a,0);
		arb.afficher();
		
		
		/*
		System.out.println("-- "+a.nom+"   " +a.score);
		System.out.println("-- "+b.nom+"   " +b.score);
		System.out.println("-- "+c.nom+"   " +c.score);
		System.out.println("-- "+d.nom+"   " +d.score);
		System.out.println("-- "+e.nom+"   " +e.score);
		System.out.println("-- "+f.nom+"   " +f.score);
		System.out.println("-- "+g.nom+"   " +g.score);
		System.out.println("-- "+h.nom+"   " +h.score);
		System.out.println("-- "+k.nom+"   " +k.score);
		System.out.println("-- "+l.nom+"   " +l.score);*/
		
		/*
		for(int i=0;i<a.successeurs.size(); i++) {
			System.out.println(a.successeurs.get(i).nom);
		}
		*/
		
	}

}

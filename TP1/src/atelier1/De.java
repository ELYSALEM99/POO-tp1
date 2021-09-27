package atelier1;
import java.util.*;

public class De {
	private String nom;
	private int nbFaces;
	private static int i=0;
	private static Random r = new Random();
	private  int testLan=0;
	public De() {
		nom="De";
		nbFaces=6;
		i++;
	}
	public De(String nom,int nbFaces) {
		this.nbFaces=nbFaces;
		this.nom=nom;
		i++;
	}
	public De(int nbFaces) {
		this.nbFaces=nbFaces;
		this.setNbFaces(nbFaces);
		i++;
		nom="De << n°"+i+">>";
	}
	public De(String nom) {
		this.nom=nom;
		nbFaces=6;
		i++;
	}
	public int getNbFaces() {
		return nbFaces;
	}
	public int gettestlan() {
		return testLan;
	}
	public void settestLan(int testLan) {
		this.testLan=testLan;
	}
	public void setNbFaces(int nbFaces) {
		if(nbFaces<3 || nbFaces>120)
			this.nbFaces=6;
	}
	public String toString() {
		return nom +" "+ nbFaces+"Faces";
	}
	public int lancer() {
		int nbAleatoire;
		if(this.gettestlan()==0)
			nbAleatoire= r.nextInt(this.getNbFaces())+1;
		else
			nbAleatoire= r.nextInt(this.getNbFaces()*2)+1;
		
		return nbAleatoire;
	}
	public int lancer(int nb) {
		int j;
		int meiValLan=0;
		int test;
		for(j=0;j<nb;j++)
		{
			test=this.lancer();
			if(meiValLan<test)
				meiValLan=test;
		}
		return meiValLan;
	}
	public boolean equals(Object obj) {
		if (this == obj)/*l'egalite de l'instance(d1) avec celle fournie en parametre de la methode(d1)*/
			return true;
		if(obj == null)/* l'instance passer en parametre est null */
			return false;
		if(getClass() != obj.getClass())/*si le deux objets(this(d1)) et (obj)  ont la meme classe*/
			return false;
		De test=(De) obj/* caster le parametre dans le type de la classe courante pour permettre des tests*/; 
		return ((this.nbFaces==test.nbFaces) && (this.nom.equals(test.nom)));
	}
}

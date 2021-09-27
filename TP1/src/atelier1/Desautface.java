package atelier1;

public class Desautface extends De {

	public Desautface() {
		super("nom",6);
	}
	public int lancer_aut_face() {
		this.settestLan(1);
		int result=this.lancer();
		while (result%2!=0)
			result=this.lancer();	
		return result;
	}
}

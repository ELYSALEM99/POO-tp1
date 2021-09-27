package atelier1;

public class Testtp1 {

	public static void main(String[] args) {
		De d1=new De();
		De d4=new De();
		De d2=new De("des");
		De d3=new De(130);
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		System.out.println(d4.toString());
		System.out.println("Lancé d'un dé :"+d3.lancer());
		System.out.println("meilleur lancer :"+d3.lancer(10));
		System.out.println(d1.equals(d4));
		Despipes dp1=new Despipes(4);
		System.out.println("valeur de dés pipés "+dp1.lancerpipes());
		/*Desmem dm1=new Desmem();
		for(int j=0;j<10;j++)
		{
			System.out.println(dm1.desmemoi());
		}*/
		Desautface df1=new Desautface();
		System.out.println(df1.toString());
		System.out.println(df1.lancer_aut_face());
		
	}

}

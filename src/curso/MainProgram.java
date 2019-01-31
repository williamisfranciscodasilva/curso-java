package curso;

public class MainProgram {

	public static void main(String[] args) {
		 Video v[] = new Video[3];
		 
		 v[0] = new Video("Aula 1 de POO");
		 v[1] = new Video("Aula 12 de PHP");
		 v[2] = new Video("Aula 10 de HTML5");
		 
		 Garfanhoto g[] = new Garfanhoto[2];
		 g[0] = new Garfanhoto("Jose", 25, "M", "JS");
		 g[1] = new Garfanhoto("Maria", 20, "F", "MR");
		 
		 Vizualizacao vis[] = new Vizualizacao[5];
		 vis[0] = new Vizualizacao(g[0], v[2]);
		 vis[1] = new Vizualizacao(g[0], v[1]);
		 vis[0].avaliar();
		 vis[0].avaliar(87.0f);
		 
		 
		 
		 System.out.println(v[0].toString());
		 System.out.println(v[1].toString());
		 System.out.println(v[2].toString());
		 
		 System.out.println(g[0].toString());
		 System.out.println(g[1].toString());
		 
		 System.out.println(vis[0].toString());
		 System.out.println(vis[1].toString());
	}

}

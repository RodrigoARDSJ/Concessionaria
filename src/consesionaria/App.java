package consesionaria;

//import java.util.Arrays;
//import java.util.List;

public class App {
	public static void main(String[] args) {
		Concessionaria c = new Concessionaria();

		Automovel a = new Automovel("Ferrari", "F480", 150000.0);
		Automovel b = new Automovel("Opala", "Chevrolet", 5000.00);

		c.adicionaVeivulo(a);
		c.adicionaVeivulo(b);

		System.out.println(c.consulta());

		c.venda(a);
		System.out.println("");
		System.out.println(c.consulta());
		System.out.println(c.somaEstoque());
		System.out.println(c.consultaVeiculo(new Automovel("Opala", "Chevrolet", 5000.00)));

	}
}

package consesionaria;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

	private List<Automovel> automoveis;

	public Concessionaria() {
		this.automoveis = new ArrayList<>();
	}

	public void adicionaVeivulo(Automovel automovel) {
		this.automoveis.add(automovel);
	}

	public void venda(Automovel automovel) {
		this.automoveis.remove(automovel);
	}

	public List<Automovel> consulta() {
		return this.automoveis;
	}

	public double somaEstoque() {
		return automoveis.stream().mapToDouble(Automovel::getPreco).sum();

	}

	public boolean consultaVeiculo(Automovel automovel) {
		return automoveis.stream().filter(automovel::equals).count() == 1;

	}

}

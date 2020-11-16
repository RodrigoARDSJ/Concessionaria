package consesionaria;

import java.util.Objects;

public class Automovel {
	private String modelo;
	private String marca;
	private Double preco;

	public Automovel(String modelo, String marca, Double preco) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return String.format("Automovel{modelo='%s', Marca='%s', preço=%.2f}", modelo, marca, preco);
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Automovel) {
			Automovel auto = (Automovel) o;
			return this.marca.equals(auto.getMarca()) && this.modelo.equals(auto.getModelo())
					&& this.preco.equals(auto.getPreco());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo, preco);
	}

}

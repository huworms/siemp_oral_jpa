package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_titulo database table.
 * 
 */
@Entity
@Table(name="c_titulo")
@NamedQuery(name="CTitulo.findAll", query="SELECT c FROM CTitulo c")
public class CTitulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_titulo")
	private String idTitulo;

	@Lob
	private String descripcion;

	@Column(name="id_fuero")
	private int idFuero;

	//bi-directional many-to-one association to CCapitulo
	@OneToMany(mappedBy="CTitulo")
	private List<CCapitulo> CCapitulos;

	public CTitulo() {
	}

	public String getIdTitulo() {
		return this.idTitulo;
	}

	public void setIdTitulo(String idTitulo) {
		this.idTitulo = idTitulo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdFuero() {
		return this.idFuero;
	}

	public void setIdFuero(int idFuero) {
		this.idFuero = idFuero;
	}

	public List<CCapitulo> getCCapitulos() {
		return this.CCapitulos;
	}

	public void setCCapitulos(List<CCapitulo> CCapitulos) {
		this.CCapitulos = CCapitulos;
	}

	public CCapitulo addCCapitulo(CCapitulo CCapitulo) {
		getCCapitulos().add(CCapitulo);
		CCapitulo.setCTitulo(this);

		return CCapitulo;
	}

	public CCapitulo removeCCapitulo(CCapitulo CCapitulo) {
		getCCapitulos().remove(CCapitulo);
		CCapitulo.setCTitulo(null);

		return CCapitulo;
	}

}
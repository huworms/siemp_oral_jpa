package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_capitulo database table.
 * 
 */
@Entity
@Table(name="c_capitulo")
@NamedQuery(name="CCapitulo.findAll", query="SELECT c FROM CCapitulo c")
public class CCapitulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CCapituloPK id;

	@Lob
	private String descripcion;

	//bi-directional many-to-one association to CTitulo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_titulo", insertable=false, updatable=false)
	private CTitulo CTitulo;

	//bi-directional many-to-one association to CTipoDel
	@OneToMany(mappedBy="CCapitulo")
	private List<CTipoDel> CTipoDels;

	public CCapitulo() {
	}

	public CCapituloPK getId() {
		return this.id;
	}

	public void setId(CCapituloPK id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public CTitulo getCTitulo() {
		return this.CTitulo;
	}

	public void setCTitulo(CTitulo CTitulo) {
		this.CTitulo = CTitulo;
	}

	public List<CTipoDel> getCTipoDels() {
		return this.CTipoDels;
	}

	public void setCTipoDels(List<CTipoDel> CTipoDels) {
		this.CTipoDels = CTipoDels;
	}

	public CTipoDel addCTipoDel(CTipoDel CTipoDel) {
		getCTipoDels().add(CTipoDel);
		CTipoDel.setCCapitulo(this);

		return CTipoDel;
	}

	public CTipoDel removeCTipoDel(CTipoDel CTipoDel) {
		getCTipoDels().remove(CTipoDel);
		CTipoDel.setCCapitulo(null);

		return CTipoDel;
	}

}
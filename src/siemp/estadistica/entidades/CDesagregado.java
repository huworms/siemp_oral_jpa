package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_desagregado database table.
 * 
 */
@Entity
@Table(name="c_desagregado")
@NamedQuery(name="CDesagregado.findAll", query="SELECT c FROM CDesagregado c")
public class CDesagregado implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CDesagregadoPK id;

	private String alcance;

	private String descripcion;

	private String modal;

	private String siglas;

	//bi-directional many-to-one association to CTipoDel
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_del", insertable=false, updatable=false)
	private CTipoDel CTipoDel;

	//bi-directional many-to-one association to TDelito
	@OneToMany(mappedBy="CDesagregado")
	private List<TDelito> TDelitos;

	public CDesagregado() {
	}

	public CDesagregadoPK getId() {
		return this.id;
	}

	public void setId(CDesagregadoPK id) {
		this.id = id;
	}

	public String getAlcance() {
		return this.alcance;
	}

	public void setAlcance(String alcance) {
		this.alcance = alcance;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getModal() {
		return this.modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public String getSiglas() {
		return this.siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}

	public CTipoDel getCTipoDel() {
		return this.CTipoDel;
	}

	public void setCTipoDel(CTipoDel CTipoDel) {
		this.CTipoDel = CTipoDel;
	}

	public List<TDelito> getTDelitos() {
		return this.TDelitos;
	}

	public void setTDelitos(List<TDelito> TDelitos) {
		this.TDelitos = TDelitos;
	}

	public TDelito addTDelito(TDelito TDelito) {
		getTDelitos().add(TDelito);
		TDelito.setCDesagregado(this);

		return TDelito;
	}

	public TDelito removeTDelito(TDelito TDelito) {
		getTDelitos().remove(TDelito);
		TDelito.setCDesagregado(null);

		return TDelito;
	}

}
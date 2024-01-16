package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_medida database table.
 * 
 */
@Entity
@Table(name="c_tipo_medida")
@NamedQuery(name="CTipoMedida.findAll", query="SELECT c FROM CTipoMedida c")
public class CTipoMedida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo_medida")
	private int idTipoMedida;

	private String descripcion;

	private String fraccion;

	@Column(name="id_ley")
	private String idLey;

	@Column(name="orden_numerico")
	private int ordenNumerico;

	private String tipo;

	//bi-directional many-to-one association to TMedida
	@OneToMany(mappedBy="CTipoMedida")
	private List<TMedida> TMedidas;

	public CTipoMedida() {
	}

	public int getIdTipoMedida() {
		return this.idTipoMedida;
	}

	public void setIdTipoMedida(int idTipoMedida) {
		this.idTipoMedida = idTipoMedida;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFraccion() {
		return this.fraccion;
	}

	public void setFraccion(String fraccion) {
		this.fraccion = fraccion;
	}

	public String getIdLey() {
		return this.idLey;
	}

	public void setIdLey(String idLey) {
		this.idLey = idLey;
	}

	public int getOrdenNumerico() {
		return this.ordenNumerico;
	}

	public void setOrdenNumerico(int ordenNumerico) {
		this.ordenNumerico = ordenNumerico;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<TMedida> getTMedidas() {
		return this.TMedidas;
	}

	public void setTMedidas(List<TMedida> TMedidas) {
		this.TMedidas = TMedidas;
	}

	public TMedida addTMedida(TMedida TMedida) {
		getTMedidas().add(TMedida);
		TMedida.setCTipoMedida(this);

		return TMedida;
	}

	public TMedida removeTMedida(TMedida TMedida) {
		getTMedidas().remove(TMedida);
		TMedida.setCTipoMedida(null);

		return TMedida;
	}

}
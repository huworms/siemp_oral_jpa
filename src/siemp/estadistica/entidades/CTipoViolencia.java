package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_violencia database table.
 * 
 */
@Entity
@Table(name="c_tipo_violencia")
@NamedQuery(name="CTipoViolencia.findAll", query="SELECT c FROM CTipoViolencia c")
public class CTipoViolencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_tipo_violencia")
	private String cnTipoViolencia;

	@Column(name="cs_tipo_violencia")
	private String csTipoViolencia;

	//bi-directional many-to-one association to TListadoTipoViolencia
	@OneToMany(mappedBy="CTipoViolencia")
	private List<TListadoTipoViolencia> TListadoTipoViolencias;

	public CTipoViolencia() {
	}

	public String getCnTipoViolencia() {
		return this.cnTipoViolencia;
	}

	public void setCnTipoViolencia(String cnTipoViolencia) {
		this.cnTipoViolencia = cnTipoViolencia;
	}

	public String getCsTipoViolencia() {
		return this.csTipoViolencia;
	}

	public void setCsTipoViolencia(String csTipoViolencia) {
		this.csTipoViolencia = csTipoViolencia;
	}

	public List<TListadoTipoViolencia> getTListadoTipoViolencias() {
		return this.TListadoTipoViolencias;
	}

	public void setTListadoTipoViolencias(List<TListadoTipoViolencia> TListadoTipoViolencias) {
		this.TListadoTipoViolencias = TListadoTipoViolencias;
	}

	public TListadoTipoViolencia addTListadoTipoViolencia(TListadoTipoViolencia TListadoTipoViolencia) {
		getTListadoTipoViolencias().add(TListadoTipoViolencia);
		TListadoTipoViolencia.setCTipoViolencia(this);

		return TListadoTipoViolencia;
	}

	public TListadoTipoViolencia removeTListadoTipoViolencia(TListadoTipoViolencia TListadoTipoViolencia) {
		getTListadoTipoViolencias().remove(TListadoTipoViolencia);
		TListadoTipoViolencia.setCTipoViolencia(null);

		return TListadoTipoViolencia;
	}

}
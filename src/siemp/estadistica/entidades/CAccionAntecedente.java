package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_accion_antecedente database table.
 * 
 */
@Entity
@Table(name="c_accion_antecedente")
@NamedQuery(name="CAccionAntecedente.findAll", query="SELECT c FROM CAccionAntecedente c")
public class CAccionAntecedente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_accion_antecedente_id")
	private String cnAccionAntecedenteId;

	@Column(name="cs_accion_antecedente")
	private String csAccionAntecedente;

	//bi-directional many-to-one association to TListadoAccione
	@OneToMany(mappedBy="CAccionAntecedente")
	private List<TListadoAccione> TListadoAcciones;

	public CAccionAntecedente() {
	}

	public String getCnAccionAntecedenteId() {
		return this.cnAccionAntecedenteId;
	}

	public void setCnAccionAntecedenteId(String cnAccionAntecedenteId) {
		this.cnAccionAntecedenteId = cnAccionAntecedenteId;
	}

	public String getCsAccionAntecedente() {
		return this.csAccionAntecedente;
	}

	public void setCsAccionAntecedente(String csAccionAntecedente) {
		this.csAccionAntecedente = csAccionAntecedente;
	}

	public List<TListadoAccione> getTListadoAcciones() {
		return this.TListadoAcciones;
	}

	public void setTListadoAcciones(List<TListadoAccione> TListadoAcciones) {
		this.TListadoAcciones = TListadoAcciones;
	}

	public TListadoAccione addTListadoAccione(TListadoAccione TListadoAccione) {
		getTListadoAcciones().add(TListadoAccione);
		TListadoAccione.setCAccionAntecedente(this);

		return TListadoAccione;
	}

	public TListadoAccione removeTListadoAccione(TListadoAccione TListadoAccione) {
		getTListadoAcciones().remove(TListadoAccione);
		TListadoAccione.setCAccionAntecedente(null);

		return TListadoAccione;
	}

}
package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_situacion_persona database table.
 * 
 */
@Entity
@Table(name="t_situacion_persona")
@NamedQuery(name="TSituacionPersona.findAll", query="SELECT t FROM TSituacionPersona t")
public class TSituacionPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TSituacionPersonaPK id;

	private String estatus;

	//bi-directional many-to-one association to TApelacion
	@OneToMany(mappedBy="TSituacionPersona")
	private List<TApelacion> TApelacions;

	//bi-directional many-to-one association to CSituacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_situacion", referencedColumnName = "id_situacion")
	private CSituacion CSituacion;

	//bi-directional many-to-one association to TPersona
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_persona", insertable=false, updatable=false)
	private TPersona TPersona;

	//bi-directional many-to-one association to TTsjdf
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tsjdf", insertable=false, updatable=false)
	private TTsjdf TTsjdf;

	public TSituacionPersona() {
	}

	public TSituacionPersonaPK getId() {
		return this.id;
	}

	public void setId(TSituacionPersonaPK id) {
		this.id = id;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public List<TApelacion> getTApelacions() {
		return this.TApelacions;
	}

	public void setTApelacions(List<TApelacion> TApelacions) {
		this.TApelacions = TApelacions;
	}

	public TApelacion addTApelacion(TApelacion TApelacion) {
		getTApelacions().add(TApelacion);
		TApelacion.setTSituacionPersona(this);

		return TApelacion;
	}

	public TApelacion removeTApelacion(TApelacion TApelacion) {
		getTApelacions().remove(TApelacion);
		TApelacion.setTSituacionPersona(null);

		return TApelacion;
	}

	public CSituacion getCSituacion() {
		return this.CSituacion;
	}

	public void setCSituacion(CSituacion CSituacion) {
		this.CSituacion = CSituacion;
	}

	public TPersona getTPersona() {
		return this.TPersona;
	}

	public void setTPersona(TPersona TPersona) {
		this.TPersona = TPersona;
	}

	public TTsjdf getTTsjdf() {
		return this.TTsjdf;
	}

	public void setTTsjdf(TTsjdf TTsjdf) {
		this.TTsjdf = TTsjdf;
	}

}
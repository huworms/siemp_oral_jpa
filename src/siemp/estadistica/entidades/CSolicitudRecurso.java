package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_solicitud_recurso database table.
 * 
 */
@Entity
@Table(name="c_solicitud_recurso")
@NamedQuery(name="CSolicitudRecurso.findAll", query="SELECT c FROM CSolicitudRecurso c")
public class CSolicitudRecurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_solicitud_recurso_id")
	private String cnSolicitudRecursoId;

	@Column(name="cs_solicitud_recurso")
	private String csSolicitudRecurso;

	//bi-directional many-to-one association to TApelacionUgj
	@OneToMany(mappedBy="CSolicitudRecurso")
	private List<TApelacionUgj> TApelacionUgjs;

	public CSolicitudRecurso() {
	}

	public String getCnSolicitudRecursoId() {
		return this.cnSolicitudRecursoId;
	}

	public void setCnSolicitudRecursoId(String cnSolicitudRecursoId) {
		this.cnSolicitudRecursoId = cnSolicitudRecursoId;
	}

	public String getCsSolicitudRecurso() {
		return this.csSolicitudRecurso;
	}

	public void setCsSolicitudRecurso(String csSolicitudRecurso) {
		this.csSolicitudRecurso = csSolicitudRecurso;
	}

	public List<TApelacionUgj> getTApelacionUgjs() {
		return this.TApelacionUgjs;
	}

	public void setTApelacionUgjs(List<TApelacionUgj> TApelacionUgjs) {
		this.TApelacionUgjs = TApelacionUgjs;
	}

	public TApelacionUgj addTApelacionUgj(TApelacionUgj TApelacionUgj) {
		getTApelacionUgjs().add(TApelacionUgj);
		TApelacionUgj.setCSolicitudRecurso(this);

		return TApelacionUgj;
	}

	public TApelacionUgj removeTApelacionUgj(TApelacionUgj TApelacionUgj) {
		getTApelacionUgjs().remove(TApelacionUgj);
		TApelacionUgj.setCSolicitudRecurso(null);

		return TApelacionUgj;
	}

}
package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_resolucion_recurso database table.
 * 
 */
@Entity
@Table(name="c_resolucion_recurso")
@NamedQuery(name="CResolucionRecurso.findAll", query="SELECT c FROM CResolucionRecurso c")
public class CResolucionRecurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_resolucion_recurso_id")
	private String cnResolucionRecursoId;

	@Column(name="cs_resolucion_recurso")
	private String csResolucionRecurso;

	//bi-directional many-to-one association to TApelacionUgj
	@OneToMany(mappedBy="CResolucionRecurso")
	private List<TApelacionUgj> TApelacionUgjs;

	public CResolucionRecurso() {
	}

	public String getCnResolucionRecursoId() {
		return this.cnResolucionRecursoId;
	}

	public void setCnResolucionRecursoId(String cnResolucionRecursoId) {
		this.cnResolucionRecursoId = cnResolucionRecursoId;
	}

	public String getCsResolucionRecurso() {
		return this.csResolucionRecurso;
	}

	public void setCsResolucionRecurso(String csResolucionRecurso) {
		this.csResolucionRecurso = csResolucionRecurso;
	}

	public List<TApelacionUgj> getTApelacionUgjs() {
		return this.TApelacionUgjs;
	}

	public void setTApelacionUgjs(List<TApelacionUgj> TApelacionUgjs) {
		this.TApelacionUgjs = TApelacionUgjs;
	}

	public TApelacionUgj addTApelacionUgj(TApelacionUgj TApelacionUgj) {
		getTApelacionUgjs().add(TApelacionUgj);
		TApelacionUgj.setCResolucionRecurso(this);

		return TApelacionUgj;
	}

	public TApelacionUgj removeTApelacionUgj(TApelacionUgj TApelacionUgj) {
		getTApelacionUgjs().remove(TApelacionUgj);
		TApelacionUgj.setCResolucionRecurso(null);

		return TApelacionUgj;
	}

}
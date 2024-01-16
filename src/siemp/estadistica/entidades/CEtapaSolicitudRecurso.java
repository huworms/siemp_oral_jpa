package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_etapa_solicitud_recurso database table.
 * 
 */
@Entity
@Table(name="c_etapa_solicitud_recurso")
@NamedQuery(name="CEtapaSolicitudRecurso.findAll", query="SELECT c FROM CEtapaSolicitudRecurso c")
public class CEtapaSolicitudRecurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_etapa_resolucion_recurso_id")
	private String cnEtapaResolucionRecursoId;

	@Column(name="cs_etapa_resolucion_recurso")
	private String csEtapaResolucionRecurso;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CEtapaSolicitudRecurso")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TApelacionUgj
	@OneToMany(mappedBy="CEtapaSolicitudRecurso")
	private List<TApelacionUgj> TApelacionUgjs;

	public CEtapaSolicitudRecurso() {
	}

	public String getCnEtapaResolucionRecursoId() {
		return this.cnEtapaResolucionRecursoId;
	}

	public void setCnEtapaResolucionRecursoId(String cnEtapaResolucionRecursoId) {
		this.cnEtapaResolucionRecursoId = cnEtapaResolucionRecursoId;
	}

	public String getCsEtapaResolucionRecurso() {
		return this.csEtapaResolucionRecurso;
	}

	public void setCsEtapaResolucionRecurso(String csEtapaResolucionRecurso) {
		this.csEtapaResolucionRecurso = csEtapaResolucionRecurso;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCEtapaSolicitudRecurso(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCEtapaSolicitudRecurso(null);

		return COtro;
	}

	public List<TApelacionUgj> getTApelacionUgjs() {
		return this.TApelacionUgjs;
	}

	public void setTApelacionUgjs(List<TApelacionUgj> TApelacionUgjs) {
		this.TApelacionUgjs = TApelacionUgjs;
	}

	public TApelacionUgj addTApelacionUgj(TApelacionUgj TApelacionUgj) {
		getTApelacionUgjs().add(TApelacionUgj);
		TApelacionUgj.setCEtapaSolicitudRecurso(this);

		return TApelacionUgj;
	}

	public TApelacionUgj removeTApelacionUgj(TApelacionUgj TApelacionUgj) {
		getTApelacionUgjs().remove(TApelacionUgj);
		TApelacionUgj.setCEtapaSolicitudRecurso(null);

		return TApelacionUgj;
	}

}
package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_grupo_indigena database table.
 * 
 */
@Entity
@Table(name="c_grupo_indigena")
@NamedQuery(name="CGrupoIndigena.findAll", query="SELECT c FROM CGrupoIndigena c")
public class CGrupoIndigena implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_grupo_indigena_id")
	private String cnGrupoIndigenaId;

	@Column(name="cs_grupo_indigena")
	private String csGrupoIndigena;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CGrupoIndigena")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CGrupoIndigena")
	private List<TPersonaUgj> TPersonaUgjs;

	public CGrupoIndigena() {
	}

	public String getCnGrupoIndigenaId() {
		return this.cnGrupoIndigenaId;
	}

	public void setCnGrupoIndigenaId(String cnGrupoIndigenaId) {
		this.cnGrupoIndigenaId = cnGrupoIndigenaId;
	}

	public String getCsGrupoIndigena() {
		return this.csGrupoIndigena;
	}

	public void setCsGrupoIndigena(String csGrupoIndigena) {
		this.csGrupoIndigena = csGrupoIndigena;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCGrupoIndigena(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCGrupoIndigena(null);

		return COtro;
	}

	public List<TPersonaUgj> getTPersonaUgjs() {
		return this.TPersonaUgjs;
	}

	public void setTPersonaUgjs(List<TPersonaUgj> TPersonaUgjs) {
		this.TPersonaUgjs = TPersonaUgjs;
	}

	public TPersonaUgj addTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().add(TPersonaUgj);
		TPersonaUgj.setCGrupoIndigena(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCGrupoIndigena(null);

		return TPersonaUgj;
	}

}
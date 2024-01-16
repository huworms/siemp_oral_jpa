package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_persona database table.
 * 
 */
@Entity
@Table(name="c_tipo_persona")
@NamedQuery(name="CTipoPersona.findAll", query="SELECT c FROM CTipoPersona c")
public class CTipoPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_tipo_persona_id")
	private String cnTipoPersonaId;

	@Column(name="cs_tipo_persona")
	private String csTipoPersona;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CTipoPersona")
	private List<TPersonaUgj> TPersonaUgjs;

	public CTipoPersona() {
	}

	public String getCnTipoPersonaId() {
		return this.cnTipoPersonaId;
	}

	public void setCnTipoPersonaId(String cnTipoPersonaId) {
		this.cnTipoPersonaId = cnTipoPersonaId;
	}

	public String getCsTipoPersona() {
		return this.csTipoPersona;
	}

	public void setCsTipoPersona(String csTipoPersona) {
		this.csTipoPersona = csTipoPersona;
	}

	public List<TPersonaUgj> getTPersonaUgjs() {
		return this.TPersonaUgjs;
	}

	public void setTPersonaUgjs(List<TPersonaUgj> TPersonaUgjs) {
		this.TPersonaUgjs = TPersonaUgjs;
	}

	public TPersonaUgj addTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().add(TPersonaUgj);
		TPersonaUgj.setCTipoPersona(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCTipoPersona(null);

		return TPersonaUgj;
	}

}
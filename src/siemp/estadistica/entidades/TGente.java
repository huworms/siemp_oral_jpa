package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_gente database table.
 * 
 */
@Entity
@Table(name="t_gente")
@NamedQuery(name="TGente.findAll", query="SELECT t FROM TGente t")
public class TGente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_gente_id")
	private String cnGenteId;

	//bi-directional many-to-one association to TCuestionario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_cuestionario_a_id")
	private TCuestionario TCuestionario;

	//bi-directional many-to-one association to TPersonaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_persona_id")
	private TPersonaUgj TPersonaUgj;

	public TGente() {
	}

	public String getCnGenteId() {
		return this.cnGenteId;
	}

	public void setCnGenteId(String cnGenteId) {
		this.cnGenteId = cnGenteId;
	}

	public TCuestionario getTCuestionario() {
		return this.TCuestionario;
	}

	public void setTCuestionario(TCuestionario TCuestionario) {
		this.TCuestionario = TCuestionario;
	}

	public TPersonaUgj getTPersonaUgj() {
		return this.TPersonaUgj;
	}

	public void setTPersonaUgj(TPersonaUgj TPersonaUgj) {
		this.TPersonaUgj = TPersonaUgj;
	}

}
package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_prision database table.
 * 
 */
@Entity
@Table(name="t_prision")
@NamedQuery(name="TPrision.findAll", query="SELECT t FROM TPrision t")
public class TPrision implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_prision_id")
	private String cnPrisionId;

	@Column(name="cs_prision")
	private String csPrision;

	//bi-directional many-to-one association to TPersonaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_persona_id")
	private TPersonaUgj TPersonaUgj;

	public TPrision() {
	}

	public String getCnPrisionId() {
		return this.cnPrisionId;
	}

	public void setCnPrisionId(String cnPrisionId) {
		this.cnPrisionId = cnPrisionId;
	}

	public String getCsPrision() {
		return this.csPrision;
	}

	public void setCsPrision(String csPrision) {
		this.csPrision = csPrision;
	}

	public TPersonaUgj getTPersonaUgj() {
		return this.TPersonaUgj;
	}

	public void setTPersonaUgj(TPersonaUgj TPersonaUgj) {
		this.TPersonaUgj = TPersonaUgj;
	}

}
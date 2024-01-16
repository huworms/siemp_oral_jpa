package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_consumo database table.
 * 
 */
@Embeddable
public class TConsumoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="cn_persona_id", insertable=false, updatable=false)
	private String cnPersonaId;

	@Column(name="cn_sustancia_id", insertable=false, updatable=false)
	private String cnSustanciaId;

	public TConsumoPK() {
	}
	public String getCnPersonaId() {
		return this.cnPersonaId;
	}
	public void setCnPersonaId(String cnPersonaId) {
		this.cnPersonaId = cnPersonaId;
	}
	public String getCnSustanciaId() {
		return this.cnSustanciaId;
	}
	public void setCnSustanciaId(String cnSustanciaId) {
		this.cnSustanciaId = cnSustanciaId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TConsumoPK)) {
			return false;
		}
		TConsumoPK castOther = (TConsumoPK)other;
		return 
			this.cnPersonaId.equals(castOther.cnPersonaId)
			&& this.cnSustanciaId.equals(castOther.cnSustanciaId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cnPersonaId.hashCode();
		hash = hash * prime + this.cnSustanciaId.hashCode();
		
		return hash;
	}
}
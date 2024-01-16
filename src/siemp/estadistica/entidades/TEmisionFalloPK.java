package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_emision_fallo database table.
 * 
 */
@Embeddable
public class TEmisionFalloPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_delito")
	private String idDelito;

	@Column(name="id_acto_procesal", insertable=false, updatable=false)
	private String idActoProcesal;

	public TEmisionFalloPK() {
	}
	public String getIdDelito() {
		return this.idDelito;
	}
	public void setIdDelito(String idDelito) {
		this.idDelito = idDelito;
	}
	public String getIdActoProcesal() {
		return this.idActoProcesal;
	}
	public void setIdActoProcesal(String idActoProcesal) {
		this.idActoProcesal = idActoProcesal;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TEmisionFalloPK)) {
			return false;
		}
		TEmisionFalloPK castOther = (TEmisionFalloPK)other;
		return 
			this.idDelito.equals(castOther.idDelito)
			&& this.idActoProcesal.equals(castOther.idActoProcesal);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDelito.hashCode();
		hash = hash * prime + this.idActoProcesal.hashCode();
		
		return hash;
	}
}
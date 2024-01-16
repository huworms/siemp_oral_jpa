package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_desagregado database table.
 * 
 */
@Embeddable
public class CDesagregadoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_tipo_del", insertable=false, updatable=false)
	private String idTipoDel;

	@Column(name="id_desagregado")
	private String idDesagregado;

	public CDesagregadoPK() {
	}
	public String getIdTipoDel() {
		return this.idTipoDel;
	}
	public void setIdTipoDel(String idTipoDel) {
		this.idTipoDel = idTipoDel;
	}
	public String getIdDesagregado() {
		return this.idDesagregado;
	}
	public void setIdDesagregado(String idDesagregado) {
		this.idDesagregado = idDesagregado;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CDesagregadoPK)) {
			return false;
		}
		CDesagregadoPK castOther = (CDesagregadoPK)other;
		return 
			this.idTipoDel.equals(castOther.idTipoDel)
			&& this.idDesagregado.equals(castOther.idDesagregado);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idTipoDel.hashCode();
		hash = hash * prime + this.idDesagregado.hashCode();
		
		return hash;
	}
}
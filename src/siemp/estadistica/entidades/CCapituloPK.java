package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the c_capitulo database table.
 * 
 */
@Embeddable
public class CCapituloPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_capitulo")
	private String idCapitulo;

	@Column(name="id_titulo", insertable=false, updatable=false)
	private String idTitulo;

	public CCapituloPK() {
	}
	public String getIdCapitulo() {
		return this.idCapitulo;
	}
	public void setIdCapitulo(String idCapitulo) {
		this.idCapitulo = idCapitulo;
	}
	public String getIdTitulo() {
		return this.idTitulo;
	}
	public void setIdTitulo(String idTitulo) {
		this.idTitulo = idTitulo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CCapituloPK)) {
			return false;
		}
		CCapituloPK castOther = (CCapituloPK)other;
		return 
			this.idCapitulo.equals(castOther.idCapitulo)
			&& this.idTitulo.equals(castOther.idTitulo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCapitulo.hashCode();
		hash = hash * prime + this.idTitulo.hashCode();
		
		return hash;
	}
}
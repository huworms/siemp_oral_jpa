package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_exhorto database table.
 * 
 */
@Embeddable
public class TExhortoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_tsjdf")
	private String idTsjdf;

	@Column(name="id_entidad")
	private int idEntidad;

	public TExhortoPK() {
	}
	public String getIdTsjdf() {
		return this.idTsjdf;
	}
	public void setIdTsjdf(String idTsjdf) {
		this.idTsjdf = idTsjdf;
	}
	public int getIdEntidad() {
		return this.idEntidad;
	}
	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TExhortoPK)) {
			return false;
		}
		TExhortoPK castOther = (TExhortoPK)other;
		return 
			this.idTsjdf.equals(castOther.idTsjdf)
			&& (this.idEntidad == castOther.idEntidad);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idTsjdf.hashCode();
		hash = hash * prime + this.idEntidad;
		
		return hash;
	}
}
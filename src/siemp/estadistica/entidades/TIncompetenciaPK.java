package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_incompetencia database table.
 * 
 */
@Embeddable
public class TIncompetenciaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_entidad")
	private int idEntidad;

	@Column(name="id_tsjdf")
	private Long idTsjdf;

	public TIncompetenciaPK() {
	}
	public int getIdEntidad() {
		return this.idEntidad;
	}
	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}
	public Long getIdTsjdf() {
		return this.idTsjdf;
	}
	public void setIdTsjdf(Long idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TIncompetenciaPK)) {
			return false;
		}
		TIncompetenciaPK castOther = (TIncompetenciaPK)other;
		return 
			(this.idEntidad == castOther.idEntidad)
			&& this.idTsjdf.equals(castOther.idTsjdf);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idEntidad;
		hash = hash * prime + this.idTsjdf.hashCode();
		
		return hash;
	}
}
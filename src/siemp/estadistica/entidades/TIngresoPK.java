package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_ingreso database table.
 * 
 */
@Embeddable
public class TIngresoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_tsjdf", insertable=false, updatable=false)
	private Long idTsjdf;

	@Column(name="id_entidad", insertable=false, updatable=false)
	private int idEntidad;

	public TIngresoPK() {
	}
	
	public TIngresoPK(Long idTsjdf, int idEntidad) {
		this.idEntidad=idEntidad;
		this.idTsjdf=idTsjdf;
	}
	
	public Long getIdTsjdf() {
		return this.idTsjdf;
	}
	public void setIdTsjdf(Long idTsjdf) {
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
		if (!(other instanceof TIngresoPK)) {
			return false;
		}
		TIngresoPK castOther = (TIngresoPK)other;
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
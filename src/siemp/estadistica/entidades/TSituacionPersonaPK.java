package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_situacion_persona database table.
 * 
 */
@Embeddable
public class TSituacionPersonaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_persona", insertable=false, updatable=false)
	private Long idPersona;

	@Column(name="id_tsjdf", insertable=false, updatable=false)
	private Long idTsjdf;

	public TSituacionPersonaPK() {
	}
	public Long getIdPersona() {
		return this.idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
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
		if (!(other instanceof TSituacionPersonaPK)) {
			return false;
		}
		TSituacionPersonaPK castOther = (TSituacionPersonaPK)other;
		return 
			this.idPersona.equals(castOther.idPersona)
			&& this.idTsjdf.equals(castOther.idTsjdf);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idPersona.hashCode();
		hash = hash * prime + this.idTsjdf.hashCode();
		
		return hash;
	}
}
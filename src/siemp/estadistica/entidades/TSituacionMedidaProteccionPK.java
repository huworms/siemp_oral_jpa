package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_situacion_medida_proteccion database table.
 * 
 */
@Embeddable
public class TSituacionMedidaProteccionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_persona")
	private String idPersona;

	@Column(name="id_tsjdf")
	private String idTsjdf;

	public TSituacionMedidaProteccionPK() {
	}
	public String getIdPersona() {
		return this.idPersona;
	}
	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}
	public String getIdTsjdf() {
		return this.idTsjdf;
	}
	public void setIdTsjdf(String idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TSituacionMedidaProteccionPK)) {
			return false;
		}
		TSituacionMedidaProteccionPK castOther = (TSituacionMedidaProteccionPK)other;
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
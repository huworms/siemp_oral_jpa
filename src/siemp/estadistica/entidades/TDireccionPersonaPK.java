package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_direccion_persona database table.
 * 
 */
@Embeddable
public class TDireccionPersonaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_persona", insertable=false, updatable=false)
	private String idPersona;

	@Column(name="id_tipo_direccion")
	private String idTipoDireccion;

	public TDireccionPersonaPK() {
	}
	public String getIdPersona() {
		return this.idPersona;
	}
	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}
	public String getIdTipoDireccion() {
		return this.idTipoDireccion;
	}
	public void setIdTipoDireccion(String idTipoDireccion) {
		this.idTipoDireccion = idTipoDireccion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TDireccionPersonaPK)) {
			return false;
		}
		TDireccionPersonaPK castOther = (TDireccionPersonaPK)other;
		return 
			this.idPersona.equals(castOther.idPersona)
			&& this.idTipoDireccion.equals(castOther.idTipoDireccion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idPersona.hashCode();
		hash = hash * prime + this.idTipoDireccion.hashCode();
		
		return hash;
	}
}
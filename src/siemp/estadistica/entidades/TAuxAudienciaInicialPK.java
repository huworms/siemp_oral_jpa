package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_aux_audiencia_inicial database table.
 * 
 */
@Embeddable
public class TAuxAudienciaInicialPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_persona")
	private String idPersona;

	@Column(name="id_evento")
	private String idEvento;

	public TAuxAudienciaInicialPK() {
	}
	public String getIdPersona() {
		return this.idPersona;
	}
	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}
	public String getIdEvento() {
		return this.idEvento;
	}
	public void setIdEvento(String idEvento) {
		this.idEvento = idEvento;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TAuxAudienciaInicialPK)) {
			return false;
		}
		TAuxAudienciaInicialPK castOther = (TAuxAudienciaInicialPK)other;
		return 
			this.idPersona.equals(castOther.idPersona)
			&& this.idEvento.equals(castOther.idEvento);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idPersona.hashCode();
		hash = hash * prime + this.idEvento.hashCode();
		
		return hash;
	}
}
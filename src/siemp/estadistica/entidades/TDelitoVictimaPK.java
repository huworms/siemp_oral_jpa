package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_delito_victima database table.
 * 
 */
@Embeddable
public class TDelitoVictimaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_delito", insertable=false, updatable=false)
	private String idDelito;

	@Column(name="id_victima")
	private String idVictima;

	public TDelitoVictimaPK() {
	}
	public String getIdDelito() {
		return this.idDelito;
	}
	public void setIdDelito(String idDelito) {
		this.idDelito = idDelito;
	}
	public String getIdVictima() {
		return this.idVictima;
	}
	public void setIdVictima(String idVictima) {
		this.idVictima = idVictima;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TDelitoVictimaPK)) {
			return false;
		}
		TDelitoVictimaPK castOther = (TDelitoVictimaPK)other;
		return 
			this.idDelito.equals(castOther.idDelito)
			&& this.idVictima.equals(castOther.idVictima);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDelito.hashCode();
		hash = hash * prime + this.idVictima.hashCode();
		
		return hash;
	}
}
package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_limite_entrega database table.
 * 
 */
@Embeddable
public class TLimiteEntregaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int anio;

	private int mes;

	public TLimiteEntregaPK() {
	}
	public int getAnio() {
		return this.anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getMes() {
		return this.mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TLimiteEntregaPK)) {
			return false;
		}
		TLimiteEntregaPK castOther = (TLimiteEntregaPK)other;
		return 
			(this.anio == castOther.anio)
			&& (this.mes == castOther.mes);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.anio;
		hash = hash * prime + this.mes;
		
		return hash;
	}
}
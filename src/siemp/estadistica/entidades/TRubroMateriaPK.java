package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_rubro_materia database table.
 * 
 */
@Embeddable
public class TRubroMateriaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_rubro", insertable=false, updatable=false)
	private int idRubro;

	@Column(name="id_materia")
	private int idMateria;

	public TRubroMateriaPK() {
	}
	public int getIdRubro() {
		return this.idRubro;
	}
	public void setIdRubro(int idRubro) {
		this.idRubro = idRubro;
	}
	public int getIdMateria() {
		return this.idMateria;
	}
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TRubroMateriaPK)) {
			return false;
		}
		TRubroMateriaPK castOther = (TRubroMateriaPK)other;
		return 
			(this.idRubro == castOther.idRubro)
			&& (this.idMateria == castOther.idMateria);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idRubro;
		hash = hash * prime + this.idMateria;
		
		return hash;
	}
}
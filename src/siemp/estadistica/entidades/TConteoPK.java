package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_conteo database table.
 * 
 */
@Embeddable
public class TConteoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_rubro", insertable=false, updatable=false)
	private int idRubro;

	@Column(name="id_reporte_mensual", insertable=false, updatable=false)
	private int idReporteMensual;

	public TConteoPK() {
	}
	public int getIdRubro() {
		return this.idRubro;
	}
	public void setIdRubro(int idRubro) {
		this.idRubro = idRubro;
	}
	public int getIdReporteMensual() {
		return this.idReporteMensual;
	}
	public void setIdReporteMensual(int idReporteMensual) {
		this.idReporteMensual = idReporteMensual;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TConteoPK)) {
			return false;
		}
		TConteoPK castOther = (TConteoPK)other;
		return 
			(this.idRubro == castOther.idRubro)
			&& (this.idReporteMensual == castOther.idReporteMensual);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idRubro;
		hash = hash * prime + this.idReporteMensual;
		
		return hash;
	}
}
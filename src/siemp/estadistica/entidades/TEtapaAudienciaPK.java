package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_etapa_audiencia database table.
 * 
 */
@Embeddable
public class TEtapaAudienciaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_tipo_audiencia", insertable=false, updatable=false)
	private int idTipoAudiencia;

	@Column(name="id_etapa", insertable=false, updatable=false)
	private int idEtapa;

	@Column(name="id_tipo_asunto")
	private int idTipoAsunto;

	public TEtapaAudienciaPK() {
	}
	public int getIdTipoAudiencia() {
		return this.idTipoAudiencia;
	}
	public void setIdTipoAudiencia(int idTipoAudiencia) {
		this.idTipoAudiencia = idTipoAudiencia;
	}
	public int getIdEtapa() {
		return this.idEtapa;
	}
	public void setIdEtapa(int idEtapa) {
		this.idEtapa = idEtapa;
	}
	public int getIdTipoAsunto() {
		return this.idTipoAsunto;
	}
	public void setIdTipoAsunto(int idTipoAsunto) {
		this.idTipoAsunto = idTipoAsunto;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TEtapaAudienciaPK)) {
			return false;
		}
		TEtapaAudienciaPK castOther = (TEtapaAudienciaPK)other;
		return 
			(this.idTipoAudiencia == castOther.idTipoAudiencia)
			&& (this.idEtapa == castOther.idEtapa)
			&& (this.idTipoAsunto == castOther.idTipoAsunto);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idTipoAudiencia;
		hash = hash * prime + this.idEtapa;
		hash = hash * prime + this.idTipoAsunto;
		
		return hash;
	}
}
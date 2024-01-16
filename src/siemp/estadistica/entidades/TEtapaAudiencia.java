package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_etapa_audiencia database table.
 * 
 */
@Entity
@Table(name="t_etapa_audiencia")
@NamedQuery(name="TEtapaAudiencia.findAll", query="SELECT t FROM TEtapaAudiencia t")
public class TEtapaAudiencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TEtapaAudienciaPK id;

	private int orden;

	//bi-directional many-to-one association to CEtapa
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_etapa", insertable=false, updatable=false)
	private CEtapa CEtapa;

	//bi-directional many-to-one association to CTipoAudiencia
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_audiencia", insertable=false, updatable=false)
	private CTipoAudiencia CTipoAudiencia;

	public TEtapaAudiencia() {
	}

	public TEtapaAudienciaPK getId() {
		return this.id;
	}

	public void setId(TEtapaAudienciaPK id) {
		this.id = id;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public CEtapa getCEtapa() {
		return this.CEtapa;
	}

	public void setCEtapa(CEtapa CEtapa) {
		this.CEtapa = CEtapa;
	}

	public CTipoAudiencia getCTipoAudiencia() {
		return this.CTipoAudiencia;
	}

	public void setCTipoAudiencia(CTipoAudiencia CTipoAudiencia) {
		this.CTipoAudiencia = CTipoAudiencia;
	}

}
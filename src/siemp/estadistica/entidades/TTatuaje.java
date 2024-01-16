package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_tatuaje database table.
 * 
 */
@Entity
@Table(name="t_tatuaje")
@NamedQuery(name="TTatuaje.findAll", query="SELECT t FROM TTatuaje t")
public class TTatuaje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_tatuaje_id")
	private String cnTatuajeId;

	@Lob
	@Column(name="cs_descripcion")
	private String csDescripcion;

	@Column(name="cs_donde")
	private String csDonde;

	//bi-directional many-to-one association to TPersonaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_persona_id")
	private TPersonaUgj TPersonaUgj;

	public TTatuaje() {
	}

	public String getCnTatuajeId() {
		return this.cnTatuajeId;
	}

	public void setCnTatuajeId(String cnTatuajeId) {
		this.cnTatuajeId = cnTatuajeId;
	}

	public String getCsDescripcion() {
		return this.csDescripcion;
	}

	public void setCsDescripcion(String csDescripcion) {
		this.csDescripcion = csDescripcion;
	}

	public String getCsDonde() {
		return this.csDonde;
	}

	public void setCsDonde(String csDonde) {
		this.csDonde = csDonde;
	}

	public TPersonaUgj getTPersonaUgj() {
		return this.TPersonaUgj;
	}

	public void setTPersonaUgj(TPersonaUgj TPersonaUgj) {
		this.TPersonaUgj = TPersonaUgj;
	}

}
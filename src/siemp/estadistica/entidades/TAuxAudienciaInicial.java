package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_aux_audiencia_inicial database table.
 * 
 */
@Entity
@Table(name="t_aux_audiencia_inicial")
@NamedQuery(name="TAuxAudienciaInicial.findAll", query="SELECT t FROM TAuxAudienciaInicial t")
public class TAuxAudienciaInicial implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TAuxAudienciaInicialPK id;

	private String control;

	@Column(name="dato_audiencia")
	private String datoAudiencia;

	@Column(name="medidas_cautelares")
	private String medidasCautelares;

	private String vinculacion;

	public TAuxAudienciaInicial() {
	}

	public TAuxAudienciaInicialPK getId() {
		return this.id;
	}

	public void setId(TAuxAudienciaInicialPK id) {
		this.id = id;
	}

	public String getControl() {
		return this.control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	public String getDatoAudiencia() {
		return this.datoAudiencia;
	}

	public void setDatoAudiencia(String datoAudiencia) {
		this.datoAudiencia = datoAudiencia;
	}

	public String getMedidasCautelares() {
		return this.medidasCautelares;
	}

	public void setMedidasCautelares(String medidasCautelares) {
		this.medidasCautelares = medidasCautelares;
	}

	public String getVinculacion() {
		return this.vinculacion;
	}

	public void setVinculacion(String vinculacion) {
		this.vinculacion = vinculacion;
	}

}
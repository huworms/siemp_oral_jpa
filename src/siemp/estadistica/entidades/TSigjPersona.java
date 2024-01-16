package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_sigj_persona database table.
 * 
 */
@Entity
@Table(name="t_sigj_persona")
@NamedQuery(name="TSigjPersona.findAll", query="SELECT t FROM TSigjPersona t")
public class TSigjPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_persona")
	private Long idPersona;

	@Column(name="id_carpeta_sigj")
	private Long idCarpetaSigj;

	@Column(name="id_persona_sigj")
	private Long idPersonaSigj;

	@Column(name="id_tsjdf")
	private Long idTsjdf;

	public TSigjPersona() {
	}

	public Long getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public Long getIdCarpetaSigj() {
		return this.idCarpetaSigj;
	}

	public void setIdCarpetaSigj(Long idCarpetaSigj) {
		this.idCarpetaSigj = idCarpetaSigj;
	}

	public Long getIdPersonaSigj() {
		return this.idPersonaSigj;
	}

	public void setIdPersonaSigj(Long idPersonaSigj) {
		this.idPersonaSigj = idPersonaSigj;
	}

	public Long getIdTsjdf() {
		return this.idTsjdf;
	}

	public void setIdTsjdf(Long idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

}
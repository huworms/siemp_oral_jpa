package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_sigj_carpeta database table.
 * 
 */
@Entity
@Table(name="t_sigj_carpeta")
@NamedQuery(name="TSigjCarpeta.findAll", query="SELECT t FROM TSigjCarpeta t")
public class TSigjCarpeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tsjdf")
	private Long idTsjdf;

	@Column(name="id_carpeta")
	private Long idCarpeta;

	public TSigjCarpeta() {
	}

	public Long getIdTsjdf() {
		return this.idTsjdf;
	}

	public void setIdTsjdf(Long idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public Long getIdCarpeta() {
		return this.idCarpeta;
	}

	public void setIdCarpeta(Long idCarpeta) {
		this.idCarpeta = idCarpeta;
	}

}
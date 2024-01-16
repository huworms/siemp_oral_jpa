package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_apertura_juicio database table.
 * 
 */
@Entity
@Table(name="t_apertura_juicio")
@NamedQuery(name="TAperturaJuicio.findAll", query="SELECT t FROM TAperturaJuicio t")
public class TAperturaJuicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_acto_procesal")
	private String idActoProcesal;

	@Column(name="apertura_juicio")
	private String aperturaJuicio;

	//bi-directional one-to-one association to TActoProcesal
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_acto_procesal")
	private TActoProcesal TActoProcesal;

	public TAperturaJuicio() {
	}

	public String getIdActoProcesal() {
		return this.idActoProcesal;
	}

	public void setIdActoProcesal(String idActoProcesal) {
		this.idActoProcesal = idActoProcesal;
	}

	public String getAperturaJuicio() {
		return this.aperturaJuicio;
	}

	public void setAperturaJuicio(String aperturaJuicio) {
		this.aperturaJuicio = aperturaJuicio;
	}

	public TActoProcesal getTActoProcesal() {
		return this.TActoProcesal;
	}

	public void setTActoProcesal(TActoProcesal TActoProcesal) {
		this.TActoProcesal = TActoProcesal;
	}

}
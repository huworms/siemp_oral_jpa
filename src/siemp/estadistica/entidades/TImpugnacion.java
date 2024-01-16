package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the t_impugnacion database table.
 * 
 */
@Entity
@Table(name="t_impugnacion")
@NamedQuery(name="TImpugnacion.findAll", query="SELECT t FROM TImpugnacion t")
public class TImpugnacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_impugnacion_mp")
	private Long idImpugnacionMp;

	@Column(name="id_tsjdf")
	private Long idTsjdf;

	@Column(name="otro_tipo")
	private String otroTipo;

	private String resolucion;

	//bi-directional many-to-one association to CImpugnacionMp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo")
	private CImpugnacionMp CImpugnacionMp;

	public TImpugnacion() {
	}

	public Long getIdImpugnacionMp() {
		return this.idImpugnacionMp;
	}

	public void setIdImpugnacionMp(Long idImpugnacionMp) {
		this.idImpugnacionMp = idImpugnacionMp;
	}

	public Long getIdTsjdf() {
		return this.idTsjdf;
	}

	public void setIdTsjdf(Long idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public String getOtroTipo() {
		return this.otroTipo;
	}

	public void setOtroTipo(String otroTipo) {
		this.otroTipo = otroTipo;
	}

	public String getResolucion() {
		return this.resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public CImpugnacionMp getCImpugnacionMp() {
		return this.CImpugnacionMp;
	}

	public void setCImpugnacionMp(CImpugnacionMp CImpugnacionMp) {
		this.CImpugnacionMp = CImpugnacionMp;
	}

}
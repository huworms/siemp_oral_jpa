package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_victima database table.
 * 
 */
@Entity
@Table(name="t_victima")
@NamedQuery(name="TVictima.findAll", query="SELECT t FROM TVictima t")
public class TVictima implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_persona")
	private Long idPersona;

	private String complemento;

	@Column(name="id_relacion_victima")
	private int idRelacionVictima;

	@Column(name="otra_relacion")
	private String otraRelacion;

	@Column(name="tipo_victima")
	private String tipoVictima;

	//bi-directional one-to-one association to TPersona
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_persona")
	private TPersona TPersona;

	public TVictima() {
	}

	public Long getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getIdRelacionVictima() {
		return this.idRelacionVictima;
	}

	public void setIdRelacionVictima(int idRelacionVictima) {
		this.idRelacionVictima = idRelacionVictima;
	}

	public String getOtraRelacion() {
		return this.otraRelacion;
	}

	public void setOtraRelacion(String otraRelacion) {
		this.otraRelacion = otraRelacion;
	}

	public String getTipoVictima() {
		return this.tipoVictima;
	}

	public void setTipoVictima(String tipoVictima) {
		this.tipoVictima = tipoVictima;
	}

	public TPersona getTPersona() {
		return this.TPersona;
	}

	public void setTPersona(TPersona TPersona) {
		this.TPersona = TPersona;
	}

}
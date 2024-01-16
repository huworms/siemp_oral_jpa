package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_conclusion database table.
 * 
 */
@Entity
@Table(name="t_conclusion")
@NamedQuery(name="TConclusion.findAll", query="SELECT t FROM TConclusion t")
public class TConclusion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_evento")
	private Long idEvento;

	private String comentario;

	private String estatus;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_cumplimiento")
	private Date fechaCumplimiento;

	@Column(name="id_delito")
	private BigInteger idDelito;

	@Column(name="id_persona")
	private BigInteger idPersona;

	@Column(name="id_victima")
	private BigDecimal idVictima;

	//bi-directional many-to-one association to CConclusion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_conclusion")
	private CConclusion CConclusion;

	//bi-directional one-to-one association to TAudienciaImputado
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_evento")
	private TAudienciaImputado TAudienciaImputado;

	public TConclusion() {
	}

	public Long getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Date getFechaCumplimiento() {
		return this.fechaCumplimiento;
	}

	public void setFechaCumplimiento(Date fechaCumplimiento) {
		this.fechaCumplimiento = fechaCumplimiento;
	}

	public BigInteger getIdDelito() {
		return this.idDelito;
	}

	public void setIdDelito(BigInteger idDelito) {
		this.idDelito = idDelito;
	}

	public BigInteger getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(BigInteger idPersona) {
		this.idPersona = idPersona;
	}

	public BigDecimal getIdVictima() {
		return this.idVictima;
	}

	public void setIdVictima(BigDecimal idVictima) {
		this.idVictima = idVictima;
	}

	public CConclusion getCConclusion() {
		return this.CConclusion;
	}

	public void setCConclusion(CConclusion CConclusion) {
		this.CConclusion = CConclusion;
	}

	public TAudienciaImputado getTAudienciaImputado() {
		return this.TAudienciaImputado;
	}

	public void setTAudienciaImputado(TAudienciaImputado TAudienciaImputado) {
		this.TAudienciaImputado = TAudienciaImputado;
	}

}
package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the t_cuestionario database table.
 * 
 */
@Entity
@Table(name="t_cuestionario")
@NamedQuery(name="TCuestionario.findAll", query="SELECT t FROM TCuestionario t")
public class TCuestionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_cuestionario_a_id")
	private String cnCuestionarioAId;

	@Column(name="cb_ab_tipo_cuestionario")
	private byte cbAbTipoCuestionario;

	@Column(name="cb_se_completo")
	private byte cbSeCompleto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cd_ab_fin")
	private Date cdAbFin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cd_ab_inicio")
	private Date cdAbInicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cd_fecha_cambio")
	private Date cdFechaCambio;

	@Lob
	@Column(name="cs_observaciones_gral")
	private String csObservacionesGral;

	@Column(name="cs_sala_oral_penal")
	private String csSalaOralPenal;

	private String csNCI;

	private String csNCS;

	@Column(name="id_entidad")
	private int idEntidad;

	@Column(name="id_tsjdf")
	private BigInteger idTsjdf;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="TCuestionario")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TGente
	@OneToMany(mappedBy="TCuestionario")
	private List<TGente> TGentes;

	public TCuestionario() {
	}

	public String getCnCuestionarioAId() {
		return this.cnCuestionarioAId;
	}

	public void setCnCuestionarioAId(String cnCuestionarioAId) {
		this.cnCuestionarioAId = cnCuestionarioAId;
	}

	public byte getCbAbTipoCuestionario() {
		return this.cbAbTipoCuestionario;
	}

	public void setCbAbTipoCuestionario(byte cbAbTipoCuestionario) {
		this.cbAbTipoCuestionario = cbAbTipoCuestionario;
	}

	public byte getCbSeCompleto() {
		return this.cbSeCompleto;
	}

	public void setCbSeCompleto(byte cbSeCompleto) {
		this.cbSeCompleto = cbSeCompleto;
	}

	public Date getCdAbFin() {
		return this.cdAbFin;
	}

	public void setCdAbFin(Date cdAbFin) {
		this.cdAbFin = cdAbFin;
	}

	public Date getCdAbInicio() {
		return this.cdAbInicio;
	}

	public void setCdAbInicio(Date cdAbInicio) {
		this.cdAbInicio = cdAbInicio;
	}

	public Date getCdFechaCambio() {
		return this.cdFechaCambio;
	}

	public void setCdFechaCambio(Date cdFechaCambio) {
		this.cdFechaCambio = cdFechaCambio;
	}

	public String getCsObservacionesGral() {
		return this.csObservacionesGral;
	}

	public void setCsObservacionesGral(String csObservacionesGral) {
		this.csObservacionesGral = csObservacionesGral;
	}

	public String getCsSalaOralPenal() {
		return this.csSalaOralPenal;
	}

	public void setCsSalaOralPenal(String csSalaOralPenal) {
		this.csSalaOralPenal = csSalaOralPenal;
	}

	public String getCsNCI() {
		return this.csNCI;
	}

	public void setCsNCI(String csNCI) {
		this.csNCI = csNCI;
	}

	public String getCsNCS() {
		return this.csNCS;
	}

	public void setCsNCS(String csNCS) {
		this.csNCS = csNCS;
	}

	public int getIdEntidad() {
		return this.idEntidad;
	}

	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}

	public BigInteger getIdTsjdf() {
		return this.idTsjdf;
	}

	public void setIdTsjdf(BigInteger idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setTCuestionario(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setTCuestionario(null);

		return COtro;
	}

	public List<TGente> getTGentes() {
		return this.TGentes;
	}

	public void setTGentes(List<TGente> TGentes) {
		this.TGentes = TGentes;
	}

	public TGente addTGente(TGente TGente) {
		getTGentes().add(TGente);
		TGente.setTCuestionario(this);

		return TGente;
	}

	public TGente removeTGente(TGente TGente) {
		getTGentes().remove(TGente);
		TGente.setTCuestionario(null);

		return TGente;
	}

}
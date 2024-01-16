package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_investigacion_mp database table.
 * 
 */
@Entity
@Table(name="t_investigacion_mp")
@NamedQuery(name="TInvestigacionMp.findAll", query="SELECT t FROM TInvestigacionMp t")
public class TInvestigacionMp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tsjdf")
	private Long idTsjdf;

	@Column(name="accion_paticular")
	private String accionPaticular;

	private String consignacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_registro_pgjdf")
	private Date fechaRegistroPgjdf;

	private int fojas;

	@Column(name="id_ci_pgjdf")
	private BigInteger idCiPgjdf;

	@Column(name="id_materia")
	private int idMateria;

	@Column(name="num_investigacion")
	private String numInvestigacion;

	private String procedencia;

	@Column(name="tipo_detencion")
	private String tipoDetencion;

	@Column(name="tipo_investigacion")
	private String tipoInvestigacion;

	//bi-directional one-to-one association to TTsjdf
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tsjdf" , referencedColumnName = "id_tsjdf", insertable = false, updatable = false)
	private TTsjdf TTsjdf;

	public TInvestigacionMp() {
	}

	public Long getIdTsjdf() {
		return this.idTsjdf;
	}

	public void setIdTsjdf(Long idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public String getAccionPaticular() {
		return this.accionPaticular;
	}

	public void setAccionPaticular(String accionPaticular) {
		this.accionPaticular = accionPaticular;
	}

	public String getConsignacion() {
		return this.consignacion;
	}

	public void setConsignacion(String consignacion) {
		this.consignacion = consignacion;
	}

	public Date getFechaRegistroPgjdf() {
		return this.fechaRegistroPgjdf;
	}

	public void setFechaRegistroPgjdf(Date fechaRegistroPgjdf) {
		this.fechaRegistroPgjdf = fechaRegistroPgjdf;
	}

	public int getFojas() {
		return this.fojas;
	}

	public void setFojas(int fojas) {
		this.fojas = fojas;
	}

	public BigInteger getIdCiPgjdf() {
		return this.idCiPgjdf;
	}

	public void setIdCiPgjdf(BigInteger idCiPgjdf) {
		this.idCiPgjdf = idCiPgjdf;
	}

	public int getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public String getNumInvestigacion() {
		return this.numInvestigacion;
	}

	public void setNumInvestigacion(String numInvestigacion) {
		this.numInvestigacion = numInvestigacion;
	}

	public String getProcedencia() {
		return this.procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getTipoDetencion() {
		return this.tipoDetencion;
	}

	public void setTipoDetencion(String tipoDetencion) {
		this.tipoDetencion = tipoDetencion;
	}

	public String getTipoInvestigacion() {
		return this.tipoInvestigacion;
	}

	public void setTipoInvestigacion(String tipoInvestigacion) {
		this.tipoInvestigacion = tipoInvestigacion;
	}

	public TTsjdf getTTsjdf() {
		return this.TTsjdf;
	}

	public void setTTsjdf(TTsjdf TTsjdf) {
		this.TTsjdf = TTsjdf;
	}

}
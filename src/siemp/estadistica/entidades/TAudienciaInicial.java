package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_audiencia_inicial database table.
 * 
 */
@Entity
@Table(name="t_audiencia_inicial")
@NamedQuery(name="TAudienciaInicial.findAll", query="SELECT t FROM TAudienciaInicial t")
public class TAudienciaInicial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_acto_procesal")
	private String idActoProcesal;

	@Column(name="declaracion_imputado")
	private String declaracionImputado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_cierre_investigacion")
	private Date fechaCierreInvestigacion;

	@Column(name="nombre_abogado")
	private String nombreAbogado;

	@Column(name="plazo_cierre_investigacion")
	private int plazoCierreInvestigacion;

	@Column(name="plazo_constitucional")
	private String plazoConstitucional;

	@Column(name="sexo_defensa")
	private String sexoDefensa;

	@Column(name="tipo_asesor")
	private int tipoAsesor;

	@Column(name="tipo_defensa")
	private int tipoDefensa;

	@Column(name="tipo_detencion")
	private int tipoDetencion;

	//bi-directional one-to-one association to TActoProcesal
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_acto_procesal")
	private TActoProcesal TActoProcesal;

	public TAudienciaInicial() {
	}

	public String getIdActoProcesal() {
		return this.idActoProcesal;
	}

	public void setIdActoProcesal(String idActoProcesal) {
		this.idActoProcesal = idActoProcesal;
	}

	public String getDeclaracionImputado() {
		return this.declaracionImputado;
	}

	public void setDeclaracionImputado(String declaracionImputado) {
		this.declaracionImputado = declaracionImputado;
	}

	public Date getFechaCierreInvestigacion() {
		return this.fechaCierreInvestigacion;
	}

	public void setFechaCierreInvestigacion(Date fechaCierreInvestigacion) {
		this.fechaCierreInvestigacion = fechaCierreInvestigacion;
	}

	public String getNombreAbogado() {
		return this.nombreAbogado;
	}

	public void setNombreAbogado(String nombreAbogado) {
		this.nombreAbogado = nombreAbogado;
	}

	public int getPlazoCierreInvestigacion() {
		return this.plazoCierreInvestigacion;
	}

	public void setPlazoCierreInvestigacion(int plazoCierreInvestigacion) {
		this.plazoCierreInvestigacion = plazoCierreInvestigacion;
	}

	public String getPlazoConstitucional() {
		return this.plazoConstitucional;
	}

	public void setPlazoConstitucional(String plazoConstitucional) {
		this.plazoConstitucional = plazoConstitucional;
	}

	public String getSexoDefensa() {
		return this.sexoDefensa;
	}

	public void setSexoDefensa(String sexoDefensa) {
		this.sexoDefensa = sexoDefensa;
	}

	public int getTipoAsesor() {
		return this.tipoAsesor;
	}

	public void setTipoAsesor(int tipoAsesor) {
		this.tipoAsesor = tipoAsesor;
	}

	public int getTipoDefensa() {
		return this.tipoDefensa;
	}

	public void setTipoDefensa(int tipoDefensa) {
		this.tipoDefensa = tipoDefensa;
	}

	public int getTipoDetencion() {
		return this.tipoDetencion;
	}

	public void setTipoDetencion(int tipoDetencion) {
		this.tipoDetencion = tipoDetencion;
	}

	public TActoProcesal getTActoProcesal() {
		return this.TActoProcesal;
	}

	public void setTActoProcesal(TActoProcesal TActoProcesal) {
		this.TActoProcesal = TActoProcesal;
	}

}
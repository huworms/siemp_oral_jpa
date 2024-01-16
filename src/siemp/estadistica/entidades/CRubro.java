package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the c_rubro database table.
 * 
 */
@Entity
@Table(name="c_rubro")
@NamedQuery(name="CRubro.findAll", query="SELECT c FROM CRubro c")
public class CRubro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_rubro")
	private int idRubro;

	@Column(name="actualiza_rubro")
	private String actualizaRubro;

	@Column(name="ayuda_rubro")
	private String ayudaRubro;

	private String descripcion;

	private String estatus;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_alta")
	private Date fechaAlta;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_baja")
	private Date fechaBaja;

	private String fuente;

	@Column(name="id_materia")
	private int idMateria;

	@Column(name="orden_numerico")
	private int ordenNumerico;

	private String subrubro;

	@Column(name="sumatoria_rubro")
	private String sumatoriaRubro;

	//bi-directional many-to-one association to TConteo
	@OneToMany(mappedBy="CRubro")
	private List<TConteo> TConteos;

	//bi-directional many-to-one association to TRubroMateria
	@OneToMany(mappedBy="CRubro")
	private List<TRubroMateria> TRubroMaterias;

	public CRubro() {
	}

	public int getIdRubro() {
		return this.idRubro;
	}

	public void setIdRubro(int idRubro) {
		this.idRubro = idRubro;
	}

	public String getActualizaRubro() {
		return this.actualizaRubro;
	}

	public void setActualizaRubro(String actualizaRubro) {
		this.actualizaRubro = actualizaRubro;
	}

	public String getAyudaRubro() {
		return this.ayudaRubro;
	}

	public void setAyudaRubro(String ayudaRubro) {
		this.ayudaRubro = ayudaRubro;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public String getFuente() {
		return this.fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	public int getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public int getOrdenNumerico() {
		return this.ordenNumerico;
	}

	public void setOrdenNumerico(int ordenNumerico) {
		this.ordenNumerico = ordenNumerico;
	}

	public String getSubrubro() {
		return this.subrubro;
	}

	public void setSubrubro(String subrubro) {
		this.subrubro = subrubro;
	}

	public String getSumatoriaRubro() {
		return this.sumatoriaRubro;
	}

	public void setSumatoriaRubro(String sumatoriaRubro) {
		this.sumatoriaRubro = sumatoriaRubro;
	}

	public List<TConteo> getTConteos() {
		return this.TConteos;
	}

	public void setTConteos(List<TConteo> TConteos) {
		this.TConteos = TConteos;
	}

	public TConteo addTConteo(TConteo TConteo) {
		getTConteos().add(TConteo);
		TConteo.setCRubro(this);

		return TConteo;
	}

	public TConteo removeTConteo(TConteo TConteo) {
		getTConteos().remove(TConteo);
		TConteo.setCRubro(null);

		return TConteo;
	}

	public List<TRubroMateria> getTRubroMaterias() {
		return this.TRubroMaterias;
	}

	public void setTRubroMaterias(List<TRubroMateria> TRubroMaterias) {
		this.TRubroMaterias = TRubroMaterias;
	}

	public TRubroMateria addTRubroMateria(TRubroMateria TRubroMateria) {
		getTRubroMaterias().add(TRubroMateria);
		TRubroMateria.setCRubro(this);

		return TRubroMateria;
	}

	public TRubroMateria removeTRubroMateria(TRubroMateria TRubroMateria) {
		getTRubroMaterias().remove(TRubroMateria);
		TRubroMateria.setCRubro(null);

		return TRubroMateria;
	}

}
package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the t_tsjdf database table.
 * 
 */
@Entity
@Table(schema = "siemp_oral", name="t_tsjdf")
@NamedQuery(name="TTsjdf.findAll", query="SELECT t FROM TTsjdf t")
public class TTsjdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tsjdf")
	private Long idTsjdf;

	private String descripcion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_registro")
	private Date fechaRegistro;

	@Column(name="id_materia")
	private int idMateria;

	private char ingreso;

	//bi-directional many-to-one association to TIngreso
	@OneToMany(mappedBy="TTsjdf")
	private List<TIngreso> TIngresos;

	//bi-directional one-to-one association to TInvestigacionMp
	@OneToOne(mappedBy="TTsjdf", fetch=FetchType.LAZY)
	private TInvestigacionMp TInvestigacionMp;

	//bi-directional many-to-one association to TSituacionPersona
	@OneToMany(mappedBy="TTsjdf")
	private List<TSituacionPersona> TSituacionPersonas;

	public TTsjdf() {
	}
	
	public TTsjdf(Long idTsjdf, Date fechaRegistro, int idMateria, char ingreso) {
        this.idTsjdf = idTsjdf;
        this.fechaRegistro = fechaRegistro;
        this.idMateria = idMateria;
        this.ingreso = ingreso;
    }

	public Long getIdTsjdf() {
		return this.idTsjdf;
	}

	public void setIdTsjdf(Long idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public int getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public char getIngreso() {
		return this.ingreso;
	}

	public void setIngreso(char ingreso) {
		this.ingreso = ingreso;
	}

	public List<TIngreso> getTIngresos() {
		return this.TIngresos;
	}

	public void setTIngresos(List<TIngreso> TIngresos) {
		this.TIngresos = TIngresos;
	}

	public TIngreso addTIngreso(TIngreso TIngreso) {
		getTIngresos().add(TIngreso);
		TIngreso.setTTsjdf(this);

		return TIngreso;
	}

	public TIngreso removeTIngreso(TIngreso TIngreso) {
		getTIngresos().remove(TIngreso);
		TIngreso.setTTsjdf(null);

		return TIngreso;
	}

	public TInvestigacionMp getTInvestigacionMp() {
		return this.TInvestigacionMp;
	}

	public void setTInvestigacionMp(TInvestigacionMp TInvestigacionMp) {
		this.TInvestigacionMp = TInvestigacionMp;
	}

	public List<TSituacionPersona> getTSituacionPersonas() {
		return this.TSituacionPersonas;
	}

	public void setTSituacionPersonas(List<TSituacionPersona> TSituacionPersonas) {
		this.TSituacionPersonas = TSituacionPersonas;
	}

	public TSituacionPersona addTSituacionPersona(TSituacionPersona TSituacionPersona) {
		getTSituacionPersonas().add(TSituacionPersona);
		TSituacionPersona.setTTsjdf(this);

		return TSituacionPersona;
	}

	public TSituacionPersona removeTSituacionPersona(TSituacionPersona TSituacionPersona) {
		getTSituacionPersonas().remove(TSituacionPersona);
		TSituacionPersona.setTTsjdf(null);

		return TSituacionPersona;
	}

}
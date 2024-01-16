package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the t_incompetencia database table.
 * 
 */
@Entity
@Table(name="t_incompetencia")
@NamedQuery(name="TIncompetencia.findAll", query="SELECT t FROM TIncompetencia t")
public class TIncompetencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TIncompetenciaPK id;

	@Column(name="acepta_incompetencia")
	private String aceptaIncompetencia;

	@Column(name="id_entidad_federativa")
	private int idEntidadFederativa;

	@Column(name="id_fuero")
	private String idFuero;

	@Column(name="id_materia")
	private int idMateria;

	@Column(name="id_tsjdf_anterior")
	private Long idTsjdfAnterior;

	@Column(name="num_juzgado")
	private int numJuzgado;

	@Column(name="num_partida")
	private String numPartida;

	public TIncompetencia() {
	}

	public TIncompetenciaPK getId() {
		return this.id;
	}

	public void setId(TIncompetenciaPK id) {
		this.id = id;
	}

	public String getAceptaIncompetencia() {
		return this.aceptaIncompetencia;
	}

	public void setAceptaIncompetencia(String aceptaIncompetencia) {
		this.aceptaIncompetencia = aceptaIncompetencia;
	}

	public int getIdEntidadFederativa() {
		return this.idEntidadFederativa;
	}

	public void setIdEntidadFederativa(int idEntidadFederativa) {
		this.idEntidadFederativa = idEntidadFederativa;
	}

	public String getIdFuero() {
		return this.idFuero;
	}

	public void setIdFuero(String idFuero) {
		this.idFuero = idFuero;
	}

	public int getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public Long getIdTsjdfAnterior() {
		return this.idTsjdfAnterior;
	}

	public void setIdTsjdfAnterior(Long idTsjdfAnterior) {
		this.idTsjdfAnterior = idTsjdfAnterior;
	}

	public int getNumJuzgado() {
		return this.numJuzgado;
	}

	public void setNumJuzgado(int numJuzgado) {
		this.numJuzgado = numJuzgado;
	}

	public String getNumPartida() {
		return this.numPartida;
	}

	public void setNumPartida(String numPartida) {
		this.numPartida = numPartida;
	}

}
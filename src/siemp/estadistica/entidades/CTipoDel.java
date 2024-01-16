package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_del database table.
 * 
 */
@Entity
@Table(name="c_tipo_del")
@NamedQuery(name="CTipoDel.findAll", query="SELECT c FROM CTipoDel c")
public class CTipoDel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo_del")
	private String idTipoDel;

	private String alcance;

	private String descripcion;

	private String fundamento;

	//bi-directional many-to-one association to CDesagregado
	@OneToMany(mappedBy="CTipoDel")
	private List<CDesagregado> CDesagregados;

	//bi-directional many-to-one association to CCapitulo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="id_capitulo", referencedColumnName="id_capitulo"),
		@JoinColumn(name="id_titulo", referencedColumnName="id_titulo")
		})
	private CCapitulo CCapitulo;

	public CTipoDel() {
	}

	public String getIdTipoDel() {
		return this.idTipoDel;
	}

	public void setIdTipoDel(String idTipoDel) {
		this.idTipoDel = idTipoDel;
	}

	public String getAlcance() {
		return this.alcance;
	}

	public void setAlcance(String alcance) {
		this.alcance = alcance;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFundamento() {
		return this.fundamento;
	}

	public void setFundamento(String fundamento) {
		this.fundamento = fundamento;
	}

	public List<CDesagregado> getCDesagregados() {
		return this.CDesagregados;
	}

	public void setCDesagregados(List<CDesagregado> CDesagregados) {
		this.CDesagregados = CDesagregados;
	}

	public CDesagregado addCDesagregado(CDesagregado CDesagregado) {
		getCDesagregados().add(CDesagregado);
		CDesagregado.setCTipoDel(this);

		return CDesagregado;
	}

	public CDesagregado removeCDesagregado(CDesagregado CDesagregado) {
		getCDesagregados().remove(CDesagregado);
		CDesagregado.setCTipoDel(null);

		return CDesagregado;
	}

	public CCapitulo getCCapitulo() {
		return this.CCapitulo;
	}

	public void setCCapitulo(CCapitulo CCapitulo) {
		this.CCapitulo = CCapitulo;
	}

}
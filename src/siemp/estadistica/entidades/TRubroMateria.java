package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_rubro_materia database table.
 * 
 */
@Entity
@Table(name="t_rubro_materia")
@NamedQuery(name="TRubroMateria.findAll", query="SELECT t FROM TRubroMateria t")
public class TRubroMateria implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TRubroMateriaPK id;

	private String estatus;

	@Column(name="orden_numerico")
	private int ordenNumerico;

	//bi-directional many-to-one association to CRubro
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_rubro" , insertable=false, updatable=false)
	private CRubro CRubro;

	public TRubroMateria() {
	}

	public TRubroMateriaPK getId() {
		return this.id;
	}

	public void setId(TRubroMateriaPK id) {
		this.id = id;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public int getOrdenNumerico() {
		return this.ordenNumerico;
	}

	public void setOrdenNumerico(int ordenNumerico) {
		this.ordenNumerico = ordenNumerico;
	}

	public CRubro getCRubro() {
		return this.CRubro;
	}

	public void setCRubro(CRubro CRubro) {
		this.CRubro = CRubro;
	}

}
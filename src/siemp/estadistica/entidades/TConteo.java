package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_conteo database table.
 * 
 */
@Entity
@Table(name="t_conteo")
@NamedQuery(name="TConteo.findAll", query="SELECT t FROM TConteo t")
public class TConteo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TConteoPK id;

	private int valor;

	@Column(name="valor_verificado")
	private int valorVerificado;

	//bi-directional many-to-one association to CRubro
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_rubro", insertable=false, updatable=false)
	private CRubro CRubro;

	//bi-directional many-to-one association to TReporteMensual
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_reporte_mensual", insertable=false, updatable=false)
	private TReporteMensual TReporteMensual;

	public TConteo() {
	}

	public TConteoPK getId() {
		return this.id;
	}

	public void setId(TConteoPK id) {
		this.id = id;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getValorVerificado() {
		return this.valorVerificado;
	}

	public void setValorVerificado(int valorVerificado) {
		this.valorVerificado = valorVerificado;
	}

	public CRubro getCRubro() {
		return this.CRubro;
	}

	public void setCRubro(CRubro CRubro) {
		this.CRubro = CRubro;
	}

	public TReporteMensual getTReporteMensual() {
		return this.TReporteMensual;
	}

	public void setTReporteMensual(TReporteMensual TReporteMensual) {
		this.TReporteMensual = TReporteMensual;
	}

}
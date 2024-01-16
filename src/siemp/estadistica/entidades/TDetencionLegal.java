package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_detencion_legal database table.
 * 
 */
@Entity
@Table(name="t_detencion_legal")
@NamedQuery(name="TDetencionLegal.findAll", query="SELECT t FROM TDetencionLegal t")
public class TDetencionLegal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_delito")
	private String idDelito;

	@Column(name="control_detencion")
	private String controlDetencion;

	@Column(name="id_causa_ilegal_detencion")
	private int idCausaIlegalDetencion;

	@Column(name="otra_causa")
	private String otraCausa;

	//bi-directional many-to-one association to TActoProcesal
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_acto_procesal")
	private TActoProcesal TActoProcesal;

	public TDetencionLegal() {
	}

	public String getIdDelito() {
		return this.idDelito;
	}

	public void setIdDelito(String idDelito) {
		this.idDelito = idDelito;
	}

	public String getControlDetencion() {
		return this.controlDetencion;
	}

	public void setControlDetencion(String controlDetencion) {
		this.controlDetencion = controlDetencion;
	}

	public int getIdCausaIlegalDetencion() {
		return this.idCausaIlegalDetencion;
	}

	public void setIdCausaIlegalDetencion(int idCausaIlegalDetencion) {
		this.idCausaIlegalDetencion = idCausaIlegalDetencion;
	}

	public String getOtraCausa() {
		return this.otraCausa;
	}

	public void setOtraCausa(String otraCausa) {
		this.otraCausa = otraCausa;
	}

	public TActoProcesal getTActoProcesal() {
		return this.TActoProcesal;
	}

	public void setTActoProcesal(TActoProcesal TActoProcesal) {
		this.TActoProcesal = TActoProcesal;
	}

}
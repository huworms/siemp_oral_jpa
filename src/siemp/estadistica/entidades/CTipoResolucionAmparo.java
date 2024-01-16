package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_resolucion_amparo database table.
 * 
 */
@Entity
@Table(name="c_tipo_resolucion_amparo")
@NamedQuery(name="CTipoResolucionAmparo.findAll", query="SELECT c FROM CTipoResolucionAmparo c")
public class CTipoResolucionAmparo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_tipo_resolucion_amparo_id")
	private String cnTipoResolucionAmparoId;

	@Column(name="cs_tipo_resolucion_amparo")
	private String csTipoResolucionAmparo;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CTipoResolucionAmparo")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TAmparo
	@OneToMany(mappedBy="CTipoResolucionAmparo")
	private List<TAmparo> TAmparos;

	public CTipoResolucionAmparo() {
	}

	public String getCnTipoResolucionAmparoId() {
		return this.cnTipoResolucionAmparoId;
	}

	public void setCnTipoResolucionAmparoId(String cnTipoResolucionAmparoId) {
		this.cnTipoResolucionAmparoId = cnTipoResolucionAmparoId;
	}

	public String getCsTipoResolucionAmparo() {
		return this.csTipoResolucionAmparo;
	}

	public void setCsTipoResolucionAmparo(String csTipoResolucionAmparo) {
		this.csTipoResolucionAmparo = csTipoResolucionAmparo;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCTipoResolucionAmparo(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCTipoResolucionAmparo(null);

		return COtro;
	}

	public List<TAmparo> getTAmparos() {
		return this.TAmparos;
	}

	public void setTAmparos(List<TAmparo> TAmparos) {
		this.TAmparos = TAmparos;
	}

	public TAmparo addTAmparo(TAmparo TAmparo) {
		getTAmparos().add(TAmparo);
		TAmparo.setCTipoResolucionAmparo(this);

		return TAmparo;
	}

	public TAmparo removeTAmparo(TAmparo TAmparo) {
		getTAmparos().remove(TAmparo);
		TAmparo.setCTipoResolucionAmparo(null);

		return TAmparo;
	}

}
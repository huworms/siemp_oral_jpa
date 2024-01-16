package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_movimiento database table.
 * 
 */
@Entity
@Table(name="c_tipo_movimiento")
@NamedQuery(name="CTipoMovimiento.findAll", query="SELECT c FROM CTipoMovimiento c")
public class CTipoMovimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo_movimiento")
	private int idTipoMovimiento;

	private String descripcion;

	//bi-directional many-to-one association to TBitacoraExpediente
	@OneToMany(mappedBy="CTipoMovimiento")
	private List<TBitacoraExpediente> TBitacoraExpedientes;

	//bi-directional many-to-one association to TBitacoraImputado
	@OneToMany(mappedBy="CTipoMovimiento")
	private List<TBitacoraImputado> TBitacoraImputados;

	public CTipoMovimiento() {
	}

	public int getIdTipoMovimiento() {
		return this.idTipoMovimiento;
	}

	public void setIdTipoMovimiento(int idTipoMovimiento) {
		this.idTipoMovimiento = idTipoMovimiento;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TBitacoraExpediente> getTBitacoraExpedientes() {
		return this.TBitacoraExpedientes;
	}

	public void setTBitacoraExpedientes(List<TBitacoraExpediente> TBitacoraExpedientes) {
		this.TBitacoraExpedientes = TBitacoraExpedientes;
	}

	public TBitacoraExpediente addTBitacoraExpediente(TBitacoraExpediente TBitacoraExpediente) {
		getTBitacoraExpedientes().add(TBitacoraExpediente);
		TBitacoraExpediente.setCTipoMovimiento(this);

		return TBitacoraExpediente;
	}

	public TBitacoraExpediente removeTBitacoraExpediente(TBitacoraExpediente TBitacoraExpediente) {
		getTBitacoraExpedientes().remove(TBitacoraExpediente);
		TBitacoraExpediente.setCTipoMovimiento(null);

		return TBitacoraExpediente;
	}

	public List<TBitacoraImputado> getTBitacoraImputados() {
		return this.TBitacoraImputados;
	}

	public void setTBitacoraImputados(List<TBitacoraImputado> TBitacoraImputados) {
		this.TBitacoraImputados = TBitacoraImputados;
	}

	public TBitacoraImputado addTBitacoraImputado(TBitacoraImputado TBitacoraImputado) {
		getTBitacoraImputados().add(TBitacoraImputado);
		TBitacoraImputado.setCTipoMovimiento(this);

		return TBitacoraImputado;
	}

	public TBitacoraImputado removeTBitacoraImputado(TBitacoraImputado TBitacoraImputado) {
		getTBitacoraImputados().remove(TBitacoraImputado);
		TBitacoraImputado.setCTipoMovimiento(null);

		return TBitacoraImputado;
	}

}
package usmp.com.pe.GastoMetro.Model;

public class Movimiento {
	int IdMovimiento;
	String fecha;
	double monto;
	String IdMoneda;
	int IdPersona;
	int IdPerfil;
	String IdSubCat;
	String descMov;
	Moneda moneda;
	SubCategoria sub_cat;
	String tipCat;
	public int getIdMovimiento() {
		return IdMovimiento;
	}
	public void setIdMovimiento(int idMovimiento) {
		IdMovimiento = idMovimiento;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getIdMoneda() {
		return IdMoneda;
	}
	public void setIdMoneda(String idMoneda) {
		IdMoneda = idMoneda;
	}
	public int getIdPersona() {
		return IdPersona;
	}
	public void setIdPersona(int idPersona) {
		IdPersona = idPersona;
	}
	public int getIdPerfil() {
		return IdPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		IdPerfil = idPerfil;
	}
	public String getIdSubCat() {
		return IdSubCat;
	}
	public void setIdSubCat(String idSubCat) {
		IdSubCat = idSubCat;
	}
	public String getDescMov() {
		return descMov;
	}
	public void setDescMov(String descMov) {
		this.descMov = descMov;
	}
	public Moneda getMoneda() {
		return moneda;
	}
	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}
	public SubCategoria getSub_cat() {
		return sub_cat;
	}
	public void setSub_cat(SubCategoria sub_cat) {
		this.sub_cat = sub_cat;
	}
	public String getTipCat() {
		return tipCat;
	}
	public void setTipCat(String tipCat) {
		this.tipCat = tipCat;
	}
	
}

package usmp.com.pe.GastoMetro.Model;


public class SubCategoria {
	
	String IdSubCat;
	String nomSub;
	String descSub;
	String IdCate;
	int estado;
	
	Categoria cate;
	
	
	
	public String getIdSubCat() {
		return IdSubCat;
	}
	public void setIdSubCat(String idSubCat) {
		IdSubCat = idSubCat;
	}
	public String getNomSub() {
		return nomSub;
	}
	public void setNomSub(String nomSub) {
		this.nomSub = nomSub;
	}
	public String getDescSub() {
		return descSub;
	}
	public void setDescSub(String descSub) {
		this.descSub = descSub;
	}
	public String getIdCate() {
		return IdCate;
	}
	public void setIdCate(String idCate) {
		IdCate = idCate;
	}
	public Categoria getCate() {
		return cate;
	}
	public void setCate(Categoria cate) {
		this.cate = cate;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}

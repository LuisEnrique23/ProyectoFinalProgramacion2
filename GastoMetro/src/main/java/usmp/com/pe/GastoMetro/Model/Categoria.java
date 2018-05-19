package usmp.com.pe.GastoMetro.Model;
public class Categoria {
	
	String IdCate;
	String nomCat;
	String descCat;
	String IdTipCat;
	TipoCategoria tip_cat;
	public String getIdCate() {
		return IdCate;
	}
	public void setIdCate(String idCate) {
		IdCate = idCate;
	}
	public String getNomCat() {
		return nomCat;
	}
	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
	public String getDescCat() {
		return descCat;
	}
	public void setDescCat(String descCat) {
		this.descCat = descCat;
	}
	public String getIdTipCat() {
		return IdTipCat;
	}
	public void setIdTipCat(String idTipCat) {
		IdTipCat = idTipCat;
	}
	public TipoCategoria getTip_cat() {
		return tip_cat;
	}
	public void setTip_cat(TipoCategoria tip_cat) {
		this.tip_cat = tip_cat;
	}
	
}

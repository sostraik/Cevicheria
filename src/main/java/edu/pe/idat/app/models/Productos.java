package edu.pe.idat.app.models;

public class Productos {
	
	private String nombrep;
	private String preciop;
	private String cantidadp;
	
	public Productos() {

	}
	
	public Productos(String nombrep, String preciop, String cantidadp) {
		this.nombrep = nombrep;
		this.preciop = preciop;
		this.cantidadp = cantidadp;
	}

	public String getNombrep() {
		return nombrep;
	}

	public void setNombrep(String nombrep) {
		this.nombrep = nombrep;
	}

	public String getPreciop() {
		return preciop;
	}

	public void setPreciop(String preciop) {
		this.preciop = preciop;
	}

	public String getCantidadp() {
		return cantidadp;
	}

	public void setCantidadp(String cantidadp) {
		this.cantidadp = cantidadp;
	}
	
	

}

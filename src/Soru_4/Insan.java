package Soru_4;

public abstract class Insan {
	private String isim;
	private String soyIsim;

	@Override
	public String toString() {
		return "Insan [isim=" + isim + ", soyIsim=" + soyIsim + "]";
	}

	public Insan(String isim, String soyIsim) {
		this.isim = isim;
		this.soyIsim = soyIsim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyIsim() {
		return soyIsim;
	}

	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
}

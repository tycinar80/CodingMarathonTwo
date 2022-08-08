package Soru_4;

import java.util.UUID;

public class Musteri extends Insan {

	private String id;

	@Override
	public String toString() {
		return "Musteri [id=" + id + ", getIsim()=" + getIsim() + ", getSoyIsim()=" + getSoyIsim() + "]";
	}

	public Musteri(String isim, String soyIsim) {
		super(isim, soyIsim);
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

}

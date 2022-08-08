package Soru_4;

import java.util.UUID;

public class Kasiyer extends Insan {
	private String id;

	@Override
	public String toString() {
		return "Kasiyer [id=" + id + ", getIsim()=" + getIsim() + ", getSoyIsim()=" + getSoyIsim() + "]";
	}

	public Kasiyer(String isim, String soyIsim) {
		super(isim, soyIsim);
		this.id = UUID.randomUUID().toString();
	}

}

package Soru_2;

public class MyArray {
	public float[] sonunaEkle(float[] eskiDizi, float sayi) {
		float[] yeniDizi = new float[eskiDizi.length + 1];
		for (int i = 0; i < eskiDizi.length; i++) {
			yeniDizi[i] = eskiDizi[i];
		}
		yeniDizi[eskiDizi.length] = sayi;
		return yeniDizi;
	}

	/**
	 * index >= 0 durumunda çalýþýr. index dizinin index'inden büyükse sayýyý
	 * dizinin sonuna ekler.
	 * 
	 * @param eskiDizi
	 * @param index
	 * @param sayi
	 * @return
	 */
	public float[] ekle(float[] eskiDizi, int index, float sayi) {
		float[] yeniDizi = new float[eskiDizi.length + 1];
		for (int i = 0; i < eskiDizi.length; i++) {
			if (i == index) {
				yeniDizi[i] = sayi;
			} else if (i > index)
				yeniDizi[i] = eskiDizi[i - 1];
			else
				yeniDizi[i] = eskiDizi[i];
		}
		if (index < eskiDizi.length)
			yeniDizi[eskiDizi.length] = eskiDizi[eskiDizi.length - 1];
		else
			yeniDizi[eskiDizi.length] = sayi;
		return yeniDizi;
	}

	/**
	 * index >= 0 durumunda çalýþýr. index dizinin index'inden büyükse dizinin son
	 * elemanýný siler.
	 * 
	 * @param eskiDizi
	 * @param index
	 * @return
	 */
	public float[] sil(float[] eskiDizi, int index) {
		float[] yeniDizi = new float[eskiDizi.length - 1];
		for (int i = 0; i < yeniDizi.length; i++) {
			if (i >= index) {
				yeniDizi[i] = eskiDizi[i + 1];
			} else
				yeniDizi[i] = eskiDizi[i];
		}
		return yeniDizi;
	}

	public void floatDiziListele(float[] dizi) {
		for (float index : dizi)
			System.out.println(index);
	}
}

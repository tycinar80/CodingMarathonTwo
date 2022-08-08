package Soru_3;

public class CustomStringTr {
	String string;

	public int uzunluk() {
		return string.length();
	}

	public String kirp() {
		return string.trim();
	}

	public boolean ileBaslayan(String kelime) {
		return string.startsWith(kelime);
	}

	public boolean ileBiten(String kelime) {
		return string.endsWith(kelime);
	}

	public char indekstekiKarakteriAl(int index) {
		return string.charAt(index);
	}

	public int indeksNoBul(String kelime) {
		return string.indexOf(kelime);
	}

	public int indeksNoBul(char karakter) {
		return string.indexOf(karakter);
	}

	public int indeksNoBul(char karakter, int indekstenSonra) {
		return string.indexOf(karakter, indekstenSonra);
	}

	public String altString(int baslangicIndeksi) {
		return string.substring(baslangicIndeksi);
	}

	public String altString(int baslangicIndeksi, int bitisIndeksi) {
		return string.substring(baslangicIndeksi, bitisIndeksi);
	}

	public String duzelt(String eski, String yeni) {
		return string.replace(eski, yeni);
	}

	public String duzelt(char eski, char yeni) {
		return string.replace(eski, yeni);
	}

	public boolean varMi(String kelime) {
		return string.contains(kelime);
	}

	public String[] stringiBol(String karakter) {
		return string.split(karakter);
	}

	public String karakterleriBuyut() {
		return string.toUpperCase();
	}

	public String karakterleriKucult() {
		return string.toLowerCase();
	}
}

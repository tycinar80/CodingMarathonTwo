package Soru_1;

import java.util.Scanner;

import Soru_2.MyArray;

public class Aritmetik {
	Scanner scanner = new Scanner(System.in);
	MyArray array;

	public void islem() {
		menu();
		boolean kontrol = true;
		int secim = -1;
		do {
			System.out.print("��lem: ");
			secim = scanner.nextInt();
			scanner.nextLine();
			switch (secim) {
			case 0:
				System.out.println("Programdan ��k�l�yor...");
				kontrol = false;
				break;

			case 1:
				topla(sayiGir());
				kontrol = true;
				break;

			case 2:
				cikar(sayiGir());
				kontrol = true;
				break;

			case 3:
				carp(sayiGir());
				kontrol = true;
				break;

			case 4:
				bol(sayiGir());
				kontrol = true;
				break;

			case 5:
				duzgunCokgenAlanHesapla();
				kontrol = true;
				break;

			default:
				System.out.println("Hatal� i�lem se�imi!");
				kontrol = true;
				break;
			}
		} while (kontrol);
	}

	private void menu() {
		System.out.println("******************");
		System.out.println("Aritmetik ��lemler");
		System.out.println("******************");
		System.out.println();
		System.out.println("0 - ��k��\n" + "1- Toplama ��lemi\n" + "2- ��karma ��lemi\n" + "3- �arpma ��lemi\n"
				+ "4- B�lme ��lemi\n" + "5- D�zg�n �okgen Alan Hesab�\n");
	}

	private float[] sayiGir() {
		float[] sayilar = {};
		array = new MyArray();
		int sayi = 0;
		boolean kontrol = true;
		do {
			try {
				System.out.print("Say� Gir: ");
				sayi = scanner.nextInt();
				scanner.nextLine();
				sayilar = array.sonunaEkle(sayilar, sayi);
				kontrol = kontrol();

			} catch (Exception e) {
				System.out.println("Hatal� de�er girdiniz");
				kontrol = true;
			} finally {
				scanner = new Scanner(System.in);
			}
		} while (kontrol);

		return sayilar;
	}

	private int sayiGir(String islem) {

		int sayi = 0;
		boolean kontrol = true;
		do {
			try {
				System.out.print(islem + ": ");
				sayi = scanner.nextInt();
				scanner.nextLine();
				kontrol = false;

			} catch (Exception e) {
				System.out.println("Hatal� de�er girdiniz");
				kontrol = true;
			} finally {
				scanner = new Scanner(System.in);
			}
		} while (kontrol);
		return sayi;
	}

	private boolean kontrol() {
		String sorgu = "";
		System.out.println("Say� girmek i�in bir tu�a bas�n\n" + "Tamamlamak i�in 'H''ye bas�n");
		System.out.print("Say� girecek misiniz?(E/H): ");
		sorgu = scanner.nextLine();
		if (sorgu.equalsIgnoreCase("H"))
			return false;
		else
			return true;
	}

	private void topla(float[] sayilar) {
		float toplam = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		System.out.println("Toplam = " + toplam);
	}

	private void cikar(float[] sayilar) {
		float toplam = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			toplam -= sayilar[i];
		}
		System.out.println("Fark = " + toplam);
	}

	private void carp(float[] sayilar) {
		float toplam = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			toplam *= sayilar[i];
		}
		System.out.println("�arp�m = " + toplam);
	}

	private void bol(float[] sayilar) {
		float toplam = sayilar[0];
		for (int i = 1; i < sayilar.length; i++) {
			toplam /= sayilar[i];
		}
		System.out.println("B�l�m = " + toplam);
	}

	/**
	 * D�zg�n bir �okgenin kenar say�s� ve kenar uzunlu�una g�re alan�n� hesaplar
	 */
	private void duzgunCokgenAlanHesapla() {
		int kenarsayisi = 0;
		float kenaruzunlugu = 0;
		do {
			kenarsayisi = sayiGir("Kenar Say�s�");
			if (kenarsayisi < 3)
				System.out.println("Kenar say�s� 2'den b�y�k olmal�d�r!");
		} while (kenarsayisi < 3);

		do {
			kenaruzunlugu = sayiGir("Kenar Uzunlu�u(cm)");
			if (kenaruzunlugu <= 0)
				System.out.println("Kenar uzunlu�u 0'dan b�y�k olmal�d�r.");
		} while (kenaruzunlugu <= 0);
		float alan = (float) (Math.pow(kenaruzunlugu, 2) * kenarsayisi)
				/ (float) (4 * Math.tan((Math.PI) / kenarsayisi));
		System.out.println(kenarsayisi + " kenarl� d�zg�n �okgenin alan� = " + alan);
	}
}

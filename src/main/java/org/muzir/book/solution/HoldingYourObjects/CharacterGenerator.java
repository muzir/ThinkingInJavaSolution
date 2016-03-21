package org.muzir.book.solution.HoldingYourObjects;

import java.security.SecureRandom;

/**
 * @author erhun.baycelik
 *
 */
public class CharacterGenerator {
	String[] characters = { "Kemal Sunal - Şaban / Sahte Tosun Paşa", "Müjde Ar - Leyla", "Şener Şen - Lütfü",
			"Adile Naşit - Adile", "Ayşen Gruda - Zekiye", "Bilge Zobu - Merasim Kıtası Kumandanı",
			"Günfer Feray - Tellioğullarının kızı", "Zihni Göktay - Ruhi", "Ergin Orbey - Vehbi",
			"Oktar Durukan - Hakiki Tosun Paşa", "Akil Öztuna - Akil (Tellioğullarının Babası)",
			"İhsan Bilsev - Mülayim", "Tuncay Gürel - Bekir", "Oya Aydonat - Tellioğullarının kızı",
			"Filiz Toprak - Tellioğullarının kızı", "Sıtkı Akçatepe - Sıtkı (Seferoğullarının Babası)",
			"Hikmet Gül - Rukiye", "Cevdet Arıkan - Suphi  ", "Tevfik Şen - Seferoğlu ", "Ata Saka - Seferoğlu",
			"Mete Sezer - Daver Bey", "Yasemin Esmergül - Dadı", "Arap Celal - Çığırtkan ", "Akif Kilman - Seferoğlu",
			"Ayten Erman - Seferoğlu", "Nevin Güler - Seferoğlu" };

	public String next() {
		SecureRandom r = new SecureRandom();
		int i = r.nextInt(characters.length);
		return characters[i];
	}
}

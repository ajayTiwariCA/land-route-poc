package com.rout.routing.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rout.routing.model.Countries;
import com.rout.routing.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Override
	public List<Countries> getListCountry() {

		Countries c1 = new Countries();
		c1.setName("Aruba");
		c1.setCca3("ABW");
		c1.setRegion("Americas");

		Countries c2 = new Countries();
		c2.setName("Afghanistan");
		c2.setCca3("AFG");
		c2.setRegion("Asia");
		ArrayList<String> afghanistanBorders = new ArrayList<>();
		afghanistanBorders.add("IRN");
		afghanistanBorders.add("PAK");
		afghanistanBorders.add("TKM");
		afghanistanBorders.add("UZB");
		afghanistanBorders.add("TJK");
		afghanistanBorders.add("CHN");
		c2.setBorders(afghanistanBorders);

		Countries c22 = new Countries();
		c22.setName("Pakistan");
		c22.setCca3("PAK");
		c22.setRegion("Asia");
		ArrayList<String> pakistanBorders = new ArrayList<>();
		pakistanBorders.add("IRN");
		pakistanBorders.add("AFG");
		pakistanBorders.add("TKM");
		pakistanBorders.add("UZB");
		pakistanBorders.add("TJK");
		pakistanBorders.add("CHN");
		c22.setBorders(pakistanBorders);

		Countries c3 = new Countries();
		c3.setName("Angola");
		c3.setCca3("AGO");
		c3.setRegion("Africa");
		ArrayList<String> angolaBorders = new ArrayList<>();
		angolaBorders.add("COG");
		angolaBorders.add("COD");
		angolaBorders.add("ZMB");
		angolaBorders.add("NAM");
		c3.setBorders(angolaBorders);
		Countries c4 = new Countries();
		c4.setName("Anguilla");
		c4.setCca3("AIA");
		c4.setRegion("Americas");

		Countries c5 = new Countries();
		c5.setName("\\u00c5land Islands");
		c5.setCca3("ALA");
		c5.setRegion("Europe");

		Countries c6 = new Countries();
		c6.setName("Albania");
		c6.setCca3("ALB");
		c6.setRegion("Europe");
		ArrayList<String> albaniaBorders = new ArrayList<>();
		albaniaBorders.add("MNE");
		albaniaBorders.add("GRC");
		albaniaBorders.add("MKD");
		albaniaBorders.add("UNK");
		c6.setBorders(albaniaBorders);
		Countries c7 = new Countries();
		c7.setName("Andorra");
		c7.setCca3("AND");
		c7.setRegion("Europe");
		ArrayList<String> andoraBorders = new ArrayList<>();
		andoraBorders.add("FRA");
		andoraBorders.add("ESP");
		c7.setBorders(andoraBorders);

		Countries c8 = new Countries();
		c8.setName("United Arab Emirates");
		c8.setCca3("UAE");
		c8.setRegion("Asia");
		ArrayList<String> uaeBorders = new ArrayList<>();
		uaeBorders.add("OMN");
		uaeBorders.add("SAU");
		c8.setBorders(uaeBorders);
		Countries c9 = new Countries();
		c9.setName("Argentina");
		c9.setCca3("ARG");
		c9.setRegion("Americas");
		ArrayList<String> argBorders = new ArrayList<>();
		argBorders.add("BOL");
		argBorders.add("BRA");
		argBorders.add("CHL");
		argBorders.add("PRY");
		argBorders.add("URY");
		c9.setBorders(argBorders);
		Countries c10 = new Countries();
		c10.setName("Armenia");
		c10.setCca3("ARM");
		c10.setRegion("Asia");
		ArrayList<String> armBorders = new ArrayList<>();
		armBorders.add("AZE");
		armBorders.add("GEO");
		armBorders.add("IRN");
		armBorders.add("TUR");
		c10.setBorders(armBorders);
		Countries c11 = new Countries();
		c11.setName("American Samoa");
		c11.setCca3("ASM");
		c11.setRegion("Oceania");

		Countries c12 = new Countries();
		c12.setName("Azerbaijan");
		c12.setCca3("AZE");
		c12.setRegion("Asia");
		ArrayList<String> azeBorders = new ArrayList<>();
		azeBorders.add("ARM");
		azeBorders.add("GEO");
		azeBorders.add("IRN");
		azeBorders.add("RUS");
		azeBorders.add("TUR");
		c12.setBorders(azeBorders);
		Countries c13 = new Countries();
		c13.setName("Burundi");
		c13.setCca3("BDI");
		c13.setRegion("Africa");
		ArrayList<String> bdiBorders = new ArrayList<>();
		bdiBorders.add("COD");
		bdiBorders.add("RWA");
		bdiBorders.add("TZA");
		c13.setBorders(bdiBorders);
		Countries c14 = new Countries();
		c14.setName("Belgium");
		c14.setCca3("BEL");
		c14.setRegion("Europe");
		ArrayList<String> belBorders = new ArrayList<>();
		belBorders.add("FRA");
		belBorders.add("DEU");
		belBorders.add("LUX");
		belBorders.add("NLD");
		c14.setBorders(belBorders);
		Countries c15 = new Countries();
		c15.setName("Benin");
		c15.setCca3("BEN");
		c15.setRegion("Africa");
		ArrayList<String> benBorders = new ArrayList<>();
		benBorders.add("BFA");
		benBorders.add("NER");
		benBorders.add("NGA");
		benBorders.add("TGO");
		c15.setBorders(benBorders);
		Countries c16 = new Countries();
		c16.setName("Burkina Faso");
		c16.setCca3("BFA");
		c16.setRegion("Africa");
		ArrayList<String> bfaBorders = new ArrayList<>();
		bfaBorders.add("CIV");
		bfaBorders.add("BEN");
		bfaBorders.add("GHA");
		bfaBorders.add("MLI");
		bfaBorders.add("NER");
		bfaBorders.add("TGO");
		c16.setBorders(bfaBorders);

		Countries c161 = new Countries();
		c161.setName("Czechia");
		c161.setCca3("CZE");
		c161.setRegion("Europe");
		ArrayList<String> bfaBorders1 = new ArrayList<>();
		bfaBorders1.add("AUT");
		bfaBorders1.add("DEU");
		bfaBorders1.add("POL");
		bfaBorders1.add("SVK");
		c161.setBorders(bfaBorders1);

		Countries c162 = new Countries();
		c162.setName("Austria");
		c162.setCca3("AUT");
		c162.setRegion("Europe");
		ArrayList<String> bfaBorders2 = new ArrayList<>();
		bfaBorders2.add("CZE");
		bfaBorders2.add("DEU");
		bfaBorders2.add("HUN");
		bfaBorders2.add("ITA");
		bfaBorders2.add("LIE");
		bfaBorders2.add("SVK");
		bfaBorders2.add("SVN");
		bfaBorders2.add("CHE");
		c162.setBorders(bfaBorders2);

		Countries c163 = new Countries();
		c163.setName("Italy");
		c163.setCca3("ITA");
		c163.setRegion("Europe");
		ArrayList<String> bfaBorders3 = new ArrayList<>();
		bfaBorders3.add("AUT");
		bfaBorders3.add("FRA");
		bfaBorders3.add("SMR");
		bfaBorders3.add("SVN");
		bfaBorders3.add("CHE");
		bfaBorders3.add("VAT");
		c163.setBorders(bfaBorders3);

		List<Countries> countryList = new ArrayList<>();
		countryList.add(c1);
		countryList.add(c2);
		countryList.add(c3);
		countryList.add(c4);
		countryList.add(c5);
		countryList.add(c6);
		countryList.add(c7);
		countryList.add(c8);
		countryList.add(c9);
		countryList.add(c10);
		countryList.add(c11);
		countryList.add(c12);
		countryList.add(c13);
		countryList.add(c14);
		countryList.add(c15);
		countryList.add(c16);
		countryList.add(c22);
		countryList.add(c161);
		countryList.add(c162);
		countryList.add(c163);
		return countryList;

	}

}

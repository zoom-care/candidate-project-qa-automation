package me.matiasormazabal.testing.api;

import java.util.ArrayList;
import java.util.List;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

import me.matiasormazabal.testing.util.Constants;

public class CitiesService {

	public static List<String> getCities() {
		try {
			List<String> cities = new ArrayList<String>();
			HttpResponse<JsonNode> response = Unirest.get(Constants.CITIES_JSON).asJson();
			for (int x = 0; x < response.getBody().getArray().length(); x++) {
				cities.add(response.getBody().getArray().getJSONObject(x).getString("displayName"));
			}
			return cities;
		}catch(Exception er){
			return null;
		}
	}
}

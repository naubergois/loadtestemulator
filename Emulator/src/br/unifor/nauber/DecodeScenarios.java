package br.unifor.nauber;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DecodeScenarios {

	public static HashMap<String, List<Scenarios>> getScenarios() throws IOException {
		GetPropertyValues property = new GetPropertyValues();
		String scenariosString = property.getScenarios();
		String usersString = property.getUsers();
		String responseTimeString = property.geResponseTime();

		HashMap<String, List<Scenarios>> scenariosMap = new HashMap<String, List<Scenarios>>();

		String[] scenarios = scenariosString.split("|");
		String[] users = usersString.split("|");
		String[] responseTime = responseTimeString.split("|");

		int length = scenarios.length;

		for (int i = 0; i < length; i++) {
			Scenarios scenario = new Scenarios();
			scenario.setName(scenarios[i]);
			scenario.setResponseTime(Integer.valueOf(responseTime[i]));
			scenario.setUsers(Integer.valueOf(users[i]));

			if (scenariosMap.containsKey(scenario.getName())) {
				List<Scenarios> list = scenariosMap.get(scenario.getName());
				list.add(scenario);
			} else {

				List<Scenarios> scenariosList = new ArrayList<Scenarios>();
				scenariosList.add(scenario);
				scenariosMap.put(scenario.getName(), scenariosList);

			}

		}

		return scenariosMap;

	}

}

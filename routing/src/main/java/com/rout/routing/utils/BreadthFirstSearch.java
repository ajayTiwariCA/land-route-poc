package com.rout.routing.utils;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

import com.rout.routing.exceptions.NoPathException;
import com.rout.routing.model.Countries;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BreadthFirstSearch {
	private final Map<String, Countries> countries;
	private final Countries origin;
	private final Countries destination;

	private final Map<Countries, Boolean> visited = new HashMap<>();
	private final Map<Countries, Countries> previous = new HashMap<>();

	public final List<String> getLandRoutePath() {
		var currentCountry = origin;

		Queue<Countries> pivot = new ArrayDeque<>();
		pivot.add(currentCountry);

		visited.put(currentCountry, true);

		OUTER: while (!pivot.isEmpty()) {
			currentCountry = pivot.remove();

			if (currentCountry.equals(destination)) {

				break;
			} else {
				for (var neighbour : currentCountry.getBorders()) {
					var neighbourCountry = countries.get(neighbour);

					if (neighbourCountry != null && !visited.containsKey(neighbourCountry)) {

						pivot.add(neighbourCountry);
						visited.put(neighbourCountry, true);
						previous.put(neighbourCountry, currentCountry);
						if (neighbourCountry.equals(destination)) {

							currentCountry = neighbourCountry;
							break OUTER;
						}
					}

				}
			}
		}

		return getCountryList(currentCountry);
	}

	private List<String> getCountryList(Countries currentCountry) {
		if (!currentCountry.equals(destination)) {
			throw new NoPathException("Cannot reach the path");
		}

		List<Countries> path = new ArrayList<>();
		for (Countries node = destination; node != null; node = previous.get(node)) {
			path.add(node);
		}

		return path.stream().map(Countries::getCca3).collect(

				Collectors.collectingAndThen(Collectors.toList(), list -> {
					Collections.reverse(list);
					return list;
				}));
	}
}

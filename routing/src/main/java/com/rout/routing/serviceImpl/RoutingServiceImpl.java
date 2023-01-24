package com.rout.routing.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rout.routing.exceptions.NoPathException;
import com.rout.routing.model.Countries;
import com.rout.routing.service.CountryService;
import com.rout.routing.service.RoutingService;
import com.rout.routing.utils.BreadthFirstSearch;

@Service
public class RoutingServiceImpl implements RoutingService {
	@Autowired
	private CountryService countryService;

	@Override
	public List<String> route(String origin, String destination) {

		var countries = countryService.getListCountry().stream()
				.collect(Collectors.toMap(Countries::getCca3, Function.identity()));

		var originCountry = Optional.ofNullable(countries.get(origin))
				.orElseThrow(() -> new NoPathException(String.format("Unknown origin country %s", origin)));

		var destinationCountry = Optional.ofNullable(countries.get(destination))
				.orElseThrow(() -> new NoPathException(String.format("Unknown destination country %s", destination)));

		if (!origin.equals(destination)) {
			if (originCountry.getBorders().isEmpty()) {
				throw new NoPathException(String.format("Origin %s is isolated", origin));
			}

			if (destinationCountry.getBorders().isEmpty()) {
				throw new NoPathException(String.format("Destination %s is isolated", destination));
			}
		}

		return new BreadthFirstSearch(countries, originCountry, destinationCountry).getLandRoutePath();

	}

}

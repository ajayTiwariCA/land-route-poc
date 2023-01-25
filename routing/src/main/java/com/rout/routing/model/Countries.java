package com.rout.routing.model;

import java.util.List;
import java.util.Objects;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
public class Countries {
	private String name;
	private String cca3;
	private String region;
	private List<String> borders;

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Countries)) {
			return false;
		}
		final Countries country = (Countries) o;
		return Objects.equals(getCca3(), country.getCca3());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getCca3());
	}



}

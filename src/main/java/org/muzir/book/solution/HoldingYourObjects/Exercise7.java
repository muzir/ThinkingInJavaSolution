package org.muzir.book.solution.HoldingYourObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Pokemon {
	private String id;
	private String name;

	Pokemon(String _id, String _name) {
		id = _id;
		name = _name;
	}

	static Pokemon[] createPokemonArray(int size) {
		Pokemon[] p = new Pokemon[size];
		for (int i = 0; i < size; i++) {
			p[i] = new Pokemon(String.valueOf(i), "Pikacu " + i);
		}
		return p;
	}

	static List<Pokemon> createPokemanList(int size) {
		List<Pokemon> pokemons = new ArrayList<>();
		Collections.addAll(pokemons, createPokemonArray(size));
		return pokemons;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", name=" + name + "] \n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class Exercise7 {
	public static void main(String[] args) {
		List<Pokemon> pokemons = Pokemon.createPokemanList(10);
		System.out.println("Initial Pokemon List:" + pokemons.toString());
		List<Pokemon> subPokemonList = pokemons.subList(1, 5);
		List<Pokemon> trivialList = new ArrayList<>();
		trivialList.add(new Pokemon("1", "Pikacu " + 1));
		trivialList.add(new Pokemon("2", "Pikacu " + 2));
		trivialList.add(new Pokemon("3", "Pikacu " + 3));
		// System.out.println("SubList Pokemons:" + subPokemonList);
		System.out.println("TrivialList Pokemons:" + trivialList);
		System.out.println("Before Remove Pokemons:" + pokemons.toString());
		// pokemons.removeAll(subPokemonList);
		pokemons.removeAll(trivialList);
		System.out.println("After Remove Pokemons:" + pokemons.toString());
	}
}

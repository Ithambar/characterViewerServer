package moe.character_viewer.models;

import java.util.List;

import lombok.Data;

/**
 * CharacterList
 */
@Data
public class CharacterList {

	private int _id;
	private List<Character> characters;
}
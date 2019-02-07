package com.megabait.entities;

public enum EventType {
	GAMES("Games"), MUSIC("Music");
	private final String name;

	private EventType(String name) {
		this.name = name;
	}
}

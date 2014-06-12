package com.demo.iterator.songs;

public class Song {
	
	String songName;
	String songCreator;
	
	public Song(String songName,String songCreator) {
		this.songName = songName;
		this.songCreator = songCreator;
	}

	public String getSongName() {
		return songName;
	}

	public String getSongCreator() {
		return songCreator;
	}
	
}

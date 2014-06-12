package com.demo.iterator.client;

import com.demo.iterator.aggregates.CollectionInterface;
import com.demo.iterator.aggregates.SongCollection;
import com.demo.iterator.iterators.IteratorInterface;
import com.demo.iterator.songs.Song;

public class MusicPlayer {

	public static void main(String[] args) {
		
		Song song1 = new Song("Dare", "Shakira");
		Song song2 = new Song("Love Story", "Taylor Swift");
		Song song3 = new Song("Diamonds", "Rihanna");
		
		CollectionInterface<Song> songsList =new SongCollection<Song>();
		songsList.add(song1);
		songsList.add(song2);
		songsList.add(song3);
		Song songObj;
		IteratorInterface<Song> iterator = songsList.iterator();
		while(iterator.hasNext()){
			songObj = iterator.next();
			System.out.println(songObj.getSongName() +" written and sung by "+ songObj.getSongCreator());
		}
	}

}

package hust.soict.dsai.aims.media;

import java.util.*;

public class CompactDisc extends Disc implements Playable{
	
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		super();
	}
	public CompactDisc(String title) {
		super(title);
	}
	public CompactDisc(String title,String category,String director,int length,String artist,float cost) {
		super(title, category, director, length, cost);
		this.artist = artist;
	}
	public CompactDisc(String title,String category,String director,int length,float cost) {
		super(title, category, director, length, cost);
	}
	public void addTrack(Track track) {
		boolean in = false;
		for(Track track1:tracks) {
			if(track1.getTitle().equals(track.getTitle())) {
				System.out.printf("%s already in tracks\n",track1.getTitle());
				in = true;
			}
		}
		if(in == false) {
			tracks.add(track);
			System.out.printf("%s has been in tracks\n",track.getTitle());
		}
	}
	public void removeTrack(Track track) {
		boolean isRemove = tracks.remove(track);
		if(isRemove ==  false) {
			System.out.printf("%s not in tracks\n", track.getTitle());
		}
		else {
			System.out.printf("%s has been remove", track.getTitle());
		}	
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public ArrayList<Track> getTracks() {
		return tracks;
	}
	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}
	public int getLength() {
		int lengthTrack = 0;
		for(Track track3:tracks) {
			lengthTrack += track3.getLength();
		}
		return lengthTrack;
	}
	public void play() {
		for(Track track4: tracks) {
			track4.play();
		}
	}
}
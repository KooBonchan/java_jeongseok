package ch12;

import java.util.ArrayList;
import java.util.List;

class Vocal { public String toString() { return "Vocal"; } }
class Guitar implements Session
{ public String toString() { return "Guitar";} }
class Bass implements Rhythm
{ public String toString() { return "Bass"; }  }
class Drum implements Rhythm 
{ public String toString() { return "Drum"; }  }

interface Session{}
interface Rhythm extends Session{}

public class GenericBox {
	public static void main(String[] args) {
		Box<Vocal>  vocals  = new Box<>();
		Box<Guitar> guitars = new Box<>();
		Box<Bass>   basses  = new Box<>();
		Box<Drum>   drums   = new Box<>();
		
		// Band Recruit Simulator
		vocals .add(new Vocal ());
		vocals .add(new Vocal ());
		guitars.add(new Guitar());
		guitars.add(new Guitar());
		drums  .add(new Drum  ());
		vocals .add(new Vocal ());
		vocals .add(new Vocal ());
		vocals .add(new Vocal ());
		
		System.out.println(vocals );
		System.out.println(guitars);
		System.out.println(basses );
		System.out.println(drums  );
	}
}

class Box<T>{
	private List<T> list = new ArrayList<>();
	void add(T item) {list.add(item); }
	T get(int i) {
		if(list.size() < i) throw new IndexOutOfBoundsException();
		return list.get(i);
	}
	int size() {return list.size(); }
	public String toString() {return list.toString(); }
}

class SessionBox<T extends Session> extends Box<T>{
	@Override
	public String toString() {
		return "Session: " + super.toString();
	}
}
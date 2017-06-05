package project3;

import java.util.Random;
import java.util.Vector;

public class Set extends Vector{
	private Vector<Integer> v;
	private Random r;

	public Set(){
		v = new Vector<Integer>();
		r = new Random();
	}

	public boolean subset(Set other){
		boolean found = false;
		for(int i=0; i<other.size(); i++){
			found = this.member((int)other.elementAt(i));
			if(!found){
				return false;
			}
		}
		return true;
	}

	public Set union(Set other){
		Set result = (Set)clone();
		for(int i=0; i< other.size(); i++){
			if(!result.member((int)other.elementAt(i))){
				result.add(other.elementAt(i));
			}
		}
		return result;
	}

	public Set intersection(Set other){
		Set result = (Set)clone();
		Set common = new Set();
		for(int i=0; i< other.size(); i++){
			if(this.member((int)other.elementAt(i))){
				common.add(other.elementAt(i));
			}
		}
		return common;
	}

	public boolean member(int a){
		boolean found = false;
		int i=0;
		while(!found && i<this.size()){
			if ((int)this.elementAt(i) == a){
				found = true;
				break;
			}
			i++;
		}
		return found;
	}

	public void makeSet(){
		//This method is complete. Do not change it.
		int n = r.nextInt(11) + 10;
		int i = 1;
		this.add(new Integer(r.nextInt(20)));
		while(i <= n){
			int x = r.nextInt(20);
			if(!this.contains(x)){
				this.addElement(x);
				i++;
			}
		}
	}
}
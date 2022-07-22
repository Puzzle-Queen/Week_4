package MyPackage;

import java.util.ArrayList;

public class MyArrayList<T> implements IMyList<T>{
	
	ArrayList<T> arrayList = new ArrayList<T>();

	///// //////////////////////////////////////
	public void add(T val) {
		// TODO Auto-generated method stub
		this.arrayList.add(val);
	}

	///// //////////////////////////////////////
	public void remove(T val) {
		// TODO Auto-generated method stub
		this.arrayList.remove(val);
	}
	
	///// //////////////////////////////////////
	public int size() {
		// TODO Auto-generated method stub
		return this.arrayList.size();
	}
	
	public ArrayList get() {
		// TODO Auto-generated method stub
		return this.arrayList;
	}
	

	@Override
	public String toString() {
		return "MyArrayList [arrayList=" + arrayList + "]";
	}

	
	
	
	
}

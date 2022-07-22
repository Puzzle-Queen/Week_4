package MyPackage;

public class Week_04_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<String> arrayList = new MyArrayList<String>();
		arrayList.add("Duck");
		arrayList.add("Cat");
		arrayList.add("Squirrel");
		arrayList.add("Fen");
		System.out.println(arrayList.get());
		
		arrayList.remove("Cat");
		System.out.println(arrayList.get());
		
		System.out.println("The size of the arrayList is " + arrayList.size() + ".");

	}

}

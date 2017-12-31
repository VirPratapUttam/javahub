package com.corejava.generics;

class Pairs<K, V> {

    private K key;
    private V value;

    public Pairs(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }
}

public class Util {
	public static void main(String[] args) {
		Pairs<Integer,String> p1=new Pairs(1,"Vir");
		Pairs<Integer,String> p2=new Pairs(2,"Vir");
		boolean same=compare(p1,p2);
		System.out.println(same);
	}
	public static <K,V> boolean compare(Pairs<K,V> p1,Pairs<K,V> p2)
	{
		return p1.getKey().equals(p2.getKey())&&p1.getValue().equals(p2.getValue());
	}

}

package com.security.md5;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Md5Impl {

	public static void main(String[] args) throws NoSuchAlgorithmException {

		List<Emp> l3 = new ArrayList<>();
		List<Emp> l4 = new ArrayList<>();
		l3.add(new Emp(1, "Vir"));
		l3.add(new Emp(2, "Manish"));

		l4.add(new Emp(2, "Manish"));
		l4.add(new Emp(1, "Vir"));

	/*	Collections.sort(l3, new Comparator<Emp>() {
			@Override
			public int compare(Emp e1, Emp e2) {
				return e1.getId() - e2.getId();
			}
		});

		Collections.sort(l4, new Comparator<Emp>() {
			@Override
			public int compare(Emp e1, Emp e2) {
				return e1.getId() - e2.getId();
			}
		});*/
		Emp  e3=new Emp(3,"Ravi");
		e3.getName().hashCode();
		System.out.println(l3.hashCode());
		System.out.println(l4.hashCode());

		for (Emp e1 : l3) {
			System.out.println(e1.getId() + " - " + e1.getName());
		}
		for (Emp e1 : l4) {
			System.out.println(e1.getId() + " - " + e1.getName());
		}
		System.out.println("Two List Equal? " + l3.equals(l4));

		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);

		List<Integer> l2 = new ArrayList<>();
		;
		l2.add(1);
		l2.add(3);
		l2.add(2);

		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		s1.addAll(l1);
		s2.addAll(l2);

		System.out.println(s1.equals(s2));

		ByteBuffer buf = ByteBuffer.allocate(4 * l1.size());
		buf.order(ByteOrder.BIG_ENDIAN);
		for (int i = 0; i < l1.size(); ++i)
			buf.putInt(l1.get(i));
		byte[] barr = buf.array();

		MessageDigest m = MessageDigest.getInstance("MD5");
		m.reset();
		m.update(barr);

		byte[] digest = m.digest();
		BigInteger bigInt = new BigInteger(1, digest);
		String hashtext = bigInt.toString(16);
		// Now we need to zero pad it if you actually want the full 32 chars.
		while (hashtext.length() < 32) {
			hashtext = "0" + hashtext;
		}
		System.out.println(hashtext);

		ByteBuffer buf1 = ByteBuffer.allocate(4 * l2.size());
		buf1.order(ByteOrder.BIG_ENDIAN);
		for (int i = 0; i < l2.size(); ++i)
			buf1.putInt(l2.get(i));
		byte[] barr1 = buf1.array();

		MessageDigest m1 = MessageDigest.getInstance("MD5");
		m1.reset();
		m1.update(barr1);

		byte[] digest1 = m1.digest();
		BigInteger bigInt1 = new BigInteger(1, digest1);
		String hashtext1 = bigInt.toString(16);
		// Now we need to zero pad it if you actually want the full 32 chars.
		while (hashtext1.length() < 32) {
			hashtext1 = "0" + hashtext1;
		}
		System.out.println(hashtext1);

	}

}

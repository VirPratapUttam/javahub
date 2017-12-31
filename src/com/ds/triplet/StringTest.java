package com.ds.triplet;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringTest {

    static String super_reduced_string(String s){
        // Complete this function
        char[] c=s.toCharArray();
      //  Set<Character> set=new TreeSet<>();
        BigInteger b;
        b.longValue()
       
      Map<Character,Integer> hm=new HashMap<>();
       
        for(int i=0;i<c.length;i++)
        {
        	 int count=0;
           // set.add(c[i]);
            if(hm.containsKey(c[i]))
            {
                count=hm.get(c[i]);
                if(count==1)
                {
                   hm.remove(c[i]);
                }else
                {
                 count++;
                    hm.put(c[i],count);
                }
            }
            else
            {
                count++;
                    hm.put(c[i],count);
            }
        }
        Set set=hm.keySet();
        Iterator itr=set.iterator();
        StringBuilder sb=new StringBuilder();
        while(itr.hasNext())
       {
            sb.append(itr.next());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}

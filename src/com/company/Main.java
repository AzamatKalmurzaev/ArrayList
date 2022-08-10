package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {




       ArrayList<Integer> arrayList = new ArrayList<>();
       Random random = new Random();
       for (int i = 0; i < 50; i++){
          arrayList.add(random.nextInt(100));

       }
       //System.out.println(arrayList);
       ArrayList<Integer> arayListCh = new ArrayList<>();
       ArrayList<Integer> arayListN = new ArrayList<>();
       for (Integer integer:arrayList )
       if (integer %2 ==0){
          arayListCh.add(integer);
          }else {
          arayListN.add(integer);
       }
       System.out.println(arayListCh);
       System.out.println(arayListN);

       }
    }








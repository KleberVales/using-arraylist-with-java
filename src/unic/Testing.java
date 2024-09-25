package unic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Testing {

public static void main(String[] args) {
	
    Scanner read = new Scanner(System.in);
    int times = read.nextInt();
    Map<Integer,List<Integer>> lista = new HashMap<>();
    
    for (int i = 0; i < times; i++) {
        int timesToCicle = read.nextInt();
        List<Integer> temp = new ArrayList<>();
        lista.put(i+1, temp);
        for (int j = timesToCicle; j > 0; j--) {
            lista.get(i+1).add(read.nextInt());
        }
    }

    int timesToFind = read.nextInt();
    for (int i = 0; i < timesToFind; i++) {
        int key = read.nextInt();
        int value = read.nextInt();

        if(!lista.containsKey(key)){
            System.out.println("ERROR!");
        }else{
            if(lista.get(key).size() < value){
                 System.out.println("ERROR!");
            }else{
                System.out.println(lista.get(key).get(value-1));   
            }
        }
    }

    read.close();
}
}

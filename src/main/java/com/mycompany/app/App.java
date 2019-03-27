package com.mycompany.app;

import org.openjdk.jol.info.GraphLayout;
import org.openjdk.jol.vm.VM;

import java.util.Map;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
      Map<Object, Object> map = new HashMap<>();

      System.out.println(GraphLayout.parseInstance(map).toFootprint());

      String a = new String("a");
      String b = new String("b");

      map.put(a, b);

      System.out.println(GraphLayout.parseInstance(map).toFootprint());

      System.out.println(GraphLayout.parseInstance(a).toFootprint());
      System.out.println(GraphLayout.parseInstance(b).toFootprint());

      Map<Object, Object> map2 = new ArrayMap<>();

      System.out.println(GraphLayout.parseInstance(map2).toFootprint());
    }
}

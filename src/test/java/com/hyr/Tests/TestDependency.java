package com.hyr.Tests;

import org.testng.annotations.Test;

public class TestDependency {

	 @Test
     public void c() {
           System.out.println("c");
     }

     @Test
     public void t() {
           System.out.println("t");
     }
    
     @Test
     public void s() {
           System.out.println("s");
     }

     @Test(dependsOnMethods = "c")
     public void b() {
           System.out.println("b");
     }

     @Test
     public void a() {
           System.out.println("a");
     }
   
     @Test(dependsOnMethods = "y")
     public void x() {
          System.out.println("x");
     }   

     @Test
     public void y() {
           System.out.println("y");
     }
    
     @Test
     public void d() {
           System.out.println("d");
     }
}

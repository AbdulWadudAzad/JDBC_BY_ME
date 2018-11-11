
package com.coderBD;

public class TestStudent {
    public static void main(String[] args) {
//        StudentServices.tableCreate();
Students s= new Students();
s.setName("Wadud");
s.setEmail("wadudmiu37@gmail.com");
StudentServices.insert(s);

    }
 
}

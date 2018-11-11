
package com.coderBD.Test;

import com.coderBD.Category.CategoryService;
import com.coderBD.Domain.Category;


public class CategoryTest {
    public static void main(String[] args) {
    // CategoryService.createTable();
      Category c=new Category();
        c.setName("Computer");
        CategoryService.insert(c);
        
    }
  
}

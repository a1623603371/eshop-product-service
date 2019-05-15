package com.roncoo.eshop.product.web.controller;

import com.roncoo.eshop.product.model.Category;
import com.roncoo.eshop.product.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;
    @RequestMapping("/add")
    public String add(Category category,String operationType){
        try {
            categoryService.add(category,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "success";
    }
    @RequestMapping("/update")
    public String update(Category category,String operationType){
        try {
            categoryService.update(category,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "success";

    }
    @RequestMapping("/delete")
    public String delete(Category category,String operationType){
        try {
            categoryService.update(category,operationType);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "success";

    }
    @RequestMapping("/findById")
    public Category findByid(Long id){

        try {
   return     categoryService.findById(id);
        }catch (Exception e){
           e.printStackTrace();
        }
return  new Category();
    }
}

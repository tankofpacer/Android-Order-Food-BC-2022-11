package com.example.Android_bigWork.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.Android_bigWork.Entity.Dish;

import java.util.ArrayList;
import java.util.List;

@Dao //Dao的声明
public interface DishDao {
    @Query("SELECT * FROM dish_table")
    List<Dish> getAll();

    @Insert
    void insert(Dish Dish);

    @Delete
    void delete(Dish Dish);

    /**
     * 返回菜品信息
     *
     * @param name 菜品名
     * @return Query
     * @Author tankofpacer
     * @commit
     */
    @Query("SELECT * FROM dish_table WHERE name = :name")
    Dish getDishByName(String name);

    /**
     * 返回该分类下所有菜品信息
     *
     * @param category 菜品分类
     * @return Query
     * @Author tankofpacer
     * @commit
     */
    @Query("SELECT * FROM dish_table WHERE category = :category")
    ArrayList<Dish> getDishByCategory(String category);
}

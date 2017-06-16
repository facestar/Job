package com.yndf.Dao;
import java.util.List;

import com.yndf.pojo.Medium;

public interface MediumDao {
  Medium add(Medium medium);
  Medium findmname(String mname);
 public List<Medium> findAll();
 public boolean del(int id);
Object findById(int id);
 
}

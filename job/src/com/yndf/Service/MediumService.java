package com.yndf.Service;



import java.util.List;

import com.yndf.pojo.Medium;

public interface MediumService {
	Medium add(Medium medium);

	Medium findname(String mname);
	
	 public List<Medium> findAll();
    public boolean delmedium(int id);

	Object findById(int id);
	
}

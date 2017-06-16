package com.yndf.Util;

import java.util.Comparator;

import com.yndf.pojo.Company;
import com.yndf.pojo.User;

public class ComparatorUser implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		User c1=(User) o1;
		User c2=(User) o2;
		return new Integer(c1.getJifen()).compareTo(c2.getJifen());
	}

	
	
	

}

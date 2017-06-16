package com.yndf.Util;

import java.util.Comparator;

import com.yndf.pojo.Company;

public class ComparatorCom implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		Company c1=(Company) o1;
		Company c2=(Company) o2;
		return new Integer(c1.getJifen()).compareTo(c2.getJifen());
	}

	
	
	

}

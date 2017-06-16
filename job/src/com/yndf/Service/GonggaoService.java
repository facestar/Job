package com.yndf.Service;

import java.util.List;

import com.yndf.pojo.Gonggao;


public interface GonggaoService {
  Gonggao add(Gonggao gonggao);

List<Gonggao> findAll(Gonggao gonggao);

void deletegongao(int id);

}

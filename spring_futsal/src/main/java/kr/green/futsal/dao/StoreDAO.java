package kr.green.futsal.dao;

import org.apache.ibatis.annotations.Param;

import kr.green.futsal.vo.StoreVO;

public interface StoreDAO {

	void registerStore(@Param("store")StoreVO store);

}

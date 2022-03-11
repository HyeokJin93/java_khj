package kr.green.futsal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.futsal.dao.StoreDAO;
import kr.green.futsal.vo.StoreVO;

@Service
public class StoreServiceImp implements StoreService{

	@Autowired
	StoreDAO storeDao;

	@Override
	public boolean registerStore(StoreVO store) {
		if(store == null)
			return false;		
		if(store.getSt_name() == null)
			return false;
		if(store.getSt_address() == null)
			return false;
		if(store.getSt_detailAddress() == null)
			return false;
		if(store.getSt_me_id() == null)
			return false;
		if(store.getSt_me_id().trim().length() == 0)
			store.setSt_me_id("asdasd");
		storeDao.registerStore(store);
		return true;
	}
}

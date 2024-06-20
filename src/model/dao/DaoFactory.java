package model.dao;

import model.dao.impl.SellerDaojdbc;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaojdbc();
	}

}
 
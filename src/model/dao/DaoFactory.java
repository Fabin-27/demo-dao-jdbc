package model.dao;

import db.DB;
import model.dao.impl.SellerDaojdbc;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaojdbc(DB.getConnection());
	}

}
 
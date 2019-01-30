package com.companyname.microservice.dao.impl;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.companyname.microservice.common.MyObjectToReturn;
import com.companyname.microservice.dao.MyDAO;

@Repository
public class MyDAOImpl implements MyDAO {

	@Override
	public MyObjectToReturn getMyObjectToReturn() {
		
		MyObjectToReturn myObjectToReturn = new MyObjectToReturn();
		myObjectToReturn.setCreated(new Date());
		myObjectToReturn.setCreatedBy("Me");
		myObjectToReturn.setDescription("The description");
		myObjectToReturn.setId(89809808983L);
		myObjectToReturn.setName("The Name");
		
        return myObjectToReturn;
	}

}

package com.companyname.microservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.companyname.microservice.common.MyObjectToReturn;
import com.companyname.microservice.dao.MyDAO;

import io.swagger.annotations.ApiOperation;

@RestController
public class ApplicationController {
	
	@Autowired
	private MyDAO myDao;

	@RequestMapping(path = "/application", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String getApplication() {
        return "Well, thats good!";
    }
	
	@ApiOperation(value = "/my-object",produces = MediaType.APPLICATION_JSON_VALUE, response = MyObjectToReturn.class)
	@RequestMapping(path = "/my-object", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public MyObjectToReturn getMyObject() {
		return myDao.getMyObjectToReturn();
    }
	
}

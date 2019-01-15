package com.huawei.cse.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2019-01-15T09:04:03.950Z")


@RestSchema(schemaId = "project4l0b")
@Path("/cse")

@Produces({ "application/json" })
public class Project4l0bImpl  {

    @Autowired
    private Project4l0bDelegate project4l0bDelegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return project4l0bDelegate.helloworld(name);
    }
}


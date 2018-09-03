package com.zyc.workflow.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MdataAPIWebCaller extends BaseWorkflowController {

	private static final String CALLER_PATH = "/mdata/api";
	
	@RequestMapping(value = CALLER_PATH + "/dimensionCategories", method = RequestMethod.GET)
    public String dimensionCategories() {
        return this.mdataClientFeign.dimensionCategories();
    }
}

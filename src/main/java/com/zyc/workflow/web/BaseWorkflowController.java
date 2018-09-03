package com.zyc.workflow.web;

import org.springframework.beans.factory.annotation.Autowired;

import com.zyc.baselibs.web.BaseController;
import com.zyc.workflow.client.MdataClientFeign;

public abstract class BaseWorkflowController extends BaseController {
	
	@Autowired
	protected MdataClientFeign mdataClientFeign;
}

package com.zyc.workflow.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "mdata", fallback = MdataClientFeignHystrix.class)
public interface MdataClientFeign {
	
	@RequestMapping(method = RequestMethod.GET, value = "/mdata/dimension/categories")
	String dimensionCategories();
	
}

package com.zyc.workflow.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zyc.baselibs.commons.ReflectUtils;

@Component
public class MdataClientFeignHystrix implements MdataClientFeign {

	private static final Map<String, Object> cache = new HashMap<String, Object>();
	
	@Override
	public String dimensionCategories() {
		return "Error: " + this.requestMappingUrl("dimensionCategories");
	}
	
	private String requestMappingUrl(String method) {
		if(!cache.containsKey(method)) {
			cache.put(method, ReflectUtils.findAnnotation(method, MdataClientFeign.class, RequestMapping.class));
		}
		RequestMapping rm = ((RequestMapping) cache.get(method));
		return null == rm ? null : Arrays.toString(rm.value());
	}

}

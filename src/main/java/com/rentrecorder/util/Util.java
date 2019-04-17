package com.rentrecorder.util;

import org.springframework.web.servlet.ModelAndView;

public class Util {

	public static ModelAndView getView(String viewName) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName(viewName);
		return mv;
	}
}

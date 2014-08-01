package com.howtodoinjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityNavigation {
	private Tenant tenant = Tenant.getInstance();

	@RequestMapping(value = "/java/user-login", method = RequestMethod.GET)
	public ModelAndView loginForm1() {
		return new ModelAndView("login-form");
	}

	@RequestMapping(value = "/java/error-login", method = RequestMethod.GET)
	public ModelAndView invalidLogin1() {
		ModelAndView modelAndView = new ModelAndView("login-form");
		modelAndView.addObject("error", true);
		return modelAndView;
	}

	@RequestMapping(value = "/java/success-login", method = RequestMethod.GET)
	public ModelAndView successLogin1() {
		return new ModelAndView("success-login");
	}

	@RequestMapping(value = "/qa/user-login", method = RequestMethod.GET)
	public ModelAndView loginForm2() {
		return new ModelAndView("login-form");
	}

	@RequestMapping(value = "/qa/error-login", method = RequestMethod.GET)
	public ModelAndView invalidLogin2() {
		ModelAndView modelAndView = new ModelAndView("login-form");
		modelAndView.addObject("error", true);
		return modelAndView;
	}

	@RequestMapping(value = "/qa/success-login", method = RequestMethod.GET)
	public ModelAndView successLogin2() {
		return new ModelAndView("success-login");
	}

	@RequestMapping(value = "/lamp/user-login", method = RequestMethod.GET)
	public ModelAndView loginForm3() {
		return new ModelAndView("login-form");
	}

	@RequestMapping(value = "/lamp/error-login", method = RequestMethod.GET)
	public ModelAndView invalidLogin3() {
		ModelAndView modelAndView = new ModelAndView("login-form");
		modelAndView.addObject("error", true);
		return modelAndView;
	}

	@RequestMapping(value = "/lamp/success-login", method = RequestMethod.GET)
	public ModelAndView successLogin3() {
		return new ModelAndView("success-login");
	}

	@RequestMapping(value = "/ms/user-login", method = RequestMethod.GET)
	public ModelAndView loginForm4() {
		return new ModelAndView("login-form");
	}

	@RequestMapping(value = "/ms/error-login", method = RequestMethod.GET)
	public ModelAndView invalidLogin4() {
		ModelAndView modelAndView = new ModelAndView("login-form");
		modelAndView.addObject("error", true);
		return modelAndView;
	}

	@RequestMapping(value = "/ms/success-login", method = RequestMethod.GET)
	public ModelAndView successLogin4() {
		return new ModelAndView("success-login");
	}

	@RequestMapping(value = "/infra/user-login", method = RequestMethod.GET)
	public ModelAndView loginForm5() {
		return new ModelAndView("login-form");
	}

	@RequestMapping(value = "/infra/error-login", method = RequestMethod.GET)
	public ModelAndView invalidLogin5() {
		ModelAndView modelAndView = new ModelAndView("login-form");
		modelAndView.addObject("error", true);
		return modelAndView;
	}

	@RequestMapping(value = "/infra/success-login", method = RequestMethod.GET)
	public ModelAndView successLogin5() {
		return new ModelAndView("success-login");
	}

	@RequestMapping(value = "/success-login", method = RequestMethod.GET)
	public ModelAndView successLoginDefault() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("success-login");
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println("Tenant in SuccessLogin  obtained: "
				+ tenant.getTenantName());
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
		modelAndView.addObject("tenantName", tenant.getTenantName());

		return modelAndView;
	}

	@RequestMapping(value = "/error-login", method = RequestMethod.GET)
	public ModelAndView invalidLoginDefault() {
		ModelAndView modelAndView = new ModelAndView("login-form");
		modelAndView.addObject("error", true);
		return modelAndView;
	}
}
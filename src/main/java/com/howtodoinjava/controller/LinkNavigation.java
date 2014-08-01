package com.howtodoinjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinkNavigation {
	private Tenant tenant = Tenant.getInstance();

	@RequestMapping(value = "/java/index", method = RequestMethod.GET)
	public ModelAndView indexPage1() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/java/sec/moderation", method = RequestMethod.GET)
	public ModelAndView moderatorPage1() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("moderation");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/java/admin/first", method = RequestMethod.GET)
	public ModelAndView firstAdminPage1() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin-first");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/java/admin/second", method = RequestMethod.GET)
	public ModelAndView secondAdminPage1() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin-second");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/qa/index", method = RequestMethod.GET)
	public ModelAndView indexPage2() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/qa/sec/moderation", method = RequestMethod.GET)
	public ModelAndView moderatorPage2() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("moderation");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/qa/admin/first", method = RequestMethod.GET)
	public ModelAndView firstAdminPage2() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin-first");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/qa/admin/second", method = RequestMethod.GET)
	public ModelAndView secondAdminPage2() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin-second");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/lamp/index", method = RequestMethod.GET)
	public ModelAndView indexPage3() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/lamp/sec/moderation", method = RequestMethod.GET)
	public ModelAndView moderatorPage3() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("moderation");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/lamp/admin/first", method = RequestMethod.GET)
	public ModelAndView firstAdminPage3() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin-first");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/lamp/admin/second", method = RequestMethod.GET)
	public ModelAndView secondAdminPage3() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin-second");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/ms/index", method = RequestMethod.GET)
	public ModelAndView indexPage4() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/ms/sec/moderation", method = RequestMethod.GET)
	public ModelAndView moderatorPage4() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("moderation");
		modelAndView.addObject("tenantName", "ms");
		return modelAndView;
	}

	@RequestMapping(value = "/ms/admin/first", method = RequestMethod.GET)
	public ModelAndView firstAdminPage4() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin-first");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/ms/admin/second", method = RequestMethod.GET)
	public ModelAndView secondAdminPage4() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin-second");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/infra/index", method = RequestMethod.GET)
	public ModelAndView indexPage5() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/infra/sec/moderation", method = RequestMethod.GET)
	public ModelAndView moderatorPage5() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("moderation");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/infra/admin/first", method = RequestMethod.GET)
	public ModelAndView firstAdminPage5() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin-first");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

	@RequestMapping(value = "/infra/admin/second", method = RequestMethod.GET)
	public ModelAndView secondAdminPage5() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin-second");
		modelAndView.addObject("tenantName", tenant.getTenantName());
		return modelAndView;
	}

}
package com.howtodoinjava.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.howtodoinjava.entity.EmployeeEntity;
import com.howtodoinjava.entity.bean.EmployeeBean;
import com.howtodoinjava.service.EmployeeManager;

@Controller
public class EditEmployeeController {

	// private static final Logger logger = Logger
	// .getLogger(EditEmployeeController.class);
	@Autowired
	private EmployeeManager employeeManager;
	private Tenant tenant = Tenant.getInstance();

	/*
	 * @RequestMapping(value = "/", method = RequestMethod.GET) public String
	 * listEmployeesDefault(ModelMap map) { logger.info(""); return
	 * "redirect:/"; }
	 */

	@RequestMapping(value = "/java", method = RequestMethod.GET)
	public String listEmployees1(ModelMap map) {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setTenantName(tenant.getTenantName());
		map.addAttribute("employeeBean", employeeBean);

		List<EmployeeEntity> allEmployees = employeeManager.getAllEmployees();

		List<EmployeeBean> allEmployeeBeans = new ArrayList<EmployeeBean>();
		for (Iterator<EmployeeEntity> iterator = allEmployees.iterator(); iterator
				.hasNext();) {
			EmployeeEntity employeeEntity = (EmployeeEntity) iterator.next();
			EmployeeBean employeeBean1 = makeEntityToBean(employeeEntity);
			employeeBean1.setTenantName(tenant.getTenantName());
			allEmployeeBeans.add(employeeBean1);
		}

		map.addAttribute("employeeBeanList", allEmployeeBeans);

		return "editEmployeeList";
	}

	@RequestMapping(value = "/qa", method = RequestMethod.GET)
	public String listEmployees2(ModelMap map) {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setTenantName(tenant.getTenantName());
		map.addAttribute("employeeBean", employeeBean);

		List<EmployeeEntity> allEmployees = employeeManager.getAllEmployees();

		List<EmployeeBean> allEmployeeBeans = new ArrayList<EmployeeBean>();
		for (Iterator<EmployeeEntity> iterator = allEmployees.iterator(); iterator
				.hasNext();) {
			EmployeeEntity employeeEntity = (EmployeeEntity) iterator.next();
			EmployeeBean employeeBean1 = makeEntityToBean(employeeEntity);
			employeeBean1.setTenantName(tenant.getTenantName());

			allEmployeeBeans.add(employeeBean1);
		}
		map.addAttribute("employeeBeanList", allEmployeeBeans);
		return "editEmployeeList";
	}

	@RequestMapping(value = "/lamp", method = RequestMethod.GET)
	public String listEmployees3(ModelMap map) {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setTenantName(tenant.getTenantName());
		map.addAttribute("employeeBean", employeeBean);

		List<EmployeeEntity> allEmployees = employeeManager.getAllEmployees();

		List<EmployeeBean> allEmployeeBeans = new ArrayList<EmployeeBean>();
		for (Iterator<EmployeeEntity> iterator = allEmployees.iterator(); iterator
				.hasNext();) {
			EmployeeEntity employeeEntity = (EmployeeEntity) iterator.next();
			EmployeeBean employeeBean1 = makeEntityToBean(employeeEntity);
			employeeBean1.setTenantName(tenant.getTenantName());
			allEmployeeBeans.add(employeeBean1);
		}
		map.addAttribute("employeeBeanList", allEmployeeBeans);
		return "editEmployeeList";
	}

	@RequestMapping(value = "/ms", method = RequestMethod.GET)
	public String listEmployees4(ModelMap map) {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setTenantName(tenant.getTenantName());
		map.addAttribute("employeeBean", employeeBean);

		List<EmployeeEntity> allEmployees = employeeManager.getAllEmployees();

		List<EmployeeBean> allEmployeeBeans = new ArrayList<EmployeeBean>();
		for (Iterator<EmployeeEntity> iterator = allEmployees.iterator(); iterator
				.hasNext();) {
			EmployeeEntity employeeEntity = (EmployeeEntity) iterator.next();
			EmployeeBean employeeBean1 = makeEntityToBean(employeeEntity);
			employeeBean1.setTenantName(tenant.getTenantName());
			allEmployeeBeans.add(employeeBean1);
		}
		map.addAttribute("employeeBeanList", allEmployeeBeans);
		return "editEmployeeList";
	}

	@RequestMapping(value = "/infra", method = RequestMethod.GET)
	public String listEmployees5(ModelMap map) {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setTenantName(tenant.getTenantName());
		map.addAttribute("employeeBean", employeeBean);

		List<EmployeeEntity> allEmployees = employeeManager.getAllEmployees();

		List<EmployeeBean> allEmployeeBeans = new ArrayList<EmployeeBean>();
		for (Iterator<EmployeeEntity> iterator = allEmployees.iterator(); iterator
				.hasNext();) {
			EmployeeEntity employeeEntity = (EmployeeEntity) iterator.next();
			EmployeeBean employeeBean1 = makeEntityToBean(employeeEntity);
			employeeBean1.setTenantName(tenant.getTenantName());
			allEmployeeBeans.add(employeeBean1);
		}
		map.addAttribute("employeeBeanList", allEmployeeBeans);
		return "editEmployeeList";
	}

	private EmployeeBean makeEntityToBean(EmployeeEntity employeeEntity) {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setId(employeeEntity.getId());
		employeeBean.setFirstname(employeeEntity.getFirstname());
		employeeBean.setLastname(employeeEntity.getLastname());
		employeeBean.setEmail(employeeEntity.getEmail());
		employeeBean.setTelephone(employeeEntity.getTelephone());
		return employeeBean;
	}

	private EmployeeEntity makeBeanToEntity(EmployeeBean employeeBean) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setId(employeeBean.getId());
		employeeEntity.setFirstname(employeeBean.getFirstname());
		employeeEntity.setLastname(employeeBean.getLastname());
		employeeEntity.setEmail(employeeBean.getEmail());
		employeeEntity.setTelephone(employeeBean.getTelephone());
		return employeeEntity;
	}

	@RequestMapping(value = "/java/add", method = RequestMethod.POST)
	public String addEmployee1(
			@ModelAttribute(value = "employeeBean") EmployeeBean employeeBean,
			BindingResult result) {
		EmployeeEntity employee = makeBeanToEntity(employeeBean);
		employeeManager.addEmployee(employee);
		return "redirect:/java";
	}

	@RequestMapping(value = "/qa/add", method = RequestMethod.POST)
	public String addEmployee2(
			@ModelAttribute(value = "employeeBean") EmployeeBean employeeBean,
			BindingResult result) {
		EmployeeEntity employee = makeBeanToEntity(employeeBean);
		employeeManager.addEmployee(employee);
		return "redirect:/qa";
	}

	@RequestMapping(value = "/lamp/add", method = RequestMethod.POST)
	public String addEmployee3(
			@ModelAttribute(value = "employeeBean") EmployeeBean employeeBean,
			BindingResult result) {
		EmployeeEntity employee = makeBeanToEntity(employeeBean);
		employeeManager.addEmployee(employee);
		return "redirect:/lamp";
	}

	@RequestMapping(value = "/ms/add", method = RequestMethod.POST)
	public String addEmployee4(
			@ModelAttribute(value = "employeeBean") EmployeeBean employeeBean,
			BindingResult result) {
		EmployeeEntity employee = makeBeanToEntity(employeeBean);
		employeeManager.addEmployee(employee);
		return "redirect:/ms";
	}

	@RequestMapping(value = "/infra/add", method = RequestMethod.POST)
	public String addEmployee5(
			@ModelAttribute(value = "employeeBean") EmployeeBean employeeBean,
			BindingResult result) {
		EmployeeEntity employee = makeBeanToEntity(employeeBean);
		employeeManager.addEmployee(employee);
		return "redirect:/infra";
	}

	@RequestMapping("/java/delete/{employeeId}")
	public String deleteEmplyee1(@PathVariable("employeeId") Integer employeeId) {
		employeeManager.deleteEmployee(employeeId);
		return "redirect:/java";
	}

	@RequestMapping("/qa/delete/{employeeId}")
	public String deleteEmplyee2(@PathVariable("employeeId") Integer employeeId) {
		employeeManager.deleteEmployee(employeeId);
		return "redirect:/qa";
	}

	@RequestMapping("/lamp/delete/{employeeId}")
	public String deleteEmplyee3(@PathVariable("employeeId") Integer employeeId) {
		employeeManager.deleteEmployee(employeeId);
		return "redirect:/lamp";
	}

	@RequestMapping("/ms/delete/{employeeId}")
	public String deleteEmplyee4(@PathVariable("employeeId") Integer employeeId) {
		employeeManager.deleteEmployee(employeeId);
		return "redirect:/ms";
	}

	@RequestMapping("/infra/delete/{employeeId}")
	public String deleteEmplyee5(@PathVariable("employeeId") Integer employeeId) {
		employeeManager.deleteEmployee(employeeId);
		return "redirect:/infra";
	}

	public void setEmployeeManager(EmployeeManager employeeManager) {
		this.employeeManager = employeeManager;
	}
}

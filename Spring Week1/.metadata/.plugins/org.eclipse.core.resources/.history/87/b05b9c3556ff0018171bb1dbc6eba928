package com.jp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jp.hr.entities.Department;
import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;


/*
 * @Controller : a kind of @ component to declare SpringMVC controller
 * @RequestMapping: To map a controlling method to the URI
 * @RequestParam : to take single querystring or formdata field value
 * Multi- action controllers (each page has seperate method)
 */


@Controller
public class HomePageController {
	
	//http://localhost:8080/Spring110_MVC_Basics/homePage.do
	

	
	@Autowired
	@Qualifier("service")
	private ServiceEmployee empService;
	
	
	private Validator validator;
	
	@InitBinder
    private void validaterBinder(WebDataBinder binder) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
      
    }
	
	@RequestMapping("homePage.hr")
	public String getHomePage(){
		
		System.out.println("in home page");
		
		return "homePage";
	}
	
	
	
	@RequestMapping("getEmpList.hr")
	public ModelAndView getEmpList(){
				
		ModelAndView mAndv = new ModelAndView();		
		try {
						
			List<Employee> empList = empService.getEmpList();
			mAndv.addObject("EmployeeList", empList);
			mAndv.setViewName("employeeList");
						
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return mAndv;				
	}
	
	@RequestMapping("getDeptList.hr")
	public ModelAndView getDeptList(){
				
		ModelAndView mAndv = new ModelAndView();		
		try {
						
			List<Department> depList = empService.getDeptList();
			mAndv.addObject("DepartmentList", depList);
			mAndv.setViewName("departmentList");
						
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return mAndv;				
	}
	
	
	
	@RequestMapping("getEmpDetails.hr")	
	public ModelAndView getEmpDetails(HttpServletRequest request, @RequestParam("id") Integer empId){
		
		//@RequestParam - performs below comented actions
		/*String strEmpId = request.getParameter("id");
		
		int empId = Integer.parseInt(strEmpId);
				*/
		ModelAndView mAndv = new ModelAndView();		
		try {
						
			Employee empDetailsO = empService.getEmpDetails(empId);
			mAndv.addObject("EmployeeDetails", empDetailsO);
			mAndv.setViewName("empDetails");
						
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return mAndv;				
	}
	
	@RequestMapping("getDeptDetails.hr")	
	public ModelAndView getDEptDetails(HttpServletRequest request, @RequestParam("id") Integer deptId){
		
		//@RequestParam - performs below comented actions
		/*String strEmpId = request.getParameter("id");
		
		int empId = Integer.parseInt(strEmpId);
				*/
		ModelAndView mAndv = new ModelAndView();		
		try {
						
			Department deptDetailsO = empService.getDeptDetails(deptId);
			System.out.println(deptDetailsO);
			mAndv.addObject("DepartmentDetails", deptDetailsO);
			mAndv.setViewName("deptDetails");
						
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return mAndv;				
	}
	
	
	
	@RequestMapping("registrationForm.hr")	
	public String getRegistrationForm(Model model){
		
		//define command object
		Employee emp = new Employee();
		
		model.addAttribute("command", emp);
		
		return "entryPage";				
	}
	
	
	
	@RequestMapping("submitRegistrationData.hr")	
	public String submitRegistrationForm(@ModelAttribute("command") Employee emp, BindingResult result , Model model ) {
				

		Set<ConstraintViolation<Employee>> violations = validator.validate(emp);  //returns errored property name
    	
    	for (ConstraintViolation<Employee> violation : violations)
        {
            String propertyPath = violation.getPropertyPath().toString();
            String message = violation.getMessage();
            // Add JSR-303 errors to BindingResult. This allows Spring to display them in view via a FieldError
            
            FieldError error = new FieldError("command",propertyPath,
                    "Invalid "+ propertyPath + "(" + message + ")");
            result.addError(error);
        }
    	
    	if (result.hasErrors()) {
    		//System.out.println("Invalid values:" + emp);
            return "entryPage";
        } else {
        	
        	try {
    			    				
    				boolean empAddSuccess = empService.addNewEmp(emp);
    				return "saveSuccess";    				    			    			
    				
    		} catch (HrException e) {
    			model.addAttribute("msg", "Insert Failed "+e.getMessage());
    			return "entryPage";
    		}
        
        }
    	
	}
    	
		
		
		
		
					
	}
	
	
	
	



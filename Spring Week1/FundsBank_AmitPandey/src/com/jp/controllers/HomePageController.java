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

import com.jp.fb.entities.CustomerComplaint;
import com.jp.fb.exceptions.ComplainException;
import com.jp.fb.services.ServiceComplain;







@Controller
public class HomePageController {
	
	//http://localhost:8080/Spring110_MVC_Basics/homePage.do
	

	
	@Autowired
	@Qualifier("service")
	private ServiceComplain complainService;
	
	
	private Validator validator;
	
	@InitBinder
    private void validaterBinder(WebDataBinder binder) {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
      
    }
	
	@RequestMapping("homePage.fb")
	public String getHomePage(){
		
		System.out.println("in home page");
		
		return "raiseComplainPage";
	}
	
	
	
	@RequestMapping("GetCheckStatusForm.fb")	
	public String getCheckStatusForm(Model model){
		
		
		CustomerComplaint ss = new CustomerComplaint();
		
		model.addAttribute("status", ss);
		
		return "getCheckStatusForm";				
	}
	
	
	
	@RequestMapping("GetCheckStatus.fb")	
	public ModelAndView getCheckStatus(@ModelAttribute("status") CustomerComplaint cc, BindingResult result , Model model  ) {
		ModelAndView mAndv = new ModelAndView();		
		//System.out.println(cc);
		/*Set<ConstraintViolation<CustomerComplaint>> violations = validator.validate(cc);  //returns errored property name
		
    	for (ConstraintViolation<CustomerComplaint> violation : violations)
        {
            String propertyPath = violation.getPropertyPath().toString();
            String message = violation.getMessage();
            // Add JSR-303 errors to BindingResult. This allows Spring to display them in view via a FieldError
            
            FieldError error = new FieldError("status",propertyPath,
                    "Invalid "+ propertyPath + "(" + message + ")");
            result.addError(error);
        }
    	
    	if (result.hasErrors()) {
    		//System.out.println("Invalid values:" + emp);
    		mAndv.setViewName("getCheckStatusForm");
            //return "raiseComplainPage";
        } else */
        	
        	try {
        		        		    			    				
        			
    				CustomerComplaint comAddSuccess = complainService.getEmpDetails(cc.getComplaintId());
    				
    				mAndv.addObject("ComplainDetails", comAddSuccess);
    				mAndv.setViewName("getCheckStatusForm");
    				//return "saveSuccess";    				    			    			
    				
    		} catch (ComplainException e) {
    			model.addAttribute("msg", "Insert Failed "+e.getMessage());
    			mAndv.setViewName("getCheckStatusForm");
    		}
        
        
		return mAndv;
    	
    	
    	
	}
	
	
	
	
	
	@RequestMapping("RaiseComplainPage.fb")	
	public String getRegistrationForm(Model model){
		
		
		CustomerComplaint cc = new CustomerComplaint();
		
		model.addAttribute("command", cc);
		
		return "raiseComplainPage";				
	}
	
	
	
	@RequestMapping("submitComplaintData.fb")	
	public String submitRegistrationForm(@ModelAttribute("command") CustomerComplaint cc, BindingResult result , Model model  ) {
				
		//System.out.println(cc);
		Set<ConstraintViolation<CustomerComplaint>> violations = validator.validate(cc);  //returns errored property name
    	
    	for (ConstraintViolation<CustomerComplaint> violation : violations)
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
            return "raiseComplainPage";
        } else {
        	
        	try {
        		
        			if (cc.getCategory().equals("Internet Banking")){
        				cc.setPriority("High");
        			}else if(cc.getCategory().equals("General Banking")){
        				cc.setPriority("Medium");
        			}else{
        				cc.setPriority("Low");
        			}
        			cc.setStatus("Open");
        			
        			/*if(cc.getComplaintId()==null){
        				
        				cc.setComplaintId(1);
        			}*/
    			    				
    				boolean comAddSuccess = complainService.addNewComplaint(cc);
    				return "saveSuccess";    				    			    			
    				
    		} catch (ComplainException e) {
    			model.addAttribute("msg", "Insert Failed "+e.getMessage());
    			return "raiseComplainPage";
    		}
        
        }
    	
	}
    	
		
		
		
		
					
	}
	
	
	
	



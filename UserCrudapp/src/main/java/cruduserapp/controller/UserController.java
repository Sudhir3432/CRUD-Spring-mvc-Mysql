package cruduserapp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import cruduserapp.model.User;
import cruduserapp.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
   
	@RequestMapping("/")
	public String home(Model m) {
	List<User>	us= userService.getUsers();
		m.addAttribute("users",us);
		return "index";
	}
	
	@RequestMapping("/add")
	public String addProduct() {
		
		return "add_product_form";
		}
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
	
	
	@RequestMapping(value="/handle",method= RequestMethod.POST)
	public RedirectView handleUser(@ModelAttribute User u,@RequestParam("birthday") String date,BindingResult result,HttpServletRequest request) 
	{
	
		  SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	      
		  Date register = null;
		try {
			register = dateformat.parse(String.valueOf(date));
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
	        u.setBirthday(register); 
		 userService.SaveUser(u);
		 RedirectView  redirectView = new  RedirectView();
		 redirectView.setUrl(request.getContextPath()+"/");
		 return  redirectView;
	}


	@RequestMapping("/delete/{userid}")
	public RedirectView deleteUser(@PathVariable("userid") int id,HttpServletRequest request) 
	{
		this.userService.deleteUser(id);
		 RedirectView  redirectView = new  RedirectView();
		 redirectView.setUrl(request.getContextPath()+"/");
		 return  redirectView; 
		 
	}
	@RequestMapping("/update/{userid}")
	public String UpdateForm(@PathVariable("userid") int id,Model model)
	{
		User us=this.userService.getUser(id);
		model.addAttribute("user", us);
		return "update_user_form";
	}
	
	
	
}

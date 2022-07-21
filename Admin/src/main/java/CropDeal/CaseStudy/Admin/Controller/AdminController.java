package CropDeal.CaseStudy.Admin.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CropDeal.CaseStudy.Admin.Models.Admin;
import CropDeal.CaseStudy.Admin.Repo.AdminRepo;



@RestController
@RequestMapping("/employee")
public class AdminController {
	@Autowired
	AdminRepo repo;
	
	@GetMapping("/getAdmin/{adminid}")
	   public Optional<Admin> getAdminProfileById(@PathVariable("adminid") int adminid){
		   return repo.findById(adminid);
	   }
	@GetMapping("getAdmins")
    public List<Admin> getAllAdmins(){
		return repo.findAll();
	}
	@GetMapping("getAllAdmins")
    public List<Admin> getAllAdminss(){
		return repo.findAll();
	}
	   @PostMapping("/saveProfile")
	   public void saveProfile(@RequestBody Admin admin) {
		   repo.save(admin);
	   }
	
	@PutMapping("/updateAdmin/{Adminid}")
	   public void updateAdmin(@PathVariable("adminid") int adminid,@RequestBody Admin admin) {
		   repo.save(admin);
	   }
}

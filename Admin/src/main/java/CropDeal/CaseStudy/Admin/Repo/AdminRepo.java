package CropDeal.CaseStudy.Admin.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.mongodb.repository.MongoRepository;

import CropDeal.CaseStudy.Admin.Models.Admin;


public interface AdminRepo extends JpaRepository< Admin, Integer> {

}


package com.hospitalmanagement.Hospital.Management.System.Controler;

import com.hospitalmanagement.Hospital.Management.System.Model.Hospital;
import com.hospitalmanagement.Hospital.Management.System.Service.HospitalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// @RestController- annotation that will help springboot to understand that this is a Controller(layer).
//in ur controller u need to specify urls.

public class HospitalController {

// to make connection betn controller and service create service object here in the controller class
    //
    HospitalService hospitalService = new HospitalService();


    // want to create a ulr to see the hospital details
    // to add new hospital in system
    @GetMapping("/api/hospitals")

    public List<Hospital> getAllHospital(){
        //to get the list of all hospitals we need to write logic
        //logic needs to be write in service layer
        List<Hospital> hospitals = hospitalService.getAllHospitals();
        return hospitals;
    }
    int count;
    @PostMapping("/api/addhospital")

    public String addhospital(){
        Hospital hospital= new Hospital();
        hospital.name= "Priya";
        hospital.id= count;
        String id = count + "";
        count++;
        hospitalService.addHospital(id,hospital);
        return "Hospital object got added";
        //calling service layer to add this hospital object in our system.
    }

     /*        @GetMapping("/api/sayHello")
            public String sayHello(){
                return "Hello";
            }
            @GetMapping("/api/saybye")
            public String saybye(){
                return "Bye";
            }
            @PostMapping("/api/createpost")
            public String createpost(){
                return "Create Post";
            }                                       */
}

package com.hospitalmanagement.Hospital.Management.System.Service;

import com.hospitalmanagement.Hospital.Management.System.Model.Hospital;
import com.hospitalmanagement.Hospital.Management.System.Repository.HospitalRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
//@Sevice annotation to make spring understand it is service class
//in service class we write all our logics

public class HospitalService {

    //to make connection from service to repository, created repository object(instancee)
    // OR we injected dependency of repository inside service
    HospitalRepository hospitalRepository= new HospitalRepository();

    public  List<Hospital> getAllHospitals(){

        //u need hospitals data
        // service layer need to call repository layer
        HashMap<String,Hospital> hospitalDB = hospitalRepository.getAllHospital();
        List<Hospital> allHospitals = new ArrayList<>();
        for (String hospitalID : hospitalDB.keySet()){
            Hospital hospital = hospitalDB.get(hospitalID);
            allHospitals.add(hospital);
        }
        return allHospitals;
    }
    public void addHospital(String id, Hospital hospital){
        //service layer want to save this object in the system
        //service layer will call repository layer to save this object
        hospitalRepository.addHospital(id, hospital);
    }
}

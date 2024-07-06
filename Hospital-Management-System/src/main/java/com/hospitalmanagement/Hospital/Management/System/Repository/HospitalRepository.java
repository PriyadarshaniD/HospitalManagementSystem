package com.hospitalmanagement.Hospital.Management.System.Repository;

import com.hospitalmanagement.Hospital.Management.System.Model.Hospital;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
// @Repository to understand it is repository class
public class HospitalRepository {
     HashMap<String, Hospital> hospitalDB = new HashMap<>();

    public  HashMap<String, Hospital> getAllHospital() {
        return hospitalDB;
    }
    public void addHospital(String id, Hospital hospital){
        hospitalDB.put(id, hospital);
    }
}

package case_study.khu_nghi_duong_furama.repository.impl;

import case_study.khu_nghi_duong_furama.model.facility.Facility;
import case_study.khu_nghi_duong_furama.repository.IFacilityRepo;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepoImpl implements IFacilityRepo {
    Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();

    @Override
    public void delete(Facility facility) {


    }

    @Override
    public void displayFacilityMaintenance(Facility facility) {



    }

    @Override
    public void add(Facility facility) {
        facilityIntegerMap.put(facility,0);

    }

    @Override
    public List<Facility> display() {
        return null;
    }

    @Override
    public boolean checkId(String id) {
        return false;
    }
}

package case_study.khu_nghi_duong_furama.repository;

import case_study.khu_nghi_duong_furama.model.facility.Facility;

public interface IFacilityRepo extends IFuramaRepo<Facility> {
    void delete(Facility furama);
    void displayFacilityMaintenance(Facility furama);
}

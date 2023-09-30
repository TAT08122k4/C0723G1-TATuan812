package case_study.khu_nghi_duong_furama.repository;

import case_study.khu_nghi_duong_furama.model.facility.Furama;

public interface IFacilityRepo extends IFuramaRepo<Furama> {
    void delete(Furama furama);
    void displayFacilityMaintenance(Furama furama);
}

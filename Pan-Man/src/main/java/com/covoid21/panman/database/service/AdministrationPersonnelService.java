package com.covoid21.panman.database.service;

import com.covoid21.panman.database.repository.AdministrationPersonnelRepository;
import com.covoid21.panman.entity.user.AdministrationPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdministrationPersonnelService extends UserServiceBase<AdministrationPersonnel> {
    private AdministrationPersonnelRepository administrationPersonnelRepo;

    @Autowired
    public AdministrationPersonnelService(AdministrationPersonnelRepository repo) {
        super(repo);
        this.administrationPersonnelRepo = repo;
    }

    public List<AdministrationPersonnel> findByOffice(String office) {
        return administrationPersonnelRepo.findByOffice(office);
    }

    public List<AdministrationPersonnel> findByDepartment(String department) {
        return administrationPersonnelRepo.findByDepartment(department);
    }

    public List<AdministrationPersonnel> findByTitle(String title) {
        return administrationPersonnelRepo.findByTitle(title);
    }
}
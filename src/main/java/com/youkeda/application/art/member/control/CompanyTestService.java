package com.youkeda.application.art.member.control;

import com.youkeda.application.art.member.param.CompanyQueryParam;
import com.youkeda.application.art.member.service.CompanyService;
import com.youkeda.model.Company;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/test/Company")
public class CompanyTestService {

    @Autowired
    private CompanyService companyService;

    @GetMapping(path = "/save")
    public Company testSave() {
        Company company = new Company();
        company.setId("00001");
        company.setGmtModified(LocalDateTime.now());
        company.setGmtCreated(LocalDateTime.now());
        company.setName("TestName");
        company.setCode("TestCode");
        company.setDomain("TestDomain");
        return companyService.save(company);
    }

    @GetMapping(path = "/find")
    public Company testModifyCompany() {
        CompanyQueryParam companyQueryParam = new CompanyQueryParam();
        companyQueryParam.setCode("TestCode");
        companyQueryParam.setDomain("TestDomain");
        return companyService.find(companyQueryParam);
    }

    @GetMapping(path = "/delete")
    public boolean testDelete() {
        return companyService.delete("0001");
    }
}

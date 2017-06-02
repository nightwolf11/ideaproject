package com.xzq.aipcore.webserivce.rest;

import com.xzq.aipcore.domain.secondary.Idchannelcode;
import com.xzq.aipcore.service.IdchannelcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.text.ParseException;
import java.util.Date;


/**
 * Created by XZQ on 2017-05-25.
 */
@RestController
@RequestMapping("/channelcode")
public class IdchannelcodeController {

    @Autowired
    IdchannelcodeService idchannelcodeService;


    @RequestMapping("")
    public String info() {

        return "渠道字典";
    }

    @RequestMapping("/find/{codeid}")
    public String viewString(@PathVariable("codeid") Long id) {
        System.out.println(id);
        Idchannelcode idchannelcode = idchannelcodeService.findById(id);
        System.out.println(idchannelcode.toString());
        return idchannelcode.toString();
    }

    @RequestMapping("/all")
    public String viewAll() {
        Iterable<Idchannelcode> idchannelcode = idchannelcodeService.findAll();
        System.out.println(idchannelcode.iterator().next().toString());
        return idchannelcode.toString();
    }

    @RequestMapping("/add/{countrycode}.{companycode}.{codetype}.{codevalue}.{remark}")
    public String addString(@PathVariable("countrycode") String countrycode
            , @PathVariable("companycode") String companycode
            , @PathVariable("codetype") String codetype
            , @PathVariable("codevalue") String codevalue
            , @PathVariable("remark") String remark) throws ParseException {
        Idchannelcode idchannelcode = new Idchannelcode();
        idchannelcode.setCountrycode(countrycode);
        idchannelcode.setCompanycode(companycode);
        idchannelcode.setCodetype(codetype);
        idchannelcode.setCodevalue(codevalue);
        idchannelcode.setRemark(remark);
        System.out.println(idchannelcode.toString());
        idchannelcode = idchannelcodeService.save(idchannelcode);
        return idchannelcode.toString();
    }

    @RequestMapping("/update/{codeid}.{countrycode}.{companycode}.{codetype}.{codevalue}.{remark}")
    public String updateString(@PathVariable("codeid") Long codeid
            , @PathVariable("countrycode") String countrycode
            , @PathVariable("companycode") String companycode
            , @PathVariable("codetype") String codetype
            , @PathVariable("codevalue") String codevalue
            , @PathVariable("remark") String remark) throws ParseException {
        Idchannelcode idchannelcode = new Idchannelcode();
        idchannelcode.setCodeid(codeid);
        idchannelcode.setCountrycode(countrycode);
        idchannelcode.setCompanycode(companycode);
        idchannelcode.setCodetype(codetype);
        idchannelcode.setCodevalue(codevalue);
        idchannelcode.setRemark(remark);
        idchannelcode.setModifydate(new Date());
        System.out.println(idchannelcode.toString());
        idchannelcode = idchannelcodeService.save(idchannelcode);
        return idchannelcode.toString();
    }

    @RequestMapping("/delid/{codeid}")
    public String delById(@PathVariable("codeid") Long codeid) {
        idchannelcodeService.delById(codeid);
        return "成功删除："+codeid;
    }

//    @RequestMapping("/add/{countrycode}.{companycode}.{codetype}.{codevalue}.{makedt}.{updatedt}")
//    public String addString(@PathVariable("countrycode") String countrycode
//            , @PathVariable("companycode") String companycode
//            , @PathVariable("codetype") String codetype
//            , @PathVariable("codevalue") String codevalue
//            , @PathVariable("makedt") String makedt
//            , @PathVariable("updatedt") String updatedt) throws ParseException {
////        System.out.println("------------------");
//        Idchannelcode idchannelcode = new Idchannelcode();
////        idchannelcode.setCodeid(Long.valueOf(codeid));
//        idchannelcode.setCountrycode(countrycode);
//        idchannelcode.setCompanycode(companycode);
//        idchannelcode.setCodetype(codetype);
//        idchannelcode.setCodevalue(codevalue);
////        idchannelcode.setAreacode("0");
////        idchannelcode.setChannelcode("0");
////        idchannelcode.setRemark("性别");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
//        idchannelcode.setMakedate(sdf.parse(makedt));
//        idchannelcode.setModifydate(sdf.parse(updatedt));
//        System.out.println(idchannelcode.toString());
//        idchannelcode = idchannelcodeService.save(idchannelcode);
//        return idchannelcode.toString();
//    }

    //public static void main(String[] args) {
    //    SpringApplication.run(UserController.class);
    //}

}

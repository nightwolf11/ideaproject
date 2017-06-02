package com.xzq.aipcore.service.impl;

import com.xzq.aipcore.dao.secondary.IdchannelcodeRepository;
import com.xzq.aipcore.domain.secondary.Idchannelcode;
import com.xzq.aipcore.service.IdchannelcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * Created by XZQ on 2017-05-25.
 */
@Service
public class IdchannelcodeServiceImpl implements IdchannelcodeService {

    @Autowired
    IdchannelcodeRepository idchannelcodeRepository;

    @Override
    public Idchannelcode save(Idchannelcode idchannelcode){
        Idchannelcode i = idchannelcodeRepository.save(idchannelcode);
        return i;
    }

    @Override
    public void delById(Long codeid) {

        idchannelcodeRepository.deleteById(codeid);
        System.out.println("deleteById:"+codeid);
    }

    @Override
    public void delByName(String name) {

    }

    @Override
    public Idchannelcode findByName(String name) {

        List<Idchannelcode> i = idchannelcodeRepository.findByCountrycode(name);

        return null;
    }

    @Override
    public Idchannelcode findById(Long  codeid){
        System.out.println("---called:IdchannelcodeServiceImpl---findById---");
        Optional<Idchannelcode> idchannelcode = idchannelcodeRepository.findById(codeid);
        Idchannelcode i = idchannelcode.get();
//        System.out.println(i.toString());
        return i;
    }

    @Override
    public Iterable<Idchannelcode> findAll() {

        Iterable<Idchannelcode> idchannelcodesList = idchannelcodeRepository.findAll();

        return idchannelcodesList;
    }

    @Override
    public Idchannelcode updateById(Long codeid) {

//        Idchannelcode i = idchannelcodeRepository.save()
        return null;
    }
}

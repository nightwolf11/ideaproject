package com.xzq.aipcore.service;


import com.xzq.aipcore.domain.secondary.Idchannelcode;


/**
 * Created by XZQ on 2017-05-25.
 */
public interface IdchannelcodeService {

        public Idchannelcode save(Idchannelcode country);

        public void delById(Long codeid);

        public void delByName(String name);

        public Idchannelcode findByName(String name);

        public Idchannelcode findById(Long id);

        public Iterable<Idchannelcode> findAll();

        public Idchannelcode updateById(Long codeid);

}

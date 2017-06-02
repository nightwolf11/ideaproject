package com.xzq.aipcore.dao.secondary;


import com.xzq.aipcore.domain.secondary.Idchannelcode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Created by XZQ on 2017-05-25.
 */
public interface IdchannelcodeRepository extends JpaRepository<Idchannelcode,Long> {

    public List<Idchannelcode> findByCountrycode(String countrycode);
}

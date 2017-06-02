package com.xzq.aipcore.webserivce.soap;


import com.xzq.aipcore.test.*;
import com.xzq.aipcore.service.*;
import com.xzq.aipcore.test.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.text.SimpleDateFormat;
import java.util.Date;


@Endpoint
public class UserEndpoint {

        private static final String NAMESPACE_URI = "http://www.xzq.com/userws";

        private UserService userService;
//        private SoapMessage soapMessage;

        @Autowired
        public UserEndpoint(UserService userService) {
            this.userService = userService;
        }

        @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserRequest")
        @ResponsePayload
        public GetUserResponse getUser(@RequestPayload GetUserRequest request) {
            System.out.println(request.toString());

//            System.out.println(soapMessage.toString());

            GetUserResponse response = new GetUserResponse();
            Responsehead resphead = new Responsehead();
            resphead.setBankcode(request.getHead().getBankcode());
            resphead.setRows("1");
            resphead.setSystemcode(request.getHead().getSystemcode());
            resphead.setTradecode(request.getHead().getTradecode());
            resphead.setTranslatedt(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            Responsemessage respmessage = new Responsemessage();
            com.xzq.aipcore.domain.primary.User u = userService.findById(Long.valueOf(request.getMessage().getUserid()));
            System.out.println(u.toString());
            User nu = new User();
//            nu.setBirthday("2015-04-03");
//            nu.setMakedt("2016-03-03");
//            nu.setModifydt("2014-05-23");
//            nu.setSex("1");
//            nu.setUser("xzq");
//            nu.setUserid("1");
//            nu.setUsername("Ð¤ÔóÈª");

            nu.setBirthday(u.getBirthday()==null?"":new SimpleDateFormat("yyyy-MM-dd").format(u.getBirthday()));
            nu.setMakedt(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(u.getMakedt()));
            nu.setModifydt(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(u.getModifydt()));
            nu.setSex(u.getSex()==null?"":String.valueOf(u.getSex()));
            nu.setUser(u.getUser());
            nu.setUserid(String.valueOf(u.getUserid()));
            nu.setUsername(u.getUsername());
            nu.setRemark(u.getRemark());

            System.out.println(nu.toString());
            respmessage.setUser(nu);
            response.setHead(resphead);
            response.setMessage(respmessage);

            System.out.println(response.toString());
            return response;
        }

//    @PayloadRoot(localPart = "getUserRequest", namespace = NAMESPACE_URI)
//    public void soapString(@RequestPayload SoapMessage soapMessage) {
//        soapMessage.getDocument().toString();
//        soapMessage.toString();
//        soapMessage.getSoapBody().getClass(GetUserRequest.class);
//
//    }

}

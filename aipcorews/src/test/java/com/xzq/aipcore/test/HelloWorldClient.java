package com.xzq.aipcore.test;


public class HelloWorldClient {
  public static void main(String[] argv) {
    UserPort service = new UserPortService().getUserPortSoap11();
    //invoke business method

    GetUserRequest getUserRequest = new GetUserRequest();
    GetUserResponse getUserResponse = new GetUserResponse();
    Requesthead reqestHead = new Requesthead();
    reqestHead.setBankcode("testbank");
    reqestHead.setSystemcode("AIPWS");
    reqestHead.setTradecode("1002017052801");
    reqestHead.setTranslatedt("2017-05-28 18:37:22");

    Requestmessage requestmessage = new Requestmessage();
    requestmessage.setUserid("1");

    getUserRequest.setHead(reqestHead);
    getUserRequest.setMessage(requestmessage);

    System.out.println(getUserRequest.toString());

    getUserResponse = service.getUser(getUserRequest);
    System.out.println(getUserResponse.toString());

    User user =  getUserResponse.getMessage().getUser();
    System.out.println(user.toString());




  }
}

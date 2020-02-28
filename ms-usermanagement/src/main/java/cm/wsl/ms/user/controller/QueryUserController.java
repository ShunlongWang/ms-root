package cm.wsl.ms.user.controller;


import cm.wsl.ms.user.model.UserInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/query")
public class QueryUserController {

    @RequestMapping(value = "/get/{uid}", method = RequestMethod.GET)
    public UserInfo get(@PathVariable("uid") long uid) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUid(uid);
        userInfo.setName(String.valueOf(uid));
        return userInfo;
    }
}

package com.moon.manager.module.controller.api;

import java.util.List;

import com.moon.manager.constant.CommonConstant;
import com.moon.manager.module.po.Scraps;
import com.moon.manager.module.service.ScrapsService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 龚志鹏
 * @version V1.0
 * @Project: manager
 * @Package com.moon.manager.module.controller.api
 * @Description: TODO
 * @date Date : 2020年04月03日 22:16
 */
@RestController
public class ScrapsApiController {
    @Autowired
    private ScrapsService scrapsService;

    /**
     * 三个注意点 ResponseBody/ RequestBody/produces
     * @param scraps
     */
    @ResponseBody
    @PostMapping(value = "/api/scraps/add", produces = "application/json;charset=UTF-8")
    public void addScraps(@RequestBody Scraps scraps)
    {
        if(scraps == null || StringUtils.isBlank(scraps.getScraps()))
        {
            System.out.println(scraps.toString());
            return;
        }
        scraps.setStatus(CommonConstant.VALID);
        scrapsService.insert(scraps);
    }

    @ResponseBody
    @PostMapping(value = "/api/scraps/delete", produces = "application/json;charset=UTF-8")
    public void deleteScraps(@RequestBody Scraps scraps)
    {
        scrapsService.insert(scraps);
    }

    @ResponseBody
    @PostMapping(value = "/api/scraps/all", produces = "application/json;charset=UTF-8")
    public List<Scraps> listScraps()
    {
        return scrapsService.listAllScarps();
    }


}

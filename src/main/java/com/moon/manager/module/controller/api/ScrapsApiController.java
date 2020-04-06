package com.moon.manager.module.controller.api;

import com.moon.manager.module.po.Scraps;
import com.moon.manager.module.service.ScrapsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/api/scraps/add")
    public void addScraps(Scraps scraps)
    {
        scrapsService.insert(scraps);
    }

    @PostMapping("/api/scarps/delete")
    public void deleteScraps(Scraps scraps)
    {
        scrapsService.insert(scraps);
    }

    @PostMapping("/api/scarps/all")
    public void deleteScraps()
    {
        scrapsService.listAllScarps();
    }


}

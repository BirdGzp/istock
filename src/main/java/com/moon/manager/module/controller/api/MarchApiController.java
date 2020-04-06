package com.moon.manager.module.controller.api;

import com.moon.manager.module.service.MarchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 龚志鹏
 * @version V1.0
 * @Project: manager
 * @Package com.moon.manager.module.controller.api
 * @Description: TODO
 * @date Date : 2020年04月03日 22:14
 */
@RestController
public class MarchApiController {
    @Autowired
    private MarchService marchService;


}

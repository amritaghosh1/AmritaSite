/**
 * Copyright 2019 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.amritasite.apps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amrita Ghosh (aghosh@expedia.com)
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Welcome to AmritaSite!";
    }
}
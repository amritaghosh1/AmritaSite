/**
 * Copyright 2019 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.amritasite.apps.controller;

import com.amritasite.apps.model.FoodAllergy;
import com.amritasite.apps.repository.FoodAllergyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Amrita Ghosh (aghosh@expedia.com)
 */
@RestController
@RequestMapping("api/v1/")
public class FoodAllergyController {

    @Autowired
    private FoodAllergyRepo foodAllergyRepo;

    @RequestMapping(value = "foodallergies", method = RequestMethod.GET)
    public List<FoodAllergy> list() {
        return foodAllergyRepo.list();

    }

    @RequestMapping(value = "foodallergies", method = RequestMethod.POST)
    public FoodAllergy add(@RequestBody FoodAllergy foodAllergy) {
        return foodAllergyRepo.add(foodAllergy);

    }

    @RequestMapping(value = "foodallergies/{id}", method = RequestMethod.GET)
    public FoodAllergy view(@PathVariable Long id) {
        return foodAllergyRepo.view(id);

    }

    @RequestMapping(value = "foodallergies/{id}", method = RequestMethod.PUT)
    public FoodAllergy update(@PathVariable Long id, @RequestBody FoodAllergy foodAllergy) {
        return foodAllergyRepo.update(id, foodAllergy);

    }

    @RequestMapping(value = "foodallergies/{id}", method = RequestMethod.DELETE)
    public FoodAllergy delete(@PathVariable Long id) {
        return foodAllergyRepo.delete(id);
    }
}
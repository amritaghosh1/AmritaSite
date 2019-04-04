/**
 * Copyright 2019 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.amritasite.apps.repository;

import com.amritasite.apps.model.FoodAllergy;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Amrita Ghosh (aghosh@expedia.com)
 */

@Repository
public class FoodAllergyRepo {

    private Map<Long, FoodAllergy> foodAllergyData;

    public FoodAllergyRepo() {
        this.foodAllergyData = new HashMap<>();
    }

    public List<FoodAllergy> list() {
        return new ArrayList<>(foodAllergyData.values());
    }

    public FoodAllergy add (FoodAllergy foodAllergy ) {
        Long id = Collections.max(foodAllergyData.keySet()) + 1;
        foodAllergyData.put(id, foodAllergy);
        return foodAllergy;
    }

    public FoodAllergy view (Long id) {
        return foodAllergyData.get(id);
    }

    public FoodAllergy update (Long id, FoodAllergy foodAllergy) {
        foodAllergyData.put(id, foodAllergy);
        return  foodAllergy;
    }

    public  FoodAllergy delete (Long id) {
        FoodAllergy foodAllergy = foodAllergyData.get(id);
        foodAllergyData.remove(id);
        return foodAllergy;
    }
}
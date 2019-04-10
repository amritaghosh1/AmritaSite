/**
 * Copyright 2019 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.amritasite.apps.model;

import java.time.Instant;

/**
 * @author Amrita Ghosh (aghosh@expedia.com)
 */
public class FoodAllergy {
    String food;
    Instant givenTime;
    String reaction;
    Instant reactionNoticedTime;
    Instant stoppedTime;
    String comment;
}
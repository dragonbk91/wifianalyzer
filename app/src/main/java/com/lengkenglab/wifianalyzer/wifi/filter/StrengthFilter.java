/*
 * WiFiAnalyzer
 * Copyright (C) 2017  VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.lengkenglab.wifianalyzer.wifi.filter;

import android.app.Dialog;
import android.support.annotation.NonNull;

import com.lengkenglab.wifianalyzer.R;
import com.lengkenglab.wifianalyzer.wifi.filter.adapter.EnumFilterAdapter;
import com.lengkenglab.wifianalyzer.wifi.model.Strength;

import java.util.HashMap;
import java.util.Map;

class StrengthFilter extends EnumFilter<Strength, EnumFilterAdapter<Strength>> {
    static final Map<Strength, Integer> ids = new HashMap<>();

    static {
        ids.put(Strength.ZERO, R.id.filterStrength0);
        ids.put(Strength.ONE, R.id.filterStrength1);
        ids.put(Strength.TWO, R.id.filterStrength2);
        ids.put(Strength.THREE, R.id.filterStrength3);
        ids.put(Strength.FOUR, R.id.filterStrength4);
    }

    StrengthFilter(@NonNull EnumFilterAdapter<Strength> filterAdapter, @NonNull Dialog dialog) {
        super(ids, filterAdapter, dialog, R.id.filterStrength);
    }
}

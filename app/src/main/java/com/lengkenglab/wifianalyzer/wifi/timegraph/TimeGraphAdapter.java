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

package com.lengkenglab.wifianalyzer.wifi.timegraph;

import com.lengkenglab.util.EnumUtils;
import com.lengkenglab.wifianalyzer.wifi.band.WiFiBand;
import com.lengkenglab.wifianalyzer.wifi.graphutils.GraphAdapter;
import com.lengkenglab.wifianalyzer.wifi.graphutils.GraphViewNotifier;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;

import java.util.ArrayList;
import java.util.List;

class TimeGraphAdapter extends GraphAdapter {
    TimeGraphAdapter() {
        super(makeGraphViewNotifiers());
    }

    private static List<GraphViewNotifier> makeGraphViewNotifiers() {
        return new ArrayList<>(CollectionUtils.collect(EnumUtils.values(WiFiBand.class), new ToGraphViewNotifier()));
    }

    private static class ToGraphViewNotifier implements Transformer<WiFiBand, GraphViewNotifier> {
        @Override
        public GraphViewNotifier transform(WiFiBand input) {
            return new TimeGraphView(input);
        }
    }

}

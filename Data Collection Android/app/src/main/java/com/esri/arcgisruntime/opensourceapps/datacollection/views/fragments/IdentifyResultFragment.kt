/*
 * Copyright 2020 Esri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.esri.arcgisruntime.opensourceapps.datacollection.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.esri.arcgisruntime.opensourceapps.datacollection.R
import com.esri.arcgisruntime.opensourceapps.datacollection.databinding.FragmentIdentifyResultBinding
import com.esri.arcgisruntime.opensourceapps.datacollection.viewmodels.IdentifyResultViewModel

/**
 * Responsible for displaying properties of the resulting GeoElement of an identify operation in
 * the bottom sheet.
 */
class IdentifyResultFragment : Fragment() {

    private val viewModel: IdentifyResultViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentIdentifyResultBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_identify_result,
            container,
            false
        )

        binding.identifyResultViewModel = viewModel
        binding.lifecycleOwner = this

        return binding.root
    }

}

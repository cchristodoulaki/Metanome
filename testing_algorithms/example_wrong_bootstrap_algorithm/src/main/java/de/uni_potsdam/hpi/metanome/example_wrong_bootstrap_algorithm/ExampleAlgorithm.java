/*
 * Copyright 2014 by the Metanome project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.uni_potsdam.hpi.metanome.example_wrong_bootstrap_algorithm;

import de.uni_potsdam.hpi.metanome.algorithm_integration.AlgorithmExecutionException;
import de.uni_potsdam.hpi.metanome.algorithm_integration.algorithm_types.UniqueColumnCombinationsAlgorithm;
import de.uni_potsdam.hpi.metanome.algorithm_integration.configuration.ConfigurationSpecification;
import de.uni_potsdam.hpi.metanome.algorithm_integration.result_receiver.UniqueColumnCombinationResultReceiver;

import java.util.LinkedList;
import java.util.List;

public class ExampleAlgorithm implements UniqueColumnCombinationsAlgorithm {

    @Override
    public List<ConfigurationSpecification> getConfigurationRequirements() {
        return new LinkedList<>();
    }

    @Override
    public void execute() throws AlgorithmExecutionException {

    }

    @Override
    public void setResultReceiver(UniqueColumnCombinationResultReceiver resultReceiver) {

    }

}

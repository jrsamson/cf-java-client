/*
 * Copyright 2013-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.client.v3.packages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.cloudfoundry.Nullable;
import org.immutables.value.Value;

/**
 * Data type for docker packages
 */
@JsonDeserialize
@Value.Immutable
abstract class _DockerData implements PackageData {

    /**
     * The Docker image
     */
    @JsonProperty("image")
    abstract String getImage();

    /**
     * The password for the image's registry
     */
    @JsonProperty("password")
    @Nullable
    abstract String getPassword();

    /**
     * The username for the image's registry
     */
    @JsonProperty("username")
    @Nullable
    abstract String getUsername();

}

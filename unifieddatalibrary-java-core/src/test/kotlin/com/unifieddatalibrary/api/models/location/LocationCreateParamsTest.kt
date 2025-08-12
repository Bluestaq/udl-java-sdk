// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.location

import com.unifieddatalibrary.api.models.location.LocationCreateParams
import com.unifieddatalibrary.api.models.location.LocationIngest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationCreateParamsTest {

    @Test
    fun create() {
      LocationCreateParams.builder()
          .locationIngest(LocationIngest.builder()
              .classificationMarking("U")
              .dataMode(LocationIngest.DataMode.TEST)
              .name("Example location")
              .source("Bluestaq")
              .altitude(10.23)
              .countryCode("US")
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .idLocation("LOCATION-ID")
              .lat(45.23)
              .lon(179.1)
              .origin("THIRD_PARTY_DATASOURCE")
              .origNetwork("OPS1")
              .build())
          .build()
    }

    @Test
    fun body() {
      val params = LocationCreateParams.builder()
          .locationIngest(LocationIngest.builder()
              .classificationMarking("U")
              .dataMode(LocationIngest.DataMode.TEST)
              .name("Example location")
              .source("Bluestaq")
              .altitude(10.23)
              .countryCode("US")
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .idLocation("LOCATION-ID")
              .lat(45.23)
              .lon(179.1)
              .origin("THIRD_PARTY_DATASOURCE")
              .origNetwork("OPS1")
              .build())
          .build()

      val body = params._body()

      assertThat(body).isEqualTo(LocationIngest.builder()
          .classificationMarking("U")
          .dataMode(LocationIngest.DataMode.TEST)
          .name("Example location")
          .source("Bluestaq")
          .altitude(10.23)
          .countryCode("US")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .idLocation("LOCATION-ID")
          .lat(45.23)
          .lon(179.1)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = LocationCreateParams.builder()
          .locationIngest(LocationIngest.builder()
              .classificationMarking("U")
              .dataMode(LocationIngest.DataMode.TEST)
              .name("Example location")
              .source("Bluestaq")
              .build())
          .build()

      val body = params._body()

      assertThat(body).isEqualTo(LocationIngest.builder()
          .classificationMarking("U")
          .dataMode(LocationIngest.DataMode.TEST)
          .name("Example location")
          .source("Bluestaq")
          .build())
    }
}

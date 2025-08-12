// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbit

import com.unifieddatalibrary.api.models.onorbit.OnorbitIngest
import com.unifieddatalibrary.api.models.onorbit.OnorbitUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitUpdateParamsTest {

    @Test
    fun create() {
      OnorbitUpdateParams.builder()
          .id("id")
          .onorbitIngest(OnorbitIngest.builder()
              .classificationMarking("U")
              .dataMode(OnorbitIngest.DataMode.TEST)
              .satNo(1)
              .source("Bluestaq")
              .altName("Alternate Name")
              .category(OnorbitIngest.Category.LUNAR)
              .commonName("Example common name")
              .constellation("Big Dipper")
              .countryCode("US")
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .decayDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .idOnOrbit("ONORBIT-ID")
              .intlDes("2021123ABC")
              .launchDate(LocalDate.parse("2018-01-01"))
              .launchSiteId("LAUNCHSITE-ID")
              .lifetimeYears(10)
              .missionNumber("Expedition 1")
              .objectType(OnorbitIngest.ObjectType.PAYLOAD)
              .origin("THIRD_PARTY_DATASOURCE")
              .origNetwork("OPS1")
              .build())
          .build()
    }

    @Test
    fun pathParams() {
      val params = OnorbitUpdateParams.builder()
          .id("id")
          .onorbitIngest(OnorbitIngest.builder()
              .classificationMarking("U")
              .dataMode(OnorbitIngest.DataMode.TEST)
              .satNo(1)
              .source("Bluestaq")
              .build())
          .build()

      assertThat(params._pathParam(0)).isEqualTo("id")
      // out-of-bound path param
      assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
      val params = OnorbitUpdateParams.builder()
          .id("id")
          .onorbitIngest(OnorbitIngest.builder()
              .classificationMarking("U")
              .dataMode(OnorbitIngest.DataMode.TEST)
              .satNo(1)
              .source("Bluestaq")
              .altName("Alternate Name")
              .category(OnorbitIngest.Category.LUNAR)
              .commonName("Example common name")
              .constellation("Big Dipper")
              .countryCode("US")
              .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .createdBy("some.user")
              .decayDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
              .idOnOrbit("ONORBIT-ID")
              .intlDes("2021123ABC")
              .launchDate(LocalDate.parse("2018-01-01"))
              .launchSiteId("LAUNCHSITE-ID")
              .lifetimeYears(10)
              .missionNumber("Expedition 1")
              .objectType(OnorbitIngest.ObjectType.PAYLOAD)
              .origin("THIRD_PARTY_DATASOURCE")
              .origNetwork("OPS1")
              .build())
          .build()

      val body = params._body()

      assertThat(body).isEqualTo(OnorbitIngest.builder()
          .classificationMarking("U")
          .dataMode(OnorbitIngest.DataMode.TEST)
          .satNo(1)
          .source("Bluestaq")
          .altName("Alternate Name")
          .category(OnorbitIngest.Category.LUNAR)
          .commonName("Example common name")
          .constellation("Big Dipper")
          .countryCode("US")
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .decayDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .idOnOrbit("ONORBIT-ID")
          .intlDes("2021123ABC")
          .launchDate(LocalDate.parse("2018-01-01"))
          .launchSiteId("LAUNCHSITE-ID")
          .lifetimeYears(10)
          .missionNumber("Expedition 1")
          .objectType(OnorbitIngest.ObjectType.PAYLOAD)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("OPS1")
          .build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = OnorbitUpdateParams.builder()
          .id("id")
          .onorbitIngest(OnorbitIngest.builder()
              .classificationMarking("U")
              .dataMode(OnorbitIngest.DataMode.TEST)
              .satNo(1)
              .source("Bluestaq")
              .build())
          .build()

      val body = params._body()

      assertThat(body).isEqualTo(OnorbitIngest.builder()
          .classificationMarking("U")
          .dataMode(OnorbitIngest.DataMode.TEST)
          .satNo(1)
          .source("Bluestaq")
          .build())
    }
}

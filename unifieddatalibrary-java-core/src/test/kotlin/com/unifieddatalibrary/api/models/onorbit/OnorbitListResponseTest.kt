// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbit

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitListResponseTest {

    @Test
    fun create() {
        val onorbitListResponse =
            OnorbitListResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitListResponse.DataMode.TEST)
                .satNo(1)
                .source("Bluestaq")
                .altName("Alternate Name")
                .category(OnorbitListResponse.Category.LUNAR)
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
                .objectType(OnorbitListResponse.ObjectType.PAYLOAD)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        assertThat(onorbitListResponse.classificationMarking()).isEqualTo("U")
        assertThat(onorbitListResponse.dataMode()).isEqualTo(OnorbitListResponse.DataMode.TEST)
        assertThat(onorbitListResponse.satNo()).isEqualTo(1)
        assertThat(onorbitListResponse.source()).isEqualTo("Bluestaq")
        assertThat(onorbitListResponse.altName()).contains("Alternate Name")
        assertThat(onorbitListResponse.category()).contains(OnorbitListResponse.Category.LUNAR)
        assertThat(onorbitListResponse.commonName()).contains("Example common name")
        assertThat(onorbitListResponse.constellation()).contains("Big Dipper")
        assertThat(onorbitListResponse.countryCode()).contains("US")
        assertThat(onorbitListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitListResponse.createdBy()).contains("some.user")
        assertThat(onorbitListResponse.decayDate())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitListResponse.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(onorbitListResponse.intlDes()).contains("2021123ABC")
        assertThat(onorbitListResponse.launchDate()).contains(LocalDate.parse("2018-01-01"))
        assertThat(onorbitListResponse.launchSiteId()).contains("LAUNCHSITE-ID")
        assertThat(onorbitListResponse.lifetimeYears()).contains(10)
        assertThat(onorbitListResponse.missionNumber()).contains("Expedition 1")
        assertThat(onorbitListResponse.objectType())
            .contains(OnorbitListResponse.ObjectType.PAYLOAD)
        assertThat(onorbitListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(onorbitListResponse.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitListResponse =
            OnorbitListResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitListResponse.DataMode.TEST)
                .satNo(1)
                .source("Bluestaq")
                .altName("Alternate Name")
                .category(OnorbitListResponse.Category.LUNAR)
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
                .objectType(OnorbitListResponse.ObjectType.PAYLOAD)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .build()

        val roundtrippedOnorbitListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitListResponse),
                jacksonTypeRef<OnorbitListResponse>(),
            )

        assertThat(roundtrippedOnorbitListResponse).isEqualTo(onorbitListResponse)
    }
}

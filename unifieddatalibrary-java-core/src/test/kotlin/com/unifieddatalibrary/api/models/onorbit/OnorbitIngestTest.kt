// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbit

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitIngestTest {

    @Test
    fun create() {
        val onorbitIngest =
            OnorbitIngest.builder()
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
                .build()

        assertThat(onorbitIngest.classificationMarking()).isEqualTo("U")
        assertThat(onorbitIngest.dataMode()).isEqualTo(OnorbitIngest.DataMode.TEST)
        assertThat(onorbitIngest.satNo()).isEqualTo(1)
        assertThat(onorbitIngest.source()).isEqualTo("Bluestaq")
        assertThat(onorbitIngest.altName()).contains("Alternate Name")
        assertThat(onorbitIngest.category()).contains(OnorbitIngest.Category.LUNAR)
        assertThat(onorbitIngest.commonName()).contains("Example common name")
        assertThat(onorbitIngest.constellation()).contains("Big Dipper")
        assertThat(onorbitIngest.countryCode()).contains("US")
        assertThat(onorbitIngest.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitIngest.createdBy()).contains("some.user")
        assertThat(onorbitIngest.decayDate())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitIngest.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(onorbitIngest.intlDes()).contains("2021123ABC")
        assertThat(onorbitIngest.launchDate()).contains(LocalDate.parse("2018-01-01"))
        assertThat(onorbitIngest.launchSiteId()).contains("LAUNCHSITE-ID")
        assertThat(onorbitIngest.lifetimeYears()).contains(10)
        assertThat(onorbitIngest.missionNumber()).contains("Expedition 1")
        assertThat(onorbitIngest.objectType()).contains(OnorbitIngest.ObjectType.PAYLOAD)
        assertThat(onorbitIngest.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(onorbitIngest.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitIngest =
            OnorbitIngest.builder()
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
                .build()

        val roundtrippedOnorbitIngest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitIngest),
                jacksonTypeRef<OnorbitIngest>(),
            )

        assertThat(roundtrippedOnorbitIngest).isEqualTo(onorbitIngest)
    }
}

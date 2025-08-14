// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onboardnavigation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnboardnavigationListResponseTest {

    @Test
    fun create() {
        val onboardnavigationListResponse =
            OnboardnavigationListResponse.builder()
                .classificationMarking("U")
                .dataMode(OnboardnavigationListResponse.DataMode.TEST)
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2021-07-20T01:02:03.123456Z"))
                .id("ONBOARD-NAVIGATION-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .addDeltaPo(listOf(1.1, 2.2, 3.3))
                .endTime(OffsetDateTime.parse("2021-07-20T01:02:03.123456Z"))
                .esId("EPHEMERISSET-ID")
                .idOnOrbit("ONORBIT-ID")
                .idStateVector("STATE-VECTOR-ID")
                .addMag(listOf(1.1, 2.2, 3.3))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .origObjectId("ORIGOBJECT-ID")
                .referenceFrame(OnboardnavigationListResponse.ReferenceFrame.J2000)
                .satNo(101)
                .starCatLoadTime(OffsetDateTime.parse("2021-07-21T01:02:03.123Z"))
                .starCatName("STAR-CAT-NAME")
                .addStarTracker(listOf(1.1, 2.2, 3.3))
                .addSunSensor(listOf(1.1, 2.2, 3.3))
                .addT(OffsetDateTime.parse("2021-07-21T01:02:03.120003Z"))
                .build()

        assertThat(onboardnavigationListResponse.classificationMarking()).isEqualTo("U")
        assertThat(onboardnavigationListResponse.dataMode())
            .isEqualTo(OnboardnavigationListResponse.DataMode.TEST)
        assertThat(onboardnavigationListResponse.source()).isEqualTo("Bluestaq")
        assertThat(onboardnavigationListResponse.startTime())
            .isEqualTo(OffsetDateTime.parse("2021-07-20T01:02:03.123456Z"))
        assertThat(onboardnavigationListResponse.id()).contains("ONBOARD-NAVIGATION-ID")
        assertThat(onboardnavigationListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onboardnavigationListResponse.createdBy()).contains("some.user")
        assertThat(onboardnavigationListResponse.deltaPos().getOrNull())
            .containsExactly(listOf(1.1, 2.2, 3.3))
        assertThat(onboardnavigationListResponse.endTime())
            .contains(OffsetDateTime.parse("2021-07-20T01:02:03.123456Z"))
        assertThat(onboardnavigationListResponse.esId()).contains("EPHEMERISSET-ID")
        assertThat(onboardnavigationListResponse.idOnOrbit()).contains("ONORBIT-ID")
        assertThat(onboardnavigationListResponse.idStateVector()).contains("STATE-VECTOR-ID")
        assertThat(onboardnavigationListResponse.mag().getOrNull())
            .containsExactly(listOf(1.1, 2.2, 3.3))
        assertThat(onboardnavigationListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(onboardnavigationListResponse.origNetwork()).contains("ORIG")
        assertThat(onboardnavigationListResponse.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(onboardnavigationListResponse.referenceFrame())
            .contains(OnboardnavigationListResponse.ReferenceFrame.J2000)
        assertThat(onboardnavigationListResponse.satNo()).contains(101)
        assertThat(onboardnavigationListResponse.starCatLoadTime())
            .contains(OffsetDateTime.parse("2021-07-21T01:02:03.123Z"))
        assertThat(onboardnavigationListResponse.starCatName()).contains("STAR-CAT-NAME")
        assertThat(onboardnavigationListResponse.starTracker().getOrNull())
            .containsExactly(listOf(1.1, 2.2, 3.3))
        assertThat(onboardnavigationListResponse.sunSensor().getOrNull())
            .containsExactly(listOf(1.1, 2.2, 3.3))
        assertThat(onboardnavigationListResponse.ts().getOrNull())
            .containsExactly(OffsetDateTime.parse("2021-07-21T01:02:03.120003Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onboardnavigationListResponse =
            OnboardnavigationListResponse.builder()
                .classificationMarking("U")
                .dataMode(OnboardnavigationListResponse.DataMode.TEST)
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2021-07-20T01:02:03.123456Z"))
                .id("ONBOARD-NAVIGATION-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .addDeltaPo(listOf(1.1, 2.2, 3.3))
                .endTime(OffsetDateTime.parse("2021-07-20T01:02:03.123456Z"))
                .esId("EPHEMERISSET-ID")
                .idOnOrbit("ONORBIT-ID")
                .idStateVector("STATE-VECTOR-ID")
                .addMag(listOf(1.1, 2.2, 3.3))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .origObjectId("ORIGOBJECT-ID")
                .referenceFrame(OnboardnavigationListResponse.ReferenceFrame.J2000)
                .satNo(101)
                .starCatLoadTime(OffsetDateTime.parse("2021-07-21T01:02:03.123Z"))
                .starCatName("STAR-CAT-NAME")
                .addStarTracker(listOf(1.1, 2.2, 3.3))
                .addSunSensor(listOf(1.1, 2.2, 3.3))
                .addT(OffsetDateTime.parse("2021-07-21T01:02:03.120003Z"))
                .build()

        val roundtrippedOnboardnavigationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onboardnavigationListResponse),
                jacksonTypeRef<OnboardnavigationListResponse>(),
            )

        assertThat(roundtrippedOnboardnavigationListResponse)
            .isEqualTo(onboardnavigationListResponse)
    }
}

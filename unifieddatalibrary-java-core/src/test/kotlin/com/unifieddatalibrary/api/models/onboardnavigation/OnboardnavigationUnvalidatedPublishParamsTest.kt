// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onboardnavigation

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnboardnavigationUnvalidatedPublishParamsTest {

    @Test
    fun create() {
        OnboardnavigationUnvalidatedPublishParams.builder()
            .addBody(
                OnboardnavigationUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(OnboardnavigationUnvalidatedPublishParams.Body.DataMode.TEST)
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
                    .origNetwork("OPS1")
                    .origObjectId("ORIGOBJECT-ID")
                    .referenceFrame(
                        OnboardnavigationUnvalidatedPublishParams.Body.ReferenceFrame.J2000
                    )
                    .satNo(101)
                    .starCatLoadTime(OffsetDateTime.parse("2021-07-21T01:02:03.123Z"))
                    .starCatName("STAR-CAT-NAME")
                    .addStarTracker(listOf(1.1, 2.2, 3.3))
                    .addSunSensor(listOf(1.1, 2.2, 3.3))
                    .addT(OffsetDateTime.parse("2021-07-21T01:02:03.120003Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            OnboardnavigationUnvalidatedPublishParams.builder()
                .addBody(
                    OnboardnavigationUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(OnboardnavigationUnvalidatedPublishParams.Body.DataMode.TEST)
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
                        .origNetwork("OPS1")
                        .origObjectId("ORIGOBJECT-ID")
                        .referenceFrame(
                            OnboardnavigationUnvalidatedPublishParams.Body.ReferenceFrame.J2000
                        )
                        .satNo(101)
                        .starCatLoadTime(OffsetDateTime.parse("2021-07-21T01:02:03.123Z"))
                        .starCatName("STAR-CAT-NAME")
                        .addStarTracker(listOf(1.1, 2.2, 3.3))
                        .addSunSensor(listOf(1.1, 2.2, 3.3))
                        .addT(OffsetDateTime.parse("2021-07-21T01:02:03.120003Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                OnboardnavigationUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(OnboardnavigationUnvalidatedPublishParams.Body.DataMode.TEST)
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
                    .origNetwork("OPS1")
                    .origObjectId("ORIGOBJECT-ID")
                    .referenceFrame(
                        OnboardnavigationUnvalidatedPublishParams.Body.ReferenceFrame.J2000
                    )
                    .satNo(101)
                    .starCatLoadTime(OffsetDateTime.parse("2021-07-21T01:02:03.123Z"))
                    .starCatName("STAR-CAT-NAME")
                    .addStarTracker(listOf(1.1, 2.2, 3.3))
                    .addSunSensor(listOf(1.1, 2.2, 3.3))
                    .addT(OffsetDateTime.parse("2021-07-21T01:02:03.120003Z"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OnboardnavigationUnvalidatedPublishParams.builder()
                .addBody(
                    OnboardnavigationUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(OnboardnavigationUnvalidatedPublishParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .startTime(OffsetDateTime.parse("2021-07-20T01:02:03.123456Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                OnboardnavigationUnvalidatedPublishParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(OnboardnavigationUnvalidatedPublishParams.Body.DataMode.TEST)
                    .source("Bluestaq")
                    .startTime(OffsetDateTime.parse("2021-07-20T01:02:03.123456Z"))
                    .build()
            )
    }
}

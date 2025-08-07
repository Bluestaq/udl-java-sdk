// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationCountParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationCreateBulkParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationListParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationTupleParams
import com.unifieddatalibrary.api.models.onboardnavigation.OnboardnavigationUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnboardnavigationServiceTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onboardnavigationService = client.onboardnavigation()

        val page =
            onboardnavigationService.list(
                OnboardnavigationListParams.builder()
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onboardnavigationService = client.onboardnavigation()

        onboardnavigationService.count(
            OnboardnavigationCountParams.builder()
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onboardnavigationService = client.onboardnavigation()

        onboardnavigationService.createBulk(
            OnboardnavigationCreateBulkParams.builder()
                .addBody(
                    OnboardnavigationCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(OnboardnavigationCreateBulkParams.Body.DataMode.TEST)
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
                        .referenceFrame(OnboardnavigationCreateBulkParams.Body.ReferenceFrame.J2000)
                        .satNo(101)
                        .starCatLoadTime(OffsetDateTime.parse("2021-07-21T01:02:03.123Z"))
                        .starCatName("STAR-CAT-NAME")
                        .addStarTracker(listOf(1.1, 2.2, 3.3))
                        .addSunSensor(listOf(1.1, 2.2, 3.3))
                        .addT(OffsetDateTime.parse("2021-07-21T01:02:03.120003Z"))
                        .build()
                )
                .build()
        )
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onboardnavigationService = client.onboardnavigation()

        val response = onboardnavigationService.queryhelp()

        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onboardnavigationService = client.onboardnavigation()

        val onboardnavigationFulls =
            onboardnavigationService.tuple(
                OnboardnavigationTupleParams.builder()
                    .columns("columns")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        onboardnavigationFulls.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onboardnavigationService = client.onboardnavigation()

        onboardnavigationService.unvalidatedPublish(
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
                        .origNetwork("ORIG")
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
        )
    }
}

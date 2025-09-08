// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.swir.SwirCountParams
import com.unifieddatalibrary.api.models.swir.SwirCreateBulkParams
import com.unifieddatalibrary.api.models.swir.SwirCreateParams
import com.unifieddatalibrary.api.models.swir.SwirGetParams
import com.unifieddatalibrary.api.models.swir.SwirListParams
import com.unifieddatalibrary.api.models.swir.SwirTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SwirServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val swirService = client.swir()

        swirService.create(
            SwirCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SwirCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .id("SWIR-ID")
                .addAbsFlux(1.23)
                .addAbsFlux(4.56)
                .badWave("Example Comments")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .addFluxRatio(1.23)
                .addFluxRatio(4.56)
                .idOnOrbit("45234")
                .lat(70.55208)
                .locationName("AeroTel")
                .lon(81.18191)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("WildBlue-1")
                .addRatioWavelength(1.23)
                .addRatioWavelength(4.56)
                .satNo(25544)
                .solarPhaseAngle(1.23)
                .addWavelength(1.23)
                .addWavelength(4.56)
                .build()
        )
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val swirService = client.swir()

        val page =
            swirService.list(
                SwirListParams.builder()
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val swirService = client.swir()

        swirService.count(
            SwirCountParams.builder()
                .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val swirService = client.swir()

        swirService.createBulk(
            SwirCreateBulkParams.builder()
                .addBody(
                    SwirCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(SwirCreateBulkParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .ts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                        .id("SWIR-ID")
                        .addAbsFlux(1.23)
                        .addAbsFlux(4.56)
                        .badWave("Example Comments")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .addFluxRatio(1.23)
                        .addFluxRatio(4.56)
                        .idOnOrbit("45234")
                        .lat(70.55208)
                        .locationName("AeroTel")
                        .lon(81.18191)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId("WildBlue-1")
                        .addRatioWavelength(1.23)
                        .addRatioWavelength(4.56)
                        .satNo(25544)
                        .solarPhaseAngle(1.23)
                        .addWavelength(1.23)
                        .addWavelength(4.56)
                        .build()
                )
                .build()
        )
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val swirService = client.swir()

        val swirFull =
            swirService.get(SwirGetParams.builder().id("id").firstResult(0L).maxResults(0L).build())

        swirFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val swirService = client.swir()

        val response = swirService.queryhelp()

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
        val swirService = client.swir()

        val swirFulls =
            swirService.tuple(
                SwirTupleParams.builder()
                    .columns("columns")
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        swirFulls.forEach { it.validate() }
    }
}

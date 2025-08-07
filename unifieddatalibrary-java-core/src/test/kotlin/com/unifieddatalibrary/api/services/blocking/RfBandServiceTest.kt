// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.rfband.RfBandCountParams
import com.unifieddatalibrary.api.models.rfband.RfBandCreateParams
import com.unifieddatalibrary.api.models.rfband.RfBandGetParams
import com.unifieddatalibrary.api.models.rfband.RfBandTupleParams
import com.unifieddatalibrary.api.models.rfband.RfBandUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RfBandServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfBandService = client.rfBand()

        rfBandService.create(
            RfBandCreateParams.builder()
                .classificationMarking("U")
                .dataMode(RfBandCreateParams.DataMode.TEST)
                .idEntity("ENTITY-ID")
                .name("BAND_NAME")
                .source("Bluestaq")
                .id("RFBAND-ID")
                .band("Ku")
                .bandwidth(100.23)
                .beamwidth(45.23)
                .centerFreq(1000.23)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .edgeGain(100.23)
                .eirp(2.23)
                .erp(2.23)
                .freqMax(2000.23)
                .freqMin(50.23)
                .mode(RfBandCreateParams.Mode.TX)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .peakGain(120.23)
                .polarization(RfBandCreateParams.Polarization.H)
                .purpose(RfBandCreateParams.Purpose.TTC)
                .build()
        )
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfBandService = client.rfBand()

        rfBandService.update(
            RfBandUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(RfBandUpdateParams.DataMode.TEST)
                .idEntity("ENTITY-ID")
                .name("BAND_NAME")
                .source("Bluestaq")
                .bodyId("RFBAND-ID")
                .band("Ku")
                .bandwidth(100.23)
                .beamwidth(45.23)
                .centerFreq(1000.23)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .edgeGain(100.23)
                .eirp(2.23)
                .erp(2.23)
                .freqMax(2000.23)
                .freqMin(50.23)
                .mode(RfBandUpdateParams.Mode.TX)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .peakGain(120.23)
                .polarization(RfBandUpdateParams.Polarization.H)
                .purpose(RfBandUpdateParams.Purpose.TTC)
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
        val rfBandService = client.rfBand()

        val page = rfBandService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfBandService = client.rfBand()

        rfBandService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfBandService = client.rfBand()

        rfBandService.count(RfBandCountParams.builder().firstResult(0L).maxResults(0L).build())
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfBandService = client.rfBand()

        val rfBandFull =
            rfBandService.get(
                RfBandGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        rfBandFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfBandService = client.rfBand()

        val response = rfBandService.queryhelp()

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
        val rfBandService = client.rfBand()

        val rfBandFulls =
            rfBandService.tuple(
                RfBandTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        rfBandFulls.forEach { it.validate() }
    }
}

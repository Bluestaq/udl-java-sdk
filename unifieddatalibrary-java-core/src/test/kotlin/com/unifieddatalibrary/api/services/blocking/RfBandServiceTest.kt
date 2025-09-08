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
                .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                .band("Ku")
                .bandwidth(100.23)
                .addBandwidthSetting(250.1)
                .addBandwidthSetting(500.1)
                .beamwidth(45.23)
                .addBeamwidthSetting(5.1)
                .addBeamwidthSetting(10.1)
                .centerFreq(1000.23)
                .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                .createdBy("some.user")
                .addDelaySetting(2.77)
                .addDelaySetting(5.64)
                .edgeGain(100.23)
                .eirp(2.23)
                .erp(2.23)
                .freqMax(2000.23)
                .freqMin(50.23)
                .addFrequencySetting(12250.1)
                .addFrequencySetting(15000.1)
                .addGainSetting(2.77)
                .addGainSetting(5.64)
                .mode(RfBandCreateParams.Mode.TX)
                .addNoiseSetting(0.00033)
                .addNoiseSetting(0.0033)
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
                .bodyId("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                .band("Ku")
                .bandwidth(100.23)
                .addBandwidthSetting(250.1)
                .addBandwidthSetting(500.1)
                .beamwidth(45.23)
                .addBeamwidthSetting(5.1)
                .addBeamwidthSetting(10.1)
                .centerFreq(1000.23)
                .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                .createdBy("some.user")
                .addDelaySetting(2.77)
                .addDelaySetting(5.64)
                .edgeGain(100.23)
                .eirp(2.23)
                .erp(2.23)
                .freqMax(2000.23)
                .freqMin(50.23)
                .addFrequencySetting(12250.1)
                .addFrequencySetting(15000.1)
                .addGainSetting(2.77)
                .addGainSetting(5.64)
                .mode(RfBandUpdateParams.Mode.TX)
                .addNoiseSetting(0.00033)
                .addNoiseSetting(0.0033)
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

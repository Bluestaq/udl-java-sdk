// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailCountParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailCreateParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailGetParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailTupleParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RfEmitterDetailServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterDetailService = client.rfEmitterDetails()

        rfEmitterDetailService.create(
            RfEmitterDetailCreateParams.builder()
                .classificationMarking("U")
                .dataMode(RfEmitterDetailCreateParams.DataMode.TEST)
                .idRfEmitter("RFEMITTER-ID")
                .source("Bluestaq")
                .id("RFEMITTERDETAILS-ID")
                .alternateFacilityName("ALTERNATE_FACILITY_NAME")
                .altName("ALTERNATE_NAME")
                .antennaDiameter(20.23)
                .addAntennaSize(1.1)
                .addAntennaSize(2.2)
                .barrageNoiseBandwidth(5.23)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("DESCRIPTION")
                .designator("DESIGNATOR")
                .dopplerNoise(10.23)
                .drfmInstantaneousBandwidth(20.23)
                .family("FAMILY")
                .manufacturerOrgId("MANUFACTURERORG-ID")
                .notes("NOTES")
                .numBits(256)
                .numChannels(10)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .productionFacilityLocationId("PRODUCTIONFACILITYLOCATION-ID")
                .productionFacilityName("PRODUCTION_FACILITY")
                .receiverBandwidth(15.23)
                .receiverSensitivity(10.23)
                .receiverType("RECEIVER_TYPE")
                .secondaryNotes("MORE_NOTES")
                .systemSensitivityEnd(150.23)
                .systemSensitivityStart(50.23)
                .transmitPower(100.23)
                .transmitterBandwidth(0.125)
                .transmitterFrequency(105.9)
                .addUrl("TAG1")
                .addUrl("TAG2")
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
        val rfEmitterDetailService = client.rfEmitterDetails()

        rfEmitterDetailService.update(
            RfEmitterDetailUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(RfEmitterDetailUpdateParams.DataMode.TEST)
                .idRfEmitter("RFEMITTER-ID")
                .source("Bluestaq")
                .bodyId("RFEMITTERDETAILS-ID")
                .alternateFacilityName("ALTERNATE_FACILITY_NAME")
                .altName("ALTERNATE_NAME")
                .antennaDiameter(20.23)
                .addAntennaSize(1.1)
                .addAntennaSize(2.2)
                .barrageNoiseBandwidth(5.23)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("DESCRIPTION")
                .designator("DESIGNATOR")
                .dopplerNoise(10.23)
                .drfmInstantaneousBandwidth(20.23)
                .family("FAMILY")
                .manufacturerOrgId("MANUFACTURERORG-ID")
                .notes("NOTES")
                .numBits(256)
                .numChannels(10)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .productionFacilityLocationId("PRODUCTIONFACILITYLOCATION-ID")
                .productionFacilityName("PRODUCTION_FACILITY")
                .receiverBandwidth(15.23)
                .receiverSensitivity(10.23)
                .receiverType("RECEIVER_TYPE")
                .secondaryNotes("MORE_NOTES")
                .systemSensitivityEnd(150.23)
                .systemSensitivityStart(50.23)
                .transmitPower(100.23)
                .transmitterBandwidth(0.125)
                .transmitterFrequency(105.9)
                .addUrl("TAG1")
                .addUrl("TAG2")
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
        val rfEmitterDetailService = client.rfEmitterDetails()

        val page = rfEmitterDetailService.list()

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
        val rfEmitterDetailService = client.rfEmitterDetails()

        rfEmitterDetailService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterDetailService = client.rfEmitterDetails()

        rfEmitterDetailService.count(
            RfEmitterDetailCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val rfEmitterDetailService = client.rfEmitterDetails()

        val rfEmitterDetail =
            rfEmitterDetailService.get(
                RfEmitterDetailGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        rfEmitterDetail.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterDetailService = client.rfEmitterDetails()

        val response = rfEmitterDetailService.queryhelp()

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
        val rfEmitterDetailService = client.rfEmitterDetails()

        val response =
            rfEmitterDetailService.tuple(
                RfEmitterDetailTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailCountParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailCreateParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailGetParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailTupleParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RfEmitterDetailServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val future =
            rfEmitterDetailServiceAsync.create(
                RfEmitterDetailCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(RfEmitterDetailCreateParams.DataMode.TEST)
                    .idRfEmitter("RFEMITTER-ID")
                    .source("Bluestaq")
                    .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                    .alternateFacilityName("ALTERNATE_FACILITY_NAME")
                    .altName("ALTERNATE_NAME")
                    .amplifier(
                        RfEmitterDetailCreateParams.Amplifier.builder()
                            .deviceIdentifier("1200W_Amplifier_GE")
                            .manufacturer("General Electric")
                            .modelName("Model 2600")
                            .power(1200.1)
                            .build()
                    )
                    .addAntenna(
                        RfEmitterDetailCreateParams.Antenna.builder()
                            .antennaDiameter(20.23)
                            .addAntennaSize(1.1)
                            .addAntennaSize(2.2)
                            .azElFixed(true)
                            .addFeed(
                                RfEmitterDetailCreateParams.Antenna.Feed.builder()
                                    .freqMax(43500.1)
                                    .freqMin(39500.1)
                                    .name("Feed A")
                                    .polarization("HORIZONTAL")
                                    .build()
                            )
                            .fixedAzimuth(5.1)
                            .fixedElevation(10.1)
                            .addMaxAzimuth(359.1)
                            .addMaxAzimuth(359.1)
                            .maxElevation(88.1)
                            .addMinAzimuth(5.1)
                            .addMinAzimuth(7.5)
                            .minElevation(10.1)
                            .name("ds1Rotor")
                            .addReceiverChannel(
                                RfEmitterDetailCreateParams.Antenna.ReceiverChannel.builder()
                                    .bandwidth(0.51)
                                    .channelNum("315")
                                    .deviceIdentifier("MMS1")
                                    .freqMax(43500.1)
                                    .freqMin(39500.1)
                                    .maxBandwidth(100.1)
                                    .minBandwidth(0.05)
                                    .sensitivity(10.23)
                                    .build()
                            )
                            .addTransmitChannel(
                                RfEmitterDetailCreateParams.Antenna.TransmitChannel.builder()
                                    .power(100.23)
                                    .bandwidth(0.125)
                                    .channelNum("12")
                                    .deviceIdentifier("TX1-B4-778")
                                    .freq(42000.1)
                                    .freqMax(43500.1)
                                    .freqMin(39500.1)
                                    .hardwareSampleRate(192000)
                                    .maxBandwidth(100.1)
                                    .maxGain(20.1)
                                    .minBandwidth(0.05)
                                    .minGain(0.1)
                                    .addSampleRate(192000.0)
                                    .addSampleRate(9216000.0)
                                    .build()
                            )
                            .build()
                    )
                    .barrageNoiseBandwidth(5.23)
                    .bitRunTime(120.1)
                    .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                    .createdBy("some.user")
                    .description("DESCRIPTION")
                    .designator("DESIGNATOR")
                    .dopplerNoise(10.23)
                    .drfmInstantaneousBandwidth(20.23)
                    .family("FAMILY")
                    .fixedAttenuation(5.1)
                    .idManufacturerOrg("MANUFACTURERORG-ID")
                    .idProductionFacilityLocation("PRODUCTIONFACILITYLOCATION-ID")
                    .loanedToCocom("SPACEFOR-STRATNORTH")
                    .notes("NOTES")
                    .numBits(256)
                    .numChannels(10)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .addPowerOffset(
                        RfEmitterDetailCreateParams.PowerOffset.builder()
                            .frequencyBand("KU")
                            .powerOffset(-5.1)
                            .build()
                    )
                    .prepTime(60.1)
                    .primaryCocom("SPACESOC")
                    .productionFacilityName("PRODUCTION_FACILITY")
                    .receiverType("RECEIVER_TYPE")
                    .secondaryNotes("MORE_NOTES")
                    .addService(
                        RfEmitterDetailCreateParams.Service.builder()
                            .name("tlc-freqcontrol")
                            .version("17.2.5_build72199")
                            .build()
                    )
                    .systemSensitivityEnd(150.23)
                    .systemSensitivityStart(50.32)
                    .addTtp(
                        RfEmitterDetailCreateParams.Ttp.builder()
                            .outputSignalName("SIGNAL_A")
                            .addTechniqueDefinition(
                                RfEmitterDetailCreateParams.Ttp.TechniqueDefinition.builder()
                                    .name("SIGNAL TUNE")
                                    .addParamDefinition(
                                        RfEmitterDetailCreateParams.Ttp.TechniqueDefinition
                                            .ParamDefinition
                                            .builder()
                                            .defaultValue("444.0")
                                            .max(1000.1)
                                            .min(0.1)
                                            .name("CENTER_FREQ")
                                            .optional(false)
                                            .type("DOUBLE")
                                            .units("hertz")
                                            .validValues(listOf("100.1", "444.1", "1000.1"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .addUrl("TAG1")
                    .addUrl("TAG2")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val future =
            rfEmitterDetailServiceAsync.update(
                RfEmitterDetailUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(RfEmitterDetailUpdateParams.DataMode.TEST)
                    .idRfEmitter("RFEMITTER-ID")
                    .source("Bluestaq")
                    .bodyId("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                    .alternateFacilityName("ALTERNATE_FACILITY_NAME")
                    .altName("ALTERNATE_NAME")
                    .amplifier(
                        RfEmitterDetailUpdateParams.Amplifier.builder()
                            .deviceIdentifier("1200W_Amplifier_GE")
                            .manufacturer("General Electric")
                            .modelName("Model 2600")
                            .power(1200.1)
                            .build()
                    )
                    .addAntenna(
                        RfEmitterDetailUpdateParams.Antenna.builder()
                            .antennaDiameter(20.23)
                            .addAntennaSize(1.1)
                            .addAntennaSize(2.2)
                            .azElFixed(true)
                            .addFeed(
                                RfEmitterDetailUpdateParams.Antenna.Feed.builder()
                                    .freqMax(43500.1)
                                    .freqMin(39500.1)
                                    .name("Feed A")
                                    .polarization("HORIZONTAL")
                                    .build()
                            )
                            .fixedAzimuth(5.1)
                            .fixedElevation(10.1)
                            .addMaxAzimuth(359.1)
                            .addMaxAzimuth(359.1)
                            .maxElevation(88.1)
                            .addMinAzimuth(5.1)
                            .addMinAzimuth(7.5)
                            .minElevation(10.1)
                            .name("ds1Rotor")
                            .addReceiverChannel(
                                RfEmitterDetailUpdateParams.Antenna.ReceiverChannel.builder()
                                    .bandwidth(0.51)
                                    .channelNum("315")
                                    .deviceIdentifier("MMS1")
                                    .freqMax(43500.1)
                                    .freqMin(39500.1)
                                    .maxBandwidth(100.1)
                                    .minBandwidth(0.05)
                                    .sensitivity(10.23)
                                    .build()
                            )
                            .addTransmitChannel(
                                RfEmitterDetailUpdateParams.Antenna.TransmitChannel.builder()
                                    .power(100.23)
                                    .bandwidth(0.125)
                                    .channelNum("12")
                                    .deviceIdentifier("TX1-B4-778")
                                    .freq(42000.1)
                                    .freqMax(43500.1)
                                    .freqMin(39500.1)
                                    .hardwareSampleRate(192000)
                                    .maxBandwidth(100.1)
                                    .maxGain(20.1)
                                    .minBandwidth(0.05)
                                    .minGain(0.1)
                                    .addSampleRate(192000.0)
                                    .addSampleRate(9216000.0)
                                    .build()
                            )
                            .build()
                    )
                    .barrageNoiseBandwidth(5.23)
                    .bitRunTime(120.1)
                    .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                    .createdBy("some.user")
                    .description("DESCRIPTION")
                    .designator("DESIGNATOR")
                    .dopplerNoise(10.23)
                    .drfmInstantaneousBandwidth(20.23)
                    .family("FAMILY")
                    .fixedAttenuation(5.1)
                    .idManufacturerOrg("MANUFACTURERORG-ID")
                    .idProductionFacilityLocation("PRODUCTIONFACILITYLOCATION-ID")
                    .loanedToCocom("SPACEFOR-STRATNORTH")
                    .notes("NOTES")
                    .numBits(256)
                    .numChannels(10)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .addPowerOffset(
                        RfEmitterDetailUpdateParams.PowerOffset.builder()
                            .frequencyBand("KU")
                            .powerOffset(-5.1)
                            .build()
                    )
                    .prepTime(60.1)
                    .primaryCocom("SPACESOC")
                    .productionFacilityName("PRODUCTION_FACILITY")
                    .receiverType("RECEIVER_TYPE")
                    .secondaryNotes("MORE_NOTES")
                    .addService(
                        RfEmitterDetailUpdateParams.Service.builder()
                            .name("tlc-freqcontrol")
                            .version("17.2.5_build72199")
                            .build()
                    )
                    .systemSensitivityEnd(150.23)
                    .systemSensitivityStart(50.32)
                    .addTtp(
                        RfEmitterDetailUpdateParams.Ttp.builder()
                            .outputSignalName("SIGNAL_A")
                            .addTechniqueDefinition(
                                RfEmitterDetailUpdateParams.Ttp.TechniqueDefinition.builder()
                                    .name("SIGNAL TUNE")
                                    .addParamDefinition(
                                        RfEmitterDetailUpdateParams.Ttp.TechniqueDefinition
                                            .ParamDefinition
                                            .builder()
                                            .defaultValue("444.0")
                                            .max(1000.1)
                                            .min(0.1)
                                            .name("CENTER_FREQ")
                                            .optional(false)
                                            .type("DOUBLE")
                                            .units("hertz")
                                            .validValues(listOf("100.1", "444.1", "1000.1"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .addUrl("TAG1")
                    .addUrl("TAG2")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val pageFuture = rfEmitterDetailServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val future = rfEmitterDetailServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val responseFuture =
            rfEmitterDetailServiceAsync.count(
                RfEmitterDetailCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val rfEmitterDetailFuture =
            rfEmitterDetailServiceAsync.get(
                RfEmitterDetailGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val rfEmitterDetail = rfEmitterDetailFuture.get()
        rfEmitterDetail.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val responseFuture = rfEmitterDetailServiceAsync.queryhelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val responseFuture =
            rfEmitterDetailServiceAsync.tuple(
                RfEmitterDetailTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}

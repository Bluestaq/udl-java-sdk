// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.rfemitter

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.rfemitter.details.DetailCountParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailCreateParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailGetParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailTupleParams
import com.unifieddatalibrary.api.models.rfemitter.details.DetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DetailServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val detailServiceAsync = client.rfEmitter().details()

        val future =
            detailServiceAsync.create(
                DetailCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(DetailCreateParams.DataMode.TEST)
                    .idRfEmitter("RFEMITTER-ID")
                    .source("Bluestaq")
                    .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                    .alternateFacilityName("ALTERNATE_FACILITY_NAME")
                    .altName("ALTERNATE_NAME")
                    .amplifier(
                        DetailCreateParams.Amplifier.builder()
                            .deviceIdentifier("1200W_Amplifier_GE")
                            .manufacturer("General Electric")
                            .modelName("Model 2600")
                            .power(1200.1)
                            .build()
                    )
                    .addAntenna(
                        DetailCreateParams.Antenna.builder()
                            .antennaDiameter(20.23)
                            .addAntennaSize(1.1)
                            .addAntennaSize(2.2)
                            .azElFixed(true)
                            .addFeed(
                                DetailCreateParams.Antenna.Feed.builder()
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
                                DetailCreateParams.Antenna.ReceiverChannel.builder()
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
                                DetailCreateParams.Antenna.TransmitChannel.builder()
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
                        DetailCreateParams.PowerOffset.builder()
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
                        DetailCreateParams.Service.builder()
                            .name("tlc-freqcontrol")
                            .version("17.2.5_build72199")
                            .build()
                    )
                    .systemSensitivityEnd(150.23)
                    .systemSensitivityStart(50.32)
                    .addTtp(
                        DetailCreateParams.Ttp.builder()
                            .outputSignalName("SIGNAL_A")
                            .addTechniqueDefinition(
                                DetailCreateParams.Ttp.TechniqueDefinition.builder()
                                    .name("SIGNAL TUNE")
                                    .addParamDefinition(
                                        DetailCreateParams.Ttp.TechniqueDefinition.ParamDefinition
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
        val detailServiceAsync = client.rfEmitter().details()

        val future =
            detailServiceAsync.update(
                DetailUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(DetailUpdateParams.DataMode.TEST)
                    .idRfEmitter("RFEMITTER-ID")
                    .source("Bluestaq")
                    .bodyId("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                    .alternateFacilityName("ALTERNATE_FACILITY_NAME")
                    .altName("ALTERNATE_NAME")
                    .amplifier(
                        DetailUpdateParams.Amplifier.builder()
                            .deviceIdentifier("1200W_Amplifier_GE")
                            .manufacturer("General Electric")
                            .modelName("Model 2600")
                            .power(1200.1)
                            .build()
                    )
                    .addAntenna(
                        DetailUpdateParams.Antenna.builder()
                            .antennaDiameter(20.23)
                            .addAntennaSize(1.1)
                            .addAntennaSize(2.2)
                            .azElFixed(true)
                            .addFeed(
                                DetailUpdateParams.Antenna.Feed.builder()
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
                                DetailUpdateParams.Antenna.ReceiverChannel.builder()
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
                                DetailUpdateParams.Antenna.TransmitChannel.builder()
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
                        DetailUpdateParams.PowerOffset.builder()
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
                        DetailUpdateParams.Service.builder()
                            .name("tlc-freqcontrol")
                            .version("17.2.5_build72199")
                            .build()
                    )
                    .systemSensitivityEnd(150.23)
                    .systemSensitivityStart(50.32)
                    .addTtp(
                        DetailUpdateParams.Ttp.builder()
                            .outputSignalName("SIGNAL_A")
                            .addTechniqueDefinition(
                                DetailUpdateParams.Ttp.TechniqueDefinition.builder()
                                    .name("SIGNAL TUNE")
                                    .addParamDefinition(
                                        DetailUpdateParams.Ttp.TechniqueDefinition.ParamDefinition
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
        val detailServiceAsync = client.rfEmitter().details()

        val pageFuture = detailServiceAsync.list()

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
        val detailServiceAsync = client.rfEmitter().details()

        val future = detailServiceAsync.delete("id")

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
        val detailServiceAsync = client.rfEmitter().details()

        val responseFuture =
            detailServiceAsync.count(
                DetailCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val detailServiceAsync = client.rfEmitter().details()

        val detailFuture =
            detailServiceAsync.get(
                DetailGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val detail = detailFuture.get()
        detail.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val detailServiceAsync = client.rfEmitter().details()

        val responseFuture = detailServiceAsync.queryhelp()

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
        val detailServiceAsync = client.rfEmitter().details()

        val responseFuture =
            detailServiceAsync.tuple(
                DetailTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}

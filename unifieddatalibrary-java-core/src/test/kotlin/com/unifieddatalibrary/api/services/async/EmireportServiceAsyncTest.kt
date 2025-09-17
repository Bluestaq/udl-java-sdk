// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.emireport.EmireportCountParams
import com.unifieddatalibrary.api.models.emireport.EmireportCreateBulkParams
import com.unifieddatalibrary.api.models.emireport.EmireportCreateParams
import com.unifieddatalibrary.api.models.emireport.EmireportGetParams
import com.unifieddatalibrary.api.models.emireport.EmireportListParams
import com.unifieddatalibrary.api.models.emireport.EmireportTupleParams
import com.unifieddatalibrary.api.models.emireport.EmireportUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmireportServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emireportServiceAsync = client.emireport()

        val future =
            emireportServiceAsync.create(
                EmireportCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(EmireportCreateParams.DataMode.TEST)
                    .isr(true)
                    .reportId("REPORT-ID")
                    .reportTime(OffsetDateTime.parse("2025-01-07T21:47:40.438Z"))
                    .reportType("SATCOM")
                    .requestAssist(true)
                    .source("Bluestaq")
                    .startTime(OffsetDateTime.parse("2025-01-07T20:16:03.989Z"))
                    .id("026dd511-8ba5-47d3-9909-836149f87686")
                    .actionsTaken("verified connections, cables and antenna pointing angles")
                    .affActivity("UPLINK")
                    .alt(1750.0)
                    .aor("NORTHCOM")
                    .band("SHF")
                    .beamPattern("MAIN LOBE")
                    .channel("10C-10CU")
                    .chanPirate(false)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .description("Interference on channel")
                    .dneImpact(
                        "Text description of the duration, nature and extent (DNE) of the impact."
                    )
                    .emiType("BARRAGE")
                    .endTime(OffsetDateTime.parse("2025-01-07T21:30:51.672Z"))
                    .frequency(1575.42)
                    .geoLocErrEllp(listOf(1300.0, 700.0, 35.0))
                    .gpsEncrypted(false)
                    .gpsFreq("L1")
                    .highAffectedFrequency(1725.0)
                    .idOnOrbit("25724")
                    .intercept(false)
                    .interceptLang("ENGLISH")
                    .interceptType("VOICE")
                    .intSrcAmplitude(0.275)
                    .intSrcBandwidth(30.0)
                    .intSrcCentFreq(485.7)
                    .intSrcEncrypted(false)
                    .intSrcModulation("FSK")
                    .isrCollectionImpact(false)
                    .killBox("7F9SW")
                    .lat(38.7375)
                    .link("SPOT-21")
                    .lon(-104.7889)
                    .milGrid("4QFJ12345678")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .origObjectId("25724")
                    .persistence("CONTINUOUS")
                    .platform("CVN-78")
                    .rcvrDemod("FSK")
                    .rcvrGain(23.7)
                    .rcvrLocation("FORT CARSON GARAGE")
                    .rcvrType("OMNI")
                    .respService("ARMY")
                    .satcomPriority("HIGH")
                    .satDownlinkFrequency(47432.5)
                    .satDownlinkPolarization("V")
                    .satName("MILSTAR DFS-3")
                    .satNo(25724)
                    .satTransponderId("36097-8433-10C")
                    .satUplinkFrequency(44532.1)
                    .satUplinkPolarization("H")
                    .sourceDl("AXE")
                    .status("INITIAL")
                    .supportedIsrRole("IMAGERY")
                    .system("RADIO")
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .transactionId("TRANSACTION-ID")
                    .victimAltCountry("US")
                    .victimCountryCode("US")
                    .victimFuncImpacts("C2")
                    .victimPocMail("bob@jammer.com")
                    .victimPocName("Robert Smith")
                    .victimPocPhone("7198675309")
                    .victimPocUnit("4th Engineering Battalion")
                    .victimReaction("TROUBLESHOOT")
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
        val emireportServiceAsync = client.emireport()

        val pageFuture =
            emireportServiceAsync.list(
                EmireportListParams.builder()
                    .reportTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emireportServiceAsync = client.emireport()

        val responseFuture =
            emireportServiceAsync.count(
                EmireportCountParams.builder()
                    .reportTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emireportServiceAsync = client.emireport()

        val future =
            emireportServiceAsync.createBulk(
                EmireportCreateBulkParams.builder()
                    .addBody(
                        EmireportCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(EmireportCreateBulkParams.Body.DataMode.TEST)
                            .isr(true)
                            .reportId("REPORT-ID")
                            .reportTime(OffsetDateTime.parse("2025-01-07T21:47:40.438Z"))
                            .reportType("SATCOM")
                            .requestAssist(true)
                            .source("Bluestaq")
                            .startTime(OffsetDateTime.parse("2025-01-07T20:16:03.989Z"))
                            .id("026dd511-8ba5-47d3-9909-836149f87686")
                            .actionsTaken(
                                "verified connections, cables and antenna pointing angles"
                            )
                            .affActivity("UPLINK")
                            .alt(1750.0)
                            .aor("NORTHCOM")
                            .band("SHF")
                            .beamPattern("MAIN LOBE")
                            .channel("10C-10CU")
                            .chanPirate(false)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .description("Interference on channel")
                            .dneImpact(
                                "Text description of the duration, nature and extent (DNE) of the impact."
                            )
                            .emiType("BARRAGE")
                            .endTime(OffsetDateTime.parse("2025-01-07T21:30:51.672Z"))
                            .frequency(1575.42)
                            .geoLocErrEllp(listOf(1300.0, 700.0, 35.0))
                            .gpsEncrypted(false)
                            .gpsFreq("L1")
                            .highAffectedFrequency(1725.0)
                            .idOnOrbit("25724")
                            .intercept(false)
                            .interceptLang("ENGLISH")
                            .interceptType("VOICE")
                            .intSrcAmplitude(0.275)
                            .intSrcBandwidth(30.0)
                            .intSrcCentFreq(485.7)
                            .intSrcEncrypted(false)
                            .intSrcModulation("FSK")
                            .isrCollectionImpact(false)
                            .killBox("7F9SW")
                            .lat(38.7375)
                            .link("SPOT-21")
                            .lon(-104.7889)
                            .milGrid("4QFJ12345678")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .origObjectId("25724")
                            .persistence("CONTINUOUS")
                            .platform("CVN-78")
                            .rcvrDemod("FSK")
                            .rcvrGain(23.7)
                            .rcvrLocation("FORT CARSON GARAGE")
                            .rcvrType("OMNI")
                            .respService("ARMY")
                            .satcomPriority("HIGH")
                            .satDownlinkFrequency(47432.5)
                            .satDownlinkPolarization("V")
                            .satName("MILSTAR DFS-3")
                            .satNo(25724)
                            .satTransponderId("36097-8433-10C")
                            .satUplinkFrequency(44532.1)
                            .satUplinkPolarization("H")
                            .sourceDl("AXE")
                            .status("INITIAL")
                            .supportedIsrRole("IMAGERY")
                            .system("RADIO")
                            .addTag("TAG1")
                            .addTag("TAG2")
                            .transactionId("TRANSACTION-ID")
                            .victimAltCountry("US")
                            .victimCountryCode("US")
                            .victimFuncImpacts("C2")
                            .victimPocMail("bob@jammer.com")
                            .victimPocName("Robert Smith")
                            .victimPocPhone("7198675309")
                            .victimPocUnit("4th Engineering Battalion")
                            .victimReaction("TROUBLESHOOT")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emireportServiceAsync = client.emireport()

        val emireportFuture =
            emireportServiceAsync.get(
                EmireportGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val emireport = emireportFuture.get()
        emireport.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emireportServiceAsync = client.emireport()

        val responseFuture = emireportServiceAsync.queryhelp()

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
        val emireportServiceAsync = client.emireport()

        val responseFuture =
            emireportServiceAsync.tuple(
                EmireportTupleParams.builder()
                    .columns("columns")
                    .reportTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val emireportServiceAsync = client.emireport()

        val future =
            emireportServiceAsync.unvalidatedPublish(
                EmireportUnvalidatedPublishParams.builder()
                    .addBody(
                        EmireportUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(EmireportUnvalidatedPublishParams.Body.DataMode.TEST)
                            .isr(true)
                            .reportId("REPORT-ID")
                            .reportTime(OffsetDateTime.parse("2025-01-07T21:47:40.438Z"))
                            .reportType("SATCOM")
                            .requestAssist(true)
                            .source("Bluestaq")
                            .startTime(OffsetDateTime.parse("2025-01-07T20:16:03.989Z"))
                            .id("026dd511-8ba5-47d3-9909-836149f87686")
                            .actionsTaken(
                                "verified connections, cables and antenna pointing angles"
                            )
                            .affActivity("UPLINK")
                            .alt(1750.0)
                            .aor("NORTHCOM")
                            .band("SHF")
                            .beamPattern("MAIN LOBE")
                            .channel("10C-10CU")
                            .chanPirate(false)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .description("Interference on channel")
                            .dneImpact(
                                "Text description of the duration, nature and extent (DNE) of the impact."
                            )
                            .emiType("BARRAGE")
                            .endTime(OffsetDateTime.parse("2025-01-07T21:30:51.672Z"))
                            .frequency(1575.42)
                            .geoLocErrEllp(listOf(1300.0, 700.0, 35.0))
                            .gpsEncrypted(false)
                            .gpsFreq("L1")
                            .highAffectedFrequency(1725.0)
                            .idOnOrbit("25724")
                            .intercept(false)
                            .interceptLang("ENGLISH")
                            .interceptType("VOICE")
                            .intSrcAmplitude(0.275)
                            .intSrcBandwidth(30.0)
                            .intSrcCentFreq(485.7)
                            .intSrcEncrypted(false)
                            .intSrcModulation("FSK")
                            .isrCollectionImpact(false)
                            .killBox("7F9SW")
                            .lat(38.7375)
                            .link("SPOT-21")
                            .lon(-104.7889)
                            .milGrid("4QFJ12345678")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .origObjectId("25724")
                            .persistence("CONTINUOUS")
                            .platform("CVN-78")
                            .rcvrDemod("FSK")
                            .rcvrGain(23.7)
                            .rcvrLocation("FORT CARSON GARAGE")
                            .rcvrType("OMNI")
                            .respService("ARMY")
                            .satcomPriority("HIGH")
                            .satDownlinkFrequency(47432.5)
                            .satDownlinkPolarization("V")
                            .satName("MILSTAR DFS-3")
                            .satNo(25724)
                            .satTransponderId("36097-8433-10C")
                            .satUplinkFrequency(44532.1)
                            .satUplinkPolarization("H")
                            .sourceDl("AXE")
                            .status("INITIAL")
                            .supportedIsrRole("IMAGERY")
                            .system("RADIO")
                            .addTag("TAG1")
                            .addTag("TAG2")
                            .transactionId("TRANSACTION-ID")
                            .victimAltCountry("US")
                            .victimCountryCode("US")
                            .victimFuncImpacts("C2")
                            .victimPocMail("bob@jammer.com")
                            .victimPocName("Robert Smith")
                            .victimPocPhone("7198675309")
                            .victimPocUnit("4th Engineering Battalion")
                            .victimReaction("TROUBLESHOOT")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}

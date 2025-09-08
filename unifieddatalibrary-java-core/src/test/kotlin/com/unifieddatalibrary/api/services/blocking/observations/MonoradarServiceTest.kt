// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarCountParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarCreateBulkParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarListParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarTupleParams
import com.unifieddatalibrary.api.models.observations.monoradar.MonoradarUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MonoradarServiceTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val monoradarService = client.observations().monoradar()

        val page =
            monoradarService.list(
                MonoradarListParams.builder()
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
        val monoradarService = client.observations().monoradar()

        monoradarService.count(
            MonoradarCountParams.builder()
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
        val monoradarService = client.observations().monoradar()

        monoradarService.createBulk(
            MonoradarCreateBulkParams.builder()
                .addBody(
                    MonoradarCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(MonoradarCreateBulkParams.Body.DataMode.TEST)
                        .msgfmt("CAT48")
                        .msgts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                        .msgtyp("BCN")
                        .source("Bluestaq")
                        .ts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                        .id("MONORADAR-ID")
                        .acp(100)
                        .addr("ADDR-ID")
                        .af(true)
                        .aims(true)
                        .alt3d(100.23)
                        .artsqual("QUALITY")
                        .az(100.23)
                        .azdelt(44.23)
                        .bcnhits(12)
                        .addCartpo(1.2)
                        .addCartpo(2.2)
                        .cdm("CDM")
                        .code7500(false)
                        .code7600(false)
                        .code7700(false)
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .faa(true)
                        .grndspd(30.23)
                        .hdng(30.23)
                        .idSensor("REF-SENSOR-ID")
                        .m1("MISSION_CODE")
                        .m1g(true)
                        .m1v("M1V")
                        .m2("MILITARY_ID_CODE")
                        .m2g(true)
                        .m2v("M2V")
                        .m2xv("M2XV")
                        .m3a("AIRCRAFT_ID")
                        .m3ag(true)
                        .m3av("M3AV")
                        .m3axv("M3AXV")
                        .m4("ID_FRIEND")
                        .m4d1d2("STATUS")
                        .m4v("M4V")
                        .mah("MAH")
                        .mc(100.23)
                        .mcg(true)
                        .mcv("MCV")
                        .milemrgcy(false)
                        .mrgrpt(true)
                        .mscommb("MSCOMMB")
                        .mti(true)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origSensorId("ORIGSENSOR-ID")
                        .psrrl(44.23)
                        .rad("RAD")
                        .rng(100.23)
                        .rngdelt(44.23)
                        .sac(10)
                        .senalt(100.23)
                        .senlat(45.23)
                        .senlon(45.23)
                        .sic(40)
                        .spi(true)
                        .ssrl(44.23)
                        .addTag("TAG1")
                        .addTag("TAG2")
                        .tgtconf("CONFIDENCE")
                        .tgtcorr("CORRELATION")
                        .tgtid("TGT-ID")
                        .tis(0.4)
                        .trkelig("ELIGIBILITY")
                        .trknum(30)
                        .tti("TTI")
                        .addWectc("WARNING")
                        .addWectc("WARNING")
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
        val monoradarService = client.observations().monoradar()

        val response = monoradarService.queryhelp()

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
        val monoradarService = client.observations().monoradar()

        val response =
            monoradarService.tuple(
                MonoradarTupleParams.builder()
                    .columns("columns")
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val monoradarService = client.observations().monoradar()

        monoradarService.unvalidatedPublish(
            MonoradarUnvalidatedPublishParams.builder()
                .addBody(
                    MonoradarUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(MonoradarUnvalidatedPublishParams.Body.DataMode.TEST)
                        .msgfmt("CAT48")
                        .msgts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                        .msgtyp("BCN")
                        .source("Bluestaq")
                        .ts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                        .id("MONORADAR-ID")
                        .acp(100)
                        .addr("ADDR-ID")
                        .af(true)
                        .aims(true)
                        .alt3d(100.23)
                        .artsqual("QUALITY")
                        .az(100.23)
                        .azdelt(44.23)
                        .bcnhits(12)
                        .addCartpo(1.2)
                        .addCartpo(2.2)
                        .cdm("CDM")
                        .code7500(false)
                        .code7600(false)
                        .code7700(false)
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .faa(true)
                        .grndspd(30.23)
                        .hdng(30.23)
                        .idSensor("REF-SENSOR-ID")
                        .m1("MISSION_CODE")
                        .m1g(true)
                        .m1v("M1V")
                        .m2("MILITARY_ID_CODE")
                        .m2g(true)
                        .m2v("M2V")
                        .m2xv("M2XV")
                        .m3a("AIRCRAFT_ID")
                        .m3ag(true)
                        .m3av("M3AV")
                        .m3axv("M3AXV")
                        .m4("ID_FRIEND")
                        .m4d1d2("STATUS")
                        .m4v("M4V")
                        .mah("MAH")
                        .mc(100.23)
                        .mcg(true)
                        .mcv("MCV")
                        .milemrgcy(false)
                        .mrgrpt(true)
                        .mscommb("MSCOMMB")
                        .mti(true)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origSensorId("ORIGSENSOR-ID")
                        .psrrl(44.23)
                        .rad("RAD")
                        .rng(100.23)
                        .rngdelt(44.23)
                        .sac(10)
                        .senalt(100.23)
                        .senlat(45.23)
                        .senlon(45.23)
                        .sic(40)
                        .spi(true)
                        .ssrl(44.23)
                        .addTag("TAG1")
                        .addTag("TAG2")
                        .tgtconf("CONFIDENCE")
                        .tgtcorr("CORRELATION")
                        .tgtid("TGT-ID")
                        .tis(0.4)
                        .trkelig("ELIGIBILITY")
                        .trknum(30)
                        .tti("TTI")
                        .addWectc("WARNING")
                        .addWectc("WARNING")
                        .build()
                )
                .build()
        )
    }
}

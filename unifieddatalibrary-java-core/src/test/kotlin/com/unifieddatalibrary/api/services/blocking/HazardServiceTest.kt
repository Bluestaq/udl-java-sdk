// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.hazard.HazardCountParams
import com.unifieddatalibrary.api.models.hazard.HazardCreateBulkParams
import com.unifieddatalibrary.api.models.hazard.HazardCreateParams
import com.unifieddatalibrary.api.models.hazard.HazardGetParams
import com.unifieddatalibrary.api.models.hazard.HazardListParams
import com.unifieddatalibrary.api.models.hazard.HazardTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HazardServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val hazardService = client.hazard()

        hazardService.create(
            HazardCreateParams.builder()
                .addAlarm("Alarm1")
                .addAlarm("Alarm2")
                .addAlarmValue(2.7)
                .addAlarmValue(2.9)
                .classificationMarking("U")
                .dataMode(HazardCreateParams.DataMode.TEST)
                .detectTime(OffsetDateTime.parse("2022-03-07T14:51:39.653Z"))
                .detectType("Chemical")
                .source("Bluestaq")
                .id("HAZARD-ID")
                .a(238)
                .activity(120.1)
                .bottleId("6264")
                .casRn("64-17-5")
                .channel("Skin")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .ctrnTime(1.077)
                .density(18900.2)
                .dep(1.084)
                .depCtrn(86.1)
                .dose(1.12)
                .doseRate(1.0000001865)
                .duration(14400)
                .gBar(2.5)
                .harmful(false)
                .hBar(3.1)
                .idPoi("POI-ID")
                .idTrack("TRACK-ID")
                .massFrac(0.029)
                .matCat(3)
                .matClass("Nerve Agent")
                .matName("VX")
                .matType("21")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .ppm(27129)
                .radCtrn(1.31)
                .addReading("Rad1")
                .addReading("Rad2")
                .addReadingUnit("Gray")
                .addReadingUnit("Gray")
                .addReadingValue(107.2)
                .addReadingValue(124.1)
                .z(92)
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
        val hazardService = client.hazard()

        val page =
            hazardService.list(
                HazardListParams.builder()
                    .detectTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val hazardService = client.hazard()

        hazardService.count(
            HazardCountParams.builder()
                .detectTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val hazardService = client.hazard()

        hazardService.createBulk(
            HazardCreateBulkParams.builder()
                .addBody(
                    HazardCreateBulkParams.Body.builder()
                        .addAlarm("Alarm1")
                        .addAlarm("Alarm2")
                        .addAlarmValue(2.7)
                        .addAlarmValue(2.9)
                        .classificationMarking("U")
                        .dataMode(HazardCreateBulkParams.Body.DataMode.TEST)
                        .detectTime(OffsetDateTime.parse("2022-03-07T14:51:39.653Z"))
                        .detectType("Chemical")
                        .source("Bluestaq")
                        .id("HAZARD-ID")
                        .a(238)
                        .activity(120.1)
                        .bottleId("6264")
                        .casRn("64-17-5")
                        .channel("Skin")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .ctrnTime(1.077)
                        .density(18900.2)
                        .dep(1.084)
                        .depCtrn(86.1)
                        .dose(1.12)
                        .doseRate(1.0000001865)
                        .duration(14400)
                        .gBar(2.5)
                        .harmful(false)
                        .hBar(3.1)
                        .idPoi("POI-ID")
                        .idTrack("TRACK-ID")
                        .massFrac(0.029)
                        .matCat(3)
                        .matClass("Nerve Agent")
                        .matName("VX")
                        .matType("21")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .ppm(27129)
                        .radCtrn(1.31)
                        .addReading("Rad1")
                        .addReading("Rad2")
                        .addReadingUnit("Gray")
                        .addReadingUnit("Gray")
                        .addReadingValue(107.2)
                        .addReadingValue(124.1)
                        .z(92)
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
        val hazardService = client.hazard()

        val hazard =
            hazardService.get(
                HazardGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        hazard.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val hazardService = client.hazard()

        val response = hazardService.queryhelp()

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
        val hazardService = client.hazard()

        val response =
            hazardService.tuple(
                HazardTupleParams.builder()
                    .columns("columns")
                    .detectTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}

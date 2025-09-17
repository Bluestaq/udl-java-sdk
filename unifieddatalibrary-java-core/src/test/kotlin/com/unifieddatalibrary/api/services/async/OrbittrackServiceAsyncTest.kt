// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackCountParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackCreateBulkParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackListParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackTupleParams
import com.unifieddatalibrary.api.models.orbittrack.OrbittrackUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrbittrackServiceAsyncTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val orbittrackServiceAsync = client.orbittrack()

        val pageFuture =
            orbittrackServiceAsync.list(
                OrbittrackListParams.builder()
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val orbittrackServiceAsync = client.orbittrack()

        val responseFuture =
            orbittrackServiceAsync.count(
                OrbittrackCountParams.builder()
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val orbittrackServiceAsync = client.orbittrack()

        val future =
            orbittrackServiceAsync.createBulk(
                OrbittrackCreateBulkParams.builder()
                    .addBody(
                        OrbittrackCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(OrbittrackCreateBulkParams.Body.DataMode.TEST)
                            .lat(19.88550102)
                            .lon(46.74596844)
                            .source("Bluestaq")
                            .ts(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                            .id("ORBIT_TRACK_ID")
                            .alt(585.71)
                            .amplification("A note regarding this spacecraft")
                            .angElev(15.2)
                            .aouData(listOf(34.3, 26.5, 1.2))
                            .aouType("ELLIPSE")
                            .callSign("Charlie")
                            .charlieLine(
                                "323751332255940400010000003635829600010200072500098205001150"
                            )
                            .chXRef("FHKX")
                            .cntnmnt(90.0)
                            .countryCode("US")
                            .createdAt(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                            .createdBy("some.user")
                            .decay(0.5868)
                            .dummy(false)
                            .feint(false)
                            .hq(false)
                            .idElset("c715a619-8695-44d2-9e7d-effd257b4843")
                            .identAmp("JOKER")
                            .idOnOrbit("32375")
                            .iff("ID Mode")
                            .installation(false)
                            .objectType(OrbittrackCreateBulkParams.Body.ObjectType.PAYLOAD)
                            .objIdent(OrbittrackCreateBulkParams.Body.ObjIdent.FRIEND)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .origObjectId("L2045")
                            .rdfRf(1.5273)
                            .reduced(false)
                            .reinforced(false)
                            .rptNum("123")
                            .satNo(37375)
                            .satStatus("INACTIVE")
                            .spd(15.03443)
                            .taskForce(false)
                            .addTrackSensor(
                                OrbittrackCreateBulkParams.Body.TrackSensor.builder()
                                    .az(90.0)
                                    .range(4023.95)
                                    .minRangeLimit(20.23)
                                    .missionNumber("Example Mission")
                                    .sensorFovType(
                                        OrbittrackCreateBulkParams.Body.TrackSensor.SensorFovType
                                            .UNKNOWN
                                    )
                                    .sensorName("SENSOR_NAME")
                                    .sensorNumber(1234)
                                    .build()
                            )
                            .trkId("3668f135-fcba-4630-a43d-e7782e11d988")
                            .vehType("SPACE")
                            .xref("XE")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val orbittrackServiceAsync = client.orbittrack()

        val responseFuture = orbittrackServiceAsync.queryhelp()

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
        val orbittrackServiceAsync = client.orbittrack()

        val responseFuture =
            orbittrackServiceAsync.tuple(
                OrbittrackTupleParams.builder()
                    .columns("columns")
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val orbittrackServiceAsync = client.orbittrack()

        val future =
            orbittrackServiceAsync.unvalidatedPublish(
                OrbittrackUnvalidatedPublishParams.builder()
                    .addBody(
                        OrbittrackUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(OrbittrackUnvalidatedPublishParams.Body.DataMode.TEST)
                            .lat(19.88550102)
                            .lon(46.74596844)
                            .source("Bluestaq")
                            .ts(OffsetDateTime.parse("2021-02-25T12:00:00.123456Z"))
                            .id("ORBIT_TRACK_ID")
                            .alt(585.71)
                            .amplification("A note regarding this spacecraft")
                            .angElev(15.2)
                            .aouData(listOf(34.3, 26.5, 1.2))
                            .aouType("ELLIPSE")
                            .callSign("Charlie")
                            .charlieLine(
                                "323751332255940400010000003635829600010200072500098205001150"
                            )
                            .chXRef("FHKX")
                            .cntnmnt(90.0)
                            .countryCode("US")
                            .createdAt(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                            .createdBy("some.user")
                            .decay(0.5868)
                            .dummy(false)
                            .feint(false)
                            .hq(false)
                            .idElset("c715a619-8695-44d2-9e7d-effd257b4843")
                            .identAmp("JOKER")
                            .idOnOrbit("32375")
                            .iff("ID Mode")
                            .installation(false)
                            .objectType(OrbittrackUnvalidatedPublishParams.Body.ObjectType.PAYLOAD)
                            .objIdent(OrbittrackUnvalidatedPublishParams.Body.ObjIdent.FRIEND)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .origObjectId("L2045")
                            .rdfRf(1.5273)
                            .reduced(false)
                            .reinforced(false)
                            .rptNum("123")
                            .satNo(37375)
                            .satStatus("INACTIVE")
                            .spd(15.03443)
                            .taskForce(false)
                            .addTrackSensor(
                                OrbittrackUnvalidatedPublishParams.Body.TrackSensor.builder()
                                    .az(90.0)
                                    .range(4023.95)
                                    .minRangeLimit(20.23)
                                    .missionNumber("Example Mission")
                                    .sensorFovType(
                                        OrbittrackUnvalidatedPublishParams.Body.TrackSensor
                                            .SensorFovType
                                            .UNKNOWN
                                    )
                                    .sensorName("SENSOR_NAME")
                                    .sensorNumber(1234)
                                    .build()
                            )
                            .trkId("3668f135-fcba-4630-a43d-e7782e11d988")
                            .vehType("SPACE")
                            .xref("XE")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}

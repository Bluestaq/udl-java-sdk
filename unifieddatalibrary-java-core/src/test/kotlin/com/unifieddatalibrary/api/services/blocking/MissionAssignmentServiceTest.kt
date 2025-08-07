// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentCountParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentCreateBulkParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentCreateParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentGetParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentListParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentTupleParams
import com.unifieddatalibrary.api.models.missionassignment.MissionAssignmentUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MissionAssignmentServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val missionAssignmentService = client.missionAssignment()

        missionAssignmentService.create(
            MissionAssignmentCreateParams.builder()
                .classificationMarking("U")
                .dataMode(MissionAssignmentCreateParams.DataMode.TEST)
                .mad("MAD")
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .id("MISSIONASSIGNMENT-ID")
                .c1associateddmpis(3)
                .c2air("C2AIR")
                .c2alt(3)
                .c2crs(3)
                .c2exerciseindicator("C2EXERCISE")
                .c2exercisemof("MOF")
                .c2id("C2ID")
                .c2idamplifyingdescriptor("C2IDAMP")
                .c2lnd("C2LND")
                .c2spc("C2SPC")
                .c2spd(3)
                .c2specialinterestindicator("C2SPECIAL")
                .c2sur("C2SUR")
                .c3elv(10.23)
                .c3lat(10.23)
                .c3lon(10.23)
                .c3ptl("C3PTL")
                .c3ptnum("C3PTNUM")
                .c4colon(5)
                .c4def("C4DEF")
                .c4egress(4)
                .c4mod(5)
                .c4numberofstores(3)
                .c4runin(5)
                .c4tgt("C4TGT")
                .c4timediscrete("C4TIMED")
                .c4tm(4)
                .c4typeofstores(2)
                .c5colon(5)
                .c5elevationlsbs(5)
                .c5haeadj(5)
                .c5latlsb(5)
                .c5lonlsb(5)
                .c5tgtbrng(5)
                .c5tw(5)
                .c6dspc("C6DSPC")
                .c6dspct("C6DSPCT")
                .c6fplpm("C6FPLPM")
                .c6intel(5)
                .c6laser(5)
                .c6longpm("C6LONGPM")
                .c6tnr3(5)
                .c7elang2(5.23)
                .c7in3p(3)
                .c7tnor("C7TNOR")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .env("ENV")
                .index(5)
                .lat(45.23)
                .lon(45.23)
                .orginx("ORIGIN")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .rc("RC-123")
                .rr(2)
                .sz("STRENGTH")
                .tno("TRACK_NUMBER")
                .trkId("TRK-ID")
                .twenv("THREAT_WARNING")
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
        val missionAssignmentService = client.missionAssignment()

        missionAssignmentService.update(
            MissionAssignmentUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(MissionAssignmentUpdateParams.DataMode.TEST)
                .mad("MAD")
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .bodyId("MISSIONASSIGNMENT-ID")
                .c1associateddmpis(3)
                .c2air("C2AIR")
                .c2alt(3)
                .c2crs(3)
                .c2exerciseindicator("C2EXERCISE")
                .c2exercisemof("MOF")
                .c2id("C2ID")
                .c2idamplifyingdescriptor("C2IDAMP")
                .c2lnd("C2LND")
                .c2spc("C2SPC")
                .c2spd(3)
                .c2specialinterestindicator("C2SPECIAL")
                .c2sur("C2SUR")
                .c3elv(10.23)
                .c3lat(10.23)
                .c3lon(10.23)
                .c3ptl("C3PTL")
                .c3ptnum("C3PTNUM")
                .c4colon(5)
                .c4def("C4DEF")
                .c4egress(4)
                .c4mod(5)
                .c4numberofstores(3)
                .c4runin(5)
                .c4tgt("C4TGT")
                .c4timediscrete("C4TIMED")
                .c4tm(4)
                .c4typeofstores(2)
                .c5colon(5)
                .c5elevationlsbs(5)
                .c5haeadj(5)
                .c5latlsb(5)
                .c5lonlsb(5)
                .c5tgtbrng(5)
                .c5tw(5)
                .c6dspc("C6DSPC")
                .c6dspct("C6DSPCT")
                .c6fplpm("C6FPLPM")
                .c6intel(5)
                .c6laser(5)
                .c6longpm("C6LONGPM")
                .c6tnr3(5)
                .c7elang2(5.23)
                .c7in3p(3)
                .c7tnor("C7TNOR")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .env("ENV")
                .index(5)
                .lat(45.23)
                .lon(45.23)
                .orginx("ORIGIN")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .rc("RC-123")
                .rr(2)
                .sz("STRENGTH")
                .tno("TRACK_NUMBER")
                .trkId("TRK-ID")
                .twenv("THREAT_WARNING")
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
        val missionAssignmentService = client.missionAssignment()

        val page =
            missionAssignmentService.list(
                MissionAssignmentListParams.builder()
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

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
        val missionAssignmentService = client.missionAssignment()

        missionAssignmentService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val missionAssignmentService = client.missionAssignment()

        missionAssignmentService.count(
            MissionAssignmentCountParams.builder()
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
        val missionAssignmentService = client.missionAssignment()

        missionAssignmentService.createBulk(
            MissionAssignmentCreateBulkParams.builder()
                .addBody(
                    MissionAssignmentCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(MissionAssignmentCreateBulkParams.Body.DataMode.TEST)
                        .mad("MAD")
                        .source("Bluestaq")
                        .ts(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                        .id("MISSIONASSIGNMENT-ID")
                        .c1associateddmpis(3)
                        .c2air("C2AIR")
                        .c2alt(3)
                        .c2crs(3)
                        .c2exerciseindicator("C2EXERCISE")
                        .c2exercisemof("MOF")
                        .c2id("C2ID")
                        .c2idamplifyingdescriptor("C2IDAMP")
                        .c2lnd("C2LND")
                        .c2spc("C2SPC")
                        .c2spd(3)
                        .c2specialinterestindicator("C2SPECIAL")
                        .c2sur("C2SUR")
                        .c3elv(10.23)
                        .c3lat(10.23)
                        .c3lon(10.23)
                        .c3ptl("C3PTL")
                        .c3ptnum("C3PTNUM")
                        .c4colon(5)
                        .c4def("C4DEF")
                        .c4egress(4)
                        .c4mod(5)
                        .c4numberofstores(3)
                        .c4runin(5)
                        .c4tgt("C4TGT")
                        .c4timediscrete("C4TIMED")
                        .c4tm(4)
                        .c4typeofstores(2)
                        .c5colon(5)
                        .c5elevationlsbs(5)
                        .c5haeadj(5)
                        .c5latlsb(5)
                        .c5lonlsb(5)
                        .c5tgtbrng(5)
                        .c5tw(5)
                        .c6dspc("C6DSPC")
                        .c6dspct("C6DSPCT")
                        .c6fplpm("C6FPLPM")
                        .c6intel(5)
                        .c6laser(5)
                        .c6longpm("C6LONGPM")
                        .c6tnr3(5)
                        .c7elang2(5.23)
                        .c7in3p(3)
                        .c7tnor("C7TNOR")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .env("ENV")
                        .index(5)
                        .lat(45.23)
                        .lon(45.23)
                        .orginx("ORIGIN")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .rc("RC-123")
                        .rr(2)
                        .sz("STRENGTH")
                        .tno("TRACK_NUMBER")
                        .trkId("TRK-ID")
                        .twenv("THREAT_WARNING")
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
        val missionAssignmentService = client.missionAssignment()

        val missionAssignment =
            missionAssignmentService.get(
                MissionAssignmentGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        missionAssignment.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val missionAssignmentService = client.missionAssignment()

        val response = missionAssignmentService.queryhelp()

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
        val missionAssignmentService = client.missionAssignment()

        val response =
            missionAssignmentService.tuple(
                MissionAssignmentTupleParams.builder()
                    .columns("columns")
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCountParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCreateBulkParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceCreateParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceListParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceRetrieveParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceTupleParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DiplomaticClearanceServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val diplomaticClearanceServiceAsync = client.diplomaticClearance()

        val future =
            diplomaticClearanceServiceAsync.create(
                DiplomaticClearanceCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(DiplomaticClearanceCreateParams.DataMode.TEST)
                    .firstDepDate(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                    .idMission("0dba1363-2d09-49fa-a784-4bb4cbb1674a")
                    .source("Bluestaq")
                    .id("25059135-4afc-45c2-b78b-d6e843dbd96d")
                    .apacsId("1083034")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .addDiplomaticClearanceDetail(
                        DiplomaticClearanceCreateParams.DiplomaticClearanceDetail.builder()
                            .action("O")
                            .altCountryCode("IZ")
                            .clearanceId("MFMW225662GHQ")
                            .clearanceRemark("Clearance remarks")
                            .clearedCallSign("FALCN09")
                            .countryCode("NL")
                            .countryName("NETHERLANDS")
                            .entryNet(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .entryPoint("LOMOS")
                            .exitNlt(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .exitPoint("BUDOP")
                            .externalClearanceId("aa714f4d52a37ab1a00b21af9566e379")
                            .idSortie("207010e0-f97d-431c-8c00-7e46acfef0f5")
                            .legNum(825)
                            .profile("T LAND/OFLY IATA COMPLIANT CARGO 23")
                            .reqIcao(true)
                            .reqPoint(true)
                            .routeString("DCT DOH P430 BAYAN/M062F150 P430 RAMKI")
                            .sequenceNum(3)
                            .status("IN WORK")
                            .validDesc("CY2023")
                            .validEndTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .validStartTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .windowRemark("Period remarks")
                            .build()
                    )
                    .addDiplomaticClearanceRemark(
                        DiplomaticClearanceCreateParams.DiplomaticClearanceRemark.builder()
                            .date(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .gdssRemarkId("GDSSREMARK-ID")
                            .text("Example mission remarks.")
                            .user("John Doe")
                            .build()
                    )
                    .dipWorksheetName("G2-939911-AC")
                    .docDeadline(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                    .externalWorksheetId("990ae849089e3d6cad69655324176bb6")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .sourceDl("AXE")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val diplomaticClearanceServiceAsync = client.diplomaticClearance()

        val diplomaticclearanceFullFuture =
            diplomaticClearanceServiceAsync.retrieve(
                DiplomaticClearanceRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val diplomaticclearanceFull = diplomaticclearanceFullFuture.get()
        diplomaticclearanceFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val diplomaticClearanceServiceAsync = client.diplomaticClearance()

        val future =
            diplomaticClearanceServiceAsync.update(
                DiplomaticClearanceUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(DiplomaticClearanceUpdateParams.DataMode.TEST)
                    .firstDepDate(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                    .idMission("0dba1363-2d09-49fa-a784-4bb4cbb1674a")
                    .source("Bluestaq")
                    .bodyId("25059135-4afc-45c2-b78b-d6e843dbd96d")
                    .apacsId("1083034")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .addDiplomaticClearanceDetail(
                        DiplomaticClearanceUpdateParams.DiplomaticClearanceDetail.builder()
                            .action("O")
                            .altCountryCode("IZ")
                            .clearanceId("MFMW225662GHQ")
                            .clearanceRemark("Clearance remarks")
                            .clearedCallSign("FALCN09")
                            .countryCode("NL")
                            .countryName("NETHERLANDS")
                            .entryNet(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .entryPoint("LOMOS")
                            .exitNlt(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .exitPoint("BUDOP")
                            .externalClearanceId("aa714f4d52a37ab1a00b21af9566e379")
                            .idSortie("207010e0-f97d-431c-8c00-7e46acfef0f5")
                            .legNum(825)
                            .profile("T LAND/OFLY IATA COMPLIANT CARGO 23")
                            .reqIcao(true)
                            .reqPoint(true)
                            .routeString("DCT DOH P430 BAYAN/M062F150 P430 RAMKI")
                            .sequenceNum(3)
                            .status("IN WORK")
                            .validDesc("CY2023")
                            .validEndTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .validStartTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .windowRemark("Period remarks")
                            .build()
                    )
                    .addDiplomaticClearanceRemark(
                        DiplomaticClearanceUpdateParams.DiplomaticClearanceRemark.builder()
                            .date(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .gdssRemarkId("GDSSREMARK-ID")
                            .text("Example mission remarks.")
                            .user("John Doe")
                            .build()
                    )
                    .dipWorksheetName("G2-939911-AC")
                    .docDeadline(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                    .externalWorksheetId("990ae849089e3d6cad69655324176bb6")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .sourceDl("AXE")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
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
        val diplomaticClearanceServiceAsync = client.diplomaticClearance()

        val pageFuture =
            diplomaticClearanceServiceAsync.list(
                DiplomaticClearanceListParams.builder()
                    .firstDepDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

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
        val diplomaticClearanceServiceAsync = client.diplomaticClearance()

        val future = diplomaticClearanceServiceAsync.delete("id")

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
        val diplomaticClearanceServiceAsync = client.diplomaticClearance()

        val responseFuture =
            diplomaticClearanceServiceAsync.count(
                DiplomaticClearanceCountParams.builder()
                    .firstDepDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val diplomaticClearanceServiceAsync = client.diplomaticClearance()

        val future =
            diplomaticClearanceServiceAsync.createBulk(
                DiplomaticClearanceCreateBulkParams.builder()
                    .addBody(
                        DiplomaticClearanceCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(DiplomaticClearanceCreateBulkParams.Body.DataMode.TEST)
                            .firstDepDate(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .idMission("0dba1363-2d09-49fa-a784-4bb4cbb1674a")
                            .source("Bluestaq")
                            .id("25059135-4afc-45c2-b78b-d6e843dbd96d")
                            .apacsId("1083034")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .addDiplomaticClearanceDetail(
                                DiplomaticClearanceCreateBulkParams.Body.DiplomaticClearanceDetail
                                    .builder()
                                    .action("O")
                                    .altCountryCode("IZ")
                                    .clearanceId("MFMW225662GHQ")
                                    .clearanceRemark("Clearance remarks")
                                    .clearedCallSign("FALCN09")
                                    .countryCode("NL")
                                    .countryName("NETHERLANDS")
                                    .entryNet(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                                    .entryPoint("LOMOS")
                                    .exitNlt(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                                    .exitPoint("BUDOP")
                                    .externalClearanceId("aa714f4d52a37ab1a00b21af9566e379")
                                    .idSortie("207010e0-f97d-431c-8c00-7e46acfef0f5")
                                    .legNum(825)
                                    .profile("T LAND/OFLY IATA COMPLIANT CARGO 23")
                                    .reqIcao(true)
                                    .reqPoint(true)
                                    .routeString("DCT DOH P430 BAYAN/M062F150 P430 RAMKI")
                                    .sequenceNum(3)
                                    .status("IN WORK")
                                    .validDesc("CY2023")
                                    .validEndTime(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                                    .validStartTime(
                                        OffsetDateTime.parse("2024-01-01T01:01:01.123Z")
                                    )
                                    .windowRemark("Period remarks")
                                    .build()
                            )
                            .addDiplomaticClearanceRemark(
                                DiplomaticClearanceCreateBulkParams.Body.DiplomaticClearanceRemark
                                    .builder()
                                    .date(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                                    .gdssRemarkId("GDSSREMARK-ID")
                                    .text("Example mission remarks.")
                                    .user("John Doe")
                                    .build()
                            )
                            .dipWorksheetName("G2-939911-AC")
                            .docDeadline(OffsetDateTime.parse("2024-01-01T01:01:01.123Z"))
                            .externalWorksheetId("990ae849089e3d6cad69655324176bb6")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .sourceDl("AXE")
                            .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .updatedBy("some.user")
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
        val diplomaticClearanceServiceAsync = client.diplomaticClearance()

        val responseFuture = diplomaticClearanceServiceAsync.queryhelp()

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
        val diplomaticClearanceServiceAsync = client.diplomaticClearance()

        val diplomaticclearanceFullsFuture =
            diplomaticClearanceServiceAsync.tuple(
                DiplomaticClearanceTupleParams.builder()
                    .columns("columns")
                    .firstDepDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val diplomaticclearanceFulls = diplomaticclearanceFullsFuture.get()
        diplomaticclearanceFulls.forEach { it.validate() }
    }
}

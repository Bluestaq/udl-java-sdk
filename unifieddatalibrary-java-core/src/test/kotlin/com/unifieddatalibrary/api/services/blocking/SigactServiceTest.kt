// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.sigact.SigactCountParams
import com.unifieddatalibrary.api.models.sigact.SigactCreateBulkParams
import com.unifieddatalibrary.api.models.sigact.SigactListParams
import com.unifieddatalibrary.api.models.sigact.SigactTupleParams
import com.unifieddatalibrary.api.models.sigact.SigactUploadZipParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SigactServiceTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sigactService = client.sigact()

        val page =
            sigactService.list(
                SigactListParams.builder()
                    .reportDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val sigactService = client.sigact()

        sigactService.count(
            SigactCountParams.builder()
                .reportDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val sigactService = client.sigact()

        sigactService.createBulk(
            SigactCreateBulkParams.builder()
                .addBody(
                    SigactCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(SigactCreateBulkParams.Body.DataMode.TEST)
                        .reportDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .source("Bluestaq")
                        .id("SIGACT-ID")
                        .accuracy(13)
                        .addActor("US")
                        .addActor("CAN")
                        .agjson(
                            "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                        )
                        .andims(3L)
                        .asrid(3)
                        .atext(
                            "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                        )
                        .atype("Type1")
                        .avgTone(8.23)
                        .cameoBaseCode("Example_cameoBaseCode")
                        .cameoCode("CAMEO_CODE")
                        .cameoRootCode("Example_cameoRootCode")
                        .checksumValue("120EA8A25E5D487BF68B5F7096440019")
                        .city("Austin")
                        .civAbd(423)
                        .civDet(234)
                        .civKia(2)
                        .civWound(123)
                        .clarity(1)
                        .coalAbd(123)
                        .coalDet(123)
                        .coalKia(123)
                        .coalWound(123)
                        .complexAttack(false)
                        .confidence(13)
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .district("district 12")
                        .documentFilename("Example_documentFilename")
                        .documentSource("Example_documentSource")
                        .enemyAbd(123)
                        .enemyDet(123)
                        .enemyKia(123)
                        .eventDescription("Example_Description")
                        .eventEnd(OffsetDateTime.parse("2021-01-01T01:02:03.123Z"))
                        .eventStart(OffsetDateTime.parse("2021-01-01T01:02:03.123Z"))
                        .eventType("Military")
                        .filesize(0L)
                        .friendlyAbd(123)
                        .friendlyDet(123)
                        .friendlyKia(123)
                        .friendlyWound(123)
                        .goldstein(9.32)
                        .hasAttachment(true)
                        .hostNatAbd(123)
                        .hostNatDet(123)
                        .hostNatKia(123)
                        .hostNatWound(123)
                        .idNumber("NUMBER-ID")
                        .lat(45.31)
                        .lon(90.23)
                        .milgrid("4QFJ12345678")
                        .notes("Example_Notes")
                        .numArticles(8)
                        .numMentions(8)
                        .numSources(8)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .province("Province_Example")
                        .addRelatedDoc(
                            SigactCreateBulkParams.Body.RelatedDoc.builder()
                                .addDataSourceRef(
                                    SigactCreateBulkParams.Body.RelatedDoc.DataSourceRef.builder()
                                        .dataSourceId("dataSourceId")
                                        .endPosition("endPosition")
                                        .paragraphNumber("paragraphNumber")
                                        .sentenceNumber("sentenceNumber")
                                        .startPosition("startPosition")
                                        .build()
                                )
                                .documentId("documentId")
                                .build()
                        )
                        .repUnit("Unit_1")
                        .repUnitActivity("Example_Activity")
                        .repUnitType("Example_repUnitType")
                        .sideAAbd(123)
                        .sideADet(123)
                        .sideAkia(123)
                        .sideAWound(123)
                        .sideBAbd(123)
                        .sideBDet(123)
                        .sideBkia(123)
                        .sideBWound(123)
                        .sourceLanguage("eng")
                        .sourceUrl("Example_URL")
                        .summary("Example_Summary")
                        .target("US")
                        .theater("Kabul")
                        .typeOfAttack("IED Explosion")
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
        val sigactService = client.sigact()

        val response = sigactService.queryhelp()

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
        val sigactService = client.sigact()

        val response =
            sigactService.tuple(
                SigactTupleParams.builder()
                    .columns("columns")
                    .reportDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun uploadZip() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sigactService = client.sigact()

        sigactService.uploadZip(
            SigactUploadZipParams.builder().file("some content".byteInputStream()).build()
        )
    }
}

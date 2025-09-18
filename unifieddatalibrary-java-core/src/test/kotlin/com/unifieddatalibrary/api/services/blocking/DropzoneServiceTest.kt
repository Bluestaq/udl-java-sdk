// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.dropzone.DropzoneCountParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneCreateBulkParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneCreateParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneRetrieveParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneTupleParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.dropzone.DropzoneUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DropzoneServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dropzoneService = client.dropzone()

        dropzoneService.create(
            DropzoneCreateParams.builder()
                .classificationMarking("U")
                .dataMode(DropzoneCreateParams.DataMode.TEST)
                .lat(33.54)
                .lon(-117.162)
                .name("Viper DZ")
                .source("Bluestaq")
                .id("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
                .altCountryCode("USA")
                .altCountryName("United States of America")
                .approvalDate(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
                .code("DZ")
                .countryCode("US")
                .countryName("United States")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .expirationDate(OffsetDateTime.parse("2022-12-09T16:00:00.123Z"))
                .extIdentifier("1001")
                .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                .lastUpdate(OffsetDateTime.parse("2022-11-07T18:44:41.123Z"))
                .length(549.1)
                .majcom("United States Northern Command")
                .nearestLoc("March AFB")
                .operationalApprovalDate(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .pointName("CENTER POINT")
                .radius(495.1)
                .recertDate(OffsetDateTime.parse("2022-07-05T16:00:00.123Z"))
                .remark("The text of the remark.")
                .sourceDl("AXE")
                .stateAbbr("CA")
                .stateName("CALIFORNIA")
                .surveyDate(OffsetDateTime.parse("2017-12-09T16:00:00.123Z"))
                .width(549.1)
                .zarId("1001")
                .build()
        )
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dropzoneService = client.dropzone()

        val dropzone =
            dropzoneService.retrieve(
                DropzoneRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        dropzone.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dropzoneService = client.dropzone()

        dropzoneService.update(
            DropzoneUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(DropzoneUpdateParams.DataMode.TEST)
                .lat(33.54)
                .lon(-117.162)
                .name("Viper DZ")
                .source("Bluestaq")
                .bodyId("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
                .altCountryCode("USA")
                .altCountryName("United States of America")
                .approvalDate(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
                .code("DZ")
                .countryCode("US")
                .countryName("United States")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .expirationDate(OffsetDateTime.parse("2022-12-09T16:00:00.123Z"))
                .extIdentifier("1001")
                .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                .lastUpdate(OffsetDateTime.parse("2022-11-07T18:44:41.123Z"))
                .length(549.1)
                .majcom("United States Northern Command")
                .nearestLoc("March AFB")
                .operationalApprovalDate(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .pointName("CENTER POINT")
                .radius(495.1)
                .recertDate(OffsetDateTime.parse("2022-07-05T16:00:00.123Z"))
                .remark("The text of the remark.")
                .sourceDl("AXE")
                .stateAbbr("CA")
                .stateName("CALIFORNIA")
                .surveyDate(OffsetDateTime.parse("2017-12-09T16:00:00.123Z"))
                .width(549.1)
                .zarId("1001")
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
        val dropzoneService = client.dropzone()

        val page = dropzoneService.list()

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
        val dropzoneService = client.dropzone()

        dropzoneService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dropzoneService = client.dropzone()

        dropzoneService.count(DropzoneCountParams.builder().firstResult(0L).maxResults(0L).build())
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dropzoneService = client.dropzone()

        dropzoneService.createBulk(
            DropzoneCreateBulkParams.builder()
                .addBody(
                    DropzoneCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(DropzoneCreateBulkParams.Body.DataMode.TEST)
                        .lat(33.54)
                        .lon(-117.162)
                        .name("Viper DZ")
                        .source("Bluestaq")
                        .id("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
                        .altCountryCode("USA")
                        .altCountryName("United States of America")
                        .approvalDate(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
                        .code("DZ")
                        .countryCode("US")
                        .countryName("United States")
                        .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .expirationDate(OffsetDateTime.parse("2022-12-09T16:00:00.123Z"))
                        .extIdentifier("1001")
                        .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                        .lastUpdate(OffsetDateTime.parse("2022-11-07T18:44:41.123Z"))
                        .length(549.1)
                        .majcom("United States Northern Command")
                        .nearestLoc("March AFB")
                        .operationalApprovalDate(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .pointName("CENTER POINT")
                        .radius(495.1)
                        .recertDate(OffsetDateTime.parse("2022-07-05T16:00:00.123Z"))
                        .remark("The text of the remark.")
                        .sourceDl("AXE")
                        .stateAbbr("CA")
                        .stateName("CALIFORNIA")
                        .surveyDate(OffsetDateTime.parse("2017-12-09T16:00:00.123Z"))
                        .width(549.1)
                        .zarId("1001")
                        .build()
                )
                .build()
        )
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dropzoneService = client.dropzone()

        val response = dropzoneService.queryHelp()

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
        val dropzoneService = client.dropzone()

        val response =
            dropzoneService.tuple(
                DropzoneTupleParams.builder()
                    .columns("columns")
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
        val dropzoneService = client.dropzone()

        dropzoneService.unvalidatedPublish(
            DropzoneUnvalidatedPublishParams.builder()
                .addBody(
                    DropzoneUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(DropzoneUnvalidatedPublishParams.Body.DataMode.TEST)
                        .lat(33.54)
                        .lon(-117.162)
                        .name("Viper DZ")
                        .source("Bluestaq")
                        .id("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
                        .altCountryCode("USA")
                        .altCountryName("United States of America")
                        .approvalDate(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
                        .code("DZ")
                        .countryCode("US")
                        .countryName("United States")
                        .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .expirationDate(OffsetDateTime.parse("2022-12-09T16:00:00.123Z"))
                        .extIdentifier("1001")
                        .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                        .lastUpdate(OffsetDateTime.parse("2022-11-07T18:44:41.123Z"))
                        .length(549.1)
                        .majcom("United States Northern Command")
                        .nearestLoc("March AFB")
                        .operationalApprovalDate(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .pointName("CENTER POINT")
                        .radius(495.1)
                        .recertDate(OffsetDateTime.parse("2022-07-05T16:00:00.123Z"))
                        .remark("The text of the remark.")
                        .sourceDl("AXE")
                        .stateAbbr("CA")
                        .stateName("CALIFORNIA")
                        .surveyDate(OffsetDateTime.parse("2017-12-09T16:00:00.123Z"))
                        .width(549.1)
                        .zarId("1001")
                        .build()
                )
                .build()
        )
    }
}

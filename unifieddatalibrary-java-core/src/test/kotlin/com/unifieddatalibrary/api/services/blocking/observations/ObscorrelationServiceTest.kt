// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationCountParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationCreateBulkParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationCreateParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationListParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationRetrieveParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationTupleParams
import com.unifieddatalibrary.api.models.observations.obscorrelation.ObscorrelationUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ObscorrelationServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val obscorrelationService = client.observations().obscorrelation()

        obscorrelationService.create(
            ObscorrelationCreateParams.builder()
                .classificationMarking("U")
                .corrType(ObscorrelationCreateParams.CorrType.OBSERVATION)
                .dataMode(ObscorrelationCreateParams.DataMode.TEST)
                .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                .obType(ObscorrelationCreateParams.ObType.EO)
                .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                .referenceOrbitType(ObscorrelationCreateParams.ReferenceOrbitType.ELSET)
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .algorithmCorrType("ROTAS")
                .altCatalog("CATALOG")
                .altNamespace("18SDS")
                .altObjectId("26900")
                .altUct(false)
                .astat(2L)
                .corrQuality(0.96)
                .createdAt(OffsetDateTime.parse("2021-01-01T01:02:00.123Z"))
                .createdBy("some.user")
                .idOnOrbit("ONORBIT-ID")
                .idParentCorrelation("ID-PARENT-CORRELATION")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("ORIGOBJECT-ID")
                .satNo(12100)
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .trackId("TRACK-ID")
                .transactionId("TRANSACTION-ID")
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
        val obscorrelationService = client.observations().obscorrelation()

        val obscorrelation =
            obscorrelationService.retrieve(
                ObscorrelationRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        obscorrelation.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val obscorrelationService = client.observations().obscorrelation()

        val page =
            obscorrelationService.list(
                ObscorrelationListParams.builder()
                    .msgTs(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val obscorrelationService = client.observations().obscorrelation()

        obscorrelationService.count(
            ObscorrelationCountParams.builder()
                .msgTs(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val obscorrelationService = client.observations().obscorrelation()

        obscorrelationService.createBulk(
            ObscorrelationCreateBulkParams.builder()
                .addBody(
                    ObscorrelationCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .corrType(ObscorrelationCreateBulkParams.Body.CorrType.OBSERVATION)
                        .dataMode(ObscorrelationCreateBulkParams.Body.DataMode.TEST)
                        .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                        .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                        .obType(ObscorrelationCreateBulkParams.Body.ObType.EO)
                        .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                        .referenceOrbitType(
                            ObscorrelationCreateBulkParams.Body.ReferenceOrbitType.ELSET
                        )
                        .source("Bluestaq")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .algorithmCorrType("ROTAS")
                        .altCatalog("CATALOG")
                        .altNamespace("18SDS")
                        .altObjectId("26900")
                        .altUct(false)
                        .astat(2L)
                        .corrQuality(0.96)
                        .createdAt(OffsetDateTime.parse("2021-01-01T01:02:00.123Z"))
                        .createdBy("some.user")
                        .idOnOrbit("ONORBIT-ID")
                        .idParentCorrelation("ID-PARENT-CORRELATION")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId("ORIGOBJECT-ID")
                        .satNo(12100)
                        .sourceDl("AXE")
                        .addTag("TAG1")
                        .addTag("TAG2")
                        .trackId("TRACK-ID")
                        .transactionId("TRANSACTION-ID")
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
        val obscorrelationService = client.observations().obscorrelation()

        val response = obscorrelationService.queryHelp()

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
        val obscorrelationService = client.observations().obscorrelation()

        val response =
            obscorrelationService.tuple(
                ObscorrelationTupleParams.builder()
                    .columns("columns")
                    .msgTs(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val obscorrelationService = client.observations().obscorrelation()

        obscorrelationService.unvalidatedPublish(
            ObscorrelationUnvalidatedPublishParams.builder()
                .addBody(
                    ObscorrelationUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .corrType(ObscorrelationUnvalidatedPublishParams.Body.CorrType.OBSERVATION)
                        .dataMode(ObscorrelationUnvalidatedPublishParams.Body.DataMode.TEST)
                        .msgTs(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                        .obId("e69c6734-30a1-4c4f-8fe2-7187e7012e8c")
                        .obType(ObscorrelationUnvalidatedPublishParams.Body.ObType.EO)
                        .referenceOrbitId("21826de2-5639-4c2a-b68f-30b67753b983")
                        .referenceOrbitType(
                            ObscorrelationUnvalidatedPublishParams.Body.ReferenceOrbitType.ELSET
                        )
                        .source("Bluestaq")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .algorithmCorrType("ROTAS")
                        .altCatalog("CATALOG")
                        .altNamespace("18SDS")
                        .altObjectId("26900")
                        .altUct(false)
                        .astat(2L)
                        .corrQuality(0.96)
                        .createdAt(OffsetDateTime.parse("2021-01-01T01:02:00.123Z"))
                        .createdBy("some.user")
                        .idOnOrbit("ONORBIT-ID")
                        .idParentCorrelation("ID-PARENT-CORRELATION")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .origObjectId("ORIGOBJECT-ID")
                        .satNo(12100)
                        .sourceDl("AXE")
                        .addTag("TAG1")
                        .addTag("TAG2")
                        .trackId("TRACK-ID")
                        .transactionId("TRANSACTION-ID")
                        .build()
                )
                .build()
        )
    }
}

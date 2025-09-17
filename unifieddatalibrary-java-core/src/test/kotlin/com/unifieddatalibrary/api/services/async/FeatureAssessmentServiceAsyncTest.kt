// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentCountParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentCreateBulkParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentCreateParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentListParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentRetrieveParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentTupleParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FeatureAssessmentServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val featureAssessmentServiceAsync = client.featureAssessment()

        val future =
            featureAssessmentServiceAsync.create(
                FeatureAssessmentCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(FeatureAssessmentCreateParams.DataMode.TEST)
                    .featureTs(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
                    .featureUoM("MHz")
                    .idAnalyticImagery("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
                    .source("Bluestaq")
                    .id("026dd511-8ba5-47d3-9909-836149f87686")
                    .agjson(
                        "{\"type\":\"Point\",\"coordinates\":[52.23486096929749 16.191937138595005]}"
                    )
                    .andims(1)
                    .annLims(listOf(listOf(1, 1), listOf(1, 2), listOf(1, 3), listOf(1, 4)))
                    .addAnnText("rec1")
                    .addAnnText("rec2")
                    .area("POINT(52.23486096929749 16.191937138595005)")
                    .asrid(4326)
                    .assessment(
                        "Vessel bigger than other small fishing boats commonly found along the coastline"
                    )
                    .atext("POINT(52.23486096929749 16.191937138595005)")
                    .atype("POINT")
                    .confidence(0.85)
                    .createdAt(OffsetDateTime.parse("2023-04-22T17:51:40.854Z"))
                    .createdBy("some.user")
                    .externalId("2024-06-22-17-53-05_UMBRA-05_GEC")
                    .addFeatureArray(1227.6)
                    .addFeatureArray(1575.42)
                    .featureBool(true)
                    .featureString("TRANSMITTING FREQUENCIES")
                    .addFeatureStringArray("String1")
                    .addFeatureStringArray("String2")
                    .featureValue(1227.6)
                    .heading(97.1)
                    .height(7.25)
                    .length(10.54)
                    .name("HEADING")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .sourceDl("AXE")
                    .speed(0.1)
                    .addSrcId("b008c63b-ad89-4493-80e0-77bc982bef77")
                    .addSrcId("3565a6dd-654e-4969-89e0-ee7c51ab1e1b")
                    .addSrcT(OffsetDateTime.parse("2025-02-24T16:27:18.471Z"))
                    .addSrcT(OffsetDateTime.parse("2025-02-24T16:29:31.000000Z"))
                    .addSrcTyp("SAR")
                    .addSrcTyp("AIS")
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .transactionId("c3bdef1f-5a4f-4716-bee4-7a1e0ec7d37d")
                    .type("VESSEL")
                    .width(3.74)
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
        val featureAssessmentServiceAsync = client.featureAssessment()

        val featureAssessmentFuture =
            featureAssessmentServiceAsync.retrieve(
                FeatureAssessmentRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val featureAssessment = featureAssessmentFuture.get()
        featureAssessment.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val featureAssessmentServiceAsync = client.featureAssessment()

        val pageFuture =
            featureAssessmentServiceAsync.list(
                FeatureAssessmentListParams.builder().idAnalyticImagery("idAnalyticImagery").build()
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
        val featureAssessmentServiceAsync = client.featureAssessment()

        val responseFuture =
            featureAssessmentServiceAsync.count(
                FeatureAssessmentCountParams.builder()
                    .idAnalyticImagery("idAnalyticImagery")
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
        val featureAssessmentServiceAsync = client.featureAssessment()

        val future =
            featureAssessmentServiceAsync.createBulk(
                FeatureAssessmentCreateBulkParams.builder()
                    .addBody(
                        FeatureAssessmentCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(FeatureAssessmentCreateBulkParams.Body.DataMode.TEST)
                            .featureTs(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
                            .featureUoM("MHz")
                            .idAnalyticImagery("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
                            .source("Bluestaq")
                            .id("026dd511-8ba5-47d3-9909-836149f87686")
                            .agjson(
                                "{\"type\":\"Point\",\"coordinates\":[52.23486096929749 16.191937138595005]}"
                            )
                            .andims(1)
                            .annLims(listOf(listOf(1, 1), listOf(1, 2), listOf(1, 3), listOf(1, 4)))
                            .addAnnText("rec1")
                            .addAnnText("rec2")
                            .asrid(4326)
                            .assessment(
                                "Vessel bigger than other small fishing boats commonly found along the coastline"
                            )
                            .atext("POINT(52.23486096929749 16.191937138595005)")
                            .atype("POINT")
                            .confidence(0.85)
                            .createdAt(OffsetDateTime.parse("2023-04-22T17:51:40.854Z"))
                            .createdBy("some.user")
                            .externalId("2024-06-22-17-53-05_UMBRA-05_GEC")
                            .addFeatureArray(1227.6)
                            .addFeatureArray(1575.42)
                            .featureBool(true)
                            .featureString("TRANSMITTING FREQUENCIES")
                            .addFeatureStringArray("String1")
                            .addFeatureStringArray("String2")
                            .featureValue(1227.6)
                            .heading(97.1)
                            .height(7.25)
                            .length(10.54)
                            .name("HEADING")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .sourceDl("AXE")
                            .speed(0.1)
                            .addSrcId("b008c63b-ad89-4493-80e0-77bc982bef77")
                            .addSrcId("3565a6dd-654e-4969-89e0-ee7c51ab1e1b")
                            .addSrcT(OffsetDateTime.parse("2025-02-24T16:27:18.471Z"))
                            .addSrcT(OffsetDateTime.parse("2025-02-24T16:29:31.000000Z"))
                            .addSrcTyp("SAR")
                            .addSrcTyp("AIS")
                            .addTag("TAG1")
                            .addTag("TAG2")
                            .transactionId("c3bdef1f-5a4f-4716-bee4-7a1e0ec7d37d")
                            .type("VESSEL")
                            .width(3.74)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val featureAssessmentServiceAsync = client.featureAssessment()

        val responseFuture = featureAssessmentServiceAsync.queryHelp()

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
        val featureAssessmentServiceAsync = client.featureAssessment()

        val responseFuture =
            featureAssessmentServiceAsync.tuple(
                FeatureAssessmentTupleParams.builder()
                    .columns("columns")
                    .idAnalyticImagery("idAnalyticImagery")
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
        val featureAssessmentServiceAsync = client.featureAssessment()

        val future =
            featureAssessmentServiceAsync.unvalidatedPublish(
                FeatureAssessmentUnvalidatedPublishParams.builder()
                    .addBody(
                        FeatureAssessmentUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(FeatureAssessmentUnvalidatedPublishParams.Body.DataMode.TEST)
                            .featureTs(OffsetDateTime.parse("2024-06-22T17:53:06.123Z"))
                            .featureUoM("MHz")
                            .idAnalyticImagery("fa1509ae-c19d-432e-9542-e5d1e0f47bc3")
                            .source("Bluestaq")
                            .id("026dd511-8ba5-47d3-9909-836149f87686")
                            .agjson(
                                "{\"type\":\"Point\",\"coordinates\":[52.23486096929749 16.191937138595005]}"
                            )
                            .andims(1)
                            .annLims(listOf(listOf(1, 1), listOf(1, 2), listOf(1, 3), listOf(1, 4)))
                            .addAnnText("rec1")
                            .addAnnText("rec2")
                            .asrid(4326)
                            .assessment(
                                "Vessel bigger than other small fishing boats commonly found along the coastline"
                            )
                            .atext("POINT(52.23486096929749 16.191937138595005)")
                            .atype("POINT")
                            .confidence(0.85)
                            .createdAt(OffsetDateTime.parse("2023-04-22T17:51:40.854Z"))
                            .createdBy("some.user")
                            .externalId("2024-06-22-17-53-05_UMBRA-05_GEC")
                            .addFeatureArray(1227.6)
                            .addFeatureArray(1575.42)
                            .featureBool(true)
                            .featureString("TRANSMITTING FREQUENCIES")
                            .addFeatureStringArray("String1")
                            .addFeatureStringArray("String2")
                            .featureValue(1227.6)
                            .heading(97.1)
                            .height(7.25)
                            .length(10.54)
                            .name("HEADING")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .sourceDl("AXE")
                            .speed(0.1)
                            .addSrcId("b008c63b-ad89-4493-80e0-77bc982bef77")
                            .addSrcId("3565a6dd-654e-4969-89e0-ee7c51ab1e1b")
                            .addSrcT(OffsetDateTime.parse("2025-02-24T16:27:18.471Z"))
                            .addSrcT(OffsetDateTime.parse("2025-02-24T16:29:31.000000Z"))
                            .addSrcTyp("SAR")
                            .addSrcTyp("AIS")
                            .addTag("TAG1")
                            .addTag("TAG2")
                            .transactionId("c3bdef1f-5a4f-4716-bee4-7a1e0ec7d37d")
                            .type("VESSEL")
                            .width(3.74)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}

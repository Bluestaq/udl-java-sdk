// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetCountParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetCreateParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetListParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetRetrieveParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetTupleParams
import com.unifieddatalibrary.api.models.attitudesets.AttitudeSetUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AttitudeSetServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val attitudeSetService = client.attitudeSets()

        attitudeSetService.create(
            AttitudeSetCreateParams.builder()
                .classificationMarking("U")
                .dataMode(AttitudeSetCreateParams.DataMode.TEST)
                .endTime(OffsetDateTime.parse("2022-07-07T18:00:00.654321Z"))
                .frame1("SCBODY")
                .frame2("J2000")
                .numPoints(120)
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2022-07-07T16:00:00.123456Z"))
                .type("AEM")
                .id("ATTITUDESET-ID")
                .addAsRef("2ea97de6-4680-4767-a07e-35d16398ef60")
                .addAttitudeList(
                    AttitudeSetCreateParams.AttitudeList.builder()
                        .classificationMarking("U")
                        .dataMode(AttitudeSetCreateParams.AttitudeList.DataMode.TEST)
                        .source("Bluestaq")
                        .ts(OffsetDateTime.parse("2022-03-07T14:51:39.653043Z"))
                        .id("ATTITUDEDATA-ID")
                        .asId("773c9887-e931-42eb-8155-f0fbd227b235")
                        .coningAngle(0.1)
                        .createdAt(OffsetDateTime.parse("2022-07-05T12:00:00.123Z"))
                        .createdBy("some.user")
                        .declination(0.799)
                        .idOnOrbit("41947")
                        .motionType("PROSOL_MOTION")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .origObjectId("D6593")
                        .precPeriod(36.1)
                        .q1(0.0312)
                        .q1Dot(0.0043)
                        .q2(0.7854)
                        .q2Dot(0.06)
                        .q3(0.3916)
                        .q3Dot(0.499)
                        .qc(0.4783)
                        .qcDot(0.011)
                        .ra(-173.75)
                        .satNo(41947)
                        .spinPeriod(0.1)
                        .addXAngle(139.753)
                        .addXRate(0.105)
                        .addYAngle(25.066)
                        .addYRate(0.032)
                        .addZAngle(-53.368)
                        .addZRate(0.022)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2022-07-05T12:00:00.123Z"))
                .createdBy("some.user")
                .esId("60f7a241-b7be-48d8-acf3-786670af53f9")
                .eulerRotSeq("123")
                .idOnOrbit("41947")
                .idSensor("a7e99418-b6d6-29ab-e767-440a989cce26")
                .interpolator("LINEAR")
                .interpolatorDegree(2)
                .notes("Notes for this attitude set")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .origObjectId("D6593")
                .origSensorId("ORIGSENSOR-ID")
                .precAngleInit(30.5)
                .satNo(41947)
                .spinAngleInit(25.5)
                .stepSize(60)
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
        val attitudeSetService = client.attitudeSets()

        val attitudesetFull =
            attitudeSetService.retrieve(
                AttitudeSetRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        attitudesetFull.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val attitudeSetService = client.attitudeSets()

        val page =
            attitudeSetService.list(
                AttitudeSetListParams.builder()
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val attitudeSetService = client.attitudeSets()

        attitudeSetService.count(
            AttitudeSetCountParams.builder()
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
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
        val attitudeSetService = client.attitudeSets()

        val response = attitudeSetService.queryHelp()

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
        val attitudeSetService = client.attitudeSets()

        val attitudesetFulls =
            attitudeSetService.tuple(
                AttitudeSetTupleParams.builder()
                    .columns("columns")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        attitudesetFulls.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val attitudeSetService = client.attitudeSets()

        attitudeSetService.unvalidatedPublish(
            AttitudeSetUnvalidatedPublishParams.builder()
                .classificationMarking("U")
                .dataMode(AttitudeSetUnvalidatedPublishParams.DataMode.TEST)
                .endTime(OffsetDateTime.parse("2022-07-07T18:00:00.654321Z"))
                .frame1("SCBODY")
                .frame2("J2000")
                .numPoints(120)
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2022-07-07T16:00:00.123456Z"))
                .type("AEM")
                .id("ATTITUDESET-ID")
                .addAsRef("2ea97de6-4680-4767-a07e-35d16398ef60")
                .addAttitudeList(
                    AttitudeSetUnvalidatedPublishParams.AttitudeList.builder()
                        .classificationMarking("U")
                        .dataMode(AttitudeSetUnvalidatedPublishParams.AttitudeList.DataMode.TEST)
                        .source("Bluestaq")
                        .ts(OffsetDateTime.parse("2022-03-07T14:51:39.653043Z"))
                        .id("ATTITUDEDATA-ID")
                        .asId("773c9887-e931-42eb-8155-f0fbd227b235")
                        .coningAngle(0.1)
                        .createdAt(OffsetDateTime.parse("2022-07-05T12:00:00.123Z"))
                        .createdBy("some.user")
                        .declination(0.799)
                        .idOnOrbit("41947")
                        .motionType("PROSOL_MOTION")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .origObjectId("D6593")
                        .precPeriod(36.1)
                        .q1(0.0312)
                        .q1Dot(0.0043)
                        .q2(0.7854)
                        .q2Dot(0.06)
                        .q3(0.3916)
                        .q3Dot(0.499)
                        .qc(0.4783)
                        .qcDot(0.011)
                        .ra(-173.75)
                        .satNo(41947)
                        .spinPeriod(0.1)
                        .addXAngle(139.753)
                        .addXRate(0.105)
                        .addYAngle(25.066)
                        .addYRate(0.032)
                        .addZAngle(-53.368)
                        .addZRate(0.022)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2022-07-05T12:00:00.123Z"))
                .createdBy("some.user")
                .esId("60f7a241-b7be-48d8-acf3-786670af53f9")
                .eulerRotSeq("123")
                .idOnOrbit("41947")
                .idSensor("a7e99418-b6d6-29ab-e767-440a989cce26")
                .interpolator("LINEAR")
                .interpolatorDegree(2)
                .notes("Notes for this attitude set")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .origObjectId("D6593")
                .origSensorId("ORIGSENSOR-ID")
                .precAngleInit(30.5)
                .satNo(41947)
                .spinAngleInit(25.5)
                .stepSize(60)
                .build()
        )
    }
}

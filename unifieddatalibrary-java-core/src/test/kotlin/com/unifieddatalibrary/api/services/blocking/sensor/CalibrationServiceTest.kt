// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.sensor

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCountParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCreateBulkParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationCreateParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationQueryParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationRetrieveParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationTupleParams
import com.unifieddatalibrary.api.models.sensor.calibration.CalibrationUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CalibrationServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val calibrationService = client.sensor().calibration()

        calibrationService.create(
            CalibrationCreateParams.builder()
                .classificationMarking("U")
                .dataMode(CalibrationCreateParams.DataMode.TEST)
                .idSensor("09f2c68c-5e24-4b72-9cc8-ba9b1efa82f0")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .azRaAccelBias(0.0123)
                .azRaAccelSigma(0.0123)
                .azRaBias(0.327883)
                .azRaRateBias(0.123)
                .azRaRateSigma(0.123)
                .azRaRms(0.605333)
                .azRaSigma(0.000381)
                .calAngleRef("AZEL")
                .calTrackMode("INTRA_TRACK")
                .calType("OPERATIONAL")
                .confidenceNoiseBias(0.001477)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .duration(14.125)
                .ecr(listOf(352815.1, -5852915.3, 3255189.0))
                .elDecAccelBias(0.0123)
                .elDecAccelSigma(0.0123)
                .elDecBias(0.012555)
                .elDecRateBias(0.123)
                .elDecRateSigma(0.123)
                .elDecRms(0.080505)
                .elDecSigma(0.00265)
                .endTime(OffsetDateTime.parse("2018-01-14T16:00:00.123Z"))
                .numAzRaObs(339)
                .numElDecObs(339)
                .numObs(341)
                .numPhotoObs(77)
                .numRangeObs(341)
                .numRangeRateObs(341)
                .numRcsObs(325)
                .numTimeObs(307)
                .numTracks(85)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .photoBias(0.123)
                .photoSigma(0.0123)
                .rangeAccelBias(0.123)
                .rangeAccelSigma(0.0123)
                .rangeBias(0.024777)
                .rangeRateBias(0.105333)
                .rangeRateRms(0.000227)
                .rangeRateSigma(0.000321)
                .rangeRms(0.0123)
                .rangeSigma(0.042644)
                .rcsBias(0.123)
                .rcsSigma(0.0123)
                .refTargets(listOf("xx", "yy", "zz"))
                .refType("SLR")
                .senType("PHASED ARRAY")
                .sourceDl("AXE")
                .timeBias(0.000372)
                .timeBiasSigma(15.333212)
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
        val calibrationService = client.sensor().calibration()

        val calibration =
            calibrationService.retrieve(
                CalibrationRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        calibration.validate()
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val calibrationService = client.sensor().calibration()

        calibrationService.count(
            CalibrationCountParams.builder()
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val calibrationService = client.sensor().calibration()

        calibrationService.createBulk(
            CalibrationCreateBulkParams.builder()
                .addBody(
                    CalibrationCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(CalibrationCreateBulkParams.Body.DataMode.TEST)
                        .idSensor("09f2c68c-5e24-4b72-9cc8-ba9b1efa82f0")
                        .source("Bluestaq")
                        .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .azRaAccelBias(0.0123)
                        .azRaAccelSigma(0.0123)
                        .azRaBias(0.327883)
                        .azRaRateBias(0.123)
                        .azRaRateSigma(0.123)
                        .azRaRms(0.605333)
                        .azRaSigma(0.000381)
                        .calAngleRef("AZEL")
                        .calTrackMode("INTRA_TRACK")
                        .calType("OPERATIONAL")
                        .confidenceNoiseBias(0.001477)
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .duration(14.125)
                        .ecr(listOf(352815.1, -5852915.3, 3255189.0))
                        .elDecAccelBias(0.0123)
                        .elDecAccelSigma(0.0123)
                        .elDecBias(0.012555)
                        .elDecRateBias(0.123)
                        .elDecRateSigma(0.123)
                        .elDecRms(0.080505)
                        .elDecSigma(0.00265)
                        .endTime(OffsetDateTime.parse("2018-01-14T16:00:00.123Z"))
                        .numAzRaObs(339)
                        .numElDecObs(339)
                        .numObs(341)
                        .numPhotoObs(77)
                        .numRangeObs(341)
                        .numRangeRateObs(341)
                        .numRcsObs(325)
                        .numTimeObs(307)
                        .numTracks(85)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .photoBias(0.123)
                        .photoSigma(0.0123)
                        .rangeAccelBias(0.123)
                        .rangeAccelSigma(0.0123)
                        .rangeBias(0.024777)
                        .rangeRateBias(0.105333)
                        .rangeRateRms(0.000227)
                        .rangeRateSigma(0.000321)
                        .rangeRms(0.0123)
                        .rangeSigma(0.042644)
                        .rcsBias(0.123)
                        .rcsSigma(0.0123)
                        .refTargets(listOf("xx", "yy", "zz"))
                        .refType("SLR")
                        .senType("PHASED ARRAY")
                        .sourceDl("AXE")
                        .timeBias(0.000372)
                        .timeBiasSigma(15.333212)
                        .build()
                )
                .build()
        )
    }

    @Test
    fun query() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val calibrationService = client.sensor().calibration()

        val response =
            calibrationService.query(
                CalibrationQueryParams.builder()
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val calibrationService = client.sensor().calibration()

        val response = calibrationService.queryHelp()

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
        val calibrationService = client.sensor().calibration()

        val response =
            calibrationService.tuple(
                CalibrationTupleParams.builder()
                    .columns("columns")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val calibrationService = client.sensor().calibration()

        calibrationService.unvalidatedPublish(
            CalibrationUnvalidatedPublishParams.builder()
                .addBody(
                    CalibrationUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(CalibrationUnvalidatedPublishParams.Body.DataMode.TEST)
                        .idSensor("09f2c68c-5e24-4b72-9cc8-ba9b1efa82f0")
                        .source("Bluestaq")
                        .startTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .azRaAccelBias(0.0123)
                        .azRaAccelSigma(0.0123)
                        .azRaBias(0.327883)
                        .azRaRateBias(0.123)
                        .azRaRateSigma(0.123)
                        .azRaRms(0.605333)
                        .azRaSigma(0.000381)
                        .calAngleRef("AZEL")
                        .calTrackMode("INTRA_TRACK")
                        .calType("OPERATIONAL")
                        .confidenceNoiseBias(0.001477)
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .duration(14.125)
                        .ecr(listOf(352815.1, -5852915.3, 3255189.0))
                        .elDecAccelBias(0.0123)
                        .elDecAccelSigma(0.0123)
                        .elDecBias(0.012555)
                        .elDecRateBias(0.123)
                        .elDecRateSigma(0.123)
                        .elDecRms(0.080505)
                        .elDecSigma(0.00265)
                        .endTime(OffsetDateTime.parse("2018-01-14T16:00:00.123Z"))
                        .numAzRaObs(339)
                        .numElDecObs(339)
                        .numObs(341)
                        .numPhotoObs(77)
                        .numRangeObs(341)
                        .numRangeRateObs(341)
                        .numRcsObs(325)
                        .numTimeObs(307)
                        .numTracks(85)
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .photoBias(0.123)
                        .photoSigma(0.0123)
                        .rangeAccelBias(0.123)
                        .rangeAccelSigma(0.0123)
                        .rangeBias(0.024777)
                        .rangeRateBias(0.105333)
                        .rangeRateRms(0.000227)
                        .rangeRateSigma(0.000321)
                        .rangeRms(0.0123)
                        .rangeSigma(0.042644)
                        .rcsBias(0.123)
                        .rcsSigma(0.0123)
                        .refTargets(listOf("xx", "yy", "zz"))
                        .refType("SLR")
                        .senType("PHASED ARRAY")
                        .sourceDl("AXE")
                        .timeBias(0.000372)
                        .timeBiasSigma(15.333212)
                        .build()
                )
                .build()
        )
    }
}

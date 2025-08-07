// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataCountParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataCreateBulkParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataCreateParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataGetParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataListParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataTupleParams
import com.unifieddatalibrary.api.models.weatherdata.WeatherDataUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WeatherDataServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val weatherDataServiceAsync = client.weatherData()

        val future =
            weatherDataServiceAsync.create(
                WeatherDataCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(WeatherDataCreateParams.DataMode.TEST)
                    .obTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                    .source("Bluestaq")
                    .id("WEATHER-DATA-ID")
                    .angleOrientation(75.7)
                    .avgRefPwr(714.9)
                    .avgTxPwr(20.23)
                    .checksum(133)
                    .addCoInteg(4)
                    .addCoInteg(3)
                    .addConsRec(5)
                    .addConsRec(2)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .addDoppVel(44.4)
                    .addDoppVel(467.3)
                    .fileCreation(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                    .addFirstGuessAvg(16)
                    .addFirstGuessAvg(1)
                    .idSensor("0129f577-e04c-441e-65ca-0a04a750bed9")
                    .addInterpulsePeriod(1000.3)
                    .addInterpulsePeriod(1000.2)
                    .lightDetSensors(listOf(11, 28, 190))
                    .lightEventNum(9)
                    .addNoiseLvl(58.2)
                    .addNoiseLvl(58.3)
                    .numElements(640)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .origSensorId("ORIGSENSOR-ID")
                    .posConfidence(0.1)
                    .qcValue(4)
                    .sectorNum(20)
                    .semiMajorAxis(3.4)
                    .semiMinorAxis(0.3)
                    .addSigPwr(116.5)
                    .addSigPwr(121.6)
                    .sigStrength(163.7)
                    .addSnr(14.5)
                    .addSnr(-16.2)
                    .addSpecAvg(4)
                    .addSpecAvg(3)
                    .addSpecWidth(0.3)
                    .addSpecWidth(0.6)
                    .addSrcId("1b23ba93-0957-4654-b5ca-8c3703f3ec57")
                    .addSrcId("32944ee4-0437-4d94-95ce-2f2823ffa001")
                    .addSrcTyp("SENSOR")
                    .addSrcTyp("WEATHERREPORT")
                    .addTdAvgSampleNum(32)
                    .addTdAvgSampleNum(30)
                    .termAlt(19505.1)
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
        val weatherDataServiceAsync = client.weatherData()

        val pageFuture =
            weatherDataServiceAsync.list(
                WeatherDataListParams.builder()
                    .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val weatherDataServiceAsync = client.weatherData()

        val responseFuture =
            weatherDataServiceAsync.count(
                WeatherDataCountParams.builder()
                    .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val weatherDataServiceAsync = client.weatherData()

        val future =
            weatherDataServiceAsync.createBulk(
                WeatherDataCreateBulkParams.builder()
                    .addBody(
                        WeatherDataCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(WeatherDataCreateBulkParams.Body.DataMode.TEST)
                            .obTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .source("Bluestaq")
                            .id("WEATHER-DATA-ID")
                            .angleOrientation(75.7)
                            .avgRefPwr(714.9)
                            .avgTxPwr(20.23)
                            .checksum(133)
                            .addCoInteg(4)
                            .addCoInteg(3)
                            .addConsRec(5)
                            .addConsRec(2)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .addDoppVel(44.4)
                            .addDoppVel(467.3)
                            .fileCreation(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .addFirstGuessAvg(16)
                            .addFirstGuessAvg(1)
                            .idSensor("0129f577-e04c-441e-65ca-0a04a750bed9")
                            .addInterpulsePeriod(1000.3)
                            .addInterpulsePeriod(1000.2)
                            .lightDetSensors(listOf(11, 28, 190))
                            .lightEventNum(9)
                            .addNoiseLvl(58.2)
                            .addNoiseLvl(58.3)
                            .numElements(640)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .origSensorId("ORIGSENSOR-ID")
                            .posConfidence(0.1)
                            .qcValue(4)
                            .sectorNum(20)
                            .semiMajorAxis(3.4)
                            .semiMinorAxis(0.3)
                            .addSigPwr(116.5)
                            .addSigPwr(121.6)
                            .sigStrength(163.7)
                            .addSnr(14.5)
                            .addSnr(-16.2)
                            .addSpecAvg(4)
                            .addSpecAvg(3)
                            .addSpecWidth(0.3)
                            .addSpecWidth(0.6)
                            .addSrcId("1b23ba93-0957-4654-b5ca-8c3703f3ec57")
                            .addSrcId("32944ee4-0437-4d94-95ce-2f2823ffa001")
                            .addSrcTyp("SENSOR")
                            .addSrcTyp("WEATHERREPORT")
                            .addTdAvgSampleNum(32)
                            .addTdAvgSampleNum(30)
                            .termAlt(19505.1)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val weatherDataServiceAsync = client.weatherData()

        val weatherDataFullFuture =
            weatherDataServiceAsync.get(
                WeatherDataGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val weatherDataFull = weatherDataFullFuture.get()
        weatherDataFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val weatherDataServiceAsync = client.weatherData()

        val responseFuture = weatherDataServiceAsync.queryhelp()

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
        val weatherDataServiceAsync = client.weatherData()

        val weatherDataFullsFuture =
            weatherDataServiceAsync.tuple(
                WeatherDataTupleParams.builder()
                    .columns("columns")
                    .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val weatherDataFulls = weatherDataFullsFuture.get()
        weatherDataFulls.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val weatherDataServiceAsync = client.weatherData()

        val future =
            weatherDataServiceAsync.unvalidatedPublish(
                WeatherDataUnvalidatedPublishParams.builder()
                    .addBody(
                        WeatherDataUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(WeatherDataUnvalidatedPublishParams.Body.DataMode.TEST)
                            .obTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .source("Bluestaq")
                            .id("WEATHER-DATA-ID")
                            .angleOrientation(75.7)
                            .avgRefPwr(714.9)
                            .avgTxPwr(20.23)
                            .checksum(133)
                            .addCoInteg(4)
                            .addCoInteg(3)
                            .addConsRec(5)
                            .addConsRec(2)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .addDoppVel(44.4)
                            .addDoppVel(467.3)
                            .fileCreation(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .addFirstGuessAvg(16)
                            .addFirstGuessAvg(1)
                            .idSensor("0129f577-e04c-441e-65ca-0a04a750bed9")
                            .addInterpulsePeriod(1000.3)
                            .addInterpulsePeriod(1000.2)
                            .lightDetSensors(listOf(11, 28, 190))
                            .lightEventNum(9)
                            .addNoiseLvl(58.2)
                            .addNoiseLvl(58.3)
                            .numElements(640)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .origSensorId("ORIGSENSOR-ID")
                            .posConfidence(0.1)
                            .qcValue(4)
                            .sectorNum(20)
                            .semiMajorAxis(3.4)
                            .semiMinorAxis(0.3)
                            .addSigPwr(116.5)
                            .addSigPwr(121.6)
                            .sigStrength(163.7)
                            .addSnr(14.5)
                            .addSnr(-16.2)
                            .addSpecAvg(4)
                            .addSpecAvg(3)
                            .addSpecWidth(0.3)
                            .addSpecWidth(0.6)
                            .addSrcId("1b23ba93-0957-4654-b5ca-8c3703f3ec57")
                            .addSrcId("32944ee4-0437-4d94-95ce-2f2823ffa001")
                            .addSrcTyp("SENSOR")
                            .addSrcTyp("WEATHERREPORT")
                            .addTdAvgSampleNum(32)
                            .addTdAvgSampleNum(30)
                            .termAlt(19505.1)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}

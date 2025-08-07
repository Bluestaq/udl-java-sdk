// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.airoperations

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderCountParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderCreateParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderRetrieveParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderTupleParams
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AirTaskingOrderServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airTaskingOrderServiceAsync = client.airOperations().airTaskingOrders()

        val future =
            airTaskingOrderServiceAsync.create(
                AirTaskingOrderCreateParams.builder()
                    .beginTs(OffsetDateTime.parse("2023-10-25T12:00:00.123Z"))
                    .classificationMarking("U")
                    .dataMode(AirTaskingOrderCreateParams.DataMode.TEST)
                    .opExerName("DESERT WIND")
                    .source("Bluestaq")
                    .id("POI-ID")
                    .ackReqInd("YES")
                    .ackUnitInstructions("INST:45TS")
                    .addAcMsnTasking(
                        AirTaskingOrderCreateParams.AcMsnTasking.builder()
                            .countryCode("US")
                            .taskedService("A")
                            .unitDesignator("AMPHIB5DIV")
                            .addAcMsnLocSeg(
                                AirTaskingOrderCreateParams.AcMsnTasking.AcMsnLocSeg.builder()
                                    .startTime(OffsetDateTime.parse("2021-10-25T12:00:00.123Z"))
                                    .airMsnPri("1A")
                                    .alt(210)
                                    .areaGeoRad(1000)
                                    .endTime(OffsetDateTime.parse("2021-10-25T12:00:00.123Z"))
                                    .msnLocName("KLSV")
                                    .msnLocPtBarT("330T-PT ALFA-50NM")
                                    .msnLocPtLat(35.123)
                                    .msnLocPtLon(79.01)
                                    .msnLocPtName("PT ALFA")
                                    .build()
                            )
                            .alertStatus(30)
                            .amcMsnNum("AMC:JJXD123HA045")
                            .depLocLat(35.123)
                            .depLocLon(79.2354)
                            .depLocName("ICAO:KBIF")
                            .depLocUtm("32WDL123123")
                            .depTime(OffsetDateTime.parse("2021-10-25T12:00:00.123Z"))
                            .addIndAcTasking(
                                AirTaskingOrderCreateParams.AcMsnTasking.IndAcTasking.builder()
                                    .acftType("F35A")
                                    .callSign("EAGLE47")
                                    .iffSifMode1Code("111")
                                    .iffSifMode2Code("20147")
                                    .iffSifMode3Code("30147")
                                    .addJuAddress(12345)
                                    .addJuAddress(65432)
                                    .link16CallSign("EE47")
                                    .numAcft(2)
                                    .priConfigCode("6A2W3")
                                    .secConfigCode("2S2WG")
                                    .tacanChan(123)
                                    .build()
                            )
                            .msnCommander("MC")
                            .msnNum("D123HA")
                            .pkgId("ZZ")
                            .priMsnType("CAS")
                            .addRcvyLocLat(48.8584)
                            .addRcvyLocLat(40.7554)
                            .addRcvyLocLon(2.2945)
                            .addRcvyLocLon(-73.9866)
                            .addRcvyLocName("ARRLOC:KBIF")
                            .addRcvyLocName("ARRLOC:KDZ7")
                            .addRcvyLocUtm("ARRUTMO:32WDL123123")
                            .addRcvyLocUtm("ARRUTMO:32WDL321321")
                            .addRcvyTime(OffsetDateTime.parse("2021-10-25T16:00:00.234Z"))
                            .addRcvyTime(OffsetDateTime.parse("2021-10-26T16:00:00.234Z"))
                            .resMsnInd("N")
                            .secMsnType("SEAD")
                            .unitLocName("ICAO:KXXQ")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .endTs(OffsetDateTime.parse("2023-10-27T12:00:00.123Z"))
                    .addGenText(
                        AirTaskingOrderCreateParams.GenText.builder()
                            .text("FREE-TEXT")
                            .textInd("OPENING REMARKS")
                            .build()
                    )
                    .msgMonth("OCT")
                    .msgOriginator("USCENTCOM")
                    .msgQualifier("CHG")
                    .msgSn("ATO A")
                    .addNavalFltOp(
                        AirTaskingOrderCreateParams.NavalFltOp.builder()
                            .shipName("USS WASP")
                            .fltOpStart(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                            .fltOpStop(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                            .addSchdLaunchRcvyTime(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                            .build()
                    )
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .rawFileUri("Example URI")
                    .sourceDl("AXE")
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
        val airTaskingOrderServiceAsync = client.airOperations().airTaskingOrders()

        val airTaskingOrderFullFuture =
            airTaskingOrderServiceAsync.retrieve(
                AirTaskingOrderRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val airTaskingOrderFull = airTaskingOrderFullFuture.get()
        airTaskingOrderFull.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airTaskingOrderServiceAsync = client.airOperations().airTaskingOrders()

        val pageFuture = airTaskingOrderServiceAsync.list()

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
        val airTaskingOrderServiceAsync = client.airOperations().airTaskingOrders()

        val responseFuture =
            airTaskingOrderServiceAsync.count(
                AirTaskingOrderCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airTaskingOrderServiceAsync = client.airOperations().airTaskingOrders()

        val responseFuture = airTaskingOrderServiceAsync.queryHelp()

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
        val airTaskingOrderServiceAsync = client.airOperations().airTaskingOrders()

        val airTaskingOrderFullsFuture =
            airTaskingOrderServiceAsync.tuple(
                AirTaskingOrderTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val airTaskingOrderFulls = airTaskingOrderFullsFuture.get()
        airTaskingOrderFulls.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airTaskingOrderServiceAsync = client.airOperations().airTaskingOrders()

        val future =
            airTaskingOrderServiceAsync.unvalidatedPublish(
                AirTaskingOrderUnvalidatedPublishParams.builder()
                    .addBody(
                        AirTaskingOrderUnvalidatedPublishParams.Body.builder()
                            .beginTs(OffsetDateTime.parse("2023-10-25T12:00:00.123Z"))
                            .classificationMarking("U")
                            .dataMode(AirTaskingOrderUnvalidatedPublishParams.Body.DataMode.TEST)
                            .opExerName("DESERT WIND")
                            .source("Bluestaq")
                            .id("POI-ID")
                            .ackReqInd("YES")
                            .ackUnitInstructions("INST:45TS")
                            .addAcMsnTasking(
                                AirTaskingOrderUnvalidatedPublishParams.Body.AcMsnTasking.builder()
                                    .countryCode("US")
                                    .taskedService("A")
                                    .unitDesignator("AMPHIB5DIV")
                                    .addAcMsnLocSeg(
                                        AirTaskingOrderUnvalidatedPublishParams.Body.AcMsnTasking
                                            .AcMsnLocSeg
                                            .builder()
                                            .startTime(
                                                OffsetDateTime.parse("2021-10-25T12:00:00.123Z")
                                            )
                                            .airMsnPri("1A")
                                            .alt(210)
                                            .areaGeoRad(1000)
                                            .endTime(
                                                OffsetDateTime.parse("2021-10-25T12:00:00.123Z")
                                            )
                                            .msnLocName("KLSV")
                                            .msnLocPtBarT("330T-PT ALFA-50NM")
                                            .msnLocPtLat(35.123)
                                            .msnLocPtLon(79.01)
                                            .msnLocPtName("PT ALFA")
                                            .build()
                                    )
                                    .alertStatus(30)
                                    .amcMsnNum("AMC:JJXD123HA045")
                                    .depLocLat(35.123)
                                    .depLocLon(79.2354)
                                    .depLocName("ICAO:KBIF")
                                    .depLocUtm("32WDL123123")
                                    .depTime(OffsetDateTime.parse("2021-10-25T12:00:00.123Z"))
                                    .addIndAcTasking(
                                        AirTaskingOrderUnvalidatedPublishParams.Body.AcMsnTasking
                                            .IndAcTasking
                                            .builder()
                                            .acftType("F35A")
                                            .callSign("EAGLE47")
                                            .iffSifMode1Code("111")
                                            .iffSifMode2Code("20147")
                                            .iffSifMode3Code("30147")
                                            .addJuAddress(12345)
                                            .addJuAddress(65432)
                                            .link16CallSign("EE47")
                                            .numAcft(2)
                                            .priConfigCode("6A2W3")
                                            .secConfigCode("2S2WG")
                                            .tacanChan(123)
                                            .build()
                                    )
                                    .msnCommander("MC")
                                    .msnNum("D123HA")
                                    .pkgId("ZZ")
                                    .priMsnType("CAS")
                                    .addRcvyLocLat(48.8584)
                                    .addRcvyLocLat(40.7554)
                                    .addRcvyLocLon(2.2945)
                                    .addRcvyLocLon(-73.9866)
                                    .addRcvyLocName("ARRLOC:KBIF")
                                    .addRcvyLocName("ARRLOC:KDZ7")
                                    .addRcvyLocUtm("ARRUTMO:32WDL123123")
                                    .addRcvyLocUtm("ARRUTMO:32WDL321321")
                                    .addRcvyTime(OffsetDateTime.parse("2021-10-25T16:00:00.234Z"))
                                    .addRcvyTime(OffsetDateTime.parse("2021-10-26T16:00:00.234Z"))
                                    .resMsnInd("N")
                                    .secMsnType("SEAD")
                                    .unitLocName("ICAO:KXXQ")
                                    .build()
                            )
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .endTs(OffsetDateTime.parse("2023-10-27T12:00:00.123Z"))
                            .addGenText(
                                AirTaskingOrderUnvalidatedPublishParams.Body.GenText.builder()
                                    .text("FREE-TEXT")
                                    .textInd("OPENING REMARKS")
                                    .build()
                            )
                            .msgMonth("OCT")
                            .msgOriginator("USCENTCOM")
                            .msgQualifier("CHG")
                            .msgSn("ATO A")
                            .addNavalFltOp(
                                AirTaskingOrderUnvalidatedPublishParams.Body.NavalFltOp.builder()
                                    .shipName("USS WASP")
                                    .fltOpStart(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                                    .fltOpStop(OffsetDateTime.parse("2021-02-25T12:00:00.123Z"))
                                    .addSchdLaunchRcvyTime(
                                        OffsetDateTime.parse("2021-02-25T12:00:00.123Z")
                                    )
                                    .build()
                            )
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .rawFileUri("Example URI")
                            .sourceDl("AXE")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}

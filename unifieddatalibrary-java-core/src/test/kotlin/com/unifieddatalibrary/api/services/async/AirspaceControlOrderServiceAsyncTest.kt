// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderCountParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderCreateBulkParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderCreateParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderRetrieveParams
import com.unifieddatalibrary.api.models.airspacecontrolorders.AirspaceControlOrderTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AirspaceControlOrderServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airspaceControlOrderServiceAsync = client.airspaceControlOrders()

        val future =
            airspaceControlOrderServiceAsync.create(
                AirspaceControlOrderCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(AirspaceControlOrderCreateParams.DataMode.TEST)
                    .opExName("DESERT WIND")
                    .originator("USCENTCOM")
                    .source("Bluestaq")
                    .startTime(OffsetDateTime.parse("2024-01-07T13:55:43.123Z"))
                    .id("c44b0a80-9fef-63d9-6267-79037fb93e4c")
                    .acoComments("CHOKE POINTS")
                    .acoSerialNum("27B")
                    .addAirspaceControlMeansStatus(
                        AirspaceControlOrderCreateParams.AirspaceControlMeansStatus.builder()
                            .addAirspaceControlMean(
                                AirspaceControlOrderCreateParams.AirspaceControlMeansStatus
                                    .AirspaceControlMean
                                    .builder()
                                    .addAirspaceControlPoint(
                                        AirspaceControlOrderCreateParams.AirspaceControlMeansStatus
                                            .AirspaceControlMean
                                            .AirspaceControlPoint
                                            .builder()
                                            .ctrlPtAltitude("BRFL:MSL-FL230")
                                            .ctrlPtLocation("203632N0594256E")
                                            .ctrlPtName("APPLE")
                                            .ctrlPtType("CP")
                                            .build()
                                    )
                                    .addAirspaceTimePeriod(
                                        AirspaceControlOrderCreateParams.AirspaceControlMeansStatus
                                            .AirspaceControlMean
                                            .AirspaceTimePeriod
                                            .builder()
                                            .addIntDur("65WK")
                                            .addIntFreq("WEEKLY")
                                            .timeEnd("141325ZFEB2002")
                                            .timeMode("DISCRETE")
                                            .timeStart("141325ZFEB2002")
                                            .build()
                                    )
                                    .bearing0(330.0)
                                    .bearing1(160.0)
                                    .cmId("DESIG:C34")
                                    .cmShape(
                                        AirspaceControlOrderCreateParams.AirspaceControlMeansStatus
                                            .AirspaceControlMean
                                            .CmShape
                                            .POLYARC
                                    )
                                    .cmType("cmType")
                                    .cntrlAuth("RHEIN MAIN CP")
                                    .addCntrlAuthFreq("125.25MHZ")
                                    .coord0("152345N0505657E")
                                    .coord1("1523N05057E")
                                    .corrWayPoints(listOf("POB", "RDU", "IAD"))
                                    .effVDim("BRRA:GL-100AGL")
                                    .freeText(
                                        "1. CAPACITY: MDM TK, 50 VEHICLE CONVOY. 2. CHOKE POINTS: EXIT 5"
                                    )
                                    .genTextInd("SITUATION")
                                    .geoDatumAlt("NAR")
                                    .link16Id("F3356")
                                    .orbitAlignment("C")
                                    .polyCoord(
                                        listOf(
                                            "203632N0594256E",
                                            "155000N0594815E",
                                            "155000N0591343E",
                                        )
                                    )
                                    .radMag0(30.04)
                                    .radMag1(50.12)
                                    .radMagUnit("NM")
                                    .trackLeg(99)
                                    .transAltitude("18000FT")
                                    .usage("usage")
                                    .width(15.6)
                                    .widthLeft(5.2)
                                    .widthRight(10.4)
                                    .widthUnit("KM")
                                    .build()
                            )
                            .cmStat("ADD")
                            .cmStatId(listOf("DESIGN:B35", "NAME:ERMA", "RANG:C21-C25"))
                            .build()
                    )
                    .addAirspaceControlOrderReference(
                        AirspaceControlOrderCreateParams.AirspaceControlOrderReference.builder()
                            .refOriginator("SHAPE")
                            .refSerialNum("100")
                            .addRefSiC("RCA")
                            .addRefSiC("FN:4503B")
                            .refSId("A")
                            .refSpecialNotation("NOTAL")
                            .refTs(OffsetDateTime.parse("2024-01-07T13:55:43.123Z"))
                            .refType("NBC1")
                            .build()
                    )
                    .areaOfValidity("FORT BRAGG")
                    .addClassReason("15C")
                    .addClassReason("10C")
                    .classSource("ORIG:USJFCOM")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .addDeclassExemptionCode("X1")
                    .addDeclassExemptionCode("X2")
                    .addDowngradeInsDate("NST:AT EXERCISE ENDEX")
                    .addDowngradeInsDate("DATE:25NOV1997")
                    .geoDatum("EUR-T")
                    .month("OCT")
                    .opExInfo("CONTROL")
                    .opExInfoAlt("ORANGE")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .planOrigNum("SACEUR 106")
                    .qualifier("CHG")
                    .qualSn(1)
                    .rawFileUri("EXAMPLE URI")
                    .serialNum("1201003")
                    .sourceDl("AXE")
                    .stopQualifier("AFTER")
                    .stopTime(OffsetDateTime.parse("2024-01-08T13:55:43.123Z"))
                    .undLnkTrks(listOf("A2467", "A3466", "AA232"))
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
        val airspaceControlOrderServiceAsync = client.airspaceControlOrders()

        val airspacecontrolorderFullFuture =
            airspaceControlOrderServiceAsync.retrieve(
                AirspaceControlOrderRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val airspacecontrolorderFull = airspacecontrolorderFullFuture.get()
        airspacecontrolorderFull.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val airspaceControlOrderServiceAsync = client.airspaceControlOrders()

        val pageFuture = airspaceControlOrderServiceAsync.list()

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
        val airspaceControlOrderServiceAsync = client.airspaceControlOrders()

        val responseFuture =
            airspaceControlOrderServiceAsync.count(
                AirspaceControlOrderCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val airspaceControlOrderServiceAsync = client.airspaceControlOrders()

        val future =
            airspaceControlOrderServiceAsync.createBulk(
                AirspaceControlOrderCreateBulkParams.builder()
                    .addBody(
                        AirspaceControlOrderCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(AirspaceControlOrderCreateBulkParams.Body.DataMode.TEST)
                            .opExName("DESERT WIND")
                            .originator("USCENTCOM")
                            .source("Bluestaq")
                            .startTime(OffsetDateTime.parse("2024-01-07T13:55:43.123Z"))
                            .id("c44b0a80-9fef-63d9-6267-79037fb93e4c")
                            .acoComments("CHOKE POINTS")
                            .acoSerialNum("27B")
                            .addAirspaceControlMeansStatus(
                                AirspaceControlOrderCreateBulkParams.Body.AirspaceControlMeansStatus
                                    .builder()
                                    .addAirspaceControlMean(
                                        AirspaceControlOrderCreateBulkParams.Body
                                            .AirspaceControlMeansStatus
                                            .AirspaceControlMean
                                            .builder()
                                            .addAirspaceControlPoint(
                                                AirspaceControlOrderCreateBulkParams.Body
                                                    .AirspaceControlMeansStatus
                                                    .AirspaceControlMean
                                                    .AirspaceControlPoint
                                                    .builder()
                                                    .ctrlPtAltitude("BRFL:MSL-FL230")
                                                    .ctrlPtLocation("203632N0594256E")
                                                    .ctrlPtName("APPLE")
                                                    .ctrlPtType("CP")
                                                    .build()
                                            )
                                            .addAirspaceTimePeriod(
                                                AirspaceControlOrderCreateBulkParams.Body
                                                    .AirspaceControlMeansStatus
                                                    .AirspaceControlMean
                                                    .AirspaceTimePeriod
                                                    .builder()
                                                    .addIntDur("65WK")
                                                    .addIntFreq("WEEKLY")
                                                    .timeEnd("141325ZFEB2002")
                                                    .timeMode("DISCRETE")
                                                    .timeStart("141325ZFEB2002")
                                                    .build()
                                            )
                                            .bearing0(330.0)
                                            .bearing1(160.0)
                                            .cmId("DESIG:C34")
                                            .cmShape(
                                                AirspaceControlOrderCreateBulkParams.Body
                                                    .AirspaceControlMeansStatus
                                                    .AirspaceControlMean
                                                    .CmShape
                                                    .POLYARC
                                            )
                                            .cmType("cmType")
                                            .cntrlAuth("RHEIN MAIN CP")
                                            .addCntrlAuthFreq("125.25MHZ")
                                            .coord0("152345N0505657E")
                                            .coord1("1523N05057E")
                                            .corrWayPoints(listOf("POB", "RDU", "IAD"))
                                            .effVDim("BRRA:GL-100AGL")
                                            .freeText(
                                                "1. CAPACITY: MDM TK, 50 VEHICLE CONVOY. 2. CHOKE POINTS: EXIT 5"
                                            )
                                            .genTextInd("SITUATION")
                                            .geoDatumAlt("NAR")
                                            .link16Id("F3356")
                                            .orbitAlignment("C")
                                            .polyCoord(
                                                listOf(
                                                    "203632N0594256E",
                                                    "155000N0594815E",
                                                    "155000N0591343E",
                                                )
                                            )
                                            .radMag0(30.04)
                                            .radMag1(50.12)
                                            .radMagUnit("NM")
                                            .trackLeg(99)
                                            .transAltitude("18000FT")
                                            .usage("usage")
                                            .width(15.6)
                                            .widthLeft(5.2)
                                            .widthRight(10.4)
                                            .widthUnit("KM")
                                            .build()
                                    )
                                    .cmStat("ADD")
                                    .cmStatId(listOf("DESIGN:B35", "NAME:ERMA", "RANG:C21-C25"))
                                    .build()
                            )
                            .addAirspaceControlOrderReference(
                                AirspaceControlOrderCreateBulkParams.Body
                                    .AirspaceControlOrderReference
                                    .builder()
                                    .refOriginator("SHAPE")
                                    .refSerialNum("100")
                                    .addRefSiC("RCA")
                                    .addRefSiC("FN:4503B")
                                    .refSId("A")
                                    .refSpecialNotation("NOTAL")
                                    .refTs(OffsetDateTime.parse("2024-01-07T13:55:43.123Z"))
                                    .refType("NBC1")
                                    .build()
                            )
                            .areaOfValidity("FORT BRAGG")
                            .addClassReason("15C")
                            .addClassReason("10C")
                            .classSource("ORIG:USJFCOM")
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .addDeclassExemptionCode("X1")
                            .addDeclassExemptionCode("X2")
                            .addDowngradeInsDate("NST:AT EXERCISE ENDEX")
                            .addDowngradeInsDate("DATE:25NOV1997")
                            .geoDatum("EUR-T")
                            .month("OCT")
                            .opExInfo("CONTROL")
                            .opExInfoAlt("ORANGE")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .planOrigNum("SACEUR 106")
                            .qualifier("CHG")
                            .qualSn(1)
                            .rawFileUri("EXAMPLE URI")
                            .serialNum("1201003")
                            .sourceDl("AXE")
                            .stopQualifier("AFTER")
                            .stopTime(OffsetDateTime.parse("2024-01-08T13:55:43.123Z"))
                            .undLnkTrks(listOf("A2467", "A3466", "AA232"))
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
        val airspaceControlOrderServiceAsync = client.airspaceControlOrders()

        val responseFuture = airspaceControlOrderServiceAsync.queryHelp()

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
        val airspaceControlOrderServiceAsync = client.airspaceControlOrders()

        val airspacecontrolorderFullsFuture =
            airspaceControlOrderServiceAsync.tuple(
                AirspaceControlOrderTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val airspacecontrolorderFulls = airspacecontrolorderFullsFuture.get()
        airspacecontrolorderFulls.forEach { it.validate() }
    }
}

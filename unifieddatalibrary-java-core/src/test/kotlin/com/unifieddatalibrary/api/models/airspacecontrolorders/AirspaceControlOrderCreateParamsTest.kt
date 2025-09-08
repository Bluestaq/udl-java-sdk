// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airspacecontrolorders

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirspaceControlOrderCreateParamsTest {

    @Test
    fun create() {
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
                                listOf("203632N0594256E", "155000N0594815E", "155000N0591343E")
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
            .origNetwork("OPS1")
            .planOrigNum("SACEUR 106")
            .qualifier("CHG")
            .qualSn(1)
            .serialNum("1201003")
            .sourceDl("AXE")
            .stopQualifier("AFTER")
            .stopTime(OffsetDateTime.parse("2024-01-08T13:55:43.123Z"))
            .undLnkTrks(listOf("A2467", "A3466", "AA232"))
            .build()
    }

    @Test
    fun body() {
        val params =
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
                                    listOf("203632N0594256E", "155000N0594815E", "155000N0591343E")
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
                .origNetwork("OPS1")
                .planOrigNum("SACEUR 106")
                .qualifier("CHG")
                .qualSn(1)
                .serialNum("1201003")
                .sourceDl("AXE")
                .stopQualifier("AFTER")
                .stopTime(OffsetDateTime.parse("2024-01-08T13:55:43.123Z"))
                .undLnkTrks(listOf("A2467", "A3466", "AA232"))
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(AirspaceControlOrderCreateParams.DataMode.TEST)
        assertThat(body.opExName()).isEqualTo("DESERT WIND")
        assertThat(body.originator()).isEqualTo("USCENTCOM")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2024-01-07T13:55:43.123Z"))
        assertThat(body.id()).contains("c44b0a80-9fef-63d9-6267-79037fb93e4c")
        assertThat(body.acoComments()).contains("CHOKE POINTS")
        assertThat(body.acoSerialNum()).contains("27B")
        assertThat(body.airspaceControlMeansStatus().getOrNull())
            .containsExactly(
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
                                listOf("203632N0594256E", "155000N0594815E", "155000N0591343E")
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
        assertThat(body.airspaceControlOrderReferences().getOrNull())
            .containsExactly(
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
        assertThat(body.areaOfValidity()).contains("FORT BRAGG")
        assertThat(body.classReasons().getOrNull()).containsExactly("15C", "10C")
        assertThat(body.classSource()).contains("ORIG:USJFCOM")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.declassExemptionCodes().getOrNull()).containsExactly("X1", "X2")
        assertThat(body.downgradeInsDates().getOrNull())
            .containsExactly("NST:AT EXERCISE ENDEX", "DATE:25NOV1997")
        assertThat(body.geoDatum()).contains("EUR-T")
        assertThat(body.month()).contains("OCT")
        assertThat(body.opExInfo()).contains("CONTROL")
        assertThat(body.opExInfoAlt()).contains("ORANGE")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.planOrigNum()).contains("SACEUR 106")
        assertThat(body.qualifier()).contains("CHG")
        assertThat(body.qualSn()).contains(1)
        assertThat(body.serialNum()).contains("1201003")
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.stopQualifier()).contains("AFTER")
        assertThat(body.stopTime()).contains(OffsetDateTime.parse("2024-01-08T13:55:43.123Z"))
        assertThat(body.undLnkTrks().getOrNull()).containsExactly("A2467", "A3466", "AA232")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AirspaceControlOrderCreateParams.builder()
                .classificationMarking("U")
                .dataMode(AirspaceControlOrderCreateParams.DataMode.TEST)
                .opExName("DESERT WIND")
                .originator("USCENTCOM")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2024-01-07T13:55:43.123Z"))
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(AirspaceControlOrderCreateParams.DataMode.TEST)
        assertThat(body.opExName()).isEqualTo("DESERT WIND")
        assertThat(body.originator()).isEqualTo("USCENTCOM")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2024-01-07T13:55:43.123Z"))
    }
}

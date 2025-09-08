// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airspacecontrolorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirspacecontrolorderAbridgedTest {

    @Test
    fun create() {
        val airspacecontrolorderAbridged =
            AirspacecontrolorderAbridged.builder()
                .classificationMarking("U")
                .dataMode(AirspacecontrolorderAbridged.DataMode.TEST)
                .opExName("DESERT WIND")
                .originator("USCENTCOM")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2024-01-07T13:55:43.123Z"))
                .id("c44b0a80-9fef-63d9-6267-79037fb93e4c")
                .acoComments("CHOKE POINTS")
                .acoSerialNum("27B")
                .addAirspaceControlMeansStatus(
                    AirspacecontrolorderAbridged.AirspaceControlMeansStatus.builder()
                        .addAirspaceControlMean(
                            AirspacecontrolorderAbridged.AirspaceControlMeansStatus
                                .AirspaceControlMean
                                .builder()
                                .addAirspaceControlPoint(
                                    AirspacecontrolorderAbridged.AirspaceControlMeansStatus
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
                                    AirspacecontrolorderAbridged.AirspaceControlMeansStatus
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
                                    AirspacecontrolorderAbridged.AirspaceControlMeansStatus
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
                    AirspacecontrolorderAbridged.AirspaceControlOrderReference.builder()
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

        assertThat(airspacecontrolorderAbridged.classificationMarking()).isEqualTo("U")
        assertThat(airspacecontrolorderAbridged.dataMode())
            .isEqualTo(AirspacecontrolorderAbridged.DataMode.TEST)
        assertThat(airspacecontrolorderAbridged.opExName()).isEqualTo("DESERT WIND")
        assertThat(airspacecontrolorderAbridged.originator()).isEqualTo("USCENTCOM")
        assertThat(airspacecontrolorderAbridged.source()).isEqualTo("Bluestaq")
        assertThat(airspacecontrolorderAbridged.startTime())
            .isEqualTo(OffsetDateTime.parse("2024-01-07T13:55:43.123Z"))
        assertThat(airspacecontrolorderAbridged.id())
            .contains("c44b0a80-9fef-63d9-6267-79037fb93e4c")
        assertThat(airspacecontrolorderAbridged.acoComments()).contains("CHOKE POINTS")
        assertThat(airspacecontrolorderAbridged.acoSerialNum()).contains("27B")
        assertThat(airspacecontrolorderAbridged.airspaceControlMeansStatus().getOrNull())
            .containsExactly(
                AirspacecontrolorderAbridged.AirspaceControlMeansStatus.builder()
                    .addAirspaceControlMean(
                        AirspacecontrolorderAbridged.AirspaceControlMeansStatus.AirspaceControlMean
                            .builder()
                            .addAirspaceControlPoint(
                                AirspacecontrolorderAbridged.AirspaceControlMeansStatus
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
                                AirspacecontrolorderAbridged.AirspaceControlMeansStatus
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
                                AirspacecontrolorderAbridged.AirspaceControlMeansStatus
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
        assertThat(airspacecontrolorderAbridged.airspaceControlOrderReferences().getOrNull())
            .containsExactly(
                AirspacecontrolorderAbridged.AirspaceControlOrderReference.builder()
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
        assertThat(airspacecontrolorderAbridged.areaOfValidity()).contains("FORT BRAGG")
        assertThat(airspacecontrolorderAbridged.classReasons().getOrNull())
            .containsExactly("15C", "10C")
        assertThat(airspacecontrolorderAbridged.classSource()).contains("ORIG:USJFCOM")
        assertThat(airspacecontrolorderAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(airspacecontrolorderAbridged.createdBy()).contains("some.user")
        assertThat(airspacecontrolorderAbridged.declassExemptionCodes().getOrNull())
            .containsExactly("X1", "X2")
        assertThat(airspacecontrolorderAbridged.downgradeInsDates().getOrNull())
            .containsExactly("NST:AT EXERCISE ENDEX", "DATE:25NOV1997")
        assertThat(airspacecontrolorderAbridged.geoDatum()).contains("EUR-T")
        assertThat(airspacecontrolorderAbridged.month()).contains("OCT")
        assertThat(airspacecontrolorderAbridged.opExInfo()).contains("CONTROL")
        assertThat(airspacecontrolorderAbridged.opExInfoAlt()).contains("ORANGE")
        assertThat(airspacecontrolorderAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(airspacecontrolorderAbridged.origNetwork()).contains("OPS1")
        assertThat(airspacecontrolorderAbridged.planOrigNum()).contains("SACEUR 106")
        assertThat(airspacecontrolorderAbridged.qualifier()).contains("CHG")
        assertThat(airspacecontrolorderAbridged.qualSn()).contains(1)
        assertThat(airspacecontrolorderAbridged.serialNum()).contains("1201003")
        assertThat(airspacecontrolorderAbridged.sourceDl()).contains("AXE")
        assertThat(airspacecontrolorderAbridged.stopQualifier()).contains("AFTER")
        assertThat(airspacecontrolorderAbridged.stopTime())
            .contains(OffsetDateTime.parse("2024-01-08T13:55:43.123Z"))
        assertThat(airspacecontrolorderAbridged.undLnkTrks().getOrNull())
            .containsExactly("A2467", "A3466", "AA232")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val airspacecontrolorderAbridged =
            AirspacecontrolorderAbridged.builder()
                .classificationMarking("U")
                .dataMode(AirspacecontrolorderAbridged.DataMode.TEST)
                .opExName("DESERT WIND")
                .originator("USCENTCOM")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2024-01-07T13:55:43.123Z"))
                .id("c44b0a80-9fef-63d9-6267-79037fb93e4c")
                .acoComments("CHOKE POINTS")
                .acoSerialNum("27B")
                .addAirspaceControlMeansStatus(
                    AirspacecontrolorderAbridged.AirspaceControlMeansStatus.builder()
                        .addAirspaceControlMean(
                            AirspacecontrolorderAbridged.AirspaceControlMeansStatus
                                .AirspaceControlMean
                                .builder()
                                .addAirspaceControlPoint(
                                    AirspacecontrolorderAbridged.AirspaceControlMeansStatus
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
                                    AirspacecontrolorderAbridged.AirspaceControlMeansStatus
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
                                    AirspacecontrolorderAbridged.AirspaceControlMeansStatus
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
                    AirspacecontrolorderAbridged.AirspaceControlOrderReference.builder()
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

        val roundtrippedAirspacecontrolorderAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(airspacecontrolorderAbridged),
                jacksonTypeRef<AirspacecontrolorderAbridged>(),
            )

        assertThat(roundtrippedAirspacecontrolorderAbridged).isEqualTo(airspacecontrolorderAbridged)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirspacecontrolorderFullTest {

    @Test
    fun create() {
        val airspacecontrolorderFull =
            AirspacecontrolorderFull.builder()
                .classificationMarking("U")
                .dataMode(AirspacecontrolorderFull.DataMode.TEST)
                .opExName("DESERT WIND")
                .originator("USCENTCOM")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2024-01-07T13:55:43.123Z"))
                .id("c44b0a80-9fef-63d9-6267-79037fb93e4c")
                .acoComments("CHOKE POINTS")
                .acoSerialNum("27B")
                .addAirspaceControlMeansStatus(
                    AirspacecontrolorderFull.AirspaceControlMeansStatus.builder()
                        .addAirspaceControlMean(
                            AirspacecontrolorderFull.AirspaceControlMeansStatus.AirspaceControlMean
                                .builder()
                                .addAirspaceControlPoint(
                                    AirspacecontrolorderFull.AirspaceControlMeansStatus
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
                                    AirspacecontrolorderFull.AirspaceControlMeansStatus
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
                                    AirspacecontrolorderFull.AirspaceControlMeansStatus
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
                    AirspacecontrolorderFull.AirspaceControlOrderReference.builder()
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

        assertThat(airspacecontrolorderFull.classificationMarking()).isEqualTo("U")
        assertThat(airspacecontrolorderFull.dataMode())
            .isEqualTo(AirspacecontrolorderFull.DataMode.TEST)
        assertThat(airspacecontrolorderFull.opExName()).isEqualTo("DESERT WIND")
        assertThat(airspacecontrolorderFull.originator()).isEqualTo("USCENTCOM")
        assertThat(airspacecontrolorderFull.source()).isEqualTo("Bluestaq")
        assertThat(airspacecontrolorderFull.startTime())
            .isEqualTo(OffsetDateTime.parse("2024-01-07T13:55:43.123Z"))
        assertThat(airspacecontrolorderFull.id()).contains("c44b0a80-9fef-63d9-6267-79037fb93e4c")
        assertThat(airspacecontrolorderFull.acoComments()).contains("CHOKE POINTS")
        assertThat(airspacecontrolorderFull.acoSerialNum()).contains("27B")
        assertThat(airspacecontrolorderFull.airspaceControlMeansStatus().getOrNull())
            .containsExactly(
                AirspacecontrolorderFull.AirspaceControlMeansStatus.builder()
                    .addAirspaceControlMean(
                        AirspacecontrolorderFull.AirspaceControlMeansStatus.AirspaceControlMean
                            .builder()
                            .addAirspaceControlPoint(
                                AirspacecontrolorderFull.AirspaceControlMeansStatus
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
                                AirspacecontrolorderFull.AirspaceControlMeansStatus
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
                                AirspacecontrolorderFull.AirspaceControlMeansStatus
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
        assertThat(airspacecontrolorderFull.airspaceControlOrderReferences().getOrNull())
            .containsExactly(
                AirspacecontrolorderFull.AirspaceControlOrderReference.builder()
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
        assertThat(airspacecontrolorderFull.areaOfValidity()).contains("FORT BRAGG")
        assertThat(airspacecontrolorderFull.classReasons().getOrNull())
            .containsExactly("15C", "10C")
        assertThat(airspacecontrolorderFull.classSource()).contains("ORIG:USJFCOM")
        assertThat(airspacecontrolorderFull.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(airspacecontrolorderFull.createdBy()).contains("some.user")
        assertThat(airspacecontrolorderFull.declassExemptionCodes().getOrNull())
            .containsExactly("X1", "X2")
        assertThat(airspacecontrolorderFull.downgradeInsDates().getOrNull())
            .containsExactly("NST:AT EXERCISE ENDEX", "DATE:25NOV1997")
        assertThat(airspacecontrolorderFull.geoDatum()).contains("EUR-T")
        assertThat(airspacecontrolorderFull.month()).contains("OCT")
        assertThat(airspacecontrolorderFull.opExInfo()).contains("CONTROL")
        assertThat(airspacecontrolorderFull.opExInfoAlt()).contains("ORANGE")
        assertThat(airspacecontrolorderFull.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(airspacecontrolorderFull.origNetwork()).contains("ORIG")
        assertThat(airspacecontrolorderFull.planOrigNum()).contains("SACEUR 106")
        assertThat(airspacecontrolorderFull.qualifier()).contains("CHG")
        assertThat(airspacecontrolorderFull.qualSn()).contains(1)
        assertThat(airspacecontrolorderFull.rawFileUri()).contains("EXAMPLE URI")
        assertThat(airspacecontrolorderFull.serialNum()).contains("1201003")
        assertThat(airspacecontrolorderFull.sourceDl()).contains("AXE")
        assertThat(airspacecontrolorderFull.stopQualifier()).contains("AFTER")
        assertThat(airspacecontrolorderFull.stopTime())
            .contains(OffsetDateTime.parse("2024-01-08T13:55:43.123Z"))
        assertThat(airspacecontrolorderFull.undLnkTrks().getOrNull())
            .containsExactly("A2467", "A3466", "AA232")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val airspacecontrolorderFull =
            AirspacecontrolorderFull.builder()
                .classificationMarking("U")
                .dataMode(AirspacecontrolorderFull.DataMode.TEST)
                .opExName("DESERT WIND")
                .originator("USCENTCOM")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2024-01-07T13:55:43.123Z"))
                .id("c44b0a80-9fef-63d9-6267-79037fb93e4c")
                .acoComments("CHOKE POINTS")
                .acoSerialNum("27B")
                .addAirspaceControlMeansStatus(
                    AirspacecontrolorderFull.AirspaceControlMeansStatus.builder()
                        .addAirspaceControlMean(
                            AirspacecontrolorderFull.AirspaceControlMeansStatus.AirspaceControlMean
                                .builder()
                                .addAirspaceControlPoint(
                                    AirspacecontrolorderFull.AirspaceControlMeansStatus
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
                                    AirspacecontrolorderFull.AirspaceControlMeansStatus
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
                                    AirspacecontrolorderFull.AirspaceControlMeansStatus
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
                    AirspacecontrolorderFull.AirspaceControlOrderReference.builder()
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

        val roundtrippedAirspacecontrolorderFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(airspacecontrolorderFull),
                jacksonTypeRef<AirspacecontrolorderFull>(),
            )

        assertThat(roundtrippedAirspacecontrolorderFull).isEqualTo(airspacecontrolorderFull)
    }
}

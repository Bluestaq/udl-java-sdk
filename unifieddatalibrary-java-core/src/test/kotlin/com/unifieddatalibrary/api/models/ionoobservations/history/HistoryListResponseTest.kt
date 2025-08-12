// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ionoobservations.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ionoobservations.history.HistoryListResponse
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryListResponseTest {

    @Test
    fun create() {
      val historyListResponse = HistoryListResponse.builder()
          .classificationMarking("U")
          .dataMode(HistoryListResponse.DataMode.TEST)
          .source("Bluestaq")
          .startTimeUtc(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
          .stationId("STATION-ID")
          .system("Example hardware type")
          .systemInfo("Example settings")
          .id("IONOOBSERVATION-ID")
          .amplitude(HistoryListResponse.Amplitude.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(4)
              .addDimension(5)
              .notes("NOTES")
              .build())
          .antennaElementPosition(HistoryListResponse.AntennaElementPosition.builder()
              .addData(listOf(
                1.23, 0.123
              ))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(3)
              .addDimension(4)
              .build())
          .antennaElementPositionCoordinateSystem(HistoryListResponse.AntennaElementPositionCoordinateSystem.J2000)
          .artistFlags(listOf(
            1,
            2,
            3,
          ))
          .azimuth(HistoryListResponse.Azimuth.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .b0(68.07)
          .b1(1.87)
          .addCharAtt(HistoryListResponse.CharAtt.builder()
              .charName("hprimeF2")
              .addClimateModelInputParam("ISSN1 88.1")
              .addClimateModelInputParam("Option 2")
              .climateModelName("IRI")
              .addClimateModelOption("URSI-88")
              .addClimateModelOption("No storm")
              .d("K")
              .lowerBound(1.26)
              .q("T")
              .uncertaintyBoundType("1sigma")
              .upperBound(2.57)
              .ursiId("04")
              .build())
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .d(1.1)
          .d1(1.94)
          .datum(HistoryListResponse.Datum.builder()
              .data(listOf(
                1.1,
                2.1,
                3.1,
              ))
              .notes("NOTES")
              .build())
          .deltafoF2(1.1)
          .densityProfile(HistoryListResponse.DensityProfile.builder()
              .iri(HistoryListResponse.DensityProfile.Iri.builder()
                  .b0(245.1)
                  .b1(3.45)
                  .chi(35.1)
                  .d1(0.0)
                  .description("Full altitude range of 1D vertical plasma density profile for D, E, and F regions of the ionosphere provided by IRI, in which model parameters are replaced with observed ionogram-derived data where available.")
                  .fp1(0.0474732023322638)
                  .fp2(-0.00112685246984002)
                  .fp30(0.00827559450035957)
                  .fp3U(0.000201178475411428)
                  .ha(50.1)
                  .hdx(85.6)
                  .hmD(81.1)
                  .hmE(99.8)
                  .hmF1(210.3)
                  .hmF2(265.42)
                  .hValTop(116.2)
                  .hz(142.7)
                  .nmD(937543116.1)
                  .nmE(154164.1)
                  .nmF1(210486.0)
                  .nmF2(313283.1)
                  .nValB(147025.1)
                  .build())
              .parabolic(HistoryListResponse.DensityProfile.Parabolic.builder()
                  .description("Best-fit algorithm in NHPC software.")
                  .addParabolicItem(HistoryListResponse.DensityProfile.Parabolic.ParabolicItem.builder()
                      .f(3.621)
                      .layer("E")
                      .y(11.1)
                      .z(110.2)
                      .build())
                  .build())
              .quasiParabolic(HistoryListResponse.DensityProfile.QuasiParabolic.builder()
                  .description("Array of the best-fit 3-parameter quasi-parabolas defined via A, B, C coefficients, f^2=A/r^2+B/r+C")
                  .earthRadius(6370.1)
                  .addQuasiParabolicSegment(HistoryListResponse.DensityProfile.QuasiParabolic.QuasiParabolicSegment.builder()
                      .a(-550273940000.0)
                      .b(169837632.0)
                      .c(13104.63)
                      .error(0.0016)
                      .index(12)
                      .rb(6460.1)
                      .re(6480.001)
                      .build())
                  .build())
              .shiftedChebyshev(HistoryListResponse.DensityProfile.ShiftedChebyshev.builder()
                  .description("Best-fit Huang-Reinisch formalism based on shifted Chebyshev expansion.")
                  .addShiftedChebyshev(HistoryListResponse.DensityProfile.ShiftedChebyshev.InnerShiftedChebyshev.builder()
                      .coeffs(listOf(
                        -11.2,
                        -10.536,
                        3.357,
                        -0.888,
                        0.155,
                      ))
                      .error(0.02)
                      .fstart(0.2)
                      .fstop(1.39)
                      .layer("F2")
                      .n(5)
                      .peakheight(110.1)
                      .zhalfNm(210.1)
                      .build())
                  .build())
              .topsideExtensionChapmanConst(HistoryListResponse.DensityProfile.TopsideExtensionChapmanConst.builder()
                  .chi(35.1)
                  .description("Constant scale height Chapman topside layer determined using bottomside peak density parameters and placed chi km above the ionosonde-determined peak height.")
                  .hmF2(265.42)
                  .nmF2(313283.1)
                  .scaleF2(45.191)
                  .build())
              .topsideExtensionVaryChap(HistoryListResponse.DensityProfile.TopsideExtensionVaryChap.builder()
                  .alpha(30.1)
                  .beta(30.1)
                  .chi(30.1)
                  .description("Constant scale height Chapman topside layer determined using bottomside peak density parameters and placed chi km above the ionosonde-determined peak height.")
                  .hmF2(265.42)
                  .ht(30.1)
                  .nmF2(313283.1)
                  .scaleF2(45.191)
                  .build())
              .addValleyModelCoeff(39.597)
              .addValleyModelCoeff(0.1777)
              .valleyModelDescription("2-parameter UMLCAR model with width W in km and depth D in MHz, no fitting.")
              .build())
          .doppler(HistoryListResponse.Doppler.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .downE(1.1)
          .downEs(1.1)
          .downF(1.1)
          .electronDensity(listOf(
            1.1,
            2.1,
            3.1,
          ))
          .electronDensityUncertainty(listOf(
            0.8,
            0.2,
            0.5,
          ))
          .elevation(HistoryListResponse.Elevation.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(2)
              .addDimension(3)
              .notes("NOTES")
              .build())
          .fbEs(34.867)
          .fe(1.23)
          .ff(0.075)
          .fhprimeF(2.5)
          .fhprimeF2(2.5)
          .fmin(2.025)
          .fminE(2.025)
          .fminEs(1.1)
          .fminF(2.7)
          .fmuf(1.1)
          .foE(1.1)
          .foEa(45.764)
          .foEp(1.1)
          .foEs(2.35)
          .foF1(8.2)
          .foF1p(1.1)
          .foF2(6.75)
          .foF2p(1.1)
          .foP(87.21)
          .frequency(HistoryListResponse.Frequency.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .fxE(1.1)
          .fxF1(4.2)
          .fxF2(4.5)
          .fxI(7.525)
          .height(listOf(
            1.1,
            2.1,
            3.1,
          ))
          .hmE(215.643)
          .hmF1(230.128)
          .hmF2(240.498)
          .hprimeE(98.47)
          .hprimeEa(102.6)
          .hprimeEs(95.0)
          .hprimeF(238.5)
          .hprimeF1(230.1)
          .hprimeF2(238.5)
          .hprimefMuf(1.1)
          .hprimeP(89.45)
          .idSensor("SENSOR-ID")
          .luf(1.1)
          .md(1.1)
          .mufd(1.1)
          .neProfileName("NH")
          .neProfileVersion(4.32)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .origSensorId("ORIGSENSOR-ID")
          .phase(HistoryListResponse.Phase.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .plasmaFrequency(listOf(
            1.1,
            2.1,
            3.1,
          ))
          .plasmaFrequencyUncertainty(listOf(
            0.8,
            0.2,
            0.5,
          ))
          .platformName("Millstone Hill")
          .polarization(HistoryListResponse.Polarization.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                HistoryListResponse.Polarization.UnnamedSchemaWithArrayParent2.X, HistoryListResponse.Polarization.UnnamedSchemaWithArrayParent2.O
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .power(HistoryListResponse.Power.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .qe(0.95)
          .qf(1.83)
          .range(HistoryListResponse.Range.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .addReceiveCoordinate(listOf(
            45.5,
            179.3,
            35.6,
          ))
          .addReceiveCoordinate(listOf(
            -80.2,
            -20.5,
            43.2,
          ))
          .receiveSensorType(HistoryListResponse.ReceiveSensorType.MOBILE)
          .restrictedFrequency(listOf(
            12.5,
            34.5,
            45.3,
          ))
          .restrictedFrequencyNotes("Example notes")
          .scaleHeightF2Peak(35.613)
          .scalerInfo(HistoryListResponse.ScalerInfo.builder()
              .confidenceLevel(11)
              .confidenceScore(75)
              .name("ARTIST-4")
              .organization("UML")
              .type("MANUAL")
              .version(500200.1)
              .build())
          .stokes(HistoryListResponse.Stokes.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAMES1")
              .addDimensionName("NAMES2")
              .addDimension(2)
              .addDimension(3)
              .notes("NOTES")
              .addS(1.0)
              .addS(2.0)
              .build())
          .systemNotes("Example notes")
          .tec(24.673)
          .tidAzimuth(listOf(
            1.1,
            2.1,
            3.1,
          ))
          .tidPeriods(listOf(
            1.1,
            2.1,
            3.1,
          ))
          .tidPhaseSpeeds(listOf(
            1.1,
            2.1,
            3.1,
          ))
          .time(HistoryListResponse.Time.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .traceGeneric(HistoryListResponse.TraceGeneric.builder()
              .addData(listOf(listOf(
                1.23, 1.0903
              )))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .notes("NOTES")
              .build())
          .addTransmitCoordinate(listOf(
            45.5,
            179.3,
            35.6,
          ))
          .addTransmitCoordinate(listOf(
            -80.2,
            -20.5,
            43.2,
          ))
          .transmitSensorType(HistoryListResponse.TransmitSensorType.MOBILE)
          .typeEs("Auroral")
          .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .yE(1.722)
          .yF1(55.645)
          .yF2(62.178)
          .zhalfNm(240.498)
          .zmE(91.744)
          .build()

      assertThat(historyListResponse.classificationMarking()).isEqualTo("U")
      assertThat(historyListResponse.dataMode()).isEqualTo(HistoryListResponse.DataMode.TEST)
      assertThat(historyListResponse.source()).isEqualTo("Bluestaq")
      assertThat(historyListResponse.startTimeUtc()).isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
      assertThat(historyListResponse.stationId()).isEqualTo("STATION-ID")
      assertThat(historyListResponse.system()).isEqualTo("Example hardware type")
      assertThat(historyListResponse.systemInfo()).isEqualTo("Example settings")
      assertThat(historyListResponse.id()).contains("IONOOBSERVATION-ID")
      assertThat(historyListResponse.amplitude()).contains(HistoryListResponse.Amplitude.builder()
          .addData(listOf(listOf(listOf(listOf(listOf(listOf(
            0.02, 0.034
          )))))))
          .addDimensionName("NAME1")
          .addDimensionName("NAME2")
          .addDimension(4)
          .addDimension(5)
          .notes("NOTES")
          .build())
      assertThat(historyListResponse.antennaElementPosition()).contains(HistoryListResponse.AntennaElementPosition.builder()
          .addData(listOf(
            1.23, 0.123
          ))
          .addDimensionName("NAME1")
          .addDimensionName("NAME2")
          .addDimension(3)
          .addDimension(4)
          .build())
      assertThat(historyListResponse.antennaElementPositionCoordinateSystem()).contains(HistoryListResponse.AntennaElementPositionCoordinateSystem.J2000)
      assertThat(historyListResponse.artistFlags().getOrNull()).containsExactly(1, 2, 3)
      assertThat(historyListResponse.azimuth()).contains(HistoryListResponse.Azimuth.builder()
          .addData(listOf(listOf(listOf(listOf(listOf(listOf(
            0.02, 0.034
          )))))))
          .addDimensionName("NAME1")
          .addDimensionName("NAME2")
          .addDimension(1)
          .addDimension(2)
          .notes("NOTES")
          .build())
      assertThat(historyListResponse.b0()).contains(68.07)
      assertThat(historyListResponse.b1()).contains(1.87)
      assertThat(historyListResponse.charAtts().getOrNull()).containsExactly(HistoryListResponse.CharAtt.builder()
          .charName("hprimeF2")
          .addClimateModelInputParam("ISSN1 88.1")
          .addClimateModelInputParam("Option 2")
          .climateModelName("IRI")
          .addClimateModelOption("URSI-88")
          .addClimateModelOption("No storm")
          .d("K")
          .lowerBound(1.26)
          .q("T")
          .uncertaintyBoundType("1sigma")
          .upperBound(2.57)
          .ursiId("04")
          .build())
      assertThat(historyListResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(historyListResponse.createdBy()).contains("some.user")
      assertThat(historyListResponse.d()).contains(1.1)
      assertThat(historyListResponse.d1()).contains(1.94)
      assertThat(historyListResponse.datum()).contains(HistoryListResponse.Datum.builder()
          .data(listOf(
            1.1,
            2.1,
            3.1,
          ))
          .notes("NOTES")
          .build())
      assertThat(historyListResponse.deltafoF2()).contains(1.1)
      assertThat(historyListResponse.densityProfile()).contains(HistoryListResponse.DensityProfile.builder()
          .iri(HistoryListResponse.DensityProfile.Iri.builder()
              .b0(245.1)
              .b1(3.45)
              .chi(35.1)
              .d1(0.0)
              .description("Full altitude range of 1D vertical plasma density profile for D, E, and F regions of the ionosphere provided by IRI, in which model parameters are replaced with observed ionogram-derived data where available.")
              .fp1(0.0474732023322638)
              .fp2(-0.00112685246984002)
              .fp30(0.00827559450035957)
              .fp3U(0.000201178475411428)
              .ha(50.1)
              .hdx(85.6)
              .hmD(81.1)
              .hmE(99.8)
              .hmF1(210.3)
              .hmF2(265.42)
              .hValTop(116.2)
              .hz(142.7)
              .nmD(937543116.1)
              .nmE(154164.1)
              .nmF1(210486.0)
              .nmF2(313283.1)
              .nValB(147025.1)
              .build())
          .parabolic(HistoryListResponse.DensityProfile.Parabolic.builder()
              .description("Best-fit algorithm in NHPC software.")
              .addParabolicItem(HistoryListResponse.DensityProfile.Parabolic.ParabolicItem.builder()
                  .f(3.621)
                  .layer("E")
                  .y(11.1)
                  .z(110.2)
                  .build())
              .build())
          .quasiParabolic(HistoryListResponse.DensityProfile.QuasiParabolic.builder()
              .description("Array of the best-fit 3-parameter quasi-parabolas defined via A, B, C coefficients, f^2=A/r^2+B/r+C")
              .earthRadius(6370.1)
              .addQuasiParabolicSegment(HistoryListResponse.DensityProfile.QuasiParabolic.QuasiParabolicSegment.builder()
                  .a(-550273940000.0)
                  .b(169837632.0)
                  .c(13104.63)
                  .error(0.0016)
                  .index(12)
                  .rb(6460.1)
                  .re(6480.001)
                  .build())
              .build())
          .shiftedChebyshev(HistoryListResponse.DensityProfile.ShiftedChebyshev.builder()
              .description("Best-fit Huang-Reinisch formalism based on shifted Chebyshev expansion.")
              .addShiftedChebyshev(HistoryListResponse.DensityProfile.ShiftedChebyshev.InnerShiftedChebyshev.builder()
                  .coeffs(listOf(
                    -11.2,
                    -10.536,
                    3.357,
                    -0.888,
                    0.155,
                  ))
                  .error(0.02)
                  .fstart(0.2)
                  .fstop(1.39)
                  .layer("F2")
                  .n(5)
                  .peakheight(110.1)
                  .zhalfNm(210.1)
                  .build())
              .build())
          .topsideExtensionChapmanConst(HistoryListResponse.DensityProfile.TopsideExtensionChapmanConst.builder()
              .chi(35.1)
              .description("Constant scale height Chapman topside layer determined using bottomside peak density parameters and placed chi km above the ionosonde-determined peak height.")
              .hmF2(265.42)
              .nmF2(313283.1)
              .scaleF2(45.191)
              .build())
          .topsideExtensionVaryChap(HistoryListResponse.DensityProfile.TopsideExtensionVaryChap.builder()
              .alpha(30.1)
              .beta(30.1)
              .chi(30.1)
              .description("Constant scale height Chapman topside layer determined using bottomside peak density parameters and placed chi km above the ionosonde-determined peak height.")
              .hmF2(265.42)
              .ht(30.1)
              .nmF2(313283.1)
              .scaleF2(45.191)
              .build())
          .addValleyModelCoeff(39.597)
          .addValleyModelCoeff(0.1777)
          .valleyModelDescription("2-parameter UMLCAR model with width W in km and depth D in MHz, no fitting.")
          .build())
      assertThat(historyListResponse.doppler()).contains(HistoryListResponse.Doppler.builder()
          .addData(listOf(listOf(listOf(listOf(listOf(listOf(
            0.02, 0.034
          )))))))
          .addDimensionName("NAME1")
          .addDimensionName("NAME2")
          .addDimension(1)
          .addDimension(2)
          .notes("NOTES")
          .build())
      assertThat(historyListResponse.downE()).contains(1.1)
      assertThat(historyListResponse.downEs()).contains(1.1)
      assertThat(historyListResponse.downF()).contains(1.1)
      assertThat(historyListResponse.electronDensity().getOrNull()).containsExactly(1.1, 2.1, 3.1)
      assertThat(historyListResponse.electronDensityUncertainty().getOrNull()).containsExactly(0.8, 0.2, 0.5)
      assertThat(historyListResponse.elevation()).contains(HistoryListResponse.Elevation.builder()
          .addData(listOf(listOf(listOf(listOf(listOf(listOf(
            0.02, 0.034
          )))))))
          .addDimensionName("NAME1")
          .addDimensionName("NAME2")
          .addDimension(2)
          .addDimension(3)
          .notes("NOTES")
          .build())
      assertThat(historyListResponse.fbEs()).contains(34.867)
      assertThat(historyListResponse.fe()).contains(1.23)
      assertThat(historyListResponse.ff()).contains(0.075)
      assertThat(historyListResponse.fhprimeF()).contains(2.5)
      assertThat(historyListResponse.fhprimeF2()).contains(2.5)
      assertThat(historyListResponse.fmin()).contains(2.025)
      assertThat(historyListResponse.fminE()).contains(2.025)
      assertThat(historyListResponse.fminEs()).contains(1.1)
      assertThat(historyListResponse.fminF()).contains(2.7)
      assertThat(historyListResponse.fmuf()).contains(1.1)
      assertThat(historyListResponse.foE()).contains(1.1)
      assertThat(historyListResponse.foEa()).contains(45.764)
      assertThat(historyListResponse.foEp()).contains(1.1)
      assertThat(historyListResponse.foEs()).contains(2.35)
      assertThat(historyListResponse.foF1()).contains(8.2)
      assertThat(historyListResponse.foF1p()).contains(1.1)
      assertThat(historyListResponse.foF2()).contains(6.75)
      assertThat(historyListResponse.foF2p()).contains(1.1)
      assertThat(historyListResponse.foP()).contains(87.21)
      assertThat(historyListResponse.frequency()).contains(HistoryListResponse.Frequency.builder()
          .addData(listOf(listOf(listOf(listOf(listOf(listOf(
            0.02, 0.034
          )))))))
          .addDimensionName("NAME1")
          .addDimensionName("NAME2")
          .addDimension(1)
          .addDimension(2)
          .notes("NOTES")
          .build())
      assertThat(historyListResponse.fxE()).contains(1.1)
      assertThat(historyListResponse.fxF1()).contains(4.2)
      assertThat(historyListResponse.fxF2()).contains(4.5)
      assertThat(historyListResponse.fxI()).contains(7.525)
      assertThat(historyListResponse.height().getOrNull()).containsExactly(1.1, 2.1, 3.1)
      assertThat(historyListResponse.hmE()).contains(215.643)
      assertThat(historyListResponse.hmF1()).contains(230.128)
      assertThat(historyListResponse.hmF2()).contains(240.498)
      assertThat(historyListResponse.hprimeE()).contains(98.47)
      assertThat(historyListResponse.hprimeEa()).contains(102.6)
      assertThat(historyListResponse.hprimeEs()).contains(95.0)
      assertThat(historyListResponse.hprimeF()).contains(238.5)
      assertThat(historyListResponse.hprimeF1()).contains(230.1)
      assertThat(historyListResponse.hprimeF2()).contains(238.5)
      assertThat(historyListResponse.hprimefMuf()).contains(1.1)
      assertThat(historyListResponse.hprimeP()).contains(89.45)
      assertThat(historyListResponse.idSensor()).contains("SENSOR-ID")
      assertThat(historyListResponse.luf()).contains(1.1)
      assertThat(historyListResponse.md()).contains(1.1)
      assertThat(historyListResponse.mufd()).contains(1.1)
      assertThat(historyListResponse.neProfileName()).contains("NH")
      assertThat(historyListResponse.neProfileVersion()).contains(4.32)
      assertThat(historyListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(historyListResponse.origNetwork()).contains("ORIG")
      assertThat(historyListResponse.origSensorId()).contains("ORIGSENSOR-ID")
      assertThat(historyListResponse.phase()).contains(HistoryListResponse.Phase.builder()
          .addData(listOf(listOf(listOf(listOf(listOf(listOf(
            0.02, 0.034
          )))))))
          .addDimensionName("NAME1")
          .addDimensionName("NAME2")
          .addDimension(1)
          .addDimension(2)
          .notes("NOTES")
          .build())
      assertThat(historyListResponse.plasmaFrequency().getOrNull()).containsExactly(1.1, 2.1, 3.1)
      assertThat(historyListResponse.plasmaFrequencyUncertainty().getOrNull()).containsExactly(0.8, 0.2, 0.5)
      assertThat(historyListResponse.platformName()).contains("Millstone Hill")
      assertThat(historyListResponse.polarization()).contains(HistoryListResponse.Polarization.builder()
          .addData(listOf(listOf(listOf(listOf(listOf(listOf(
            HistoryListResponse.Polarization.UnnamedSchemaWithArrayParent2.X, HistoryListResponse.Polarization.UnnamedSchemaWithArrayParent2.O
          )))))))
          .addDimensionName("NAME1")
          .addDimensionName("NAME2")
          .addDimension(1)
          .addDimension(2)
          .notes("NOTES")
          .build())
      assertThat(historyListResponse.power()).contains(HistoryListResponse.Power.builder()
          .addData(listOf(listOf(listOf(listOf(listOf(listOf(
            0.02, 0.034
          )))))))
          .addDimensionName("NAME1")
          .addDimensionName("NAME2")
          .addDimension(1)
          .addDimension(2)
          .notes("NOTES")
          .build())
      assertThat(historyListResponse.qe()).contains(0.95)
      assertThat(historyListResponse.qf()).contains(1.83)
      assertThat(historyListResponse.range()).contains(HistoryListResponse.Range.builder()
          .addData(listOf(listOf(listOf(listOf(listOf(listOf(
            0.02, 0.034
          )))))))
          .addDimensionName("NAME1")
          .addDimensionName("NAME2")
          .addDimension(1)
          .addDimension(2)
          .notes("NOTES")
          .build())
      assertThat(historyListResponse.receiveCoordinates().getOrNull()).containsExactly(listOf(
        45.5,
        179.3,
        35.6,
      ), listOf(
        -80.2,
        -20.5,
        43.2,
      ))
      assertThat(historyListResponse.receiveSensorType()).contains(HistoryListResponse.ReceiveSensorType.MOBILE)
      assertThat(historyListResponse.restrictedFrequency().getOrNull()).containsExactly(12.5, 34.5, 45.3)
      assertThat(historyListResponse.restrictedFrequencyNotes()).contains("Example notes")
      assertThat(historyListResponse.scaleHeightF2Peak()).contains(35.613)
      assertThat(historyListResponse.scalerInfo()).contains(HistoryListResponse.ScalerInfo.builder()
          .confidenceLevel(11)
          .confidenceScore(75)
          .name("ARTIST-4")
          .organization("UML")
          .type("MANUAL")
          .version(500200.1)
          .build())
      assertThat(historyListResponse.stokes()).contains(HistoryListResponse.Stokes.builder()
          .addData(listOf(listOf(listOf(listOf(listOf(listOf(
            0.02, 0.034
          )))))))
          .addDimensionName("NAMES1")
          .addDimensionName("NAMES2")
          .addDimension(2)
          .addDimension(3)
          .notes("NOTES")
          .addS(1.0)
          .addS(2.0)
          .build())
      assertThat(historyListResponse.systemNotes()).contains("Example notes")
      assertThat(historyListResponse.tec()).contains(24.673)
      assertThat(historyListResponse.tidAzimuth().getOrNull()).containsExactly(1.1, 2.1, 3.1)
      assertThat(historyListResponse.tidPeriods().getOrNull()).containsExactly(1.1, 2.1, 3.1)
      assertThat(historyListResponse.tidPhaseSpeeds().getOrNull()).containsExactly(1.1, 2.1, 3.1)
      assertThat(historyListResponse.time()).contains(HistoryListResponse.Time.builder()
          .addData(listOf(listOf(listOf(listOf(listOf(listOf(
            0.02, 0.034
          )))))))
          .addDimensionName("NAME1")
          .addDimensionName("NAME2")
          .addDimension(1)
          .addDimension(2)
          .notes("NOTES")
          .build())
      assertThat(historyListResponse.traceGeneric()).contains(HistoryListResponse.TraceGeneric.builder()
          .addData(listOf(listOf(
            1.23, 1.0903
          )))
          .addDimensionName("NAME1")
          .addDimensionName("NAME2")
          .notes("NOTES")
          .build())
      assertThat(historyListResponse.transmitCoordinates().getOrNull()).containsExactly(listOf(
        45.5,
        179.3,
        35.6,
      ), listOf(
        -80.2,
        -20.5,
        43.2,
      ))
      assertThat(historyListResponse.transmitSensorType()).contains(HistoryListResponse.TransmitSensorType.MOBILE)
      assertThat(historyListResponse.typeEs()).contains("Auroral")
      assertThat(historyListResponse.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(historyListResponse.updatedBy()).contains("some.user")
      assertThat(historyListResponse.yE()).contains(1.722)
      assertThat(historyListResponse.yF1()).contains(55.645)
      assertThat(historyListResponse.yF2()).contains(62.178)
      assertThat(historyListResponse.zhalfNm()).contains(240.498)
      assertThat(historyListResponse.zmE()).contains(91.744)
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val historyListResponse = HistoryListResponse.builder()
          .classificationMarking("U")
          .dataMode(HistoryListResponse.DataMode.TEST)
          .source("Bluestaq")
          .startTimeUtc(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
          .stationId("STATION-ID")
          .system("Example hardware type")
          .systemInfo("Example settings")
          .id("IONOOBSERVATION-ID")
          .amplitude(HistoryListResponse.Amplitude.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(4)
              .addDimension(5)
              .notes("NOTES")
              .build())
          .antennaElementPosition(HistoryListResponse.AntennaElementPosition.builder()
              .addData(listOf(
                1.23, 0.123
              ))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(3)
              .addDimension(4)
              .build())
          .antennaElementPositionCoordinateSystem(HistoryListResponse.AntennaElementPositionCoordinateSystem.J2000)
          .artistFlags(listOf(
            1,
            2,
            3,
          ))
          .azimuth(HistoryListResponse.Azimuth.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .b0(68.07)
          .b1(1.87)
          .addCharAtt(HistoryListResponse.CharAtt.builder()
              .charName("hprimeF2")
              .addClimateModelInputParam("ISSN1 88.1")
              .addClimateModelInputParam("Option 2")
              .climateModelName("IRI")
              .addClimateModelOption("URSI-88")
              .addClimateModelOption("No storm")
              .d("K")
              .lowerBound(1.26)
              .q("T")
              .uncertaintyBoundType("1sigma")
              .upperBound(2.57)
              .ursiId("04")
              .build())
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .d(1.1)
          .d1(1.94)
          .datum(HistoryListResponse.Datum.builder()
              .data(listOf(
                1.1,
                2.1,
                3.1,
              ))
              .notes("NOTES")
              .build())
          .deltafoF2(1.1)
          .densityProfile(HistoryListResponse.DensityProfile.builder()
              .iri(HistoryListResponse.DensityProfile.Iri.builder()
                  .b0(245.1)
                  .b1(3.45)
                  .chi(35.1)
                  .d1(0.0)
                  .description("Full altitude range of 1D vertical plasma density profile for D, E, and F regions of the ionosphere provided by IRI, in which model parameters are replaced with observed ionogram-derived data where available.")
                  .fp1(0.0474732023322638)
                  .fp2(-0.00112685246984002)
                  .fp30(0.00827559450035957)
                  .fp3U(0.000201178475411428)
                  .ha(50.1)
                  .hdx(85.6)
                  .hmD(81.1)
                  .hmE(99.8)
                  .hmF1(210.3)
                  .hmF2(265.42)
                  .hValTop(116.2)
                  .hz(142.7)
                  .nmD(937543116.1)
                  .nmE(154164.1)
                  .nmF1(210486.0)
                  .nmF2(313283.1)
                  .nValB(147025.1)
                  .build())
              .parabolic(HistoryListResponse.DensityProfile.Parabolic.builder()
                  .description("Best-fit algorithm in NHPC software.")
                  .addParabolicItem(HistoryListResponse.DensityProfile.Parabolic.ParabolicItem.builder()
                      .f(3.621)
                      .layer("E")
                      .y(11.1)
                      .z(110.2)
                      .build())
                  .build())
              .quasiParabolic(HistoryListResponse.DensityProfile.QuasiParabolic.builder()
                  .description("Array of the best-fit 3-parameter quasi-parabolas defined via A, B, C coefficients, f^2=A/r^2+B/r+C")
                  .earthRadius(6370.1)
                  .addQuasiParabolicSegment(HistoryListResponse.DensityProfile.QuasiParabolic.QuasiParabolicSegment.builder()
                      .a(-550273940000.0)
                      .b(169837632.0)
                      .c(13104.63)
                      .error(0.0016)
                      .index(12)
                      .rb(6460.1)
                      .re(6480.001)
                      .build())
                  .build())
              .shiftedChebyshev(HistoryListResponse.DensityProfile.ShiftedChebyshev.builder()
                  .description("Best-fit Huang-Reinisch formalism based on shifted Chebyshev expansion.")
                  .addShiftedChebyshev(HistoryListResponse.DensityProfile.ShiftedChebyshev.InnerShiftedChebyshev.builder()
                      .coeffs(listOf(
                        -11.2,
                        -10.536,
                        3.357,
                        -0.888,
                        0.155,
                      ))
                      .error(0.02)
                      .fstart(0.2)
                      .fstop(1.39)
                      .layer("F2")
                      .n(5)
                      .peakheight(110.1)
                      .zhalfNm(210.1)
                      .build())
                  .build())
              .topsideExtensionChapmanConst(HistoryListResponse.DensityProfile.TopsideExtensionChapmanConst.builder()
                  .chi(35.1)
                  .description("Constant scale height Chapman topside layer determined using bottomside peak density parameters and placed chi km above the ionosonde-determined peak height.")
                  .hmF2(265.42)
                  .nmF2(313283.1)
                  .scaleF2(45.191)
                  .build())
              .topsideExtensionVaryChap(HistoryListResponse.DensityProfile.TopsideExtensionVaryChap.builder()
                  .alpha(30.1)
                  .beta(30.1)
                  .chi(30.1)
                  .description("Constant scale height Chapman topside layer determined using bottomside peak density parameters and placed chi km above the ionosonde-determined peak height.")
                  .hmF2(265.42)
                  .ht(30.1)
                  .nmF2(313283.1)
                  .scaleF2(45.191)
                  .build())
              .addValleyModelCoeff(39.597)
              .addValleyModelCoeff(0.1777)
              .valleyModelDescription("2-parameter UMLCAR model with width W in km and depth D in MHz, no fitting.")
              .build())
          .doppler(HistoryListResponse.Doppler.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .downE(1.1)
          .downEs(1.1)
          .downF(1.1)
          .electronDensity(listOf(
            1.1,
            2.1,
            3.1,
          ))
          .electronDensityUncertainty(listOf(
            0.8,
            0.2,
            0.5,
          ))
          .elevation(HistoryListResponse.Elevation.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(2)
              .addDimension(3)
              .notes("NOTES")
              .build())
          .fbEs(34.867)
          .fe(1.23)
          .ff(0.075)
          .fhprimeF(2.5)
          .fhprimeF2(2.5)
          .fmin(2.025)
          .fminE(2.025)
          .fminEs(1.1)
          .fminF(2.7)
          .fmuf(1.1)
          .foE(1.1)
          .foEa(45.764)
          .foEp(1.1)
          .foEs(2.35)
          .foF1(8.2)
          .foF1p(1.1)
          .foF2(6.75)
          .foF2p(1.1)
          .foP(87.21)
          .frequency(HistoryListResponse.Frequency.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .fxE(1.1)
          .fxF1(4.2)
          .fxF2(4.5)
          .fxI(7.525)
          .height(listOf(
            1.1,
            2.1,
            3.1,
          ))
          .hmE(215.643)
          .hmF1(230.128)
          .hmF2(240.498)
          .hprimeE(98.47)
          .hprimeEa(102.6)
          .hprimeEs(95.0)
          .hprimeF(238.5)
          .hprimeF1(230.1)
          .hprimeF2(238.5)
          .hprimefMuf(1.1)
          .hprimeP(89.45)
          .idSensor("SENSOR-ID")
          .luf(1.1)
          .md(1.1)
          .mufd(1.1)
          .neProfileName("NH")
          .neProfileVersion(4.32)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .origSensorId("ORIGSENSOR-ID")
          .phase(HistoryListResponse.Phase.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .plasmaFrequency(listOf(
            1.1,
            2.1,
            3.1,
          ))
          .plasmaFrequencyUncertainty(listOf(
            0.8,
            0.2,
            0.5,
          ))
          .platformName("Millstone Hill")
          .polarization(HistoryListResponse.Polarization.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                HistoryListResponse.Polarization.UnnamedSchemaWithArrayParent2.X, HistoryListResponse.Polarization.UnnamedSchemaWithArrayParent2.O
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .power(HistoryListResponse.Power.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .qe(0.95)
          .qf(1.83)
          .range(HistoryListResponse.Range.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .addReceiveCoordinate(listOf(
            45.5,
            179.3,
            35.6,
          ))
          .addReceiveCoordinate(listOf(
            -80.2,
            -20.5,
            43.2,
          ))
          .receiveSensorType(HistoryListResponse.ReceiveSensorType.MOBILE)
          .restrictedFrequency(listOf(
            12.5,
            34.5,
            45.3,
          ))
          .restrictedFrequencyNotes("Example notes")
          .scaleHeightF2Peak(35.613)
          .scalerInfo(HistoryListResponse.ScalerInfo.builder()
              .confidenceLevel(11)
              .confidenceScore(75)
              .name("ARTIST-4")
              .organization("UML")
              .type("MANUAL")
              .version(500200.1)
              .build())
          .stokes(HistoryListResponse.Stokes.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAMES1")
              .addDimensionName("NAMES2")
              .addDimension(2)
              .addDimension(3)
              .notes("NOTES")
              .addS(1.0)
              .addS(2.0)
              .build())
          .systemNotes("Example notes")
          .tec(24.673)
          .tidAzimuth(listOf(
            1.1,
            2.1,
            3.1,
          ))
          .tidPeriods(listOf(
            1.1,
            2.1,
            3.1,
          ))
          .tidPhaseSpeeds(listOf(
            1.1,
            2.1,
            3.1,
          ))
          .time(HistoryListResponse.Time.builder()
              .addData(listOf(listOf(listOf(listOf(listOf(listOf(
                0.02, 0.034
              )))))))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .addDimension(1)
              .addDimension(2)
              .notes("NOTES")
              .build())
          .traceGeneric(HistoryListResponse.TraceGeneric.builder()
              .addData(listOf(listOf(
                1.23, 1.0903
              )))
              .addDimensionName("NAME1")
              .addDimensionName("NAME2")
              .notes("NOTES")
              .build())
          .addTransmitCoordinate(listOf(
            45.5,
            179.3,
            35.6,
          ))
          .addTransmitCoordinate(listOf(
            -80.2,
            -20.5,
            43.2,
          ))
          .transmitSensorType(HistoryListResponse.TransmitSensorType.MOBILE)
          .typeEs("Auroral")
          .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .updatedBy("some.user")
          .yE(1.722)
          .yF1(55.645)
          .yF2(62.178)
          .zhalfNm(240.498)
          .zmE(91.744)
          .build()

      val roundtrippedHistoryListResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(historyListResponse), jacksonTypeRef<HistoryListResponse>())

      assertThat(roundtrippedHistoryListResponse).isEqualTo(historyListResponse)
    }
}

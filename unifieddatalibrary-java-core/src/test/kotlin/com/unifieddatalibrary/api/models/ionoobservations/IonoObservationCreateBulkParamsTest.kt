// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ionoobservations

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IonoObservationCreateBulkParamsTest {

    @Test
    fun create() {
        IonoObservationCreateBulkParams.builder()
            .addBody(
                IonoObservationCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(IonoObservationCreateBulkParams.Body.DataMode.TEST)
                    .source("Bluestaq")
                    .startTimeUtc(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                    .stationId("STATION-ID")
                    .system("Example hardware type")
                    .systemInfo("Example settings")
                    .id("IONOOBSERVATION-ID")
                    .amplitude(
                        IonoObservationCreateBulkParams.Body.Amplitude.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(4)
                            .addDimension(5)
                            .notes("NOTES")
                            .build()
                    )
                    .antennaElementPosition(
                        IonoObservationCreateBulkParams.Body.AntennaElementPosition.builder()
                            .addData(listOf(1.23, 0.123))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(3)
                            .addDimension(4)
                            .build()
                    )
                    .antennaElementPositionCoordinateSystem(
                        IonoObservationCreateBulkParams.Body.AntennaElementPositionCoordinateSystem
                            .J2000
                    )
                    .artistFlags(listOf(1, 2, 3))
                    .azimuth(
                        IonoObservationCreateBulkParams.Body.Azimuth.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .b0(68.07)
                    .b1(1.87)
                    .addCharAtt(
                        IonoObservationCreateBulkParams.Body.CharAtt.builder()
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
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .d(1.1)
                    .d1(1.94)
                    .datum(
                        IonoObservationCreateBulkParams.Body.Datum.builder()
                            .data(listOf(1.1, 2.1, 3.1))
                            .notes("NOTES")
                            .build()
                    )
                    .deltafoF2(1.1)
                    .densityProfile(
                        IonoObservationCreateBulkParams.Body.DensityProfile.builder()
                            .iri(
                                IonoObservationCreateBulkParams.Body.DensityProfile.Iri.builder()
                                    .b0(245.1)
                                    .b1(3.45)
                                    .chi(35.1)
                                    .d1(0.0)
                                    .description(
                                        "Full altitude range of 1D vertical plasma density profile for D, E, and F regions of the ionosphere provided by IRI, in which model parameters are replaced with observed ionogram-derived data where available."
                                    )
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
                                    .build()
                            )
                            .parabolic(
                                IonoObservationCreateBulkParams.Body.DensityProfile.Parabolic
                                    .builder()
                                    .description("Best-fit algorithm in NHPC software.")
                                    .addParabolicItem(
                                        IonoObservationCreateBulkParams.Body.DensityProfile
                                            .Parabolic
                                            .ParabolicItem
                                            .builder()
                                            .f(3.621)
                                            .layer("E")
                                            .y(11.1)
                                            .z(110.2)
                                            .build()
                                    )
                                    .build()
                            )
                            .quasiParabolic(
                                IonoObservationCreateBulkParams.Body.DensityProfile.QuasiParabolic
                                    .builder()
                                    .description(
                                        "Array of the best-fit 3-parameter quasi-parabolas defined via A, B, C coefficients, f^2=A/r^2+B/r+C"
                                    )
                                    .earthRadius(6370.1)
                                    .addQuasiParabolicSegment(
                                        IonoObservationCreateBulkParams.Body.DensityProfile
                                            .QuasiParabolic
                                            .QuasiParabolicSegment
                                            .builder()
                                            .a(-550273940000.0)
                                            .b(169837632.0)
                                            .c(13104.63)
                                            .error(0.0016)
                                            .index(12)
                                            .rb(6460.1)
                                            .re(6480.001)
                                            .build()
                                    )
                                    .build()
                            )
                            .shiftedChebyshev(
                                IonoObservationCreateBulkParams.Body.DensityProfile.ShiftedChebyshev
                                    .builder()
                                    .description(
                                        "Best-fit Huang-Reinisch formalism based on shifted Chebyshev expansion."
                                    )
                                    .addShiftedChebyshev(
                                        IonoObservationCreateBulkParams.Body.DensityProfile
                                            .ShiftedChebyshev
                                            .InnerShiftedChebyshev
                                            .builder()
                                            .coeffs(listOf(-11.2, -10.536, 3.357, -0.888, 0.155))
                                            .error(0.02)
                                            .fstart(0.2)
                                            .fstop(1.39)
                                            .layer("F2")
                                            .n(5)
                                            .peakheight(110.1)
                                            .zhalfNm(210.1)
                                            .build()
                                    )
                                    .build()
                            )
                            .topsideExtensionChapmanConst(
                                IonoObservationCreateBulkParams.Body.DensityProfile
                                    .TopsideExtensionChapmanConst
                                    .builder()
                                    .chi(35.1)
                                    .description(
                                        "Constant scale height Chapman topside layer determined using bottomside peak density parameters and placed chi km above the ionosonde-determined peak height."
                                    )
                                    .hmF2(265.42)
                                    .nmF2(313283.1)
                                    .scaleF2(45.191)
                                    .build()
                            )
                            .topsideExtensionVaryChap(
                                IonoObservationCreateBulkParams.Body.DensityProfile
                                    .TopsideExtensionVaryChap
                                    .builder()
                                    .alpha(30.1)
                                    .beta(30.1)
                                    .chi(30.1)
                                    .description(
                                        "Constant scale height Chapman topside layer determined using bottomside peak density parameters and placed chi km above the ionosonde-determined peak height."
                                    )
                                    .hmF2(265.42)
                                    .ht(30.1)
                                    .nmF2(313283.1)
                                    .scaleF2(45.191)
                                    .build()
                            )
                            .addValleyModelCoeff(39.597)
                            .addValleyModelCoeff(0.1777)
                            .valleyModelDescription(
                                "2-parameter UMLCAR model with width W in km and depth D in MHz, no fitting."
                            )
                            .build()
                    )
                    .doppler(
                        IonoObservationCreateBulkParams.Body.Doppler.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .downE(1.1)
                    .downEs(1.1)
                    .downF(1.1)
                    .electronDensity(listOf(1.1, 2.1, 3.1))
                    .electronDensityUncertainty(listOf(0.8, 0.2, 0.5))
                    .elevation(
                        IonoObservationCreateBulkParams.Body.Elevation.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(2)
                            .addDimension(3)
                            .notes("NOTES")
                            .build()
                    )
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
                    .frequency(
                        IonoObservationCreateBulkParams.Body.Frequency.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .fxE(1.1)
                    .fxF1(4.2)
                    .fxF2(4.5)
                    .fxI(7.525)
                    .height(listOf(1.1, 2.1, 3.1))
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
                    .origNetwork("OPS1")
                    .origSensorId("ORIGSENSOR-ID")
                    .phase(
                        IonoObservationCreateBulkParams.Body.Phase.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .plasmaFrequency(listOf(1.1, 2.1, 3.1))
                    .plasmaFrequencyUncertainty(listOf(0.8, 0.2, 0.5))
                    .platformName("Millstone Hill")
                    .polarization(
                        IonoObservationCreateBulkParams.Body.Polarization.builder()
                            .addData(
                                listOf(
                                    listOf(
                                        listOf(
                                            listOf(
                                                listOf(
                                                    listOf(
                                                        IonoObservationCreateBulkParams.Body
                                                            .Polarization
                                                            .UnnamedSchemaWithArrayParent3
                                                            .X,
                                                        IonoObservationCreateBulkParams.Body
                                                            .Polarization
                                                            .UnnamedSchemaWithArrayParent3
                                                            .O,
                                                    )
                                                )
                                            )
                                        )
                                    )
                                )
                            )
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .power(
                        IonoObservationCreateBulkParams.Body.Power.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .qe(0.95)
                    .qf(1.83)
                    .range(
                        IonoObservationCreateBulkParams.Body.Range.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .addReceiveCoordinate(listOf(45.5, 179.3, 35.6))
                    .addReceiveCoordinate(listOf(-80.2, -20.5, 43.2))
                    .receiveSensorType(
                        IonoObservationCreateBulkParams.Body.ReceiveSensorType.MOBILE
                    )
                    .restrictedFrequency(listOf(12.5, 34.5, 45.3))
                    .restrictedFrequencyNotes("Example notes")
                    .scaleHeightF2Peak(35.613)
                    .scalerInfo(
                        IonoObservationCreateBulkParams.Body.ScalerInfo.builder()
                            .confidenceLevel(11)
                            .confidenceScore(75)
                            .name("ARTIST-4")
                            .organization("UML")
                            .type("MANUAL")
                            .version(500200.1)
                            .build()
                    )
                    .stokes(
                        IonoObservationCreateBulkParams.Body.Stokes.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAMES1")
                            .addDimensionName("NAMES2")
                            .addDimension(2)
                            .addDimension(3)
                            .notes("NOTES")
                            .addS(1.0)
                            .addS(2.0)
                            .build()
                    )
                    .systemNotes("Example notes")
                    .tec(24.673)
                    .tidAzimuth(listOf(1.1, 2.1, 3.1))
                    .tidPeriods(listOf(1.1, 2.1, 3.1))
                    .tidPhaseSpeeds(listOf(1.1, 2.1, 3.1))
                    .time(
                        IonoObservationCreateBulkParams.Body.Time.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .traceGeneric(
                        IonoObservationCreateBulkParams.Body.TraceGeneric.builder()
                            .addData(listOf(listOf(1.23, 1.0903)))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .notes("NOTES")
                            .build()
                    )
                    .addTransmitCoordinate(listOf(45.5, 179.3, 35.6))
                    .addTransmitCoordinate(listOf(-80.2, -20.5, 43.2))
                    .transmitSensorType(
                        IonoObservationCreateBulkParams.Body.TransmitSensorType.MOBILE
                    )
                    .typeEs("Auroral")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .yE(1.722)
                    .yF1(55.645)
                    .yF2(62.178)
                    .zhalfNm(240.498)
                    .zmE(91.744)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            IonoObservationCreateBulkParams.builder()
                .addBody(
                    IonoObservationCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(IonoObservationCreateBulkParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .startTimeUtc(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                        .stationId("STATION-ID")
                        .system("Example hardware type")
                        .systemInfo("Example settings")
                        .id("IONOOBSERVATION-ID")
                        .amplitude(
                            IonoObservationCreateBulkParams.Body.Amplitude.builder()
                                .addData(
                                    listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034))))))
                                )
                                .addDimensionName("NAME1")
                                .addDimensionName("NAME2")
                                .addDimension(4)
                                .addDimension(5)
                                .notes("NOTES")
                                .build()
                        )
                        .antennaElementPosition(
                            IonoObservationCreateBulkParams.Body.AntennaElementPosition.builder()
                                .addData(listOf(1.23, 0.123))
                                .addDimensionName("NAME1")
                                .addDimensionName("NAME2")
                                .addDimension(3)
                                .addDimension(4)
                                .build()
                        )
                        .antennaElementPositionCoordinateSystem(
                            IonoObservationCreateBulkParams.Body
                                .AntennaElementPositionCoordinateSystem
                                .J2000
                        )
                        .artistFlags(listOf(1, 2, 3))
                        .azimuth(
                            IonoObservationCreateBulkParams.Body.Azimuth.builder()
                                .addData(
                                    listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034))))))
                                )
                                .addDimensionName("NAME1")
                                .addDimensionName("NAME2")
                                .addDimension(1)
                                .addDimension(2)
                                .notes("NOTES")
                                .build()
                        )
                        .b0(68.07)
                        .b1(1.87)
                        .addCharAtt(
                            IonoObservationCreateBulkParams.Body.CharAtt.builder()
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
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .d(1.1)
                        .d1(1.94)
                        .datum(
                            IonoObservationCreateBulkParams.Body.Datum.builder()
                                .data(listOf(1.1, 2.1, 3.1))
                                .notes("NOTES")
                                .build()
                        )
                        .deltafoF2(1.1)
                        .densityProfile(
                            IonoObservationCreateBulkParams.Body.DensityProfile.builder()
                                .iri(
                                    IonoObservationCreateBulkParams.Body.DensityProfile.Iri
                                        .builder()
                                        .b0(245.1)
                                        .b1(3.45)
                                        .chi(35.1)
                                        .d1(0.0)
                                        .description(
                                            "Full altitude range of 1D vertical plasma density profile for D, E, and F regions of the ionosphere provided by IRI, in which model parameters are replaced with observed ionogram-derived data where available."
                                        )
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
                                        .build()
                                )
                                .parabolic(
                                    IonoObservationCreateBulkParams.Body.DensityProfile.Parabolic
                                        .builder()
                                        .description("Best-fit algorithm in NHPC software.")
                                        .addParabolicItem(
                                            IonoObservationCreateBulkParams.Body.DensityProfile
                                                .Parabolic
                                                .ParabolicItem
                                                .builder()
                                                .f(3.621)
                                                .layer("E")
                                                .y(11.1)
                                                .z(110.2)
                                                .build()
                                        )
                                        .build()
                                )
                                .quasiParabolic(
                                    IonoObservationCreateBulkParams.Body.DensityProfile
                                        .QuasiParabolic
                                        .builder()
                                        .description(
                                            "Array of the best-fit 3-parameter quasi-parabolas defined via A, B, C coefficients, f^2=A/r^2+B/r+C"
                                        )
                                        .earthRadius(6370.1)
                                        .addQuasiParabolicSegment(
                                            IonoObservationCreateBulkParams.Body.DensityProfile
                                                .QuasiParabolic
                                                .QuasiParabolicSegment
                                                .builder()
                                                .a(-550273940000.0)
                                                .b(169837632.0)
                                                .c(13104.63)
                                                .error(0.0016)
                                                .index(12)
                                                .rb(6460.1)
                                                .re(6480.001)
                                                .build()
                                        )
                                        .build()
                                )
                                .shiftedChebyshev(
                                    IonoObservationCreateBulkParams.Body.DensityProfile
                                        .ShiftedChebyshev
                                        .builder()
                                        .description(
                                            "Best-fit Huang-Reinisch formalism based on shifted Chebyshev expansion."
                                        )
                                        .addShiftedChebyshev(
                                            IonoObservationCreateBulkParams.Body.DensityProfile
                                                .ShiftedChebyshev
                                                .InnerShiftedChebyshev
                                                .builder()
                                                .coeffs(
                                                    listOf(-11.2, -10.536, 3.357, -0.888, 0.155)
                                                )
                                                .error(0.02)
                                                .fstart(0.2)
                                                .fstop(1.39)
                                                .layer("F2")
                                                .n(5)
                                                .peakheight(110.1)
                                                .zhalfNm(210.1)
                                                .build()
                                        )
                                        .build()
                                )
                                .topsideExtensionChapmanConst(
                                    IonoObservationCreateBulkParams.Body.DensityProfile
                                        .TopsideExtensionChapmanConst
                                        .builder()
                                        .chi(35.1)
                                        .description(
                                            "Constant scale height Chapman topside layer determined using bottomside peak density parameters and placed chi km above the ionosonde-determined peak height."
                                        )
                                        .hmF2(265.42)
                                        .nmF2(313283.1)
                                        .scaleF2(45.191)
                                        .build()
                                )
                                .topsideExtensionVaryChap(
                                    IonoObservationCreateBulkParams.Body.DensityProfile
                                        .TopsideExtensionVaryChap
                                        .builder()
                                        .alpha(30.1)
                                        .beta(30.1)
                                        .chi(30.1)
                                        .description(
                                            "Constant scale height Chapman topside layer determined using bottomside peak density parameters and placed chi km above the ionosonde-determined peak height."
                                        )
                                        .hmF2(265.42)
                                        .ht(30.1)
                                        .nmF2(313283.1)
                                        .scaleF2(45.191)
                                        .build()
                                )
                                .addValleyModelCoeff(39.597)
                                .addValleyModelCoeff(0.1777)
                                .valleyModelDescription(
                                    "2-parameter UMLCAR model with width W in km and depth D in MHz, no fitting."
                                )
                                .build()
                        )
                        .doppler(
                            IonoObservationCreateBulkParams.Body.Doppler.builder()
                                .addData(
                                    listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034))))))
                                )
                                .addDimensionName("NAME1")
                                .addDimensionName("NAME2")
                                .addDimension(1)
                                .addDimension(2)
                                .notes("NOTES")
                                .build()
                        )
                        .downE(1.1)
                        .downEs(1.1)
                        .downF(1.1)
                        .electronDensity(listOf(1.1, 2.1, 3.1))
                        .electronDensityUncertainty(listOf(0.8, 0.2, 0.5))
                        .elevation(
                            IonoObservationCreateBulkParams.Body.Elevation.builder()
                                .addData(
                                    listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034))))))
                                )
                                .addDimensionName("NAME1")
                                .addDimensionName("NAME2")
                                .addDimension(2)
                                .addDimension(3)
                                .notes("NOTES")
                                .build()
                        )
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
                        .frequency(
                            IonoObservationCreateBulkParams.Body.Frequency.builder()
                                .addData(
                                    listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034))))))
                                )
                                .addDimensionName("NAME1")
                                .addDimensionName("NAME2")
                                .addDimension(1)
                                .addDimension(2)
                                .notes("NOTES")
                                .build()
                        )
                        .fxE(1.1)
                        .fxF1(4.2)
                        .fxF2(4.5)
                        .fxI(7.525)
                        .height(listOf(1.1, 2.1, 3.1))
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
                        .origNetwork("OPS1")
                        .origSensorId("ORIGSENSOR-ID")
                        .phase(
                            IonoObservationCreateBulkParams.Body.Phase.builder()
                                .addData(
                                    listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034))))))
                                )
                                .addDimensionName("NAME1")
                                .addDimensionName("NAME2")
                                .addDimension(1)
                                .addDimension(2)
                                .notes("NOTES")
                                .build()
                        )
                        .plasmaFrequency(listOf(1.1, 2.1, 3.1))
                        .plasmaFrequencyUncertainty(listOf(0.8, 0.2, 0.5))
                        .platformName("Millstone Hill")
                        .polarization(
                            IonoObservationCreateBulkParams.Body.Polarization.builder()
                                .addData(
                                    listOf(
                                        listOf(
                                            listOf(
                                                listOf(
                                                    listOf(
                                                        listOf(
                                                            IonoObservationCreateBulkParams.Body
                                                                .Polarization
                                                                .UnnamedSchemaWithArrayParent3
                                                                .X,
                                                            IonoObservationCreateBulkParams.Body
                                                                .Polarization
                                                                .UnnamedSchemaWithArrayParent3
                                                                .O,
                                                        )
                                                    )
                                                )
                                            )
                                        )
                                    )
                                )
                                .addDimensionName("NAME1")
                                .addDimensionName("NAME2")
                                .addDimension(1)
                                .addDimension(2)
                                .notes("NOTES")
                                .build()
                        )
                        .power(
                            IonoObservationCreateBulkParams.Body.Power.builder()
                                .addData(
                                    listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034))))))
                                )
                                .addDimensionName("NAME1")
                                .addDimensionName("NAME2")
                                .addDimension(1)
                                .addDimension(2)
                                .notes("NOTES")
                                .build()
                        )
                        .qe(0.95)
                        .qf(1.83)
                        .range(
                            IonoObservationCreateBulkParams.Body.Range.builder()
                                .addData(
                                    listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034))))))
                                )
                                .addDimensionName("NAME1")
                                .addDimensionName("NAME2")
                                .addDimension(1)
                                .addDimension(2)
                                .notes("NOTES")
                                .build()
                        )
                        .addReceiveCoordinate(listOf(45.5, 179.3, 35.6))
                        .addReceiveCoordinate(listOf(-80.2, -20.5, 43.2))
                        .receiveSensorType(
                            IonoObservationCreateBulkParams.Body.ReceiveSensorType.MOBILE
                        )
                        .restrictedFrequency(listOf(12.5, 34.5, 45.3))
                        .restrictedFrequencyNotes("Example notes")
                        .scaleHeightF2Peak(35.613)
                        .scalerInfo(
                            IonoObservationCreateBulkParams.Body.ScalerInfo.builder()
                                .confidenceLevel(11)
                                .confidenceScore(75)
                                .name("ARTIST-4")
                                .organization("UML")
                                .type("MANUAL")
                                .version(500200.1)
                                .build()
                        )
                        .stokes(
                            IonoObservationCreateBulkParams.Body.Stokes.builder()
                                .addData(
                                    listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034))))))
                                )
                                .addDimensionName("NAMES1")
                                .addDimensionName("NAMES2")
                                .addDimension(2)
                                .addDimension(3)
                                .notes("NOTES")
                                .addS(1.0)
                                .addS(2.0)
                                .build()
                        )
                        .systemNotes("Example notes")
                        .tec(24.673)
                        .tidAzimuth(listOf(1.1, 2.1, 3.1))
                        .tidPeriods(listOf(1.1, 2.1, 3.1))
                        .tidPhaseSpeeds(listOf(1.1, 2.1, 3.1))
                        .time(
                            IonoObservationCreateBulkParams.Body.Time.builder()
                                .addData(
                                    listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034))))))
                                )
                                .addDimensionName("NAME1")
                                .addDimensionName("NAME2")
                                .addDimension(1)
                                .addDimension(2)
                                .notes("NOTES")
                                .build()
                        )
                        .traceGeneric(
                            IonoObservationCreateBulkParams.Body.TraceGeneric.builder()
                                .addData(listOf(listOf(1.23, 1.0903)))
                                .addDimensionName("NAME1")
                                .addDimensionName("NAME2")
                                .notes("NOTES")
                                .build()
                        )
                        .addTransmitCoordinate(listOf(45.5, 179.3, 35.6))
                        .addTransmitCoordinate(listOf(-80.2, -20.5, 43.2))
                        .transmitSensorType(
                            IonoObservationCreateBulkParams.Body.TransmitSensorType.MOBILE
                        )
                        .typeEs("Auroral")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .updatedBy("some.user")
                        .yE(1.722)
                        .yF1(55.645)
                        .yF2(62.178)
                        .zhalfNm(240.498)
                        .zmE(91.744)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                IonoObservationCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(IonoObservationCreateBulkParams.Body.DataMode.TEST)
                    .source("Bluestaq")
                    .startTimeUtc(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                    .stationId("STATION-ID")
                    .system("Example hardware type")
                    .systemInfo("Example settings")
                    .id("IONOOBSERVATION-ID")
                    .amplitude(
                        IonoObservationCreateBulkParams.Body.Amplitude.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(4)
                            .addDimension(5)
                            .notes("NOTES")
                            .build()
                    )
                    .antennaElementPosition(
                        IonoObservationCreateBulkParams.Body.AntennaElementPosition.builder()
                            .addData(listOf(1.23, 0.123))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(3)
                            .addDimension(4)
                            .build()
                    )
                    .antennaElementPositionCoordinateSystem(
                        IonoObservationCreateBulkParams.Body.AntennaElementPositionCoordinateSystem
                            .J2000
                    )
                    .artistFlags(listOf(1, 2, 3))
                    .azimuth(
                        IonoObservationCreateBulkParams.Body.Azimuth.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .b0(68.07)
                    .b1(1.87)
                    .addCharAtt(
                        IonoObservationCreateBulkParams.Body.CharAtt.builder()
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
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .d(1.1)
                    .d1(1.94)
                    .datum(
                        IonoObservationCreateBulkParams.Body.Datum.builder()
                            .data(listOf(1.1, 2.1, 3.1))
                            .notes("NOTES")
                            .build()
                    )
                    .deltafoF2(1.1)
                    .densityProfile(
                        IonoObservationCreateBulkParams.Body.DensityProfile.builder()
                            .iri(
                                IonoObservationCreateBulkParams.Body.DensityProfile.Iri.builder()
                                    .b0(245.1)
                                    .b1(3.45)
                                    .chi(35.1)
                                    .d1(0.0)
                                    .description(
                                        "Full altitude range of 1D vertical plasma density profile for D, E, and F regions of the ionosphere provided by IRI, in which model parameters are replaced with observed ionogram-derived data where available."
                                    )
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
                                    .build()
                            )
                            .parabolic(
                                IonoObservationCreateBulkParams.Body.DensityProfile.Parabolic
                                    .builder()
                                    .description("Best-fit algorithm in NHPC software.")
                                    .addParabolicItem(
                                        IonoObservationCreateBulkParams.Body.DensityProfile
                                            .Parabolic
                                            .ParabolicItem
                                            .builder()
                                            .f(3.621)
                                            .layer("E")
                                            .y(11.1)
                                            .z(110.2)
                                            .build()
                                    )
                                    .build()
                            )
                            .quasiParabolic(
                                IonoObservationCreateBulkParams.Body.DensityProfile.QuasiParabolic
                                    .builder()
                                    .description(
                                        "Array of the best-fit 3-parameter quasi-parabolas defined via A, B, C coefficients, f^2=A/r^2+B/r+C"
                                    )
                                    .earthRadius(6370.1)
                                    .addQuasiParabolicSegment(
                                        IonoObservationCreateBulkParams.Body.DensityProfile
                                            .QuasiParabolic
                                            .QuasiParabolicSegment
                                            .builder()
                                            .a(-550273940000.0)
                                            .b(169837632.0)
                                            .c(13104.63)
                                            .error(0.0016)
                                            .index(12)
                                            .rb(6460.1)
                                            .re(6480.001)
                                            .build()
                                    )
                                    .build()
                            )
                            .shiftedChebyshev(
                                IonoObservationCreateBulkParams.Body.DensityProfile.ShiftedChebyshev
                                    .builder()
                                    .description(
                                        "Best-fit Huang-Reinisch formalism based on shifted Chebyshev expansion."
                                    )
                                    .addShiftedChebyshev(
                                        IonoObservationCreateBulkParams.Body.DensityProfile
                                            .ShiftedChebyshev
                                            .InnerShiftedChebyshev
                                            .builder()
                                            .coeffs(listOf(-11.2, -10.536, 3.357, -0.888, 0.155))
                                            .error(0.02)
                                            .fstart(0.2)
                                            .fstop(1.39)
                                            .layer("F2")
                                            .n(5)
                                            .peakheight(110.1)
                                            .zhalfNm(210.1)
                                            .build()
                                    )
                                    .build()
                            )
                            .topsideExtensionChapmanConst(
                                IonoObservationCreateBulkParams.Body.DensityProfile
                                    .TopsideExtensionChapmanConst
                                    .builder()
                                    .chi(35.1)
                                    .description(
                                        "Constant scale height Chapman topside layer determined using bottomside peak density parameters and placed chi km above the ionosonde-determined peak height."
                                    )
                                    .hmF2(265.42)
                                    .nmF2(313283.1)
                                    .scaleF2(45.191)
                                    .build()
                            )
                            .topsideExtensionVaryChap(
                                IonoObservationCreateBulkParams.Body.DensityProfile
                                    .TopsideExtensionVaryChap
                                    .builder()
                                    .alpha(30.1)
                                    .beta(30.1)
                                    .chi(30.1)
                                    .description(
                                        "Constant scale height Chapman topside layer determined using bottomside peak density parameters and placed chi km above the ionosonde-determined peak height."
                                    )
                                    .hmF2(265.42)
                                    .ht(30.1)
                                    .nmF2(313283.1)
                                    .scaleF2(45.191)
                                    .build()
                            )
                            .addValleyModelCoeff(39.597)
                            .addValleyModelCoeff(0.1777)
                            .valleyModelDescription(
                                "2-parameter UMLCAR model with width W in km and depth D in MHz, no fitting."
                            )
                            .build()
                    )
                    .doppler(
                        IonoObservationCreateBulkParams.Body.Doppler.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .downE(1.1)
                    .downEs(1.1)
                    .downF(1.1)
                    .electronDensity(listOf(1.1, 2.1, 3.1))
                    .electronDensityUncertainty(listOf(0.8, 0.2, 0.5))
                    .elevation(
                        IonoObservationCreateBulkParams.Body.Elevation.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(2)
                            .addDimension(3)
                            .notes("NOTES")
                            .build()
                    )
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
                    .frequency(
                        IonoObservationCreateBulkParams.Body.Frequency.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .fxE(1.1)
                    .fxF1(4.2)
                    .fxF2(4.5)
                    .fxI(7.525)
                    .height(listOf(1.1, 2.1, 3.1))
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
                    .origNetwork("OPS1")
                    .origSensorId("ORIGSENSOR-ID")
                    .phase(
                        IonoObservationCreateBulkParams.Body.Phase.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .plasmaFrequency(listOf(1.1, 2.1, 3.1))
                    .plasmaFrequencyUncertainty(listOf(0.8, 0.2, 0.5))
                    .platformName("Millstone Hill")
                    .polarization(
                        IonoObservationCreateBulkParams.Body.Polarization.builder()
                            .addData(
                                listOf(
                                    listOf(
                                        listOf(
                                            listOf(
                                                listOf(
                                                    listOf(
                                                        IonoObservationCreateBulkParams.Body
                                                            .Polarization
                                                            .UnnamedSchemaWithArrayParent3
                                                            .X,
                                                        IonoObservationCreateBulkParams.Body
                                                            .Polarization
                                                            .UnnamedSchemaWithArrayParent3
                                                            .O,
                                                    )
                                                )
                                            )
                                        )
                                    )
                                )
                            )
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .power(
                        IonoObservationCreateBulkParams.Body.Power.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .qe(0.95)
                    .qf(1.83)
                    .range(
                        IonoObservationCreateBulkParams.Body.Range.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .addReceiveCoordinate(listOf(45.5, 179.3, 35.6))
                    .addReceiveCoordinate(listOf(-80.2, -20.5, 43.2))
                    .receiveSensorType(
                        IonoObservationCreateBulkParams.Body.ReceiveSensorType.MOBILE
                    )
                    .restrictedFrequency(listOf(12.5, 34.5, 45.3))
                    .restrictedFrequencyNotes("Example notes")
                    .scaleHeightF2Peak(35.613)
                    .scalerInfo(
                        IonoObservationCreateBulkParams.Body.ScalerInfo.builder()
                            .confidenceLevel(11)
                            .confidenceScore(75)
                            .name("ARTIST-4")
                            .organization("UML")
                            .type("MANUAL")
                            .version(500200.1)
                            .build()
                    )
                    .stokes(
                        IonoObservationCreateBulkParams.Body.Stokes.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAMES1")
                            .addDimensionName("NAMES2")
                            .addDimension(2)
                            .addDimension(3)
                            .notes("NOTES")
                            .addS(1.0)
                            .addS(2.0)
                            .build()
                    )
                    .systemNotes("Example notes")
                    .tec(24.673)
                    .tidAzimuth(listOf(1.1, 2.1, 3.1))
                    .tidPeriods(listOf(1.1, 2.1, 3.1))
                    .tidPhaseSpeeds(listOf(1.1, 2.1, 3.1))
                    .time(
                        IonoObservationCreateBulkParams.Body.Time.builder()
                            .addData(listOf(listOf(listOf(listOf(listOf(listOf(0.02, 0.034)))))))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .addDimension(1)
                            .addDimension(2)
                            .notes("NOTES")
                            .build()
                    )
                    .traceGeneric(
                        IonoObservationCreateBulkParams.Body.TraceGeneric.builder()
                            .addData(listOf(listOf(1.23, 1.0903)))
                            .addDimensionName("NAME1")
                            .addDimensionName("NAME2")
                            .notes("NOTES")
                            .build()
                    )
                    .addTransmitCoordinate(listOf(45.5, 179.3, 35.6))
                    .addTransmitCoordinate(listOf(-80.2, -20.5, 43.2))
                    .transmitSensorType(
                        IonoObservationCreateBulkParams.Body.TransmitSensorType.MOBILE
                    )
                    .typeEs("Auroral")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .yE(1.722)
                    .yF1(55.645)
                    .yF2(62.178)
                    .zhalfNm(240.498)
                    .zmE(91.744)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IonoObservationCreateBulkParams.builder()
                .addBody(
                    IonoObservationCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(IonoObservationCreateBulkParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .startTimeUtc(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                        .stationId("STATION-ID")
                        .system("Example hardware type")
                        .systemInfo("Example settings")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                IonoObservationCreateBulkParams.Body.builder()
                    .classificationMarking("U")
                    .dataMode(IonoObservationCreateBulkParams.Body.DataMode.TEST)
                    .source("Bluestaq")
                    .startTimeUtc(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                    .stationId("STATION-ID")
                    .system("Example hardware type")
                    .systemInfo("Example settings")
                    .build()
            )
    }
}

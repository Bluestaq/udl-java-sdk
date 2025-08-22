// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Model representation of Earth Orientation Parameters (EOP) produced by the IERS (International
 * Earth Rotation and Reference Systems Service). Earth Orientation Parameters describe the
 * irregularities of the earth's rotation. Technically, they are the parameters which provide the
 * rotation of the ITRS (International Terrestrial Reference System) to the ICRS (International
 * Celestial Reference System) as a function of time. Universal time -- Universal time (UT1) is the
 * time of the earth clock, which performs one revolution in about 24h. It is practically
 * proportional to the sidereal time. The excess revolution time is called length of day (LOD).
 * Coordinates of the pole -- x and y are the coordinates of the Celestial Ephemeris Pole (CEP)
 * relative to the IRP, the IERS Reference Pole. The CEP differs from the instantaneous rotation
 * axis by quasi-diurnal terms with amplitudes under 0.01" (see Seidelmann, 1982). The x-axis is in
 * the direction of the ITRF zero-meridian; the y-axis is in the direction 90 degrees West
 * longitude. Celestial pole offsets -- Celestial pole offsets are described in the IAU Precession
 * and Nutation models. The observed differences with respect to the conventional celestial pole
 * position defined by the models are monitored and reported by the IERS. IERS Bulletins A and B
 * provide current information on the Earth's orientation in the IERS Reference System. This
 * includes Universal Time, coordinates of the terrestrial pole, and celestial pole offsets.
 * Bulletin A gives an advanced solution updated weekly; the standard solution is given monthly in
 * Bulletin B. Fields suffixed with 'B' are Bulletin B values. All solutions are continuous within
 * their respective uncertainties. Bulletin A is issued by the IERS Rapid Service/Prediction Centre
 * at the U.S. Naval Observatory, Washington, DC and Bulletin B is issued by the IERS Earth
 * Orientation Centre at the Paris Observatory. IERS Bulletin A reports the latest determinations
 * for polar motion, UT1-UTC, and nutation offsets at daily intervals based on a combination of
 * contributed analysis results using data from Very Long Baseline Interferometry (VLBI), Satellite
 * Laser Ranging (SLR), Global Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR).
 * Predictions for variations a year into the future are also provided. Meteorological predictions
 * of variations in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of
 * near-term UT1-UTC changes. This publication is prepared by the IERS Rapid Service/Prediction
 * Center.
 */
class EopFull
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val eopDate: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val dEpsilon: JsonField<Double>,
    private val dEpsilonB: JsonField<Double>,
    private val dEpsilonUnc: JsonField<Double>,
    private val dPsi: JsonField<Double>,
    private val dPsib: JsonField<Double>,
    private val dPsiUnc: JsonField<Double>,
    private val dX: JsonField<Double>,
    private val dXb: JsonField<Double>,
    private val dXUnc: JsonField<Double>,
    private val dY: JsonField<Double>,
    private val dYb: JsonField<Double>,
    private val dYUnc: JsonField<Double>,
    private val lod: JsonField<Double>,
    private val lodUnc: JsonField<Double>,
    private val nutationState: JsonField<NutationState>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val polarMotionState: JsonField<PolarMotionState>,
    private val polarMotionX: JsonField<Double>,
    private val polarMotionXb: JsonField<Double>,
    private val polarMotionXUnc: JsonField<Double>,
    private val polarMotionY: JsonField<Double>,
    private val polarMotionYb: JsonField<Double>,
    private val polarMotionYUnc: JsonField<Double>,
    private val precessionNutationStd: JsonField<String>,
    private val rawFileUri: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val ut1Utc: JsonField<Double>,
    private val ut1Utcb: JsonField<Double>,
    private val ut1UtcState: JsonField<Ut1UtcState>,
    private val ut1UtcUnc: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("eopDate")
        @ExcludeMissing
        eopDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dEpsilon") @ExcludeMissing dEpsilon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dEpsilonB") @ExcludeMissing dEpsilonB: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dEpsilonUnc")
        @ExcludeMissing
        dEpsilonUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dPSI") @ExcludeMissing dPsi: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dPSIB") @ExcludeMissing dPsib: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dPSIUnc") @ExcludeMissing dPsiUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dX") @ExcludeMissing dX: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dXB") @ExcludeMissing dXb: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dXUnc") @ExcludeMissing dXUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dY") @ExcludeMissing dY: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dYB") @ExcludeMissing dYb: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dYUnc") @ExcludeMissing dYUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lod") @ExcludeMissing lod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lodUnc") @ExcludeMissing lodUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("nutationState")
        @ExcludeMissing
        nutationState: JsonField<NutationState> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("polarMotionState")
        @ExcludeMissing
        polarMotionState: JsonField<PolarMotionState> = JsonMissing.of(),
        @JsonProperty("polarMotionX")
        @ExcludeMissing
        polarMotionX: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("polarMotionXB")
        @ExcludeMissing
        polarMotionXb: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("polarMotionXUnc")
        @ExcludeMissing
        polarMotionXUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("polarMotionY")
        @ExcludeMissing
        polarMotionY: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("polarMotionYB")
        @ExcludeMissing
        polarMotionYb: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("polarMotionYUnc")
        @ExcludeMissing
        polarMotionYUnc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("precessionNutationStd")
        @ExcludeMissing
        precessionNutationStd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rawFileURI")
        @ExcludeMissing
        rawFileUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ut1UTC") @ExcludeMissing ut1Utc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ut1UTCB") @ExcludeMissing ut1Utcb: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ut1UTCState")
        @ExcludeMissing
        ut1UtcState: JsonField<Ut1UtcState> = JsonMissing.of(),
        @JsonProperty("ut1UTCUnc") @ExcludeMissing ut1UtcUnc: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        eopDate,
        source,
        id,
        createdAt,
        createdBy,
        dEpsilon,
        dEpsilonB,
        dEpsilonUnc,
        dPsi,
        dPsib,
        dPsiUnc,
        dX,
        dXb,
        dXUnc,
        dY,
        dYb,
        dYUnc,
        lod,
        lodUnc,
        nutationState,
        origin,
        origNetwork,
        polarMotionState,
        polarMotionX,
        polarMotionXb,
        polarMotionXUnc,
        polarMotionY,
        polarMotionYb,
        polarMotionYUnc,
        precessionNutationStd,
        rawFileUri,
        updatedAt,
        updatedBy,
        ut1Utc,
        ut1Utcb,
        ut1UtcState,
        ut1UtcUnc,
        mutableMapOf(),
    )

    /**
     * Classification marking of the data in IC/CAPCO Portion-marked format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun classificationMarking(): String = classificationMarking.getRequired("classificationMarking")

    /**
     * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * Effective date/time for the EOP values in ISO8601 UTC format. The values could be current or
     * predicted.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eopDate(): OffsetDateTime = eopDate.getRequired("eopDate")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Time the row was created in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Application user who created the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The Bulletin A offset in obliquity dDe1980 with respect to the IAU 1976 Theory of Precession
     * and the IAU 1980 Theory of Nutation, measured in milliseconds of arc. Note: dEpsilon is not
     * used when this record represents IAU 2000 data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dEpsilon(): Optional<Double> = dEpsilon.getOptional("dEpsilon")

    /**
     * The Bulletin B offset in obliquity dDe1980 with respect to the IAU 1976 Theory of Precession
     * and the IAU 1980 Theory of Nutation, measured in milliseconds of arc. Note: dEpsilonB is not
     * used when this record represents IAU 2000 data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dEpsilonB(): Optional<Double> = dEpsilonB.getOptional("dEpsilonB")

    /**
     * The estimated uncertainty/error in the dEpsilon value in milliseconds of arc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dEpsilonUnc(): Optional<Double> = dEpsilonUnc.getOptional("dEpsilonUnc")

    /**
     * The Bulletin A offset in longitude dDy1980 with respect to the IAU 1976 Theory of Precession
     * and the IAU 1980 Theory of Nutation, measured in milliseconds of arc. Note: dPSI is not used
     * when this record represents IAU 2000 data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dPsi(): Optional<Double> = dPsi.getOptional("dPSI")

    /**
     * The Bulletin B offset in longitude dDy1980 with respect to the IAU 1976 Theory of Precession
     * and the IAU 1980 Theory of Nutation, measured in milliseconds of arc. Note: dPSIB is not used
     * when this record represents IAU 2000 data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dPsib(): Optional<Double> = dPsib.getOptional("dPSIB")

    /**
     * The estimated uncertainty/error in the dPSI value in milliseconds of arc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dPsiUnc(): Optional<Double> = dPsiUnc.getOptional("dPSIUnc")

    /**
     * The Bulletin A celestial pole offset along x-axis with respect to the IAU 2000A Theory of
     * Precession and Nutation, measured in milliseconds of arc. Note: dX is not used when this
     * record represents IAU 1980 data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dX(): Optional<Double> = dX.getOptional("dX")

    /**
     * The Bulletin B celestial pole offset along the X-axis with respect to the IAU 2000A Theory of
     * Precession and Nutation, measured in milliseconds of arc. Note: dXB is not used when this
     * record represents IAU 1980 data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dXb(): Optional<Double> = dXb.getOptional("dXB")

    /**
     * The estimated uncertainty/error in the Bulletin A dX value, in milliseconds of arc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dXUnc(): Optional<Double> = dXUnc.getOptional("dXUnc")

    /**
     * The Bulletin A celestial pole offset along y-axis with respect to the IAU 2000A Theory of
     * Precession and Nutation, measured in milliseconds of arc. Note: dY is not used when this
     * record represents IAU 1980 data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dY(): Optional<Double> = dY.getOptional("dY")

    /**
     * The Bulletin B celestial pole offset along the Y-axis with respect to the IAU 2000A Theory of
     * Precession and Nutation, measured in milliseconds of arc. Note: dYB is not used when this
     * record represents IAU 1980 data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dYb(): Optional<Double> = dYb.getOptional("dYB")

    /**
     * The estimated uncertainty/error in the Bulletin A dY value, in milliseconds of arc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dYUnc(): Optional<Double> = dYUnc.getOptional("dYUnc")

    /**
     * Bulletin A length of day or LOD in milliseconds. Universal time (UT1) is the time of the
     * earth clock, which performs one revolution in about 24h. It is practically proportional to
     * the sidereal time. The excess revolution time is called length of day (LOD).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lod(): Optional<Double> = lod.getOptional("lod")

    /**
     * The estimated uncertainty/error in the lod value in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lodUnc(): Optional<Double> = lodUnc.getOptional("lodUnc")

    /**
     * Flag indicating Issued (I), or Predicted (P) for this record's nutation values (dPSI and
     * dEpsilon).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nutationState(): Optional<NutationState> = nutationState.getOptional("nutationState")

    /**
     * Originating system or organization which produced the data, if different from the source. The
     * origin may be different than the source if the source was a mediating system which forwarded
     * the data on behalf of the origin system. If null, the source may be assumed to be the origin.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origin(): Optional<String> = origin.getOptional("origin")

    /**
     * The originating source network on which this record was created, auto-populated by the
     * system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

    /**
     * Flag indicating Issued (I), or Predicted (P) for this record's polar motion values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarMotionState(): Optional<PolarMotionState> =
        polarMotionState.getOptional("polarMotionState")

    /**
     * The Bulletin A X coordinate value of earth polar motion at eopDate. Polar motion of the Earth
     * is the motion of the Earth's rotational axis relative to its crust. This is measured with
     * respect to a reference frame in which the solid Earth is fixed (a so-called Earth-centered,
     * Earth-fixed or ECEF reference frame). Measured in arc seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarMotionX(): Optional<Double> = polarMotionX.getOptional("polarMotionX")

    /**
     * Bulletin B X coordinate value of earth polar motion at eopDate. Polar motion of the Earth is
     * the motion of the Earth's rotational axis relative to its crust. This is measured with
     * respect to a reference frame in which the solid Earth is fixed (a so-called Earth-centered,
     * Earth-fixed or ECEF reference frame). Measured in arc seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarMotionXb(): Optional<Double> = polarMotionXb.getOptional("polarMotionXB")

    /**
     * Estimated uncertainty/error in polarMotionX value in arc seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarMotionXUnc(): Optional<Double> = polarMotionXUnc.getOptional("polarMotionXUnc")

    /**
     * The Bulletin A Y coordinate value of earth polar motion at eopDate. Polar motion of the Earth
     * is the motion of the Earth's rotational axis relative to its crust. This is measured with
     * respect to a reference frame in which the solid Earth is fixed (a so-called Earth-centered,
     * Earth-fixed or ECEF reference frame). Measured in arc seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarMotionY(): Optional<Double> = polarMotionY.getOptional("polarMotionY")

    /**
     * Bulletin B Y coordinate value of earth polar motion at eopDate. Polar motion of the Earth is
     * the motion of the Earth's rotational axis relative to its crust. This is measured with
     * respect to a reference frame in which the solid Earth is fixed (a so-called Earth-centered,
     * Earth-fixed or ECEF reference frame). Measured in arc seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarMotionYb(): Optional<Double> = polarMotionYb.getOptional("polarMotionYB")

    /**
     * Estimated uncertainty/error in polarMotionY value in arc seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarMotionYUnc(): Optional<Double> = polarMotionYUnc.getOptional("polarMotionYUnc")

    /**
     * The IAU Theory of Precession and Theory of Nutation applied to the data in this record.
     * IAU1980 records employ the IAU 1976 Theory of Precession and IAU 1980 Theory of Nutation, and
     * IAU2000 records employ the IAU 2000A Theory of Precession and Nutation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun precessionNutationStd(): Optional<String> =
        precessionNutationStd.getOptional("precessionNutationStd")

    /**
     * Optional URI location in the document repository of the raw file parsed by the system to
     * produce this record. To download the raw file, prepend https://udl-hostname/scs/download?id=
     * to this value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rawFileUri(): Optional<String> = rawFileUri.getOptional("rawFileURI")

    /**
     * Time the row was last updated in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Application user who updated the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

    /**
     * The difference between the Bulletin A UT1 and UTC time scales as of eopDate in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ut1Utc(): Optional<Double> = ut1Utc.getOptional("ut1UTC")

    /**
     * The Bulletin B difference between the UT1 and UTC time scales as of eopDate in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ut1Utcb(): Optional<Double> = ut1Utcb.getOptional("ut1UTCB")

    /**
     * Flag indicating Issued (I), or Predicted (P) for this record''s Bulletin A UT1-UTC values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ut1UtcState(): Optional<Ut1UtcState> = ut1UtcState.getOptional("ut1UTCState")

    /**
     * The estimated uncertainty/error in the ut1UTC value in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ut1UtcUnc(): Optional<Double> = ut1UtcUnc.getOptional("ut1UTCUnc")

    /**
     * Returns the raw JSON value of [classificationMarking].
     *
     * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("classificationMarking")
    @ExcludeMissing
    fun _classificationMarking(): JsonField<String> = classificationMarking

    /**
     * Returns the raw JSON value of [dataMode].
     *
     * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataMode") @ExcludeMissing fun _dataMode(): JsonField<DataMode> = dataMode

    /**
     * Returns the raw JSON value of [eopDate].
     *
     * Unlike [eopDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eopDate") @ExcludeMissing fun _eopDate(): JsonField<OffsetDateTime> = eopDate

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [dEpsilon].
     *
     * Unlike [dEpsilon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dEpsilon") @ExcludeMissing fun _dEpsilon(): JsonField<Double> = dEpsilon

    /**
     * Returns the raw JSON value of [dEpsilonB].
     *
     * Unlike [dEpsilonB], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dEpsilonB") @ExcludeMissing fun _dEpsilonB(): JsonField<Double> = dEpsilonB

    /**
     * Returns the raw JSON value of [dEpsilonUnc].
     *
     * Unlike [dEpsilonUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dEpsilonUnc") @ExcludeMissing fun _dEpsilonUnc(): JsonField<Double> = dEpsilonUnc

    /**
     * Returns the raw JSON value of [dPsi].
     *
     * Unlike [dPsi], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dPSI") @ExcludeMissing fun _dPsi(): JsonField<Double> = dPsi

    /**
     * Returns the raw JSON value of [dPsib].
     *
     * Unlike [dPsib], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dPSIB") @ExcludeMissing fun _dPsib(): JsonField<Double> = dPsib

    /**
     * Returns the raw JSON value of [dPsiUnc].
     *
     * Unlike [dPsiUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dPSIUnc") @ExcludeMissing fun _dPsiUnc(): JsonField<Double> = dPsiUnc

    /**
     * Returns the raw JSON value of [dX].
     *
     * Unlike [dX], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dX") @ExcludeMissing fun _dX(): JsonField<Double> = dX

    /**
     * Returns the raw JSON value of [dXb].
     *
     * Unlike [dXb], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dXB") @ExcludeMissing fun _dXb(): JsonField<Double> = dXb

    /**
     * Returns the raw JSON value of [dXUnc].
     *
     * Unlike [dXUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dXUnc") @ExcludeMissing fun _dXUnc(): JsonField<Double> = dXUnc

    /**
     * Returns the raw JSON value of [dY].
     *
     * Unlike [dY], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dY") @ExcludeMissing fun _dY(): JsonField<Double> = dY

    /**
     * Returns the raw JSON value of [dYb].
     *
     * Unlike [dYb], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dYB") @ExcludeMissing fun _dYb(): JsonField<Double> = dYb

    /**
     * Returns the raw JSON value of [dYUnc].
     *
     * Unlike [dYUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dYUnc") @ExcludeMissing fun _dYUnc(): JsonField<Double> = dYUnc

    /**
     * Returns the raw JSON value of [lod].
     *
     * Unlike [lod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lod") @ExcludeMissing fun _lod(): JsonField<Double> = lod

    /**
     * Returns the raw JSON value of [lodUnc].
     *
     * Unlike [lodUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lodUnc") @ExcludeMissing fun _lodUnc(): JsonField<Double> = lodUnc

    /**
     * Returns the raw JSON value of [nutationState].
     *
     * Unlike [nutationState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nutationState")
    @ExcludeMissing
    fun _nutationState(): JsonField<NutationState> = nutationState

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<String> = origin

    /**
     * Returns the raw JSON value of [origNetwork].
     *
     * Unlike [origNetwork], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origNetwork") @ExcludeMissing fun _origNetwork(): JsonField<String> = origNetwork

    /**
     * Returns the raw JSON value of [polarMotionState].
     *
     * Unlike [polarMotionState], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("polarMotionState")
    @ExcludeMissing
    fun _polarMotionState(): JsonField<PolarMotionState> = polarMotionState

    /**
     * Returns the raw JSON value of [polarMotionX].
     *
     * Unlike [polarMotionX], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarMotionX")
    @ExcludeMissing
    fun _polarMotionX(): JsonField<Double> = polarMotionX

    /**
     * Returns the raw JSON value of [polarMotionXb].
     *
     * Unlike [polarMotionXb], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarMotionXB")
    @ExcludeMissing
    fun _polarMotionXb(): JsonField<Double> = polarMotionXb

    /**
     * Returns the raw JSON value of [polarMotionXUnc].
     *
     * Unlike [polarMotionXUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarMotionXUnc")
    @ExcludeMissing
    fun _polarMotionXUnc(): JsonField<Double> = polarMotionXUnc

    /**
     * Returns the raw JSON value of [polarMotionY].
     *
     * Unlike [polarMotionY], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarMotionY")
    @ExcludeMissing
    fun _polarMotionY(): JsonField<Double> = polarMotionY

    /**
     * Returns the raw JSON value of [polarMotionYb].
     *
     * Unlike [polarMotionYb], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarMotionYB")
    @ExcludeMissing
    fun _polarMotionYb(): JsonField<Double> = polarMotionYb

    /**
     * Returns the raw JSON value of [polarMotionYUnc].
     *
     * Unlike [polarMotionYUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarMotionYUnc")
    @ExcludeMissing
    fun _polarMotionYUnc(): JsonField<Double> = polarMotionYUnc

    /**
     * Returns the raw JSON value of [precessionNutationStd].
     *
     * Unlike [precessionNutationStd], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("precessionNutationStd")
    @ExcludeMissing
    fun _precessionNutationStd(): JsonField<String> = precessionNutationStd

    /**
     * Returns the raw JSON value of [rawFileUri].
     *
     * Unlike [rawFileUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rawFileURI") @ExcludeMissing fun _rawFileUri(): JsonField<String> = rawFileUri

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [updatedBy].
     *
     * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedBy") @ExcludeMissing fun _updatedBy(): JsonField<String> = updatedBy

    /**
     * Returns the raw JSON value of [ut1Utc].
     *
     * Unlike [ut1Utc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ut1UTC") @ExcludeMissing fun _ut1Utc(): JsonField<Double> = ut1Utc

    /**
     * Returns the raw JSON value of [ut1Utcb].
     *
     * Unlike [ut1Utcb], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ut1UTCB") @ExcludeMissing fun _ut1Utcb(): JsonField<Double> = ut1Utcb

    /**
     * Returns the raw JSON value of [ut1UtcState].
     *
     * Unlike [ut1UtcState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ut1UTCState")
    @ExcludeMissing
    fun _ut1UtcState(): JsonField<Ut1UtcState> = ut1UtcState

    /**
     * Returns the raw JSON value of [ut1UtcUnc].
     *
     * Unlike [ut1UtcUnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ut1UTCUnc") @ExcludeMissing fun _ut1UtcUnc(): JsonField<Double> = ut1UtcUnc

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EopFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .eopDate()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EopFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var eopDate: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dEpsilon: JsonField<Double> = JsonMissing.of()
        private var dEpsilonB: JsonField<Double> = JsonMissing.of()
        private var dEpsilonUnc: JsonField<Double> = JsonMissing.of()
        private var dPsi: JsonField<Double> = JsonMissing.of()
        private var dPsib: JsonField<Double> = JsonMissing.of()
        private var dPsiUnc: JsonField<Double> = JsonMissing.of()
        private var dX: JsonField<Double> = JsonMissing.of()
        private var dXb: JsonField<Double> = JsonMissing.of()
        private var dXUnc: JsonField<Double> = JsonMissing.of()
        private var dY: JsonField<Double> = JsonMissing.of()
        private var dYb: JsonField<Double> = JsonMissing.of()
        private var dYUnc: JsonField<Double> = JsonMissing.of()
        private var lod: JsonField<Double> = JsonMissing.of()
        private var lodUnc: JsonField<Double> = JsonMissing.of()
        private var nutationState: JsonField<NutationState> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var polarMotionState: JsonField<PolarMotionState> = JsonMissing.of()
        private var polarMotionX: JsonField<Double> = JsonMissing.of()
        private var polarMotionXb: JsonField<Double> = JsonMissing.of()
        private var polarMotionXUnc: JsonField<Double> = JsonMissing.of()
        private var polarMotionY: JsonField<Double> = JsonMissing.of()
        private var polarMotionYb: JsonField<Double> = JsonMissing.of()
        private var polarMotionYUnc: JsonField<Double> = JsonMissing.of()
        private var precessionNutationStd: JsonField<String> = JsonMissing.of()
        private var rawFileUri: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var ut1Utc: JsonField<Double> = JsonMissing.of()
        private var ut1Utcb: JsonField<Double> = JsonMissing.of()
        private var ut1UtcState: JsonField<Ut1UtcState> = JsonMissing.of()
        private var ut1UtcUnc: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eopFull: EopFull) = apply {
            classificationMarking = eopFull.classificationMarking
            dataMode = eopFull.dataMode
            eopDate = eopFull.eopDate
            source = eopFull.source
            id = eopFull.id
            createdAt = eopFull.createdAt
            createdBy = eopFull.createdBy
            dEpsilon = eopFull.dEpsilon
            dEpsilonB = eopFull.dEpsilonB
            dEpsilonUnc = eopFull.dEpsilonUnc
            dPsi = eopFull.dPsi
            dPsib = eopFull.dPsib
            dPsiUnc = eopFull.dPsiUnc
            dX = eopFull.dX
            dXb = eopFull.dXb
            dXUnc = eopFull.dXUnc
            dY = eopFull.dY
            dYb = eopFull.dYb
            dYUnc = eopFull.dYUnc
            lod = eopFull.lod
            lodUnc = eopFull.lodUnc
            nutationState = eopFull.nutationState
            origin = eopFull.origin
            origNetwork = eopFull.origNetwork
            polarMotionState = eopFull.polarMotionState
            polarMotionX = eopFull.polarMotionX
            polarMotionXb = eopFull.polarMotionXb
            polarMotionXUnc = eopFull.polarMotionXUnc
            polarMotionY = eopFull.polarMotionY
            polarMotionYb = eopFull.polarMotionYb
            polarMotionYUnc = eopFull.polarMotionYUnc
            precessionNutationStd = eopFull.precessionNutationStd
            rawFileUri = eopFull.rawFileUri
            updatedAt = eopFull.updatedAt
            updatedBy = eopFull.updatedBy
            ut1Utc = eopFull.ut1Utc
            ut1Utcb = eopFull.ut1Utcb
            ut1UtcState = eopFull.ut1UtcState
            ut1UtcUnc = eopFull.ut1UtcUnc
            additionalProperties = eopFull.additionalProperties.toMutableMap()
        }

        /** Classification marking of the data in IC/CAPCO Portion-marked format. */
        fun classificationMarking(classificationMarking: String) =
            classificationMarking(JsonField.of(classificationMarking))

        /**
         * Sets [Builder.classificationMarking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classificationMarking] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun classificationMarking(classificationMarking: JsonField<String>) = apply {
            this.classificationMarking = classificationMarking
        }

        /**
         * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         */
        fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

        /**
         * Sets [Builder.dataMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataMode] with a well-typed [DataMode] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

        /**
         * Effective date/time for the EOP values in ISO8601 UTC format. The values could be current
         * or predicted.
         */
        fun eopDate(eopDate: OffsetDateTime) = eopDate(JsonField.of(eopDate))

        /**
         * Sets [Builder.eopDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eopDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eopDate(eopDate: JsonField<OffsetDateTime>) = apply { this.eopDate = eopDate }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Time the row was created in the database, auto-populated by the system. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Application user who created the row in the database, auto-populated by the system. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /**
         * The Bulletin A offset in obliquity dDe1980 with respect to the IAU 1976 Theory of
         * Precession and the IAU 1980 Theory of Nutation, measured in milliseconds of arc. Note:
         * dEpsilon is not used when this record represents IAU 2000 data.
         */
        fun dEpsilon(dEpsilon: Double) = dEpsilon(JsonField.of(dEpsilon))

        /**
         * Sets [Builder.dEpsilon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dEpsilon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dEpsilon(dEpsilon: JsonField<Double>) = apply { this.dEpsilon = dEpsilon }

        /**
         * The Bulletin B offset in obliquity dDe1980 with respect to the IAU 1976 Theory of
         * Precession and the IAU 1980 Theory of Nutation, measured in milliseconds of arc. Note:
         * dEpsilonB is not used when this record represents IAU 2000 data.
         */
        fun dEpsilonB(dEpsilonB: Double) = dEpsilonB(JsonField.of(dEpsilonB))

        /**
         * Sets [Builder.dEpsilonB] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dEpsilonB] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dEpsilonB(dEpsilonB: JsonField<Double>) = apply { this.dEpsilonB = dEpsilonB }

        /** The estimated uncertainty/error in the dEpsilon value in milliseconds of arc. */
        fun dEpsilonUnc(dEpsilonUnc: Double) = dEpsilonUnc(JsonField.of(dEpsilonUnc))

        /**
         * Sets [Builder.dEpsilonUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dEpsilonUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dEpsilonUnc(dEpsilonUnc: JsonField<Double>) = apply { this.dEpsilonUnc = dEpsilonUnc }

        /**
         * The Bulletin A offset in longitude dDy1980 with respect to the IAU 1976 Theory of
         * Precession and the IAU 1980 Theory of Nutation, measured in milliseconds of arc. Note:
         * dPSI is not used when this record represents IAU 2000 data.
         */
        fun dPsi(dPsi: Double) = dPsi(JsonField.of(dPsi))

        /**
         * Sets [Builder.dPsi] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dPsi] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dPsi(dPsi: JsonField<Double>) = apply { this.dPsi = dPsi }

        /**
         * The Bulletin B offset in longitude dDy1980 with respect to the IAU 1976 Theory of
         * Precession and the IAU 1980 Theory of Nutation, measured in milliseconds of arc. Note:
         * dPSIB is not used when this record represents IAU 2000 data.
         */
        fun dPsib(dPsib: Double) = dPsib(JsonField.of(dPsib))

        /**
         * Sets [Builder.dPsib] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dPsib] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dPsib(dPsib: JsonField<Double>) = apply { this.dPsib = dPsib }

        /** The estimated uncertainty/error in the dPSI value in milliseconds of arc. */
        fun dPsiUnc(dPsiUnc: Double) = dPsiUnc(JsonField.of(dPsiUnc))

        /**
         * Sets [Builder.dPsiUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dPsiUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dPsiUnc(dPsiUnc: JsonField<Double>) = apply { this.dPsiUnc = dPsiUnc }

        /**
         * The Bulletin A celestial pole offset along x-axis with respect to the IAU 2000A Theory of
         * Precession and Nutation, measured in milliseconds of arc. Note: dX is not used when this
         * record represents IAU 1980 data.
         */
        fun dX(dX: Double) = dX(JsonField.of(dX))

        /**
         * Sets [Builder.dX] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dX] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dX(dX: JsonField<Double>) = apply { this.dX = dX }

        /**
         * The Bulletin B celestial pole offset along the X-axis with respect to the IAU 2000A
         * Theory of Precession and Nutation, measured in milliseconds of arc. Note: dXB is not used
         * when this record represents IAU 1980 data.
         */
        fun dXb(dXb: Double) = dXb(JsonField.of(dXb))

        /**
         * Sets [Builder.dXb] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dXb] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dXb(dXb: JsonField<Double>) = apply { this.dXb = dXb }

        /** The estimated uncertainty/error in the Bulletin A dX value, in milliseconds of arc. */
        fun dXUnc(dXUnc: Double) = dXUnc(JsonField.of(dXUnc))

        /**
         * Sets [Builder.dXUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dXUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dXUnc(dXUnc: JsonField<Double>) = apply { this.dXUnc = dXUnc }

        /**
         * The Bulletin A celestial pole offset along y-axis with respect to the IAU 2000A Theory of
         * Precession and Nutation, measured in milliseconds of arc. Note: dY is not used when this
         * record represents IAU 1980 data.
         */
        fun dY(dY: Double) = dY(JsonField.of(dY))

        /**
         * Sets [Builder.dY] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dY] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dY(dY: JsonField<Double>) = apply { this.dY = dY }

        /**
         * The Bulletin B celestial pole offset along the Y-axis with respect to the IAU 2000A
         * Theory of Precession and Nutation, measured in milliseconds of arc. Note: dYB is not used
         * when this record represents IAU 1980 data.
         */
        fun dYb(dYb: Double) = dYb(JsonField.of(dYb))

        /**
         * Sets [Builder.dYb] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dYb] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dYb(dYb: JsonField<Double>) = apply { this.dYb = dYb }

        /** The estimated uncertainty/error in the Bulletin A dY value, in milliseconds of arc. */
        fun dYUnc(dYUnc: Double) = dYUnc(JsonField.of(dYUnc))

        /**
         * Sets [Builder.dYUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dYUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dYUnc(dYUnc: JsonField<Double>) = apply { this.dYUnc = dYUnc }

        /**
         * Bulletin A length of day or LOD in milliseconds. Universal time (UT1) is the time of the
         * earth clock, which performs one revolution in about 24h. It is practically proportional
         * to the sidereal time. The excess revolution time is called length of day (LOD).
         */
        fun lod(lod: Double) = lod(JsonField.of(lod))

        /**
         * Sets [Builder.lod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lod] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lod(lod: JsonField<Double>) = apply { this.lod = lod }

        /** The estimated uncertainty/error in the lod value in seconds. */
        fun lodUnc(lodUnc: Double) = lodUnc(JsonField.of(lodUnc))

        /**
         * Sets [Builder.lodUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lodUnc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lodUnc(lodUnc: JsonField<Double>) = apply { this.lodUnc = lodUnc }

        /**
         * Flag indicating Issued (I), or Predicted (P) for this record's nutation values (dPSI and
         * dEpsilon).
         */
        fun nutationState(nutationState: NutationState) = nutationState(JsonField.of(nutationState))

        /**
         * Sets [Builder.nutationState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nutationState] with a well-typed [NutationState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nutationState(nutationState: JsonField<NutationState>) = apply {
            this.nutationState = nutationState
        }

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         */
        fun origin(origin: String) = origin(JsonField.of(origin))

        /**
         * Sets [Builder.origin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origin] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun origin(origin: JsonField<String>) = apply { this.origin = origin }

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         */
        fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

        /**
         * Sets [Builder.origNetwork] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origNetwork] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun origNetwork(origNetwork: JsonField<String>) = apply { this.origNetwork = origNetwork }

        /** Flag indicating Issued (I), or Predicted (P) for this record's polar motion values. */
        fun polarMotionState(polarMotionState: PolarMotionState) =
            polarMotionState(JsonField.of(polarMotionState))

        /**
         * Sets [Builder.polarMotionState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarMotionState] with a well-typed [PolarMotionState]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun polarMotionState(polarMotionState: JsonField<PolarMotionState>) = apply {
            this.polarMotionState = polarMotionState
        }

        /**
         * The Bulletin A X coordinate value of earth polar motion at eopDate. Polar motion of the
         * Earth is the motion of the Earth's rotational axis relative to its crust. This is
         * measured with respect to a reference frame in which the solid Earth is fixed (a so-called
         * Earth-centered, Earth-fixed or ECEF reference frame). Measured in arc seconds.
         */
        fun polarMotionX(polarMotionX: Double) = polarMotionX(JsonField.of(polarMotionX))

        /**
         * Sets [Builder.polarMotionX] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarMotionX] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun polarMotionX(polarMotionX: JsonField<Double>) = apply {
            this.polarMotionX = polarMotionX
        }

        /**
         * Bulletin B X coordinate value of earth polar motion at eopDate. Polar motion of the Earth
         * is the motion of the Earth's rotational axis relative to its crust. This is measured with
         * respect to a reference frame in which the solid Earth is fixed (a so-called
         * Earth-centered, Earth-fixed or ECEF reference frame). Measured in arc seconds.
         */
        fun polarMotionXb(polarMotionXb: Double) = polarMotionXb(JsonField.of(polarMotionXb))

        /**
         * Sets [Builder.polarMotionXb] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarMotionXb] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun polarMotionXb(polarMotionXb: JsonField<Double>) = apply {
            this.polarMotionXb = polarMotionXb
        }

        /** Estimated uncertainty/error in polarMotionX value in arc seconds. */
        fun polarMotionXUnc(polarMotionXUnc: Double) =
            polarMotionXUnc(JsonField.of(polarMotionXUnc))

        /**
         * Sets [Builder.polarMotionXUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarMotionXUnc] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun polarMotionXUnc(polarMotionXUnc: JsonField<Double>) = apply {
            this.polarMotionXUnc = polarMotionXUnc
        }

        /**
         * The Bulletin A Y coordinate value of earth polar motion at eopDate. Polar motion of the
         * Earth is the motion of the Earth's rotational axis relative to its crust. This is
         * measured with respect to a reference frame in which the solid Earth is fixed (a so-called
         * Earth-centered, Earth-fixed or ECEF reference frame). Measured in arc seconds.
         */
        fun polarMotionY(polarMotionY: Double) = polarMotionY(JsonField.of(polarMotionY))

        /**
         * Sets [Builder.polarMotionY] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarMotionY] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun polarMotionY(polarMotionY: JsonField<Double>) = apply {
            this.polarMotionY = polarMotionY
        }

        /**
         * Bulletin B Y coordinate value of earth polar motion at eopDate. Polar motion of the Earth
         * is the motion of the Earth's rotational axis relative to its crust. This is measured with
         * respect to a reference frame in which the solid Earth is fixed (a so-called
         * Earth-centered, Earth-fixed or ECEF reference frame). Measured in arc seconds.
         */
        fun polarMotionYb(polarMotionYb: Double) = polarMotionYb(JsonField.of(polarMotionYb))

        /**
         * Sets [Builder.polarMotionYb] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarMotionYb] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun polarMotionYb(polarMotionYb: JsonField<Double>) = apply {
            this.polarMotionYb = polarMotionYb
        }

        /** Estimated uncertainty/error in polarMotionY value in arc seconds. */
        fun polarMotionYUnc(polarMotionYUnc: Double) =
            polarMotionYUnc(JsonField.of(polarMotionYUnc))

        /**
         * Sets [Builder.polarMotionYUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarMotionYUnc] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun polarMotionYUnc(polarMotionYUnc: JsonField<Double>) = apply {
            this.polarMotionYUnc = polarMotionYUnc
        }

        /**
         * The IAU Theory of Precession and Theory of Nutation applied to the data in this record.
         * IAU1980 records employ the IAU 1976 Theory of Precession and IAU 1980 Theory of Nutation,
         * and IAU2000 records employ the IAU 2000A Theory of Precession and Nutation.
         */
        fun precessionNutationStd(precessionNutationStd: String) =
            precessionNutationStd(JsonField.of(precessionNutationStd))

        /**
         * Sets [Builder.precessionNutationStd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.precessionNutationStd] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun precessionNutationStd(precessionNutationStd: JsonField<String>) = apply {
            this.precessionNutationStd = precessionNutationStd
        }

        /**
         * Optional URI location in the document repository of the raw file parsed by the system to
         * produce this record. To download the raw file, prepend
         * https://udl-hostname/scs/download?id= to this value.
         */
        fun rawFileUri(rawFileUri: String) = rawFileUri(JsonField.of(rawFileUri))

        /**
         * Sets [Builder.rawFileUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rawFileUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rawFileUri(rawFileUri: JsonField<String>) = apply { this.rawFileUri = rawFileUri }

        /** Time the row was last updated in the database, auto-populated by the system. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Application user who updated the row in the database, auto-populated by the system. */
        fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

        /**
         * The difference between the Bulletin A UT1 and UTC time scales as of eopDate in seconds.
         */
        fun ut1Utc(ut1Utc: Double) = ut1Utc(JsonField.of(ut1Utc))

        /**
         * Sets [Builder.ut1Utc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ut1Utc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ut1Utc(ut1Utc: JsonField<Double>) = apply { this.ut1Utc = ut1Utc }

        /**
         * The Bulletin B difference between the UT1 and UTC time scales as of eopDate in seconds.
         */
        fun ut1Utcb(ut1Utcb: Double) = ut1Utcb(JsonField.of(ut1Utcb))

        /**
         * Sets [Builder.ut1Utcb] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ut1Utcb] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ut1Utcb(ut1Utcb: JsonField<Double>) = apply { this.ut1Utcb = ut1Utcb }

        /**
         * Flag indicating Issued (I), or Predicted (P) for this record''s Bulletin A UT1-UTC
         * values.
         */
        fun ut1UtcState(ut1UtcState: Ut1UtcState) = ut1UtcState(JsonField.of(ut1UtcState))

        /**
         * Sets [Builder.ut1UtcState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ut1UtcState] with a well-typed [Ut1UtcState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ut1UtcState(ut1UtcState: JsonField<Ut1UtcState>) = apply {
            this.ut1UtcState = ut1UtcState
        }

        /** The estimated uncertainty/error in the ut1UTC value in seconds. */
        fun ut1UtcUnc(ut1UtcUnc: Double) = ut1UtcUnc(JsonField.of(ut1UtcUnc))

        /**
         * Sets [Builder.ut1UtcUnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ut1UtcUnc] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ut1UtcUnc(ut1UtcUnc: JsonField<Double>) = apply { this.ut1UtcUnc = ut1UtcUnc }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [EopFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .eopDate()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EopFull =
            EopFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("eopDate", eopDate),
                checkRequired("source", source),
                id,
                createdAt,
                createdBy,
                dEpsilon,
                dEpsilonB,
                dEpsilonUnc,
                dPsi,
                dPsib,
                dPsiUnc,
                dX,
                dXb,
                dXUnc,
                dY,
                dYb,
                dYUnc,
                lod,
                lodUnc,
                nutationState,
                origin,
                origNetwork,
                polarMotionState,
                polarMotionX,
                polarMotionXb,
                polarMotionXUnc,
                polarMotionY,
                polarMotionYb,
                polarMotionYUnc,
                precessionNutationStd,
                rawFileUri,
                updatedAt,
                updatedBy,
                ut1Utc,
                ut1Utcb,
                ut1UtcState,
                ut1UtcUnc,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EopFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        eopDate()
        source()
        id()
        createdAt()
        createdBy()
        dEpsilon()
        dEpsilonB()
        dEpsilonUnc()
        dPsi()
        dPsib()
        dPsiUnc()
        dX()
        dXb()
        dXUnc()
        dY()
        dYb()
        dYUnc()
        lod()
        lodUnc()
        nutationState().ifPresent { it.validate() }
        origin()
        origNetwork()
        polarMotionState().ifPresent { it.validate() }
        polarMotionX()
        polarMotionXb()
        polarMotionXUnc()
        polarMotionY()
        polarMotionYb()
        polarMotionYUnc()
        precessionNutationStd()
        rawFileUri()
        updatedAt()
        updatedBy()
        ut1Utc()
        ut1Utcb()
        ut1UtcState().ifPresent { it.validate() }
        ut1UtcUnc()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: UnifieddatalibraryInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (eopDate.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dEpsilon.asKnown().isPresent) 1 else 0) +
            (if (dEpsilonB.asKnown().isPresent) 1 else 0) +
            (if (dEpsilonUnc.asKnown().isPresent) 1 else 0) +
            (if (dPsi.asKnown().isPresent) 1 else 0) +
            (if (dPsib.asKnown().isPresent) 1 else 0) +
            (if (dPsiUnc.asKnown().isPresent) 1 else 0) +
            (if (dX.asKnown().isPresent) 1 else 0) +
            (if (dXb.asKnown().isPresent) 1 else 0) +
            (if (dXUnc.asKnown().isPresent) 1 else 0) +
            (if (dY.asKnown().isPresent) 1 else 0) +
            (if (dYb.asKnown().isPresent) 1 else 0) +
            (if (dYUnc.asKnown().isPresent) 1 else 0) +
            (if (lod.asKnown().isPresent) 1 else 0) +
            (if (lodUnc.asKnown().isPresent) 1 else 0) +
            (nutationState.asKnown().getOrNull()?.validity() ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (polarMotionState.asKnown().getOrNull()?.validity() ?: 0) +
            (if (polarMotionX.asKnown().isPresent) 1 else 0) +
            (if (polarMotionXb.asKnown().isPresent) 1 else 0) +
            (if (polarMotionXUnc.asKnown().isPresent) 1 else 0) +
            (if (polarMotionY.asKnown().isPresent) 1 else 0) +
            (if (polarMotionYb.asKnown().isPresent) 1 else 0) +
            (if (polarMotionYUnc.asKnown().isPresent) 1 else 0) +
            (if (precessionNutationStd.asKnown().isPresent) 1 else 0) +
            (if (rawFileUri.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (ut1Utc.asKnown().isPresent) 1 else 0) +
            (if (ut1Utcb.asKnown().isPresent) 1 else 0) +
            (ut1UtcState.asKnown().getOrNull()?.validity() ?: 0) +
            (if (ut1UtcUnc.asKnown().isPresent) 1 else 0)

    /**
     * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     */
    class DataMode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val REAL = of("REAL")

            @JvmField val TEST = of("TEST")

            @JvmField val SIMULATED = of("SIMULATED")

            @JvmField val EXERCISE = of("EXERCISE")

            @JvmStatic fun of(value: String) = DataMode(JsonField.of(value))
        }

        /** An enum containing [DataMode]'s known values. */
        enum class Known {
            REAL,
            TEST,
            SIMULATED,
            EXERCISE,
        }

        /**
         * An enum containing [DataMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DataMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REAL,
            TEST,
            SIMULATED,
            EXERCISE,
            /** An enum member indicating that [DataMode] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                REAL -> Value.REAL
                TEST -> Value.TEST
                SIMULATED -> Value.SIMULATED
                EXERCISE -> Value.EXERCISE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                REAL -> Known.REAL
                TEST -> Known.TEST
                SIMULATED -> Known.SIMULATED
                EXERCISE -> Known.EXERCISE
                else -> throw UnifieddatalibraryInvalidDataException("Unknown DataMode: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                UnifieddatalibraryInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): DataMode = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: UnifieddatalibraryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Flag indicating Issued (I), or Predicted (P) for this record's nutation values (dPSI and
     * dEpsilon).
     */
    class NutationState @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val I = of("I")

            @JvmField val P = of("P")

            @JvmStatic fun of(value: String) = NutationState(JsonField.of(value))
        }

        /** An enum containing [NutationState]'s known values. */
        enum class Known {
            I,
            P,
        }

        /**
         * An enum containing [NutationState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [NutationState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            I,
            P,
            /**
             * An enum member indicating that [NutationState] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                I -> Value.I
                P -> Value.P
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                I -> Known.I
                P -> Known.P
                else ->
                    throw UnifieddatalibraryInvalidDataException("Unknown NutationState: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                UnifieddatalibraryInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): NutationState = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: UnifieddatalibraryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NutationState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Flag indicating Issued (I), or Predicted (P) for this record's polar motion values. */
    class PolarMotionState @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val I = of("I")

            @JvmField val P = of("P")

            @JvmStatic fun of(value: String) = PolarMotionState(JsonField.of(value))
        }

        /** An enum containing [PolarMotionState]'s known values. */
        enum class Known {
            I,
            P,
        }

        /**
         * An enum containing [PolarMotionState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PolarMotionState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            I,
            P,
            /**
             * An enum member indicating that [PolarMotionState] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                I -> Value.I
                P -> Value.P
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                I -> Known.I
                P -> Known.P
                else ->
                    throw UnifieddatalibraryInvalidDataException("Unknown PolarMotionState: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                UnifieddatalibraryInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): PolarMotionState = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: UnifieddatalibraryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PolarMotionState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Flag indicating Issued (I), or Predicted (P) for this record''s Bulletin A UT1-UTC values.
     */
    class Ut1UtcState @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val I = of("I")

            @JvmField val P = of("P")

            @JvmStatic fun of(value: String) = Ut1UtcState(JsonField.of(value))
        }

        /** An enum containing [Ut1UtcState]'s known values. */
        enum class Known {
            I,
            P,
        }

        /**
         * An enum containing [Ut1UtcState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Ut1UtcState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            I,
            P,
            /**
             * An enum member indicating that [Ut1UtcState] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                I -> Value.I
                P -> Value.P
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                I -> Known.I
                P -> Known.P
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Ut1UtcState: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                UnifieddatalibraryInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Ut1UtcState = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: UnifieddatalibraryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Ut1UtcState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EopFull &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            eopDate == other.eopDate &&
            source == other.source &&
            id == other.id &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            dEpsilon == other.dEpsilon &&
            dEpsilonB == other.dEpsilonB &&
            dEpsilonUnc == other.dEpsilonUnc &&
            dPsi == other.dPsi &&
            dPsib == other.dPsib &&
            dPsiUnc == other.dPsiUnc &&
            dX == other.dX &&
            dXb == other.dXb &&
            dXUnc == other.dXUnc &&
            dY == other.dY &&
            dYb == other.dYb &&
            dYUnc == other.dYUnc &&
            lod == other.lod &&
            lodUnc == other.lodUnc &&
            nutationState == other.nutationState &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            polarMotionState == other.polarMotionState &&
            polarMotionX == other.polarMotionX &&
            polarMotionXb == other.polarMotionXb &&
            polarMotionXUnc == other.polarMotionXUnc &&
            polarMotionY == other.polarMotionY &&
            polarMotionYb == other.polarMotionYb &&
            polarMotionYUnc == other.polarMotionYUnc &&
            precessionNutationStd == other.precessionNutationStd &&
            rawFileUri == other.rawFileUri &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            ut1Utc == other.ut1Utc &&
            ut1Utcb == other.ut1Utcb &&
            ut1UtcState == other.ut1UtcState &&
            ut1UtcUnc == other.ut1UtcUnc &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            eopDate,
            source,
            id,
            createdAt,
            createdBy,
            dEpsilon,
            dEpsilonB,
            dEpsilonUnc,
            dPsi,
            dPsib,
            dPsiUnc,
            dX,
            dXb,
            dXUnc,
            dY,
            dYb,
            dYUnc,
            lod,
            lodUnc,
            nutationState,
            origin,
            origNetwork,
            polarMotionState,
            polarMotionX,
            polarMotionXb,
            polarMotionXUnc,
            polarMotionY,
            polarMotionYb,
            polarMotionYUnc,
            precessionNutationStd,
            rawFileUri,
            updatedAt,
            updatedBy,
            ut1Utc,
            ut1Utcb,
            ut1UtcState,
            ut1UtcUnc,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EopFull{classificationMarking=$classificationMarking, dataMode=$dataMode, eopDate=$eopDate, source=$source, id=$id, createdAt=$createdAt, createdBy=$createdBy, dEpsilon=$dEpsilon, dEpsilonB=$dEpsilonB, dEpsilonUnc=$dEpsilonUnc, dPsi=$dPsi, dPsib=$dPsib, dPsiUnc=$dPsiUnc, dX=$dX, dXb=$dXb, dXUnc=$dXUnc, dY=$dY, dYb=$dYb, dYUnc=$dYUnc, lod=$lod, lodUnc=$lodUnc, nutationState=$nutationState, origin=$origin, origNetwork=$origNetwork, polarMotionState=$polarMotionState, polarMotionX=$polarMotionX, polarMotionXb=$polarMotionXb, polarMotionXUnc=$polarMotionXUnc, polarMotionY=$polarMotionY, polarMotionYb=$polarMotionYb, polarMotionYUnc=$polarMotionYUnc, precessionNutationStd=$precessionNutationStd, rawFileUri=$rawFileUri, updatedAt=$updatedAt, updatedBy=$updatedBy, ut1Utc=$ut1Utc, ut1Utcb=$ut1Utcb, ut1UtcState=$ut1UtcState, ut1UtcUnc=$ut1UtcUnc, additionalProperties=$additionalProperties}"
}

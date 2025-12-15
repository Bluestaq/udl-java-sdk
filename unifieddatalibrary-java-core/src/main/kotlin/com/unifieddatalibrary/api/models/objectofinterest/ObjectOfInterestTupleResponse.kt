// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.objectofinterest

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import com.unifieddatalibrary.api.models.OnorbitFull
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * OnOrbit objects of interest, which include information about the last known state of the object.
 */
class ObjectOfInterestTupleResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idOnOrbit: JsonField<String>,
    private val sensorTaskingStartTime: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val statusDate: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val affectedObjects: JsonField<List<String>>,
    private val apogee: JsonField<Double>,
    private val argOfPerigee: JsonField<Double>,
    private val bStar: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val deltaTs: JsonField<List<Double>>,
    private val deltaVs: JsonField<List<Double>>,
    private val description: JsonField<String>,
    private val eccentricity: JsonField<Double>,
    private val elsetEpoch: JsonField<OffsetDateTime>,
    private val inclination: JsonField<Double>,
    private val lastObTime: JsonField<OffsetDateTime>,
    private val manifolds: JsonField<List<Manifold>>,
    private val meanAnomaly: JsonField<Double>,
    private val meanMotion: JsonField<Double>,
    private val meanMotionDDot: JsonField<Double>,
    private val meanMotionDot: JsonField<Double>,
    private val missedObTime: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val onOrbit: JsonField<OnorbitFull>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val perigee: JsonField<Double>,
    private val period: JsonField<Double>,
    private val priority: JsonField<Int>,
    private val raan: JsonField<Double>,
    private val revNo: JsonField<Int>,
    private val satNo: JsonField<Int>,
    private val semiMajorAxis: JsonField<Double>,
    private val sensorTaskingStopTime: JsonField<OffsetDateTime>,
    private val status: JsonField<String>,
    private val svEpoch: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val x: JsonField<Double>,
    private val xvel: JsonField<Double>,
    private val y: JsonField<Double>,
    private val yvel: JsonField<Double>,
    private val z: JsonField<Double>,
    private val zvel: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sensorTaskingStartTime")
        @ExcludeMissing
        sensorTaskingStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("statusDate")
        @ExcludeMissing
        statusDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("affectedObjects")
        @ExcludeMissing
        affectedObjects: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("apogee") @ExcludeMissing apogee: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("argOfPerigee")
        @ExcludeMissing
        argOfPerigee: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bStar") @ExcludeMissing bStar: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deltaTs")
        @ExcludeMissing
        deltaTs: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("deltaVs")
        @ExcludeMissing
        deltaVs: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eccentricity")
        @ExcludeMissing
        eccentricity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("elsetEpoch")
        @ExcludeMissing
        elsetEpoch: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("inclination")
        @ExcludeMissing
        inclination: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lastObTime")
        @ExcludeMissing
        lastObTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("manifolds")
        @ExcludeMissing
        manifolds: JsonField<List<Manifold>> = JsonMissing.of(),
        @JsonProperty("meanAnomaly")
        @ExcludeMissing
        meanAnomaly: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("meanMotion")
        @ExcludeMissing
        meanMotion: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("meanMotionDDot")
        @ExcludeMissing
        meanMotionDDot: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("meanMotionDot")
        @ExcludeMissing
        meanMotionDot: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("missedObTime")
        @ExcludeMissing
        missedObTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("onOrbit") @ExcludeMissing onOrbit: JsonField<OnorbitFull> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("perigee") @ExcludeMissing perigee: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("period") @ExcludeMissing period: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("raan") @ExcludeMissing raan: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("revNo") @ExcludeMissing revNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("semiMajorAxis")
        @ExcludeMissing
        semiMajorAxis: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sensorTaskingStopTime")
        @ExcludeMissing
        sensorTaskingStopTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("svEpoch")
        @ExcludeMissing
        svEpoch: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("x") @ExcludeMissing x: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("xvel") @ExcludeMissing xvel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("y") @ExcludeMissing y: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("yvel") @ExcludeMissing yvel: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("z") @ExcludeMissing z: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("zvel") @ExcludeMissing zvel: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idOnOrbit,
        sensorTaskingStartTime,
        source,
        statusDate,
        id,
        affectedObjects,
        apogee,
        argOfPerigee,
        bStar,
        createdAt,
        createdBy,
        deltaTs,
        deltaVs,
        description,
        eccentricity,
        elsetEpoch,
        inclination,
        lastObTime,
        manifolds,
        meanAnomaly,
        meanMotion,
        meanMotionDDot,
        meanMotionDot,
        missedObTime,
        name,
        onOrbit,
        origin,
        origNetwork,
        perigee,
        period,
        priority,
        raan,
        revNo,
        satNo,
        semiMajorAxis,
        sensorTaskingStopTime,
        status,
        svEpoch,
        updatedAt,
        updatedBy,
        x,
        xvel,
        y,
        yvel,
        z,
        zvel,
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
     * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * UUID of the parent Onorbit record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idOnOrbit(): String = idOnOrbit.getRequired("idOnOrbit")

    /**
     * Sensor tasking start time for object of interest.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sensorTaskingStartTime(): OffsetDateTime =
        sensorTaskingStartTime.getRequired("sensorTaskingStartTime")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Time of last status change of the object of interest event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statusDate(): OffsetDateTime = statusDate.getRequired("statusDate")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Optional array of Onorbit IDs (idOnOrbit) representing satellites potentially affected by
     * this object of interest.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun affectedObjects(): Optional<List<String>> = affectedObjects.getOptional("affectedObjects")

    /**
     * Last reported apogee. The Orbit point furthest from the center of the earth in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun apogee(): Optional<Double> = apogee.getOptional("apogee")

    /**
     * Last reported argument of perigee. The argument of perigee is the angle in degrees formed
     * between the perigee and the ascending node. If the perigee would occur at the ascending node,
     * the argument of perigee would be 0.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun argOfPerigee(): Optional<Double> = argOfPerigee.getOptional("argOfPerigee")

    /**
     * Last reported drag term for SGP4 orbital model, used for calculating decay constants for
     * altitude, eccentricity etc, measured in inverse earth radii.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bStar(): Optional<Double> = bStar.getOptional("bStar")

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
     * Possible delta time applications for the object of interest, in seconds.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun deltaTs(): Optional<List<Double>> = deltaTs.getOptional("deltaTs")

    /**
     * Possible delta V applications for the object of interest, in km/sec.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun deltaVs(): Optional<List<Double>> = deltaVs.getOptional("deltaVs")

    /**
     * Description of the object of interest event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Last reported eccentricity of the object. The orbital eccentricity of an astronomical object
     * is a parameter that determines the amount by which its orbit around another body deviates
     * from a perfect circle. A value of 0 is a circular orbit, values between 0 and 1 form an
     * elliptic orbit, 1 is a parabolic escape orbit, and greater than 1 is a hyperbolic escape
     * orbit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eccentricity(): Optional<Double> = eccentricity.getOptional("eccentricity")

    /**
     * Last reported elset epoch time in ISO 8601 UTC time, with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elsetEpoch(): Optional<OffsetDateTime> = elsetEpoch.getOptional("elsetEpoch")

    /**
     * Last reported inclination of the object. Inclination is the angle between the equator and the
     * orbit when looking from the center of the Earth. If the orbit went exactly around the equator
     * from left to right, then the inclination would be 0. The inclination ranges from 0 to 180
     * degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun inclination(): Optional<Double> = inclination.getOptional("inclination")

    /**
     * Last reported observation time in ISO 8601 UTC time, with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lastObTime(): Optional<OffsetDateTime> = lastObTime.getOptional("lastObTime")

    /**
     * Manifolds associated with this object of interest.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun manifolds(): Optional<List<Manifold>> = manifolds.getOptional("manifolds")

    /**
     * Last reported meanAnomaly. Mean anomoly is where the satellite is in its orbital path. The
     * mean anomaly ranges from 0 to 360 degrees. The mean anomaly is referenced to the perigee. If
     * the satellite were at the perigee, the mean anomaly would be 0.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun meanAnomaly(): Optional<Double> = meanAnomaly.getOptional("meanAnomaly")

    /**
     * Last reported mean motion of the object. Mean motion is the angular speed required for a body
     * to complete one orbit, assuming constant speed in a circular orbit which completes in the
     * same time as the variable speed, elliptical orbit of the actual body. Measured in revolutions
     * per day.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun meanMotion(): Optional<Double> = meanMotion.getOptional("meanMotion")

    /**
     * Last reported 2nd derivative of the mean motion with respect to time. Units are revolutions
     * per day cubed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun meanMotionDDot(): Optional<Double> = meanMotionDDot.getOptional("meanMotionDDot")

    /**
     * Last reported 1st derivative of the mean motion with respect to time. Units are revolutions
     * per day squared.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun meanMotionDot(): Optional<Double> = meanMotionDot.getOptional("meanMotionDot")

    /**
     * The time at which an attempted observation of the object of interest noticed it was missing,
     * in ISO 8601 UTC time, with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun missedObTime(): Optional<OffsetDateTime> = missedObTime.getOptional("missedObTime")

    /**
     * Unique name of the object of interest event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Model object representing on-orbit objects or satellites in the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun onOrbit(): Optional<OnorbitFull> = onOrbit.getOptional("onOrbit")

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
     * Last reported perigee. The orbit point nearest to the center of the earth in kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun perigee(): Optional<Double> = perigee.getOptional("perigee")

    /**
     * Last reported orbit period. Period of the orbit is equal to inverse of mean motion.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun period(): Optional<Double> = period.getOptional("period")

    /**
     * Priority of the object of interest as an integer (1=highest priority).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun priority(): Optional<Int> = priority.getOptional("priority")

    /**
     * Last reported raan. Right ascension of the ascending node, or RAAN is the angle as measured
     * in degrees eastwards (or, as seen from the north, counterclockwise) from the First Point of
     * Aries to the ascending node, which is where the orbit crosses the equator when traveling
     * north.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun raan(): Optional<Double> = raan.getOptional("raan")

    /**
     * The last reported revolution number. The value is incremented when a satellite crosses the
     * equator on an ascending pass.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun revNo(): Optional<Int> = revNo.getOptional("revNo")

    /**
     * Satellite/Catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Last reported semi major axis, which is the sum of the periapsis and apoapsis distances
     * divided by two. For circular orbits, the semimajor axis is the distance between the centers
     * of the bodies, not the distance of the bodies from the center of mass.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun semiMajorAxis(): Optional<Double> = semiMajorAxis.getOptional("semiMajorAxis")

    /**
     * Sensor tasking stop time for object of interest.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sensorTaskingStopTime(): Optional<OffsetDateTime> =
        sensorTaskingStopTime.getOptional("sensorTaskingStopTime")

    /**
     * Status of the object of interest event (e.g. OPEN, CLOSED, CANCELLED).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Last reported state vector epoch time in ISO 8601 UTC time, with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun svEpoch(): Optional<OffsetDateTime> = svEpoch.getOptional("svEpoch")

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
     * Last reported x position of the object in km, in J2000 coordinates.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun x(): Optional<Double> = x.getOptional("x")

    /**
     * Last reported x velocity of the object in km/sec, in J2000 coordinates.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun xvel(): Optional<Double> = xvel.getOptional("xvel")

    /**
     * Last reported y position of the object in km, in J2000 coordinates.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun y(): Optional<Double> = y.getOptional("y")

    /**
     * Last reported y velocity of the object in km/sec, in J2000 coordinates.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun yvel(): Optional<Double> = yvel.getOptional("yvel")

    /**
     * Last reported z position of the object in km, in J2000 coordinates.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun z(): Optional<Double> = z.getOptional("z")

    /**
     * Last reported z velocity of the object in km/sec, in J2000 coordinates.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun zvel(): Optional<Double> = zvel.getOptional("zvel")

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
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [sensorTaskingStartTime].
     *
     * Unlike [sensorTaskingStartTime], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sensorTaskingStartTime")
    @ExcludeMissing
    fun _sensorTaskingStartTime(): JsonField<OffsetDateTime> = sensorTaskingStartTime

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [statusDate].
     *
     * Unlike [statusDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusDate")
    @ExcludeMissing
    fun _statusDate(): JsonField<OffsetDateTime> = statusDate

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [affectedObjects].
     *
     * Unlike [affectedObjects], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("affectedObjects")
    @ExcludeMissing
    fun _affectedObjects(): JsonField<List<String>> = affectedObjects

    /**
     * Returns the raw JSON value of [apogee].
     *
     * Unlike [apogee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apogee") @ExcludeMissing fun _apogee(): JsonField<Double> = apogee

    /**
     * Returns the raw JSON value of [argOfPerigee].
     *
     * Unlike [argOfPerigee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("argOfPerigee")
    @ExcludeMissing
    fun _argOfPerigee(): JsonField<Double> = argOfPerigee

    /**
     * Returns the raw JSON value of [bStar].
     *
     * Unlike [bStar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bStar") @ExcludeMissing fun _bStar(): JsonField<Double> = bStar

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
     * Returns the raw JSON value of [deltaTs].
     *
     * Unlike [deltaTs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deltaTs") @ExcludeMissing fun _deltaTs(): JsonField<List<Double>> = deltaTs

    /**
     * Returns the raw JSON value of [deltaVs].
     *
     * Unlike [deltaVs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deltaVs") @ExcludeMissing fun _deltaVs(): JsonField<List<Double>> = deltaVs

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [eccentricity].
     *
     * Unlike [eccentricity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eccentricity")
    @ExcludeMissing
    fun _eccentricity(): JsonField<Double> = eccentricity

    /**
     * Returns the raw JSON value of [elsetEpoch].
     *
     * Unlike [elsetEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elsetEpoch")
    @ExcludeMissing
    fun _elsetEpoch(): JsonField<OffsetDateTime> = elsetEpoch

    /**
     * Returns the raw JSON value of [inclination].
     *
     * Unlike [inclination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inclination") @ExcludeMissing fun _inclination(): JsonField<Double> = inclination

    /**
     * Returns the raw JSON value of [lastObTime].
     *
     * Unlike [lastObTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastObTime")
    @ExcludeMissing
    fun _lastObTime(): JsonField<OffsetDateTime> = lastObTime

    /**
     * Returns the raw JSON value of [manifolds].
     *
     * Unlike [manifolds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manifolds")
    @ExcludeMissing
    fun _manifolds(): JsonField<List<Manifold>> = manifolds

    /**
     * Returns the raw JSON value of [meanAnomaly].
     *
     * Unlike [meanAnomaly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meanAnomaly") @ExcludeMissing fun _meanAnomaly(): JsonField<Double> = meanAnomaly

    /**
     * Returns the raw JSON value of [meanMotion].
     *
     * Unlike [meanMotion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meanMotion") @ExcludeMissing fun _meanMotion(): JsonField<Double> = meanMotion

    /**
     * Returns the raw JSON value of [meanMotionDDot].
     *
     * Unlike [meanMotionDDot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meanMotionDDot")
    @ExcludeMissing
    fun _meanMotionDDot(): JsonField<Double> = meanMotionDDot

    /**
     * Returns the raw JSON value of [meanMotionDot].
     *
     * Unlike [meanMotionDot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meanMotionDot")
    @ExcludeMissing
    fun _meanMotionDot(): JsonField<Double> = meanMotionDot

    /**
     * Returns the raw JSON value of [missedObTime].
     *
     * Unlike [missedObTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("missedObTime")
    @ExcludeMissing
    fun _missedObTime(): JsonField<OffsetDateTime> = missedObTime

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [onOrbit].
     *
     * Unlike [onOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("onOrbit") @ExcludeMissing fun _onOrbit(): JsonField<OnorbitFull> = onOrbit

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
     * Returns the raw JSON value of [perigee].
     *
     * Unlike [perigee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("perigee") @ExcludeMissing fun _perigee(): JsonField<Double> = perigee

    /**
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<Double> = period

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Int> = priority

    /**
     * Returns the raw JSON value of [raan].
     *
     * Unlike [raan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("raan") @ExcludeMissing fun _raan(): JsonField<Double> = raan

    /**
     * Returns the raw JSON value of [revNo].
     *
     * Unlike [revNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revNo") @ExcludeMissing fun _revNo(): JsonField<Int> = revNo

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [semiMajorAxis].
     *
     * Unlike [semiMajorAxis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("semiMajorAxis")
    @ExcludeMissing
    fun _semiMajorAxis(): JsonField<Double> = semiMajorAxis

    /**
     * Returns the raw JSON value of [sensorTaskingStopTime].
     *
     * Unlike [sensorTaskingStopTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sensorTaskingStopTime")
    @ExcludeMissing
    fun _sensorTaskingStopTime(): JsonField<OffsetDateTime> = sensorTaskingStopTime

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [svEpoch].
     *
     * Unlike [svEpoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("svEpoch") @ExcludeMissing fun _svEpoch(): JsonField<OffsetDateTime> = svEpoch

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
     * Returns the raw JSON value of [x].
     *
     * Unlike [x], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("x") @ExcludeMissing fun _x(): JsonField<Double> = x

    /**
     * Returns the raw JSON value of [xvel].
     *
     * Unlike [xvel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("xvel") @ExcludeMissing fun _xvel(): JsonField<Double> = xvel

    /**
     * Returns the raw JSON value of [y].
     *
     * Unlike [y], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("y") @ExcludeMissing fun _y(): JsonField<Double> = y

    /**
     * Returns the raw JSON value of [yvel].
     *
     * Unlike [yvel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yvel") @ExcludeMissing fun _yvel(): JsonField<Double> = yvel

    /**
     * Returns the raw JSON value of [z].
     *
     * Unlike [z], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("z") @ExcludeMissing fun _z(): JsonField<Double> = z

    /**
     * Returns the raw JSON value of [zvel].
     *
     * Unlike [zvel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zvel") @ExcludeMissing fun _zvel(): JsonField<Double> = zvel

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
         * Returns a mutable builder for constructing an instance of
         * [ObjectOfInterestTupleResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idOnOrbit()
         * .sensorTaskingStartTime()
         * .source()
         * .statusDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectOfInterestTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idOnOrbit: JsonField<String>? = null
        private var sensorTaskingStartTime: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var statusDate: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var affectedObjects: JsonField<MutableList<String>>? = null
        private var apogee: JsonField<Double> = JsonMissing.of()
        private var argOfPerigee: JsonField<Double> = JsonMissing.of()
        private var bStar: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var deltaTs: JsonField<MutableList<Double>>? = null
        private var deltaVs: JsonField<MutableList<Double>>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var eccentricity: JsonField<Double> = JsonMissing.of()
        private var elsetEpoch: JsonField<OffsetDateTime> = JsonMissing.of()
        private var inclination: JsonField<Double> = JsonMissing.of()
        private var lastObTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var manifolds: JsonField<MutableList<Manifold>>? = null
        private var meanAnomaly: JsonField<Double> = JsonMissing.of()
        private var meanMotion: JsonField<Double> = JsonMissing.of()
        private var meanMotionDDot: JsonField<Double> = JsonMissing.of()
        private var meanMotionDot: JsonField<Double> = JsonMissing.of()
        private var missedObTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var onOrbit: JsonField<OnorbitFull> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var perigee: JsonField<Double> = JsonMissing.of()
        private var period: JsonField<Double> = JsonMissing.of()
        private var priority: JsonField<Int> = JsonMissing.of()
        private var raan: JsonField<Double> = JsonMissing.of()
        private var revNo: JsonField<Int> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var semiMajorAxis: JsonField<Double> = JsonMissing.of()
        private var sensorTaskingStopTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var svEpoch: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var x: JsonField<Double> = JsonMissing.of()
        private var xvel: JsonField<Double> = JsonMissing.of()
        private var y: JsonField<Double> = JsonMissing.of()
        private var yvel: JsonField<Double> = JsonMissing.of()
        private var z: JsonField<Double> = JsonMissing.of()
        private var zvel: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectOfInterestTupleResponse: ObjectOfInterestTupleResponse) = apply {
            classificationMarking = objectOfInterestTupleResponse.classificationMarking
            dataMode = objectOfInterestTupleResponse.dataMode
            idOnOrbit = objectOfInterestTupleResponse.idOnOrbit
            sensorTaskingStartTime = objectOfInterestTupleResponse.sensorTaskingStartTime
            source = objectOfInterestTupleResponse.source
            statusDate = objectOfInterestTupleResponse.statusDate
            id = objectOfInterestTupleResponse.id
            affectedObjects =
                objectOfInterestTupleResponse.affectedObjects.map { it.toMutableList() }
            apogee = objectOfInterestTupleResponse.apogee
            argOfPerigee = objectOfInterestTupleResponse.argOfPerigee
            bStar = objectOfInterestTupleResponse.bStar
            createdAt = objectOfInterestTupleResponse.createdAt
            createdBy = objectOfInterestTupleResponse.createdBy
            deltaTs = objectOfInterestTupleResponse.deltaTs.map { it.toMutableList() }
            deltaVs = objectOfInterestTupleResponse.deltaVs.map { it.toMutableList() }
            description = objectOfInterestTupleResponse.description
            eccentricity = objectOfInterestTupleResponse.eccentricity
            elsetEpoch = objectOfInterestTupleResponse.elsetEpoch
            inclination = objectOfInterestTupleResponse.inclination
            lastObTime = objectOfInterestTupleResponse.lastObTime
            manifolds = objectOfInterestTupleResponse.manifolds.map { it.toMutableList() }
            meanAnomaly = objectOfInterestTupleResponse.meanAnomaly
            meanMotion = objectOfInterestTupleResponse.meanMotion
            meanMotionDDot = objectOfInterestTupleResponse.meanMotionDDot
            meanMotionDot = objectOfInterestTupleResponse.meanMotionDot
            missedObTime = objectOfInterestTupleResponse.missedObTime
            name = objectOfInterestTupleResponse.name
            onOrbit = objectOfInterestTupleResponse.onOrbit
            origin = objectOfInterestTupleResponse.origin
            origNetwork = objectOfInterestTupleResponse.origNetwork
            perigee = objectOfInterestTupleResponse.perigee
            period = objectOfInterestTupleResponse.period
            priority = objectOfInterestTupleResponse.priority
            raan = objectOfInterestTupleResponse.raan
            revNo = objectOfInterestTupleResponse.revNo
            satNo = objectOfInterestTupleResponse.satNo
            semiMajorAxis = objectOfInterestTupleResponse.semiMajorAxis
            sensorTaskingStopTime = objectOfInterestTupleResponse.sensorTaskingStopTime
            status = objectOfInterestTupleResponse.status
            svEpoch = objectOfInterestTupleResponse.svEpoch
            updatedAt = objectOfInterestTupleResponse.updatedAt
            updatedBy = objectOfInterestTupleResponse.updatedBy
            x = objectOfInterestTupleResponse.x
            xvel = objectOfInterestTupleResponse.xvel
            y = objectOfInterestTupleResponse.y
            yvel = objectOfInterestTupleResponse.yvel
            z = objectOfInterestTupleResponse.z
            zvel = objectOfInterestTupleResponse.zvel
            additionalProperties = objectOfInterestTupleResponse.additionalProperties.toMutableMap()
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
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
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

        /** UUID of the parent Onorbit record. */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /** Sensor tasking start time for object of interest. */
        fun sensorTaskingStartTime(sensorTaskingStartTime: OffsetDateTime) =
            sensorTaskingStartTime(JsonField.of(sensorTaskingStartTime))

        /**
         * Sets [Builder.sensorTaskingStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sensorTaskingStartTime] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun sensorTaskingStartTime(sensorTaskingStartTime: JsonField<OffsetDateTime>) = apply {
            this.sensorTaskingStartTime = sensorTaskingStartTime
        }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Time of last status change of the object of interest event. */
        fun statusDate(statusDate: OffsetDateTime) = statusDate(JsonField.of(statusDate))

        /**
         * Sets [Builder.statusDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusDate(statusDate: JsonField<OffsetDateTime>) = apply {
            this.statusDate = statusDate
        }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Optional array of Onorbit IDs (idOnOrbit) representing satellites potentially affected by
         * this object of interest.
         */
        fun affectedObjects(affectedObjects: List<String>) =
            affectedObjects(JsonField.of(affectedObjects))

        /**
         * Sets [Builder.affectedObjects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.affectedObjects] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun affectedObjects(affectedObjects: JsonField<List<String>>) = apply {
            this.affectedObjects = affectedObjects.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [affectedObjects].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAffectedObject(affectedObject: String) = apply {
            affectedObjects =
                (affectedObjects ?: JsonField.of(mutableListOf())).also {
                    checkKnown("affectedObjects", it).add(affectedObject)
                }
        }

        /**
         * Last reported apogee. The Orbit point furthest from the center of the earth in
         * kilometers.
         */
        fun apogee(apogee: Double) = apogee(JsonField.of(apogee))

        /**
         * Sets [Builder.apogee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apogee] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apogee(apogee: JsonField<Double>) = apply { this.apogee = apogee }

        /**
         * Last reported argument of perigee. The argument of perigee is the angle in degrees formed
         * between the perigee and the ascending node. If the perigee would occur at the ascending
         * node, the argument of perigee would be 0.
         */
        fun argOfPerigee(argOfPerigee: Double) = argOfPerigee(JsonField.of(argOfPerigee))

        /**
         * Sets [Builder.argOfPerigee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.argOfPerigee] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun argOfPerigee(argOfPerigee: JsonField<Double>) = apply {
            this.argOfPerigee = argOfPerigee
        }

        /**
         * Last reported drag term for SGP4 orbital model, used for calculating decay constants for
         * altitude, eccentricity etc, measured in inverse earth radii.
         */
        fun bStar(bStar: Double) = bStar(JsonField.of(bStar))

        /**
         * Sets [Builder.bStar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bStar] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bStar(bStar: JsonField<Double>) = apply { this.bStar = bStar }

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

        /** Possible delta time applications for the object of interest, in seconds. */
        fun deltaTs(deltaTs: List<Double>) = deltaTs(JsonField.of(deltaTs))

        /**
         * Sets [Builder.deltaTs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deltaTs] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deltaTs(deltaTs: JsonField<List<Double>>) = apply {
            this.deltaTs = deltaTs.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [deltaTs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeltaT(deltaT: Double) = apply {
            deltaTs =
                (deltaTs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("deltaTs", it).add(deltaT)
                }
        }

        /** Possible delta V applications for the object of interest, in km/sec. */
        fun deltaVs(deltaVs: List<Double>) = deltaVs(JsonField.of(deltaVs))

        /**
         * Sets [Builder.deltaVs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deltaVs] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deltaVs(deltaVs: JsonField<List<Double>>) = apply {
            this.deltaVs = deltaVs.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [deltaVs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeltaV(deltaV: Double) = apply {
            deltaVs =
                (deltaVs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("deltaVs", it).add(deltaV)
                }
        }

        /** Description of the object of interest event. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * Last reported eccentricity of the object. The orbital eccentricity of an astronomical
         * object is a parameter that determines the amount by which its orbit around another body
         * deviates from a perfect circle. A value of 0 is a circular orbit, values between 0 and 1
         * form an elliptic orbit, 1 is a parabolic escape orbit, and greater than 1 is a hyperbolic
         * escape orbit.
         */
        fun eccentricity(eccentricity: Double) = eccentricity(JsonField.of(eccentricity))

        /**
         * Sets [Builder.eccentricity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eccentricity] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eccentricity(eccentricity: JsonField<Double>) = apply {
            this.eccentricity = eccentricity
        }

        /** Last reported elset epoch time in ISO 8601 UTC time, with microsecond precision. */
        fun elsetEpoch(elsetEpoch: OffsetDateTime) = elsetEpoch(JsonField.of(elsetEpoch))

        /**
         * Sets [Builder.elsetEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elsetEpoch] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun elsetEpoch(elsetEpoch: JsonField<OffsetDateTime>) = apply {
            this.elsetEpoch = elsetEpoch
        }

        /**
         * Last reported inclination of the object. Inclination is the angle between the equator and
         * the orbit when looking from the center of the Earth. If the orbit went exactly around the
         * equator from left to right, then the inclination would be 0. The inclination ranges from
         * 0 to 180 degrees.
         */
        fun inclination(inclination: Double) = inclination(JsonField.of(inclination))

        /**
         * Sets [Builder.inclination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inclination] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inclination(inclination: JsonField<Double>) = apply { this.inclination = inclination }

        /** Last reported observation time in ISO 8601 UTC time, with microsecond precision. */
        fun lastObTime(lastObTime: OffsetDateTime) = lastObTime(JsonField.of(lastObTime))

        /**
         * Sets [Builder.lastObTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastObTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastObTime(lastObTime: JsonField<OffsetDateTime>) = apply {
            this.lastObTime = lastObTime
        }

        /** Manifolds associated with this object of interest. */
        fun manifolds(manifolds: List<Manifold>) = manifolds(JsonField.of(manifolds))

        /**
         * Sets [Builder.manifolds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manifolds] with a well-typed `List<Manifold>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun manifolds(manifolds: JsonField<List<Manifold>>) = apply {
            this.manifolds = manifolds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Manifold] to [manifolds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addManifold(manifold: Manifold) = apply {
            manifolds =
                (manifolds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("manifolds", it).add(manifold)
                }
        }

        /**
         * Last reported meanAnomaly. Mean anomoly is where the satellite is in its orbital path.
         * The mean anomaly ranges from 0 to 360 degrees. The mean anomaly is referenced to the
         * perigee. If the satellite were at the perigee, the mean anomaly would be 0.
         */
        fun meanAnomaly(meanAnomaly: Double) = meanAnomaly(JsonField.of(meanAnomaly))

        /**
         * Sets [Builder.meanAnomaly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meanAnomaly] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meanAnomaly(meanAnomaly: JsonField<Double>) = apply { this.meanAnomaly = meanAnomaly }

        /**
         * Last reported mean motion of the object. Mean motion is the angular speed required for a
         * body to complete one orbit, assuming constant speed in a circular orbit which completes
         * in the same time as the variable speed, elliptical orbit of the actual body. Measured in
         * revolutions per day.
         */
        fun meanMotion(meanMotion: Double) = meanMotion(JsonField.of(meanMotion))

        /**
         * Sets [Builder.meanMotion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meanMotion] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meanMotion(meanMotion: JsonField<Double>) = apply { this.meanMotion = meanMotion }

        /**
         * Last reported 2nd derivative of the mean motion with respect to time. Units are
         * revolutions per day cubed.
         */
        fun meanMotionDDot(meanMotionDDot: Double) = meanMotionDDot(JsonField.of(meanMotionDDot))

        /**
         * Sets [Builder.meanMotionDDot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meanMotionDDot] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun meanMotionDDot(meanMotionDDot: JsonField<Double>) = apply {
            this.meanMotionDDot = meanMotionDDot
        }

        /**
         * Last reported 1st derivative of the mean motion with respect to time. Units are
         * revolutions per day squared.
         */
        fun meanMotionDot(meanMotionDot: Double) = meanMotionDot(JsonField.of(meanMotionDot))

        /**
         * Sets [Builder.meanMotionDot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meanMotionDot] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meanMotionDot(meanMotionDot: JsonField<Double>) = apply {
            this.meanMotionDot = meanMotionDot
        }

        /**
         * The time at which an attempted observation of the object of interest noticed it was
         * missing, in ISO 8601 UTC time, with microsecond precision.
         */
        fun missedObTime(missedObTime: OffsetDateTime) = missedObTime(JsonField.of(missedObTime))

        /**
         * Sets [Builder.missedObTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missedObTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun missedObTime(missedObTime: JsonField<OffsetDateTime>) = apply {
            this.missedObTime = missedObTime
        }

        /** Unique name of the object of interest event. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Model object representing on-orbit objects or satellites in the system. */
        fun onOrbit(onOrbit: OnorbitFull) = onOrbit(JsonField.of(onOrbit))

        /**
         * Sets [Builder.onOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onOrbit] with a well-typed [OnorbitFull] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun onOrbit(onOrbit: JsonField<OnorbitFull>) = apply { this.onOrbit = onOrbit }

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

        /**
         * Last reported perigee. The orbit point nearest to the center of the earth in kilometers.
         */
        fun perigee(perigee: Double) = perigee(JsonField.of(perigee))

        /**
         * Sets [Builder.perigee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perigee] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun perigee(perigee: JsonField<Double>) = apply { this.perigee = perigee }

        /** Last reported orbit period. Period of the orbit is equal to inverse of mean motion. */
        fun period(period: Double) = period(JsonField.of(period))

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun period(period: JsonField<Double>) = apply { this.period = period }

        /** Priority of the object of interest as an integer (1=highest priority). */
        fun priority(priority: Int) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Int>) = apply { this.priority = priority }

        /**
         * Last reported raan. Right ascension of the ascending node, or RAAN is the angle as
         * measured in degrees eastwards (or, as seen from the north, counterclockwise) from the
         * First Point of Aries to the ascending node, which is where the orbit crosses the equator
         * when traveling north.
         */
        fun raan(raan: Double) = raan(JsonField.of(raan))

        /**
         * Sets [Builder.raan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.raan] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun raan(raan: JsonField<Double>) = apply { this.raan = raan }

        /**
         * The last reported revolution number. The value is incremented when a satellite crosses
         * the equator on an ascending pass.
         */
        fun revNo(revNo: Int) = revNo(JsonField.of(revNo))

        /**
         * Sets [Builder.revNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun revNo(revNo: JsonField<Int>) = apply { this.revNo = revNo }

        /** Satellite/Catalog number of the target on-orbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /**
         * Last reported semi major axis, which is the sum of the periapsis and apoapsis distances
         * divided by two. For circular orbits, the semimajor axis is the distance between the
         * centers of the bodies, not the distance of the bodies from the center of mass.
         */
        fun semiMajorAxis(semiMajorAxis: Double) = semiMajorAxis(JsonField.of(semiMajorAxis))

        /**
         * Sets [Builder.semiMajorAxis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.semiMajorAxis] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun semiMajorAxis(semiMajorAxis: JsonField<Double>) = apply {
            this.semiMajorAxis = semiMajorAxis
        }

        /** Sensor tasking stop time for object of interest. */
        fun sensorTaskingStopTime(sensorTaskingStopTime: OffsetDateTime) =
            sensorTaskingStopTime(JsonField.of(sensorTaskingStopTime))

        /**
         * Sets [Builder.sensorTaskingStopTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sensorTaskingStopTime] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun sensorTaskingStopTime(sensorTaskingStopTime: JsonField<OffsetDateTime>) = apply {
            this.sensorTaskingStopTime = sensorTaskingStopTime
        }

        /** Status of the object of interest event (e.g. OPEN, CLOSED, CANCELLED). */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /**
         * Last reported state vector epoch time in ISO 8601 UTC time, with microsecond precision.
         */
        fun svEpoch(svEpoch: OffsetDateTime) = svEpoch(JsonField.of(svEpoch))

        /**
         * Sets [Builder.svEpoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.svEpoch] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun svEpoch(svEpoch: JsonField<OffsetDateTime>) = apply { this.svEpoch = svEpoch }

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

        /** Last reported x position of the object in km, in J2000 coordinates. */
        fun x(x: Double) = x(JsonField.of(x))

        /**
         * Sets [Builder.x] to an arbitrary JSON value.
         *
         * You should usually call [Builder.x] with a well-typed [Double] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun x(x: JsonField<Double>) = apply { this.x = x }

        /** Last reported x velocity of the object in km/sec, in J2000 coordinates. */
        fun xvel(xvel: Double) = xvel(JsonField.of(xvel))

        /**
         * Sets [Builder.xvel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xvel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun xvel(xvel: JsonField<Double>) = apply { this.xvel = xvel }

        /** Last reported y position of the object in km, in J2000 coordinates. */
        fun y(y: Double) = y(JsonField.of(y))

        /**
         * Sets [Builder.y] to an arbitrary JSON value.
         *
         * You should usually call [Builder.y] with a well-typed [Double] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun y(y: JsonField<Double>) = apply { this.y = y }

        /** Last reported y velocity of the object in km/sec, in J2000 coordinates. */
        fun yvel(yvel: Double) = yvel(JsonField.of(yvel))

        /**
         * Sets [Builder.yvel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yvel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yvel(yvel: JsonField<Double>) = apply { this.yvel = yvel }

        /** Last reported z position of the object in km, in J2000 coordinates. */
        fun z(z: Double) = z(JsonField.of(z))

        /**
         * Sets [Builder.z] to an arbitrary JSON value.
         *
         * You should usually call [Builder.z] with a well-typed [Double] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun z(z: JsonField<Double>) = apply { this.z = z }

        /** Last reported z velocity of the object in km/sec, in J2000 coordinates. */
        fun zvel(zvel: Double) = zvel(JsonField.of(zvel))

        /**
         * Sets [Builder.zvel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zvel] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zvel(zvel: JsonField<Double>) = apply { this.zvel = zvel }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [ObjectOfInterestTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idOnOrbit()
         * .sensorTaskingStartTime()
         * .source()
         * .statusDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectOfInterestTupleResponse =
            ObjectOfInterestTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idOnOrbit", idOnOrbit),
                checkRequired("sensorTaskingStartTime", sensorTaskingStartTime),
                checkRequired("source", source),
                checkRequired("statusDate", statusDate),
                id,
                (affectedObjects ?: JsonMissing.of()).map { it.toImmutable() },
                apogee,
                argOfPerigee,
                bStar,
                createdAt,
                createdBy,
                (deltaTs ?: JsonMissing.of()).map { it.toImmutable() },
                (deltaVs ?: JsonMissing.of()).map { it.toImmutable() },
                description,
                eccentricity,
                elsetEpoch,
                inclination,
                lastObTime,
                (manifolds ?: JsonMissing.of()).map { it.toImmutable() },
                meanAnomaly,
                meanMotion,
                meanMotionDDot,
                meanMotionDot,
                missedObTime,
                name,
                onOrbit,
                origin,
                origNetwork,
                perigee,
                period,
                priority,
                raan,
                revNo,
                satNo,
                semiMajorAxis,
                sensorTaskingStopTime,
                status,
                svEpoch,
                updatedAt,
                updatedBy,
                x,
                xvel,
                y,
                yvel,
                z,
                zvel,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectOfInterestTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idOnOrbit()
        sensorTaskingStartTime()
        source()
        statusDate()
        id()
        affectedObjects()
        apogee()
        argOfPerigee()
        bStar()
        createdAt()
        createdBy()
        deltaTs()
        deltaVs()
        description()
        eccentricity()
        elsetEpoch()
        inclination()
        lastObTime()
        manifolds().ifPresent { it.forEach { it.validate() } }
        meanAnomaly()
        meanMotion()
        meanMotionDDot()
        meanMotionDot()
        missedObTime()
        name()
        onOrbit().ifPresent { it.validate() }
        origin()
        origNetwork()
        perigee()
        period()
        priority()
        raan()
        revNo()
        satNo()
        semiMajorAxis()
        sensorTaskingStopTime()
        status()
        svEpoch()
        updatedAt()
        updatedBy()
        x()
        xvel()
        y()
        yvel()
        z()
        zvel()
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
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (sensorTaskingStartTime.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (statusDate.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (affectedObjects.asKnown().getOrNull()?.size ?: 0) +
            (if (apogee.asKnown().isPresent) 1 else 0) +
            (if (argOfPerigee.asKnown().isPresent) 1 else 0) +
            (if (bStar.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (deltaTs.asKnown().getOrNull()?.size ?: 0) +
            (deltaVs.asKnown().getOrNull()?.size ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (eccentricity.asKnown().isPresent) 1 else 0) +
            (if (elsetEpoch.asKnown().isPresent) 1 else 0) +
            (if (inclination.asKnown().isPresent) 1 else 0) +
            (if (lastObTime.asKnown().isPresent) 1 else 0) +
            (manifolds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (meanAnomaly.asKnown().isPresent) 1 else 0) +
            (if (meanMotion.asKnown().isPresent) 1 else 0) +
            (if (meanMotionDDot.asKnown().isPresent) 1 else 0) +
            (if (meanMotionDot.asKnown().isPresent) 1 else 0) +
            (if (missedObTime.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (onOrbit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (perigee.asKnown().isPresent) 1 else 0) +
            (if (period.asKnown().isPresent) 1 else 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (if (raan.asKnown().isPresent) 1 else 0) +
            (if (revNo.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (semiMajorAxis.asKnown().isPresent) 1 else 0) +
            (if (sensorTaskingStopTime.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (svEpoch.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (x.asKnown().isPresent) 1 else 0) +
            (if (xvel.asKnown().isPresent) 1 else 0) +
            (if (y.asKnown().isPresent) 1 else 0) +
            (if (yvel.asKnown().isPresent) 1 else 0) +
            (if (z.asKnown().isPresent) 1 else 0) +
            (if (zvel.asKnown().isPresent) 1 else 0)

    /**
     * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
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
     * A manifold represents a set of possible/theoretical orbits for an object of interest based on
     * a delta V and delta T.
     */
    class Manifold
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val idObjectOfInterest: JsonField<String>,
        private val source: JsonField<String>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val deltaT: JsonField<Double>,
        private val deltaV: JsonField<Double>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val status: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val updatedBy: JsonField<String>,
        private val weight: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode")
            @ExcludeMissing
            dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("idObjectOfInterest")
            @ExcludeMissing
            idObjectOfInterest: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("deltaT") @ExcludeMissing deltaT: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("deltaV") @ExcludeMissing deltaV: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedBy")
            @ExcludeMissing
            updatedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("weight") @ExcludeMissing weight: JsonField<Double> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            idObjectOfInterest,
            source,
            id,
            createdAt,
            createdBy,
            deltaT,
            deltaV,
            origin,
            origNetwork,
            status,
            updatedAt,
            updatedBy,
            weight,
            mutableMapOf(),
        )

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun classificationMarking(): String =
            classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * ID of the parent object of interest.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun idObjectOfInterest(): String = idObjectOfInterest.getRequired("idObjectOfInterest")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * Applied delta V duration for this manifold's calculations in seconds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deltaT(): Optional<Double> = deltaT.getOptional("deltaT")

        /**
         * Applied delta V for this manifold's calculations, in km/sec.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deltaV(): Optional<Double> = deltaV.getOptional("deltaV")

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * Status of the manifold and its associated ManifoldElsets (e.g. PENDING, COMPLETE).
         * PENDING status means element set generation is in progress and COMPLETE indicates all
         * ManifoldElsets have been generated.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * Read-only time the row was updated in the database, set automatically by the system on
         * update.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who last updated the row in the database, set by the system
         * automatically and ignored on create/edit operations.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * Weight or probability of this manifold for prioritization purposes, between 0 and 1.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun weight(): Optional<Double> = weight.getOptional("weight")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [idObjectOfInterest].
         *
         * Unlike [idObjectOfInterest], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("idObjectOfInterest")
        @ExcludeMissing
        fun _idObjectOfInterest(): JsonField<String> = idObjectOfInterest

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
         * Returns the raw JSON value of [deltaT].
         *
         * Unlike [deltaT], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaT") @ExcludeMissing fun _deltaT(): JsonField<Double> = deltaT

        /**
         * Returns the raw JSON value of [deltaV].
         *
         * Unlike [deltaV], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaV") @ExcludeMissing fun _deltaV(): JsonField<Double> = deltaV

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
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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
         * Returns the raw JSON value of [weight].
         *
         * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Double> = weight

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
             * Returns a mutable builder for constructing an instance of [Manifold].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .idObjectOfInterest()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Manifold]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var idObjectOfInterest: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var deltaT: JsonField<Double> = JsonMissing.of()
            private var deltaV: JsonField<Double> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var weight: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(manifold: Manifold) = apply {
                classificationMarking = manifold.classificationMarking
                dataMode = manifold.dataMode
                idObjectOfInterest = manifold.idObjectOfInterest
                source = manifold.source
                id = manifold.id
                createdAt = manifold.createdAt
                createdBy = manifold.createdBy
                deltaT = manifold.deltaT
                deltaV = manifold.deltaV
                origin = manifold.origin
                origNetwork = manifold.origNetwork
                status = manifold.status
                updatedAt = manifold.updatedAt
                updatedBy = manifold.updatedBy
                weight = manifold.weight
                additionalProperties = manifold.additionalProperties.toMutableMap()
            }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) =
                classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) = apply {
                this.classificationMarking = classificationMarking
            }

            /**
             * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

            /** ID of the parent object of interest. */
            fun idObjectOfInterest(idObjectOfInterest: String) =
                idObjectOfInterest(JsonField.of(idObjectOfInterest))

            /**
             * Sets [Builder.idObjectOfInterest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idObjectOfInterest] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idObjectOfInterest(idObjectOfInterest: JsonField<String>) = apply {
                this.idObjectOfInterest = idObjectOfInterest
            }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Application user who created the row in the database, auto-populated by the system.
             */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** Applied delta V duration for this manifold's calculations in seconds. */
            fun deltaT(deltaT: Double) = deltaT(JsonField.of(deltaT))

            /**
             * Sets [Builder.deltaT] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaT] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaT(deltaT: JsonField<Double>) = apply { this.deltaT = deltaT }

            /** Applied delta V for this manifold's calculations, in km/sec. */
            fun deltaV(deltaV: Double) = deltaV(JsonField.of(deltaV))

            /**
             * Sets [Builder.deltaV] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaV] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaV(deltaV: JsonField<Double>) = apply { this.deltaV = deltaV }

            /**
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) = apply {
                this.origNetwork = origNetwork
            }

            /**
             * Status of the manifold and its associated ManifoldElsets (e.g. PENDING, COMPLETE).
             * PENDING status means element set generation is in progress and COMPLETE indicates all
             * ManifoldElsets have been generated.
             */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /**
             * Read-only time the row was updated in the database, set automatically by the system
             * on update.
             */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Application user who last updated the row in the database, set by the system
             * automatically and ignored on create/edit operations.
             */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

            /**
             * Weight or probability of this manifold for prioritization purposes, between 0 and 1.
             */
            fun weight(weight: Double) = weight(JsonField.of(weight))

            /**
             * Sets [Builder.weight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.weight] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun weight(weight: JsonField<Double>) = apply { this.weight = weight }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Manifold].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .idObjectOfInterest()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Manifold =
                Manifold(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("idObjectOfInterest", idObjectOfInterest),
                    checkRequired("source", source),
                    id,
                    createdAt,
                    createdBy,
                    deltaT,
                    deltaV,
                    origin,
                    origNetwork,
                    status,
                    updatedAt,
                    updatedBy,
                    weight,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Manifold = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            idObjectOfInterest()
            source()
            id()
            createdAt()
            createdBy()
            deltaT()
            deltaV()
            origin()
            origNetwork()
            status()
            updatedAt()
            updatedBy()
            weight()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (idObjectOfInterest.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (deltaT.asKnown().isPresent) 1 else 0) +
                (if (deltaV.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0) +
                (if (weight.asKnown().isPresent) 1 else 0)

        /**
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         */
        class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REAL,
                TEST,
                SIMULATED,
                EXERCISE,
                /**
                 * An enum member indicating that [DataMode] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Manifold &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                idObjectOfInterest == other.idObjectOfInterest &&
                source == other.source &&
                id == other.id &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                deltaT == other.deltaT &&
                deltaV == other.deltaV &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy &&
                weight == other.weight &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                idObjectOfInterest,
                source,
                id,
                createdAt,
                createdBy,
                deltaT,
                deltaV,
                origin,
                origNetwork,
                status,
                updatedAt,
                updatedBy,
                weight,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Manifold{classificationMarking=$classificationMarking, dataMode=$dataMode, idObjectOfInterest=$idObjectOfInterest, source=$source, id=$id, createdAt=$createdAt, createdBy=$createdBy, deltaT=$deltaT, deltaV=$deltaV, origin=$origin, origNetwork=$origNetwork, status=$status, updatedAt=$updatedAt, updatedBy=$updatedBy, weight=$weight, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectOfInterestTupleResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            idOnOrbit == other.idOnOrbit &&
            sensorTaskingStartTime == other.sensorTaskingStartTime &&
            source == other.source &&
            statusDate == other.statusDate &&
            id == other.id &&
            affectedObjects == other.affectedObjects &&
            apogee == other.apogee &&
            argOfPerigee == other.argOfPerigee &&
            bStar == other.bStar &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            deltaTs == other.deltaTs &&
            deltaVs == other.deltaVs &&
            description == other.description &&
            eccentricity == other.eccentricity &&
            elsetEpoch == other.elsetEpoch &&
            inclination == other.inclination &&
            lastObTime == other.lastObTime &&
            manifolds == other.manifolds &&
            meanAnomaly == other.meanAnomaly &&
            meanMotion == other.meanMotion &&
            meanMotionDDot == other.meanMotionDDot &&
            meanMotionDot == other.meanMotionDot &&
            missedObTime == other.missedObTime &&
            name == other.name &&
            onOrbit == other.onOrbit &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            perigee == other.perigee &&
            period == other.period &&
            priority == other.priority &&
            raan == other.raan &&
            revNo == other.revNo &&
            satNo == other.satNo &&
            semiMajorAxis == other.semiMajorAxis &&
            sensorTaskingStopTime == other.sensorTaskingStopTime &&
            status == other.status &&
            svEpoch == other.svEpoch &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            x == other.x &&
            xvel == other.xvel &&
            y == other.y &&
            yvel == other.yvel &&
            z == other.z &&
            zvel == other.zvel &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            idOnOrbit,
            sensorTaskingStartTime,
            source,
            statusDate,
            id,
            affectedObjects,
            apogee,
            argOfPerigee,
            bStar,
            createdAt,
            createdBy,
            deltaTs,
            deltaVs,
            description,
            eccentricity,
            elsetEpoch,
            inclination,
            lastObTime,
            manifolds,
            meanAnomaly,
            meanMotion,
            meanMotionDDot,
            meanMotionDot,
            missedObTime,
            name,
            onOrbit,
            origin,
            origNetwork,
            perigee,
            period,
            priority,
            raan,
            revNo,
            satNo,
            semiMajorAxis,
            sensorTaskingStopTime,
            status,
            svEpoch,
            updatedAt,
            updatedBy,
            x,
            xvel,
            y,
            yvel,
            z,
            zvel,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectOfInterestTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, idOnOrbit=$idOnOrbit, sensorTaskingStartTime=$sensorTaskingStartTime, source=$source, statusDate=$statusDate, id=$id, affectedObjects=$affectedObjects, apogee=$apogee, argOfPerigee=$argOfPerigee, bStar=$bStar, createdAt=$createdAt, createdBy=$createdBy, deltaTs=$deltaTs, deltaVs=$deltaVs, description=$description, eccentricity=$eccentricity, elsetEpoch=$elsetEpoch, inclination=$inclination, lastObTime=$lastObTime, manifolds=$manifolds, meanAnomaly=$meanAnomaly, meanMotion=$meanMotion, meanMotionDDot=$meanMotionDDot, meanMotionDot=$meanMotionDot, missedObTime=$missedObTime, name=$name, onOrbit=$onOrbit, origin=$origin, origNetwork=$origNetwork, perigee=$perigee, period=$period, priority=$priority, raan=$raan, revNo=$revNo, satNo=$satNo, semiMajorAxis=$semiMajorAxis, sensorTaskingStopTime=$sensorTaskingStopTime, status=$status, svEpoch=$svEpoch, updatedAt=$updatedAt, updatedBy=$updatedBy, x=$x, xvel=$xvel, y=$y, yvel=$yvel, z=$z, zvel=$zvel, additionalProperties=$additionalProperties}"
}

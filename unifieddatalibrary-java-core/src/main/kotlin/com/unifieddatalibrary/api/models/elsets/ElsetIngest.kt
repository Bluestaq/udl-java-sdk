// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.elsets

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * An element set is a collection of Keplerian orbital elements describing an orbit of a particular
 * satellite. The data is used along with an orbit propagator in order to predict the motion of a
 * satellite. The element set, or elset for short, consists of identification data, the classical
 * elements and drag parameters.
 */
class ElsetIngest
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val epoch: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val agom: JsonField<Double>,
    private val algorithm: JsonField<String>,
    private val apogee: JsonField<Double>,
    private val argOfPerigee: JsonField<Double>,
    private val ballisticCoeff: JsonField<Double>,
    private val bStar: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val eccentricity: JsonField<Double>,
    private val ephemType: JsonField<Long>,
    private val idElset: JsonField<String>,
    private val idOnOrbit: JsonField<String>,
    private val idOrbitDetermination: JsonField<String>,
    private val inclination: JsonField<Double>,
    private val line1: JsonField<String>,
    private val line2: JsonField<String>,
    private val meanAnomaly: JsonField<Double>,
    private val meanMotion: JsonField<Double>,
    private val meanMotionDDot: JsonField<Double>,
    private val meanMotionDot: JsonField<Double>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val perigee: JsonField<Double>,
    private val period: JsonField<Double>,
    private val raan: JsonField<Double>,
    private val rawFileUri: JsonField<String>,
    private val revNo: JsonField<Int>,
    private val satNo: JsonField<Int>,
    private val semiMajorAxis: JsonField<Double>,
    private val sourcedData: JsonField<List<String>>,
    private val sourcedDataTypes: JsonField<List<SourcedDataType>>,
    private val sourceDl: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val transactionId: JsonField<String>,
    private val uct: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("epoch") @ExcludeMissing epoch: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agom") @ExcludeMissing agom: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("algorithm") @ExcludeMissing algorithm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("apogee") @ExcludeMissing apogee: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("argOfPerigee")
        @ExcludeMissing
        argOfPerigee: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ballisticCoeff")
        @ExcludeMissing
        ballisticCoeff: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bStar") @ExcludeMissing bStar: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eccentricity")
        @ExcludeMissing
        eccentricity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ephemType") @ExcludeMissing ephemType: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("idElset") @ExcludeMissing idElset: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOrbitDetermination")
        @ExcludeMissing
        idOrbitDetermination: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inclination")
        @ExcludeMissing
        inclination: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("perigee") @ExcludeMissing perigee: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("period") @ExcludeMissing period: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("raan") @ExcludeMissing raan: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rawFileURI")
        @ExcludeMissing
        rawFileUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revNo") @ExcludeMissing revNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("semiMajorAxis")
        @ExcludeMissing
        semiMajorAxis: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sourcedData")
        @ExcludeMissing
        sourcedData: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("sourcedDataTypes")
        @ExcludeMissing
        sourcedDataTypes: JsonField<List<SourcedDataType>> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uct") @ExcludeMissing uct: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        epoch,
        source,
        agom,
        algorithm,
        apogee,
        argOfPerigee,
        ballisticCoeff,
        bStar,
        createdAt,
        createdBy,
        descriptor,
        eccentricity,
        ephemType,
        idElset,
        idOnOrbit,
        idOrbitDetermination,
        inclination,
        line1,
        line2,
        meanAnomaly,
        meanMotion,
        meanMotionDDot,
        meanMotionDot,
        origin,
        origNetwork,
        origObjectId,
        perigee,
        period,
        raan,
        rawFileUri,
        revNo,
        satNo,
        semiMajorAxis,
        sourcedData,
        sourcedDataTypes,
        sourceDl,
        tags,
        transactionId,
        uct,
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
     * Elset epoch time in ISO 8601 UTC format, with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun epoch(): OffsetDateTime = epoch.getRequired("epoch")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * AGOM, expressed in m^2/kg, is the value of the (averaged) object Area times the solar
     * radiation pressure coefficient(Gamma) over the object Mass. Applicable only with ephemType4.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun agom(): Optional<Double> = agom.getOptional("agom")

    /**
     * Optional algorithm used to produce this record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun algorithm(): Optional<String> = algorithm.getOptional("algorithm")

    /**
     * The orbit point furthest from the center of the earth in kilometers. If not provided, apogee
     * will be computed from the TLE according to the following. Using mu, the standard
     * gravitational parameter for the earth (398600.4418), semi-major axis A = (mu/(n * 2 *
     * pi/(24*3600))^2)(1/3). Using semi-major axis A, eccentricity E, apogee = (A * (1 + E)) in km.
     * Note that the calculations are for computing the apogee radius from the center of the earth,
     * to compute apogee altitude the radius of the earth should be subtracted (6378.135 km).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun apogee(): Optional<Double> = apogee.getOptional("apogee")

    /**
     * The argument of perigee is the angle in degrees formed between the perigee and the ascending
     * node. If the perigee would occur at the ascending node, the argument of perigee would be 0.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun argOfPerigee(): Optional<Double> = argOfPerigee.getOptional("argOfPerigee")

    /**
     * Ballistic coefficient, in m^2/kg. Applicable only with ephemType4.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ballisticCoeff(): Optional<Double> = ballisticCoeff.getOptional("ballisticCoeff")

    /**
     * The drag term for SGP4 orbital model, used for calculating decay constants for altitude,
     * eccentricity etc, measured in inverse earth radii.
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
     * Optional source-provided and searchable metadata or descriptor of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun descriptor(): Optional<String> = descriptor.getOptional("descriptor")

    /**
     * The orbital eccentricity of an astronomical object is a parameter that determines the amount
     * by which its orbit around another body deviates from a perfect circle. A value of 0 is a
     * circular orbit, values between 0 and 1 form an elliptic orbit, 1 is a parabolic escape orbit,
     * and greater than 1 is a hyperbolic escape orbit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eccentricity(): Optional<Double> = eccentricity.getOptional("eccentricity")

    /**
     * The ephemeris type associated with this TLE:
     *
     * 0:&nbsp;SGP (or SGP4 with Kozai mean motion)
     *
     * 1:&nbsp;SGP (Kozai mean motion)
     *
     * 2:&nbsp;SGP4 (Brouver mean motion)
     *
     * 3:&nbsp;SDP4
     *
     * 4:&nbsp;SGP4-XP
     *
     * 5:&nbsp;SDP8
     *
     * 6:&nbsp;SP (osculating mean motion)
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ephemType(): Optional<Long> = ephemType.getOptional("ephemType")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idElset(): Optional<String> = idElset.getOptional("idElset")

    /**
     * Unique identifier of the satellite on-orbit object, if correlated. For the public catalog,
     * the idOnOrbit is typically the satellite number as a string, but may be a UUID for analyst or
     * other unknown or untracked satellites.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Unique identifier of the OD solution record that produced this elset. This ID can be used to
     * obtain additional information on an OrbitDetermination object using the 'get by ID' operation
     * (e.g. /udl/orbitdetermination/{id}). For example, the OrbitDetermination with
     * idOrbitDetermination = abc would be queried as /udl/orbitdetermination/abc.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOrbitDetermination(): Optional<String> =
        idOrbitDetermination.getOptional("idOrbitDetermination")

    /**
     * The angle between the equator and the orbit when looking from the center of the Earth. If the
     * orbit went exactly around the equator from left to right, then the inclination would be 0.
     * The inclination ranges from 0 to 180 degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun inclination(): Optional<Double> = inclination.getOptional("inclination")

    /**
     * Read only derived/generated line1 of a legacy TLE (two line element set) format, ignored on
     * create/edit operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun line1(): Optional<String> = line1.getOptional("line1")

    /**
     * Read only derived/generated line2 of a legacy TLE (two line element set) format, ignored on
     * create/edit operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun line2(): Optional<String> = line2.getOptional("line2")

    /**
     * Where the satellite is in its orbital path. The mean anomaly ranges from 0 to 360 degrees.
     * The mean anomaly is referenced to the perigee. If the satellite were at the perigee, the mean
     * anomaly would be 0.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun meanAnomaly(): Optional<Double> = meanAnomaly.getOptional("meanAnomaly")

    /**
     * Mean motion is the angular speed required for a body to complete one orbit, assuming constant
     * speed in a circular orbit which completes in the same time as the variable speed, elliptical
     * orbit of the actual body. Measured in revolutions per day.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun meanMotion(): Optional<Double> = meanMotion.getOptional("meanMotion")

    /**
     * 2nd derivative of the mean motion with respect to time. Units are revolutions per day cubed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun meanMotionDDot(): Optional<Double> = meanMotionDDot.getOptional("meanMotionDDot")

    /**
     * 1st derivative of the mean motion with respect to time. Units are revolutions per day
     * squared.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun meanMotionDot(): Optional<Double> = meanMotionDot.getOptional("meanMotionDot")

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
     * Optional identifier provided by elset source to indicate the target onorbit object of this
     * elset. This may be an internal identifier and not necessarily map to a valid satellite
     * number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * The orbit point nearest to the center of the earth in kilometers. If not provided, perigee
     * will be computed from the TLE according to the following. Using mu, the standard
     * gravitational parameter for the earth (398600.4418), semi-major axis A = (mu/(n * 2 *
     * pi/(24*3600))^2)(1/3). Using semi-major axis A, eccentricity E, perigee = (A * (1 - E)) in
     * km. Note that the calculations are for computing the perigee radius from the center of the
     * earth, to compute perigee altitude the radius of the earth should be subtracted (6378.135
     * km).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun perigee(): Optional<Double> = perigee.getOptional("perigee")

    /**
     * Period of the orbit equal to inverse of mean motion, in minutes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun period(): Optional<Double> = period.getOptional("period")

    /**
     * Right ascension of the ascending node, or RAAN is the angle as measured in degrees eastwards
     * (or, as seen from the north, counterclockwise) from the First Point of Aries to the ascending
     * node, which is where the orbit crosses the equator when traveling north.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun raan(): Optional<Double> = raan.getOptional("raan")

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
     * The current revolution number. The value is incremented when a satellite crosses the equator
     * on an ascending pass.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun revNo(): Optional<Int> = revNo.getOptional("revNo")

    /**
     * Satellite/catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * The sum of the periapsis and apoapsis distances divided by two. For circular orbits, the
     * semimajor axis is the distance between the centers of the bodies, not the distance of the
     * bodies from the center of mass. Units are kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun semiMajorAxis(): Optional<Double> = semiMajorAxis.getOptional("semiMajorAxis")

    /**
     * Optional array of UDL data (observation) UUIDs used to build this element set. See the
     * associated sourcedDataTypes array for the specific types of observations for the positionally
     * corresponding UUIDs in this array (the two arrays must match in size).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourcedData(): Optional<List<String>> = sourcedData.getOptional("sourcedData")

    /**
     * Optional array of UDL observation data types used to build this element set (e.g. EO, RADAR,
     * RF, DOA). See the associated sourcedData array for the specific UUIDs of observations for the
     * positionally corresponding data types in this array (the two arrays must match in size).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourcedDataTypes(): Optional<List<SourcedDataType>> =
        sourcedDataTypes.getOptional("sourcedDataTypes")

    /**
     * The source data library from which this record was received. This could be a remote or
     * tactical UDL or another data library. If null, the record should be assumed to have
     * originated from the primary Enterprise UDL.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

    /**
     * Optional array of provider/source specific tags for this data, where each element is no
     * longer than 32 characters, used for implementing data owner conditional access controls to
     * restrict access to the data. Should be left null by data providers unless conditional access
     * controls are coordinated with the UDL team.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Optional identifier to track a commercial or marketplace transaction executed to produce this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

    /**
     * Boolean indicating this Elset was unable to be correlated to a known object. This flag should
     * only be set to true by data providers after an attempt to correlate to an on-orbit object was
     * made and failed. If unable to correlate, the 'origObjectId' field may be populated with an
     * internal data provider specific identifier.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun uct(): Optional<Boolean> = uct.getOptional("uct")

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
     * Returns the raw JSON value of [epoch].
     *
     * Unlike [epoch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("epoch") @ExcludeMissing fun _epoch(): JsonField<OffsetDateTime> = epoch

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [agom].
     *
     * Unlike [agom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agom") @ExcludeMissing fun _agom(): JsonField<Double> = agom

    /**
     * Returns the raw JSON value of [algorithm].
     *
     * Unlike [algorithm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("algorithm") @ExcludeMissing fun _algorithm(): JsonField<String> = algorithm

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
     * Returns the raw JSON value of [ballisticCoeff].
     *
     * Unlike [ballisticCoeff], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ballisticCoeff")
    @ExcludeMissing
    fun _ballisticCoeff(): JsonField<Double> = ballisticCoeff

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
     * Returns the raw JSON value of [descriptor].
     *
     * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor(): JsonField<String> = descriptor

    /**
     * Returns the raw JSON value of [eccentricity].
     *
     * Unlike [eccentricity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eccentricity")
    @ExcludeMissing
    fun _eccentricity(): JsonField<Double> = eccentricity

    /**
     * Returns the raw JSON value of [ephemType].
     *
     * Unlike [ephemType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ephemType") @ExcludeMissing fun _ephemType(): JsonField<Long> = ephemType

    /**
     * Returns the raw JSON value of [idElset].
     *
     * Unlike [idElset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idElset") @ExcludeMissing fun _idElset(): JsonField<String> = idElset

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [idOrbitDetermination].
     *
     * Unlike [idOrbitDetermination], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("idOrbitDetermination")
    @ExcludeMissing
    fun _idOrbitDetermination(): JsonField<String> = idOrbitDetermination

    /**
     * Returns the raw JSON value of [inclination].
     *
     * Unlike [inclination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inclination") @ExcludeMissing fun _inclination(): JsonField<Double> = inclination

    /**
     * Returns the raw JSON value of [line1].
     *
     * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

    /**
     * Returns the raw JSON value of [line2].
     *
     * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
     * Returns the raw JSON value of [origObjectId].
     *
     * Unlike [origObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origObjectId")
    @ExcludeMissing
    fun _origObjectId(): JsonField<String> = origObjectId

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
     * Returns the raw JSON value of [raan].
     *
     * Unlike [raan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("raan") @ExcludeMissing fun _raan(): JsonField<Double> = raan

    /**
     * Returns the raw JSON value of [rawFileUri].
     *
     * Unlike [rawFileUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rawFileURI") @ExcludeMissing fun _rawFileUri(): JsonField<String> = rawFileUri

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
     * Returns the raw JSON value of [sourcedData].
     *
     * Unlike [sourcedData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourcedData")
    @ExcludeMissing
    fun _sourcedData(): JsonField<List<String>> = sourcedData

    /**
     * Returns the raw JSON value of [sourcedDataTypes].
     *
     * Unlike [sourcedDataTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sourcedDataTypes")
    @ExcludeMissing
    fun _sourcedDataTypes(): JsonField<List<SourcedDataType>> = sourcedDataTypes

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [uct].
     *
     * Unlike [uct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uct") @ExcludeMissing fun _uct(): JsonField<Boolean> = uct

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
         * Returns a mutable builder for constructing an instance of [ElsetIngest].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .epoch()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ElsetIngest]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var epoch: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var agom: JsonField<Double> = JsonMissing.of()
        private var algorithm: JsonField<String> = JsonMissing.of()
        private var apogee: JsonField<Double> = JsonMissing.of()
        private var argOfPerigee: JsonField<Double> = JsonMissing.of()
        private var ballisticCoeff: JsonField<Double> = JsonMissing.of()
        private var bStar: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var eccentricity: JsonField<Double> = JsonMissing.of()
        private var ephemType: JsonField<Long> = JsonMissing.of()
        private var idElset: JsonField<String> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var idOrbitDetermination: JsonField<String> = JsonMissing.of()
        private var inclination: JsonField<Double> = JsonMissing.of()
        private var line1: JsonField<String> = JsonMissing.of()
        private var line2: JsonField<String> = JsonMissing.of()
        private var meanAnomaly: JsonField<Double> = JsonMissing.of()
        private var meanMotion: JsonField<Double> = JsonMissing.of()
        private var meanMotionDDot: JsonField<Double> = JsonMissing.of()
        private var meanMotionDot: JsonField<Double> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var perigee: JsonField<Double> = JsonMissing.of()
        private var period: JsonField<Double> = JsonMissing.of()
        private var raan: JsonField<Double> = JsonMissing.of()
        private var rawFileUri: JsonField<String> = JsonMissing.of()
        private var revNo: JsonField<Int> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var semiMajorAxis: JsonField<Double> = JsonMissing.of()
        private var sourcedData: JsonField<MutableList<String>>? = null
        private var sourcedDataTypes: JsonField<MutableList<SourcedDataType>>? = null
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var uct: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(elsetIngest: ElsetIngest) = apply {
            classificationMarking = elsetIngest.classificationMarking
            dataMode = elsetIngest.dataMode
            epoch = elsetIngest.epoch
            source = elsetIngest.source
            agom = elsetIngest.agom
            algorithm = elsetIngest.algorithm
            apogee = elsetIngest.apogee
            argOfPerigee = elsetIngest.argOfPerigee
            ballisticCoeff = elsetIngest.ballisticCoeff
            bStar = elsetIngest.bStar
            createdAt = elsetIngest.createdAt
            createdBy = elsetIngest.createdBy
            descriptor = elsetIngest.descriptor
            eccentricity = elsetIngest.eccentricity
            ephemType = elsetIngest.ephemType
            idElset = elsetIngest.idElset
            idOnOrbit = elsetIngest.idOnOrbit
            idOrbitDetermination = elsetIngest.idOrbitDetermination
            inclination = elsetIngest.inclination
            line1 = elsetIngest.line1
            line2 = elsetIngest.line2
            meanAnomaly = elsetIngest.meanAnomaly
            meanMotion = elsetIngest.meanMotion
            meanMotionDDot = elsetIngest.meanMotionDDot
            meanMotionDot = elsetIngest.meanMotionDot
            origin = elsetIngest.origin
            origNetwork = elsetIngest.origNetwork
            origObjectId = elsetIngest.origObjectId
            perigee = elsetIngest.perigee
            period = elsetIngest.period
            raan = elsetIngest.raan
            rawFileUri = elsetIngest.rawFileUri
            revNo = elsetIngest.revNo
            satNo = elsetIngest.satNo
            semiMajorAxis = elsetIngest.semiMajorAxis
            sourcedData = elsetIngest.sourcedData.map { it.toMutableList() }
            sourcedDataTypes = elsetIngest.sourcedDataTypes.map { it.toMutableList() }
            sourceDl = elsetIngest.sourceDl
            tags = elsetIngest.tags.map { it.toMutableList() }
            transactionId = elsetIngest.transactionId
            uct = elsetIngest.uct
            additionalProperties = elsetIngest.additionalProperties.toMutableMap()
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

        /** Elset epoch time in ISO 8601 UTC format, with microsecond precision. */
        fun epoch(epoch: OffsetDateTime) = epoch(JsonField.of(epoch))

        /**
         * Sets [Builder.epoch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.epoch] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun epoch(epoch: JsonField<OffsetDateTime>) = apply { this.epoch = epoch }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /**
         * AGOM, expressed in m^2/kg, is the value of the (averaged) object Area times the solar
         * radiation pressure coefficient(Gamma) over the object Mass. Applicable only with
         * ephemType4.
         */
        fun agom(agom: Double) = agom(JsonField.of(agom))

        /**
         * Sets [Builder.agom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agom] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agom(agom: JsonField<Double>) = apply { this.agom = agom }

        /** Optional algorithm used to produce this record. */
        fun algorithm(algorithm: String) = algorithm(JsonField.of(algorithm))

        /**
         * Sets [Builder.algorithm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.algorithm] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun algorithm(algorithm: JsonField<String>) = apply { this.algorithm = algorithm }

        /**
         * The orbit point furthest from the center of the earth in kilometers. If not provided,
         * apogee will be computed from the TLE according to the following. Using mu, the standard
         * gravitational parameter for the earth (398600.4418), semi-major axis A = (mu/(n * 2 *
         * pi/(24*3600))^2)(1/3). Using semi-major axis A, eccentricity E, apogee = (A * (1 + E)) in
         * km. Note that the calculations are for computing the apogee radius from the center of the
         * earth, to compute apogee altitude the radius of the earth should be subtracted (6378.135
         * km).
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
         * The argument of perigee is the angle in degrees formed between the perigee and the
         * ascending node. If the perigee would occur at the ascending node, the argument of perigee
         * would be 0.
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

        /** Ballistic coefficient, in m^2/kg. Applicable only with ephemType4. */
        fun ballisticCoeff(ballisticCoeff: Double) = ballisticCoeff(JsonField.of(ballisticCoeff))

        /**
         * Sets [Builder.ballisticCoeff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ballisticCoeff] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ballisticCoeff(ballisticCoeff: JsonField<Double>) = apply {
            this.ballisticCoeff = ballisticCoeff
        }

        /**
         * The drag term for SGP4 orbital model, used for calculating decay constants for altitude,
         * eccentricity etc, measured in inverse earth radii.
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

        /** Optional source-provided and searchable metadata or descriptor of the data. */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * Sets [Builder.descriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.descriptor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        /**
         * The orbital eccentricity of an astronomical object is a parameter that determines the
         * amount by which its orbit around another body deviates from a perfect circle. A value of
         * 0 is a circular orbit, values between 0 and 1 form an elliptic orbit, 1 is a parabolic
         * escape orbit, and greater than 1 is a hyperbolic escape orbit.
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

        /**
         * The ephemeris type associated with this TLE:
         *
         * 0:&nbsp;SGP (or SGP4 with Kozai mean motion)
         *
         * 1:&nbsp;SGP (Kozai mean motion)
         *
         * 2:&nbsp;SGP4 (Brouver mean motion)
         *
         * 3:&nbsp;SDP4
         *
         * 4:&nbsp;SGP4-XP
         *
         * 5:&nbsp;SDP8
         *
         * 6:&nbsp;SP (osculating mean motion)
         */
        fun ephemType(ephemType: Long) = ephemType(JsonField.of(ephemType))

        /**
         * Sets [Builder.ephemType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ephemType] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ephemType(ephemType: JsonField<Long>) = apply { this.ephemType = ephemType }

        /** Unique identifier of the record, auto-generated by the system. */
        fun idElset(idElset: String) = idElset(JsonField.of(idElset))

        /**
         * Sets [Builder.idElset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idElset] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idElset(idElset: JsonField<String>) = apply { this.idElset = idElset }

        /**
         * Unique identifier of the satellite on-orbit object, if correlated. For the public
         * catalog, the idOnOrbit is typically the satellite number as a string, but may be a UUID
         * for analyst or other unknown or untracked satellites.
         */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /**
         * Unique identifier of the OD solution record that produced this elset. This ID can be used
         * to obtain additional information on an OrbitDetermination object using the 'get by ID'
         * operation (e.g. /udl/orbitdetermination/{id}). For example, the OrbitDetermination with
         * idOrbitDetermination = abc would be queried as /udl/orbitdetermination/abc.
         */
        fun idOrbitDetermination(idOrbitDetermination: String) =
            idOrbitDetermination(JsonField.of(idOrbitDetermination))

        /**
         * Sets [Builder.idOrbitDetermination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOrbitDetermination] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idOrbitDetermination(idOrbitDetermination: JsonField<String>) = apply {
            this.idOrbitDetermination = idOrbitDetermination
        }

        /**
         * The angle between the equator and the orbit when looking from the center of the Earth. If
         * the orbit went exactly around the equator from left to right, then the inclination would
         * be 0. The inclination ranges from 0 to 180 degrees.
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

        /**
         * Read only derived/generated line1 of a legacy TLE (two line element set) format, ignored
         * on create/edit operations.
         */
        fun line1(line1: String) = line1(JsonField.of(line1))

        /**
         * Sets [Builder.line1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.line1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

        /**
         * Read only derived/generated line2 of a legacy TLE (two line element set) format, ignored
         * on create/edit operations.
         */
        fun line2(line2: String) = line2(JsonField.of(line2))

        /**
         * Sets [Builder.line2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.line2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

        /**
         * Where the satellite is in its orbital path. The mean anomaly ranges from 0 to 360
         * degrees. The mean anomaly is referenced to the perigee. If the satellite were at the
         * perigee, the mean anomaly would be 0.
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
         * Mean motion is the angular speed required for a body to complete one orbit, assuming
         * constant speed in a circular orbit which completes in the same time as the variable
         * speed, elliptical orbit of the actual body. Measured in revolutions per day.
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
         * 2nd derivative of the mean motion with respect to time. Units are revolutions per day
         * cubed.
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
         * 1st derivative of the mean motion with respect to time. Units are revolutions per day
         * squared.
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
         * Optional identifier provided by elset source to indicate the target onorbit object of
         * this elset. This may be an internal identifier and not necessarily map to a valid
         * satellite number.
         */
        fun origObjectId(origObjectId: String) = origObjectId(JsonField.of(origObjectId))

        /**
         * Sets [Builder.origObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origObjectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun origObjectId(origObjectId: JsonField<String>) = apply {
            this.origObjectId = origObjectId
        }

        /**
         * The orbit point nearest to the center of the earth in kilometers. If not provided,
         * perigee will be computed from the TLE according to the following. Using mu, the standard
         * gravitational parameter for the earth (398600.4418), semi-major axis A = (mu/(n * 2 *
         * pi/(24*3600))^2)(1/3). Using semi-major axis A, eccentricity E, perigee = (A * (1 - E))
         * in km. Note that the calculations are for computing the perigee radius from the center of
         * the earth, to compute perigee altitude the radius of the earth should be subtracted
         * (6378.135 km).
         */
        fun perigee(perigee: Double) = perigee(JsonField.of(perigee))

        /**
         * Sets [Builder.perigee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perigee] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun perigee(perigee: JsonField<Double>) = apply { this.perigee = perigee }

        /** Period of the orbit equal to inverse of mean motion, in minutes. */
        fun period(period: Double) = period(JsonField.of(period))

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun period(period: JsonField<Double>) = apply { this.period = period }

        /**
         * Right ascension of the ascending node, or RAAN is the angle as measured in degrees
         * eastwards (or, as seen from the north, counterclockwise) from the First Point of Aries to
         * the ascending node, which is where the orbit crosses the equator when traveling north.
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

        /**
         * The current revolution number. The value is incremented when a satellite crosses the
         * equator on an ascending pass.
         */
        fun revNo(revNo: Int) = revNo(JsonField.of(revNo))

        /**
         * Sets [Builder.revNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun revNo(revNo: JsonField<Int>) = apply { this.revNo = revNo }

        /** Satellite/catalog number of the target on-orbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /**
         * The sum of the periapsis and apoapsis distances divided by two. For circular orbits, the
         * semimajor axis is the distance between the centers of the bodies, not the distance of the
         * bodies from the center of mass. Units are kilometers.
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

        /**
         * Optional array of UDL data (observation) UUIDs used to build this element set. See the
         * associated sourcedDataTypes array for the specific types of observations for the
         * positionally corresponding UUIDs in this array (the two arrays must match in size).
         */
        fun sourcedData(sourcedData: List<String>) = sourcedData(JsonField.of(sourcedData))

        /**
         * Sets [Builder.sourcedData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourcedData] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourcedData(sourcedData: JsonField<List<String>>) = apply {
            this.sourcedData = sourcedData.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.sourcedData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSourcedData(sourcedData: String) = apply {
            this.sourcedData =
                (this.sourcedData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sourcedData", it).add(sourcedData)
                }
        }

        /**
         * Optional array of UDL observation data types used to build this element set (e.g. EO,
         * RADAR, RF, DOA). See the associated sourcedData array for the specific UUIDs of
         * observations for the positionally corresponding data types in this array (the two arrays
         * must match in size).
         */
        fun sourcedDataTypes(sourcedDataTypes: List<SourcedDataType>) =
            sourcedDataTypes(JsonField.of(sourcedDataTypes))

        /**
         * Sets [Builder.sourcedDataTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourcedDataTypes] with a well-typed
         * `List<SourcedDataType>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun sourcedDataTypes(sourcedDataTypes: JsonField<List<SourcedDataType>>) = apply {
            this.sourcedDataTypes = sourcedDataTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [SourcedDataType] to [sourcedDataTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSourcedDataType(sourcedDataType: SourcedDataType) = apply {
            sourcedDataTypes =
                (sourcedDataTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sourcedDataTypes", it).add(sourcedDataType)
                }
        }

        /**
         * The source data library from which this record was received. This could be a remote or
         * tactical UDL or another data library. If null, the record should be assumed to have
         * originated from the primary Enterprise UDL.
         */
        fun sourceDl(sourceDl: String) = sourceDl(JsonField.of(sourceDl))

        /**
         * Sets [Builder.sourceDl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceDl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceDl(sourceDl: JsonField<String>) = apply { this.sourceDl = sourceDl }

        /**
         * Optional array of provider/source specific tags for this data, where each element is no
         * longer than 32 characters, used for implementing data owner conditional access controls
         * to restrict access to the data. Should be left null by data providers unless conditional
         * access controls are coordinated with the UDL team.
         */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /**
         * Optional identifier to track a commercial or marketplace transaction executed to produce
         * this data.
         */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * Boolean indicating this Elset was unable to be correlated to a known object. This flag
         * should only be set to true by data providers after an attempt to correlate to an on-orbit
         * object was made and failed. If unable to correlate, the 'origObjectId' field may be
         * populated with an internal data provider specific identifier.
         */
        fun uct(uct: Boolean) = uct(JsonField.of(uct))

        /**
         * Sets [Builder.uct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uct] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uct(uct: JsonField<Boolean>) = apply { this.uct = uct }

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
         * Returns an immutable instance of [ElsetIngest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .epoch()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ElsetIngest =
            ElsetIngest(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("epoch", epoch),
                checkRequired("source", source),
                agom,
                algorithm,
                apogee,
                argOfPerigee,
                ballisticCoeff,
                bStar,
                createdAt,
                createdBy,
                descriptor,
                eccentricity,
                ephemType,
                idElset,
                idOnOrbit,
                idOrbitDetermination,
                inclination,
                line1,
                line2,
                meanAnomaly,
                meanMotion,
                meanMotionDDot,
                meanMotionDot,
                origin,
                origNetwork,
                origObjectId,
                perigee,
                period,
                raan,
                rawFileUri,
                revNo,
                satNo,
                semiMajorAxis,
                (sourcedData ?: JsonMissing.of()).map { it.toImmutable() },
                (sourcedDataTypes ?: JsonMissing.of()).map { it.toImmutable() },
                sourceDl,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                transactionId,
                uct,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ElsetIngest = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        epoch()
        source()
        agom()
        algorithm()
        apogee()
        argOfPerigee()
        ballisticCoeff()
        bStar()
        createdAt()
        createdBy()
        descriptor()
        eccentricity()
        ephemType()
        idElset()
        idOnOrbit()
        idOrbitDetermination()
        inclination()
        line1()
        line2()
        meanAnomaly()
        meanMotion()
        meanMotionDDot()
        meanMotionDot()
        origin()
        origNetwork()
        origObjectId()
        perigee()
        period()
        raan()
        rawFileUri()
        revNo()
        satNo()
        semiMajorAxis()
        sourcedData()
        sourcedDataTypes().ifPresent { it.forEach { it.validate() } }
        sourceDl()
        tags()
        transactionId()
        uct()
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
            (if (epoch.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (agom.asKnown().isPresent) 1 else 0) +
            (if (algorithm.asKnown().isPresent) 1 else 0) +
            (if (apogee.asKnown().isPresent) 1 else 0) +
            (if (argOfPerigee.asKnown().isPresent) 1 else 0) +
            (if (ballisticCoeff.asKnown().isPresent) 1 else 0) +
            (if (bStar.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (descriptor.asKnown().isPresent) 1 else 0) +
            (if (eccentricity.asKnown().isPresent) 1 else 0) +
            (if (ephemType.asKnown().isPresent) 1 else 0) +
            (if (idElset.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (idOrbitDetermination.asKnown().isPresent) 1 else 0) +
            (if (inclination.asKnown().isPresent) 1 else 0) +
            (if (line1.asKnown().isPresent) 1 else 0) +
            (if (line2.asKnown().isPresent) 1 else 0) +
            (if (meanAnomaly.asKnown().isPresent) 1 else 0) +
            (if (meanMotion.asKnown().isPresent) 1 else 0) +
            (if (meanMotionDDot.asKnown().isPresent) 1 else 0) +
            (if (meanMotionDot.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (perigee.asKnown().isPresent) 1 else 0) +
            (if (period.asKnown().isPresent) 1 else 0) +
            (if (raan.asKnown().isPresent) 1 else 0) +
            (if (rawFileUri.asKnown().isPresent) 1 else 0) +
            (if (revNo.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (semiMajorAxis.asKnown().isPresent) 1 else 0) +
            (sourcedData.asKnown().getOrNull()?.size ?: 0) +
            (sourcedDataTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (uct.asKnown().isPresent) 1 else 0)

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

    class SourcedDataType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val EO = of("EO")

            @JvmField val RADAR = of("RADAR")

            @JvmField val RF = of("RF")

            @JvmField val DOA = of("DOA")

            @JvmField val ELSET = of("ELSET")

            @JvmField val SV = of("SV")

            @JvmStatic fun of(value: String) = SourcedDataType(JsonField.of(value))
        }

        /** An enum containing [SourcedDataType]'s known values. */
        enum class Known {
            EO,
            RADAR,
            RF,
            DOA,
            ELSET,
            SV,
        }

        /**
         * An enum containing [SourcedDataType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourcedDataType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EO,
            RADAR,
            RF,
            DOA,
            ELSET,
            SV,
            /**
             * An enum member indicating that [SourcedDataType] was instantiated with an unknown
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
                EO -> Value.EO
                RADAR -> Value.RADAR
                RF -> Value.RF
                DOA -> Value.DOA
                ELSET -> Value.ELSET
                SV -> Value.SV
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
                EO -> Known.EO
                RADAR -> Known.RADAR
                RF -> Known.RF
                DOA -> Known.DOA
                ELSET -> Known.ELSET
                SV -> Known.SV
                else ->
                    throw UnifieddatalibraryInvalidDataException("Unknown SourcedDataType: $value")
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

        fun validate(): SourcedDataType = apply {
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

            return other is SourcedDataType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ElsetIngest &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            epoch == other.epoch &&
            source == other.source &&
            agom == other.agom &&
            algorithm == other.algorithm &&
            apogee == other.apogee &&
            argOfPerigee == other.argOfPerigee &&
            ballisticCoeff == other.ballisticCoeff &&
            bStar == other.bStar &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            descriptor == other.descriptor &&
            eccentricity == other.eccentricity &&
            ephemType == other.ephemType &&
            idElset == other.idElset &&
            idOnOrbit == other.idOnOrbit &&
            idOrbitDetermination == other.idOrbitDetermination &&
            inclination == other.inclination &&
            line1 == other.line1 &&
            line2 == other.line2 &&
            meanAnomaly == other.meanAnomaly &&
            meanMotion == other.meanMotion &&
            meanMotionDDot == other.meanMotionDDot &&
            meanMotionDot == other.meanMotionDot &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            perigee == other.perigee &&
            period == other.period &&
            raan == other.raan &&
            rawFileUri == other.rawFileUri &&
            revNo == other.revNo &&
            satNo == other.satNo &&
            semiMajorAxis == other.semiMajorAxis &&
            sourcedData == other.sourcedData &&
            sourcedDataTypes == other.sourcedDataTypes &&
            sourceDl == other.sourceDl &&
            tags == other.tags &&
            transactionId == other.transactionId &&
            uct == other.uct &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            epoch,
            source,
            agom,
            algorithm,
            apogee,
            argOfPerigee,
            ballisticCoeff,
            bStar,
            createdAt,
            createdBy,
            descriptor,
            eccentricity,
            ephemType,
            idElset,
            idOnOrbit,
            idOrbitDetermination,
            inclination,
            line1,
            line2,
            meanAnomaly,
            meanMotion,
            meanMotionDDot,
            meanMotionDot,
            origin,
            origNetwork,
            origObjectId,
            perigee,
            period,
            raan,
            rawFileUri,
            revNo,
            satNo,
            semiMajorAxis,
            sourcedData,
            sourcedDataTypes,
            sourceDl,
            tags,
            transactionId,
            uct,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ElsetIngest{classificationMarking=$classificationMarking, dataMode=$dataMode, epoch=$epoch, source=$source, agom=$agom, algorithm=$algorithm, apogee=$apogee, argOfPerigee=$argOfPerigee, ballisticCoeff=$ballisticCoeff, bStar=$bStar, createdAt=$createdAt, createdBy=$createdBy, descriptor=$descriptor, eccentricity=$eccentricity, ephemType=$ephemType, idElset=$idElset, idOnOrbit=$idOnOrbit, idOrbitDetermination=$idOrbitDetermination, inclination=$inclination, line1=$line1, line2=$line2, meanAnomaly=$meanAnomaly, meanMotion=$meanMotion, meanMotionDDot=$meanMotionDDot, meanMotionDot=$meanMotionDot, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, perigee=$perigee, period=$period, raan=$raan, rawFileUri=$rawFileUri, revNo=$revNo, satNo=$satNo, semiMajorAxis=$semiMajorAxis, sourcedData=$sourcedData, sourcedDataTypes=$sourcedDataTypes, sourceDl=$sourceDl, tags=$tags, transactionId=$transactionId, uct=$uct, additionalProperties=$additionalProperties}"
}

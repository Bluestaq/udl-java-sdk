// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.obscorrelation

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
 * Model representation supporting post-pass correlation of UCTs and re-correlation of mis-tagged
 * electro-optical (EO), radar, RF, and DOA track/observations.
 */
class ObscorrelationRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val corrType: JsonField<CorrType>,
    private val dataMode: JsonField<DataMode>,
    private val msgTs: JsonField<OffsetDateTime>,
    private val obId: JsonField<String>,
    private val obType: JsonField<ObType>,
    private val referenceOrbitId: JsonField<String>,
    private val referenceOrbitType: JsonField<ReferenceOrbitType>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val algorithmCorrType: JsonField<String>,
    private val altCatalog: JsonField<String>,
    private val altNamespace: JsonField<String>,
    private val altObjectId: JsonField<String>,
    private val altUct: JsonField<Boolean>,
    private val astat: JsonField<Long>,
    private val corrQuality: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val idOnOrbit: JsonField<String>,
    private val idParentCorrelation: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val satNo: JsonField<Int>,
    private val sourceDl: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val trackId: JsonField<String>,
    private val transactionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("corrType") @ExcludeMissing corrType: JsonField<CorrType> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("msgTs") @ExcludeMissing msgTs: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("obId") @ExcludeMissing obId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("obType") @ExcludeMissing obType: JsonField<ObType> = JsonMissing.of(),
        @JsonProperty("referenceOrbitId")
        @ExcludeMissing
        referenceOrbitId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referenceOrbitType")
        @ExcludeMissing
        referenceOrbitType: JsonField<ReferenceOrbitType> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("algorithmCorrType")
        @ExcludeMissing
        algorithmCorrType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altCatalog")
        @ExcludeMissing
        altCatalog: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altNamespace")
        @ExcludeMissing
        altNamespace: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altObjectId")
        @ExcludeMissing
        altObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altUct") @ExcludeMissing altUct: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("astat") @ExcludeMissing astat: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("corrQuality")
        @ExcludeMissing
        corrQuality: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idParentCorrelation")
        @ExcludeMissing
        idParentCorrelation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("trackId") @ExcludeMissing trackId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        corrType,
        dataMode,
        msgTs,
        obId,
        obType,
        referenceOrbitId,
        referenceOrbitType,
        source,
        id,
        algorithmCorrType,
        altCatalog,
        altNamespace,
        altObjectId,
        altUct,
        astat,
        corrQuality,
        createdAt,
        createdBy,
        idOnOrbit,
        idParentCorrelation,
        origin,
        origNetwork,
        origObjectId,
        satNo,
        sourceDl,
        tags,
        trackId,
        transactionId,
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
     * Indicator of whether the type of correlation is OBSERVATION or TRACK: OBSERVATION: Identifies
     * an observation is being correlated. TRACK: Identifies the entire track of observations is
     * being correlated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun corrType(): CorrType = corrType.getRequired("corrType")

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
     * Correlation message generation time, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun msgTs(): OffsetDateTime = msgTs.getRequired("msgTs")

    /**
     * Identifier of the Observation associated with this Correlation. If corrType=TRACK then this
     * field should reference the first Observation in the track. Note: To retrieve all remaining
     * Observations in the track, the GET query should include this Observation's source and origin
     * field values, along with the trackId.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun obId(): String = obId.getRequired("obId")

    /**
     * Indicator of whether the type of Observation(s) being correlated is DOA, EO, PASSIVE_RADAR,
     * RADAR, RF, SAR, or SOISET: DOA: The observation type being correlated is Difference of
     * Arrival. EO: The observation type being correlated is Electro-Optical. PASSIVE_RADAR: The
     * observation type being correlated is Passive Radar. RADAR: The observation type being
     * correlated is Radar. RF: The observation type being correlated is Radio Frequency. SAR: The
     * observation type being correlated is Synthetic Aperture Radar. SOISET: The observation type
     * being correlated is Space Object Identification Observation Set.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun obType(): ObType = obType.getRequired("obType")

    /**
     * Identifier of the orbit state used for correlation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referenceOrbitId(): String = referenceOrbitId.getRequired("referenceOrbitId")

    /**
     * Indicator of whether the reference orbit type used for correlation is an ELSET, ESID, or SV:
     * ELSET: The reference orbit type is an Element Set. ESID: The reference orbit type is an
     * Ephemeris Set. SV: The reference orbit type is a State Vector.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referenceOrbitType(): ReferenceOrbitType =
        referenceOrbitType.getRequired("referenceOrbitType")

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
     * Type of algorithm used for this correlation (e.g. ROTAS, GEOMETRIC, STATISTICAL, MAHALANOBIS,
     * AI/ML, OTHER).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun algorithmCorrType(): Optional<String> = algorithmCorrType.getOptional("algorithmCorrType")

    /**
     * Name of the alternate catalog.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altCatalog(): Optional<String> = altCatalog.getOptional("altCatalog")

    /**
     * Associates one or more alternate catalogs with a source provider or system. Namespaces may be
     * defined by their respective data providers or systems (e.g. JCO, 18SDS, EOSSS, EXO, KBR,
     * KRTL, LeoLabs, NorthStar, SAFRAN, Slingshot).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altNamespace(): Optional<String> = altNamespace.getOptional("altNamespace")

    /**
     * Alternate unique object ID within the namespace.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altObjectId(): Optional<String> = altObjectId.getOptional("altObjectId")

    /**
     * Boolean indicating whether the observation or track can be correlated to the alternate object
     * specified under altObjectId. This flag should only be set to true by data providers after an
     * attempt to correlate to an on-orbit object was made and failed. If unable to correlate, the
     * 'origObjectId' field may be populated with an internal data provider specific identifier.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altUct(): Optional<Boolean> = altUct.getOptional("altUct")

    /**
     * Astrostandard ROTAS correlation result (0 - 4), if applicable. Refer to ROTAS documentation
     * for an explanation of ASTAT values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun astat(): Optional<Long> = astat.getOptional("astat")

    /**
     * Correlation score ranging from 0.0 to 1.0. A score of 1.0 represents perfect correlation to
     * the orbit of the corresponding satellite, such as when all observation residuals equal 0.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun corrQuality(): Optional<Double> = corrQuality.getOptional("corrQuality")

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
     * Identifier of the correlated target on-orbit object, if associated with a valid satNo.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Identifier of the ObsCorrelation record from which this ObsCorrelation record originated.
     * This behavior allows for different source providers/systems to make changes to a given
     * correlation and maintain traceability back to the original correlation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idParentCorrelation(): Optional<String> =
        idParentCorrelation.getOptional("idParentCorrelation")

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
     * Optional identifier indicates the target on-orbit object being correlated. This may be an
     * internal identifier and not necessarily a valid satellite number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Current 18th SDS satellite/catalog number of the target on-orbit object. Useful to know in
     * the case where an observation is correlated to another satellite/catalog number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

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
     * Identifier of the Track associated with this ObsCorrelation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trackId(): Optional<String> = trackId.getOptional("trackId")

    /**
     * Optional identifier to track a commercial or marketplace transaction executed to produce this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

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
     * Returns the raw JSON value of [corrType].
     *
     * Unlike [corrType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("corrType") @ExcludeMissing fun _corrType(): JsonField<CorrType> = corrType

    /**
     * Returns the raw JSON value of [dataMode].
     *
     * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataMode") @ExcludeMissing fun _dataMode(): JsonField<DataMode> = dataMode

    /**
     * Returns the raw JSON value of [msgTs].
     *
     * Unlike [msgTs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msgTs") @ExcludeMissing fun _msgTs(): JsonField<OffsetDateTime> = msgTs

    /**
     * Returns the raw JSON value of [obId].
     *
     * Unlike [obId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obId") @ExcludeMissing fun _obId(): JsonField<String> = obId

    /**
     * Returns the raw JSON value of [obType].
     *
     * Unlike [obType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obType") @ExcludeMissing fun _obType(): JsonField<ObType> = obType

    /**
     * Returns the raw JSON value of [referenceOrbitId].
     *
     * Unlike [referenceOrbitId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("referenceOrbitId")
    @ExcludeMissing
    fun _referenceOrbitId(): JsonField<String> = referenceOrbitId

    /**
     * Returns the raw JSON value of [referenceOrbitType].
     *
     * Unlike [referenceOrbitType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("referenceOrbitType")
    @ExcludeMissing
    fun _referenceOrbitType(): JsonField<ReferenceOrbitType> = referenceOrbitType

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
     * Returns the raw JSON value of [algorithmCorrType].
     *
     * Unlike [algorithmCorrType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("algorithmCorrType")
    @ExcludeMissing
    fun _algorithmCorrType(): JsonField<String> = algorithmCorrType

    /**
     * Returns the raw JSON value of [altCatalog].
     *
     * Unlike [altCatalog], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altCatalog") @ExcludeMissing fun _altCatalog(): JsonField<String> = altCatalog

    /**
     * Returns the raw JSON value of [altNamespace].
     *
     * Unlike [altNamespace], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altNamespace")
    @ExcludeMissing
    fun _altNamespace(): JsonField<String> = altNamespace

    /**
     * Returns the raw JSON value of [altObjectId].
     *
     * Unlike [altObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altObjectId") @ExcludeMissing fun _altObjectId(): JsonField<String> = altObjectId

    /**
     * Returns the raw JSON value of [altUct].
     *
     * Unlike [altUct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altUct") @ExcludeMissing fun _altUct(): JsonField<Boolean> = altUct

    /**
     * Returns the raw JSON value of [astat].
     *
     * Unlike [astat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("astat") @ExcludeMissing fun _astat(): JsonField<Long> = astat

    /**
     * Returns the raw JSON value of [corrQuality].
     *
     * Unlike [corrQuality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("corrQuality") @ExcludeMissing fun _corrQuality(): JsonField<Double> = corrQuality

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
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [idParentCorrelation].
     *
     * Unlike [idParentCorrelation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("idParentCorrelation")
    @ExcludeMissing
    fun _idParentCorrelation(): JsonField<String> = idParentCorrelation

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
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

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
     * Returns the raw JSON value of [trackId].
     *
     * Unlike [trackId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trackId") @ExcludeMissing fun _trackId(): JsonField<String> = trackId

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

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
         * [ObscorrelationRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .corrType()
         * .dataMode()
         * .msgTs()
         * .obId()
         * .obType()
         * .referenceOrbitId()
         * .referenceOrbitType()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObscorrelationRetrieveResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var corrType: JsonField<CorrType>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var msgTs: JsonField<OffsetDateTime>? = null
        private var obId: JsonField<String>? = null
        private var obType: JsonField<ObType>? = null
        private var referenceOrbitId: JsonField<String>? = null
        private var referenceOrbitType: JsonField<ReferenceOrbitType>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var algorithmCorrType: JsonField<String> = JsonMissing.of()
        private var altCatalog: JsonField<String> = JsonMissing.of()
        private var altNamespace: JsonField<String> = JsonMissing.of()
        private var altObjectId: JsonField<String> = JsonMissing.of()
        private var altUct: JsonField<Boolean> = JsonMissing.of()
        private var astat: JsonField<Long> = JsonMissing.of()
        private var corrQuality: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var idParentCorrelation: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var trackId: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(obscorrelationRetrieveResponse: ObscorrelationRetrieveResponse) = apply {
            classificationMarking = obscorrelationRetrieveResponse.classificationMarking
            corrType = obscorrelationRetrieveResponse.corrType
            dataMode = obscorrelationRetrieveResponse.dataMode
            msgTs = obscorrelationRetrieveResponse.msgTs
            obId = obscorrelationRetrieveResponse.obId
            obType = obscorrelationRetrieveResponse.obType
            referenceOrbitId = obscorrelationRetrieveResponse.referenceOrbitId
            referenceOrbitType = obscorrelationRetrieveResponse.referenceOrbitType
            source = obscorrelationRetrieveResponse.source
            id = obscorrelationRetrieveResponse.id
            algorithmCorrType = obscorrelationRetrieveResponse.algorithmCorrType
            altCatalog = obscorrelationRetrieveResponse.altCatalog
            altNamespace = obscorrelationRetrieveResponse.altNamespace
            altObjectId = obscorrelationRetrieveResponse.altObjectId
            altUct = obscorrelationRetrieveResponse.altUct
            astat = obscorrelationRetrieveResponse.astat
            corrQuality = obscorrelationRetrieveResponse.corrQuality
            createdAt = obscorrelationRetrieveResponse.createdAt
            createdBy = obscorrelationRetrieveResponse.createdBy
            idOnOrbit = obscorrelationRetrieveResponse.idOnOrbit
            idParentCorrelation = obscorrelationRetrieveResponse.idParentCorrelation
            origin = obscorrelationRetrieveResponse.origin
            origNetwork = obscorrelationRetrieveResponse.origNetwork
            origObjectId = obscorrelationRetrieveResponse.origObjectId
            satNo = obscorrelationRetrieveResponse.satNo
            sourceDl = obscorrelationRetrieveResponse.sourceDl
            tags = obscorrelationRetrieveResponse.tags.map { it.toMutableList() }
            trackId = obscorrelationRetrieveResponse.trackId
            transactionId = obscorrelationRetrieveResponse.transactionId
            additionalProperties =
                obscorrelationRetrieveResponse.additionalProperties.toMutableMap()
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
         * Indicator of whether the type of correlation is OBSERVATION or TRACK: OBSERVATION:
         * Identifies an observation is being correlated. TRACK: Identifies the entire track of
         * observations is being correlated.
         */
        fun corrType(corrType: CorrType) = corrType(JsonField.of(corrType))

        /**
         * Sets [Builder.corrType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.corrType] with a well-typed [CorrType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun corrType(corrType: JsonField<CorrType>) = apply { this.corrType = corrType }

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

        /**
         * Correlation message generation time, in ISO 8601 UTC format with millisecond precision.
         */
        fun msgTs(msgTs: OffsetDateTime) = msgTs(JsonField.of(msgTs))

        /**
         * Sets [Builder.msgTs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msgTs] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun msgTs(msgTs: JsonField<OffsetDateTime>) = apply { this.msgTs = msgTs }

        /**
         * Identifier of the Observation associated with this Correlation. If corrType=TRACK then
         * this field should reference the first Observation in the track. Note: To retrieve all
         * remaining Observations in the track, the GET query should include this Observation's
         * source and origin field values, along with the trackId.
         */
        fun obId(obId: String) = obId(JsonField.of(obId))

        /**
         * Sets [Builder.obId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun obId(obId: JsonField<String>) = apply { this.obId = obId }

        /**
         * Indicator of whether the type of Observation(s) being correlated is DOA, EO,
         * PASSIVE_RADAR, RADAR, RF, SAR, or SOISET: DOA: The observation type being correlated is
         * Difference of Arrival. EO: The observation type being correlated is Electro-Optical.
         * PASSIVE_RADAR: The observation type being correlated is Passive Radar. RADAR: The
         * observation type being correlated is Radar. RF: The observation type being correlated is
         * Radio Frequency. SAR: The observation type being correlated is Synthetic Aperture Radar.
         * SOISET: The observation type being correlated is Space Object Identification Observation
         * Set.
         */
        fun obType(obType: ObType) = obType(JsonField.of(obType))

        /**
         * Sets [Builder.obType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obType] with a well-typed [ObType] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun obType(obType: JsonField<ObType>) = apply { this.obType = obType }

        /** Identifier of the orbit state used for correlation. */
        fun referenceOrbitId(referenceOrbitId: String) =
            referenceOrbitId(JsonField.of(referenceOrbitId))

        /**
         * Sets [Builder.referenceOrbitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceOrbitId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceOrbitId(referenceOrbitId: JsonField<String>) = apply {
            this.referenceOrbitId = referenceOrbitId
        }

        /**
         * Indicator of whether the reference orbit type used for correlation is an ELSET, ESID, or
         * SV: ELSET: The reference orbit type is an Element Set. ESID: The reference orbit type is
         * an Ephemeris Set. SV: The reference orbit type is a State Vector.
         */
        fun referenceOrbitType(referenceOrbitType: ReferenceOrbitType) =
            referenceOrbitType(JsonField.of(referenceOrbitType))

        /**
         * Sets [Builder.referenceOrbitType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceOrbitType] with a well-typed
         * [ReferenceOrbitType] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun referenceOrbitType(referenceOrbitType: JsonField<ReferenceOrbitType>) = apply {
            this.referenceOrbitType = referenceOrbitType
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
         * Type of algorithm used for this correlation (e.g. ROTAS, GEOMETRIC, STATISTICAL,
         * MAHALANOBIS, AI/ML, OTHER).
         */
        fun algorithmCorrType(algorithmCorrType: String) =
            algorithmCorrType(JsonField.of(algorithmCorrType))

        /**
         * Sets [Builder.algorithmCorrType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.algorithmCorrType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun algorithmCorrType(algorithmCorrType: JsonField<String>) = apply {
            this.algorithmCorrType = algorithmCorrType
        }

        /** Name of the alternate catalog. */
        fun altCatalog(altCatalog: String) = altCatalog(JsonField.of(altCatalog))

        /**
         * Sets [Builder.altCatalog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altCatalog] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun altCatalog(altCatalog: JsonField<String>) = apply { this.altCatalog = altCatalog }

        /**
         * Associates one or more alternate catalogs with a source provider or system. Namespaces
         * may be defined by their respective data providers or systems (e.g. JCO, 18SDS, EOSSS,
         * EXO, KBR, KRTL, LeoLabs, NorthStar, SAFRAN, Slingshot).
         */
        fun altNamespace(altNamespace: String) = altNamespace(JsonField.of(altNamespace))

        /**
         * Sets [Builder.altNamespace] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altNamespace] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun altNamespace(altNamespace: JsonField<String>) = apply {
            this.altNamespace = altNamespace
        }

        /** Alternate unique object ID within the namespace. */
        fun altObjectId(altObjectId: String) = altObjectId(JsonField.of(altObjectId))

        /**
         * Sets [Builder.altObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altObjectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun altObjectId(altObjectId: JsonField<String>) = apply { this.altObjectId = altObjectId }

        /**
         * Boolean indicating whether the observation or track can be correlated to the alternate
         * object specified under altObjectId. This flag should only be set to true by data
         * providers after an attempt to correlate to an on-orbit object was made and failed. If
         * unable to correlate, the 'origObjectId' field may be populated with an internal data
         * provider specific identifier.
         */
        fun altUct(altUct: Boolean) = altUct(JsonField.of(altUct))

        /**
         * Sets [Builder.altUct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altUct] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun altUct(altUct: JsonField<Boolean>) = apply { this.altUct = altUct }

        /**
         * Astrostandard ROTAS correlation result (0 - 4), if applicable. Refer to ROTAS
         * documentation for an explanation of ASTAT values.
         */
        fun astat(astat: Long) = astat(JsonField.of(astat))

        /**
         * Sets [Builder.astat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.astat] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun astat(astat: JsonField<Long>) = apply { this.astat = astat }

        /**
         * Correlation score ranging from 0.0 to 1.0. A score of 1.0 represents perfect correlation
         * to the orbit of the corresponding satellite, such as when all observation residuals
         * equal 0.
         */
        fun corrQuality(corrQuality: Double) = corrQuality(JsonField.of(corrQuality))

        /**
         * Sets [Builder.corrQuality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.corrQuality] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun corrQuality(corrQuality: JsonField<Double>) = apply { this.corrQuality = corrQuality }

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
         * Identifier of the correlated target on-orbit object, if associated with a valid satNo.
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
         * Identifier of the ObsCorrelation record from which this ObsCorrelation record originated.
         * This behavior allows for different source providers/systems to make changes to a given
         * correlation and maintain traceability back to the original correlation.
         */
        fun idParentCorrelation(idParentCorrelation: String) =
            idParentCorrelation(JsonField.of(idParentCorrelation))

        /**
         * Sets [Builder.idParentCorrelation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idParentCorrelation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idParentCorrelation(idParentCorrelation: JsonField<String>) = apply {
            this.idParentCorrelation = idParentCorrelation
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
         * Optional identifier indicates the target on-orbit object being correlated. This may be an
         * internal identifier and not necessarily a valid satellite number.
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
         * Current 18th SDS satellite/catalog number of the target on-orbit object. Useful to know
         * in the case where an observation is correlated to another satellite/catalog number.
         */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

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

        /** Identifier of the Track associated with this ObsCorrelation. */
        fun trackId(trackId: String) = trackId(JsonField.of(trackId))

        /**
         * Sets [Builder.trackId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trackId(trackId: JsonField<String>) = apply { this.trackId = trackId }

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
         * Returns an immutable instance of [ObscorrelationRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .corrType()
         * .dataMode()
         * .msgTs()
         * .obId()
         * .obType()
         * .referenceOrbitId()
         * .referenceOrbitType()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObscorrelationRetrieveResponse =
            ObscorrelationRetrieveResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("corrType", corrType),
                checkRequired("dataMode", dataMode),
                checkRequired("msgTs", msgTs),
                checkRequired("obId", obId),
                checkRequired("obType", obType),
                checkRequired("referenceOrbitId", referenceOrbitId),
                checkRequired("referenceOrbitType", referenceOrbitType),
                checkRequired("source", source),
                id,
                algorithmCorrType,
                altCatalog,
                altNamespace,
                altObjectId,
                altUct,
                astat,
                corrQuality,
                createdAt,
                createdBy,
                idOnOrbit,
                idParentCorrelation,
                origin,
                origNetwork,
                origObjectId,
                satNo,
                sourceDl,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                trackId,
                transactionId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObscorrelationRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        corrType().validate()
        dataMode().validate()
        msgTs()
        obId()
        obType().validate()
        referenceOrbitId()
        referenceOrbitType().validate()
        source()
        id()
        algorithmCorrType()
        altCatalog()
        altNamespace()
        altObjectId()
        altUct()
        astat()
        corrQuality()
        createdAt()
        createdBy()
        idOnOrbit()
        idParentCorrelation()
        origin()
        origNetwork()
        origObjectId()
        satNo()
        sourceDl()
        tags()
        trackId()
        transactionId()
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
            (corrType.asKnown().getOrNull()?.validity() ?: 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (msgTs.asKnown().isPresent) 1 else 0) +
            (if (obId.asKnown().isPresent) 1 else 0) +
            (obType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (referenceOrbitId.asKnown().isPresent) 1 else 0) +
            (referenceOrbitType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (algorithmCorrType.asKnown().isPresent) 1 else 0) +
            (if (altCatalog.asKnown().isPresent) 1 else 0) +
            (if (altNamespace.asKnown().isPresent) 1 else 0) +
            (if (altObjectId.asKnown().isPresent) 1 else 0) +
            (if (altUct.asKnown().isPresent) 1 else 0) +
            (if (astat.asKnown().isPresent) 1 else 0) +
            (if (corrQuality.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (idParentCorrelation.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (trackId.asKnown().isPresent) 1 else 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0)

    /**
     * Indicator of whether the type of correlation is OBSERVATION or TRACK: OBSERVATION: Identifies
     * an observation is being correlated. TRACK: Identifies the entire track of observations is
     * being correlated.
     */
    class CorrType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OBSERVATION = of("OBSERVATION")

            @JvmField val TRACK = of("TRACK")

            @JvmStatic fun of(value: String) = CorrType(JsonField.of(value))
        }

        /** An enum containing [CorrType]'s known values. */
        enum class Known {
            OBSERVATION,
            TRACK,
        }

        /**
         * An enum containing [CorrType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CorrType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OBSERVATION,
            TRACK,
            /** An enum member indicating that [CorrType] was instantiated with an unknown value. */
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
                OBSERVATION -> Value.OBSERVATION
                TRACK -> Value.TRACK
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
                OBSERVATION -> Known.OBSERVATION
                TRACK -> Known.TRACK
                else -> throw UnifieddatalibraryInvalidDataException("Unknown CorrType: $value")
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

        fun validate(): CorrType = apply {
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

            return other is CorrType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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
     * Indicator of whether the type of Observation(s) being correlated is DOA, EO, PASSIVE_RADAR,
     * RADAR, RF, SAR, or SOISET: DOA: The observation type being correlated is Difference of
     * Arrival. EO: The observation type being correlated is Electro-Optical. PASSIVE_RADAR: The
     * observation type being correlated is Passive Radar. RADAR: The observation type being
     * correlated is Radar. RF: The observation type being correlated is Radio Frequency. SAR: The
     * observation type being correlated is Synthetic Aperture Radar. SOISET: The observation type
     * being correlated is Space Object Identification Observation Set.
     */
    class ObType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DOA = of("DOA")

            @JvmField val EO = of("EO")

            @JvmField val PASSIVE_RADAR = of("PASSIVE_RADAR")

            @JvmField val RADAR = of("RADAR")

            @JvmField val RF = of("RF")

            @JvmField val SAR = of("SAR")

            @JvmField val SOISET = of("SOISET")

            @JvmStatic fun of(value: String) = ObType(JsonField.of(value))
        }

        /** An enum containing [ObType]'s known values. */
        enum class Known {
            DOA,
            EO,
            PASSIVE_RADAR,
            RADAR,
            RF,
            SAR,
            SOISET,
        }

        /**
         * An enum containing [ObType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ObType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DOA,
            EO,
            PASSIVE_RADAR,
            RADAR,
            RF,
            SAR,
            SOISET,
            /** An enum member indicating that [ObType] was instantiated with an unknown value. */
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
                DOA -> Value.DOA
                EO -> Value.EO
                PASSIVE_RADAR -> Value.PASSIVE_RADAR
                RADAR -> Value.RADAR
                RF -> Value.RF
                SAR -> Value.SAR
                SOISET -> Value.SOISET
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
                DOA -> Known.DOA
                EO -> Known.EO
                PASSIVE_RADAR -> Known.PASSIVE_RADAR
                RADAR -> Known.RADAR
                RF -> Known.RF
                SAR -> Known.SAR
                SOISET -> Known.SOISET
                else -> throw UnifieddatalibraryInvalidDataException("Unknown ObType: $value")
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

        fun validate(): ObType = apply {
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

            return other is ObType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Indicator of whether the reference orbit type used for correlation is an ELSET, ESID, or SV:
     * ELSET: The reference orbit type is an Element Set. ESID: The reference orbit type is an
     * Ephemeris Set. SV: The reference orbit type is a State Vector.
     */
    class ReferenceOrbitType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ELSET = of("ELSET")

            @JvmField val ESID = of("ESID")

            @JvmField val SV = of("SV")

            @JvmStatic fun of(value: String) = ReferenceOrbitType(JsonField.of(value))
        }

        /** An enum containing [ReferenceOrbitType]'s known values. */
        enum class Known {
            ELSET,
            ESID,
            SV,
        }

        /**
         * An enum containing [ReferenceOrbitType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReferenceOrbitType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ELSET,
            ESID,
            SV,
            /**
             * An enum member indicating that [ReferenceOrbitType] was instantiated with an unknown
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
                ELSET -> Value.ELSET
                ESID -> Value.ESID
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
                ELSET -> Known.ELSET
                ESID -> Known.ESID
                SV -> Known.SV
                else ->
                    throw UnifieddatalibraryInvalidDataException(
                        "Unknown ReferenceOrbitType: $value"
                    )
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

        fun validate(): ReferenceOrbitType = apply {
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

            return other is ReferenceOrbitType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObscorrelationRetrieveResponse &&
            classificationMarking == other.classificationMarking &&
            corrType == other.corrType &&
            dataMode == other.dataMode &&
            msgTs == other.msgTs &&
            obId == other.obId &&
            obType == other.obType &&
            referenceOrbitId == other.referenceOrbitId &&
            referenceOrbitType == other.referenceOrbitType &&
            source == other.source &&
            id == other.id &&
            algorithmCorrType == other.algorithmCorrType &&
            altCatalog == other.altCatalog &&
            altNamespace == other.altNamespace &&
            altObjectId == other.altObjectId &&
            altUct == other.altUct &&
            astat == other.astat &&
            corrQuality == other.corrQuality &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            idOnOrbit == other.idOnOrbit &&
            idParentCorrelation == other.idParentCorrelation &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            satNo == other.satNo &&
            sourceDl == other.sourceDl &&
            tags == other.tags &&
            trackId == other.trackId &&
            transactionId == other.transactionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            corrType,
            dataMode,
            msgTs,
            obId,
            obType,
            referenceOrbitId,
            referenceOrbitType,
            source,
            id,
            algorithmCorrType,
            altCatalog,
            altNamespace,
            altObjectId,
            altUct,
            astat,
            corrQuality,
            createdAt,
            createdBy,
            idOnOrbit,
            idParentCorrelation,
            origin,
            origNetwork,
            origObjectId,
            satNo,
            sourceDl,
            tags,
            trackId,
            transactionId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObscorrelationRetrieveResponse{classificationMarking=$classificationMarking, corrType=$corrType, dataMode=$dataMode, msgTs=$msgTs, obId=$obId, obType=$obType, referenceOrbitId=$referenceOrbitId, referenceOrbitType=$referenceOrbitType, source=$source, id=$id, algorithmCorrType=$algorithmCorrType, altCatalog=$altCatalog, altNamespace=$altNamespace, altObjectId=$altObjectId, altUct=$altUct, astat=$astat, corrQuality=$corrQuality, createdAt=$createdAt, createdBy=$createdBy, idOnOrbit=$idOnOrbit, idParentCorrelation=$idParentCorrelation, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, satNo=$satNo, sourceDl=$sourceDl, tags=$tags, trackId=$trackId, transactionId=$transactionId, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.port

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
 * Properties and characteristics of a maritime port, which includes location, port identifiers, and
 * remarks.
 */
class PortGetResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val avgDuration: JsonField<Double>,
    private val countryCode: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val externalId: JsonField<String>,
    private val harborSize: JsonField<Double>,
    private val harborType: JsonField<String>,
    private val idSite: JsonField<String>,
    private val lat: JsonField<Double>,
    private val locode: JsonField<String>,
    private val lon: JsonField<Double>,
    private val maxDraught: JsonField<Double>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val pilotReqd: JsonField<Boolean>,
    private val portName: JsonField<String>,
    private val shelter: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val tideRange: JsonField<Double>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("avgDuration")
        @ExcludeMissing
        avgDuration: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalId")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("harborSize")
        @ExcludeMissing
        harborSize: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("harborType")
        @ExcludeMissing
        harborType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSite") @ExcludeMissing idSite: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("locode") @ExcludeMissing locode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("maxDraught")
        @ExcludeMissing
        maxDraught: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pilotReqd") @ExcludeMissing pilotReqd: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("portName") @ExcludeMissing portName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shelter") @ExcludeMissing shelter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tideRange") @ExcludeMissing tideRange: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        source,
        id,
        avgDuration,
        countryCode,
        createdAt,
        createdBy,
        externalId,
        harborSize,
        harborType,
        idSite,
        lat,
        locode,
        lon,
        maxDraught,
        origin,
        origNetwork,
        pilotReqd,
        portName,
        shelter,
        sourceDl,
        tideRange,
        updatedAt,
        updatedBy,
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
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Unique identifier of the record, auto-generated by the system if not provided on create
     * operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Average time for a vessel at this port in hours.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun avgDuration(): Optional<Double> = avgDuration.getOptional("avgDuration")

    /**
     * The country where this port is located.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

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
     * Optional ID from external systems. This field has no meaning within UDL and is provided as a
     * convenience for systems that require tracking of an internal system generated ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("externalId")

    /**
     * The size of the harbor for this port measured in square kilometers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun harborSize(): Optional<Double> = harborSize.getOptional("harborSize")

    /**
     * The type of harbor for this port. The harbor type refers to how a port is physically
     * positioned.
     *
     * COASTAL BREAKWATER (CB)
     *
     * COASTAL NATURAL (CN)
     *
     * COASTAL TIDE GATE (CT)
     *
     * LAKE OR CANAL (LC)
     *
     * OPEN ROADSTEAD (OR)
     *
     * RIVER BASIN (RB)
     *
     * RIVER NATURAL (RN)
     *
     * RIVER TIDE GATE (RT)
     *
     * TYPHOON HARBOR (TH).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun harborType(): Optional<String> = harborType.getOptional("harborType")

    /**
     * Unique identifier of the Site Entity associated with the Port record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSite(): Optional<String> = idSite.getOptional("idSite")

    /**
     * WGS84 latitude of the location, in degrees. -90 to 90 degrees (negative values south of
     * equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lat(): Optional<Double> = lat.getOptional("lat")

    /**
     * The five-character United Nations Code for Trade and Transport Locations (UN/LOCODE) of this
     * port. The first two letters of the code contains the ISO 3166-1 alpha-2 country designation
     * of the port country. The three remaining characters identify a location within that country.
     * Letters are preferred, but if necessary digits 2 through 9 may be used, excluding "0" and "1"
     * to avoid confusion with the letters "O" and "I" respectively.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun locode(): Optional<String> = locode.getOptional("locode")

    /**
     * WGS84 longitude of the location, in degrees. -180 to 180 degrees (negative values west of
     * Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lon(): Optional<Double> = lon.getOptional("lon")

    /**
     * Maximum allowed vessel draught. Draught is the principal dimensions of any waterborne vessel
     * defined as the distance between the ship’s keel and the waterline of the vessel measured in
     * meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxDraught(): Optional<Double> = maxDraught.getOptional("maxDraught")

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
     * Flag indicating whether a pilot is required at this port.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pilotReqd(): Optional<Boolean> = pilotReqd.getOptional("pilotReqd")

    /**
     * The name of this port.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun portName(): Optional<String> = portName.getOptional("portName")

    /**
     * The shelter afforded from wind, sea, and swell refers to the area where normal port
     * operations are conducted, usually the wharf area. Shelter afforded by the anchorage area may
     * be given for ports where cargo is handled by lighters. Values given are EXCELLENT, FAIR,
     * GOOD, POOR, or NONE.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shelter(): Optional<String> = shelter.getOptional("shelter")

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
     * The tide range of this port in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tideRange(): Optional<Double> = tideRange.getOptional("tideRange")

    /**
     * Time the row was updated in the database, auto-populated by the system.
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
     * Returns the raw JSON value of [avgDuration].
     *
     * Unlike [avgDuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avgDuration") @ExcludeMissing fun _avgDuration(): JsonField<Double> = avgDuration

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

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
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalId") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [harborSize].
     *
     * Unlike [harborSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("harborSize") @ExcludeMissing fun _harborSize(): JsonField<Double> = harborSize

    /**
     * Returns the raw JSON value of [harborType].
     *
     * Unlike [harborType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("harborType") @ExcludeMissing fun _harborType(): JsonField<String> = harborType

    /**
     * Returns the raw JSON value of [idSite].
     *
     * Unlike [idSite], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSite") @ExcludeMissing fun _idSite(): JsonField<String> = idSite

    /**
     * Returns the raw JSON value of [lat].
     *
     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

    /**
     * Returns the raw JSON value of [locode].
     *
     * Unlike [locode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locode") @ExcludeMissing fun _locode(): JsonField<String> = locode

    /**
     * Returns the raw JSON value of [lon].
     *
     * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

    /**
     * Returns the raw JSON value of [maxDraught].
     *
     * Unlike [maxDraught], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxDraught") @ExcludeMissing fun _maxDraught(): JsonField<Double> = maxDraught

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
     * Returns the raw JSON value of [pilotReqd].
     *
     * Unlike [pilotReqd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pilotReqd") @ExcludeMissing fun _pilotReqd(): JsonField<Boolean> = pilotReqd

    /**
     * Returns the raw JSON value of [portName].
     *
     * Unlike [portName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portName") @ExcludeMissing fun _portName(): JsonField<String> = portName

    /**
     * Returns the raw JSON value of [shelter].
     *
     * Unlike [shelter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shelter") @ExcludeMissing fun _shelter(): JsonField<String> = shelter

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [tideRange].
     *
     * Unlike [tideRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tideRange") @ExcludeMissing fun _tideRange(): JsonField<Double> = tideRange

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
         * Returns a mutable builder for constructing an instance of [PortGetResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortGetResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var avgDuration: JsonField<Double> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var harborSize: JsonField<Double> = JsonMissing.of()
        private var harborType: JsonField<String> = JsonMissing.of()
        private var idSite: JsonField<String> = JsonMissing.of()
        private var lat: JsonField<Double> = JsonMissing.of()
        private var locode: JsonField<String> = JsonMissing.of()
        private var lon: JsonField<Double> = JsonMissing.of()
        private var maxDraught: JsonField<Double> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var pilotReqd: JsonField<Boolean> = JsonMissing.of()
        private var portName: JsonField<String> = JsonMissing.of()
        private var shelter: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var tideRange: JsonField<Double> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portGetResponse: PortGetResponse) = apply {
            classificationMarking = portGetResponse.classificationMarking
            dataMode = portGetResponse.dataMode
            source = portGetResponse.source
            id = portGetResponse.id
            avgDuration = portGetResponse.avgDuration
            countryCode = portGetResponse.countryCode
            createdAt = portGetResponse.createdAt
            createdBy = portGetResponse.createdBy
            externalId = portGetResponse.externalId
            harborSize = portGetResponse.harborSize
            harborType = portGetResponse.harborType
            idSite = portGetResponse.idSite
            lat = portGetResponse.lat
            locode = portGetResponse.locode
            lon = portGetResponse.lon
            maxDraught = portGetResponse.maxDraught
            origin = portGetResponse.origin
            origNetwork = portGetResponse.origNetwork
            pilotReqd = portGetResponse.pilotReqd
            portName = portGetResponse.portName
            shelter = portGetResponse.shelter
            sourceDl = portGetResponse.sourceDl
            tideRange = portGetResponse.tideRange
            updatedAt = portGetResponse.updatedAt
            updatedBy = portGetResponse.updatedBy
            additionalProperties = portGetResponse.additionalProperties.toMutableMap()
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
         * Unique identifier of the record, auto-generated by the system if not provided on create
         * operations.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Average time for a vessel at this port in hours. */
        fun avgDuration(avgDuration: Double) = avgDuration(JsonField.of(avgDuration))

        /**
         * Sets [Builder.avgDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgDuration] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun avgDuration(avgDuration: JsonField<Double>) = apply { this.avgDuration = avgDuration }

        /** The country where this port is located. */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

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
         * Optional ID from external systems. This field has no meaning within UDL and is provided
         * as a convenience for systems that require tracking of an internal system generated ID.
         */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** The size of the harbor for this port measured in square kilometers. */
        fun harborSize(harborSize: Double) = harborSize(JsonField.of(harborSize))

        /**
         * Sets [Builder.harborSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.harborSize] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun harborSize(harborSize: JsonField<Double>) = apply { this.harborSize = harborSize }

        /**
         * The type of harbor for this port. The harbor type refers to how a port is physically
         * positioned.
         *
         * COASTAL BREAKWATER (CB)
         *
         * COASTAL NATURAL (CN)
         *
         * COASTAL TIDE GATE (CT)
         *
         * LAKE OR CANAL (LC)
         *
         * OPEN ROADSTEAD (OR)
         *
         * RIVER BASIN (RB)
         *
         * RIVER NATURAL (RN)
         *
         * RIVER TIDE GATE (RT)
         *
         * TYPHOON HARBOR (TH).
         */
        fun harborType(harborType: String) = harborType(JsonField.of(harborType))

        /**
         * Sets [Builder.harborType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.harborType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun harborType(harborType: JsonField<String>) = apply { this.harborType = harborType }

        /** Unique identifier of the Site Entity associated with the Port record. */
        fun idSite(idSite: String) = idSite(JsonField.of(idSite))

        /**
         * Sets [Builder.idSite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSite] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSite(idSite: JsonField<String>) = apply { this.idSite = idSite }

        /**
         * WGS84 latitude of the location, in degrees. -90 to 90 degrees (negative values south of
         * equator).
         */
        fun lat(lat: Double) = lat(JsonField.of(lat))

        /**
         * Sets [Builder.lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

        /**
         * The five-character United Nations Code for Trade and Transport Locations (UN/LOCODE) of
         * this port. The first two letters of the code contains the ISO 3166-1 alpha-2 country
         * designation of the port country. The three remaining characters identify a location
         * within that country. Letters are preferred, but if necessary digits 2 through 9 may be
         * used, excluding "0" and "1" to avoid confusion with the letters "O" and "I" respectively.
         */
        fun locode(locode: String) = locode(JsonField.of(locode))

        /**
         * Sets [Builder.locode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locode(locode: JsonField<String>) = apply { this.locode = locode }

        /**
         * WGS84 longitude of the location, in degrees. -180 to 180 degrees (negative values west of
         * Prime Meridian).
         */
        fun lon(lon: Double) = lon(JsonField.of(lon))

        /**
         * Sets [Builder.lon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

        /**
         * Maximum allowed vessel draught. Draught is the principal dimensions of any waterborne
         * vessel defined as the distance between the ship’s keel and the waterline of the vessel
         * measured in meters.
         */
        fun maxDraught(maxDraught: Double) = maxDraught(JsonField.of(maxDraught))

        /**
         * Sets [Builder.maxDraught] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxDraught] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxDraught(maxDraught: JsonField<Double>) = apply { this.maxDraught = maxDraught }

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

        /** Flag indicating whether a pilot is required at this port. */
        fun pilotReqd(pilotReqd: Boolean) = pilotReqd(JsonField.of(pilotReqd))

        /**
         * Sets [Builder.pilotReqd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pilotReqd] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pilotReqd(pilotReqd: JsonField<Boolean>) = apply { this.pilotReqd = pilotReqd }

        /** The name of this port. */
        fun portName(portName: String) = portName(JsonField.of(portName))

        /**
         * Sets [Builder.portName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun portName(portName: JsonField<String>) = apply { this.portName = portName }

        /**
         * The shelter afforded from wind, sea, and swell refers to the area where normal port
         * operations are conducted, usually the wharf area. Shelter afforded by the anchorage area
         * may be given for ports where cargo is handled by lighters. Values given are EXCELLENT,
         * FAIR, GOOD, POOR, or NONE.
         */
        fun shelter(shelter: String) = shelter(JsonField.of(shelter))

        /**
         * Sets [Builder.shelter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shelter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun shelter(shelter: JsonField<String>) = apply { this.shelter = shelter }

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

        /** The tide range of this port in meters. */
        fun tideRange(tideRange: Double) = tideRange(JsonField.of(tideRange))

        /**
         * Sets [Builder.tideRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tideRange] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tideRange(tideRange: JsonField<Double>) = apply { this.tideRange = tideRange }

        /** Time the row was updated in the database, auto-populated by the system. */
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
         * Returns an immutable instance of [PortGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PortGetResponse =
            PortGetResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("source", source),
                id,
                avgDuration,
                countryCode,
                createdAt,
                createdBy,
                externalId,
                harborSize,
                harborType,
                idSite,
                lat,
                locode,
                lon,
                maxDraught,
                origin,
                origNetwork,
                pilotReqd,
                portName,
                shelter,
                sourceDl,
                tideRange,
                updatedAt,
                updatedBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortGetResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        source()
        id()
        avgDuration()
        countryCode()
        createdAt()
        createdBy()
        externalId()
        harborSize()
        harborType()
        idSite()
        lat()
        locode()
        lon()
        maxDraught()
        origin()
        origNetwork()
        pilotReqd()
        portName()
        shelter()
        sourceDl()
        tideRange()
        updatedAt()
        updatedBy()
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
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (avgDuration.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (if (harborSize.asKnown().isPresent) 1 else 0) +
            (if (harborType.asKnown().isPresent) 1 else 0) +
            (if (idSite.asKnown().isPresent) 1 else 0) +
            (if (lat.asKnown().isPresent) 1 else 0) +
            (if (locode.asKnown().isPresent) 1 else 0) +
            (if (lon.asKnown().isPresent) 1 else 0) +
            (if (maxDraught.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (pilotReqd.asKnown().isPresent) 1 else 0) +
            (if (portName.asKnown().isPresent) 1 else 0) +
            (if (shelter.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (tideRange.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0)

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

            return /* spotless:off */ other is DataMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PortGetResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && source == other.source && id == other.id && avgDuration == other.avgDuration && countryCode == other.countryCode && createdAt == other.createdAt && createdBy == other.createdBy && externalId == other.externalId && harborSize == other.harborSize && harborType == other.harborType && idSite == other.idSite && lat == other.lat && locode == other.locode && lon == other.lon && maxDraught == other.maxDraught && origin == other.origin && origNetwork == other.origNetwork && pilotReqd == other.pilotReqd && portName == other.portName && shelter == other.shelter && sourceDl == other.sourceDl && tideRange == other.tideRange && updatedAt == other.updatedAt && updatedBy == other.updatedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, source, id, avgDuration, countryCode, createdAt, createdBy, externalId, harborSize, harborType, idSite, lat, locode, lon, maxDraught, origin, origNetwork, pilotReqd, portName, shelter, sourceDl, tideRange, updatedAt, updatedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortGetResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, id=$id, avgDuration=$avgDuration, countryCode=$countryCode, createdAt=$createdAt, createdBy=$createdBy, externalId=$externalId, harborSize=$harborSize, harborType=$harborType, idSite=$idSite, lat=$lat, locode=$locode, lon=$lon, maxDraught=$maxDraught, origin=$origin, origNetwork=$origNetwork, pilotReqd=$pilotReqd, portName=$portName, shelter=$shelter, sourceDl=$sourceDl, tideRange=$tideRange, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

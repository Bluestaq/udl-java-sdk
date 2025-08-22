// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.launchevent

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
import com.unifieddatalibrary.api.models.OnorbitFull
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Information on known launch events. */
class LaunchEventGetResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val msgCreateDate: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val beNumber: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val declassificationDate: JsonField<OffsetDateTime>,
    private val declassificationString: JsonField<String>,
    private val derivedFrom: JsonField<String>,
    private val idOnOrbit: JsonField<String>,
    private val launchDate: JsonField<OffsetDateTime>,
    private val launchFacilityName: JsonField<String>,
    private val launchFailureCode: JsonField<String>,
    private val onOrbit: JsonField<OnorbitFull>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val oSuffix: JsonField<String>,
    private val satNo: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("msgCreateDate")
        @ExcludeMissing
        msgCreateDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beNumber") @ExcludeMissing beNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("declassificationDate")
        @ExcludeMissing
        declassificationDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("declassificationString")
        @ExcludeMissing
        declassificationString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("derivedFrom")
        @ExcludeMissing
        derivedFrom: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchDate")
        @ExcludeMissing
        launchDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("launchFacilityName")
        @ExcludeMissing
        launchFacilityName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchFailureCode")
        @ExcludeMissing
        launchFailureCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("onOrbit") @ExcludeMissing onOrbit: JsonField<OnorbitFull> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("oSuffix") @ExcludeMissing oSuffix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        msgCreateDate,
        source,
        id,
        beNumber,
        createdAt,
        createdBy,
        declassificationDate,
        declassificationString,
        derivedFrom,
        idOnOrbit,
        launchDate,
        launchFacilityName,
        launchFailureCode,
        onOrbit,
        origin,
        origNetwork,
        origObjectId,
        oSuffix,
        satNo,
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
     * Timestamp of the originating message in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun msgCreateDate(): OffsetDateTime = msgCreateDate.getRequired("msgCreateDate")

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
     * The Basic Encyclopedia Number, if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun beNumber(): Optional<String> = beNumber.getOptional("beNumber")

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
     * The declassification date of this data, in ISO 8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun declassificationDate(): Optional<OffsetDateTime> =
        declassificationDate.getOptional("declassificationDate")

    /**
     * Declassification string of this data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun declassificationString(): Optional<String> =
        declassificationString.getOptional("declassificationString")

    /**
     * The sources or SCG references from which the classification of this data is derived.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun derivedFrom(): Optional<String> = derivedFrom.getOptional("derivedFrom")

    /**
     * Unique identifier of the target on-orbit object, if correlated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * The launch date, in ISO8601 UTC format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchDate(): Optional<OffsetDateTime> = launchDate.getOptional("launchDate")

    /**
     * The Launch facility name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchFacilityName(): Optional<String> =
        launchFacilityName.getOptional("launchFacilityName")

    /**
     * The DISOB launch Failure Code, if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchFailureCode(): Optional<String> = launchFailureCode.getOptional("launchFailureCode")

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
     * Optional target-id, if missing in UDL.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * The OSuffix, if applicable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun oSuffix(): Optional<String> = oSuffix.getOptional("oSuffix")

    /**
     * Satellite/catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

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
     * Returns the raw JSON value of [msgCreateDate].
     *
     * Unlike [msgCreateDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msgCreateDate")
    @ExcludeMissing
    fun _msgCreateDate(): JsonField<OffsetDateTime> = msgCreateDate

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
     * Returns the raw JSON value of [beNumber].
     *
     * Unlike [beNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beNumber") @ExcludeMissing fun _beNumber(): JsonField<String> = beNumber

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
     * Returns the raw JSON value of [declassificationDate].
     *
     * Unlike [declassificationDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("declassificationDate")
    @ExcludeMissing
    fun _declassificationDate(): JsonField<OffsetDateTime> = declassificationDate

    /**
     * Returns the raw JSON value of [declassificationString].
     *
     * Unlike [declassificationString], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("declassificationString")
    @ExcludeMissing
    fun _declassificationString(): JsonField<String> = declassificationString

    /**
     * Returns the raw JSON value of [derivedFrom].
     *
     * Unlike [derivedFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("derivedFrom") @ExcludeMissing fun _derivedFrom(): JsonField<String> = derivedFrom

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [launchDate].
     *
     * Unlike [launchDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchDate")
    @ExcludeMissing
    fun _launchDate(): JsonField<OffsetDateTime> = launchDate

    /**
     * Returns the raw JSON value of [launchFacilityName].
     *
     * Unlike [launchFacilityName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("launchFacilityName")
    @ExcludeMissing
    fun _launchFacilityName(): JsonField<String> = launchFacilityName

    /**
     * Returns the raw JSON value of [launchFailureCode].
     *
     * Unlike [launchFailureCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("launchFailureCode")
    @ExcludeMissing
    fun _launchFailureCode(): JsonField<String> = launchFailureCode

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
     * Returns the raw JSON value of [origObjectId].
     *
     * Unlike [origObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origObjectId")
    @ExcludeMissing
    fun _origObjectId(): JsonField<String> = origObjectId

    /**
     * Returns the raw JSON value of [oSuffix].
     *
     * Unlike [oSuffix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("oSuffix") @ExcludeMissing fun _oSuffix(): JsonField<String> = oSuffix

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

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
         * Returns a mutable builder for constructing an instance of [LaunchEventGetResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .msgCreateDate()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LaunchEventGetResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var msgCreateDate: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var beNumber: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var declassificationDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var declassificationString: JsonField<String> = JsonMissing.of()
        private var derivedFrom: JsonField<String> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var launchDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var launchFacilityName: JsonField<String> = JsonMissing.of()
        private var launchFailureCode: JsonField<String> = JsonMissing.of()
        private var onOrbit: JsonField<OnorbitFull> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var oSuffix: JsonField<String> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(launchEventGetResponse: LaunchEventGetResponse) = apply {
            classificationMarking = launchEventGetResponse.classificationMarking
            dataMode = launchEventGetResponse.dataMode
            msgCreateDate = launchEventGetResponse.msgCreateDate
            source = launchEventGetResponse.source
            id = launchEventGetResponse.id
            beNumber = launchEventGetResponse.beNumber
            createdAt = launchEventGetResponse.createdAt
            createdBy = launchEventGetResponse.createdBy
            declassificationDate = launchEventGetResponse.declassificationDate
            declassificationString = launchEventGetResponse.declassificationString
            derivedFrom = launchEventGetResponse.derivedFrom
            idOnOrbit = launchEventGetResponse.idOnOrbit
            launchDate = launchEventGetResponse.launchDate
            launchFacilityName = launchEventGetResponse.launchFacilityName
            launchFailureCode = launchEventGetResponse.launchFailureCode
            onOrbit = launchEventGetResponse.onOrbit
            origin = launchEventGetResponse.origin
            origNetwork = launchEventGetResponse.origNetwork
            origObjectId = launchEventGetResponse.origObjectId
            oSuffix = launchEventGetResponse.oSuffix
            satNo = launchEventGetResponse.satNo
            additionalProperties = launchEventGetResponse.additionalProperties.toMutableMap()
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

        /** Timestamp of the originating message in ISO8601 UTC format. */
        fun msgCreateDate(msgCreateDate: OffsetDateTime) =
            msgCreateDate(JsonField.of(msgCreateDate))

        /**
         * Sets [Builder.msgCreateDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msgCreateDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun msgCreateDate(msgCreateDate: JsonField<OffsetDateTime>) = apply {
            this.msgCreateDate = msgCreateDate
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

        /** The Basic Encyclopedia Number, if applicable. */
        fun beNumber(beNumber: String) = beNumber(JsonField.of(beNumber))

        /**
         * Sets [Builder.beNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beNumber] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun beNumber(beNumber: JsonField<String>) = apply { this.beNumber = beNumber }

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

        /** The declassification date of this data, in ISO 8601 UTC format. */
        fun declassificationDate(declassificationDate: OffsetDateTime) =
            declassificationDate(JsonField.of(declassificationDate))

        /**
         * Sets [Builder.declassificationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declassificationDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun declassificationDate(declassificationDate: JsonField<OffsetDateTime>) = apply {
            this.declassificationDate = declassificationDate
        }

        /** Declassification string of this data. */
        fun declassificationString(declassificationString: String) =
            declassificationString(JsonField.of(declassificationString))

        /**
         * Sets [Builder.declassificationString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declassificationString] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun declassificationString(declassificationString: JsonField<String>) = apply {
            this.declassificationString = declassificationString
        }

        /** The sources or SCG references from which the classification of this data is derived. */
        fun derivedFrom(derivedFrom: String) = derivedFrom(JsonField.of(derivedFrom))

        /**
         * Sets [Builder.derivedFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.derivedFrom] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun derivedFrom(derivedFrom: JsonField<String>) = apply { this.derivedFrom = derivedFrom }

        /** Unique identifier of the target on-orbit object, if correlated. */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /** The launch date, in ISO8601 UTC format. */
        fun launchDate(launchDate: OffsetDateTime) = launchDate(JsonField.of(launchDate))

        /**
         * Sets [Builder.launchDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchDate(launchDate: JsonField<OffsetDateTime>) = apply {
            this.launchDate = launchDate
        }

        /** The Launch facility name. */
        fun launchFacilityName(launchFacilityName: String) =
            launchFacilityName(JsonField.of(launchFacilityName))

        /**
         * Sets [Builder.launchFacilityName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchFacilityName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchFacilityName(launchFacilityName: JsonField<String>) = apply {
            this.launchFacilityName = launchFacilityName
        }

        /** The DISOB launch Failure Code, if applicable. */
        fun launchFailureCode(launchFailureCode: String) =
            launchFailureCode(JsonField.of(launchFailureCode))

        /**
         * Sets [Builder.launchFailureCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchFailureCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchFailureCode(launchFailureCode: JsonField<String>) = apply {
            this.launchFailureCode = launchFailureCode
        }

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

        /** Optional target-id, if missing in UDL. */
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

        /** The OSuffix, if applicable. */
        fun oSuffix(oSuffix: String) = oSuffix(JsonField.of(oSuffix))

        /**
         * Sets [Builder.oSuffix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oSuffix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun oSuffix(oSuffix: JsonField<String>) = apply { this.oSuffix = oSuffix }

        /** Satellite/catalog number of the target on-orbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

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
         * Returns an immutable instance of [LaunchEventGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .msgCreateDate()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LaunchEventGetResponse =
            LaunchEventGetResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("msgCreateDate", msgCreateDate),
                checkRequired("source", source),
                id,
                beNumber,
                createdAt,
                createdBy,
                declassificationDate,
                declassificationString,
                derivedFrom,
                idOnOrbit,
                launchDate,
                launchFacilityName,
                launchFailureCode,
                onOrbit,
                origin,
                origNetwork,
                origObjectId,
                oSuffix,
                satNo,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LaunchEventGetResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        msgCreateDate()
        source()
        id()
        beNumber()
        createdAt()
        createdBy()
        declassificationDate()
        declassificationString()
        derivedFrom()
        idOnOrbit()
        launchDate()
        launchFacilityName()
        launchFailureCode()
        onOrbit().ifPresent { it.validate() }
        origin()
        origNetwork()
        origObjectId()
        oSuffix()
        satNo()
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
            (if (msgCreateDate.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (beNumber.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (declassificationDate.asKnown().isPresent) 1 else 0) +
            (if (declassificationString.asKnown().isPresent) 1 else 0) +
            (if (derivedFrom.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (launchDate.asKnown().isPresent) 1 else 0) +
            (if (launchFacilityName.asKnown().isPresent) 1 else 0) +
            (if (launchFailureCode.asKnown().isPresent) 1 else 0) +
            (onOrbit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (oSuffix.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0)

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LaunchEventGetResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            msgCreateDate == other.msgCreateDate &&
            source == other.source &&
            id == other.id &&
            beNumber == other.beNumber &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            declassificationDate == other.declassificationDate &&
            declassificationString == other.declassificationString &&
            derivedFrom == other.derivedFrom &&
            idOnOrbit == other.idOnOrbit &&
            launchDate == other.launchDate &&
            launchFacilityName == other.launchFacilityName &&
            launchFailureCode == other.launchFailureCode &&
            onOrbit == other.onOrbit &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            oSuffix == other.oSuffix &&
            satNo == other.satNo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            msgCreateDate,
            source,
            id,
            beNumber,
            createdAt,
            createdBy,
            declassificationDate,
            declassificationString,
            derivedFrom,
            idOnOrbit,
            launchDate,
            launchFacilityName,
            launchFailureCode,
            onOrbit,
            origin,
            origNetwork,
            origObjectId,
            oSuffix,
            satNo,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LaunchEventGetResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, msgCreateDate=$msgCreateDate, source=$source, id=$id, beNumber=$beNumber, createdAt=$createdAt, createdBy=$createdBy, declassificationDate=$declassificationDate, declassificationString=$declassificationString, derivedFrom=$derivedFrom, idOnOrbit=$idOnOrbit, launchDate=$launchDate, launchFacilityName=$launchFacilityName, launchFailureCode=$launchFailureCode, onOrbit=$onOrbit, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, oSuffix=$oSuffix, satNo=$satNo, additionalProperties=$additionalProperties}"
}

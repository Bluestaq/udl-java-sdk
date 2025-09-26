// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.isrcollections

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class IsrCollectionRequirementsFull
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val country: JsonField<String>,
    private val cridNumbers: JsonField<String>,
    private val criticalTimes: JsonField<IsrCollectionCriticalTimesFull>,
    private val emphasized: JsonField<Boolean>,
    private val exploitationRequirement: JsonField<IsrCollectionExploitationRequirementFull>,
    private val hash: JsonField<String>,
    private val intelDiscipline: JsonField<String>,
    private val isPrismCr: JsonField<Boolean>,
    private val operation: JsonField<String>,
    private val priority: JsonField<Double>,
    private val reconSurvey: JsonField<String>,
    private val recordId: JsonField<String>,
    private val region: JsonField<String>,
    private val secondary: JsonField<Boolean>,
    private val specialComGuidance: JsonField<String>,
    private val start: JsonField<OffsetDateTime>,
    private val stop: JsonField<OffsetDateTime>,
    private val subregion: JsonField<String>,
    private val supportedUnit: JsonField<String>,
    private val targetList: JsonField<List<String>>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cridNumbers")
        @ExcludeMissing
        cridNumbers: JsonField<String> = JsonMissing.of(),
        @JsonProperty("criticalTimes")
        @ExcludeMissing
        criticalTimes: JsonField<IsrCollectionCriticalTimesFull> = JsonMissing.of(),
        @JsonProperty("emphasized")
        @ExcludeMissing
        emphasized: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("exploitationRequirement")
        @ExcludeMissing
        exploitationRequirement: JsonField<IsrCollectionExploitationRequirementFull> =
            JsonMissing.of(),
        @JsonProperty("hash") @ExcludeMissing hash: JsonField<String> = JsonMissing.of(),
        @JsonProperty("intelDiscipline")
        @ExcludeMissing
        intelDiscipline: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isPrismCr") @ExcludeMissing isPrismCr: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("operation") @ExcludeMissing operation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("reconSurvey")
        @ExcludeMissing
        reconSurvey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recordId") @ExcludeMissing recordId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secondary") @ExcludeMissing secondary: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("specialComGuidance")
        @ExcludeMissing
        specialComGuidance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start") @ExcludeMissing start: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("stop") @ExcludeMissing stop: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("subregion") @ExcludeMissing subregion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supportedUnit")
        @ExcludeMissing
        supportedUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("targetList")
        @ExcludeMissing
        targetList: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        country,
        cridNumbers,
        criticalTimes,
        emphasized,
        exploitationRequirement,
        hash,
        intelDiscipline,
        isPrismCr,
        operation,
        priority,
        reconSurvey,
        recordId,
        region,
        secondary,
        specialComGuidance,
        start,
        stop,
        subregion,
        supportedUnit,
        targetList,
        type,
        mutableMapOf(),
    )

    /**
     * Collection Requirement Unique Identifier.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Country code of the collection requirement. A Country may represent countries, multi-national
     * consortiums, and international organizations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun country(): Optional<String> = country.getOptional("country")

    /**
     * Collection Requirement Unique Identifier.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cridNumbers(): Optional<String> = cridNumbers.getOptional("cridNumbers")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun criticalTimes(): Optional<IsrCollectionCriticalTimesFull> =
        criticalTimes.getOptional("criticalTimes")

    /**
     * Is this collection requirement an emphasized/critical requirement.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun emphasized(): Optional<Boolean> = emphasized.getOptional("emphasized")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun exploitationRequirement(): Optional<IsrCollectionExploitationRequirementFull> =
        exploitationRequirement.getOptional("exploitationRequirement")

    /**
     * Encryption hashing algorithm.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hash(): Optional<String> = hash.getOptional("hash")

    /**
     * Primary type of intelligence to be collected for this requirement.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun intelDiscipline(): Optional<String> = intelDiscipline.getOptional("intelDiscipline")

    /**
     * Is this collection request for the Prism system?.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun isPrismCr(): Optional<Boolean> = isPrismCr.getOptional("isPrismCr")

    /**
     * Human readable name for this operation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operation(): Optional<String> = operation.getOptional("operation")

    /**
     * 1-n priority for this collection requirement.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun priority(): Optional<Double> = priority.getOptional("priority")

    /**
     * Reconnaissance Survey information the operator needs.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reconSurvey(): Optional<String> = reconSurvey.getOptional("reconSurvey")

    /**
     * Record id.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun recordId(): Optional<String> = recordId.getOptional("recordId")

    /**
     * Region of the collection requirement.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun region(): Optional<String> = region.getOptional("region")

    /**
     * Sub category of primary intelligence to be collected for this requirement.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun secondary(): Optional<Boolean> = secondary.getOptional("secondary")

    /**
     * Free text field for the user to specify special instructions needed for this collection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun specialComGuidance(): Optional<String> =
        specialComGuidance.getOptional("specialComGuidance")

    /**
     * Start time for this requirement, should be within the mission time window.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun start(): Optional<OffsetDateTime> = start.getOptional("start")

    /**
     * Stop time for this requirement, should be within the mission time window.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stop(): Optional<OffsetDateTime> = stop.getOptional("stop")

    /**
     * Subregion of the collection requirement.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun subregion(): Optional<String> = subregion.getOptional("subregion")

    /**
     * The name of the military unit that this assigned collection requirement will support.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun supportedUnit(): Optional<String> = supportedUnit.getOptional("supportedUnit")

    /**
     * Array of POI Id's for the targets being tasked.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun targetList(): Optional<List<String>> = targetList.getOptional("targetList")

    /**
     * Type collection this requirement applies to.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [cridNumbers].
     *
     * Unlike [cridNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cridNumbers") @ExcludeMissing fun _cridNumbers(): JsonField<String> = cridNumbers

    /**
     * Returns the raw JSON value of [criticalTimes].
     *
     * Unlike [criticalTimes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("criticalTimes")
    @ExcludeMissing
    fun _criticalTimes(): JsonField<IsrCollectionCriticalTimesFull> = criticalTimes

    /**
     * Returns the raw JSON value of [emphasized].
     *
     * Unlike [emphasized], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emphasized") @ExcludeMissing fun _emphasized(): JsonField<Boolean> = emphasized

    /**
     * Returns the raw JSON value of [exploitationRequirement].
     *
     * Unlike [exploitationRequirement], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("exploitationRequirement")
    @ExcludeMissing
    fun _exploitationRequirement(): JsonField<IsrCollectionExploitationRequirementFull> =
        exploitationRequirement

    /**
     * Returns the raw JSON value of [hash].
     *
     * Unlike [hash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hash") @ExcludeMissing fun _hash(): JsonField<String> = hash

    /**
     * Returns the raw JSON value of [intelDiscipline].
     *
     * Unlike [intelDiscipline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intelDiscipline")
    @ExcludeMissing
    fun _intelDiscipline(): JsonField<String> = intelDiscipline

    /**
     * Returns the raw JSON value of [isPrismCr].
     *
     * Unlike [isPrismCr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isPrismCr") @ExcludeMissing fun _isPrismCr(): JsonField<Boolean> = isPrismCr

    /**
     * Returns the raw JSON value of [operation].
     *
     * Unlike [operation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operation") @ExcludeMissing fun _operation(): JsonField<String> = operation

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

    /**
     * Returns the raw JSON value of [reconSurvey].
     *
     * Unlike [reconSurvey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reconSurvey") @ExcludeMissing fun _reconSurvey(): JsonField<String> = reconSurvey

    /**
     * Returns the raw JSON value of [recordId].
     *
     * Unlike [recordId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recordId") @ExcludeMissing fun _recordId(): JsonField<String> = recordId

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

    /**
     * Returns the raw JSON value of [secondary].
     *
     * Unlike [secondary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secondary") @ExcludeMissing fun _secondary(): JsonField<Boolean> = secondary

    /**
     * Returns the raw JSON value of [specialComGuidance].
     *
     * Unlike [specialComGuidance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("specialComGuidance")
    @ExcludeMissing
    fun _specialComGuidance(): JsonField<String> = specialComGuidance

    /**
     * Returns the raw JSON value of [start].
     *
     * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<OffsetDateTime> = start

    /**
     * Returns the raw JSON value of [stop].
     *
     * Unlike [stop], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stop") @ExcludeMissing fun _stop(): JsonField<OffsetDateTime> = stop

    /**
     * Returns the raw JSON value of [subregion].
     *
     * Unlike [subregion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subregion") @ExcludeMissing fun _subregion(): JsonField<String> = subregion

    /**
     * Returns the raw JSON value of [supportedUnit].
     *
     * Unlike [supportedUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("supportedUnit")
    @ExcludeMissing
    fun _supportedUnit(): JsonField<String> = supportedUnit

    /**
     * Returns the raw JSON value of [targetList].
     *
     * Unlike [targetList], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetList")
    @ExcludeMissing
    fun _targetList(): JsonField<List<String>> = targetList

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
         * [IsrCollectionRequirementsFull].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IsrCollectionRequirementsFull]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var cridNumbers: JsonField<String> = JsonMissing.of()
        private var criticalTimes: JsonField<IsrCollectionCriticalTimesFull> = JsonMissing.of()
        private var emphasized: JsonField<Boolean> = JsonMissing.of()
        private var exploitationRequirement: JsonField<IsrCollectionExploitationRequirementFull> =
            JsonMissing.of()
        private var hash: JsonField<String> = JsonMissing.of()
        private var intelDiscipline: JsonField<String> = JsonMissing.of()
        private var isPrismCr: JsonField<Boolean> = JsonMissing.of()
        private var operation: JsonField<String> = JsonMissing.of()
        private var priority: JsonField<Double> = JsonMissing.of()
        private var reconSurvey: JsonField<String> = JsonMissing.of()
        private var recordId: JsonField<String> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var secondary: JsonField<Boolean> = JsonMissing.of()
        private var specialComGuidance: JsonField<String> = JsonMissing.of()
        private var start: JsonField<OffsetDateTime> = JsonMissing.of()
        private var stop: JsonField<OffsetDateTime> = JsonMissing.of()
        private var subregion: JsonField<String> = JsonMissing.of()
        private var supportedUnit: JsonField<String> = JsonMissing.of()
        private var targetList: JsonField<MutableList<String>>? = null
        private var type: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(isrCollectionRequirementsFull: IsrCollectionRequirementsFull) = apply {
            id = isrCollectionRequirementsFull.id
            country = isrCollectionRequirementsFull.country
            cridNumbers = isrCollectionRequirementsFull.cridNumbers
            criticalTimes = isrCollectionRequirementsFull.criticalTimes
            emphasized = isrCollectionRequirementsFull.emphasized
            exploitationRequirement = isrCollectionRequirementsFull.exploitationRequirement
            hash = isrCollectionRequirementsFull.hash
            intelDiscipline = isrCollectionRequirementsFull.intelDiscipline
            isPrismCr = isrCollectionRequirementsFull.isPrismCr
            operation = isrCollectionRequirementsFull.operation
            priority = isrCollectionRequirementsFull.priority
            reconSurvey = isrCollectionRequirementsFull.reconSurvey
            recordId = isrCollectionRequirementsFull.recordId
            region = isrCollectionRequirementsFull.region
            secondary = isrCollectionRequirementsFull.secondary
            specialComGuidance = isrCollectionRequirementsFull.specialComGuidance
            start = isrCollectionRequirementsFull.start
            stop = isrCollectionRequirementsFull.stop
            subregion = isrCollectionRequirementsFull.subregion
            supportedUnit = isrCollectionRequirementsFull.supportedUnit
            targetList = isrCollectionRequirementsFull.targetList.map { it.toMutableList() }
            type = isrCollectionRequirementsFull.type
            additionalProperties = isrCollectionRequirementsFull.additionalProperties.toMutableMap()
        }

        /** Collection Requirement Unique Identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Country code of the collection requirement. A Country may represent countries,
         * multi-national consortiums, and international organizations.
         */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** Collection Requirement Unique Identifier. */
        fun cridNumbers(cridNumbers: String) = cridNumbers(JsonField.of(cridNumbers))

        /**
         * Sets [Builder.cridNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cridNumbers] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cridNumbers(cridNumbers: JsonField<String>) = apply { this.cridNumbers = cridNumbers }

        fun criticalTimes(criticalTimes: IsrCollectionCriticalTimesFull) =
            criticalTimes(JsonField.of(criticalTimes))

        /**
         * Sets [Builder.criticalTimes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.criticalTimes] with a well-typed
         * [IsrCollectionCriticalTimesFull] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun criticalTimes(criticalTimes: JsonField<IsrCollectionCriticalTimesFull>) = apply {
            this.criticalTimes = criticalTimes
        }

        /** Is this collection requirement an emphasized/critical requirement. */
        fun emphasized(emphasized: Boolean) = emphasized(JsonField.of(emphasized))

        /**
         * Sets [Builder.emphasized] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emphasized] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emphasized(emphasized: JsonField<Boolean>) = apply { this.emphasized = emphasized }

        fun exploitationRequirement(
            exploitationRequirement: IsrCollectionExploitationRequirementFull
        ) = exploitationRequirement(JsonField.of(exploitationRequirement))

        /**
         * Sets [Builder.exploitationRequirement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exploitationRequirement] with a well-typed
         * [IsrCollectionExploitationRequirementFull] value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun exploitationRequirement(
            exploitationRequirement: JsonField<IsrCollectionExploitationRequirementFull>
        ) = apply { this.exploitationRequirement = exploitationRequirement }

        /** Encryption hashing algorithm. */
        fun hash(hash: String) = hash(JsonField.of(hash))

        /**
         * Sets [Builder.hash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hash] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hash(hash: JsonField<String>) = apply { this.hash = hash }

        /** Primary type of intelligence to be collected for this requirement. */
        fun intelDiscipline(intelDiscipline: String) =
            intelDiscipline(JsonField.of(intelDiscipline))

        /**
         * Sets [Builder.intelDiscipline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intelDiscipline] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun intelDiscipline(intelDiscipline: JsonField<String>) = apply {
            this.intelDiscipline = intelDiscipline
        }

        /** Is this collection request for the Prism system?. */
        fun isPrismCr(isPrismCr: Boolean) = isPrismCr(JsonField.of(isPrismCr))

        /**
         * Sets [Builder.isPrismCr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPrismCr] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPrismCr(isPrismCr: JsonField<Boolean>) = apply { this.isPrismCr = isPrismCr }

        /** Human readable name for this operation. */
        fun operation(operation: String) = operation(JsonField.of(operation))

        /**
         * Sets [Builder.operation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operation(operation: JsonField<String>) = apply { this.operation = operation }

        /** 1-n priority for this collection requirement. */
        fun priority(priority: Double) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

        /** Reconnaissance Survey information the operator needs. */
        fun reconSurvey(reconSurvey: String) = reconSurvey(JsonField.of(reconSurvey))

        /**
         * Sets [Builder.reconSurvey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reconSurvey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reconSurvey(reconSurvey: JsonField<String>) = apply { this.reconSurvey = reconSurvey }

        /** Record id. */
        fun recordId(recordId: String) = recordId(JsonField.of(recordId))

        /**
         * Sets [Builder.recordId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun recordId(recordId: JsonField<String>) = apply { this.recordId = recordId }

        /** Region of the collection requirement. */
        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

        /** Sub category of primary intelligence to be collected for this requirement. */
        fun secondary(secondary: Boolean) = secondary(JsonField.of(secondary))

        /**
         * Sets [Builder.secondary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondary] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun secondary(secondary: JsonField<Boolean>) = apply { this.secondary = secondary }

        /**
         * Free text field for the user to specify special instructions needed for this collection.
         */
        fun specialComGuidance(specialComGuidance: String) =
            specialComGuidance(JsonField.of(specialComGuidance))

        /**
         * Sets [Builder.specialComGuidance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specialComGuidance] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun specialComGuidance(specialComGuidance: JsonField<String>) = apply {
            this.specialComGuidance = specialComGuidance
        }

        /** Start time for this requirement, should be within the mission time window. */
        fun start(start: OffsetDateTime) = start(JsonField.of(start))

        /**
         * Sets [Builder.start] to an arbitrary JSON value.
         *
         * You should usually call [Builder.start] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

        /** Stop time for this requirement, should be within the mission time window. */
        fun stop(stop: OffsetDateTime) = stop(JsonField.of(stop))

        /**
         * Sets [Builder.stop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stop] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stop(stop: JsonField<OffsetDateTime>) = apply { this.stop = stop }

        /** Subregion of the collection requirement. */
        fun subregion(subregion: String) = subregion(JsonField.of(subregion))

        /**
         * Sets [Builder.subregion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subregion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subregion(subregion: JsonField<String>) = apply { this.subregion = subregion }

        /** The name of the military unit that this assigned collection requirement will support. */
        fun supportedUnit(supportedUnit: String) = supportedUnit(JsonField.of(supportedUnit))

        /**
         * Sets [Builder.supportedUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedUnit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun supportedUnit(supportedUnit: JsonField<String>) = apply {
            this.supportedUnit = supportedUnit
        }

        /** Array of POI Id's for the targets being tasked. */
        fun targetList(targetList: List<String>) = targetList(JsonField.of(targetList))

        /**
         * Sets [Builder.targetList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetList] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetList(targetList: JsonField<List<String>>) = apply {
            this.targetList = targetList.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.targetList].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTargetList(targetList: String) = apply {
            this.targetList =
                (this.targetList ?: JsonField.of(mutableListOf())).also {
                    checkKnown("targetList", it).add(targetList)
                }
        }

        /** Type collection this requirement applies to. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Returns an immutable instance of [IsrCollectionRequirementsFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): IsrCollectionRequirementsFull =
            IsrCollectionRequirementsFull(
                id,
                country,
                cridNumbers,
                criticalTimes,
                emphasized,
                exploitationRequirement,
                hash,
                intelDiscipline,
                isPrismCr,
                operation,
                priority,
                reconSurvey,
                recordId,
                region,
                secondary,
                specialComGuidance,
                start,
                stop,
                subregion,
                supportedUnit,
                (targetList ?: JsonMissing.of()).map { it.toImmutable() },
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IsrCollectionRequirementsFull = apply {
        if (validated) {
            return@apply
        }

        id()
        country()
        cridNumbers()
        criticalTimes().ifPresent { it.validate() }
        emphasized()
        exploitationRequirement().ifPresent { it.validate() }
        hash()
        intelDiscipline()
        isPrismCr()
        operation()
        priority()
        reconSurvey()
        recordId()
        region()
        secondary()
        specialComGuidance()
        start()
        stop()
        subregion()
        supportedUnit()
        targetList()
        type()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (country.asKnown().isPresent) 1 else 0) +
            (if (cridNumbers.asKnown().isPresent) 1 else 0) +
            (criticalTimes.asKnown().getOrNull()?.validity() ?: 0) +
            (if (emphasized.asKnown().isPresent) 1 else 0) +
            (exploitationRequirement.asKnown().getOrNull()?.validity() ?: 0) +
            (if (hash.asKnown().isPresent) 1 else 0) +
            (if (intelDiscipline.asKnown().isPresent) 1 else 0) +
            (if (isPrismCr.asKnown().isPresent) 1 else 0) +
            (if (operation.asKnown().isPresent) 1 else 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (if (reconSurvey.asKnown().isPresent) 1 else 0) +
            (if (recordId.asKnown().isPresent) 1 else 0) +
            (if (region.asKnown().isPresent) 1 else 0) +
            (if (secondary.asKnown().isPresent) 1 else 0) +
            (if (specialComGuidance.asKnown().isPresent) 1 else 0) +
            (if (start.asKnown().isPresent) 1 else 0) +
            (if (stop.asKnown().isPresent) 1 else 0) +
            (if (subregion.asKnown().isPresent) 1 else 0) +
            (if (supportedUnit.asKnown().isPresent) 1 else 0) +
            (targetList.asKnown().getOrNull()?.size ?: 0) +
            (if (type.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IsrCollectionRequirementsFull &&
            id == other.id &&
            country == other.country &&
            cridNumbers == other.cridNumbers &&
            criticalTimes == other.criticalTimes &&
            emphasized == other.emphasized &&
            exploitationRequirement == other.exploitationRequirement &&
            hash == other.hash &&
            intelDiscipline == other.intelDiscipline &&
            isPrismCr == other.isPrismCr &&
            operation == other.operation &&
            priority == other.priority &&
            reconSurvey == other.reconSurvey &&
            recordId == other.recordId &&
            region == other.region &&
            secondary == other.secondary &&
            specialComGuidance == other.specialComGuidance &&
            start == other.start &&
            stop == other.stop &&
            subregion == other.subregion &&
            supportedUnit == other.supportedUnit &&
            targetList == other.targetList &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            country,
            cridNumbers,
            criticalTimes,
            emphasized,
            exploitationRequirement,
            hash,
            intelDiscipline,
            isPrismCr,
            operation,
            priority,
            reconSurvey,
            recordId,
            region,
            secondary,
            specialComGuidance,
            start,
            stop,
            subregion,
            supportedUnit,
            targetList,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IsrCollectionRequirementsFull{id=$id, country=$country, cridNumbers=$cridNumbers, criticalTimes=$criticalTimes, emphasized=$emphasized, exploitationRequirement=$exploitationRequirement, hash=$hash, intelDiscipline=$intelDiscipline, isPrismCr=$isPrismCr, operation=$operation, priority=$priority, reconSurvey=$reconSurvey, recordId=$recordId, region=$region, secondary=$secondary, specialComGuidance=$specialComGuidance, start=$start, stop=$stop, subregion=$subregion, supportedUnit=$supportedUnit, targetList=$targetList, type=$type, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitlist

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

/** Table for maintaining generic lists of OnOrbit objects (e.g. Favorites, HIO, SHIO, HVA, etc). */
class OnorbitlistTupleResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val name: JsonField<String>,
    private val onOrbitListItems: JsonField<List<OnOrbitListItem>>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val defaultRevisitRateMins: JsonField<Double>,
    private val description: JsonField<String>,
    private val listPriority: JsonField<Double>,
    private val namespace: JsonField<String>,
    private val origin: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val transactionId: JsonField<String>,
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
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("onOrbitListItems")
        @ExcludeMissing
        onOrbitListItems: JsonField<List<OnOrbitListItem>> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("defaultRevisitRateMins")
        @ExcludeMissing
        defaultRevisitRateMins: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("listPriority")
        @ExcludeMissing
        listPriority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("namespace") @ExcludeMissing namespace: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        name,
        onOrbitListItems,
        source,
        id,
        createdAt,
        createdBy,
        defaultRevisitRateMins,
        description,
        listPriority,
        namespace,
        origin,
        sourceDl,
        tags,
        transactionId,
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
     * Unique name of the list.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * This is a list of onOrbitListItems that will be related one-to-one with an onOrbit entry.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun onOrbitListItems(): List<OnOrbitListItem> = onOrbitListItems.getRequired("onOrbitListItems")

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
     * Default revisit rate in minutes for all objects in this list.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun defaultRevisitRateMins(): Optional<Double> =
        defaultRevisitRateMins.getOptional("defaultRevisitRateMins")

    /**
     * Description of the list.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Numerical priority of this orbit list relative to other orbit lists; lower values indicate
     * higher priority. Decimal values allowed for fine granularity. Consumers should contact the
     * provider for details on the priority.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun listPriority(): Optional<Double> = listPriority.getOptional("listPriority")

    /**
     * Defined naming system that ensures each satellite or space object has a unique and
     * unambiguous identifier within the name space (e.g. JCO, 18SDS). If null, it is assumed to be
     * 18th Space Defense Squadron (18SDS).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun namespace(): Optional<String> = namespace.getOptional("namespace")

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [onOrbitListItems].
     *
     * Unlike [onOrbitListItems], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("onOrbitListItems")
    @ExcludeMissing
    fun _onOrbitListItems(): JsonField<List<OnOrbitListItem>> = onOrbitListItems

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
     * Returns the raw JSON value of [defaultRevisitRateMins].
     *
     * Unlike [defaultRevisitRateMins], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("defaultRevisitRateMins")
    @ExcludeMissing
    fun _defaultRevisitRateMins(): JsonField<Double> = defaultRevisitRateMins

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [listPriority].
     *
     * Unlike [listPriority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listPriority")
    @ExcludeMissing
    fun _listPriority(): JsonField<Double> = listPriority

    /**
     * Returns the raw JSON value of [namespace].
     *
     * Unlike [namespace], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("namespace") @ExcludeMissing fun _namespace(): JsonField<String> = namespace

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<String> = origin

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
         * Returns a mutable builder for constructing an instance of [OnorbitlistTupleResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .onOrbitListItems()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnorbitlistTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var name: JsonField<String>? = null
        private var onOrbitListItems: JsonField<MutableList<OnOrbitListItem>>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var defaultRevisitRateMins: JsonField<Double> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var listPriority: JsonField<Double> = JsonMissing.of()
        private var namespace: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onorbitlistTupleResponse: OnorbitlistTupleResponse) = apply {
            classificationMarking = onorbitlistTupleResponse.classificationMarking
            dataMode = onorbitlistTupleResponse.dataMode
            name = onorbitlistTupleResponse.name
            onOrbitListItems = onorbitlistTupleResponse.onOrbitListItems.map { it.toMutableList() }
            source = onorbitlistTupleResponse.source
            id = onorbitlistTupleResponse.id
            createdAt = onorbitlistTupleResponse.createdAt
            createdBy = onorbitlistTupleResponse.createdBy
            defaultRevisitRateMins = onorbitlistTupleResponse.defaultRevisitRateMins
            description = onorbitlistTupleResponse.description
            listPriority = onorbitlistTupleResponse.listPriority
            namespace = onorbitlistTupleResponse.namespace
            origin = onorbitlistTupleResponse.origin
            sourceDl = onorbitlistTupleResponse.sourceDl
            tags = onorbitlistTupleResponse.tags.map { it.toMutableList() }
            transactionId = onorbitlistTupleResponse.transactionId
            updatedAt = onorbitlistTupleResponse.updatedAt
            updatedBy = onorbitlistTupleResponse.updatedBy
            additionalProperties = onorbitlistTupleResponse.additionalProperties.toMutableMap()
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

        /** Unique name of the list. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * This is a list of onOrbitListItems that will be related one-to-one with an onOrbit entry.
         */
        fun onOrbitListItems(onOrbitListItems: List<OnOrbitListItem>) =
            onOrbitListItems(JsonField.of(onOrbitListItems))

        /**
         * Sets [Builder.onOrbitListItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onOrbitListItems] with a well-typed
         * `List<OnOrbitListItem>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun onOrbitListItems(onOrbitListItems: JsonField<List<OnOrbitListItem>>) = apply {
            this.onOrbitListItems = onOrbitListItems.map { it.toMutableList() }
        }

        /**
         * Adds a single [OnOrbitListItem] to [onOrbitListItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOnOrbitListItem(onOrbitListItem: OnOrbitListItem) = apply {
            onOrbitListItems =
                (onOrbitListItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("onOrbitListItems", it).add(onOrbitListItem)
                }
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

        /** Default revisit rate in minutes for all objects in this list. */
        fun defaultRevisitRateMins(defaultRevisitRateMins: Double) =
            defaultRevisitRateMins(JsonField.of(defaultRevisitRateMins))

        /**
         * Sets [Builder.defaultRevisitRateMins] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultRevisitRateMins] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultRevisitRateMins(defaultRevisitRateMins: JsonField<Double>) = apply {
            this.defaultRevisitRateMins = defaultRevisitRateMins
        }

        /** Description of the list. */
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
         * Numerical priority of this orbit list relative to other orbit lists; lower values
         * indicate higher priority. Decimal values allowed for fine granularity. Consumers should
         * contact the provider for details on the priority.
         */
        fun listPriority(listPriority: Double) = listPriority(JsonField.of(listPriority))

        /**
         * Sets [Builder.listPriority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listPriority] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun listPriority(listPriority: JsonField<Double>) = apply {
            this.listPriority = listPriority
        }

        /**
         * Defined naming system that ensures each satellite or space object has a unique and
         * unambiguous identifier within the name space (e.g. JCO, 18SDS). If null, it is assumed to
         * be 18th Space Defense Squadron (18SDS).
         */
        fun namespace(namespace: String) = namespace(JsonField.of(namespace))

        /**
         * Sets [Builder.namespace] to an arbitrary JSON value.
         *
         * You should usually call [Builder.namespace] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun namespace(namespace: JsonField<String>) = apply { this.namespace = namespace }

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
         * Returns an immutable instance of [OnorbitlistTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .name()
         * .onOrbitListItems()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OnorbitlistTupleResponse =
            OnorbitlistTupleResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("name", name),
                checkRequired("onOrbitListItems", onOrbitListItems).map { it.toImmutable() },
                checkRequired("source", source),
                id,
                createdAt,
                createdBy,
                defaultRevisitRateMins,
                description,
                listPriority,
                namespace,
                origin,
                sourceDl,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                transactionId,
                updatedAt,
                updatedBy,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OnorbitlistTupleResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        name()
        onOrbitListItems().forEach { it.validate() }
        source()
        id()
        createdAt()
        createdBy()
        defaultRevisitRateMins()
        description()
        listPriority()
        namespace()
        origin()
        sourceDl()
        tags()
        transactionId()
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (onOrbitListItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (defaultRevisitRateMins.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (listPriority.asKnown().isPresent) 1 else 0) +
            (if (namespace.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0)

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

    /** Items associated with this onOrbitList record. */
    class OnOrbitListItem
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val clearingBoxCrossTrack: JsonField<Double>,
        private val clearingBoxInTrack: JsonField<Double>,
        private val clearingRadius: JsonField<Double>,
        private val commonName: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val expiredOn: JsonField<OffsetDateTime>,
        private val freqMins: JsonField<Double>,
        private val monitoringType: JsonField<String>,
        private val objectId: JsonField<String>,
        private val orbitRegime: JsonField<String>,
        private val origObjectId: JsonField<String>,
        private val payloadPriority: JsonField<Double>,
        private val rank: JsonField<Int>,
        private val urgency: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("clearingBoxCrossTrack")
            @ExcludeMissing
            clearingBoxCrossTrack: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("clearingBoxInTrack")
            @ExcludeMissing
            clearingBoxInTrack: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("clearingRadius")
            @ExcludeMissing
            clearingRadius: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("commonName")
            @ExcludeMissing
            commonName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("countryCode")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiredOn")
            @ExcludeMissing
            expiredOn: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("freqMins")
            @ExcludeMissing
            freqMins: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("monitoringType")
            @ExcludeMissing
            monitoringType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("objectId")
            @ExcludeMissing
            objectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("orbitRegime")
            @ExcludeMissing
            orbitRegime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origObjectId")
            @ExcludeMissing
            origObjectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payloadPriority")
            @ExcludeMissing
            payloadPriority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("rank") @ExcludeMissing rank: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("urgency") @ExcludeMissing urgency: JsonField<Double> = JsonMissing.of(),
        ) : this(
            clearingBoxCrossTrack,
            clearingBoxInTrack,
            clearingRadius,
            commonName,
            countryCode,
            expiredOn,
            freqMins,
            monitoringType,
            objectId,
            orbitRegime,
            origObjectId,
            payloadPriority,
            rank,
            urgency,
            mutableMapOf(),
        )

        /**
         * Height of a box, in degrees, volume expected to be cleared by sensor providers, if
         * CLEARING is selected.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun clearingBoxCrossTrack(): Optional<Double> =
            clearingBoxCrossTrack.getOptional("clearingBoxCrossTrack")

        /**
         * Width of a box volume, in degrees, expected to be cleared by sensor providers, if
         * CLEARING is selected.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun clearingBoxInTrack(): Optional<Double> =
            clearingBoxInTrack.getOptional("clearingBoxInTrack")

        /**
         * Radius, in degrees, of a spherical volume expected to be cleared by sensor providers, if
         * CLEARING is selected.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun clearingRadius(): Optional<Double> = clearingRadius.getOptional("clearingRadius")

        /**
         * Common name of the onorbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun commonName(): Optional<String> = commonName.getOptional("commonName")

        /**
         * This value is typically the ISO 3166 Alpha-3 three-character country code, however it can
         * also represent various consortiums that do not appear in the ISO document.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

        /**
         * Datetime expiration of a satellite on this list, allowing for the maintenance of a
         * history of when satellites entered and when they exited the list in ISO 8601 UTC datetime
         * format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun expiredOn(): Optional<OffsetDateTime> = expiredOn.getOptional("expiredOn")

        /**
         * Frequency of additional routine, in minutes, tasking identified in and corresponding to
         * the monitoringType array.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun freqMins(): Optional<Double> = freqMins.getOptional("freqMins")

        /**
         * Routine tasking that should be applied to this object. REVISIT_RATE allows users to
         * define custom revisit rates for individual satellites, HVA_CLEARING allows users to
         * define custom volumes that are expected to be clear of unknown objects, and POL would be
         * collects on a specified increment in support of collecting data that feeds into Pattern
         * of Life (PoL) assessments.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun monitoringType(): Optional<String> = monitoringType.getOptional("monitoringType")

        /**
         * Unique identifier of the on-orbit object. This is typically the USSF 18th SDS satellite
         * number (also sometimes referred to as NORAD ID/number) but could be an identifier from
         * another satellite catalog namespace. See the ‘namespace’ field for the appropriate
         * identifier namespace. If namespace is null, 18SDS satellite number is assumed.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objectId(): Optional<String> = objectId.getOptional("objectId")

        /**
         * Orbit Regime refers to a classification of a satellite's orbit based on its altitude,
         * inclination, and other orbital characteristics. Common orbit regimes include Low Earth
         * Orbit (LEO), Medium Earth Orbit (MEO), Geostationary Orbit (GEO), and Highly Elliptical
         * Orbit (HEO).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun orbitRegime(): Optional<String> = orbitRegime.getOptional("orbitRegime")

        /**
         * Optional identifier indicates the on-orbit object being referenced. This may be an
         * internal system identifier and not necessarily a valid satellite number.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

        /**
         * Payload priority based on the type of payload that has been identified or that is
         * suspected. Priority of the payload as a number. (1=highest priority).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun payloadPriority(): Optional<Double> = payloadPriority.getOptional("payloadPriority")

        /**
         * Rank refers to the assigned position or level of priority given to a satellite based on
         * its relative importance, urgency, or operational relevance as determined by the
         * applicable operations unit.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rank(): Optional<Int> = rank.getOptional("rank")

        /**
         * Tasking urgency, typically will be on a 1-10 scale. Urgency as a number. (1=highest
         * priority).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun urgency(): Optional<Double> = urgency.getOptional("urgency")

        /**
         * Returns the raw JSON value of [clearingBoxCrossTrack].
         *
         * Unlike [clearingBoxCrossTrack], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("clearingBoxCrossTrack")
        @ExcludeMissing
        fun _clearingBoxCrossTrack(): JsonField<Double> = clearingBoxCrossTrack

        /**
         * Returns the raw JSON value of [clearingBoxInTrack].
         *
         * Unlike [clearingBoxInTrack], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("clearingBoxInTrack")
        @ExcludeMissing
        fun _clearingBoxInTrack(): JsonField<Double> = clearingBoxInTrack

        /**
         * Returns the raw JSON value of [clearingRadius].
         *
         * Unlike [clearingRadius], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("clearingRadius")
        @ExcludeMissing
        fun _clearingRadius(): JsonField<Double> = clearingRadius

        /**
         * Returns the raw JSON value of [commonName].
         *
         * Unlike [commonName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commonName")
        @ExcludeMissing
        fun _commonName(): JsonField<String> = commonName

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryCode")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [expiredOn].
         *
         * Unlike [expiredOn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expiredOn")
        @ExcludeMissing
        fun _expiredOn(): JsonField<OffsetDateTime> = expiredOn

        /**
         * Returns the raw JSON value of [freqMins].
         *
         * Unlike [freqMins], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("freqMins") @ExcludeMissing fun _freqMins(): JsonField<Double> = freqMins

        /**
         * Returns the raw JSON value of [monitoringType].
         *
         * Unlike [monitoringType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("monitoringType")
        @ExcludeMissing
        fun _monitoringType(): JsonField<String> = monitoringType

        /**
         * Returns the raw JSON value of [objectId].
         *
         * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

        /**
         * Returns the raw JSON value of [orbitRegime].
         *
         * Unlike [orbitRegime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("orbitRegime")
        @ExcludeMissing
        fun _orbitRegime(): JsonField<String> = orbitRegime

        /**
         * Returns the raw JSON value of [origObjectId].
         *
         * Unlike [origObjectId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("origObjectId")
        @ExcludeMissing
        fun _origObjectId(): JsonField<String> = origObjectId

        /**
         * Returns the raw JSON value of [payloadPriority].
         *
         * Unlike [payloadPriority], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payloadPriority")
        @ExcludeMissing
        fun _payloadPriority(): JsonField<Double> = payloadPriority

        /**
         * Returns the raw JSON value of [rank].
         *
         * Unlike [rank], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rank") @ExcludeMissing fun _rank(): JsonField<Int> = rank

        /**
         * Returns the raw JSON value of [urgency].
         *
         * Unlike [urgency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("urgency") @ExcludeMissing fun _urgency(): JsonField<Double> = urgency

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

            /** Returns a mutable builder for constructing an instance of [OnOrbitListItem]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OnOrbitListItem]. */
        class Builder internal constructor() {

            private var clearingBoxCrossTrack: JsonField<Double> = JsonMissing.of()
            private var clearingBoxInTrack: JsonField<Double> = JsonMissing.of()
            private var clearingRadius: JsonField<Double> = JsonMissing.of()
            private var commonName: JsonField<String> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var expiredOn: JsonField<OffsetDateTime> = JsonMissing.of()
            private var freqMins: JsonField<Double> = JsonMissing.of()
            private var monitoringType: JsonField<String> = JsonMissing.of()
            private var objectId: JsonField<String> = JsonMissing.of()
            private var orbitRegime: JsonField<String> = JsonMissing.of()
            private var origObjectId: JsonField<String> = JsonMissing.of()
            private var payloadPriority: JsonField<Double> = JsonMissing.of()
            private var rank: JsonField<Int> = JsonMissing.of()
            private var urgency: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(onOrbitListItem: OnOrbitListItem) = apply {
                clearingBoxCrossTrack = onOrbitListItem.clearingBoxCrossTrack
                clearingBoxInTrack = onOrbitListItem.clearingBoxInTrack
                clearingRadius = onOrbitListItem.clearingRadius
                commonName = onOrbitListItem.commonName
                countryCode = onOrbitListItem.countryCode
                expiredOn = onOrbitListItem.expiredOn
                freqMins = onOrbitListItem.freqMins
                monitoringType = onOrbitListItem.monitoringType
                objectId = onOrbitListItem.objectId
                orbitRegime = onOrbitListItem.orbitRegime
                origObjectId = onOrbitListItem.origObjectId
                payloadPriority = onOrbitListItem.payloadPriority
                rank = onOrbitListItem.rank
                urgency = onOrbitListItem.urgency
                additionalProperties = onOrbitListItem.additionalProperties.toMutableMap()
            }

            /**
             * Height of a box, in degrees, volume expected to be cleared by sensor providers, if
             * CLEARING is selected.
             */
            fun clearingBoxCrossTrack(clearingBoxCrossTrack: Double) =
                clearingBoxCrossTrack(JsonField.of(clearingBoxCrossTrack))

            /**
             * Sets [Builder.clearingBoxCrossTrack] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clearingBoxCrossTrack] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun clearingBoxCrossTrack(clearingBoxCrossTrack: JsonField<Double>) = apply {
                this.clearingBoxCrossTrack = clearingBoxCrossTrack
            }

            /**
             * Width of a box volume, in degrees, expected to be cleared by sensor providers, if
             * CLEARING is selected.
             */
            fun clearingBoxInTrack(clearingBoxInTrack: Double) =
                clearingBoxInTrack(JsonField.of(clearingBoxInTrack))

            /**
             * Sets [Builder.clearingBoxInTrack] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clearingBoxInTrack] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clearingBoxInTrack(clearingBoxInTrack: JsonField<Double>) = apply {
                this.clearingBoxInTrack = clearingBoxInTrack
            }

            /**
             * Radius, in degrees, of a spherical volume expected to be cleared by sensor providers,
             * if CLEARING is selected.
             */
            fun clearingRadius(clearingRadius: Double) =
                clearingRadius(JsonField.of(clearingRadius))

            /**
             * Sets [Builder.clearingRadius] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clearingRadius] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clearingRadius(clearingRadius: JsonField<Double>) = apply {
                this.clearingRadius = clearingRadius
            }

            /** Common name of the onorbit object. */
            fun commonName(commonName: String) = commonName(JsonField.of(commonName))

            /**
             * Sets [Builder.commonName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commonName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commonName(commonName: JsonField<String>) = apply { this.commonName = commonName }

            /**
             * This value is typically the ISO 3166 Alpha-3 three-character country code, however it
             * can also represent various consortiums that do not appear in the ISO document.
             */
            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
            }

            /**
             * Datetime expiration of a satellite on this list, allowing for the maintenance of a
             * history of when satellites entered and when they exited the list in ISO 8601 UTC
             * datetime format with millisecond precision.
             */
            fun expiredOn(expiredOn: OffsetDateTime) = expiredOn(JsonField.of(expiredOn))

            /**
             * Sets [Builder.expiredOn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiredOn] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiredOn(expiredOn: JsonField<OffsetDateTime>) = apply {
                this.expiredOn = expiredOn
            }

            /**
             * Frequency of additional routine, in minutes, tasking identified in and corresponding
             * to the monitoringType array.
             */
            fun freqMins(freqMins: Double) = freqMins(JsonField.of(freqMins))

            /**
             * Sets [Builder.freqMins] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freqMins] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun freqMins(freqMins: JsonField<Double>) = apply { this.freqMins = freqMins }

            /**
             * Routine tasking that should be applied to this object. REVISIT_RATE allows users to
             * define custom revisit rates for individual satellites, HVA_CLEARING allows users to
             * define custom volumes that are expected to be clear of unknown objects, and POL would
             * be collects on a specified increment in support of collecting data that feeds into
             * Pattern of Life (PoL) assessments.
             */
            fun monitoringType(monitoringType: String) =
                monitoringType(JsonField.of(monitoringType))

            /**
             * Sets [Builder.monitoringType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monitoringType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monitoringType(monitoringType: JsonField<String>) = apply {
                this.monitoringType = monitoringType
            }

            /**
             * Unique identifier of the on-orbit object. This is typically the USSF 18th SDS
             * satellite number (also sometimes referred to as NORAD ID/number) but could be an
             * identifier from another satellite catalog namespace. See the ‘namespace’ field for
             * the appropriate identifier namespace. If namespace is null, 18SDS satellite number is
             * assumed.
             */
            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /**
             * Sets [Builder.objectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /**
             * Orbit Regime refers to a classification of a satellite's orbit based on its altitude,
             * inclination, and other orbital characteristics. Common orbit regimes include Low
             * Earth Orbit (LEO), Medium Earth Orbit (MEO), Geostationary Orbit (GEO), and Highly
             * Elliptical Orbit (HEO).
             */
            fun orbitRegime(orbitRegime: String) = orbitRegime(JsonField.of(orbitRegime))

            /**
             * Sets [Builder.orbitRegime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orbitRegime] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orbitRegime(orbitRegime: JsonField<String>) = apply {
                this.orbitRegime = orbitRegime
            }

            /**
             * Optional identifier indicates the on-orbit object being referenced. This may be an
             * internal system identifier and not necessarily a valid satellite number.
             */
            fun origObjectId(origObjectId: String) = origObjectId(JsonField.of(origObjectId))

            /**
             * Sets [Builder.origObjectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origObjectId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origObjectId(origObjectId: JsonField<String>) = apply {
                this.origObjectId = origObjectId
            }

            /**
             * Payload priority based on the type of payload that has been identified or that is
             * suspected. Priority of the payload as a number. (1=highest priority).
             */
            fun payloadPriority(payloadPriority: Double) =
                payloadPriority(JsonField.of(payloadPriority))

            /**
             * Sets [Builder.payloadPriority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payloadPriority] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payloadPriority(payloadPriority: JsonField<Double>) = apply {
                this.payloadPriority = payloadPriority
            }

            /**
             * Rank refers to the assigned position or level of priority given to a satellite based
             * on its relative importance, urgency, or operational relevance as determined by the
             * applicable operations unit.
             */
            fun rank(rank: Int) = rank(JsonField.of(rank))

            /**
             * Sets [Builder.rank] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rank] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rank(rank: JsonField<Int>) = apply { this.rank = rank }

            /**
             * Tasking urgency, typically will be on a 1-10 scale. Urgency as a number. (1=highest
             * priority).
             */
            fun urgency(urgency: Double) = urgency(JsonField.of(urgency))

            /**
             * Sets [Builder.urgency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.urgency] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun urgency(urgency: JsonField<Double>) = apply { this.urgency = urgency }

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
             * Returns an immutable instance of [OnOrbitListItem].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OnOrbitListItem =
                OnOrbitListItem(
                    clearingBoxCrossTrack,
                    clearingBoxInTrack,
                    clearingRadius,
                    commonName,
                    countryCode,
                    expiredOn,
                    freqMins,
                    monitoringType,
                    objectId,
                    orbitRegime,
                    origObjectId,
                    payloadPriority,
                    rank,
                    urgency,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): OnOrbitListItem = apply {
            if (validated) {
                return@apply
            }

            clearingBoxCrossTrack()
            clearingBoxInTrack()
            clearingRadius()
            commonName()
            countryCode()
            expiredOn()
            freqMins()
            monitoringType()
            objectId()
            orbitRegime()
            origObjectId()
            payloadPriority()
            rank()
            urgency()
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
            (if (clearingBoxCrossTrack.asKnown().isPresent) 1 else 0) +
                (if (clearingBoxInTrack.asKnown().isPresent) 1 else 0) +
                (if (clearingRadius.asKnown().isPresent) 1 else 0) +
                (if (commonName.asKnown().isPresent) 1 else 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (expiredOn.asKnown().isPresent) 1 else 0) +
                (if (freqMins.asKnown().isPresent) 1 else 0) +
                (if (monitoringType.asKnown().isPresent) 1 else 0) +
                (if (objectId.asKnown().isPresent) 1 else 0) +
                (if (orbitRegime.asKnown().isPresent) 1 else 0) +
                (if (origObjectId.asKnown().isPresent) 1 else 0) +
                (if (payloadPriority.asKnown().isPresent) 1 else 0) +
                (if (rank.asKnown().isPresent) 1 else 0) +
                (if (urgency.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OnOrbitListItem &&
                clearingBoxCrossTrack == other.clearingBoxCrossTrack &&
                clearingBoxInTrack == other.clearingBoxInTrack &&
                clearingRadius == other.clearingRadius &&
                commonName == other.commonName &&
                countryCode == other.countryCode &&
                expiredOn == other.expiredOn &&
                freqMins == other.freqMins &&
                monitoringType == other.monitoringType &&
                objectId == other.objectId &&
                orbitRegime == other.orbitRegime &&
                origObjectId == other.origObjectId &&
                payloadPriority == other.payloadPriority &&
                rank == other.rank &&
                urgency == other.urgency &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                clearingBoxCrossTrack,
                clearingBoxInTrack,
                clearingRadius,
                commonName,
                countryCode,
                expiredOn,
                freqMins,
                monitoringType,
                objectId,
                orbitRegime,
                origObjectId,
                payloadPriority,
                rank,
                urgency,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OnOrbitListItem{clearingBoxCrossTrack=$clearingBoxCrossTrack, clearingBoxInTrack=$clearingBoxInTrack, clearingRadius=$clearingRadius, commonName=$commonName, countryCode=$countryCode, expiredOn=$expiredOn, freqMins=$freqMins, monitoringType=$monitoringType, objectId=$objectId, orbitRegime=$orbitRegime, origObjectId=$origObjectId, payloadPriority=$payloadPriority, rank=$rank, urgency=$urgency, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnorbitlistTupleResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            name == other.name &&
            onOrbitListItems == other.onOrbitListItems &&
            source == other.source &&
            id == other.id &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            defaultRevisitRateMins == other.defaultRevisitRateMins &&
            description == other.description &&
            listPriority == other.listPriority &&
            namespace == other.namespace &&
            origin == other.origin &&
            sourceDl == other.sourceDl &&
            tags == other.tags &&
            transactionId == other.transactionId &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            name,
            onOrbitListItems,
            source,
            id,
            createdAt,
            createdBy,
            defaultRevisitRateMins,
            description,
            listPriority,
            namespace,
            origin,
            sourceDl,
            tags,
            transactionId,
            updatedAt,
            updatedBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OnorbitlistTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, name=$name, onOrbitListItems=$onOrbitListItems, source=$source, id=$id, createdAt=$createdAt, createdBy=$createdBy, defaultRevisitRateMins=$defaultRevisitRateMins, description=$description, listPriority=$listPriority, namespace=$namespace, origin=$origin, sourceDl=$sourceDl, tags=$tags, transactionId=$transactionId, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

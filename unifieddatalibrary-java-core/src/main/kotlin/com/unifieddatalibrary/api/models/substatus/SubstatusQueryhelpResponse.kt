// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.substatus

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
import com.unifieddatalibrary.api.models.ParamDescriptor
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SubstatusQueryhelpResponse
private constructor(
    private val aodrSupported: JsonField<Boolean>,
    private val classificationMarking: JsonField<String>,
    private val description: JsonField<String>,
    private val historySupported: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val parameters: JsonField<List<ParamDescriptor>>,
    private val requiredRoles: JsonField<List<String>>,
    private val restSupported: JsonField<Boolean>,
    private val sortSupported: JsonField<Boolean>,
    private val typeName: JsonField<String>,
    private val uri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("aodrSupported")
        @ExcludeMissing
        aodrSupported: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("historySupported")
        @ExcludeMissing
        historySupported: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parameters")
        @ExcludeMissing
        parameters: JsonField<List<ParamDescriptor>> = JsonMissing.of(),
        @JsonProperty("requiredRoles")
        @ExcludeMissing
        requiredRoles: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("restSupported")
        @ExcludeMissing
        restSupported: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sortSupported")
        @ExcludeMissing
        sortSupported: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("typeName") @ExcludeMissing typeName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
    ) : this(
        aodrSupported,
        classificationMarking,
        description,
        historySupported,
        name,
        parameters,
        requiredRoles,
        restSupported,
        sortSupported,
        typeName,
        uri,
        mutableMapOf(),
    )

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aodrSupported(): Optional<Boolean> = aodrSupported.getOptional("aodrSupported")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun classificationMarking(): Optional<String> =
        classificationMarking.getOptional("classificationMarking")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun historySupported(): Optional<Boolean> = historySupported.getOptional("historySupported")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun parameters(): Optional<List<ParamDescriptor>> = parameters.getOptional("parameters")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun requiredRoles(): Optional<List<String>> = requiredRoles.getOptional("requiredRoles")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun restSupported(): Optional<Boolean> = restSupported.getOptional("restSupported")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sortSupported(): Optional<Boolean> = sortSupported.getOptional("sortSupported")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun typeName(): Optional<String> = typeName.getOptional("typeName")

    /**
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun uri(): Optional<String> = uri.getOptional("uri")

    /**
     * Returns the raw JSON value of [aodrSupported].
     *
     * Unlike [aodrSupported], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aodrSupported")
    @ExcludeMissing
    fun _aodrSupported(): JsonField<Boolean> = aodrSupported

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [historySupported].
     *
     * Unlike [historySupported], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("historySupported")
    @ExcludeMissing
    fun _historySupported(): JsonField<Boolean> = historySupported

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parameters")
    @ExcludeMissing
    fun _parameters(): JsonField<List<ParamDescriptor>> = parameters

    /**
     * Returns the raw JSON value of [requiredRoles].
     *
     * Unlike [requiredRoles], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requiredRoles")
    @ExcludeMissing
    fun _requiredRoles(): JsonField<List<String>> = requiredRoles

    /**
     * Returns the raw JSON value of [restSupported].
     *
     * Unlike [restSupported], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("restSupported")
    @ExcludeMissing
    fun _restSupported(): JsonField<Boolean> = restSupported

    /**
     * Returns the raw JSON value of [sortSupported].
     *
     * Unlike [sortSupported], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sortSupported")
    @ExcludeMissing
    fun _sortSupported(): JsonField<Boolean> = sortSupported

    /**
     * Returns the raw JSON value of [typeName].
     *
     * Unlike [typeName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("typeName") @ExcludeMissing fun _typeName(): JsonField<String> = typeName

    /**
     * Returns the raw JSON value of [uri].
     *
     * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

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
         * Returns a mutable builder for constructing an instance of [SubstatusQueryhelpResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubstatusQueryhelpResponse]. */
    class Builder internal constructor() {

        private var aodrSupported: JsonField<Boolean> = JsonMissing.of()
        private var classificationMarking: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var historySupported: JsonField<Boolean> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var parameters: JsonField<MutableList<ParamDescriptor>>? = null
        private var requiredRoles: JsonField<MutableList<String>>? = null
        private var restSupported: JsonField<Boolean> = JsonMissing.of()
        private var sortSupported: JsonField<Boolean> = JsonMissing.of()
        private var typeName: JsonField<String> = JsonMissing.of()
        private var uri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(substatusQueryhelpResponse: SubstatusQueryhelpResponse) = apply {
            aodrSupported = substatusQueryhelpResponse.aodrSupported
            classificationMarking = substatusQueryhelpResponse.classificationMarking
            description = substatusQueryhelpResponse.description
            historySupported = substatusQueryhelpResponse.historySupported
            name = substatusQueryhelpResponse.name
            parameters = substatusQueryhelpResponse.parameters.map { it.toMutableList() }
            requiredRoles = substatusQueryhelpResponse.requiredRoles.map { it.toMutableList() }
            restSupported = substatusQueryhelpResponse.restSupported
            sortSupported = substatusQueryhelpResponse.sortSupported
            typeName = substatusQueryhelpResponse.typeName
            uri = substatusQueryhelpResponse.uri
            additionalProperties = substatusQueryhelpResponse.additionalProperties.toMutableMap()
        }

        fun aodrSupported(aodrSupported: Boolean) = aodrSupported(JsonField.of(aodrSupported))

        /**
         * Sets [Builder.aodrSupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aodrSupported] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun aodrSupported(aodrSupported: JsonField<Boolean>) = apply {
            this.aodrSupported = aodrSupported
        }

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

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun historySupported(historySupported: Boolean) =
            historySupported(JsonField.of(historySupported))

        /**
         * Sets [Builder.historySupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.historySupported] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun historySupported(historySupported: JsonField<Boolean>) = apply {
            this.historySupported = historySupported
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun parameters(parameters: List<ParamDescriptor>) = parameters(JsonField.of(parameters))

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed `List<ParamDescriptor>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun parameters(parameters: JsonField<List<ParamDescriptor>>) = apply {
            this.parameters = parameters.map { it.toMutableList() }
        }

        /**
         * Adds a single [ParamDescriptor] to [parameters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParameter(parameter: ParamDescriptor) = apply {
            parameters =
                (parameters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("parameters", it).add(parameter)
                }
        }

        fun requiredRoles(requiredRoles: List<String>) = requiredRoles(JsonField.of(requiredRoles))

        /**
         * Sets [Builder.requiredRoles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredRoles] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requiredRoles(requiredRoles: JsonField<List<String>>) = apply {
            this.requiredRoles = requiredRoles.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [requiredRoles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequiredRole(requiredRole: String) = apply {
            requiredRoles =
                (requiredRoles ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requiredRoles", it).add(requiredRole)
                }
        }

        fun restSupported(restSupported: Boolean) = restSupported(JsonField.of(restSupported))

        /**
         * Sets [Builder.restSupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restSupported] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun restSupported(restSupported: JsonField<Boolean>) = apply {
            this.restSupported = restSupported
        }

        fun sortSupported(sortSupported: Boolean) = sortSupported(JsonField.of(sortSupported))

        /**
         * Sets [Builder.sortSupported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sortSupported] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sortSupported(sortSupported: JsonField<Boolean>) = apply {
            this.sortSupported = sortSupported
        }

        fun typeName(typeName: String) = typeName(JsonField.of(typeName))

        /**
         * Sets [Builder.typeName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.typeName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun typeName(typeName: JsonField<String>) = apply { this.typeName = typeName }

        fun uri(uri: String) = uri(JsonField.of(uri))

        /**
         * Sets [Builder.uri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uri] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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
         * Returns an immutable instance of [SubstatusQueryhelpResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubstatusQueryhelpResponse =
            SubstatusQueryhelpResponse(
                aodrSupported,
                classificationMarking,
                description,
                historySupported,
                name,
                (parameters ?: JsonMissing.of()).map { it.toImmutable() },
                (requiredRoles ?: JsonMissing.of()).map { it.toImmutable() },
                restSupported,
                sortSupported,
                typeName,
                uri,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubstatusQueryhelpResponse = apply {
        if (validated) {
            return@apply
        }

        aodrSupported()
        classificationMarking()
        description()
        historySupported()
        name()
        parameters().ifPresent { it.forEach { it.validate() } }
        requiredRoles()
        restSupported()
        sortSupported()
        typeName()
        uri()
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
        (if (aodrSupported.asKnown().isPresent) 1 else 0) +
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (historySupported.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (parameters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (requiredRoles.asKnown().getOrNull()?.size ?: 0) +
            (if (restSupported.asKnown().isPresent) 1 else 0) +
            (if (sortSupported.asKnown().isPresent) 1 else 0) +
            (if (typeName.asKnown().isPresent) 1 else 0) +
            (if (uri.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubstatusQueryhelpResponse &&
            aodrSupported == other.aodrSupported &&
            classificationMarking == other.classificationMarking &&
            description == other.description &&
            historySupported == other.historySupported &&
            name == other.name &&
            parameters == other.parameters &&
            requiredRoles == other.requiredRoles &&
            restSupported == other.restSupported &&
            sortSupported == other.sortSupported &&
            typeName == other.typeName &&
            uri == other.uri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            aodrSupported,
            classificationMarking,
            description,
            historySupported,
            name,
            parameters,
            requiredRoles,
            restSupported,
            sortSupported,
            typeName,
            uri,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubstatusQueryhelpResponse{aodrSupported=$aodrSupported, classificationMarking=$classificationMarking, description=$description, historySupported=$historySupported, name=$name, parameters=$parameters, requiredRoles=$requiredRoles, restSupported=$restSupported, sortSupported=$sortSupported, typeName=$typeName, uri=$uri, additionalProperties=$additionalProperties}"
}

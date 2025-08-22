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
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class IsrCollectionPocFull
private constructor(
    private val id: JsonField<String>,
    private val callsign: JsonField<String>,
    private val chatName: JsonField<String>,
    private val chatSystem: JsonField<String>,
    private val email: JsonField<String>,
    private val name: JsonField<String>,
    private val notes: JsonField<String>,
    private val phone: JsonField<String>,
    private val radioFrequency: JsonField<Double>,
    private val unit: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("callsign") @ExcludeMissing callsign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chatName") @ExcludeMissing chatName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chatSystem")
        @ExcludeMissing
        chatSystem: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("radioFrequency")
        @ExcludeMissing
        radioFrequency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        callsign,
        chatName,
        chatSystem,
        email,
        name,
        notes,
        phone,
        radioFrequency,
        unit,
        mutableMapOf(),
    )

    /**
     * Unique identifier of the collection requirement POC.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Callsign of the POC.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun callsign(): Optional<String> = callsign.getOptional("callsign")

    /**
     * Chat name of the POC.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun chatName(): Optional<String> = chatName.getOptional("chatName")

    /**
     * Chat system the POC is accessing.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun chatSystem(): Optional<String> = chatSystem.getOptional("chatSystem")

    /**
     * Email address of the POC.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * Name of the POC.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Amplifying notes about the POC.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

    /**
     * Phone number of the POC.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun phone(): Optional<String> = phone.getOptional("phone")

    /**
     * Radio Frequency the POC is on.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun radioFrequency(): Optional<Double> = radioFrequency.getOptional("radioFrequency")

    /**
     * Unit the POC belongs to.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun unit(): Optional<String> = unit.getOptional("unit")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [callsign].
     *
     * Unlike [callsign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callsign") @ExcludeMissing fun _callsign(): JsonField<String> = callsign

    /**
     * Returns the raw JSON value of [chatName].
     *
     * Unlike [chatName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chatName") @ExcludeMissing fun _chatName(): JsonField<String> = chatName

    /**
     * Returns the raw JSON value of [chatSystem].
     *
     * Unlike [chatSystem], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chatSystem") @ExcludeMissing fun _chatSystem(): JsonField<String> = chatSystem

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

    /**
     * Returns the raw JSON value of [phone].
     *
     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

    /**
     * Returns the raw JSON value of [radioFrequency].
     *
     * Unlike [radioFrequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("radioFrequency")
    @ExcludeMissing
    fun _radioFrequency(): JsonField<Double> = radioFrequency

    /**
     * Returns the raw JSON value of [unit].
     *
     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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

        /** Returns a mutable builder for constructing an instance of [IsrCollectionPocFull]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IsrCollectionPocFull]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var callsign: JsonField<String> = JsonMissing.of()
        private var chatName: JsonField<String> = JsonMissing.of()
        private var chatSystem: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var phone: JsonField<String> = JsonMissing.of()
        private var radioFrequency: JsonField<Double> = JsonMissing.of()
        private var unit: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(isrCollectionPocFull: IsrCollectionPocFull) = apply {
            id = isrCollectionPocFull.id
            callsign = isrCollectionPocFull.callsign
            chatName = isrCollectionPocFull.chatName
            chatSystem = isrCollectionPocFull.chatSystem
            email = isrCollectionPocFull.email
            name = isrCollectionPocFull.name
            notes = isrCollectionPocFull.notes
            phone = isrCollectionPocFull.phone
            radioFrequency = isrCollectionPocFull.radioFrequency
            unit = isrCollectionPocFull.unit
            additionalProperties = isrCollectionPocFull.additionalProperties.toMutableMap()
        }

        /** Unique identifier of the collection requirement POC. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Callsign of the POC. */
        fun callsign(callsign: String) = callsign(JsonField.of(callsign))

        /**
         * Sets [Builder.callsign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callsign] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun callsign(callsign: JsonField<String>) = apply { this.callsign = callsign }

        /** Chat name of the POC. */
        fun chatName(chatName: String) = chatName(JsonField.of(chatName))

        /**
         * Sets [Builder.chatName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chatName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chatName(chatName: JsonField<String>) = apply { this.chatName = chatName }

        /** Chat system the POC is accessing. */
        fun chatSystem(chatSystem: String) = chatSystem(JsonField.of(chatSystem))

        /**
         * Sets [Builder.chatSystem] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chatSystem] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun chatSystem(chatSystem: JsonField<String>) = apply { this.chatSystem = chatSystem }

        /** Email address of the POC. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Name of the POC. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Amplifying notes about the POC. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { this.notes = notes }

        /** Phone number of the POC. */
        fun phone(phone: String) = phone(JsonField.of(phone))

        /**
         * Sets [Builder.phone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phone(phone: JsonField<String>) = apply { this.phone = phone }

        /** Radio Frequency the POC is on. */
        fun radioFrequency(radioFrequency: Double) = radioFrequency(JsonField.of(radioFrequency))

        /**
         * Sets [Builder.radioFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.radioFrequency] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun radioFrequency(radioFrequency: JsonField<Double>) = apply {
            this.radioFrequency = radioFrequency
        }

        /** Unit the POC belongs to. */
        fun unit(unit: String) = unit(JsonField.of(unit))

        /**
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
         * Returns an immutable instance of [IsrCollectionPocFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): IsrCollectionPocFull =
            IsrCollectionPocFull(
                id,
                callsign,
                chatName,
                chatSystem,
                email,
                name,
                notes,
                phone,
                radioFrequency,
                unit,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IsrCollectionPocFull = apply {
        if (validated) {
            return@apply
        }

        id()
        callsign()
        chatName()
        chatSystem()
        email()
        name()
        notes()
        phone()
        radioFrequency()
        unit()
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
            (if (callsign.asKnown().isPresent) 1 else 0) +
            (if (chatName.asKnown().isPresent) 1 else 0) +
            (if (chatSystem.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (if (phone.asKnown().isPresent) 1 else 0) +
            (if (radioFrequency.asKnown().isPresent) 1 else 0) +
            (if (unit.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IsrCollectionPocFull &&
            id == other.id &&
            callsign == other.callsign &&
            chatName == other.chatName &&
            chatSystem == other.chatSystem &&
            email == other.email &&
            name == other.name &&
            notes == other.notes &&
            phone == other.phone &&
            radioFrequency == other.radioFrequency &&
            unit == other.unit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            callsign,
            chatName,
            chatSystem,
            email,
            name,
            notes,
            phone,
            radioFrequency,
            unit,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IsrCollectionPocFull{id=$id, callsign=$callsign, chatName=$chatName, chatSystem=$chatSystem, email=$email, name=$name, notes=$notes, phone=$phone, radioFrequency=$radioFrequency, unit=$unit, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

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

class Attachment
private constructor(
    private val author: JsonField<String>,
    private val contentLength: JsonField<Int>,
    private val contentType: JsonField<String>,
    private val date: JsonField<String>,
    private val keywords: JsonField<String>,
    private val language: JsonField<String>,
    private val title: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("author") @ExcludeMissing author: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content_length")
        @ExcludeMissing
        contentLength: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("content_type")
        @ExcludeMissing
        contentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date") @ExcludeMissing date: JsonField<String> = JsonMissing.of(),
        @JsonProperty("keywords") @ExcludeMissing keywords: JsonField<String> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(author, contentLength, contentType, date, keywords, language, title, mutableMapOf())

    /**
     * The creator of this document. Can be a person or a software entity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun author(): Optional<String> = author.getOptional("author")

    /**
     * The length of the document, in bytes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun contentLength(): Optional<Int> = contentLength.getOptional("content_length")

    /**
     * The document's MIME-type (if applicable).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun contentType(): Optional<String> = contentType.getOptional("content_type")

    /**
     * The time at which this attachment was created, represented in UTC ISO format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun date(): Optional<String> = date.getOptional("date")

    /**
     * Any keywords associated with this document. Only applicable to files whose contents are
     * indexed (e.g. text files, PDFs).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun keywords(): Optional<String> = keywords.getOptional("keywords")

    /**
     * The human language of the document, if discernible.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * The title of the document.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Returns the raw JSON value of [author].
     *
     * Unlike [author], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("author") @ExcludeMissing fun _author(): JsonField<String> = author

    /**
     * Returns the raw JSON value of [contentLength].
     *
     * Unlike [contentLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content_length")
    @ExcludeMissing
    fun _contentLength(): JsonField<Int> = contentLength

    /**
     * Returns the raw JSON value of [contentType].
     *
     * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content_type")
    @ExcludeMissing
    fun _contentType(): JsonField<String> = contentType

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<String> = date

    /**
     * Returns the raw JSON value of [keywords].
     *
     * Unlike [keywords], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("keywords") @ExcludeMissing fun _keywords(): JsonField<String> = keywords

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

        /** Returns a mutable builder for constructing an instance of [Attachment]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Attachment]. */
    class Builder internal constructor() {

        private var author: JsonField<String> = JsonMissing.of()
        private var contentLength: JsonField<Int> = JsonMissing.of()
        private var contentType: JsonField<String> = JsonMissing.of()
        private var date: JsonField<String> = JsonMissing.of()
        private var keywords: JsonField<String> = JsonMissing.of()
        private var language: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(attachment: Attachment) = apply {
            author = attachment.author
            contentLength = attachment.contentLength
            contentType = attachment.contentType
            date = attachment.date
            keywords = attachment.keywords
            language = attachment.language
            title = attachment.title
            additionalProperties = attachment.additionalProperties.toMutableMap()
        }

        /** The creator of this document. Can be a person or a software entity. */
        fun author(author: String) = author(JsonField.of(author))

        /**
         * Sets [Builder.author] to an arbitrary JSON value.
         *
         * You should usually call [Builder.author] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun author(author: JsonField<String>) = apply { this.author = author }

        /** The length of the document, in bytes. */
        fun contentLength(contentLength: Int) = contentLength(JsonField.of(contentLength))

        /**
         * Sets [Builder.contentLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentLength] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentLength(contentLength: JsonField<Int>) = apply {
            this.contentLength = contentLength
        }

        /** The document's MIME-type (if applicable). */
        fun contentType(contentType: String) = contentType(JsonField.of(contentType))

        /**
         * Sets [Builder.contentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentType(contentType: JsonField<String>) = apply { this.contentType = contentType }

        /** The time at which this attachment was created, represented in UTC ISO format. */
        fun date(date: String) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<String>) = apply { this.date = date }

        /**
         * Any keywords associated with this document. Only applicable to files whose contents are
         * indexed (e.g. text files, PDFs).
         */
        fun keywords(keywords: String) = keywords(JsonField.of(keywords))

        /**
         * Sets [Builder.keywords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keywords] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun keywords(keywords: JsonField<String>) = apply { this.keywords = keywords }

        /** The human language of the document, if discernible. */
        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        /** The title of the document. */
        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

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
         * Returns an immutable instance of [Attachment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Attachment =
            Attachment(
                author,
                contentLength,
                contentType,
                date,
                keywords,
                language,
                title,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Attachment = apply {
        if (validated) {
            return@apply
        }

        author()
        contentLength()
        contentType()
        date()
        keywords()
        language()
        title()
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
        (if (author.asKnown().isPresent) 1 else 0) +
            (if (contentLength.asKnown().isPresent) 1 else 0) +
            (if (contentType.asKnown().isPresent) 1 else 0) +
            (if (date.asKnown().isPresent) 1 else 0) +
            (if (keywords.asKnown().isPresent) 1 else 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Attachment &&
            author == other.author &&
            contentLength == other.contentLength &&
            contentType == other.contentType &&
            date == other.date &&
            keywords == other.keywords &&
            language == other.language &&
            title == other.title &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            author,
            contentLength,
            contentType,
            date,
            keywords,
            language,
            title,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Attachment{author=$author, contentLength=$contentLength, contentType=$contentType, date=$date, keywords=$keywords, language=$language, title=$title, additionalProperties=$additionalProperties}"
}

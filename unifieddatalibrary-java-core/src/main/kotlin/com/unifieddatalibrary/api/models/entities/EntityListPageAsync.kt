// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.entities

import com.unifieddatalibrary.api.core.AutoPagerAsync
import com.unifieddatalibrary.api.core.PageAsync
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.models.entities.EntityAbridged
import com.unifieddatalibrary.api.models.entities.EntityListParams
import com.unifieddatalibrary.api.services.async.EntityServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see EntityServiceAsync.list */
class EntityListPageAsync private constructor(
    private val service: EntityServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EntityListParams,
    private val items: List<EntityAbridged>,

) : PageAsync<EntityAbridged> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EntityListParams {
      val offset = params.firstResult().getOrDefault(0)
      return params.toBuilder()
          .firstResult(offset + items().size)
          .build()
    }

    override fun nextPage(): CompletableFuture<EntityListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EntityAbridged> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): EntityListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<EntityAbridged> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntityListPageAsync].
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [EntityListPageAsync]. */
    class Builder internal constructor() {

        private var service: EntityServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EntityListParams? = null
        private var items: List<EntityAbridged>? = null

        @JvmSynthetic
        internal fun from(entityListPageAsync: EntityListPageAsync) =
            apply {
                service = entityListPageAsync.service
                streamHandlerExecutor = entityListPageAsync.streamHandlerExecutor
                params = entityListPageAsync.params
                items = entityListPageAsync.items
            }

        fun service(service: EntityServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: EntityListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun items(items: List<EntityAbridged>) =
            apply {
                this.items = items
            }

        /**
         * Returns an immutable instance of [EntityListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntityListPageAsync =
            EntityListPageAsync(
              checkRequired(
                "service", service
              ),
              checkRequired(
                "streamHandlerExecutor", streamHandlerExecutor
              ),
              checkRequired(
                "params", params
              ),
              checkRequired(
                "items", items
              ),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is EntityListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, items) /* spotless:on */

    override fun toString() = "EntityListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}

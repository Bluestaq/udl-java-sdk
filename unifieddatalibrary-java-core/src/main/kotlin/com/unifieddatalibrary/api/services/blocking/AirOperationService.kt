// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.blocking.airoperations.AirTaskingOrderService
import com.unifieddatalibrary.api.services.blocking.airoperations.AircraftSortyService
import com.unifieddatalibrary.api.services.blocking.airoperations.AirspaceControlOrderService
import com.unifieddatalibrary.api.services.blocking.airoperations.CrewpaperService
import com.unifieddatalibrary.api.services.blocking.airoperations.DiplomaticClearanceService
import java.util.function.Consumer

interface AirOperationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AirOperationService

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun airTaskingOrders(): AirTaskingOrderService

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun aircraftSorties(): AircraftSortyService

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun airspaceControlOrders(): AirspaceControlOrderService

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun crewpapers(): CrewpaperService

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    fun diplomaticClearance(): DiplomaticClearanceService

    /**
     * A view of [AirOperationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AirOperationService.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun airTaskingOrders(): AirTaskingOrderService.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun aircraftSorties(): AircraftSortyService.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun airspaceControlOrders(): AirspaceControlOrderService.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun crewpapers(): CrewpaperService.WithRawResponse

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        fun diplomaticClearance(): DiplomaticClearanceService.WithRawResponse
    }
}

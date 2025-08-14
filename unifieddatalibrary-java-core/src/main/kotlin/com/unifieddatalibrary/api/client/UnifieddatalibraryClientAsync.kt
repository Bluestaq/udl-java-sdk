// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.client

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.services.async.AiServiceAsync
import com.unifieddatalibrary.api.services.async.AirEventServiceAsync
import com.unifieddatalibrary.api.services.async.AirOperationServiceAsync
import com.unifieddatalibrary.api.services.async.AirTransportMissionServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftSortyServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftStatusRemarkServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftStatusServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldSlotConsumptionServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldSlotServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldStatusServiceAsync
import com.unifieddatalibrary.api.services.async.AirloadPlanServiceAsync
import com.unifieddatalibrary.api.services.async.AirspaceControlOrderServiceAsync
import com.unifieddatalibrary.api.services.async.AisObjectServiceAsync
import com.unifieddatalibrary.api.services.async.AnalyticImageryServiceAsync
import com.unifieddatalibrary.api.services.async.AntennaServiceAsync
import com.unifieddatalibrary.api.services.async.AttitudeDataServiceAsync
import com.unifieddatalibrary.api.services.async.AttitudeSetServiceAsync
import com.unifieddatalibrary.api.services.async.AviationRiskManagementServiceAsync
import com.unifieddatalibrary.api.services.async.BatteryServiceAsync
import com.unifieddatalibrary.api.services.async.BatterydetailServiceAsync
import com.unifieddatalibrary.api.services.async.BeamContourServiceAsync
import com.unifieddatalibrary.api.services.async.BeamServiceAsync
import com.unifieddatalibrary.api.services.async.BusServiceAsync
import com.unifieddatalibrary.api.services.async.ChannelServiceAsync
import com.unifieddatalibrary.api.services.async.CollectRequestServiceAsync
import com.unifieddatalibrary.api.services.async.CollectResponseServiceAsync
import com.unifieddatalibrary.api.services.async.CommServiceAsync
import com.unifieddatalibrary.api.services.async.ConjunctionServiceAsync
import com.unifieddatalibrary.api.services.async.CotServiceAsync
import com.unifieddatalibrary.api.services.async.CountryServiceAsync
import com.unifieddatalibrary.api.services.async.CrewServiceAsync
import com.unifieddatalibrary.api.services.async.DiffOfArrivalServiceAsync
import com.unifieddatalibrary.api.services.async.DiplomaticClearanceServiceAsync
import com.unifieddatalibrary.api.services.async.DriftHistoryServiceAsync
import com.unifieddatalibrary.api.services.async.DropzoneServiceAsync
import com.unifieddatalibrary.api.services.async.EcpSdrServiceAsync
import com.unifieddatalibrary.api.services.async.EffectRequestServiceAsync
import com.unifieddatalibrary.api.services.async.EffectResponseServiceAsync
import com.unifieddatalibrary.api.services.async.ElsetServiceAsync
import com.unifieddatalibrary.api.services.async.EmitterGeolocationServiceAsync
import com.unifieddatalibrary.api.services.async.EngineDetailServiceAsync
import com.unifieddatalibrary.api.services.async.EngineServiceAsync
import com.unifieddatalibrary.api.services.async.EntityServiceAsync
import com.unifieddatalibrary.api.services.async.EopServiceAsync
import com.unifieddatalibrary.api.services.async.EphemerisServiceAsync
import com.unifieddatalibrary.api.services.async.EphemerisSetServiceAsync
import com.unifieddatalibrary.api.services.async.EquipmentRemarkServiceAsync
import com.unifieddatalibrary.api.services.async.EquipmentServiceAsync
import com.unifieddatalibrary.api.services.async.EvacServiceAsync
import com.unifieddatalibrary.api.services.async.EventEvolutionServiceAsync
import com.unifieddatalibrary.api.services.async.FeatureAssessmentServiceAsync
import com.unifieddatalibrary.api.services.async.FlightplanServiceAsync
import com.unifieddatalibrary.api.services.async.GeoStatusServiceAsync
import com.unifieddatalibrary.api.services.async.GlobalAtmosphericModelServiceAsync
import com.unifieddatalibrary.api.services.async.GnssObservationServiceAsync
import com.unifieddatalibrary.api.services.async.GnssObservationsetServiceAsync
import com.unifieddatalibrary.api.services.async.GnssRawIfServiceAsync
import com.unifieddatalibrary.api.services.async.GroundImageryServiceAsync
import com.unifieddatalibrary.api.services.async.H3GeoHexCellServiceAsync
import com.unifieddatalibrary.api.services.async.H3GeoServiceAsync
import com.unifieddatalibrary.api.services.async.HazardServiceAsync
import com.unifieddatalibrary.api.services.async.IonoObservationServiceAsync
import com.unifieddatalibrary.api.services.async.IrServiceAsync
import com.unifieddatalibrary.api.services.async.IsrCollectionServiceAsync
import com.unifieddatalibrary.api.services.async.ItemServiceAsync
import com.unifieddatalibrary.api.services.async.ItemTrackingServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchDetectionServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchEventServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchSiteDetailServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchSiteServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchVehicleDetailServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchVehicleServiceAsync
import com.unifieddatalibrary.api.services.async.LinkStatusServiceAsync
import com.unifieddatalibrary.api.services.async.LocationServiceAsync
import com.unifieddatalibrary.api.services.async.LogisticsSupportServiceAsync
import com.unifieddatalibrary.api.services.async.ManeuverServiceAsync
import com.unifieddatalibrary.api.services.async.ManifoldServiceAsync
import com.unifieddatalibrary.api.services.async.ManifoldelsetServiceAsync
import com.unifieddatalibrary.api.services.async.MissileTrackServiceAsync
import com.unifieddatalibrary.api.services.async.MissionAssignmentServiceAsync
import com.unifieddatalibrary.api.services.async.MtiServiceAsync
import com.unifieddatalibrary.api.services.async.NavigationServiceAsync
import com.unifieddatalibrary.api.services.async.NavigationalObstructionServiceAsync
import com.unifieddatalibrary.api.services.async.NotificationServiceAsync
import com.unifieddatalibrary.api.services.async.ObjectOfInterestServiceAsync
import com.unifieddatalibrary.api.services.async.ObservationServiceAsync
import com.unifieddatalibrary.api.services.async.OnboardnavigationServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitantennaServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitbatteryServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitdetailServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbiteventServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitlistServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitsolararrayServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitthrusterServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitthrusterstatusServiceAsync
import com.unifieddatalibrary.api.services.async.OperatingunitServiceAsync
import com.unifieddatalibrary.api.services.async.OperatingunitremarkServiceAsync
import com.unifieddatalibrary.api.services.async.OrbitdeterminationServiceAsync
import com.unifieddatalibrary.api.services.async.OrbittrackServiceAsync
import com.unifieddatalibrary.api.services.async.OrganizationServiceAsync
import com.unifieddatalibrary.api.services.async.OrganizationdetailServiceAsync
import com.unifieddatalibrary.api.services.async.PersonnelrecoveryServiceAsync
import com.unifieddatalibrary.api.services.async.PoiServiceAsync
import com.unifieddatalibrary.api.services.async.PortServiceAsync
import com.unifieddatalibrary.api.services.async.ReportAndActivityServiceAsync
import com.unifieddatalibrary.api.services.async.RfBandServiceAsync
import com.unifieddatalibrary.api.services.async.RfBandTypeServiceAsync
import com.unifieddatalibrary.api.services.async.RfEmitterDetailServiceAsync
import com.unifieddatalibrary.api.services.async.RfEmitterServiceAsync
import com.unifieddatalibrary.api.services.async.RouteStatServiceAsync
import com.unifieddatalibrary.api.services.async.SarObservationServiceAsync
import com.unifieddatalibrary.api.services.async.ScServiceAsync
import com.unifieddatalibrary.api.services.async.ScientificServiceAsync
import com.unifieddatalibrary.api.services.async.ScsViewServiceAsync
import com.unifieddatalibrary.api.services.async.SecureMessagingServiceAsync
import com.unifieddatalibrary.api.services.async.SensorMaintenanceServiceAsync
import com.unifieddatalibrary.api.services.async.SensorObservationTypeServiceAsync
import com.unifieddatalibrary.api.services.async.SensorPlanServiceAsync
import com.unifieddatalibrary.api.services.async.SensorServiceAsync
import com.unifieddatalibrary.api.services.async.SensorTypeServiceAsync
import com.unifieddatalibrary.api.services.async.SeraDataCommDetailServiceAsync
import com.unifieddatalibrary.api.services.async.SeraDataEarlyWarningServiceAsync
import com.unifieddatalibrary.api.services.async.SeraDataNavigationServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataOpticalPayloadServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataRadarPayloadServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataSigintPayloadServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataSpacecraftDetailServiceAsync
import com.unifieddatalibrary.api.services.async.SgiServiceAsync
import com.unifieddatalibrary.api.services.async.SigactServiceAsync
import com.unifieddatalibrary.api.services.async.SiteRemarkServiceAsync
import com.unifieddatalibrary.api.services.async.SiteServiceAsync
import com.unifieddatalibrary.api.services.async.SiteStatusServiceAsync
import com.unifieddatalibrary.api.services.async.SkyImageryServiceAsync
import com.unifieddatalibrary.api.services.async.SoiObservationSetServiceAsync
import com.unifieddatalibrary.api.services.async.SolarArrayDetailServiceAsync
import com.unifieddatalibrary.api.services.async.SolarArrayServiceAsync
import com.unifieddatalibrary.api.services.async.SortiePprServiceAsync
import com.unifieddatalibrary.api.services.async.SpaceEnvObservationServiceAsync
import com.unifieddatalibrary.api.services.async.StageServiceAsync
import com.unifieddatalibrary.api.services.async.StarCatalogServiceAsync
import com.unifieddatalibrary.api.services.async.StateVectorServiceAsync
import com.unifieddatalibrary.api.services.async.StatusServiceAsync
import com.unifieddatalibrary.api.services.async.SubstatusServiceAsync
import com.unifieddatalibrary.api.services.async.SupportingDataServiceAsync
import com.unifieddatalibrary.api.services.async.SurfaceObstructionServiceAsync
import com.unifieddatalibrary.api.services.async.SurfaceServiceAsync
import com.unifieddatalibrary.api.services.async.SwirServiceAsync
import com.unifieddatalibrary.api.services.async.TaiUtcServiceAsync
import com.unifieddatalibrary.api.services.async.TdoaFdoaServiceAsync
import com.unifieddatalibrary.api.services.async.TrackDetailServiceAsync
import com.unifieddatalibrary.api.services.async.TrackRouteServiceAsync
import com.unifieddatalibrary.api.services.async.TrackServiceAsync
import com.unifieddatalibrary.api.services.async.TransponderServiceAsync
import com.unifieddatalibrary.api.services.async.VesselServiceAsync
import com.unifieddatalibrary.api.services.async.VideoServiceAsync
import com.unifieddatalibrary.api.services.async.WeatherDataServiceAsync
import com.unifieddatalibrary.api.services.async.WeatherReportServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the Unifieddatalibrary REST API asynchronously. You can also switch
 * to synchronous execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface UnifieddatalibraryClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): UnifieddatalibraryClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UnifieddatalibraryClientAsync

    fun airEvents(): AirEventServiceAsync

    fun airOperations(): AirOperationServiceAsync

    fun airTransportMissions(): AirTransportMissionServiceAsync

    fun aircraft(): AircraftServiceAsync

    fun aircraftSorties(): AircraftSortyServiceAsync

    fun aircraftStatusRemarks(): AircraftStatusRemarkServiceAsync

    fun aircraftStatuses(): AircraftStatusServiceAsync

    fun airfieldSlots(): AirfieldSlotServiceAsync

    fun airfieldStatus(): AirfieldStatusServiceAsync

    fun airfields(): AirfieldServiceAsync

    fun airfieldSlotConsumptions(): AirfieldSlotConsumptionServiceAsync

    fun airloadPlans(): AirloadPlanServiceAsync

    fun airspaceControlOrders(): AirspaceControlOrderServiceAsync

    fun ais(): AiServiceAsync

    fun aisObjects(): AisObjectServiceAsync

    fun analyticImagery(): AnalyticImageryServiceAsync

    fun antennas(): AntennaServiceAsync

    fun attitudeData(): AttitudeDataServiceAsync

    fun attitudeSets(): AttitudeSetServiceAsync

    fun batteries(): BatteryServiceAsync

    fun batterydetails(): BatterydetailServiceAsync

    fun beam(): BeamServiceAsync

    fun beamContours(): BeamContourServiceAsync

    fun buses(): BusServiceAsync

    fun channels(): ChannelServiceAsync

    fun collectRequests(): CollectRequestServiceAsync

    fun collectResponses(): CollectResponseServiceAsync

    fun comm(): CommServiceAsync

    fun conjunctions(): ConjunctionServiceAsync

    fun cots(): CotServiceAsync

    fun aviationRiskManagement(): AviationRiskManagementServiceAsync

    fun dropzone(): DropzoneServiceAsync

    fun emitterGeolocation(): EmitterGeolocationServiceAsync

    fun featureAssessment(): FeatureAssessmentServiceAsync

    fun globalAtmosphericModel(): GlobalAtmosphericModelServiceAsync

    fun routeStats(): RouteStatServiceAsync

    fun countries(): CountryServiceAsync

    fun crew(): CrewServiceAsync

    fun diffOfArrival(): DiffOfArrivalServiceAsync

    fun diplomaticClearance(): DiplomaticClearanceServiceAsync

    fun driftHistory(): DriftHistoryServiceAsync

    fun ecpSdr(): EcpSdrServiceAsync

    fun effectRequests(): EffectRequestServiceAsync

    fun effectResponses(): EffectResponseServiceAsync

    fun elsets(): ElsetServiceAsync

    fun engineDetails(): EngineDetailServiceAsync

    fun engines(): EngineServiceAsync

    fun entities(): EntityServiceAsync

    fun eop(): EopServiceAsync

    fun ephemeris(): EphemerisServiceAsync

    fun ephemerisSets(): EphemerisSetServiceAsync

    fun equipment(): EquipmentServiceAsync

    fun equipmentRemarks(): EquipmentRemarkServiceAsync

    fun evac(): EvacServiceAsync

    fun eventEvolution(): EventEvolutionServiceAsync

    fun flightplan(): FlightplanServiceAsync

    fun geoStatus(): GeoStatusServiceAsync

    fun gnssObservationset(): GnssObservationsetServiceAsync

    fun groundImagery(): GroundImageryServiceAsync

    fun h3Geo(): H3GeoServiceAsync

    fun h3GeoHexCell(): H3GeoHexCellServiceAsync

    fun hazard(): HazardServiceAsync

    fun ir(): IrServiceAsync

    fun isrCollections(): IsrCollectionServiceAsync

    fun item(): ItemServiceAsync

    fun itemTrackings(): ItemTrackingServiceAsync

    fun launchDetection(): LaunchDetectionServiceAsync

    fun launchEvent(): LaunchEventServiceAsync

    fun launchSite(): LaunchSiteServiceAsync

    fun launchSiteDetails(): LaunchSiteDetailServiceAsync

    fun launchVehicle(): LaunchVehicleServiceAsync

    fun launchVehicleDetails(): LaunchVehicleDetailServiceAsync

    fun linkStatus(): LinkStatusServiceAsync

    fun location(): LocationServiceAsync

    fun logisticsSupport(): LogisticsSupportServiceAsync

    fun maneuvers(): ManeuverServiceAsync

    fun manifold(): ManifoldServiceAsync

    fun manifoldelset(): ManifoldelsetServiceAsync

    fun missileTracks(): MissileTrackServiceAsync

    fun missionAssignment(): MissionAssignmentServiceAsync

    fun mti(): MtiServiceAsync

    fun navigation(): NavigationServiceAsync

    fun navigationalObstruction(): NavigationalObstructionServiceAsync

    fun notification(): NotificationServiceAsync

    fun objectOfInterest(): ObjectOfInterestServiceAsync

    fun observations(): ObservationServiceAsync

    fun onboardnavigation(): OnboardnavigationServiceAsync

    fun onorbit(): OnorbitServiceAsync

    fun onorbitantenna(): OnorbitantennaServiceAsync

    fun onorbitbattery(): OnorbitbatteryServiceAsync

    fun onorbitdetails(): OnorbitdetailServiceAsync

    fun onorbitevent(): OnorbiteventServiceAsync

    fun onorbitlist(): OnorbitlistServiceAsync

    fun onorbitsolararray(): OnorbitsolararrayServiceAsync

    fun onorbitthruster(): OnorbitthrusterServiceAsync

    fun onorbitthrusterstatus(): OnorbitthrusterstatusServiceAsync

    fun operatingunit(): OperatingunitServiceAsync

    fun operatingunitremark(): OperatingunitremarkServiceAsync

    fun orbitdetermination(): OrbitdeterminationServiceAsync

    fun orbittrack(): OrbittrackServiceAsync

    fun organization(): OrganizationServiceAsync

    fun organizationdetails(): OrganizationdetailServiceAsync

    fun personnelrecovery(): PersonnelrecoveryServiceAsync

    fun poi(): PoiServiceAsync

    fun port(): PortServiceAsync

    fun rfBand(): RfBandServiceAsync

    fun rfBandType(): RfBandTypeServiceAsync

    fun rfEmitter(): RfEmitterServiceAsync

    fun rfEmitterDetails(): RfEmitterDetailServiceAsync

    fun sarObservation(): SarObservationServiceAsync

    fun scientific(): ScientificServiceAsync

    fun sensor(): SensorServiceAsync

    fun sensorMaintenance(): SensorMaintenanceServiceAsync

    fun sensorObservationType(): SensorObservationTypeServiceAsync

    fun sensorPlan(): SensorPlanServiceAsync

    fun sensorType(): SensorTypeServiceAsync

    fun seraDataCommDetails(): SeraDataCommDetailServiceAsync

    fun seraDataEarlyWarning(): SeraDataEarlyWarningServiceAsync

    fun seraDataNavigation(): SeraDataNavigationServiceAsync

    fun seradataOpticalPayload(): SeradataOpticalPayloadServiceAsync

    fun seradataRadarPayload(): SeradataRadarPayloadServiceAsync

    fun seradataSigintPayload(): SeradataSigintPayloadServiceAsync

    fun seradataSpacecraftDetails(): SeradataSpacecraftDetailServiceAsync

    fun sgi(): SgiServiceAsync

    fun sigact(): SigactServiceAsync

    fun site(): SiteServiceAsync

    fun siteRemark(): SiteRemarkServiceAsync

    fun siteStatus(): SiteStatusServiceAsync

    fun skyImagery(): SkyImageryServiceAsync

    fun soiObservationSet(): SoiObservationSetServiceAsync

    fun solarArray(): SolarArrayServiceAsync

    fun solarArrayDetails(): SolarArrayDetailServiceAsync

    fun sortiePpr(): SortiePprServiceAsync

    fun spaceEnvObservation(): SpaceEnvObservationServiceAsync

    fun stage(): StageServiceAsync

    fun starCatalog(): StarCatalogServiceAsync

    fun stateVector(): StateVectorServiceAsync

    fun status(): StatusServiceAsync

    fun substatus(): SubstatusServiceAsync

    fun supportingData(): SupportingDataServiceAsync

    fun surface(): SurfaceServiceAsync

    fun surfaceObstruction(): SurfaceObstructionServiceAsync

    fun swir(): SwirServiceAsync

    fun taiUtc(): TaiUtcServiceAsync

    fun tdoaFdoa(): TdoaFdoaServiceAsync

    fun track(): TrackServiceAsync

    fun trackDetails(): TrackDetailServiceAsync

    fun trackRoute(): TrackRouteServiceAsync

    fun transponder(): TransponderServiceAsync

    fun vessel(): VesselServiceAsync

    fun video(): VideoServiceAsync

    fun weatherData(): WeatherDataServiceAsync

    fun weatherReport(): WeatherReportServiceAsync

    fun gnssObservations(): GnssObservationServiceAsync

    fun gnssRawIf(): GnssRawIfServiceAsync

    fun ionoObservations(): IonoObservationServiceAsync

    fun reportAndActivities(): ReportAndActivityServiceAsync

    fun secureMessaging(): SecureMessagingServiceAsync

    fun scs(): ScServiceAsync

    fun scsViews(): ScsViewServiceAsync

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [UnifieddatalibraryClientAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UnifieddatalibraryClientAsync.WithRawResponse

        fun airEvents(): AirEventServiceAsync.WithRawResponse

        fun airOperations(): AirOperationServiceAsync.WithRawResponse

        fun airTransportMissions(): AirTransportMissionServiceAsync.WithRawResponse

        fun aircraft(): AircraftServiceAsync.WithRawResponse

        fun aircraftSorties(): AircraftSortyServiceAsync.WithRawResponse

        fun aircraftStatusRemarks(): AircraftStatusRemarkServiceAsync.WithRawResponse

        fun aircraftStatuses(): AircraftStatusServiceAsync.WithRawResponse

        fun airfieldSlots(): AirfieldSlotServiceAsync.WithRawResponse

        fun airfieldStatus(): AirfieldStatusServiceAsync.WithRawResponse

        fun airfields(): AirfieldServiceAsync.WithRawResponse

        fun airfieldSlotConsumptions(): AirfieldSlotConsumptionServiceAsync.WithRawResponse

        fun airloadPlans(): AirloadPlanServiceAsync.WithRawResponse

        fun airspaceControlOrders(): AirspaceControlOrderServiceAsync.WithRawResponse

        fun ais(): AiServiceAsync.WithRawResponse

        fun aisObjects(): AisObjectServiceAsync.WithRawResponse

        fun analyticImagery(): AnalyticImageryServiceAsync.WithRawResponse

        fun antennas(): AntennaServiceAsync.WithRawResponse

        fun attitudeData(): AttitudeDataServiceAsync.WithRawResponse

        fun attitudeSets(): AttitudeSetServiceAsync.WithRawResponse

        fun batteries(): BatteryServiceAsync.WithRawResponse

        fun batterydetails(): BatterydetailServiceAsync.WithRawResponse

        fun beam(): BeamServiceAsync.WithRawResponse

        fun beamContours(): BeamContourServiceAsync.WithRawResponse

        fun buses(): BusServiceAsync.WithRawResponse

        fun channels(): ChannelServiceAsync.WithRawResponse

        fun collectRequests(): CollectRequestServiceAsync.WithRawResponse

        fun collectResponses(): CollectResponseServiceAsync.WithRawResponse

        fun comm(): CommServiceAsync.WithRawResponse

        fun conjunctions(): ConjunctionServiceAsync.WithRawResponse

        fun cots(): CotServiceAsync.WithRawResponse

        fun aviationRiskManagement(): AviationRiskManagementServiceAsync.WithRawResponse

        fun dropzone(): DropzoneServiceAsync.WithRawResponse

        fun emitterGeolocation(): EmitterGeolocationServiceAsync.WithRawResponse

        fun featureAssessment(): FeatureAssessmentServiceAsync.WithRawResponse

        fun globalAtmosphericModel(): GlobalAtmosphericModelServiceAsync.WithRawResponse

        fun routeStats(): RouteStatServiceAsync.WithRawResponse

        fun countries(): CountryServiceAsync.WithRawResponse

        fun crew(): CrewServiceAsync.WithRawResponse

        fun diffOfArrival(): DiffOfArrivalServiceAsync.WithRawResponse

        fun diplomaticClearance(): DiplomaticClearanceServiceAsync.WithRawResponse

        fun driftHistory(): DriftHistoryServiceAsync.WithRawResponse

        fun ecpSdr(): EcpSdrServiceAsync.WithRawResponse

        fun effectRequests(): EffectRequestServiceAsync.WithRawResponse

        fun effectResponses(): EffectResponseServiceAsync.WithRawResponse

        fun elsets(): ElsetServiceAsync.WithRawResponse

        fun engineDetails(): EngineDetailServiceAsync.WithRawResponse

        fun engines(): EngineServiceAsync.WithRawResponse

        fun entities(): EntityServiceAsync.WithRawResponse

        fun eop(): EopServiceAsync.WithRawResponse

        fun ephemeris(): EphemerisServiceAsync.WithRawResponse

        fun ephemerisSets(): EphemerisSetServiceAsync.WithRawResponse

        fun equipment(): EquipmentServiceAsync.WithRawResponse

        fun equipmentRemarks(): EquipmentRemarkServiceAsync.WithRawResponse

        fun evac(): EvacServiceAsync.WithRawResponse

        fun eventEvolution(): EventEvolutionServiceAsync.WithRawResponse

        fun flightplan(): FlightplanServiceAsync.WithRawResponse

        fun geoStatus(): GeoStatusServiceAsync.WithRawResponse

        fun gnssObservationset(): GnssObservationsetServiceAsync.WithRawResponse

        fun groundImagery(): GroundImageryServiceAsync.WithRawResponse

        fun h3Geo(): H3GeoServiceAsync.WithRawResponse

        fun h3GeoHexCell(): H3GeoHexCellServiceAsync.WithRawResponse

        fun hazard(): HazardServiceAsync.WithRawResponse

        fun ir(): IrServiceAsync.WithRawResponse

        fun isrCollections(): IsrCollectionServiceAsync.WithRawResponse

        fun item(): ItemServiceAsync.WithRawResponse

        fun itemTrackings(): ItemTrackingServiceAsync.WithRawResponse

        fun launchDetection(): LaunchDetectionServiceAsync.WithRawResponse

        fun launchEvent(): LaunchEventServiceAsync.WithRawResponse

        fun launchSite(): LaunchSiteServiceAsync.WithRawResponse

        fun launchSiteDetails(): LaunchSiteDetailServiceAsync.WithRawResponse

        fun launchVehicle(): LaunchVehicleServiceAsync.WithRawResponse

        fun launchVehicleDetails(): LaunchVehicleDetailServiceAsync.WithRawResponse

        fun linkStatus(): LinkStatusServiceAsync.WithRawResponse

        fun location(): LocationServiceAsync.WithRawResponse

        fun logisticsSupport(): LogisticsSupportServiceAsync.WithRawResponse

        fun maneuvers(): ManeuverServiceAsync.WithRawResponse

        fun manifold(): ManifoldServiceAsync.WithRawResponse

        fun manifoldelset(): ManifoldelsetServiceAsync.WithRawResponse

        fun missileTracks(): MissileTrackServiceAsync.WithRawResponse

        fun missionAssignment(): MissionAssignmentServiceAsync.WithRawResponse

        fun mti(): MtiServiceAsync.WithRawResponse

        fun navigation(): NavigationServiceAsync.WithRawResponse

        fun navigationalObstruction(): NavigationalObstructionServiceAsync.WithRawResponse

        fun notification(): NotificationServiceAsync.WithRawResponse

        fun objectOfInterest(): ObjectOfInterestServiceAsync.WithRawResponse

        fun observations(): ObservationServiceAsync.WithRawResponse

        fun onboardnavigation(): OnboardnavigationServiceAsync.WithRawResponse

        fun onorbit(): OnorbitServiceAsync.WithRawResponse

        fun onorbitantenna(): OnorbitantennaServiceAsync.WithRawResponse

        fun onorbitbattery(): OnorbitbatteryServiceAsync.WithRawResponse

        fun onorbitdetails(): OnorbitdetailServiceAsync.WithRawResponse

        fun onorbitevent(): OnorbiteventServiceAsync.WithRawResponse

        fun onorbitlist(): OnorbitlistServiceAsync.WithRawResponse

        fun onorbitsolararray(): OnorbitsolararrayServiceAsync.WithRawResponse

        fun onorbitthruster(): OnorbitthrusterServiceAsync.WithRawResponse

        fun onorbitthrusterstatus(): OnorbitthrusterstatusServiceAsync.WithRawResponse

        fun operatingunit(): OperatingunitServiceAsync.WithRawResponse

        fun operatingunitremark(): OperatingunitremarkServiceAsync.WithRawResponse

        fun orbitdetermination(): OrbitdeterminationServiceAsync.WithRawResponse

        fun orbittrack(): OrbittrackServiceAsync.WithRawResponse

        fun organization(): OrganizationServiceAsync.WithRawResponse

        fun organizationdetails(): OrganizationdetailServiceAsync.WithRawResponse

        fun personnelrecovery(): PersonnelrecoveryServiceAsync.WithRawResponse

        fun poi(): PoiServiceAsync.WithRawResponse

        fun port(): PortServiceAsync.WithRawResponse

        fun rfBand(): RfBandServiceAsync.WithRawResponse

        fun rfBandType(): RfBandTypeServiceAsync.WithRawResponse

        fun rfEmitter(): RfEmitterServiceAsync.WithRawResponse

        fun rfEmitterDetails(): RfEmitterDetailServiceAsync.WithRawResponse

        fun sarObservation(): SarObservationServiceAsync.WithRawResponse

        fun scientific(): ScientificServiceAsync.WithRawResponse

        fun sensor(): SensorServiceAsync.WithRawResponse

        fun sensorMaintenance(): SensorMaintenanceServiceAsync.WithRawResponse

        fun sensorObservationType(): SensorObservationTypeServiceAsync.WithRawResponse

        fun sensorPlan(): SensorPlanServiceAsync.WithRawResponse

        fun sensorType(): SensorTypeServiceAsync.WithRawResponse

        fun seraDataCommDetails(): SeraDataCommDetailServiceAsync.WithRawResponse

        fun seraDataEarlyWarning(): SeraDataEarlyWarningServiceAsync.WithRawResponse

        fun seraDataNavigation(): SeraDataNavigationServiceAsync.WithRawResponse

        fun seradataOpticalPayload(): SeradataOpticalPayloadServiceAsync.WithRawResponse

        fun seradataRadarPayload(): SeradataRadarPayloadServiceAsync.WithRawResponse

        fun seradataSigintPayload(): SeradataSigintPayloadServiceAsync.WithRawResponse

        fun seradataSpacecraftDetails(): SeradataSpacecraftDetailServiceAsync.WithRawResponse

        fun sgi(): SgiServiceAsync.WithRawResponse

        fun sigact(): SigactServiceAsync.WithRawResponse

        fun site(): SiteServiceAsync.WithRawResponse

        fun siteRemark(): SiteRemarkServiceAsync.WithRawResponse

        fun siteStatus(): SiteStatusServiceAsync.WithRawResponse

        fun skyImagery(): SkyImageryServiceAsync.WithRawResponse

        fun soiObservationSet(): SoiObservationSetServiceAsync.WithRawResponse

        fun solarArray(): SolarArrayServiceAsync.WithRawResponse

        fun solarArrayDetails(): SolarArrayDetailServiceAsync.WithRawResponse

        fun sortiePpr(): SortiePprServiceAsync.WithRawResponse

        fun spaceEnvObservation(): SpaceEnvObservationServiceAsync.WithRawResponse

        fun stage(): StageServiceAsync.WithRawResponse

        fun starCatalog(): StarCatalogServiceAsync.WithRawResponse

        fun stateVector(): StateVectorServiceAsync.WithRawResponse

        fun status(): StatusServiceAsync.WithRawResponse

        fun substatus(): SubstatusServiceAsync.WithRawResponse

        fun supportingData(): SupportingDataServiceAsync.WithRawResponse

        fun surface(): SurfaceServiceAsync.WithRawResponse

        fun surfaceObstruction(): SurfaceObstructionServiceAsync.WithRawResponse

        fun swir(): SwirServiceAsync.WithRawResponse

        fun taiUtc(): TaiUtcServiceAsync.WithRawResponse

        fun tdoaFdoa(): TdoaFdoaServiceAsync.WithRawResponse

        fun track(): TrackServiceAsync.WithRawResponse

        fun trackDetails(): TrackDetailServiceAsync.WithRawResponse

        fun trackRoute(): TrackRouteServiceAsync.WithRawResponse

        fun transponder(): TransponderServiceAsync.WithRawResponse

        fun vessel(): VesselServiceAsync.WithRawResponse

        fun video(): VideoServiceAsync.WithRawResponse

        fun weatherData(): WeatherDataServiceAsync.WithRawResponse

        fun weatherReport(): WeatherReportServiceAsync.WithRawResponse

        fun gnssObservations(): GnssObservationServiceAsync.WithRawResponse

        fun gnssRawIf(): GnssRawIfServiceAsync.WithRawResponse

        fun ionoObservations(): IonoObservationServiceAsync.WithRawResponse

        fun reportAndActivities(): ReportAndActivityServiceAsync.WithRawResponse

        fun secureMessaging(): SecureMessagingServiceAsync.WithRawResponse

        fun scs(): ScServiceAsync.WithRawResponse

        fun scsViews(): ScsViewServiceAsync.WithRawResponse
    }
}

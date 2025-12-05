// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.client

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.getPackageVersion
import com.unifieddatalibrary.api.services.async.AiServiceAsync
import com.unifieddatalibrary.api.services.async.AiServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirEventServiceAsync
import com.unifieddatalibrary.api.services.async.AirEventServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirOperationServiceAsync
import com.unifieddatalibrary.api.services.async.AirOperationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirTransportMissionServiceAsync
import com.unifieddatalibrary.api.services.async.AirTransportMissionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AircraftServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AircraftSortyServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftSortyServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AircraftStatusRemarkServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftStatusRemarkServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AircraftStatusServiceAsync
import com.unifieddatalibrary.api.services.async.AircraftStatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirfieldServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirfieldSlotConsumptionServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldSlotConsumptionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirfieldSlotServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldSlotServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirfieldStatusServiceAsync
import com.unifieddatalibrary.api.services.async.AirfieldStatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirloadPlanServiceAsync
import com.unifieddatalibrary.api.services.async.AirloadPlanServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AirspaceControlOrderServiceAsync
import com.unifieddatalibrary.api.services.async.AirspaceControlOrderServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AisObjectServiceAsync
import com.unifieddatalibrary.api.services.async.AisObjectServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AnalyticImageryServiceAsync
import com.unifieddatalibrary.api.services.async.AnalyticImageryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AntennaServiceAsync
import com.unifieddatalibrary.api.services.async.AntennaServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AttitudeDataServiceAsync
import com.unifieddatalibrary.api.services.async.AttitudeDataServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AttitudeSetServiceAsync
import com.unifieddatalibrary.api.services.async.AttitudeSetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.AviationRiskManagementServiceAsync
import com.unifieddatalibrary.api.services.async.AviationRiskManagementServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.BatteryServiceAsync
import com.unifieddatalibrary.api.services.async.BatteryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.BatterydetailServiceAsync
import com.unifieddatalibrary.api.services.async.BatterydetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.BeamContourServiceAsync
import com.unifieddatalibrary.api.services.async.BeamContourServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.BeamServiceAsync
import com.unifieddatalibrary.api.services.async.BeamServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.BusServiceAsync
import com.unifieddatalibrary.api.services.async.BusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ChannelServiceAsync
import com.unifieddatalibrary.api.services.async.ChannelServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.CloselyspacedobjectServiceAsync
import com.unifieddatalibrary.api.services.async.CloselyspacedobjectServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.CollectRequestServiceAsync
import com.unifieddatalibrary.api.services.async.CollectRequestServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.CollectResponseServiceAsync
import com.unifieddatalibrary.api.services.async.CollectResponseServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.CommServiceAsync
import com.unifieddatalibrary.api.services.async.CommServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ConjunctionServiceAsync
import com.unifieddatalibrary.api.services.async.ConjunctionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.CotServiceAsync
import com.unifieddatalibrary.api.services.async.CotServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.CountryServiceAsync
import com.unifieddatalibrary.api.services.async.CountryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.CrewServiceAsync
import com.unifieddatalibrary.api.services.async.CrewServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.DeconflictsetServiceAsync
import com.unifieddatalibrary.api.services.async.DeconflictsetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.DiffOfArrivalServiceAsync
import com.unifieddatalibrary.api.services.async.DiffOfArrivalServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.DiplomaticClearanceServiceAsync
import com.unifieddatalibrary.api.services.async.DiplomaticClearanceServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.DriftHistoryServiceAsync
import com.unifieddatalibrary.api.services.async.DriftHistoryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.DropzoneServiceAsync
import com.unifieddatalibrary.api.services.async.DropzoneServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EcpedrServiceAsync
import com.unifieddatalibrary.api.services.async.EcpedrServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EffectRequestServiceAsync
import com.unifieddatalibrary.api.services.async.EffectRequestServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EffectResponseServiceAsync
import com.unifieddatalibrary.api.services.async.EffectResponseServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ElsetServiceAsync
import com.unifieddatalibrary.api.services.async.ElsetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EmireportServiceAsync
import com.unifieddatalibrary.api.services.async.EmireportServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EmitterGeolocationServiceAsync
import com.unifieddatalibrary.api.services.async.EmitterGeolocationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EngineDetailServiceAsync
import com.unifieddatalibrary.api.services.async.EngineDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EngineServiceAsync
import com.unifieddatalibrary.api.services.async.EngineServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EntityServiceAsync
import com.unifieddatalibrary.api.services.async.EntityServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EopServiceAsync
import com.unifieddatalibrary.api.services.async.EopServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EphemerisServiceAsync
import com.unifieddatalibrary.api.services.async.EphemerisServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EphemerisSetServiceAsync
import com.unifieddatalibrary.api.services.async.EphemerisSetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EquipmentRemarkServiceAsync
import com.unifieddatalibrary.api.services.async.EquipmentRemarkServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EquipmentServiceAsync
import com.unifieddatalibrary.api.services.async.EquipmentServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EvacServiceAsync
import com.unifieddatalibrary.api.services.async.EvacServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.EventEvolutionServiceAsync
import com.unifieddatalibrary.api.services.async.EventEvolutionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.FeatureAssessmentServiceAsync
import com.unifieddatalibrary.api.services.async.FeatureAssessmentServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.FlightplanServiceAsync
import com.unifieddatalibrary.api.services.async.FlightplanServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.GeoStatusServiceAsync
import com.unifieddatalibrary.api.services.async.GeoStatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.GlobalAtmosphericModelServiceAsync
import com.unifieddatalibrary.api.services.async.GlobalAtmosphericModelServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.GnssObservationServiceAsync
import com.unifieddatalibrary.api.services.async.GnssObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.GnssObservationsetServiceAsync
import com.unifieddatalibrary.api.services.async.GnssObservationsetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.GnssRawIfServiceAsync
import com.unifieddatalibrary.api.services.async.GnssRawIfServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.GroundImageryServiceAsync
import com.unifieddatalibrary.api.services.async.GroundImageryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.H3GeoHexCellServiceAsync
import com.unifieddatalibrary.api.services.async.H3GeoHexCellServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.H3GeoServiceAsync
import com.unifieddatalibrary.api.services.async.H3GeoServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.HazardServiceAsync
import com.unifieddatalibrary.api.services.async.HazardServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.IonoObservationServiceAsync
import com.unifieddatalibrary.api.services.async.IonoObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.IrServiceAsync
import com.unifieddatalibrary.api.services.async.IrServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.IsrCollectionServiceAsync
import com.unifieddatalibrary.api.services.async.IsrCollectionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ItemServiceAsync
import com.unifieddatalibrary.api.services.async.ItemServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ItemTrackingServiceAsync
import com.unifieddatalibrary.api.services.async.ItemTrackingServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaserdeconflictrequestServiceAsync
import com.unifieddatalibrary.api.services.async.LaserdeconflictrequestServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaseremitterServiceAsync
import com.unifieddatalibrary.api.services.async.LaseremitterServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaunchDetectionServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchDetectionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaunchEventServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchEventServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaunchSiteDetailServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchSiteDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaunchSiteServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchSiteServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaunchVehicleDetailServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchVehicleDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LaunchVehicleServiceAsync
import com.unifieddatalibrary.api.services.async.LaunchVehicleServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LinkStatusServiceAsync
import com.unifieddatalibrary.api.services.async.LinkStatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LinkstatusServiceAsync
import com.unifieddatalibrary.api.services.async.LinkstatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LocationServiceAsync
import com.unifieddatalibrary.api.services.async.LocationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.LogisticsSupportServiceAsync
import com.unifieddatalibrary.api.services.async.LogisticsSupportServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ManeuverServiceAsync
import com.unifieddatalibrary.api.services.async.ManeuverServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ManifoldServiceAsync
import com.unifieddatalibrary.api.services.async.ManifoldServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ManifoldelsetServiceAsync
import com.unifieddatalibrary.api.services.async.ManifoldelsetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.MissileTrackServiceAsync
import com.unifieddatalibrary.api.services.async.MissileTrackServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.MissionAssignmentServiceAsync
import com.unifieddatalibrary.api.services.async.MissionAssignmentServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.MtiServiceAsync
import com.unifieddatalibrary.api.services.async.MtiServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.NavigationServiceAsync
import com.unifieddatalibrary.api.services.async.NavigationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.NavigationalObstructionServiceAsync
import com.unifieddatalibrary.api.services.async.NavigationalObstructionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.NotificationServiceAsync
import com.unifieddatalibrary.api.services.async.NotificationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ObjectOfInterestServiceAsync
import com.unifieddatalibrary.api.services.async.ObjectOfInterestServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ObservationServiceAsync
import com.unifieddatalibrary.api.services.async.ObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnboardnavigationServiceAsync
import com.unifieddatalibrary.api.services.async.OnboardnavigationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitantennaServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitantennaServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitassessmentServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitassessmentServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitbatteryServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitbatteryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitdetailServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitdetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbiteventServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbiteventServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitlistServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitlistServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitsolararrayServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitsolararrayServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitthrusterServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitthrusterServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OnorbitthrusterstatusServiceAsync
import com.unifieddatalibrary.api.services.async.OnorbitthrusterstatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OperatingunitServiceAsync
import com.unifieddatalibrary.api.services.async.OperatingunitServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OperatingunitremarkServiceAsync
import com.unifieddatalibrary.api.services.async.OperatingunitremarkServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OrbitdeterminationServiceAsync
import com.unifieddatalibrary.api.services.async.OrbitdeterminationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OrbittrackServiceAsync
import com.unifieddatalibrary.api.services.async.OrbittrackServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OrganizationServiceAsync
import com.unifieddatalibrary.api.services.async.OrganizationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.OrganizationdetailServiceAsync
import com.unifieddatalibrary.api.services.async.OrganizationdetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.PersonnelrecoveryServiceAsync
import com.unifieddatalibrary.api.services.async.PersonnelrecoveryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.PoiServiceAsync
import com.unifieddatalibrary.api.services.async.PoiServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.PortServiceAsync
import com.unifieddatalibrary.api.services.async.PortServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ReportAndActivityServiceAsync
import com.unifieddatalibrary.api.services.async.ReportAndActivityServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.RfBandServiceAsync
import com.unifieddatalibrary.api.services.async.RfBandServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.RfBandTypeServiceAsync
import com.unifieddatalibrary.api.services.async.RfBandTypeServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.RfEmitterServiceAsync
import com.unifieddatalibrary.api.services.async.RfEmitterServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.RouteStatServiceAsync
import com.unifieddatalibrary.api.services.async.RouteStatServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SarObservationServiceAsync
import com.unifieddatalibrary.api.services.async.SarObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ScServiceAsync
import com.unifieddatalibrary.api.services.async.ScServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.ScientificServiceAsync
import com.unifieddatalibrary.api.services.async.ScientificServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SecureMessagingServiceAsync
import com.unifieddatalibrary.api.services.async.SecureMessagingServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SensorMaintenanceServiceAsync
import com.unifieddatalibrary.api.services.async.SensorMaintenanceServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SensorObservationTypeServiceAsync
import com.unifieddatalibrary.api.services.async.SensorObservationTypeServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SensorPlanServiceAsync
import com.unifieddatalibrary.api.services.async.SensorPlanServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SensorServiceAsync
import com.unifieddatalibrary.api.services.async.SensorServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SensorStatingServiceAsync
import com.unifieddatalibrary.api.services.async.SensorStatingServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SensorTypeServiceAsync
import com.unifieddatalibrary.api.services.async.SensorTypeServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SeraDataCommDetailServiceAsync
import com.unifieddatalibrary.api.services.async.SeraDataCommDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SeraDataEarlyWarningServiceAsync
import com.unifieddatalibrary.api.services.async.SeraDataEarlyWarningServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SeraDataNavigationServiceAsync
import com.unifieddatalibrary.api.services.async.SeraDataNavigationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SeradataOpticalPayloadServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataOpticalPayloadServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SeradataRadarPayloadServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataRadarPayloadServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SeradataSigintPayloadServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataSigintPayloadServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SeradataSpacecraftDetailServiceAsync
import com.unifieddatalibrary.api.services.async.SeradataSpacecraftDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SgiServiceAsync
import com.unifieddatalibrary.api.services.async.SgiServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SigactServiceAsync
import com.unifieddatalibrary.api.services.async.SigactServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SiteRemarkServiceAsync
import com.unifieddatalibrary.api.services.async.SiteRemarkServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SiteServiceAsync
import com.unifieddatalibrary.api.services.async.SiteServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SiteStatusServiceAsync
import com.unifieddatalibrary.api.services.async.SiteStatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SkyImageryServiceAsync
import com.unifieddatalibrary.api.services.async.SkyImageryServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SoiObservationSetServiceAsync
import com.unifieddatalibrary.api.services.async.SoiObservationSetServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SolarArrayDetailServiceAsync
import com.unifieddatalibrary.api.services.async.SolarArrayDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SolarArrayServiceAsync
import com.unifieddatalibrary.api.services.async.SolarArrayServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SortiePprServiceAsync
import com.unifieddatalibrary.api.services.async.SortiePprServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SpaceEnvObservationServiceAsync
import com.unifieddatalibrary.api.services.async.SpaceEnvObservationServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.StageServiceAsync
import com.unifieddatalibrary.api.services.async.StageServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.StarCatalogServiceAsync
import com.unifieddatalibrary.api.services.async.StarCatalogServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.StateVectorServiceAsync
import com.unifieddatalibrary.api.services.async.StateVectorServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.StatusServiceAsync
import com.unifieddatalibrary.api.services.async.StatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SubstatusServiceAsync
import com.unifieddatalibrary.api.services.async.SubstatusServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SupportingDataServiceAsync
import com.unifieddatalibrary.api.services.async.SupportingDataServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SurfaceObstructionServiceAsync
import com.unifieddatalibrary.api.services.async.SurfaceObstructionServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SurfaceServiceAsync
import com.unifieddatalibrary.api.services.async.SurfaceServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.SwirServiceAsync
import com.unifieddatalibrary.api.services.async.SwirServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.TaiUtcServiceAsync
import com.unifieddatalibrary.api.services.async.TaiUtcServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.TdoaFdoaServiceAsync
import com.unifieddatalibrary.api.services.async.TdoaFdoaServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.TrackDetailServiceAsync
import com.unifieddatalibrary.api.services.async.TrackDetailServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.TrackRouteServiceAsync
import com.unifieddatalibrary.api.services.async.TrackRouteServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.TrackServiceAsync
import com.unifieddatalibrary.api.services.async.TrackServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.TransponderServiceAsync
import com.unifieddatalibrary.api.services.async.TransponderServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.UserServiceAsync
import com.unifieddatalibrary.api.services.async.UserServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.VesselServiceAsync
import com.unifieddatalibrary.api.services.async.VesselServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.VideoServiceAsync
import com.unifieddatalibrary.api.services.async.VideoServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.WeatherDataServiceAsync
import com.unifieddatalibrary.api.services.async.WeatherDataServiceAsyncImpl
import com.unifieddatalibrary.api.services.async.WeatherReportServiceAsync
import com.unifieddatalibrary.api.services.async.WeatherReportServiceAsyncImpl
import java.util.function.Consumer

class UnifieddatalibraryClientAsyncImpl(private val clientOptions: ClientOptions) :
    UnifieddatalibraryClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: UnifieddatalibraryClient by lazy {
        UnifieddatalibraryClientImpl(clientOptions)
    }

    private val withRawResponse: UnifieddatalibraryClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val airEvents: AirEventServiceAsync by lazy {
        AirEventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airOperations: AirOperationServiceAsync by lazy {
        AirOperationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airTransportMissions: AirTransportMissionServiceAsync by lazy {
        AirTransportMissionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val aircraft: AircraftServiceAsync by lazy {
        AircraftServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val aircraftSorties: AircraftSortyServiceAsync by lazy {
        AircraftSortyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val aircraftStatusRemarks: AircraftStatusRemarkServiceAsync by lazy {
        AircraftStatusRemarkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val aircraftStatuses: AircraftStatusServiceAsync by lazy {
        AircraftStatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airfieldSlotConsumptions: AirfieldSlotConsumptionServiceAsync by lazy {
        AirfieldSlotConsumptionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airfieldSlots: AirfieldSlotServiceAsync by lazy {
        AirfieldSlotServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airfieldStatus: AirfieldStatusServiceAsync by lazy {
        AirfieldStatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airfields: AirfieldServiceAsync by lazy {
        AirfieldServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airloadPlans: AirloadPlanServiceAsync by lazy {
        AirloadPlanServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val airspaceControlOrders: AirspaceControlOrderServiceAsync by lazy {
        AirspaceControlOrderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ais: AiServiceAsync by lazy { AiServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val aisObjects: AisObjectServiceAsync by lazy {
        AisObjectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val analyticImagery: AnalyticImageryServiceAsync by lazy {
        AnalyticImageryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val antennas: AntennaServiceAsync by lazy {
        AntennaServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val attitudeData: AttitudeDataServiceAsync by lazy {
        AttitudeDataServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val attitudeSets: AttitudeSetServiceAsync by lazy {
        AttitudeSetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val aviationRiskManagement: AviationRiskManagementServiceAsync by lazy {
        AviationRiskManagementServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val batteries: BatteryServiceAsync by lazy {
        BatteryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val batterydetails: BatterydetailServiceAsync by lazy {
        BatterydetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val beam: BeamServiceAsync by lazy { BeamServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val beamContours: BeamContourServiceAsync by lazy {
        BeamContourServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val buses: BusServiceAsync by lazy { BusServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val channels: ChannelServiceAsync by lazy {
        ChannelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val closelyspacedobjects: CloselyspacedobjectServiceAsync by lazy {
        CloselyspacedobjectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val collectRequests: CollectRequestServiceAsync by lazy {
        CollectRequestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val collectResponses: CollectResponseServiceAsync by lazy {
        CollectResponseServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val comm: CommServiceAsync by lazy { CommServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val conjunctions: ConjunctionServiceAsync by lazy {
        ConjunctionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cots: CotServiceAsync by lazy { CotServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val countries: CountryServiceAsync by lazy {
        CountryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val crew: CrewServiceAsync by lazy { CrewServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val deconflictset: DeconflictsetServiceAsync by lazy {
        DeconflictsetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val diffOfArrival: DiffOfArrivalServiceAsync by lazy {
        DiffOfArrivalServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val diplomaticClearance: DiplomaticClearanceServiceAsync by lazy {
        DiplomaticClearanceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val driftHistory: DriftHistoryServiceAsync by lazy {
        DriftHistoryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val dropzone: DropzoneServiceAsync by lazy {
        DropzoneServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ecpedr: EcpedrServiceAsync by lazy {
        EcpedrServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val effectRequests: EffectRequestServiceAsync by lazy {
        EffectRequestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val effectResponses: EffectResponseServiceAsync by lazy {
        EffectResponseServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val elsets: ElsetServiceAsync by lazy {
        ElsetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val emireport: EmireportServiceAsync by lazy {
        EmireportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val emitterGeolocation: EmitterGeolocationServiceAsync by lazy {
        EmitterGeolocationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val engineDetails: EngineDetailServiceAsync by lazy {
        EngineDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val engines: EngineServiceAsync by lazy {
        EngineServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val entities: EntityServiceAsync by lazy {
        EntityServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val eop: EopServiceAsync by lazy { EopServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val ephemeris: EphemerisServiceAsync by lazy {
        EphemerisServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ephemerisSets: EphemerisSetServiceAsync by lazy {
        EphemerisSetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val equipment: EquipmentServiceAsync by lazy {
        EquipmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val equipmentRemarks: EquipmentRemarkServiceAsync by lazy {
        EquipmentRemarkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val evac: EvacServiceAsync by lazy { EvacServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val eventEvolution: EventEvolutionServiceAsync by lazy {
        EventEvolutionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val featureAssessment: FeatureAssessmentServiceAsync by lazy {
        FeatureAssessmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val flightplan: FlightplanServiceAsync by lazy {
        FlightplanServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val geoStatus: GeoStatusServiceAsync by lazy {
        GeoStatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val globalAtmosphericModel: GlobalAtmosphericModelServiceAsync by lazy {
        GlobalAtmosphericModelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val gnssObservations: GnssObservationServiceAsync by lazy {
        GnssObservationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val gnssObservationset: GnssObservationsetServiceAsync by lazy {
        GnssObservationsetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val gnssRawIf: GnssRawIfServiceAsync by lazy {
        GnssRawIfServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val groundImagery: GroundImageryServiceAsync by lazy {
        GroundImageryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val h3Geo: H3GeoServiceAsync by lazy {
        H3GeoServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val h3GeoHexCell: H3GeoHexCellServiceAsync by lazy {
        H3GeoHexCellServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val hazard: HazardServiceAsync by lazy {
        HazardServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ionoObservations: IonoObservationServiceAsync by lazy {
        IonoObservationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ir: IrServiceAsync by lazy { IrServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val isrCollections: IsrCollectionServiceAsync by lazy {
        IsrCollectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val item: ItemServiceAsync by lazy { ItemServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val itemTrackings: ItemTrackingServiceAsync by lazy {
        ItemTrackingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val laserdeconflictrequest: LaserdeconflictrequestServiceAsync by lazy {
        LaserdeconflictrequestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val laseremitter: LaseremitterServiceAsync by lazy {
        LaseremitterServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val launchDetection: LaunchDetectionServiceAsync by lazy {
        LaunchDetectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val launchEvent: LaunchEventServiceAsync by lazy {
        LaunchEventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val launchSite: LaunchSiteServiceAsync by lazy {
        LaunchSiteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val launchSiteDetails: LaunchSiteDetailServiceAsync by lazy {
        LaunchSiteDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val launchVehicle: LaunchVehicleServiceAsync by lazy {
        LaunchVehicleServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val launchVehicleDetails: LaunchVehicleDetailServiceAsync by lazy {
        LaunchVehicleDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val linkStatus: LinkStatusServiceAsync by lazy {
        LinkStatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val linkstatus: LinkstatusServiceAsync by lazy {
        LinkstatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val location: LocationServiceAsync by lazy {
        LocationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val logisticsSupport: LogisticsSupportServiceAsync by lazy {
        LogisticsSupportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val maneuvers: ManeuverServiceAsync by lazy {
        ManeuverServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val manifold: ManifoldServiceAsync by lazy {
        ManifoldServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val manifoldelset: ManifoldelsetServiceAsync by lazy {
        ManifoldelsetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val missileTracks: MissileTrackServiceAsync by lazy {
        MissileTrackServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val missionAssignment: MissionAssignmentServiceAsync by lazy {
        MissionAssignmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val mti: MtiServiceAsync by lazy { MtiServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val navigation: NavigationServiceAsync by lazy {
        NavigationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val navigationalObstruction: NavigationalObstructionServiceAsync by lazy {
        NavigationalObstructionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val notification: NotificationServiceAsync by lazy {
        NotificationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val objectOfInterest: ObjectOfInterestServiceAsync by lazy {
        ObjectOfInterestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val observations: ObservationServiceAsync by lazy {
        ObservationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onboardnavigation: OnboardnavigationServiceAsync by lazy {
        OnboardnavigationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbit: OnorbitServiceAsync by lazy {
        OnorbitServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitantenna: OnorbitantennaServiceAsync by lazy {
        OnorbitantennaServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitbattery: OnorbitbatteryServiceAsync by lazy {
        OnorbitbatteryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitdetails: OnorbitdetailServiceAsync by lazy {
        OnorbitdetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitevent: OnorbiteventServiceAsync by lazy {
        OnorbiteventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitlist: OnorbitlistServiceAsync by lazy {
        OnorbitlistServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitsolararray: OnorbitsolararrayServiceAsync by lazy {
        OnorbitsolararrayServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitthruster: OnorbitthrusterServiceAsync by lazy {
        OnorbitthrusterServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitthrusterstatus: OnorbitthrusterstatusServiceAsync by lazy {
        OnorbitthrusterstatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val onorbitassessment: OnorbitassessmentServiceAsync by lazy {
        OnorbitassessmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val operatingunit: OperatingunitServiceAsync by lazy {
        OperatingunitServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val operatingunitremark: OperatingunitremarkServiceAsync by lazy {
        OperatingunitremarkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val orbitdetermination: OrbitdeterminationServiceAsync by lazy {
        OrbitdeterminationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val orbittrack: OrbittrackServiceAsync by lazy {
        OrbittrackServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val organization: OrganizationServiceAsync by lazy {
        OrganizationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val organizationdetails: OrganizationdetailServiceAsync by lazy {
        OrganizationdetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val personnelrecovery: PersonnelrecoveryServiceAsync by lazy {
        PersonnelrecoveryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val poi: PoiServiceAsync by lazy { PoiServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val port: PortServiceAsync by lazy { PortServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val reportAndActivities: ReportAndActivityServiceAsync by lazy {
        ReportAndActivityServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val rfBand: RfBandServiceAsync by lazy {
        RfBandServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val rfBandType: RfBandTypeServiceAsync by lazy {
        RfBandTypeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val rfEmitter: RfEmitterServiceAsync by lazy {
        RfEmitterServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val routeStats: RouteStatServiceAsync by lazy {
        RouteStatServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sarObservation: SarObservationServiceAsync by lazy {
        SarObservationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val scientific: ScientificServiceAsync by lazy {
        ScientificServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val scs: ScServiceAsync by lazy { ScServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val secureMessaging: SecureMessagingServiceAsync by lazy {
        SecureMessagingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sensor: SensorServiceAsync by lazy {
        SensorServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sensorStating: SensorStatingServiceAsync by lazy {
        SensorStatingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sensorMaintenance: SensorMaintenanceServiceAsync by lazy {
        SensorMaintenanceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sensorObservationType: SensorObservationTypeServiceAsync by lazy {
        SensorObservationTypeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sensorPlan: SensorPlanServiceAsync by lazy {
        SensorPlanServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sensorType: SensorTypeServiceAsync by lazy {
        SensorTypeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val seraDataCommDetails: SeraDataCommDetailServiceAsync by lazy {
        SeraDataCommDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val seraDataEarlyWarning: SeraDataEarlyWarningServiceAsync by lazy {
        SeraDataEarlyWarningServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val seraDataNavigation: SeraDataNavigationServiceAsync by lazy {
        SeraDataNavigationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val seradataOpticalPayload: SeradataOpticalPayloadServiceAsync by lazy {
        SeradataOpticalPayloadServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val seradataRadarPayload: SeradataRadarPayloadServiceAsync by lazy {
        SeradataRadarPayloadServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val seradataSigintPayload: SeradataSigintPayloadServiceAsync by lazy {
        SeradataSigintPayloadServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val seradataSpacecraftDetails: SeradataSpacecraftDetailServiceAsync by lazy {
        SeradataSpacecraftDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sgi: SgiServiceAsync by lazy { SgiServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val sigact: SigactServiceAsync by lazy {
        SigactServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val site: SiteServiceAsync by lazy { SiteServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val siteRemark: SiteRemarkServiceAsync by lazy {
        SiteRemarkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val siteStatus: SiteStatusServiceAsync by lazy {
        SiteStatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val skyImagery: SkyImageryServiceAsync by lazy {
        SkyImageryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val soiObservationSet: SoiObservationSetServiceAsync by lazy {
        SoiObservationSetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val solarArray: SolarArrayServiceAsync by lazy {
        SolarArrayServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val solarArrayDetails: SolarArrayDetailServiceAsync by lazy {
        SolarArrayDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sortiePpr: SortiePprServiceAsync by lazy {
        SortiePprServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val spaceEnvObservation: SpaceEnvObservationServiceAsync by lazy {
        SpaceEnvObservationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val stage: StageServiceAsync by lazy {
        StageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val starCatalog: StarCatalogServiceAsync by lazy {
        StarCatalogServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val stateVector: StateVectorServiceAsync by lazy {
        StateVectorServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val status: StatusServiceAsync by lazy {
        StatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val substatus: SubstatusServiceAsync by lazy {
        SubstatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val supportingData: SupportingDataServiceAsync by lazy {
        SupportingDataServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val surface: SurfaceServiceAsync by lazy {
        SurfaceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val surfaceObstruction: SurfaceObstructionServiceAsync by lazy {
        SurfaceObstructionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val swir: SwirServiceAsync by lazy { SwirServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val taiUtc: TaiUtcServiceAsync by lazy {
        TaiUtcServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val tdoaFdoa: TdoaFdoaServiceAsync by lazy {
        TdoaFdoaServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val track: TrackServiceAsync by lazy {
        TrackServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val trackDetails: TrackDetailServiceAsync by lazy {
        TrackDetailServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val trackRoute: TrackRouteServiceAsync by lazy {
        TrackRouteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transponder: TransponderServiceAsync by lazy {
        TransponderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val user: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val vessel: VesselServiceAsync by lazy {
        VesselServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val video: VideoServiceAsync by lazy {
        VideoServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val weatherData: WeatherDataServiceAsync by lazy {
        WeatherDataServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val weatherReport: WeatherReportServiceAsync by lazy {
        WeatherReportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): UnifieddatalibraryClient = sync

    override fun withRawResponse(): UnifieddatalibraryClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): UnifieddatalibraryClientAsync =
        UnifieddatalibraryClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun airEvents(): AirEventServiceAsync = airEvents

    override fun airOperations(): AirOperationServiceAsync = airOperations

    override fun airTransportMissions(): AirTransportMissionServiceAsync = airTransportMissions

    override fun aircraft(): AircraftServiceAsync = aircraft

    override fun aircraftSorties(): AircraftSortyServiceAsync = aircraftSorties

    override fun aircraftStatusRemarks(): AircraftStatusRemarkServiceAsync = aircraftStatusRemarks

    override fun aircraftStatuses(): AircraftStatusServiceAsync = aircraftStatuses

    override fun airfieldSlotConsumptions(): AirfieldSlotConsumptionServiceAsync =
        airfieldSlotConsumptions

    override fun airfieldSlots(): AirfieldSlotServiceAsync = airfieldSlots

    override fun airfieldStatus(): AirfieldStatusServiceAsync = airfieldStatus

    override fun airfields(): AirfieldServiceAsync = airfields

    override fun airloadPlans(): AirloadPlanServiceAsync = airloadPlans

    override fun airspaceControlOrders(): AirspaceControlOrderServiceAsync = airspaceControlOrders

    override fun ais(): AiServiceAsync = ais

    override fun aisObjects(): AisObjectServiceAsync = aisObjects

    override fun analyticImagery(): AnalyticImageryServiceAsync = analyticImagery

    override fun antennas(): AntennaServiceAsync = antennas

    override fun attitudeData(): AttitudeDataServiceAsync = attitudeData

    override fun attitudeSets(): AttitudeSetServiceAsync = attitudeSets

    override fun aviationRiskManagement(): AviationRiskManagementServiceAsync =
        aviationRiskManagement

    override fun batteries(): BatteryServiceAsync = batteries

    override fun batterydetails(): BatterydetailServiceAsync = batterydetails

    override fun beam(): BeamServiceAsync = beam

    override fun beamContours(): BeamContourServiceAsync = beamContours

    override fun buses(): BusServiceAsync = buses

    override fun channels(): ChannelServiceAsync = channels

    override fun closelyspacedobjects(): CloselyspacedobjectServiceAsync = closelyspacedobjects

    override fun collectRequests(): CollectRequestServiceAsync = collectRequests

    override fun collectResponses(): CollectResponseServiceAsync = collectResponses

    override fun comm(): CommServiceAsync = comm

    override fun conjunctions(): ConjunctionServiceAsync = conjunctions

    override fun cots(): CotServiceAsync = cots

    override fun countries(): CountryServiceAsync = countries

    override fun crew(): CrewServiceAsync = crew

    override fun deconflictset(): DeconflictsetServiceAsync = deconflictset

    override fun diffOfArrival(): DiffOfArrivalServiceAsync = diffOfArrival

    override fun diplomaticClearance(): DiplomaticClearanceServiceAsync = diplomaticClearance

    override fun driftHistory(): DriftHistoryServiceAsync = driftHistory

    override fun dropzone(): DropzoneServiceAsync = dropzone

    override fun ecpedr(): EcpedrServiceAsync = ecpedr

    override fun effectRequests(): EffectRequestServiceAsync = effectRequests

    override fun effectResponses(): EffectResponseServiceAsync = effectResponses

    override fun elsets(): ElsetServiceAsync = elsets

    override fun emireport(): EmireportServiceAsync = emireport

    override fun emitterGeolocation(): EmitterGeolocationServiceAsync = emitterGeolocation

    override fun engineDetails(): EngineDetailServiceAsync = engineDetails

    override fun engines(): EngineServiceAsync = engines

    override fun entities(): EntityServiceAsync = entities

    override fun eop(): EopServiceAsync = eop

    override fun ephemeris(): EphemerisServiceAsync = ephemeris

    override fun ephemerisSets(): EphemerisSetServiceAsync = ephemerisSets

    override fun equipment(): EquipmentServiceAsync = equipment

    override fun equipmentRemarks(): EquipmentRemarkServiceAsync = equipmentRemarks

    override fun evac(): EvacServiceAsync = evac

    override fun eventEvolution(): EventEvolutionServiceAsync = eventEvolution

    override fun featureAssessment(): FeatureAssessmentServiceAsync = featureAssessment

    override fun flightplan(): FlightplanServiceAsync = flightplan

    override fun geoStatus(): GeoStatusServiceAsync = geoStatus

    override fun globalAtmosphericModel(): GlobalAtmosphericModelServiceAsync =
        globalAtmosphericModel

    override fun gnssObservations(): GnssObservationServiceAsync = gnssObservations

    override fun gnssObservationset(): GnssObservationsetServiceAsync = gnssObservationset

    override fun gnssRawIf(): GnssRawIfServiceAsync = gnssRawIf

    override fun groundImagery(): GroundImageryServiceAsync = groundImagery

    override fun h3Geo(): H3GeoServiceAsync = h3Geo

    override fun h3GeoHexCell(): H3GeoHexCellServiceAsync = h3GeoHexCell

    override fun hazard(): HazardServiceAsync = hazard

    override fun ionoObservations(): IonoObservationServiceAsync = ionoObservations

    override fun ir(): IrServiceAsync = ir

    override fun isrCollections(): IsrCollectionServiceAsync = isrCollections

    override fun item(): ItemServiceAsync = item

    override fun itemTrackings(): ItemTrackingServiceAsync = itemTrackings

    override fun laserdeconflictrequest(): LaserdeconflictrequestServiceAsync =
        laserdeconflictrequest

    override fun laseremitter(): LaseremitterServiceAsync = laseremitter

    override fun launchDetection(): LaunchDetectionServiceAsync = launchDetection

    override fun launchEvent(): LaunchEventServiceAsync = launchEvent

    override fun launchSite(): LaunchSiteServiceAsync = launchSite

    override fun launchSiteDetails(): LaunchSiteDetailServiceAsync = launchSiteDetails

    override fun launchVehicle(): LaunchVehicleServiceAsync = launchVehicle

    override fun launchVehicleDetails(): LaunchVehicleDetailServiceAsync = launchVehicleDetails

    override fun linkStatus(): LinkStatusServiceAsync = linkStatus

    override fun linkstatus(): LinkstatusServiceAsync = linkstatus

    override fun location(): LocationServiceAsync = location

    override fun logisticsSupport(): LogisticsSupportServiceAsync = logisticsSupport

    override fun maneuvers(): ManeuverServiceAsync = maneuvers

    override fun manifold(): ManifoldServiceAsync = manifold

    override fun manifoldelset(): ManifoldelsetServiceAsync = manifoldelset

    override fun missileTracks(): MissileTrackServiceAsync = missileTracks

    override fun missionAssignment(): MissionAssignmentServiceAsync = missionAssignment

    override fun mti(): MtiServiceAsync = mti

    override fun navigation(): NavigationServiceAsync = navigation

    override fun navigationalObstruction(): NavigationalObstructionServiceAsync =
        navigationalObstruction

    override fun notification(): NotificationServiceAsync = notification

    override fun objectOfInterest(): ObjectOfInterestServiceAsync = objectOfInterest

    override fun observations(): ObservationServiceAsync = observations

    override fun onboardnavigation(): OnboardnavigationServiceAsync = onboardnavigation

    override fun onorbit(): OnorbitServiceAsync = onorbit

    override fun onorbitantenna(): OnorbitantennaServiceAsync = onorbitantenna

    override fun onorbitbattery(): OnorbitbatteryServiceAsync = onorbitbattery

    override fun onorbitdetails(): OnorbitdetailServiceAsync = onorbitdetails

    override fun onorbitevent(): OnorbiteventServiceAsync = onorbitevent

    override fun onorbitlist(): OnorbitlistServiceAsync = onorbitlist

    override fun onorbitsolararray(): OnorbitsolararrayServiceAsync = onorbitsolararray

    override fun onorbitthruster(): OnorbitthrusterServiceAsync = onorbitthruster

    override fun onorbitthrusterstatus(): OnorbitthrusterstatusServiceAsync = onorbitthrusterstatus

    override fun onorbitassessment(): OnorbitassessmentServiceAsync = onorbitassessment

    override fun operatingunit(): OperatingunitServiceAsync = operatingunit

    override fun operatingunitremark(): OperatingunitremarkServiceAsync = operatingunitremark

    override fun orbitdetermination(): OrbitdeterminationServiceAsync = orbitdetermination

    override fun orbittrack(): OrbittrackServiceAsync = orbittrack

    override fun organization(): OrganizationServiceAsync = organization

    override fun organizationdetails(): OrganizationdetailServiceAsync = organizationdetails

    override fun personnelrecovery(): PersonnelrecoveryServiceAsync = personnelrecovery

    override fun poi(): PoiServiceAsync = poi

    override fun port(): PortServiceAsync = port

    override fun reportAndActivities(): ReportAndActivityServiceAsync = reportAndActivities

    override fun rfBand(): RfBandServiceAsync = rfBand

    override fun rfBandType(): RfBandTypeServiceAsync = rfBandType

    override fun rfEmitter(): RfEmitterServiceAsync = rfEmitter

    override fun routeStats(): RouteStatServiceAsync = routeStats

    override fun sarObservation(): SarObservationServiceAsync = sarObservation

    override fun scientific(): ScientificServiceAsync = scientific

    override fun scs(): ScServiceAsync = scs

    override fun secureMessaging(): SecureMessagingServiceAsync = secureMessaging

    override fun sensor(): SensorServiceAsync = sensor

    override fun sensorStating(): SensorStatingServiceAsync = sensorStating

    override fun sensorMaintenance(): SensorMaintenanceServiceAsync = sensorMaintenance

    override fun sensorObservationType(): SensorObservationTypeServiceAsync = sensorObservationType

    override fun sensorPlan(): SensorPlanServiceAsync = sensorPlan

    override fun sensorType(): SensorTypeServiceAsync = sensorType

    override fun seraDataCommDetails(): SeraDataCommDetailServiceAsync = seraDataCommDetails

    override fun seraDataEarlyWarning(): SeraDataEarlyWarningServiceAsync = seraDataEarlyWarning

    override fun seraDataNavigation(): SeraDataNavigationServiceAsync = seraDataNavigation

    override fun seradataOpticalPayload(): SeradataOpticalPayloadServiceAsync =
        seradataOpticalPayload

    override fun seradataRadarPayload(): SeradataRadarPayloadServiceAsync = seradataRadarPayload

    override fun seradataSigintPayload(): SeradataSigintPayloadServiceAsync = seradataSigintPayload

    override fun seradataSpacecraftDetails(): SeradataSpacecraftDetailServiceAsync =
        seradataSpacecraftDetails

    override fun sgi(): SgiServiceAsync = sgi

    override fun sigact(): SigactServiceAsync = sigact

    override fun site(): SiteServiceAsync = site

    override fun siteRemark(): SiteRemarkServiceAsync = siteRemark

    override fun siteStatus(): SiteStatusServiceAsync = siteStatus

    override fun skyImagery(): SkyImageryServiceAsync = skyImagery

    override fun soiObservationSet(): SoiObservationSetServiceAsync = soiObservationSet

    override fun solarArray(): SolarArrayServiceAsync = solarArray

    override fun solarArrayDetails(): SolarArrayDetailServiceAsync = solarArrayDetails

    override fun sortiePpr(): SortiePprServiceAsync = sortiePpr

    override fun spaceEnvObservation(): SpaceEnvObservationServiceAsync = spaceEnvObservation

    override fun stage(): StageServiceAsync = stage

    override fun starCatalog(): StarCatalogServiceAsync = starCatalog

    override fun stateVector(): StateVectorServiceAsync = stateVector

    override fun status(): StatusServiceAsync = status

    override fun substatus(): SubstatusServiceAsync = substatus

    override fun supportingData(): SupportingDataServiceAsync = supportingData

    override fun surface(): SurfaceServiceAsync = surface

    override fun surfaceObstruction(): SurfaceObstructionServiceAsync = surfaceObstruction

    override fun swir(): SwirServiceAsync = swir

    override fun taiUtc(): TaiUtcServiceAsync = taiUtc

    override fun tdoaFdoa(): TdoaFdoaServiceAsync = tdoaFdoa

    override fun track(): TrackServiceAsync = track

    override fun trackDetails(): TrackDetailServiceAsync = trackDetails

    override fun trackRoute(): TrackRouteServiceAsync = trackRoute

    override fun transponder(): TransponderServiceAsync = transponder

    override fun user(): UserServiceAsync = user

    override fun vessel(): VesselServiceAsync = vessel

    override fun video(): VideoServiceAsync = video

    override fun weatherData(): WeatherDataServiceAsync = weatherData

    override fun weatherReport(): WeatherReportServiceAsync = weatherReport

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UnifieddatalibraryClientAsync.WithRawResponse {

        private val airEvents: AirEventServiceAsync.WithRawResponse by lazy {
            AirEventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airOperations: AirOperationServiceAsync.WithRawResponse by lazy {
            AirOperationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airTransportMissions: AirTransportMissionServiceAsync.WithRawResponse by lazy {
            AirTransportMissionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aircraft: AircraftServiceAsync.WithRawResponse by lazy {
            AircraftServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aircraftSorties: AircraftSortyServiceAsync.WithRawResponse by lazy {
            AircraftSortyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aircraftStatusRemarks:
            AircraftStatusRemarkServiceAsync.WithRawResponse by lazy {
            AircraftStatusRemarkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aircraftStatuses: AircraftStatusServiceAsync.WithRawResponse by lazy {
            AircraftStatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airfieldSlotConsumptions:
            AirfieldSlotConsumptionServiceAsync.WithRawResponse by lazy {
            AirfieldSlotConsumptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airfieldSlots: AirfieldSlotServiceAsync.WithRawResponse by lazy {
            AirfieldSlotServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airfieldStatus: AirfieldStatusServiceAsync.WithRawResponse by lazy {
            AirfieldStatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airfields: AirfieldServiceAsync.WithRawResponse by lazy {
            AirfieldServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airloadPlans: AirloadPlanServiceAsync.WithRawResponse by lazy {
            AirloadPlanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val airspaceControlOrders:
            AirspaceControlOrderServiceAsync.WithRawResponse by lazy {
            AirspaceControlOrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ais: AiServiceAsync.WithRawResponse by lazy {
            AiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aisObjects: AisObjectServiceAsync.WithRawResponse by lazy {
            AisObjectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val analyticImagery: AnalyticImageryServiceAsync.WithRawResponse by lazy {
            AnalyticImageryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val antennas: AntennaServiceAsync.WithRawResponse by lazy {
            AntennaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val attitudeData: AttitudeDataServiceAsync.WithRawResponse by lazy {
            AttitudeDataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val attitudeSets: AttitudeSetServiceAsync.WithRawResponse by lazy {
            AttitudeSetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aviationRiskManagement:
            AviationRiskManagementServiceAsync.WithRawResponse by lazy {
            AviationRiskManagementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batteries: BatteryServiceAsync.WithRawResponse by lazy {
            BatteryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batterydetails: BatterydetailServiceAsync.WithRawResponse by lazy {
            BatterydetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val beam: BeamServiceAsync.WithRawResponse by lazy {
            BeamServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val beamContours: BeamContourServiceAsync.WithRawResponse by lazy {
            BeamContourServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val buses: BusServiceAsync.WithRawResponse by lazy {
            BusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val channels: ChannelServiceAsync.WithRawResponse by lazy {
            ChannelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val closelyspacedobjects: CloselyspacedobjectServiceAsync.WithRawResponse by lazy {
            CloselyspacedobjectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val collectRequests: CollectRequestServiceAsync.WithRawResponse by lazy {
            CollectRequestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val collectResponses: CollectResponseServiceAsync.WithRawResponse by lazy {
            CollectResponseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val comm: CommServiceAsync.WithRawResponse by lazy {
            CommServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val conjunctions: ConjunctionServiceAsync.WithRawResponse by lazy {
            ConjunctionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cots: CotServiceAsync.WithRawResponse by lazy {
            CotServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val countries: CountryServiceAsync.WithRawResponse by lazy {
            CountryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val crew: CrewServiceAsync.WithRawResponse by lazy {
            CrewServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val deconflictset: DeconflictsetServiceAsync.WithRawResponse by lazy {
            DeconflictsetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val diffOfArrival: DiffOfArrivalServiceAsync.WithRawResponse by lazy {
            DiffOfArrivalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val diplomaticClearance: DiplomaticClearanceServiceAsync.WithRawResponse by lazy {
            DiplomaticClearanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val driftHistory: DriftHistoryServiceAsync.WithRawResponse by lazy {
            DriftHistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dropzone: DropzoneServiceAsync.WithRawResponse by lazy {
            DropzoneServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ecpedr: EcpedrServiceAsync.WithRawResponse by lazy {
            EcpedrServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val effectRequests: EffectRequestServiceAsync.WithRawResponse by lazy {
            EffectRequestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val effectResponses: EffectResponseServiceAsync.WithRawResponse by lazy {
            EffectResponseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val elsets: ElsetServiceAsync.WithRawResponse by lazy {
            ElsetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val emireport: EmireportServiceAsync.WithRawResponse by lazy {
            EmireportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val emitterGeolocation: EmitterGeolocationServiceAsync.WithRawResponse by lazy {
            EmitterGeolocationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val engineDetails: EngineDetailServiceAsync.WithRawResponse by lazy {
            EngineDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val engines: EngineServiceAsync.WithRawResponse by lazy {
            EngineServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val entities: EntityServiceAsync.WithRawResponse by lazy {
            EntityServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val eop: EopServiceAsync.WithRawResponse by lazy {
            EopServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ephemeris: EphemerisServiceAsync.WithRawResponse by lazy {
            EphemerisServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ephemerisSets: EphemerisSetServiceAsync.WithRawResponse by lazy {
            EphemerisSetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val equipment: EquipmentServiceAsync.WithRawResponse by lazy {
            EquipmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val equipmentRemarks: EquipmentRemarkServiceAsync.WithRawResponse by lazy {
            EquipmentRemarkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val evac: EvacServiceAsync.WithRawResponse by lazy {
            EvacServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val eventEvolution: EventEvolutionServiceAsync.WithRawResponse by lazy {
            EventEvolutionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val featureAssessment: FeatureAssessmentServiceAsync.WithRawResponse by lazy {
            FeatureAssessmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val flightplan: FlightplanServiceAsync.WithRawResponse by lazy {
            FlightplanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val geoStatus: GeoStatusServiceAsync.WithRawResponse by lazy {
            GeoStatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalAtmosphericModel:
            GlobalAtmosphericModelServiceAsync.WithRawResponse by lazy {
            GlobalAtmosphericModelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val gnssObservations: GnssObservationServiceAsync.WithRawResponse by lazy {
            GnssObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val gnssObservationset: GnssObservationsetServiceAsync.WithRawResponse by lazy {
            GnssObservationsetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val gnssRawIf: GnssRawIfServiceAsync.WithRawResponse by lazy {
            GnssRawIfServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val groundImagery: GroundImageryServiceAsync.WithRawResponse by lazy {
            GroundImageryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val h3Geo: H3GeoServiceAsync.WithRawResponse by lazy {
            H3GeoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val h3GeoHexCell: H3GeoHexCellServiceAsync.WithRawResponse by lazy {
            H3GeoHexCellServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val hazard: HazardServiceAsync.WithRawResponse by lazy {
            HazardServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ionoObservations: IonoObservationServiceAsync.WithRawResponse by lazy {
            IonoObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ir: IrServiceAsync.WithRawResponse by lazy {
            IrServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val isrCollections: IsrCollectionServiceAsync.WithRawResponse by lazy {
            IsrCollectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val item: ItemServiceAsync.WithRawResponse by lazy {
            ItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val itemTrackings: ItemTrackingServiceAsync.WithRawResponse by lazy {
            ItemTrackingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val laserdeconflictrequest:
            LaserdeconflictrequestServiceAsync.WithRawResponse by lazy {
            LaserdeconflictrequestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val laseremitter: LaseremitterServiceAsync.WithRawResponse by lazy {
            LaseremitterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchDetection: LaunchDetectionServiceAsync.WithRawResponse by lazy {
            LaunchDetectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchEvent: LaunchEventServiceAsync.WithRawResponse by lazy {
            LaunchEventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchSite: LaunchSiteServiceAsync.WithRawResponse by lazy {
            LaunchSiteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchSiteDetails: LaunchSiteDetailServiceAsync.WithRawResponse by lazy {
            LaunchSiteDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchVehicle: LaunchVehicleServiceAsync.WithRawResponse by lazy {
            LaunchVehicleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchVehicleDetails: LaunchVehicleDetailServiceAsync.WithRawResponse by lazy {
            LaunchVehicleDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val linkStatus: LinkStatusServiceAsync.WithRawResponse by lazy {
            LinkStatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val linkstatus: LinkstatusServiceAsync.WithRawResponse by lazy {
            LinkstatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val location: LocationServiceAsync.WithRawResponse by lazy {
            LocationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val logisticsSupport: LogisticsSupportServiceAsync.WithRawResponse by lazy {
            LogisticsSupportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val maneuvers: ManeuverServiceAsync.WithRawResponse by lazy {
            ManeuverServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val manifold: ManifoldServiceAsync.WithRawResponse by lazy {
            ManifoldServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val manifoldelset: ManifoldelsetServiceAsync.WithRawResponse by lazy {
            ManifoldelsetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val missileTracks: MissileTrackServiceAsync.WithRawResponse by lazy {
            MissileTrackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val missionAssignment: MissionAssignmentServiceAsync.WithRawResponse by lazy {
            MissionAssignmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val mti: MtiServiceAsync.WithRawResponse by lazy {
            MtiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val navigation: NavigationServiceAsync.WithRawResponse by lazy {
            NavigationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val navigationalObstruction:
            NavigationalObstructionServiceAsync.WithRawResponse by lazy {
            NavigationalObstructionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val notification: NotificationServiceAsync.WithRawResponse by lazy {
            NotificationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val objectOfInterest: ObjectOfInterestServiceAsync.WithRawResponse by lazy {
            ObjectOfInterestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val observations: ObservationServiceAsync.WithRawResponse by lazy {
            ObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onboardnavigation: OnboardnavigationServiceAsync.WithRawResponse by lazy {
            OnboardnavigationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbit: OnorbitServiceAsync.WithRawResponse by lazy {
            OnorbitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitantenna: OnorbitantennaServiceAsync.WithRawResponse by lazy {
            OnorbitantennaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitbattery: OnorbitbatteryServiceAsync.WithRawResponse by lazy {
            OnorbitbatteryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitdetails: OnorbitdetailServiceAsync.WithRawResponse by lazy {
            OnorbitdetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitevent: OnorbiteventServiceAsync.WithRawResponse by lazy {
            OnorbiteventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitlist: OnorbitlistServiceAsync.WithRawResponse by lazy {
            OnorbitlistServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitsolararray: OnorbitsolararrayServiceAsync.WithRawResponse by lazy {
            OnorbitsolararrayServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitthruster: OnorbitthrusterServiceAsync.WithRawResponse by lazy {
            OnorbitthrusterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitthrusterstatus:
            OnorbitthrusterstatusServiceAsync.WithRawResponse by lazy {
            OnorbitthrusterstatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitassessment: OnorbitassessmentServiceAsync.WithRawResponse by lazy {
            OnorbitassessmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val operatingunit: OperatingunitServiceAsync.WithRawResponse by lazy {
            OperatingunitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val operatingunitremark: OperatingunitremarkServiceAsync.WithRawResponse by lazy {
            OperatingunitremarkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val orbitdetermination: OrbitdeterminationServiceAsync.WithRawResponse by lazy {
            OrbitdeterminationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val orbittrack: OrbittrackServiceAsync.WithRawResponse by lazy {
            OrbittrackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val organization: OrganizationServiceAsync.WithRawResponse by lazy {
            OrganizationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val organizationdetails: OrganizationdetailServiceAsync.WithRawResponse by lazy {
            OrganizationdetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val personnelrecovery: PersonnelrecoveryServiceAsync.WithRawResponse by lazy {
            PersonnelrecoveryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val poi: PoiServiceAsync.WithRawResponse by lazy {
            PoiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val port: PortServiceAsync.WithRawResponse by lazy {
            PortServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val reportAndActivities: ReportAndActivityServiceAsync.WithRawResponse by lazy {
            ReportAndActivityServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rfBand: RfBandServiceAsync.WithRawResponse by lazy {
            RfBandServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rfBandType: RfBandTypeServiceAsync.WithRawResponse by lazy {
            RfBandTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rfEmitter: RfEmitterServiceAsync.WithRawResponse by lazy {
            RfEmitterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val routeStats: RouteStatServiceAsync.WithRawResponse by lazy {
            RouteStatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sarObservation: SarObservationServiceAsync.WithRawResponse by lazy {
            SarObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val scientific: ScientificServiceAsync.WithRawResponse by lazy {
            ScientificServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val scs: ScServiceAsync.WithRawResponse by lazy {
            ScServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val secureMessaging: SecureMessagingServiceAsync.WithRawResponse by lazy {
            SecureMessagingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensor: SensorServiceAsync.WithRawResponse by lazy {
            SensorServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorStating: SensorStatingServiceAsync.WithRawResponse by lazy {
            SensorStatingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorMaintenance: SensorMaintenanceServiceAsync.WithRawResponse by lazy {
            SensorMaintenanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorObservationType:
            SensorObservationTypeServiceAsync.WithRawResponse by lazy {
            SensorObservationTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorPlan: SensorPlanServiceAsync.WithRawResponse by lazy {
            SensorPlanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorType: SensorTypeServiceAsync.WithRawResponse by lazy {
            SensorTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seraDataCommDetails: SeraDataCommDetailServiceAsync.WithRawResponse by lazy {
            SeraDataCommDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seraDataEarlyWarning: SeraDataEarlyWarningServiceAsync.WithRawResponse by lazy {
            SeraDataEarlyWarningServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seraDataNavigation: SeraDataNavigationServiceAsync.WithRawResponse by lazy {
            SeraDataNavigationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seradataOpticalPayload:
            SeradataOpticalPayloadServiceAsync.WithRawResponse by lazy {
            SeradataOpticalPayloadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seradataRadarPayload: SeradataRadarPayloadServiceAsync.WithRawResponse by lazy {
            SeradataRadarPayloadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seradataSigintPayload:
            SeradataSigintPayloadServiceAsync.WithRawResponse by lazy {
            SeradataSigintPayloadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val seradataSpacecraftDetails:
            SeradataSpacecraftDetailServiceAsync.WithRawResponse by lazy {
            SeradataSpacecraftDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sgi: SgiServiceAsync.WithRawResponse by lazy {
            SgiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sigact: SigactServiceAsync.WithRawResponse by lazy {
            SigactServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val site: SiteServiceAsync.WithRawResponse by lazy {
            SiteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val siteRemark: SiteRemarkServiceAsync.WithRawResponse by lazy {
            SiteRemarkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val siteStatus: SiteStatusServiceAsync.WithRawResponse by lazy {
            SiteStatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val skyImagery: SkyImageryServiceAsync.WithRawResponse by lazy {
            SkyImageryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val soiObservationSet: SoiObservationSetServiceAsync.WithRawResponse by lazy {
            SoiObservationSetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val solarArray: SolarArrayServiceAsync.WithRawResponse by lazy {
            SolarArrayServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val solarArrayDetails: SolarArrayDetailServiceAsync.WithRawResponse by lazy {
            SolarArrayDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sortiePpr: SortiePprServiceAsync.WithRawResponse by lazy {
            SortiePprServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val spaceEnvObservation: SpaceEnvObservationServiceAsync.WithRawResponse by lazy {
            SpaceEnvObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val stage: StageServiceAsync.WithRawResponse by lazy {
            StageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val starCatalog: StarCatalogServiceAsync.WithRawResponse by lazy {
            StarCatalogServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val stateVector: StateVectorServiceAsync.WithRawResponse by lazy {
            StateVectorServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val status: StatusServiceAsync.WithRawResponse by lazy {
            StatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val substatus: SubstatusServiceAsync.WithRawResponse by lazy {
            SubstatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val supportingData: SupportingDataServiceAsync.WithRawResponse by lazy {
            SupportingDataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val surface: SurfaceServiceAsync.WithRawResponse by lazy {
            SurfaceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val surfaceObstruction: SurfaceObstructionServiceAsync.WithRawResponse by lazy {
            SurfaceObstructionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val swir: SwirServiceAsync.WithRawResponse by lazy {
            SwirServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val taiUtc: TaiUtcServiceAsync.WithRawResponse by lazy {
            TaiUtcServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tdoaFdoa: TdoaFdoaServiceAsync.WithRawResponse by lazy {
            TdoaFdoaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val track: TrackServiceAsync.WithRawResponse by lazy {
            TrackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val trackDetails: TrackDetailServiceAsync.WithRawResponse by lazy {
            TrackDetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val trackRoute: TrackRouteServiceAsync.WithRawResponse by lazy {
            TrackRouteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transponder: TransponderServiceAsync.WithRawResponse by lazy {
            TransponderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val vessel: VesselServiceAsync.WithRawResponse by lazy {
            VesselServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val video: VideoServiceAsync.WithRawResponse by lazy {
            VideoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val weatherData: WeatherDataServiceAsync.WithRawResponse by lazy {
            WeatherDataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val weatherReport: WeatherReportServiceAsync.WithRawResponse by lazy {
            WeatherReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UnifieddatalibraryClientAsync.WithRawResponse =
            UnifieddatalibraryClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun airEvents(): AirEventServiceAsync.WithRawResponse = airEvents

        override fun airOperations(): AirOperationServiceAsync.WithRawResponse = airOperations

        override fun airTransportMissions(): AirTransportMissionServiceAsync.WithRawResponse =
            airTransportMissions

        override fun aircraft(): AircraftServiceAsync.WithRawResponse = aircraft

        override fun aircraftSorties(): AircraftSortyServiceAsync.WithRawResponse = aircraftSorties

        override fun aircraftStatusRemarks(): AircraftStatusRemarkServiceAsync.WithRawResponse =
            aircraftStatusRemarks

        override fun aircraftStatuses(): AircraftStatusServiceAsync.WithRawResponse =
            aircraftStatuses

        override fun airfieldSlotConsumptions():
            AirfieldSlotConsumptionServiceAsync.WithRawResponse = airfieldSlotConsumptions

        override fun airfieldSlots(): AirfieldSlotServiceAsync.WithRawResponse = airfieldSlots

        override fun airfieldStatus(): AirfieldStatusServiceAsync.WithRawResponse = airfieldStatus

        override fun airfields(): AirfieldServiceAsync.WithRawResponse = airfields

        override fun airloadPlans(): AirloadPlanServiceAsync.WithRawResponse = airloadPlans

        override fun airspaceControlOrders(): AirspaceControlOrderServiceAsync.WithRawResponse =
            airspaceControlOrders

        override fun ais(): AiServiceAsync.WithRawResponse = ais

        override fun aisObjects(): AisObjectServiceAsync.WithRawResponse = aisObjects

        override fun analyticImagery(): AnalyticImageryServiceAsync.WithRawResponse =
            analyticImagery

        override fun antennas(): AntennaServiceAsync.WithRawResponse = antennas

        override fun attitudeData(): AttitudeDataServiceAsync.WithRawResponse = attitudeData

        override fun attitudeSets(): AttitudeSetServiceAsync.WithRawResponse = attitudeSets

        override fun aviationRiskManagement(): AviationRiskManagementServiceAsync.WithRawResponse =
            aviationRiskManagement

        override fun batteries(): BatteryServiceAsync.WithRawResponse = batteries

        override fun batterydetails(): BatterydetailServiceAsync.WithRawResponse = batterydetails

        override fun beam(): BeamServiceAsync.WithRawResponse = beam

        override fun beamContours(): BeamContourServiceAsync.WithRawResponse = beamContours

        override fun buses(): BusServiceAsync.WithRawResponse = buses

        override fun channels(): ChannelServiceAsync.WithRawResponse = channels

        override fun closelyspacedobjects(): CloselyspacedobjectServiceAsync.WithRawResponse =
            closelyspacedobjects

        override fun collectRequests(): CollectRequestServiceAsync.WithRawResponse = collectRequests

        override fun collectResponses(): CollectResponseServiceAsync.WithRawResponse =
            collectResponses

        override fun comm(): CommServiceAsync.WithRawResponse = comm

        override fun conjunctions(): ConjunctionServiceAsync.WithRawResponse = conjunctions

        override fun cots(): CotServiceAsync.WithRawResponse = cots

        override fun countries(): CountryServiceAsync.WithRawResponse = countries

        override fun crew(): CrewServiceAsync.WithRawResponse = crew

        override fun deconflictset(): DeconflictsetServiceAsync.WithRawResponse = deconflictset

        override fun diffOfArrival(): DiffOfArrivalServiceAsync.WithRawResponse = diffOfArrival

        override fun diplomaticClearance(): DiplomaticClearanceServiceAsync.WithRawResponse =
            diplomaticClearance

        override fun driftHistory(): DriftHistoryServiceAsync.WithRawResponse = driftHistory

        override fun dropzone(): DropzoneServiceAsync.WithRawResponse = dropzone

        override fun ecpedr(): EcpedrServiceAsync.WithRawResponse = ecpedr

        override fun effectRequests(): EffectRequestServiceAsync.WithRawResponse = effectRequests

        override fun effectResponses(): EffectResponseServiceAsync.WithRawResponse = effectResponses

        override fun elsets(): ElsetServiceAsync.WithRawResponse = elsets

        override fun emireport(): EmireportServiceAsync.WithRawResponse = emireport

        override fun emitterGeolocation(): EmitterGeolocationServiceAsync.WithRawResponse =
            emitterGeolocation

        override fun engineDetails(): EngineDetailServiceAsync.WithRawResponse = engineDetails

        override fun engines(): EngineServiceAsync.WithRawResponse = engines

        override fun entities(): EntityServiceAsync.WithRawResponse = entities

        override fun eop(): EopServiceAsync.WithRawResponse = eop

        override fun ephemeris(): EphemerisServiceAsync.WithRawResponse = ephemeris

        override fun ephemerisSets(): EphemerisSetServiceAsync.WithRawResponse = ephemerisSets

        override fun equipment(): EquipmentServiceAsync.WithRawResponse = equipment

        override fun equipmentRemarks(): EquipmentRemarkServiceAsync.WithRawResponse =
            equipmentRemarks

        override fun evac(): EvacServiceAsync.WithRawResponse = evac

        override fun eventEvolution(): EventEvolutionServiceAsync.WithRawResponse = eventEvolution

        override fun featureAssessment(): FeatureAssessmentServiceAsync.WithRawResponse =
            featureAssessment

        override fun flightplan(): FlightplanServiceAsync.WithRawResponse = flightplan

        override fun geoStatus(): GeoStatusServiceAsync.WithRawResponse = geoStatus

        override fun globalAtmosphericModel(): GlobalAtmosphericModelServiceAsync.WithRawResponse =
            globalAtmosphericModel

        override fun gnssObservations(): GnssObservationServiceAsync.WithRawResponse =
            gnssObservations

        override fun gnssObservationset(): GnssObservationsetServiceAsync.WithRawResponse =
            gnssObservationset

        override fun gnssRawIf(): GnssRawIfServiceAsync.WithRawResponse = gnssRawIf

        override fun groundImagery(): GroundImageryServiceAsync.WithRawResponse = groundImagery

        override fun h3Geo(): H3GeoServiceAsync.WithRawResponse = h3Geo

        override fun h3GeoHexCell(): H3GeoHexCellServiceAsync.WithRawResponse = h3GeoHexCell

        override fun hazard(): HazardServiceAsync.WithRawResponse = hazard

        override fun ionoObservations(): IonoObservationServiceAsync.WithRawResponse =
            ionoObservations

        override fun ir(): IrServiceAsync.WithRawResponse = ir

        override fun isrCollections(): IsrCollectionServiceAsync.WithRawResponse = isrCollections

        override fun item(): ItemServiceAsync.WithRawResponse = item

        override fun itemTrackings(): ItemTrackingServiceAsync.WithRawResponse = itemTrackings

        override fun laserdeconflictrequest(): LaserdeconflictrequestServiceAsync.WithRawResponse =
            laserdeconflictrequest

        override fun laseremitter(): LaseremitterServiceAsync.WithRawResponse = laseremitter

        override fun launchDetection(): LaunchDetectionServiceAsync.WithRawResponse =
            launchDetection

        override fun launchEvent(): LaunchEventServiceAsync.WithRawResponse = launchEvent

        override fun launchSite(): LaunchSiteServiceAsync.WithRawResponse = launchSite

        override fun launchSiteDetails(): LaunchSiteDetailServiceAsync.WithRawResponse =
            launchSiteDetails

        override fun launchVehicle(): LaunchVehicleServiceAsync.WithRawResponse = launchVehicle

        override fun launchVehicleDetails(): LaunchVehicleDetailServiceAsync.WithRawResponse =
            launchVehicleDetails

        override fun linkStatus(): LinkStatusServiceAsync.WithRawResponse = linkStatus

        override fun linkstatus(): LinkstatusServiceAsync.WithRawResponse = linkstatus

        override fun location(): LocationServiceAsync.WithRawResponse = location

        override fun logisticsSupport(): LogisticsSupportServiceAsync.WithRawResponse =
            logisticsSupport

        override fun maneuvers(): ManeuverServiceAsync.WithRawResponse = maneuvers

        override fun manifold(): ManifoldServiceAsync.WithRawResponse = manifold

        override fun manifoldelset(): ManifoldelsetServiceAsync.WithRawResponse = manifoldelset

        override fun missileTracks(): MissileTrackServiceAsync.WithRawResponse = missileTracks

        override fun missionAssignment(): MissionAssignmentServiceAsync.WithRawResponse =
            missionAssignment

        override fun mti(): MtiServiceAsync.WithRawResponse = mti

        override fun navigation(): NavigationServiceAsync.WithRawResponse = navigation

        override fun navigationalObstruction():
            NavigationalObstructionServiceAsync.WithRawResponse = navigationalObstruction

        override fun notification(): NotificationServiceAsync.WithRawResponse = notification

        override fun objectOfInterest(): ObjectOfInterestServiceAsync.WithRawResponse =
            objectOfInterest

        override fun observations(): ObservationServiceAsync.WithRawResponse = observations

        override fun onboardnavigation(): OnboardnavigationServiceAsync.WithRawResponse =
            onboardnavigation

        override fun onorbit(): OnorbitServiceAsync.WithRawResponse = onorbit

        override fun onorbitantenna(): OnorbitantennaServiceAsync.WithRawResponse = onorbitantenna

        override fun onorbitbattery(): OnorbitbatteryServiceAsync.WithRawResponse = onorbitbattery

        override fun onorbitdetails(): OnorbitdetailServiceAsync.WithRawResponse = onorbitdetails

        override fun onorbitevent(): OnorbiteventServiceAsync.WithRawResponse = onorbitevent

        override fun onorbitlist(): OnorbitlistServiceAsync.WithRawResponse = onorbitlist

        override fun onorbitsolararray(): OnorbitsolararrayServiceAsync.WithRawResponse =
            onorbitsolararray

        override fun onorbitthruster(): OnorbitthrusterServiceAsync.WithRawResponse =
            onorbitthruster

        override fun onorbitthrusterstatus(): OnorbitthrusterstatusServiceAsync.WithRawResponse =
            onorbitthrusterstatus

        override fun onorbitassessment(): OnorbitassessmentServiceAsync.WithRawResponse =
            onorbitassessment

        override fun operatingunit(): OperatingunitServiceAsync.WithRawResponse = operatingunit

        override fun operatingunitremark(): OperatingunitremarkServiceAsync.WithRawResponse =
            operatingunitremark

        override fun orbitdetermination(): OrbitdeterminationServiceAsync.WithRawResponse =
            orbitdetermination

        override fun orbittrack(): OrbittrackServiceAsync.WithRawResponse = orbittrack

        override fun organization(): OrganizationServiceAsync.WithRawResponse = organization

        override fun organizationdetails(): OrganizationdetailServiceAsync.WithRawResponse =
            organizationdetails

        override fun personnelrecovery(): PersonnelrecoveryServiceAsync.WithRawResponse =
            personnelrecovery

        override fun poi(): PoiServiceAsync.WithRawResponse = poi

        override fun port(): PortServiceAsync.WithRawResponse = port

        override fun reportAndActivities(): ReportAndActivityServiceAsync.WithRawResponse =
            reportAndActivities

        override fun rfBand(): RfBandServiceAsync.WithRawResponse = rfBand

        override fun rfBandType(): RfBandTypeServiceAsync.WithRawResponse = rfBandType

        override fun rfEmitter(): RfEmitterServiceAsync.WithRawResponse = rfEmitter

        override fun routeStats(): RouteStatServiceAsync.WithRawResponse = routeStats

        override fun sarObservation(): SarObservationServiceAsync.WithRawResponse = sarObservation

        override fun scientific(): ScientificServiceAsync.WithRawResponse = scientific

        override fun scs(): ScServiceAsync.WithRawResponse = scs

        override fun secureMessaging(): SecureMessagingServiceAsync.WithRawResponse =
            secureMessaging

        override fun sensor(): SensorServiceAsync.WithRawResponse = sensor

        override fun sensorStating(): SensorStatingServiceAsync.WithRawResponse = sensorStating

        override fun sensorMaintenance(): SensorMaintenanceServiceAsync.WithRawResponse =
            sensorMaintenance

        override fun sensorObservationType(): SensorObservationTypeServiceAsync.WithRawResponse =
            sensorObservationType

        override fun sensorPlan(): SensorPlanServiceAsync.WithRawResponse = sensorPlan

        override fun sensorType(): SensorTypeServiceAsync.WithRawResponse = sensorType

        override fun seraDataCommDetails(): SeraDataCommDetailServiceAsync.WithRawResponse =
            seraDataCommDetails

        override fun seraDataEarlyWarning(): SeraDataEarlyWarningServiceAsync.WithRawResponse =
            seraDataEarlyWarning

        override fun seraDataNavigation(): SeraDataNavigationServiceAsync.WithRawResponse =
            seraDataNavigation

        override fun seradataOpticalPayload(): SeradataOpticalPayloadServiceAsync.WithRawResponse =
            seradataOpticalPayload

        override fun seradataRadarPayload(): SeradataRadarPayloadServiceAsync.WithRawResponse =
            seradataRadarPayload

        override fun seradataSigintPayload(): SeradataSigintPayloadServiceAsync.WithRawResponse =
            seradataSigintPayload

        override fun seradataSpacecraftDetails():
            SeradataSpacecraftDetailServiceAsync.WithRawResponse = seradataSpacecraftDetails

        override fun sgi(): SgiServiceAsync.WithRawResponse = sgi

        override fun sigact(): SigactServiceAsync.WithRawResponse = sigact

        override fun site(): SiteServiceAsync.WithRawResponse = site

        override fun siteRemark(): SiteRemarkServiceAsync.WithRawResponse = siteRemark

        override fun siteStatus(): SiteStatusServiceAsync.WithRawResponse = siteStatus

        override fun skyImagery(): SkyImageryServiceAsync.WithRawResponse = skyImagery

        override fun soiObservationSet(): SoiObservationSetServiceAsync.WithRawResponse =
            soiObservationSet

        override fun solarArray(): SolarArrayServiceAsync.WithRawResponse = solarArray

        override fun solarArrayDetails(): SolarArrayDetailServiceAsync.WithRawResponse =
            solarArrayDetails

        override fun sortiePpr(): SortiePprServiceAsync.WithRawResponse = sortiePpr

        override fun spaceEnvObservation(): SpaceEnvObservationServiceAsync.WithRawResponse =
            spaceEnvObservation

        override fun stage(): StageServiceAsync.WithRawResponse = stage

        override fun starCatalog(): StarCatalogServiceAsync.WithRawResponse = starCatalog

        override fun stateVector(): StateVectorServiceAsync.WithRawResponse = stateVector

        override fun status(): StatusServiceAsync.WithRawResponse = status

        override fun substatus(): SubstatusServiceAsync.WithRawResponse = substatus

        override fun supportingData(): SupportingDataServiceAsync.WithRawResponse = supportingData

        override fun surface(): SurfaceServiceAsync.WithRawResponse = surface

        override fun surfaceObstruction(): SurfaceObstructionServiceAsync.WithRawResponse =
            surfaceObstruction

        override fun swir(): SwirServiceAsync.WithRawResponse = swir

        override fun taiUtc(): TaiUtcServiceAsync.WithRawResponse = taiUtc

        override fun tdoaFdoa(): TdoaFdoaServiceAsync.WithRawResponse = tdoaFdoa

        override fun track(): TrackServiceAsync.WithRawResponse = track

        override fun trackDetails(): TrackDetailServiceAsync.WithRawResponse = trackDetails

        override fun trackRoute(): TrackRouteServiceAsync.WithRawResponse = trackRoute

        override fun transponder(): TransponderServiceAsync.WithRawResponse = transponder

        override fun user(): UserServiceAsync.WithRawResponse = user

        override fun vessel(): VesselServiceAsync.WithRawResponse = vessel

        override fun video(): VideoServiceAsync.WithRawResponse = video

        override fun weatherData(): WeatherDataServiceAsync.WithRawResponse = weatherData

        override fun weatherReport(): WeatherReportServiceAsync.WithRawResponse = weatherReport
    }
}

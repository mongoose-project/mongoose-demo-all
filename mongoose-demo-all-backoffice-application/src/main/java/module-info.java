// File managed by WebFX (DO NOT EDIT MANUALLY)

module mongoose.demo.all.backoffice.application {

    // Direct dependencies modules
    requires javafx.controls;
    requires javafx.graphics;
    requires mongoose.base.backoffice.masterslave;
    requires mongoose.base.client.application;
    requires mongoose.base.shared.domainmodel;
    requires mongoose.crm.backoffice.bookingdetailspanel;
    requires mongoose.event.backoffice.activities.cloneevent;
    requires mongoose.event.backoffice.activities.cloneevent.routing;
    requires webfx.framework.client.activity;
    requires webfx.framework.client.orm.domainmodel.activity;
    requires webfx.framework.client.uirouter;
    requires webfx.platform.shared.util;

    // Exported packages
    exports mongoose.demo.all.backoffice.activities.event.clone.openjfx;
    exports mongoose.demo.all.backoffice.application;

    // Provided services
    provides javafx.application.Application with mongoose.demo.all.backoffice.application.MongooseBackOfficeApplication;

}
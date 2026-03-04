package com.project.back_end.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull; 

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(@NonNull CorsRegistry registry) {
        // Allow CORS for all endpoints
        registry.addMapping("/**")
                .allowedOrigins("*")  // Add your frontend URL here
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Specify allowed methods
                .allowedHeaders("*");  // You can restrict headers if needed
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/pages/adminDashboard.html").setViewName("admin/adminDashboard");
        registry.addViewController("/pages/doctorDashboard.html").setViewName("doctor/doctorDashboard");
        registry.addViewController("/pages/patientDashboard.html").setViewName("patient/patientDashboard");
        registry.addViewController("/pages/loggedPatientDashboard.html").setViewName("patient/loggedPatientDashboard");
        registry.addViewController("/pages/patientAppointments.html").setViewName("patient/patientAppointments");
        registry.addViewController("/pages/addPrescription.html").setViewName("doctor/addPrescription");
        registry.addViewController("/pages/updateAppointment.html").setViewName("patient/updateAppointment");
        registry.addViewController("/pages/patientRecord.html").setViewName("doctor/patientRecord");
    }
}

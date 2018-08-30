package com.tinhcao.dropwizard;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.jobs.JobConfiguration;

import java.util.Map;

public class DropwizardJobConfiguration extends Configuration implements JobConfiguration {
    // TODO: implement service configuration


    @JsonProperty("jobs")
    private Map<String , String> jobs;

    public Map<String, String> getJobs() {
        return jobs;
    }

}

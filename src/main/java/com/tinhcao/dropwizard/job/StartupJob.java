package com.tinhcao.dropwizard.job;

import io.dropwizard.jobs.Job;
import io.dropwizard.jobs.annotations.OnApplicationStart;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

@OnApplicationStart
public class StartupJob extends Job {

    @Override
    public void doJob(JobExecutionContext context) throws JobExecutionException {
        System.out.printf("Application start job");
    }
}

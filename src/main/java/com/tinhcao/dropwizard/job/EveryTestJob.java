package com.tinhcao.dropwizard.job;

import io.dropwizard.jobs.Job;
import io.dropwizard.jobs.annotations.DelayStart;
import io.dropwizard.jobs.annotations.Every;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

@Every(value = "${everyJob}")
@DelayStart(value = "10s")
public class EveryTestJob extends Job {

    @Override
    public void doJob(JobExecutionContext context) throws JobExecutionException {
        System.out.println("Every 5s job");
    }
}

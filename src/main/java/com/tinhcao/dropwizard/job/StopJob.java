package com.tinhcao.dropwizard.job;

import io.dropwizard.jobs.Job;
import io.dropwizard.jobs.annotations.OnApplicationStop;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

@OnApplicationStop
public class StopJob extends Job {

    @Override
    public void doJob(JobExecutionContext context) throws JobExecutionException {
        System.out.printf("Application stop job");
    }
}

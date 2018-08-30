package com.tinhcao.dropwizard.job;

import io.dropwizard.jobs.Job;
import io.dropwizard.jobs.annotations.On;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


@On(value = "${cronJob}")
public class OnTestJob extends Job {

    @Override
    public void doJob(JobExecutionContext context) throws JobExecutionException {
        System.out.println("cronJob");
    }
}

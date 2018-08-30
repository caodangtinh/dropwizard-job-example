package com.tinhcao.dropwizard;

import com.tinhcao.dropwizard.job.EveryTestJob;
import com.tinhcao.dropwizard.job.OnTestJob;
import com.tinhcao.dropwizard.job.StartupJob;
import com.tinhcao.dropwizard.job.StopJob;
import io.dropwizard.Application;
import io.dropwizard.jobs.Job;
import io.dropwizard.jobs.JobsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropwizardJobApplication extends Application<DropwizardJobConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardJobApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropwizardJob";
    }

    @Override
    public void initialize(final Bootstrap<DropwizardJobConfiguration> bootstrap) {
        // TODO: application initialization
        Job startJob = new StartupJob();
        Job stopJob = new StopJob();
        Job everyJob = new EveryTestJob();
        Job onTestJob = new OnTestJob();
        bootstrap.addBundle(new JobsBundle(startJob, everyJob, onTestJob, stopJob));
    }

    @Override
    public void run(final DropwizardJobConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}

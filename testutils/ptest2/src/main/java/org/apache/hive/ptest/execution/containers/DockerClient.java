/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.hive.ptest.execution.containers;

import org.apache.hive.ptest.api.server.TestLogger;
import org.apache.hive.ptest.execution.ContainerClient;
import org.apache.hive.ptest.execution.ContainerClientFactory.ContainerClientContext;
import org.apache.hive.ptest.execution.Templates;
<<<<<<< HEAD
=======
import org.apache.hive.ptest.execution.conf.TestBatch;
>>>>>>> a1fe94a... Temp work related to docker execution phase. code may not compile
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class DockerClient implements ContainerClient {

  private static final String USER = "ptestuser";
  private static final String HOME_DIR = File.separatorChar + "home" + File.separatorChar + USER;
  private static final String DOCKER_SCRATCH_DIR = HOME_DIR + File.separatorChar + "scratch" + File.separatorChar;
  private static Logger logger;
  private final ContainerClientContext context;
  public DockerClient(ContainerClientContext context) {
    logger = context.getLogger();
    this.context = context;
  }

  @Override
<<<<<<< HEAD
  public void defineImage(String dir, String label) throws IOException {
    if (label == null)
      label = UUID.randomUUID().toString();
=======
  public void defineImage(String dir) throws Exception {
    final String label = context.getTemplateDefaults().get("buildTag");
    if (label == null) {
      throw new Exception("buildTag not found");
    }
>>>>>>> a1fe94a... Temp work related to docker execution phase. code may not compile
    File dockerfile = new File(dir, "Dockerfile");
    logger.info("Writing {} from template", dockerfile);
    Map<String, String> templateDefaults = context.getTemplateDefaults();
    if (!templateDefaults.containsKey("label")) {
      templateDefaults.put("label", label);
    } else {
      //TODO throw?
    }
    Templates.writeTemplateResult("dockerfile-template.vm", dockerfile, templateDefaults);
  }

  @Override
  public String getBuildCommand(String dir, long toWait, TimeUnit unit) throws Exception {
    //TODO timeout not used currently
    long seconds = TimeUnit.SECONDS.convert(toWait, unit);
    logger.info("Building image");
    String dockerBuildCommand =
        new StringBuilder("docker build")
<<<<<<< HEAD
            //TODO do we need --tag?
            //.append(" --tag " + imageName())
=======
            .append(" --tag " + imageName())
>>>>>>> a1fe94a... Temp work related to docker execution phase. code may not compile
            .append(" --build-arg ")
            .append(" workingDir=$workingDir")
            .append(" --build-arg ")
            .append(" patchFilePath=$workingDir/scratch/build.patch")
            //TODO confirm if we need antEnvOpts
            //.append(" antEnvOpts=$antEnvOpts")
            .append(" --build-arg ")
            .append(" mavenEnvOpts=$mavenEnvOpts")
            .append(" --build-arg ")
            .append(" repository=$repository")
            .append(" --build-arg ")
            .append(" branch=$branch")
            .append(" " + dir)
            .toString();
    return dockerBuildCommand;
  }

<<<<<<< HEAD
  private String imageName() {
    //TODO add a proper image name using patch number
    return "Ptest-dummy-build";
=======
  @Override
  public String getRunContainerCommand(String containerName, TestBatch batch) {
    return new StringBuilder("docker run")
        .append(" --name " + containerName)
        .append(" " + imageName())
        .append(" /bin/bash")
        .append(" -c")
        .append("( cd " + batch.getTestModuleRelativeDir() + "; ")
        .append("/usr/bin/mvn")
        .append(" -Dsurefire.timeout=40m")
        .append(" -B test")
        .append(" " + batch.getTestArguments())
        .append(" 1>$workingDir/logs"  + File.separatorChar + "maven.txt")
        .append(" 2>&1")
        .toString();
  }

  private String imageName() {
    return context.getTemplateDefaults().get("buildTag");
>>>>>>> a1fe94a... Temp work related to docker execution phase. code may not compile
  }
}